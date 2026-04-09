package zk;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class m extends n {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f38366a;

    public m(Throwable th2) {
        this.f38366a = th2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            return nk.k.a(this.f38366a, ((m) obj).f38366a);
        }
        return false;
    }

    public final int hashCode() {
        Throwable th2 = this.f38366a;
        if (th2 != null) {
            return th2.hashCode();
        }
        return 0;
    }

    @Override // zk.n
    public final String toString() {
        return "Closed(" + this.f38366a + ')';
    }
}
