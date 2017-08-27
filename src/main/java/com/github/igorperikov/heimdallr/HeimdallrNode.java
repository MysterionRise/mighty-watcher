package com.github.igorperikov.heimdallr;

import com.github.igorperikov.heimdallr.init.ClientBootstrapHelper;
import com.github.igorperikov.heimdallr.init.ServerBootstrapHelper;
import com.github.igorperikov.heimdallr.init.pojo.ClusterStateRequest;
import com.github.igorperikov.heimdallr.init.pojo.NodeDefinition;
import io.netty.bootstrap.Bootstrap;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.util.concurrent.ScheduledFuture;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.net.InetSocketAddress;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Slf4j
public class HeimdallrNode {
    private final int port;
    private final UUID name;

    @Getter
    private final Set<NodeDefinition> clusterNodes = new HashSet<>();

    private InetSocketAddress peerNodeAddress;

    public HeimdallrNode(int port) {
        this.port = port;
        this.name = UUID.randomUUID();
        log.info("My name is {}", name);
    }

    public HeimdallrNode(int port, String peerAddress, int peerPort) {
        this(port);
        this.peerNodeAddress = new InetSocketAddress(peerAddress, peerPort);
    }

    public void start() {
        ScheduledFuture<?> infoPrintingFuture = null;
        EventLoopGroup parentEventLoopGroup = new NioEventLoopGroup(1);
        EventLoopGroup childEventLoopGroup = new NioEventLoopGroup();
        try {
            ServerBootstrap b = ServerBootstrapHelper.build(parentEventLoopGroup, childEventLoopGroup, port, this);
            Channel serverChannel = b.bind().sync().channel();
            log.info("Current node started listening on port {}", name, port);
            if (peerNodeAddress != null) {
                ChannelFuture channelFuture = establishConnectToPeerNode(peerNodeAddress, childEventLoopGroup);
                writeToPeerNode(channelFuture);
            } else {
                clusterNodes.add(getNodeDefinition());
            }
            infoPrintingFuture = new ClusterInfoLogger().startPrintingClusterInfo(serverChannel.eventLoop(), this);
            serverChannel.closeFuture().sync();
            log.info("Shutting down node {}", name);
        } catch (InterruptedException e) {
            log.error("Interrupted", e);
        } finally {
            releaseResources(infoPrintingFuture, parentEventLoopGroup, childEventLoopGroup);
        }
    }

    private void releaseResources(
            ScheduledFuture<?> infoPrintingFuture,
            EventLoopGroup parentEventLoopGroup,
            EventLoopGroup childEventLoopGroup
    ) {
        if (infoPrintingFuture != null) {
            infoPrintingFuture.cancel(true);
        }
        parentEventLoopGroup.shutdownGracefully().syncUninterruptibly();
        childEventLoopGroup.shutdownGracefully().syncUninterruptibly();
    }

    private void writeToPeerNode(ChannelFuture channelFuture) throws InterruptedException {
        log.info("Sending request to peer node");
        channelFuture.sync().channel().writeAndFlush(new ClusterStateRequest(getNodeDefinition())).sync();
    }

    public ChannelFuture establishConnectToPeerNode(InetSocketAddress peerNodeAddress, EventLoopGroup eventLoopGroup) {
        Bootstrap bootstrap = ClientBootstrapHelper.build(eventLoopGroup, peerNodeAddress, this);
        return bootstrap.connect();
    }

    public NodeDefinition getNodeDefinition() {
        return new NodeDefinition(name, getNodeAddress());
    }

    public void replaceClusterNodes(Collection<NodeDefinition> nodes) {
        clusterNodes.clear();
        clusterNodes.addAll(nodes);
    }

    public void addClusterNode(NodeDefinition nodeDefinition) {
        clusterNodes.add(nodeDefinition);
    }

    public InetSocketAddress getNodeAddress() {
        // TODO: localhost -> ip detection
        return new InetSocketAddress("localhost", port);
    }
}
