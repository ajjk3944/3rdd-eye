package androidx.lifecycle;

import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f1475a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f1476b;

    public b(int i10, Method method) throws SecurityException {
        this.f1475a = i10;
        this.f1476b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f1475a == bVar.f1475a && this.f1476b.getName().equals(bVar.f1476b.getName());
    }

    public final int hashCode() {
        return this.f1476b.getName().hashCode() + (this.f1475a * 31);
    }
}
