package com.vungle.ads.internal.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.util.List;

/* compiled from: SafeObjectInputStream.kt */
/* loaded from: classes2.dex */
public final class o extends ObjectInputStream {
    private final List<Class<?>> allowed;

    /* JADX WARN: Multi-variable type inference failed */
    public o(InputStream inputStream, List<? extends Class<?>> list) {
        super(inputStream);
        this.allowed = list;
    }

    @Override // java.io.ObjectInputStream
    public Class<?> resolveClass(ObjectStreamClass desc) throws ClassNotFoundException, IOException {
        kotlin.jvm.internal.l.f(desc, "desc");
        Class<?> c10 = super.resolveClass(desc);
        if (this.allowed == null || Number.class.isAssignableFrom(c10) || String.class.equals(c10) || Boolean.class.equals(c10) || c10.isArray() || this.allowed.contains(c10)) {
            kotlin.jvm.internal.l.e(c10, "c");
            return c10;
        }
        throw new IOException("Deserialization is not allowed for " + desc.getName());
    }
}
