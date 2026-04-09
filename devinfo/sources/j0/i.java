package j0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class i extends i2.v0 {

    /* renamed from: a, reason: collision with root package name */
    public final a0.l0 f26908a;

    /* renamed from: b, reason: collision with root package name */
    public final a0.l0 f26909b;

    /* renamed from: c, reason: collision with root package name */
    public final a0.l0 f26910c;

    public i(a0.l0 l0Var, a0.l0 l0Var2, a0.l0 l0Var3) {
        this.f26908a = l0Var;
        this.f26909b = l0Var2;
        this.f26910c = l0Var3;
    }

    @Override // i2.v0
    public final i1.m d() {
        j jVar = new j();
        jVar.f26916o = this.f26908a;
        jVar.f26917p = this.f26909b;
        jVar.f26918q = this.f26910c;
        return jVar;
    }

    @Override // i2.v0
    public final void e(i1.m mVar) {
        j jVar = (j) mVar;
        jVar.f26916o = this.f26908a;
        jVar.f26917p = this.f26909b;
        jVar.f26918q = this.f26910c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f26908a.equals(iVar.f26908a) && this.f26909b.equals(iVar.f26909b) && this.f26910c.equals(iVar.f26910c);
    }

    public final int hashCode() {
        return this.f26910c.hashCode() + ((this.f26909b.hashCode() + (this.f26908a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "LazyLayoutAnimateItemElement(fadeInSpec=" + this.f26908a + ", placementSpec=" + this.f26909b + ", fadeOutSpec=" + this.f26910c + ')';
    }
}
