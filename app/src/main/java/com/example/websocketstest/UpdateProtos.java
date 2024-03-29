// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: update.proto

package com.example.websocketstest;

public final class UpdateProtos {
    private UpdateProtos() {}
    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistryLite registry) {
    }

    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions(
                (com.google.protobuf.ExtensionRegistryLite) registry);
    }
    public interface UpdateOrBuilder extends
            // @@protoc_insertion_point(interface_extends:websocketstest.Update)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>required string first_name = 1;</code>
         */
        boolean hasFirstName();
        /**
         * <code>required string first_name = 1;</code>
         */
        java.lang.String getFirstName();
        /**
         * <code>required string first_name = 1;</code>
         */
        com.google.protobuf.ByteString
        getFirstNameBytes();

        /**
         * <code>required string last_name = 2;</code>
         */
        boolean hasLastName();
        /**
         * <code>required string last_name = 2;</code>
         */
        java.lang.String getLastName();
        /**
         * <code>required string last_name = 2;</code>
         */
        com.google.protobuf.ByteString
        getLastNameBytes();
    }
    /**
     * Protobuf type {@code websocketstest.Update}
     */
    public  static final class Update extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:websocketstest.Update)
            UpdateOrBuilder {
        // Use Update.newBuilder() to construct.
        private Update(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }
        private Update() {
            firstName_ = "";
            lastName_ = "";
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }
        private Update(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
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
                        default: {
                            if (!parseUnknownField(input, unknownFields,
                                    extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 10: {
                            com.google.protobuf.ByteString bs = input.readBytes();
                            bitField0_ |= 0x00000001;
                            firstName_ = bs;
                            break;
                        }
                        case 18: {
                            com.google.protobuf.ByteString bs = input.readBytes();
                            bitField0_ |= 0x00000002;
                            lastName_ = bs;
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
            return com.example.websocketstest.UpdateProtos.internal_static_websocketstest_Update_descriptor;
        }

        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return com.example.websocketstest.UpdateProtos.internal_static_websocketstest_Update_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            com.example.websocketstest.UpdateProtos.Update.class, com.example.websocketstest.UpdateProtos.Update.Builder.class);
        }

        private int bitField0_;
        public static final int FIRST_NAME_FIELD_NUMBER = 1;
        private volatile java.lang.Object firstName_;
        /**
         * <code>required string first_name = 1;</code>
         */
        public boolean hasFirstName() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }
        /**
         * <code>required string first_name = 1;</code>
         */
        public java.lang.String getFirstName() {
            java.lang.Object ref = firstName_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                    firstName_ = s;
                }
                return s;
            }
        }
        /**
         * <code>required string first_name = 1;</code>
         */
        public com.google.protobuf.ByteString
        getFirstNameBytes() {
            java.lang.Object ref = firstName_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                firstName_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int LAST_NAME_FIELD_NUMBER = 2;
        private volatile java.lang.Object lastName_;
        /**
         * <code>required string last_name = 2;</code>
         */
        public boolean hasLastName() {
            return ((bitField0_ & 0x00000002) == 0x00000002);
        }
        /**
         * <code>required string last_name = 2;</code>
         */
        public java.lang.String getLastName() {
            java.lang.Object ref = lastName_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                    lastName_ = s;
                }
                return s;
            }
        }
        /**
         * <code>required string last_name = 2;</code>
         */
        public com.google.protobuf.ByteString
        getLastNameBytes() {
            java.lang.Object ref = lastName_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                lastName_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        private byte memoizedIsInitialized = -1;
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            if (!hasFirstName()) {
                memoizedIsInitialized = 0;
                return false;
            }
            if (!hasLastName()) {
                memoizedIsInitialized = 0;
                return false;
            }
            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 1, firstName_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 2, lastName_);
            }
            unknownFields.writeTo(output);
        }

        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, firstName_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, lastName_);
            }
            size += unknownFields.getSerializedSize();
            memoizedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;
        @java.lang.Override
        public boolean equals(final java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof com.example.websocketstest.UpdateProtos.Update)) {
                return super.equals(obj);
            }
            com.example.websocketstest.UpdateProtos.Update other = (com.example.websocketstest.UpdateProtos.Update) obj;

            boolean result = true;
            result = result && (hasFirstName() == other.hasFirstName());
            if (hasFirstName()) {
                result = result && getFirstName()
                        .equals(other.getFirstName());
            }
            result = result && (hasLastName() == other.hasLastName());
            if (hasLastName()) {
                result = result && getLastName()
                        .equals(other.getLastName());
            }
            result = result && unknownFields.equals(other.unknownFields);
            return result;
        }

        @java.lang.Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptorForType().hashCode();
            if (hasFirstName()) {
                hash = (37 * hash) + FIRST_NAME_FIELD_NUMBER;
                hash = (53 * hash) + getFirstName().hashCode();
            }
            if (hasLastName()) {
                hash = (37 * hash) + LAST_NAME_FIELD_NUMBER;
                hash = (53 * hash) + getLastName().hashCode();
            }
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static com.example.websocketstest.UpdateProtos.Update parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.example.websocketstest.UpdateProtos.Update parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.example.websocketstest.UpdateProtos.Update parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.example.websocketstest.UpdateProtos.Update parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.example.websocketstest.UpdateProtos.Update parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static com.example.websocketstest.UpdateProtos.Update parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }
        public static com.example.websocketstest.UpdateProtos.Update parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }
        public static com.example.websocketstest.UpdateProtos.Update parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }
        public static com.example.websocketstest.UpdateProtos.Update parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static com.example.websocketstest.UpdateProtos.Update parseFrom(
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
        public static Builder newBuilder(com.example.websocketstest.UpdateProtos.Update prototype) {
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
         * Protobuf type {@code websocketstest.Update}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:websocketstest.Update)
                com.example.websocketstest.UpdateProtos.UpdateOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return com.example.websocketstest.UpdateProtos.internal_static_websocketstest_Update_descriptor;
            }

            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return com.example.websocketstest.UpdateProtos.internal_static_websocketstest_Update_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                com.example.websocketstest.UpdateProtos.Update.class, com.example.websocketstest.UpdateProtos.Update.Builder.class);
            }

            // Construct using com.example.websocketstest.UpdateProtos.Update.newBuilder()
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
                firstName_ = "";
                bitField0_ = (bitField0_ & ~0x00000001);
                lastName_ = "";
                bitField0_ = (bitField0_ & ~0x00000002);
                return this;
            }

            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return com.example.websocketstest.UpdateProtos.internal_static_websocketstest_Update_descriptor;
            }

            public com.example.websocketstest.UpdateProtos.Update getDefaultInstanceForType() {
                return com.example.websocketstest.UpdateProtos.Update.getDefaultInstance();
            }

            public com.example.websocketstest.UpdateProtos.Update build() {
                com.example.websocketstest.UpdateProtos.Update result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public com.example.websocketstest.UpdateProtos.Update buildPartial() {
                com.example.websocketstest.UpdateProtos.Update result = new com.example.websocketstest.UpdateProtos.Update(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                    to_bitField0_ |= 0x00000001;
                }
                result.firstName_ = firstName_;
                if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                    to_bitField0_ |= 0x00000002;
                }
                result.lastName_ = lastName_;
                result.bitField0_ = to_bitField0_;
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
                if (other instanceof com.example.websocketstest.UpdateProtos.Update) {
                    return mergeFrom((com.example.websocketstest.UpdateProtos.Update)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(com.example.websocketstest.UpdateProtos.Update other) {
                if (other == com.example.websocketstest.UpdateProtos.Update.getDefaultInstance()) return this;
                if (other.hasFirstName()) {
                    bitField0_ |= 0x00000001;
                    firstName_ = other.firstName_;
                    onChanged();
                }
                if (other.hasLastName()) {
                    bitField0_ |= 0x00000002;
                    lastName_ = other.lastName_;
                    onChanged();
                }
                this.mergeUnknownFields(other.unknownFields);
                onChanged();
                return this;
            }

            public final boolean isInitialized() {
                if (!hasFirstName()) {
                    return false;
                }
                if (!hasLastName()) {
                    return false;
                }
                return true;
            }

            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                com.example.websocketstest.UpdateProtos.Update parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (com.example.websocketstest.UpdateProtos.Update) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            private int bitField0_;

            private java.lang.Object firstName_ = "";
            /**
             * <code>required string first_name = 1;</code>
             */
            public boolean hasFirstName() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }
            /**
             * <code>required string first_name = 1;</code>
             */
            public java.lang.String getFirstName() {
                java.lang.Object ref = firstName_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) {
                        firstName_ = s;
                    }
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }
            /**
             * <code>required string first_name = 1;</code>
             */
            public com.google.protobuf.ByteString
            getFirstNameBytes() {
                java.lang.Object ref = firstName_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    firstName_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>required string first_name = 1;</code>
             */
            public Builder setFirstName(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000001;
                firstName_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>required string first_name = 1;</code>
             */
            public Builder clearFirstName() {
                bitField0_ = (bitField0_ & ~0x00000001);
                firstName_ = getDefaultInstance().getFirstName();
                onChanged();
                return this;
            }
            /**
             * <code>required string first_name = 1;</code>
             */
            public Builder setFirstNameBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000001;
                firstName_ = value;
                onChanged();
                return this;
            }

            private java.lang.Object lastName_ = "";
            /**
             * <code>required string last_name = 2;</code>
             */
            public boolean hasLastName() {
                return ((bitField0_ & 0x00000002) == 0x00000002);
            }
            /**
             * <code>required string last_name = 2;</code>
             */
            public java.lang.String getLastName() {
                java.lang.Object ref = lastName_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) {
                        lastName_ = s;
                    }
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }
            /**
             * <code>required string last_name = 2;</code>
             */
            public com.google.protobuf.ByteString
            getLastNameBytes() {
                java.lang.Object ref = lastName_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    lastName_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>required string last_name = 2;</code>
             */
            public Builder setLastName(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000002;
                lastName_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>required string last_name = 2;</code>
             */
            public Builder clearLastName() {
                bitField0_ = (bitField0_ & ~0x00000002);
                lastName_ = getDefaultInstance().getLastName();
                onChanged();
                return this;
            }
            /**
             * <code>required string last_name = 2;</code>
             */
            public Builder setLastNameBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000002;
                lastName_ = value;
                onChanged();
                return this;
            }
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }

            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }


            // @@protoc_insertion_point(builder_scope:websocketstest.Update)
        }

        // @@protoc_insertion_point(class_scope:websocketstest.Update)
        private static final com.example.websocketstest.UpdateProtos.Update DEFAULT_INSTANCE;
        static {
            DEFAULT_INSTANCE = new com.example.websocketstest.UpdateProtos.Update();
        }

        public static com.example.websocketstest.UpdateProtos.Update getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        @java.lang.Deprecated public static final com.google.protobuf.Parser<Update>
                PARSER = new com.google.protobuf.AbstractParser<Update>() {
            public Update parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new Update(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<Update> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<Update> getParserForType() {
            return PARSER;
        }

        public com.example.websocketstest.UpdateProtos.Update getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_websocketstest_Update_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_websocketstest_Update_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor
    getDescriptor() {
        return descriptor;
    }
    private static  com.google.protobuf.Descriptors.FileDescriptor
            descriptor;
    static {
        java.lang.String[] descriptorData = {
                "\n\014update.proto\022\016websocketstest\"/\n\006Update" +
                        "\022\022\n\nfirst_name\030\001 \002(\t\022\021\n\tlast_name\030\002 \002(\tB" +
                        "*\n\032com.example.websocketstestB\014UpdatePro" +
                        "tos"
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
                        }, assigner);
        internal_static_websocketstest_Update_descriptor =
                getDescriptor().getMessageTypes().get(0);
        internal_static_websocketstest_Update_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_websocketstest_Update_descriptor,
                new java.lang.String[] { "FirstName", "LastName", });
    }

    // @@protoc_insertion_point(outer_class_scope)
}
