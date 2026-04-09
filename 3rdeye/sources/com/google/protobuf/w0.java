package com.google.protobuf;

import java.io.IOException;

/* compiled from: UnknownFieldSetLiteSchema.java */
/* loaded from: classes2.dex */
public class w0 extends u0<v0, v0> {
    @Override // com.google.protobuf.u0
    public void makeImmutable(Object obj) {
        getFromMessage(obj).makeImmutable();
    }

    @Override // com.google.protobuf.u0
    public boolean shouldDiscardUnknownFields(l0 l0Var) {
        return false;
    }

    @Override // com.google.protobuf.u0
    public void addFixed32(v0 v0Var, int i, int i10) {
        v0Var.storeField(A0.makeTag(i, 5), Integer.valueOf(i10));
    }

    @Override // com.google.protobuf.u0
    public void addFixed64(v0 v0Var, int i, long j4) {
        v0Var.storeField(A0.makeTag(i, 1), Long.valueOf(j4));
    }

    @Override // com.google.protobuf.u0
    public void addGroup(v0 v0Var, int i, v0 v0Var2) {
        v0Var.storeField(A0.makeTag(i, 3), v0Var2);
    }

    @Override // com.google.protobuf.u0
    public void addLengthDelimited(v0 v0Var, int i, AbstractC4026i abstractC4026i) {
        v0Var.storeField(A0.makeTag(i, 2), abstractC4026i);
    }

    @Override // com.google.protobuf.u0
    public void addVarint(v0 v0Var, int i, long j4) {
        v0Var.storeField(A0.makeTag(i, 0), Long.valueOf(j4));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.protobuf.u0
    public v0 getBuilderFromMessage(Object obj) {
        v0 fromMessage = getFromMessage(obj);
        if (fromMessage != v0.getDefaultInstance()) {
            return fromMessage;
        }
        v0 v0VarNewInstance = v0.newInstance();
        setToMessage(obj, v0VarNewInstance);
        return v0VarNewInstance;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.protobuf.u0
    public v0 getFromMessage(Object obj) {
        return ((AbstractC4042z) obj).unknownFields;
    }

    @Override // com.google.protobuf.u0
    public int getSerializedSize(v0 v0Var) {
        return v0Var.getSerializedSize();
    }

    @Override // com.google.protobuf.u0
    public int getSerializedSizeAsMessageSet(v0 v0Var) {
        return v0Var.getSerializedSizeAsMessageSet();
    }

    @Override // com.google.protobuf.u0
    public v0 merge(v0 v0Var, v0 v0Var2) {
        return v0.getDefaultInstance().equals(v0Var2) ? v0Var : v0.getDefaultInstance().equals(v0Var) ? v0.mutableCopyOf(v0Var, v0Var2) : v0Var.mergeFrom(v0Var2);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.protobuf.u0
    public v0 newBuilder() {
        return v0.newInstance();
    }

    @Override // com.google.protobuf.u0
    public void setBuilderToMessage(Object obj, v0 v0Var) {
        setToMessage(obj, v0Var);
    }

    @Override // com.google.protobuf.u0
    public void setToMessage(Object obj, v0 v0Var) {
        ((AbstractC4042z) obj).unknownFields = v0Var;
    }

    @Override // com.google.protobuf.u0
    public v0 toImmutable(v0 v0Var) {
        v0Var.makeImmutable();
        return v0Var;
    }

    @Override // com.google.protobuf.u0
    public void writeAsMessageSetTo(v0 v0Var, B0 b02) throws IOException {
        v0Var.writeAsMessageSetTo(b02);
    }

    @Override // com.google.protobuf.u0
    public void writeTo(v0 v0Var, B0 b02) throws IOException {
        v0Var.writeTo(b02);
    }
}
