package k2;

import h7.w1;
import i.g0;

/* loaded from: classes.dex */
public final class i implements g {

    /* renamed from: a, reason: collision with root package name */
    public final ic.b f13984a;

    /* renamed from: b, reason: collision with root package name */
    public final a f13985b;

    /* renamed from: c, reason: collision with root package name */
    public final io.sentry.t f13986c;

    /* renamed from: d, reason: collision with root package name */
    public final m f13987d;

    /* renamed from: e, reason: collision with root package name */
    public final g0 f13988e;

    /* renamed from: f, reason: collision with root package name */
    public final cg.j f13989f;

    public i(ic.b bVar, a aVar) {
        io.sentry.t tVar = j.f13990a;
        m mVar = new m(j.f13991b);
        g0 g0Var = new g0(12);
        this.f13984a = bVar;
        this.f13985b = aVar;
        this.f13986c = tVar;
        this.f13987d = mVar;
        this.f13988e = g0Var;
        this.f13989f = new cg.j(4, this);
    }

    public final d0 a(a0 a0Var) {
        io.sentry.t tVar = this.f13986c;
        c0.s sVar = new c0.s(this, 2, a0Var);
        synchronized (((df.c) tVar.f12736a)) {
            d0 d0Var = (d0) ((w1) tVar.f12737d).h(a0Var);
            if (d0Var != null) {
                if (d0Var.g()) {
                    return d0Var;
                }
            }
            try {
                d0 d0Var2 = (d0) sVar.a(new c0.s(tVar, 3, a0Var));
                synchronized (((df.c) tVar.f12736a)) {
                    if (((w1) tVar.f12737d).h(a0Var) == null && d0Var2.g()) {
                        ((w1) tVar.f12737d).l(a0Var, d0Var2);
                    }
                }
                return d0Var2;
            } catch (Exception e4) {
                throw new IllegalStateException("Could not load font", e4);
            }
        }
    }

    public final d0 b(h hVar, r rVar, int i10, int i11) {
        a aVar = this.f13985b;
        aVar.getClass();
        int i12 = aVar.f13968a;
        r rVar2 = (i12 == 0 || i12 == Integer.MAX_VALUE) ? rVar : new r(vc.e.h(rVar.f14004a + i12, 1, 1000));
        this.f13984a.getClass();
        return a(new a0(hVar, rVar2, i10, i11, null));
    }
}
