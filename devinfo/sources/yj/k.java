package yj;

import java.io.Serializable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class k implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f37640a;

    public k(Throwable th2) {
        nk.k.e(th2, "exception");
        this.f37640a = th2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return nk.k.a(this.f37640a, ((k) obj).f37640a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f37640a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f37640a + ')';
    }
}
