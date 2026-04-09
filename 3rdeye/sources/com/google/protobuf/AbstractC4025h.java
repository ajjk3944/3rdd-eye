package com.google.protobuf;

import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: ByteOutput.java */
/* renamed from: com.google.protobuf.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4025h {
    public abstract void write(byte b10) throws IOException;

    public abstract void write(ByteBuffer byteBuffer) throws IOException;

    public abstract void write(byte[] bArr, int i, int i10) throws IOException;

    public abstract void writeLazy(ByteBuffer byteBuffer) throws IOException;

    public abstract void writeLazy(byte[] bArr, int i, int i10) throws IOException;
}
