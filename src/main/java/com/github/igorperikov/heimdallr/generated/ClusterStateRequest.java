// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: dto.proto

package com.github.igorperikov.heimdallr.generated;

/**
 * Protobuf type {@code heimdallr.ClusterStateRequest}
 */
public  final class ClusterStateRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:heimdallr.ClusterStateRequest)
    ClusterStateRequestOrBuilder {
  // Use ClusterStateRequest.newBuilder() to construct.
  private ClusterStateRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ClusterStateRequest() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private ClusterStateRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            com.github.igorperikov.heimdallr.generated.NodeDefinition.Builder subBuilder = null;
            if (node_ != null) {
              subBuilder = node_.toBuilder();
            }
            node_ = input.readMessage(com.github.igorperikov.heimdallr.generated.NodeDefinition.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(node_);
              node_ = subBuilder.buildPartial();
            }

            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.github.igorperikov.heimdallr.generated.HeimdallrOuter.internal_static_heimdallr_ClusterStateRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.igorperikov.heimdallr.generated.HeimdallrOuter.internal_static_heimdallr_ClusterStateRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.igorperikov.heimdallr.generated.ClusterStateRequest.class, com.github.igorperikov.heimdallr.generated.ClusterStateRequest.Builder.class);
  }

  public static final int NODE_FIELD_NUMBER = 1;
  private com.github.igorperikov.heimdallr.generated.NodeDefinition node_;
  /**
   * <code>.heimdallr.NodeDefinition node = 1;</code>
   */
  public boolean hasNode() {
    return node_ != null;
  }
  /**
   * <code>.heimdallr.NodeDefinition node = 1;</code>
   */
  public com.github.igorperikov.heimdallr.generated.NodeDefinition getNode() {
    return node_ == null ? com.github.igorperikov.heimdallr.generated.NodeDefinition.getDefaultInstance() : node_;
  }
  /**
   * <code>.heimdallr.NodeDefinition node = 1;</code>
   */
  public com.github.igorperikov.heimdallr.generated.NodeDefinitionOrBuilder getNodeOrBuilder() {
    return getNode();
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (node_ != null) {
      output.writeMessage(1, getNode());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (node_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getNode());
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.github.igorperikov.heimdallr.generated.ClusterStateRequest)) {
      return super.equals(obj);
    }
    com.github.igorperikov.heimdallr.generated.ClusterStateRequest other = (com.github.igorperikov.heimdallr.generated.ClusterStateRequest) obj;

    boolean result = true;
    result = result && (hasNode() == other.hasNode());
    if (hasNode()) {
      result = result && getNode()
          .equals(other.getNode());
    }
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasNode()) {
      hash = (37 * hash) + NODE_FIELD_NUMBER;
      hash = (53 * hash) + getNode().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.github.igorperikov.heimdallr.generated.ClusterStateRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.igorperikov.heimdallr.generated.ClusterStateRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.igorperikov.heimdallr.generated.ClusterStateRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.igorperikov.heimdallr.generated.ClusterStateRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.igorperikov.heimdallr.generated.ClusterStateRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.igorperikov.heimdallr.generated.ClusterStateRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.igorperikov.heimdallr.generated.ClusterStateRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.igorperikov.heimdallr.generated.ClusterStateRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.igorperikov.heimdallr.generated.ClusterStateRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.github.igorperikov.heimdallr.generated.ClusterStateRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.igorperikov.heimdallr.generated.ClusterStateRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.igorperikov.heimdallr.generated.ClusterStateRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.github.igorperikov.heimdallr.generated.ClusterStateRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code heimdallr.ClusterStateRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:heimdallr.ClusterStateRequest)
      com.github.igorperikov.heimdallr.generated.ClusterStateRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.igorperikov.heimdallr.generated.HeimdallrOuter.internal_static_heimdallr_ClusterStateRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.igorperikov.heimdallr.generated.HeimdallrOuter.internal_static_heimdallr_ClusterStateRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.igorperikov.heimdallr.generated.ClusterStateRequest.class, com.github.igorperikov.heimdallr.generated.ClusterStateRequest.Builder.class);
    }

    // Construct using com.github.igorperikov.heimdallr.generated.ClusterStateRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      if (nodeBuilder_ == null) {
        node_ = null;
      } else {
        node_ = null;
        nodeBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.github.igorperikov.heimdallr.generated.HeimdallrOuter.internal_static_heimdallr_ClusterStateRequest_descriptor;
    }

    public com.github.igorperikov.heimdallr.generated.ClusterStateRequest getDefaultInstanceForType() {
      return com.github.igorperikov.heimdallr.generated.ClusterStateRequest.getDefaultInstance();
    }

    public com.github.igorperikov.heimdallr.generated.ClusterStateRequest build() {
      com.github.igorperikov.heimdallr.generated.ClusterStateRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.github.igorperikov.heimdallr.generated.ClusterStateRequest buildPartial() {
      com.github.igorperikov.heimdallr.generated.ClusterStateRequest result = new com.github.igorperikov.heimdallr.generated.ClusterStateRequest(this);
      if (nodeBuilder_ == null) {
        result.node_ = node_;
      } else {
        result.node_ = nodeBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.github.igorperikov.heimdallr.generated.ClusterStateRequest) {
        return mergeFrom((com.github.igorperikov.heimdallr.generated.ClusterStateRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.igorperikov.heimdallr.generated.ClusterStateRequest other) {
      if (other == com.github.igorperikov.heimdallr.generated.ClusterStateRequest.getDefaultInstance()) return this;
      if (other.hasNode()) {
        mergeNode(other.getNode());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.github.igorperikov.heimdallr.generated.ClusterStateRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.github.igorperikov.heimdallr.generated.ClusterStateRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.github.igorperikov.heimdallr.generated.NodeDefinition node_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.github.igorperikov.heimdallr.generated.NodeDefinition, com.github.igorperikov.heimdallr.generated.NodeDefinition.Builder, com.github.igorperikov.heimdallr.generated.NodeDefinitionOrBuilder> nodeBuilder_;
    /**
     * <code>.heimdallr.NodeDefinition node = 1;</code>
     */
    public boolean hasNode() {
      return nodeBuilder_ != null || node_ != null;
    }
    /**
     * <code>.heimdallr.NodeDefinition node = 1;</code>
     */
    public com.github.igorperikov.heimdallr.generated.NodeDefinition getNode() {
      if (nodeBuilder_ == null) {
        return node_ == null ? com.github.igorperikov.heimdallr.generated.NodeDefinition.getDefaultInstance() : node_;
      } else {
        return nodeBuilder_.getMessage();
      }
    }
    /**
     * <code>.heimdallr.NodeDefinition node = 1;</code>
     */
    public Builder setNode(com.github.igorperikov.heimdallr.generated.NodeDefinition value) {
      if (nodeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        node_ = value;
        onChanged();
      } else {
        nodeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.heimdallr.NodeDefinition node = 1;</code>
     */
    public Builder setNode(
        com.github.igorperikov.heimdallr.generated.NodeDefinition.Builder builderForValue) {
      if (nodeBuilder_ == null) {
        node_ = builderForValue.build();
        onChanged();
      } else {
        nodeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.heimdallr.NodeDefinition node = 1;</code>
     */
    public Builder mergeNode(com.github.igorperikov.heimdallr.generated.NodeDefinition value) {
      if (nodeBuilder_ == null) {
        if (node_ != null) {
          node_ =
            com.github.igorperikov.heimdallr.generated.NodeDefinition.newBuilder(node_).mergeFrom(value).buildPartial();
        } else {
          node_ = value;
        }
        onChanged();
      } else {
        nodeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.heimdallr.NodeDefinition node = 1;</code>
     */
    public Builder clearNode() {
      if (nodeBuilder_ == null) {
        node_ = null;
        onChanged();
      } else {
        node_ = null;
        nodeBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.heimdallr.NodeDefinition node = 1;</code>
     */
    public com.github.igorperikov.heimdallr.generated.NodeDefinition.Builder getNodeBuilder() {
      
      onChanged();
      return getNodeFieldBuilder().getBuilder();
    }
    /**
     * <code>.heimdallr.NodeDefinition node = 1;</code>
     */
    public com.github.igorperikov.heimdallr.generated.NodeDefinitionOrBuilder getNodeOrBuilder() {
      if (nodeBuilder_ != null) {
        return nodeBuilder_.getMessageOrBuilder();
      } else {
        return node_ == null ?
            com.github.igorperikov.heimdallr.generated.NodeDefinition.getDefaultInstance() : node_;
      }
    }
    /**
     * <code>.heimdallr.NodeDefinition node = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.github.igorperikov.heimdallr.generated.NodeDefinition, com.github.igorperikov.heimdallr.generated.NodeDefinition.Builder, com.github.igorperikov.heimdallr.generated.NodeDefinitionOrBuilder> 
        getNodeFieldBuilder() {
      if (nodeBuilder_ == null) {
        nodeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.github.igorperikov.heimdallr.generated.NodeDefinition, com.github.igorperikov.heimdallr.generated.NodeDefinition.Builder, com.github.igorperikov.heimdallr.generated.NodeDefinitionOrBuilder>(
                getNode(),
                getParentForChildren(),
                isClean());
        node_ = null;
      }
      return nodeBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:heimdallr.ClusterStateRequest)
  }

  // @@protoc_insertion_point(class_scope:heimdallr.ClusterStateRequest)
  private static final com.github.igorperikov.heimdallr.generated.ClusterStateRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.github.igorperikov.heimdallr.generated.ClusterStateRequest();
  }

  public static com.github.igorperikov.heimdallr.generated.ClusterStateRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ClusterStateRequest>
      PARSER = new com.google.protobuf.AbstractParser<ClusterStateRequest>() {
    public ClusterStateRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new ClusterStateRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ClusterStateRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ClusterStateRequest> getParserForType() {
    return PARSER;
  }

  public com.github.igorperikov.heimdallr.generated.ClusterStateRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

