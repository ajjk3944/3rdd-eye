package com.vungle.ads.internal.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class s extends ObjectInputStream {

    @Nullable
    private final List<Class<?>> allowed;

    /* JADX WARN: Multi-variable type inference failed */
    public s(@Nullable InputStream inputStream, @Nullable List<? extends Class<?>> list) {
        super(inputStream);
        this.allowed = list;
    }

    @Override // java.io.ObjectInputStream
    @NotNull
    public Class<?> resolveClass(@NotNull ObjectStreamClass desc) throws ClassNotFoundException, IOException {
        kotlin.jvm.internal.p.e(desc, "desc");
        Class<?> c10 = super.resolveClass(desc);
        if (this.allowed == null || Number.class.isAssignableFrom(c10) || kotlin.jvm.internal.p.a(String.class, c10) || kotlin.jvm.internal.p.a(Boolean.class, c10) || c10.isArray() || this.allowed.contains(c10)) {
            kotlin.jvm.internal.p.d(c10, "c");
            return c10;
        }
        throw new IOException("Deserialization is not allowed for " + desc.getName());
    }
}
