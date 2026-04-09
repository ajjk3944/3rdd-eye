package com.google.protobuf;

import java.io.IOException;

/* loaded from: classes3.dex */
public abstract class v0 {
    static final int DEFAULT_RECURSION_LIMIT = 100;
    private static volatile int recursionLimit = 100;

    private final void mergeFrom(Object obj, p0 p0Var, int i10) throws IOException {
        while (p0Var.getFieldNumber() != Integer.MAX_VALUE && mergeOneFieldFrom(obj, p0Var, i10)) {
        }
    }

    public abstract void addFixed32(Object obj, int i10, int i11);

    public abstract void addFixed64(Object obj, int i10, long j10);

    public abstract void addGroup(Object obj, int i10, Object obj2);

    public abstract void addLengthDelimited(Object obj, int i10, ByteString byteString);

    public abstract void addVarint(Object obj, int i10, long j10);

    public abstract Object getBuilderFromMessage(Object obj);

    public abstract Object getFromMessage(Object obj);

    public abstract int getSerializedSize(Object obj);

    public abstract int getSerializedSizeAsMessageSet(Object obj);

    public abstract void makeImmutable(Object obj);

    public abstract Object merge(Object obj, Object obj2);

    public final boolean mergeOneFieldFrom(Object obj, p0 p0Var, int i10) throws IOException {
        int tag = p0Var.getTag();
        int tagFieldNumber = WireFormat.getTagFieldNumber(tag);
        int tagWireType = WireFormat.getTagWireType(tag);
        if (tagWireType == 0) {
            addVarint(obj, tagFieldNumber, p0Var.readInt64());
            return true;
        }
        if (tagWireType == 1) {
            addFixed64(obj, tagFieldNumber, p0Var.readFixed64());
            return true;
        }
        if (tagWireType == 2) {
            addLengthDelimited(obj, tagFieldNumber, p0Var.readBytes());
            return true;
        }
        if (tagWireType != 3) {
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            addFixed32(obj, tagFieldNumber, p0Var.readFixed32());
            return true;
        }
        Object objNewBuilder = newBuilder();
        int iMakeTag = WireFormat.makeTag(tagFieldNumber, 4);
        int i11 = i10 + 1;
        if (i11 >= recursionLimit) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        mergeFrom(objNewBuilder, p0Var, i11);
        if (iMakeTag != p0Var.getTag()) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
        addGroup(obj, tagFieldNumber, toImmutable(objNewBuilder));
        return true;
    }

    public abstract Object newBuilder();

    public abstract void setBuilderToMessage(Object obj, Object obj2);

    public void setRecursionLimit(int i10) {
        recursionLimit = i10;
    }

    public abstract void setToMessage(Object obj, Object obj2);

    public abstract boolean shouldDiscardUnknownFields(p0 p0Var);

    public abstract Object toImmutable(Object obj);

    public abstract void writeAsMessageSetTo(Object obj, Writer writer) throws IOException;

    public abstract void writeTo(Object obj, Writer writer) throws IOException;
}
