package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: MessageLite.java */
/* loaded from: classes2.dex */
public interface U extends V {

    /* compiled from: MessageLite.java */
    public interface a extends V, Cloneable {
        U build();

        U buildPartial();

        a clear();

        /* renamed from: clone */
        a mo12clone();

        @Override // com.google.protobuf.V
        /* synthetic */ U getDefaultInstanceForType();

        @Override // com.google.protobuf.V
        /* synthetic */ boolean isInitialized();

        boolean mergeDelimitedFrom(InputStream inputStream) throws IOException;

        boolean mergeDelimitedFrom(InputStream inputStream, C4034q c4034q) throws IOException;

        a mergeFrom(U u8);

        a mergeFrom(AbstractC4026i abstractC4026i) throws C;

        a mergeFrom(AbstractC4026i abstractC4026i, C4034q c4034q) throws C;

        a mergeFrom(AbstractC4027j abstractC4027j) throws IOException;

        a mergeFrom(AbstractC4027j abstractC4027j, C4034q c4034q) throws IOException;

        a mergeFrom(InputStream inputStream) throws IOException;

        a mergeFrom(InputStream inputStream, C4034q c4034q) throws IOException;

        a mergeFrom(byte[] bArr) throws C;

        a mergeFrom(byte[] bArr, int i, int i10) throws C;

        a mergeFrom(byte[] bArr, int i, int i10, C4034q c4034q) throws C;

        a mergeFrom(byte[] bArr, C4034q c4034q) throws C;
    }

    @Override // com.google.protobuf.V
    /* synthetic */ U getDefaultInstanceForType();

    e0<? extends U> getParserForType();

    int getSerializedSize();

    @Override // com.google.protobuf.V
    /* synthetic */ boolean isInitialized();

    a newBuilderForType();

    a toBuilder();

    byte[] toByteArray();

    AbstractC4026i toByteString();

    void writeDelimitedTo(OutputStream outputStream) throws IOException;

    void writeTo(AbstractC4029l abstractC4029l) throws IOException;

    void writeTo(OutputStream outputStream) throws IOException;
}
