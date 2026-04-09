package com.google.protobuf;

import com.google.protobuf.C4022e;
import java.io.IOException;

/* compiled from: Schema.java */
/* loaded from: classes2.dex */
public interface n0<T> {
    boolean equals(T t10, T t11);

    int getSerializedSize(T t10);

    int hashCode(T t10);

    boolean isInitialized(T t10);

    void makeImmutable(T t10);

    void mergeFrom(T t10, l0 l0Var, C4034q c4034q) throws IOException;

    void mergeFrom(T t10, T t11);

    void mergeFrom(T t10, byte[] bArr, int i, int i10, C4022e.b bVar) throws IOException;

    T newInstance();

    void writeTo(T t10, B0 b02) throws IOException;
}
