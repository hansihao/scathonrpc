// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ResponseMessage.proto

package com.scathon.tech.rpc.common.proto;

public final class ResponseMsgEntity {
  private ResponseMsgEntity() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ResponseMessageOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ResponseMessage)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string requestId = 1;</code>
     */
    java.lang.String getRequestId();
    /**
     * <code>string requestId = 1;</code>
     */
    com.google.protobuf.ByteString
        getRequestIdBytes();

    /**
     * <code>string status = 2;</code>
     */
    java.lang.String getStatus();
    /**
     * <code>string status = 2;</code>
     */
    com.google.protobuf.ByteString
        getStatusBytes();

    /**
     * <code>string errMsg = 3;</code>
     */
    java.lang.String getErrMsg();
    /**
     * <code>string errMsg = 3;</code>
     */
    com.google.protobuf.ByteString
        getErrMsgBytes();

    /**
     * <code>int32 errorCode = 4;</code>
     */
    int getErrorCode();

    /**
     * <code>.google.protobuf.Any responseBody = 5;</code>
     */
    boolean hasResponseBody();
    /**
     * <code>.google.protobuf.Any responseBody = 5;</code>
     */
    com.google.protobuf.Any getResponseBody();
    /**
     * <code>.google.protobuf.Any responseBody = 5;</code>
     */
    com.google.protobuf.AnyOrBuilder getResponseBodyOrBuilder();
  }
  /**
   * Protobuf type {@code ResponseMessage}
   */
  public  static final class ResponseMessage extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ResponseMessage)
      ResponseMessageOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ResponseMessage.newBuilder() to construct.
    private ResponseMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ResponseMessage() {
      requestId_ = "";
      status_ = "";
      errMsg_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ResponseMessage(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              requestId_ = s;
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              status_ = s;
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              errMsg_ = s;
              break;
            }
            case 32: {

              errorCode_ = input.readInt32();
              break;
            }
            case 42: {
              com.google.protobuf.Any.Builder subBuilder = null;
              if (responseBody_ != null) {
                subBuilder = responseBody_.toBuilder();
              }
              responseBody_ = input.readMessage(com.google.protobuf.Any.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(responseBody_);
                responseBody_ = subBuilder.buildPartial();
              }

              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
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
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.scathon.tech.rpc.common.proto.ResponseMsgEntity.internal_static_ResponseMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.scathon.tech.rpc.common.proto.ResponseMsgEntity.internal_static_ResponseMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.scathon.tech.rpc.common.proto.ResponseMsgEntity.ResponseMessage.class, com.scathon.tech.rpc.common.proto.ResponseMsgEntity.ResponseMessage.Builder.class);
    }

    public static final int REQUESTID_FIELD_NUMBER = 1;
    private volatile java.lang.Object requestId_;
    /**
     * <code>string requestId = 1;</code>
     */
    public java.lang.String getRequestId() {
      java.lang.Object ref = requestId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        requestId_ = s;
        return s;
      }
    }
    /**
     * <code>string requestId = 1;</code>
     */
    public com.google.protobuf.ByteString
        getRequestIdBytes() {
      java.lang.Object ref = requestId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        requestId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int STATUS_FIELD_NUMBER = 2;
    private volatile java.lang.Object status_;
    /**
     * <code>string status = 2;</code>
     */
    public java.lang.String getStatus() {
      java.lang.Object ref = status_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        status_ = s;
        return s;
      }
    }
    /**
     * <code>string status = 2;</code>
     */
    public com.google.protobuf.ByteString
        getStatusBytes() {
      java.lang.Object ref = status_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        status_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int ERRMSG_FIELD_NUMBER = 3;
    private volatile java.lang.Object errMsg_;
    /**
     * <code>string errMsg = 3;</code>
     */
    public java.lang.String getErrMsg() {
      java.lang.Object ref = errMsg_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        errMsg_ = s;
        return s;
      }
    }
    /**
     * <code>string errMsg = 3;</code>
     */
    public com.google.protobuf.ByteString
        getErrMsgBytes() {
      java.lang.Object ref = errMsg_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        errMsg_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int ERRORCODE_FIELD_NUMBER = 4;
    private int errorCode_;
    /**
     * <code>int32 errorCode = 4;</code>
     */
    public int getErrorCode() {
      return errorCode_;
    }

    public static final int RESPONSEBODY_FIELD_NUMBER = 5;
    private com.google.protobuf.Any responseBody_;
    /**
     * <code>.google.protobuf.Any responseBody = 5;</code>
     */
    public boolean hasResponseBody() {
      return responseBody_ != null;
    }
    /**
     * <code>.google.protobuf.Any responseBody = 5;</code>
     */
    public com.google.protobuf.Any getResponseBody() {
      return responseBody_ == null ? com.google.protobuf.Any.getDefaultInstance() : responseBody_;
    }
    /**
     * <code>.google.protobuf.Any responseBody = 5;</code>
     */
    public com.google.protobuf.AnyOrBuilder getResponseBodyOrBuilder() {
      return getResponseBody();
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!getRequestIdBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, requestId_);
      }
      if (!getStatusBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, status_);
      }
      if (!getErrMsgBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, errMsg_);
      }
      if (errorCode_ != 0) {
        output.writeInt32(4, errorCode_);
      }
      if (responseBody_ != null) {
        output.writeMessage(5, getResponseBody());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getRequestIdBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, requestId_);
      }
      if (!getStatusBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, status_);
      }
      if (!getErrMsgBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, errMsg_);
      }
      if (errorCode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, errorCode_);
      }
      if (responseBody_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(5, getResponseBody());
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.scathon.tech.rpc.common.proto.ResponseMsgEntity.ResponseMessage)) {
        return super.equals(obj);
      }
      com.scathon.tech.rpc.common.proto.ResponseMsgEntity.ResponseMessage other = (com.scathon.tech.rpc.common.proto.ResponseMsgEntity.ResponseMessage) obj;

      if (!getRequestId()
          .equals(other.getRequestId())) return false;
      if (!getStatus()
          .equals(other.getStatus())) return false;
      if (!getErrMsg()
          .equals(other.getErrMsg())) return false;
      if (getErrorCode()
          != other.getErrorCode()) return false;
      if (hasResponseBody() != other.hasResponseBody()) return false;
      if (hasResponseBody()) {
        if (!getResponseBody()
            .equals(other.getResponseBody())) return false;
      }
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + REQUESTID_FIELD_NUMBER;
      hash = (53 * hash) + getRequestId().hashCode();
      hash = (37 * hash) + STATUS_FIELD_NUMBER;
      hash = (53 * hash) + getStatus().hashCode();
      hash = (37 * hash) + ERRMSG_FIELD_NUMBER;
      hash = (53 * hash) + getErrMsg().hashCode();
      hash = (37 * hash) + ERRORCODE_FIELD_NUMBER;
      hash = (53 * hash) + getErrorCode();
      if (hasResponseBody()) {
        hash = (37 * hash) + RESPONSEBODY_FIELD_NUMBER;
        hash = (53 * hash) + getResponseBody().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.scathon.tech.rpc.common.proto.ResponseMsgEntity.ResponseMessage parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.scathon.tech.rpc.common.proto.ResponseMsgEntity.ResponseMessage parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.scathon.tech.rpc.common.proto.ResponseMsgEntity.ResponseMessage parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.scathon.tech.rpc.common.proto.ResponseMsgEntity.ResponseMessage parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.scathon.tech.rpc.common.proto.ResponseMsgEntity.ResponseMessage parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.scathon.tech.rpc.common.proto.ResponseMsgEntity.ResponseMessage parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.scathon.tech.rpc.common.proto.ResponseMsgEntity.ResponseMessage parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.scathon.tech.rpc.common.proto.ResponseMsgEntity.ResponseMessage parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.scathon.tech.rpc.common.proto.ResponseMsgEntity.ResponseMessage parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.scathon.tech.rpc.common.proto.ResponseMsgEntity.ResponseMessage parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.scathon.tech.rpc.common.proto.ResponseMsgEntity.ResponseMessage parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.scathon.tech.rpc.common.proto.ResponseMsgEntity.ResponseMessage parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.scathon.tech.rpc.common.proto.ResponseMsgEntity.ResponseMessage prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
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
     * Protobuf type {@code ResponseMessage}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ResponseMessage)
        com.scathon.tech.rpc.common.proto.ResponseMsgEntity.ResponseMessageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.scathon.tech.rpc.common.proto.ResponseMsgEntity.internal_static_ResponseMessage_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.scathon.tech.rpc.common.proto.ResponseMsgEntity.internal_static_ResponseMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.scathon.tech.rpc.common.proto.ResponseMsgEntity.ResponseMessage.class, com.scathon.tech.rpc.common.proto.ResponseMsgEntity.ResponseMessage.Builder.class);
      }

      // Construct using com.scathon.tech.rpc.common.proto.ResponseMsgEntity.ResponseMessage.newBuilder()
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
      @java.lang.Override
      public Builder clear() {
        super.clear();
        requestId_ = "";

        status_ = "";

        errMsg_ = "";

        errorCode_ = 0;

        if (responseBodyBuilder_ == null) {
          responseBody_ = null;
        } else {
          responseBody_ = null;
          responseBodyBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.scathon.tech.rpc.common.proto.ResponseMsgEntity.internal_static_ResponseMessage_descriptor;
      }

      @java.lang.Override
      public com.scathon.tech.rpc.common.proto.ResponseMsgEntity.ResponseMessage getDefaultInstanceForType() {
        return com.scathon.tech.rpc.common.proto.ResponseMsgEntity.ResponseMessage.getDefaultInstance();
      }

      @java.lang.Override
      public com.scathon.tech.rpc.common.proto.ResponseMsgEntity.ResponseMessage build() {
        com.scathon.tech.rpc.common.proto.ResponseMsgEntity.ResponseMessage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.scathon.tech.rpc.common.proto.ResponseMsgEntity.ResponseMessage buildPartial() {
        com.scathon.tech.rpc.common.proto.ResponseMsgEntity.ResponseMessage result = new com.scathon.tech.rpc.common.proto.ResponseMsgEntity.ResponseMessage(this);
        result.requestId_ = requestId_;
        result.status_ = status_;
        result.errMsg_ = errMsg_;
        result.errorCode_ = errorCode_;
        if (responseBodyBuilder_ == null) {
          result.responseBody_ = responseBody_;
        } else {
          result.responseBody_ = responseBodyBuilder_.build();
        }
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.scathon.tech.rpc.common.proto.ResponseMsgEntity.ResponseMessage) {
          return mergeFrom((com.scathon.tech.rpc.common.proto.ResponseMsgEntity.ResponseMessage)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.scathon.tech.rpc.common.proto.ResponseMsgEntity.ResponseMessage other) {
        if (other == com.scathon.tech.rpc.common.proto.ResponseMsgEntity.ResponseMessage.getDefaultInstance()) return this;
        if (!other.getRequestId().isEmpty()) {
          requestId_ = other.requestId_;
          onChanged();
        }
        if (!other.getStatus().isEmpty()) {
          status_ = other.status_;
          onChanged();
        }
        if (!other.getErrMsg().isEmpty()) {
          errMsg_ = other.errMsg_;
          onChanged();
        }
        if (other.getErrorCode() != 0) {
          setErrorCode(other.getErrorCode());
        }
        if (other.hasResponseBody()) {
          mergeResponseBody(other.getResponseBody());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.scathon.tech.rpc.common.proto.ResponseMsgEntity.ResponseMessage parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.scathon.tech.rpc.common.proto.ResponseMsgEntity.ResponseMessage) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object requestId_ = "";
      /**
       * <code>string requestId = 1;</code>
       */
      public java.lang.String getRequestId() {
        java.lang.Object ref = requestId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          requestId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string requestId = 1;</code>
       */
      public com.google.protobuf.ByteString
          getRequestIdBytes() {
        java.lang.Object ref = requestId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          requestId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string requestId = 1;</code>
       */
      public Builder setRequestId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        requestId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string requestId = 1;</code>
       */
      public Builder clearRequestId() {
        
        requestId_ = getDefaultInstance().getRequestId();
        onChanged();
        return this;
      }
      /**
       * <code>string requestId = 1;</code>
       */
      public Builder setRequestIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        requestId_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object status_ = "";
      /**
       * <code>string status = 2;</code>
       */
      public java.lang.String getStatus() {
        java.lang.Object ref = status_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          status_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string status = 2;</code>
       */
      public com.google.protobuf.ByteString
          getStatusBytes() {
        java.lang.Object ref = status_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          status_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string status = 2;</code>
       */
      public Builder setStatus(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        status_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string status = 2;</code>
       */
      public Builder clearStatus() {
        
        status_ = getDefaultInstance().getStatus();
        onChanged();
        return this;
      }
      /**
       * <code>string status = 2;</code>
       */
      public Builder setStatusBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        status_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object errMsg_ = "";
      /**
       * <code>string errMsg = 3;</code>
       */
      public java.lang.String getErrMsg() {
        java.lang.Object ref = errMsg_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          errMsg_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string errMsg = 3;</code>
       */
      public com.google.protobuf.ByteString
          getErrMsgBytes() {
        java.lang.Object ref = errMsg_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          errMsg_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string errMsg = 3;</code>
       */
      public Builder setErrMsg(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        errMsg_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string errMsg = 3;</code>
       */
      public Builder clearErrMsg() {
        
        errMsg_ = getDefaultInstance().getErrMsg();
        onChanged();
        return this;
      }
      /**
       * <code>string errMsg = 3;</code>
       */
      public Builder setErrMsgBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        errMsg_ = value;
        onChanged();
        return this;
      }

      private int errorCode_ ;
      /**
       * <code>int32 errorCode = 4;</code>
       */
      public int getErrorCode() {
        return errorCode_;
      }
      /**
       * <code>int32 errorCode = 4;</code>
       */
      public Builder setErrorCode(int value) {
        
        errorCode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 errorCode = 4;</code>
       */
      public Builder clearErrorCode() {
        
        errorCode_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Any responseBody_;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder> responseBodyBuilder_;
      /**
       * <code>.google.protobuf.Any responseBody = 5;</code>
       */
      public boolean hasResponseBody() {
        return responseBodyBuilder_ != null || responseBody_ != null;
      }
      /**
       * <code>.google.protobuf.Any responseBody = 5;</code>
       */
      public com.google.protobuf.Any getResponseBody() {
        if (responseBodyBuilder_ == null) {
          return responseBody_ == null ? com.google.protobuf.Any.getDefaultInstance() : responseBody_;
        } else {
          return responseBodyBuilder_.getMessage();
        }
      }
      /**
       * <code>.google.protobuf.Any responseBody = 5;</code>
       */
      public Builder setResponseBody(com.google.protobuf.Any value) {
        if (responseBodyBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          responseBody_ = value;
          onChanged();
        } else {
          responseBodyBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.google.protobuf.Any responseBody = 5;</code>
       */
      public Builder setResponseBody(
          com.google.protobuf.Any.Builder builderForValue) {
        if (responseBodyBuilder_ == null) {
          responseBody_ = builderForValue.build();
          onChanged();
        } else {
          responseBodyBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.google.protobuf.Any responseBody = 5;</code>
       */
      public Builder mergeResponseBody(com.google.protobuf.Any value) {
        if (responseBodyBuilder_ == null) {
          if (responseBody_ != null) {
            responseBody_ =
              com.google.protobuf.Any.newBuilder(responseBody_).mergeFrom(value).buildPartial();
          } else {
            responseBody_ = value;
          }
          onChanged();
        } else {
          responseBodyBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.google.protobuf.Any responseBody = 5;</code>
       */
      public Builder clearResponseBody() {
        if (responseBodyBuilder_ == null) {
          responseBody_ = null;
          onChanged();
        } else {
          responseBody_ = null;
          responseBodyBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.google.protobuf.Any responseBody = 5;</code>
       */
      public com.google.protobuf.Any.Builder getResponseBodyBuilder() {
        
        onChanged();
        return getResponseBodyFieldBuilder().getBuilder();
      }
      /**
       * <code>.google.protobuf.Any responseBody = 5;</code>
       */
      public com.google.protobuf.AnyOrBuilder getResponseBodyOrBuilder() {
        if (responseBodyBuilder_ != null) {
          return responseBodyBuilder_.getMessageOrBuilder();
        } else {
          return responseBody_ == null ?
              com.google.protobuf.Any.getDefaultInstance() : responseBody_;
        }
      }
      /**
       * <code>.google.protobuf.Any responseBody = 5;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder> 
          getResponseBodyFieldBuilder() {
        if (responseBodyBuilder_ == null) {
          responseBodyBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder>(
                  getResponseBody(),
                  getParentForChildren(),
                  isClean());
          responseBody_ = null;
        }
        return responseBodyBuilder_;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:ResponseMessage)
    }

    // @@protoc_insertion_point(class_scope:ResponseMessage)
    private static final com.scathon.tech.rpc.common.proto.ResponseMsgEntity.ResponseMessage DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.scathon.tech.rpc.common.proto.ResponseMsgEntity.ResponseMessage();
    }

    public static com.scathon.tech.rpc.common.proto.ResponseMsgEntity.ResponseMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ResponseMessage>
        PARSER = new com.google.protobuf.AbstractParser<ResponseMessage>() {
      @java.lang.Override
      public ResponseMessage parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ResponseMessage(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ResponseMessage> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ResponseMessage> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.scathon.tech.rpc.common.proto.ResponseMsgEntity.ResponseMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ResponseMessage_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ResponseMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025ResponseMessage.proto\032\031google/protobuf" +
      "/any.proto\"\203\001\n\017ResponseMessage\022\021\n\treques" +
      "tId\030\001 \001(\t\022\016\n\006status\030\002 \001(\t\022\016\n\006errMsg\030\003 \001(" +
      "\t\022\021\n\terrorCode\030\004 \001(\005\022*\n\014responseBody\030\005 \001" +
      "(\0132\024.google.protobuf.AnyB6\n!com.scathon." +
      "tech.rpc.common.protoB\021ResponseMsgEntity" +
      "b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.AnyProto.getDescriptor(),
        }, assigner);
    internal_static_ResponseMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ResponseMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ResponseMessage_descriptor,
        new java.lang.String[] { "RequestId", "Status", "ErrMsg", "ErrorCode", "ResponseBody", });
    com.google.protobuf.AnyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
