package c0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d0 extends i1.m implements i2.l {

    /* renamed from: o, reason: collision with root package name */
    public final e0.i f2385o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2386p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2387q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2388r;

    public d0(e0.i iVar) {
        this.f2385o = iVar;
    }

    @Override // i2.l
    public final void J(i2.g0 g0Var) {
        g0Var.b();
        r1.b bVar = g0Var.f25668a;
        if (this.f2386p) {
            je.u.g(g0Var, p1.s.b(p1.s.f31013b, 0.3f), bVar.f32718b.E(), 122);
        } else if (this.f2387q || this.f2388r) {
            je.u.g(g0Var, p1.s.b(p1.s.f31013b, 0.1f), bVar.f32718b.E(), 122);
        }
    }

    @Override // i1.m
    public final void f0() {
        xk.x.v(b0(), null, null, new al.k(this, null, 2), 3);
    }

    @Override // i2.l
    public final /* synthetic */ void z() {
    }
}
