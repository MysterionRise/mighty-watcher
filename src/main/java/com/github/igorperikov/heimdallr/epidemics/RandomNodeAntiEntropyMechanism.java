package com.github.igorperikov.heimdallr.epidemics;

import com.github.igorperikov.heimdallr.HeimdallrNode;
import com.github.igorperikov.heimdallr.generated.NodeDefinitionTO;
import io.netty.channel.EventLoopGroup;

import java.util.List;
import java.util.Random;

public class RandomNodeAntiEntropyMechanism extends AntiEntropyMechanism {
    private static final Random RANDOM = new Random();

    public RandomNodeAntiEntropyMechanism(HeimdallrNode mainNode, EventLoopGroup eventLoop) {
        super(mainNode, eventLoop);
    }

    @Override
    protected NodeDefinitionTO chooseNode(List<NodeDefinitionTO> nodes) {
        return nodes.get(RANDOM.nextInt(nodes.size()));
    }
}