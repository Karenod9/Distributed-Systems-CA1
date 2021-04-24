// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: roombookingservice.proto

package com.dsproject.roombookingservice;

/**
 * Protobuf type {@code roombookingservice.BookRoomResponse}
 */
public  final class BookRoomResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:roombookingservice.BookRoomResponse)
    BookRoomResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BookRoomResponse.newBuilder() to construct.
  private BookRoomResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BookRoomResponse() {
    date_ = "";
    roomName_ = "";
    numAttendees_ = "";
    foodRequired_ = "";
    drinksRequired_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BookRoomResponse(
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

            date_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            roomName_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            numAttendees_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            foodRequired_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            drinksRequired_ = s;
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
    return com.dsproject.roombookingservice.RoomBookingServiceImpl.internal_static_roombookingservice_BookRoomResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.dsproject.roombookingservice.RoomBookingServiceImpl.internal_static_roombookingservice_BookRoomResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.dsproject.roombookingservice.BookRoomResponse.class, com.dsproject.roombookingservice.BookRoomResponse.Builder.class);
  }

  public static final int DATE_FIELD_NUMBER = 1;
  private volatile java.lang.Object date_;
  /**
   * <code>string date = 1;</code>
   */
  public java.lang.String getDate() {
    java.lang.Object ref = date_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      date_ = s;
      return s;
    }
  }
  /**
   * <code>string date = 1;</code>
   */
  public com.google.protobuf.ByteString
      getDateBytes() {
    java.lang.Object ref = date_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      date_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ROOMNAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object roomName_;
  /**
   * <code>string roomName = 2;</code>
   */
  public java.lang.String getRoomName() {
    java.lang.Object ref = roomName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      roomName_ = s;
      return s;
    }
  }
  /**
   * <code>string roomName = 2;</code>
   */
  public com.google.protobuf.ByteString
      getRoomNameBytes() {
    java.lang.Object ref = roomName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      roomName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NUMATTENDEES_FIELD_NUMBER = 3;
  private volatile java.lang.Object numAttendees_;
  /**
   * <code>string numAttendees = 3;</code>
   */
  public java.lang.String getNumAttendees() {
    java.lang.Object ref = numAttendees_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      numAttendees_ = s;
      return s;
    }
  }
  /**
   * <code>string numAttendees = 3;</code>
   */
  public com.google.protobuf.ByteString
      getNumAttendeesBytes() {
    java.lang.Object ref = numAttendees_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      numAttendees_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FOODREQUIRED_FIELD_NUMBER = 4;
  private volatile java.lang.Object foodRequired_;
  /**
   * <code>string foodRequired = 4;</code>
   */
  public java.lang.String getFoodRequired() {
    java.lang.Object ref = foodRequired_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      foodRequired_ = s;
      return s;
    }
  }
  /**
   * <code>string foodRequired = 4;</code>
   */
  public com.google.protobuf.ByteString
      getFoodRequiredBytes() {
    java.lang.Object ref = foodRequired_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      foodRequired_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DRINKSREQUIRED_FIELD_NUMBER = 5;
  private volatile java.lang.Object drinksRequired_;
  /**
   * <code>string drinksRequired = 5;</code>
   */
  public java.lang.String getDrinksRequired() {
    java.lang.Object ref = drinksRequired_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      drinksRequired_ = s;
      return s;
    }
  }
  /**
   * <code>string drinksRequired = 5;</code>
   */
  public com.google.protobuf.ByteString
      getDrinksRequiredBytes() {
    java.lang.Object ref = drinksRequired_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      drinksRequired_ = b;
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
    if (!getDateBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, date_);
    }
    if (!getRoomNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, roomName_);
    }
    if (!getNumAttendeesBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, numAttendees_);
    }
    if (!getFoodRequiredBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, foodRequired_);
    }
    if (!getDrinksRequiredBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, drinksRequired_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getDateBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, date_);
    }
    if (!getRoomNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, roomName_);
    }
    if (!getNumAttendeesBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, numAttendees_);
    }
    if (!getFoodRequiredBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, foodRequired_);
    }
    if (!getDrinksRequiredBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, drinksRequired_);
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
    if (!(obj instanceof com.dsproject.roombookingservice.BookRoomResponse)) {
      return super.equals(obj);
    }
    com.dsproject.roombookingservice.BookRoomResponse other = (com.dsproject.roombookingservice.BookRoomResponse) obj;

    boolean result = true;
    result = result && getDate()
        .equals(other.getDate());
    result = result && getRoomName()
        .equals(other.getRoomName());
    result = result && getNumAttendees()
        .equals(other.getNumAttendees());
    result = result && getFoodRequired()
        .equals(other.getFoodRequired());
    result = result && getDrinksRequired()
        .equals(other.getDrinksRequired());
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
    hash = (37 * hash) + DATE_FIELD_NUMBER;
    hash = (53 * hash) + getDate().hashCode();
    hash = (37 * hash) + ROOMNAME_FIELD_NUMBER;
    hash = (53 * hash) + getRoomName().hashCode();
    hash = (37 * hash) + NUMATTENDEES_FIELD_NUMBER;
    hash = (53 * hash) + getNumAttendees().hashCode();
    hash = (37 * hash) + FOODREQUIRED_FIELD_NUMBER;
    hash = (53 * hash) + getFoodRequired().hashCode();
    hash = (37 * hash) + DRINKSREQUIRED_FIELD_NUMBER;
    hash = (53 * hash) + getDrinksRequired().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.dsproject.roombookingservice.BookRoomResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.dsproject.roombookingservice.BookRoomResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.dsproject.roombookingservice.BookRoomResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.dsproject.roombookingservice.BookRoomResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.dsproject.roombookingservice.BookRoomResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.dsproject.roombookingservice.BookRoomResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.dsproject.roombookingservice.BookRoomResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.dsproject.roombookingservice.BookRoomResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.dsproject.roombookingservice.BookRoomResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.dsproject.roombookingservice.BookRoomResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.dsproject.roombookingservice.BookRoomResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.dsproject.roombookingservice.BookRoomResponse parseFrom(
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
  public static Builder newBuilder(com.dsproject.roombookingservice.BookRoomResponse prototype) {
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
   * Protobuf type {@code roombookingservice.BookRoomResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:roombookingservice.BookRoomResponse)
      com.dsproject.roombookingservice.BookRoomResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.dsproject.roombookingservice.RoomBookingServiceImpl.internal_static_roombookingservice_BookRoomResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.dsproject.roombookingservice.RoomBookingServiceImpl.internal_static_roombookingservice_BookRoomResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.dsproject.roombookingservice.BookRoomResponse.class, com.dsproject.roombookingservice.BookRoomResponse.Builder.class);
    }

    // Construct using com.dsproject.roombookingservice.BookRoomResponse.newBuilder()
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
      date_ = "";

      roomName_ = "";

      numAttendees_ = "";

      foodRequired_ = "";

      drinksRequired_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.dsproject.roombookingservice.RoomBookingServiceImpl.internal_static_roombookingservice_BookRoomResponse_descriptor;
    }

    @java.lang.Override
    public com.dsproject.roombookingservice.BookRoomResponse getDefaultInstanceForType() {
      return com.dsproject.roombookingservice.BookRoomResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.dsproject.roombookingservice.BookRoomResponse build() {
      com.dsproject.roombookingservice.BookRoomResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.dsproject.roombookingservice.BookRoomResponse buildPartial() {
      com.dsproject.roombookingservice.BookRoomResponse result = new com.dsproject.roombookingservice.BookRoomResponse(this);
      result.date_ = date_;
      result.roomName_ = roomName_;
      result.numAttendees_ = numAttendees_;
      result.foodRequired_ = foodRequired_;
      result.drinksRequired_ = drinksRequired_;
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
      if (other instanceof com.dsproject.roombookingservice.BookRoomResponse) {
        return mergeFrom((com.dsproject.roombookingservice.BookRoomResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.dsproject.roombookingservice.BookRoomResponse other) {
      if (other == com.dsproject.roombookingservice.BookRoomResponse.getDefaultInstance()) return this;
      if (!other.getDate().isEmpty()) {
        date_ = other.date_;
        onChanged();
      }
      if (!other.getRoomName().isEmpty()) {
        roomName_ = other.roomName_;
        onChanged();
      }
      if (!other.getNumAttendees().isEmpty()) {
        numAttendees_ = other.numAttendees_;
        onChanged();
      }
      if (!other.getFoodRequired().isEmpty()) {
        foodRequired_ = other.foodRequired_;
        onChanged();
      }
      if (!other.getDrinksRequired().isEmpty()) {
        drinksRequired_ = other.drinksRequired_;
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
      com.dsproject.roombookingservice.BookRoomResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.dsproject.roombookingservice.BookRoomResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object date_ = "";
    /**
     * <code>string date = 1;</code>
     */
    public java.lang.String getDate() {
      java.lang.Object ref = date_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        date_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string date = 1;</code>
     */
    public com.google.protobuf.ByteString
        getDateBytes() {
      java.lang.Object ref = date_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        date_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string date = 1;</code>
     */
    public Builder setDate(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      date_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string date = 1;</code>
     */
    public Builder clearDate() {
      
      date_ = getDefaultInstance().getDate();
      onChanged();
      return this;
    }
    /**
     * <code>string date = 1;</code>
     */
    public Builder setDateBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      date_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object roomName_ = "";
    /**
     * <code>string roomName = 2;</code>
     */
    public java.lang.String getRoomName() {
      java.lang.Object ref = roomName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        roomName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string roomName = 2;</code>
     */
    public com.google.protobuf.ByteString
        getRoomNameBytes() {
      java.lang.Object ref = roomName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        roomName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string roomName = 2;</code>
     */
    public Builder setRoomName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      roomName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string roomName = 2;</code>
     */
    public Builder clearRoomName() {
      
      roomName_ = getDefaultInstance().getRoomName();
      onChanged();
      return this;
    }
    /**
     * <code>string roomName = 2;</code>
     */
    public Builder setRoomNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      roomName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object numAttendees_ = "";
    /**
     * <code>string numAttendees = 3;</code>
     */
    public java.lang.String getNumAttendees() {
      java.lang.Object ref = numAttendees_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        numAttendees_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string numAttendees = 3;</code>
     */
    public com.google.protobuf.ByteString
        getNumAttendeesBytes() {
      java.lang.Object ref = numAttendees_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        numAttendees_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string numAttendees = 3;</code>
     */
    public Builder setNumAttendees(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      numAttendees_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string numAttendees = 3;</code>
     */
    public Builder clearNumAttendees() {
      
      numAttendees_ = getDefaultInstance().getNumAttendees();
      onChanged();
      return this;
    }
    /**
     * <code>string numAttendees = 3;</code>
     */
    public Builder setNumAttendeesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      numAttendees_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object foodRequired_ = "";
    /**
     * <code>string foodRequired = 4;</code>
     */
    public java.lang.String getFoodRequired() {
      java.lang.Object ref = foodRequired_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        foodRequired_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string foodRequired = 4;</code>
     */
    public com.google.protobuf.ByteString
        getFoodRequiredBytes() {
      java.lang.Object ref = foodRequired_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        foodRequired_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string foodRequired = 4;</code>
     */
    public Builder setFoodRequired(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      foodRequired_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string foodRequired = 4;</code>
     */
    public Builder clearFoodRequired() {
      
      foodRequired_ = getDefaultInstance().getFoodRequired();
      onChanged();
      return this;
    }
    /**
     * <code>string foodRequired = 4;</code>
     */
    public Builder setFoodRequiredBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      foodRequired_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object drinksRequired_ = "";
    /**
     * <code>string drinksRequired = 5;</code>
     */
    public java.lang.String getDrinksRequired() {
      java.lang.Object ref = drinksRequired_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        drinksRequired_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string drinksRequired = 5;</code>
     */
    public com.google.protobuf.ByteString
        getDrinksRequiredBytes() {
      java.lang.Object ref = drinksRequired_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        drinksRequired_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string drinksRequired = 5;</code>
     */
    public Builder setDrinksRequired(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      drinksRequired_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string drinksRequired = 5;</code>
     */
    public Builder clearDrinksRequired() {
      
      drinksRequired_ = getDefaultInstance().getDrinksRequired();
      onChanged();
      return this;
    }
    /**
     * <code>string drinksRequired = 5;</code>
     */
    public Builder setDrinksRequiredBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      drinksRequired_ = value;
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


    // @@protoc_insertion_point(builder_scope:roombookingservice.BookRoomResponse)
  }

  // @@protoc_insertion_point(class_scope:roombookingservice.BookRoomResponse)
  private static final com.dsproject.roombookingservice.BookRoomResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.dsproject.roombookingservice.BookRoomResponse();
  }

  public static com.dsproject.roombookingservice.BookRoomResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BookRoomResponse>
      PARSER = new com.google.protobuf.AbstractParser<BookRoomResponse>() {
    @java.lang.Override
    public BookRoomResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BookRoomResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BookRoomResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BookRoomResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.dsproject.roombookingservice.BookRoomResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
