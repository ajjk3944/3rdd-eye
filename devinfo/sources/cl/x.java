package cl;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class x implements ck.g {

    /* renamed from: a, reason: collision with root package name */
    public final ThreadLocal f2947a;

    public x(ThreadLocal threadLocal) {
        this.f2947a = threadLocal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x) && nk.k.a(this.f2947a, ((x) obj).f2947a);
    }

    public final int hashCode() {
        return this.f2947a.hashCode();
    }

    public final String toString() {
        return "ThreadLocalKey(threadLocal=" + this.f2947a + ')';
    }
}
