package androidx.lifecycle;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f1106a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f1107b;

    public c(int i4, Method method) throws SecurityException {
        this.f1106a = i4;
        this.f1107b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f1106a == cVar.f1106a && this.f1107b.getName().equals(cVar.f1107b.getName());
    }

    public final int hashCode() {
        return this.f1107b.getName().hashCode() + (this.f1106a * 31);
    }
}
