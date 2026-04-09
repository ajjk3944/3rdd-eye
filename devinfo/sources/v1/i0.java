package v1;

import u0.d1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class i0 extends u1.b {

    /* renamed from: d, reason: collision with root package name */
    public final d1 f35702d = u0.q.r(new o1.e(0));

    /* renamed from: e, reason: collision with root package name */
    public final d1 f35703e = u0.q.r(Boolean.FALSE);

    /* renamed from: f, reason: collision with root package name */
    public final d0 f35704f;
    public final d1 g;

    /* renamed from: h, reason: collision with root package name */
    public float f35705h;

    public i0(c cVar) {
        d0 d0Var = new d0(cVar);
        d0Var.f35647f = new b2.b(29, this);
        this.f35704f = d0Var;
        this.g = new d1(yj.u.f37649a, u0.e.f34769d);
        this.f35705h = 1.0f;
    }

    @Override // u1.b
    public final void a(float f10) {
        this.f35705h = f10;
    }

    @Override // u1.b
    public final long c() {
        return ((o1.e) this.f35702d.getValue()).f30377a;
    }

    @Override // u1.b
    public final void d(i2.g0 g0Var) {
        r1.b bVar = g0Var.f25668a;
        d0 d0Var = this.f35704f;
        p1.m mVar = (p1.m) d0Var.g.getValue();
        if (((Boolean) this.f35703e.getValue()).booleanValue() && g0Var.getLayoutDirection() == d3.l.f21967b) {
            long jE = bVar.e();
            i0.f fVar = bVar.f32718b;
            long jE2 = fVar.E();
            fVar.x().c();
            try {
                ((nm.d0) fVar.f25416b).u(-1.0f, 1.0f, jE);
                d0Var.e(g0Var, this.f35705h, mVar);
            } finally {
                fVar.x().k();
                fVar.R(jE2);
            }
        } else {
            d0Var.e(g0Var, this.f35705h, mVar);
        }
        this.g.getValue();
    }
}
