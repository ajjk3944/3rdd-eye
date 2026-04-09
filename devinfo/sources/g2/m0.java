package g2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
final class m0 extends i2.v0 {

    /* renamed from: a, reason: collision with root package name */
    public final mk.c f24381a;

    public m0(mk.c cVar) {
        this.f24381a = cVar;
    }

    @Override // i2.v0
    public final i1.m d() {
        o0 o0Var = new o0();
        o0Var.f24392o = this.f24381a;
        return o0Var;
    }

    @Override // i2.v0
    public final void e(i1.m mVar) {
        ((o0) mVar).f24392o = this.f24381a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m0) {
            return this.f24381a == ((m0) obj).f24381a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f24381a.hashCode();
    }
}
