package com.google.protobuf;

import java.io.IOException;

/* compiled from: UnknownFieldSchema.java */
/* loaded from: classes2.dex */
public abstract class u0<T, B> {
    public abstract void addFixed32(B b10, int i, int i10);

    public abstract void addFixed64(B b10, int i, long j4);

    public abstract void addGroup(B b10, int i, T t10);

    public abstract void addLengthDelimited(B b10, int i, AbstractC4026i abstractC4026i);

    public abstract void addVarint(B b10, int i, long j4);

    public abstract B getBuilderFromMessage(Object obj);

    public abstract T getFromMessage(Object obj);

    public abstract int getSerializedSize(T t10);

    public abstract int getSerializedSizeAsMessageSet(T t10);

    public abstract void makeImmutable(Object obj);

    public abstract T merge(T t10, T t11);

    public final void mergeFrom(B b10, l0 l0Var) throws IOException {
        while (l0Var.getFieldNumber() != Integer.MAX_VALUE && mergeOneFieldFrom(b10, l0Var)) {
        }
    }

    public final boolean mergeOneFieldFrom(B b10, l0 l0Var) throws IOException {
        int tag = l0Var.getTag();
        int tagFieldNumber = A0.getTagFieldNumber(tag);
        int tagWireType = A0.getTagWireType(tag);
        if (tagWireType == 0) {
            addVarint(b10, tagFieldNumber, l0Var.readInt64());
            return true;
        }
        if (tagWireType == 1) {
            addFixed64(b10, tagFieldNumber, l0Var.readFixed64());
            return true;
        }
        if (tagWireType == 2) {
            addLengthDelimited(b10, tagFieldNumber, l0Var.readBytes());
            return true;
        }
        if (tagWireType != 3) {
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType != 5) {
                throw C.invalidWireType();
            }
            addFixed32(b10, tagFieldNumber, l0Var.readFixed32());
            return true;
        }
        B bNewBuilder = newBuilder();
        int iMakeTag = A0.makeTag(tagFieldNumber, 4);
        mergeFrom(bNewBuilder, l0Var);
        if (iMakeTag != l0Var.getTag()) {
            throw C.invalidEndTag();
        }
        addGroup(b10, tagFieldNumber, toImmutable(bNewBuilder));
        return true;
    }

    public abstract B newBuilder();

    public abstract void setBuilderToMessage(Object obj, B b10);

    public abstract void setToMessage(Object obj, T t10);

    public abstract boolean shouldDiscardUnknownFields(l0 l0Var);

    public abstract T toImmutable(B b10);

    public abstract void writeAsMessageSetTo(T t10, B0 b02) throws IOException;

    public abstract void writeTo(T t10, B0 b02) throws IOException;
}
