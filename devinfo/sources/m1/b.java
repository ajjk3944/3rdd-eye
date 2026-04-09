package m1;

import b7.u;
import i1.m;
import i2.g0;
import i2.h1;
import i2.k;
import i2.l;
import me.t1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b extends m implements h1, a, l {

    /* renamed from: o, reason: collision with root package name */
    public final c f28856o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f28857p;

    /* renamed from: q, reason: collision with root package name */
    public final u f28858q;

    public b(c cVar, u uVar) {
        this.f28856o = cVar;
        this.f28858q = uVar;
        cVar.f28859a = this;
    }

    @Override // i2.l
    public final void J(g0 g0Var) {
        boolean z3 = this.f28857p;
        c cVar = this.f28856o;
        if (!z3) {
            cVar.f28860b = null;
            k.p(this, new c2.c(11, this, cVar));
            if (cVar.f28860b == null) {
                throw d.h.o("DrawResult not defined, did you forget to call onDraw?");
            }
            this.f28857p = true;
        }
        g gVar = cVar.f28860b;
        nk.k.b(gVar);
        gVar.f28863a.invoke(g0Var);
    }

    @Override // i2.h1
    public final void P() {
        p0();
    }

    @Override // m1.a
    public final d3.c a() {
        return k.s(this).f25650z;
    }

    @Override // m1.a
    public final long c() {
        return t1.F(k.q(this, 4).f24410c);
    }

    @Override // i1.m
    public final void g0() {
        p0();
    }

    @Override // m1.a
    public final d3.l getLayoutDirection() {
        return k.s(this).A;
    }

    @Override // i1.m
    public final void i0() {
        p0();
    }

    @Override // i1.m
    public final void j0() {
        p0();
    }

    public final void p0() {
        this.f28857p = false;
        this.f28856o.f28860b = null;
        k.j(this);
    }

    @Override // i2.l
    public final void z() {
        p0();
    }

    @Override // i1.m
    public final void h0() {
    }
}
