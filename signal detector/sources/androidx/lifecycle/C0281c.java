package androidx.lifecycle;

import java.lang.reflect.Method;

/* renamed from: androidx.lifecycle.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0281c {

    /* renamed from: a, reason: collision with root package name */
    public final int f5236a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f5237b;

    public C0281c(int i, Method method) throws SecurityException {
        this.f5236a = i;
        this.f5237b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0281c)) {
            return false;
        }
        C0281c c0281c = (C0281c) obj;
        return this.f5236a == c0281c.f5236a && this.f5237b.getName().equals(c0281c.f5237b.getName());
    }

    public final int hashCode() {
        return this.f5237b.getName().hashCode() + (this.f5236a * 31);
    }
}
