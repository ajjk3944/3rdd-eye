package c0;

import i2.u1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class v extends i2.j implements u1 {

    /* renamed from: q, reason: collision with root package name */
    public r f2511q;

    /* renamed from: r, reason: collision with root package name */
    public float f2512r;

    /* renamed from: s, reason: collision with root package name */
    public p1.l0 f2513s;

    /* renamed from: t, reason: collision with root package name */
    public p1.j0 f2514t;

    /* renamed from: u, reason: collision with root package name */
    public final m1.b f2515u;

    public v(float f10, p1.l0 l0Var, p1.j0 j0Var) {
        this.f2512r = f10;
        this.f2513s = l0Var;
        this.f2514t = j0Var;
        b7.u uVar = new b7.u(2, this);
        m1.c cVar = new m1.c();
        cVar.f28859a = m1.h.f28864a;
        m1.b bVar = new m1.b(cVar, uVar);
        p0(bVar);
        this.f2515u = bVar;
    }

    @Override // i2.u1
    public final /* synthetic */ boolean Y() {
        return false;
    }

    @Override // i2.u1
    public final boolean b() {
        return false;
    }

    @Override // i1.m
    public final boolean c0() {
        return false;
    }

    @Override // i2.u1
    public final void l(p2.x xVar) {
        p2.v.b(xVar, this.f2514t);
    }

    @Override // i2.u1
    public final /* synthetic */ boolean v() {
        return false;
    }
}
