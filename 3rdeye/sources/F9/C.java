package F9;

import f9.InterfaceC4350h;

/* compiled from: ThreadContext.kt */
/* loaded from: classes3.dex */
public final class C implements InterfaceC4350h.b<B<?>> {

    /* renamed from: b, reason: collision with root package name */
    public final ThreadLocal<?> f1737b;

    public C(ThreadLocal<?> threadLocal) {
        this.f1737b = threadLocal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C) && kotlin.jvm.internal.l.b(this.f1737b, ((C) obj).f1737b);
    }

    public final int hashCode() {
        return this.f1737b.hashCode();
    }

    public final String toString() {
        return "ThreadLocalKey(threadLocal=" + this.f1737b + ')';
    }
}
