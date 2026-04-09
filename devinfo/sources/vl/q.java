package vl;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final r f36377a;

    /* renamed from: b, reason: collision with root package name */
    public final r f36378b;

    /* renamed from: c, reason: collision with root package name */
    public final Throwable f36379c;

    public /* synthetic */ q(r rVar, Throwable th2, int i4) {
        this(rVar, (c) null, (i4 & 4) != 0 ? null : th2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return nk.k.a(this.f36377a, qVar.f36377a) && nk.k.a(this.f36378b, qVar.f36378b) && nk.k.a(this.f36379c, qVar.f36379c);
    }

    public final int hashCode() {
        int iHashCode = this.f36377a.hashCode() * 31;
        r rVar = this.f36378b;
        int iHashCode2 = (iHashCode + (rVar == null ? 0 : rVar.hashCode())) * 31;
        Throwable th2 = this.f36379c;
        return iHashCode2 + (th2 != null ? th2.hashCode() : 0);
    }

    public final String toString() {
        return "ConnectResult(plan=" + this.f36377a + ", nextPlan=" + this.f36378b + ", throwable=" + this.f36379c + ')';
    }

    public q(r rVar, c cVar, Throwable th2) {
        this.f36377a = rVar;
        this.f36378b = cVar;
        this.f36379c = th2;
    }
}
