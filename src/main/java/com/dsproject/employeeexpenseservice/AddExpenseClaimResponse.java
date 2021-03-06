// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: employee_expense_service.proto

package com.dsproject.employeeexpenseservice;

/**
 * Protobuf type {@code employeeexpenseservice.AddExpenseClaimResponse}
 */
public  final class AddExpenseClaimResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:employeeexpenseservice.AddExpenseClaimResponse)
    AddExpenseClaimResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AddExpenseClaimResponse.newBuilder() to construct.
  private AddExpenseClaimResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AddExpenseClaimResponse() {
    claimResult_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AddExpenseClaimResponse(
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

            claimResult_ = s;
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
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
    return com.dsproject.employeeexpenseservice.EmployeeExpenseServiceImpl.internal_static_employeeexpenseservice_AddExpenseClaimResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.dsproject.employeeexpenseservice.EmployeeExpenseServiceImpl.internal_static_employeeexpenseservice_AddExpenseClaimResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.dsproject.employeeexpenseservice.AddExpenseClaimResponse.class, com.dsproject.employeeexpenseservice.AddExpenseClaimResponse.Builder.class);
  }

  public static final int CLAIMRESULT_FIELD_NUMBER = 1;
  private volatile java.lang.Object claimResult_;
  /**
   * <code>string claimResult = 1;</code>
   */
  public java.lang.String getClaimResult() {
    java.lang.Object ref = claimResult_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      claimResult_ = s;
      return s;
    }
  }
  /**
   * <code>string claimResult = 1;</code>
   */
  public com.google.protobuf.ByteString
      getClaimResultBytes() {
    java.lang.Object ref = claimResult_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      claimResult_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!getClaimResultBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, claimResult_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getClaimResultBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, claimResult_);
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
    if (!(obj instanceof com.dsproject.employeeexpenseservice.AddExpenseClaimResponse)) {
      return super.equals(obj);
    }
    com.dsproject.employeeexpenseservice.AddExpenseClaimResponse other = (com.dsproject.employeeexpenseservice.AddExpenseClaimResponse) obj;

    boolean result = true;
    result = result && getClaimResult()
        .equals(other.getClaimResult());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + CLAIMRESULT_FIELD_NUMBER;
    hash = (53 * hash) + getClaimResult().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.dsproject.employeeexpenseservice.AddExpenseClaimResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.dsproject.employeeexpenseservice.AddExpenseClaimResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.dsproject.employeeexpenseservice.AddExpenseClaimResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.dsproject.employeeexpenseservice.AddExpenseClaimResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.dsproject.employeeexpenseservice.AddExpenseClaimResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.dsproject.employeeexpenseservice.AddExpenseClaimResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.dsproject.employeeexpenseservice.AddExpenseClaimResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.dsproject.employeeexpenseservice.AddExpenseClaimResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.dsproject.employeeexpenseservice.AddExpenseClaimResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.dsproject.employeeexpenseservice.AddExpenseClaimResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.dsproject.employeeexpenseservice.AddExpenseClaimResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.dsproject.employeeexpenseservice.AddExpenseClaimResponse parseFrom(
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
  public static Builder newBuilder(com.dsproject.employeeexpenseservice.AddExpenseClaimResponse prototype) {
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
   * Protobuf type {@code employeeexpenseservice.AddExpenseClaimResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:employeeexpenseservice.AddExpenseClaimResponse)
      com.dsproject.employeeexpenseservice.AddExpenseClaimResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.dsproject.employeeexpenseservice.EmployeeExpenseServiceImpl.internal_static_employeeexpenseservice_AddExpenseClaimResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.dsproject.employeeexpenseservice.EmployeeExpenseServiceImpl.internal_static_employeeexpenseservice_AddExpenseClaimResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.dsproject.employeeexpenseservice.AddExpenseClaimResponse.class, com.dsproject.employeeexpenseservice.AddExpenseClaimResponse.Builder.class);
    }

    // Construct using com.dsproject.employeeexpenseservice.AddExpenseClaimResponse.newBuilder()
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
      claimResult_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.dsproject.employeeexpenseservice.EmployeeExpenseServiceImpl.internal_static_employeeexpenseservice_AddExpenseClaimResponse_descriptor;
    }

    @java.lang.Override
    public com.dsproject.employeeexpenseservice.AddExpenseClaimResponse getDefaultInstanceForType() {
      return com.dsproject.employeeexpenseservice.AddExpenseClaimResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.dsproject.employeeexpenseservice.AddExpenseClaimResponse build() {
      com.dsproject.employeeexpenseservice.AddExpenseClaimResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.dsproject.employeeexpenseservice.AddExpenseClaimResponse buildPartial() {
      com.dsproject.employeeexpenseservice.AddExpenseClaimResponse result = new com.dsproject.employeeexpenseservice.AddExpenseClaimResponse(this);
      result.claimResult_ = claimResult_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.dsproject.employeeexpenseservice.AddExpenseClaimResponse) {
        return mergeFrom((com.dsproject.employeeexpenseservice.AddExpenseClaimResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.dsproject.employeeexpenseservice.AddExpenseClaimResponse other) {
      if (other == com.dsproject.employeeexpenseservice.AddExpenseClaimResponse.getDefaultInstance()) return this;
      if (!other.getClaimResult().isEmpty()) {
        claimResult_ = other.claimResult_;
        onChanged();
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
      com.dsproject.employeeexpenseservice.AddExpenseClaimResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.dsproject.employeeexpenseservice.AddExpenseClaimResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object claimResult_ = "";
    /**
     * <code>string claimResult = 1;</code>
     */
    public java.lang.String getClaimResult() {
      java.lang.Object ref = claimResult_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        claimResult_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string claimResult = 1;</code>
     */
    public com.google.protobuf.ByteString
        getClaimResultBytes() {
      java.lang.Object ref = claimResult_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        claimResult_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string claimResult = 1;</code>
     */
    public Builder setClaimResult(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      claimResult_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string claimResult = 1;</code>
     */
    public Builder clearClaimResult() {
      
      claimResult_ = getDefaultInstance().getClaimResult();
      onChanged();
      return this;
    }
    /**
     * <code>string claimResult = 1;</code>
     */
    public Builder setClaimResultBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      claimResult_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:employeeexpenseservice.AddExpenseClaimResponse)
  }

  // @@protoc_insertion_point(class_scope:employeeexpenseservice.AddExpenseClaimResponse)
  private static final com.dsproject.employeeexpenseservice.AddExpenseClaimResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.dsproject.employeeexpenseservice.AddExpenseClaimResponse();
  }

  public static com.dsproject.employeeexpenseservice.AddExpenseClaimResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AddExpenseClaimResponse>
      PARSER = new com.google.protobuf.AbstractParser<AddExpenseClaimResponse>() {
    @java.lang.Override
    public AddExpenseClaimResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AddExpenseClaimResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AddExpenseClaimResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AddExpenseClaimResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.dsproject.employeeexpenseservice.AddExpenseClaimResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

