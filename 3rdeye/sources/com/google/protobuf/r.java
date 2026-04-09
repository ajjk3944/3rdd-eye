package com.google.protobuf;

import com.google.protobuf.C4038v;
import com.google.protobuf.C4038v.c;
import java.io.IOException;
import java.util.Map;

/* compiled from: ExtensionSchema.java */
/* loaded from: classes2.dex */
public abstract class r<T extends C4038v.c<T>> {
    public abstract int extensionNumber(Map.Entry<?, ?> entry);

    public abstract Object findExtensionByNumber(C4034q c4034q, U u8, int i);

    public abstract C4038v<T> getExtensions(Object obj);

    public abstract C4038v<T> getMutableExtensions(Object obj);

    public abstract boolean hasExtensions(U u8);

    public abstract void makeImmutable(Object obj);

    public abstract <UT, UB> UB parseExtension(Object obj, l0 l0Var, Object obj2, C4034q c4034q, C4038v<T> c4038v, UB ub, u0<UT, UB> u0Var) throws IOException;

    public abstract void parseLengthPrefixedMessageSetItem(l0 l0Var, Object obj, C4034q c4034q, C4038v<T> c4038v) throws IOException;

    public abstract void parseMessageSetItem(AbstractC4026i abstractC4026i, Object obj, C4034q c4034q, C4038v<T> c4038v) throws IOException;

    public abstract void serializeExtension(B0 b02, Map.Entry<?, ?> entry) throws IOException;

    public abstract void setExtensions(Object obj, C4038v<T> c4038v);
}
