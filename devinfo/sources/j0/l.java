package j0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
final class l extends i2.v0 {

    /* renamed from: a, reason: collision with root package name */
    public final i0.e f26922a;

    /* renamed from: b, reason: collision with root package name */
    public final jf.c f26923b;

    /* renamed from: c, reason: collision with root package name */
    public final d0.a1 f26924c;

    public l(i0.e eVar, jf.c cVar, d0.a1 a1Var) {
        this.f26922a = eVar;
        this.f26923b = cVar;
        this.f26924c = a1Var;
    }

    @Override // i2.v0
    public final i1.m d() {
        p pVar = new p();
        pVar.f26939o = this.f26922a;
        pVar.f26940p = this.f26923b;
        pVar.f26941q = this.f26924c;
        return pVar;
    }

    @Override // i2.v0
    public final void e(i1.m mVar) {
        p pVar = (p) mVar;
        pVar.f26939o = this.f26922a;
        pVar.f26940p = this.f26923b;
        pVar.f26941q = this.f26924c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return nk.k.a(this.f26922a, lVar.f26922a) && nk.k.a(this.f26923b, lVar.f26923b) && this.f26924c == lVar.f26924c;
    }

    public final int hashCode() {
        return this.f26924c.hashCode() + ((((this.f26923b.hashCode() + (this.f26922a.hashCode() * 31)) * 31) + 1237) * 31);
    }
}
