package com.google.protobuf;

import com.google.protobuf.c;
import java.io.IOException;

/* loaded from: classes3.dex */
public interface q0 {
    boolean equals(Object obj, Object obj2);

    int getSerializedSize(Object obj);

    int hashCode(Object obj);

    boolean isInitialized(Object obj);

    void makeImmutable(Object obj);

    void mergeFrom(Object obj, p0 p0Var, ExtensionRegistryLite extensionRegistryLite) throws IOException;

    void mergeFrom(Object obj, Object obj2);

    void mergeFrom(Object obj, byte[] bArr, int i10, int i11, c.b bVar) throws IOException;

    Object newInstance();

    void writeTo(Object obj, Writer writer) throws IOException;
}
