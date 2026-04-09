package x1;

/* loaded from: classes.dex */
public final class h0 implements i1.d {

    /* renamed from: b, reason: collision with root package name */
    public final i1.b f24844b = new i1.b();

    /* renamed from: c, reason: collision with root package name */
    public m f24845c;

    @Override // i1.d
    public final bm.d A() {
        return this.f24844b.f11141c;
    }

    @Override // i1.d
    public final long C() {
        return this.f24844b.C();
    }

    @Override // t2.c
    public final int G(float f10) {
        return this.f24844b.G(f10);
    }

    @Override // i1.d
    public final long H() {
        return this.f24844b.H();
    }

    @Override // t2.c
    public final long J(long j) {
        return this.f24844b.J(j);
    }

    @Override // t2.c
    public final float L(long j) {
        return this.f24844b.L(j);
    }

    public final void a() {
        i1.b bVar = this.f24844b;
        g1.p pVarY = bVar.f11141c.y();
        i iVar = this.f24845c;
        if (iVar == null) {
            throw c7.a.h("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
        }
        z0.l lVar = (z0.l) iVar;
        z0.l lVarE = lVar.f26495b.f26500g;
        if (lVarE == null || (lVarE.f26498e & 4) == 0) {
            lVarE = null;
        } else {
            while (lVarE != null) {
                int i10 = lVarE.f26497d;
                if ((i10 & 2) != 0) {
                    break;
                } else if ((i10 & 4) != 0) {
                    break;
                } else {
                    lVarE = lVarE.f26500g;
                }
            }
            lVarE = null;
        }
        if (lVarE == null) {
            f1 f1VarQ = k.q(iVar, 4);
            if (f1VarQ.v0() == lVar.f26495b) {
                f1VarQ = f1VarQ.f24822p;
                br.l.b(f1VarQ);
            }
            f1VarQ.L0(pVarY, (j1.c) bVar.f11141c.f2827g);
            return;
        }
        p0.e eVar = null;
        while (lVarE != null) {
            if (lVarE instanceof m) {
                m mVar = (m) lVarE;
                j1.c cVar = (j1.c) bVar.f11141c.f2827g;
                f1 f1VarQ2 = k.q(mVar, 4);
                long jV = kc.f.V(f1VarQ2.f23811d);
                f0 f0Var = f1VarQ2.f24821o;
                f0Var.getClass();
                k.t(f0Var).getSharedDrawScope().b(pVarY, jV, f1VarQ2, mVar, cVar);
            } else if ((lVarE.f26497d & 4) != 0 && (lVarE instanceof j)) {
                int i11 = 0;
                for (z0.l lVar2 = ((j) lVarE).f24863q; lVar2 != null; lVar2 = lVar2.f26500g) {
                    if ((lVar2.f26497d & 4) != 0) {
                        i11++;
                        if (i11 == 1) {
                            lVarE = lVar2;
                        } else {
                            if (eVar == null) {
                                eVar = new p0.e(new z0.l[16]);
                            }
                            if (lVarE != null) {
                                eVar.b(lVarE);
                                lVarE = null;
                            }
                            eVar.b(lVar2);
                        }
                    }
                }
                if (i11 == 1) {
                }
            }
            lVarE = k.e(eVar);
        }
    }

    public final void b(g1.p pVar, long j, f1 f1Var, m mVar, j1.c cVar) {
        m mVar2 = this.f24845c;
        this.f24845c = mVar;
        t2.i iVar = f1Var.f24821o.f24818x;
        i1.b bVar = this.f24844b;
        bm.d dVar = bVar.f11141c;
        i1.a aVar = ((i1.b) dVar.f2828r).f11140b;
        t2.c cVar2 = aVar.f11136a;
        t2.i iVar2 = aVar.f11137b;
        g1.p pVarY = dVar.y();
        bm.d dVar2 = bVar.f11141c;
        long jH = dVar2.H();
        j1.c cVar3 = (j1.c) dVar2.f2827g;
        dVar2.P(f1Var);
        dVar2.Q(iVar);
        dVar2.O(pVar);
        dVar2.R(j);
        dVar2.f2827g = cVar;
        pVar.g();
        try {
            mVar.d(this);
            pVar.n();
            dVar2.P(cVar2);
            dVar2.Q(iVar2);
            dVar2.O(pVarY);
            dVar2.R(jH);
            dVar2.f2827g = cVar3;
            this.f24845c = mVar2;
        } catch (Throwable th2) {
            pVar.n();
            dVar2.P(cVar2);
            dVar2.Q(iVar2);
            dVar2.O(pVarY);
            dVar2.R(jH);
            dVar2.f2827g = cVar3;
            throw th2;
        }
    }

    public final void c(g1.i iVar, long j, i1.c cVar) {
        i1.b bVar = this.f24844b;
        bVar.f11140b.f11138c.d(iVar, i1.b.a(bVar, j, cVar, 1.0f, 3));
    }

    @Override // t2.c
    public final float getDensity() {
        return this.f24844b.getDensity();
    }

    @Override // i1.d
    public final t2.i getLayoutDirection() {
        return this.f24844b.f11140b.f11137b;
    }

    @Override // t2.c
    public final long i(float f10) {
        return this.f24844b.i(f10);
    }

    @Override // i1.d
    public final void k(g1.i iVar, g1.f0 f0Var, float f10, i1.c cVar, int i10) {
        this.f24844b.k(iVar, f0Var, f10, cVar, i10);
    }

    @Override // t2.c
    public final float l(long j) {
        return this.f24844b.l(j);
    }

    @Override // i1.d
    public final void m(long j, long j7, long j10, float f10, i1.c cVar, int i10) {
        this.f24844b.m(j, j7, j10, f10, cVar, i10);
    }

    @Override // i1.d
    public final void p(g1.g gVar, long j, long j7, long j10, float f10, g1.m mVar, int i10) {
        this.f24844b.p(gVar, j, j7, j10, f10, mVar, i10);
    }

    @Override // t2.c
    public final long r(float f10) {
        return this.f24844b.r(f10);
    }

    @Override // t2.c
    public final float v(float f10) {
        return f10 / this.f24844b.getDensity();
    }

    @Override // t2.c
    public final float y() {
        return this.f24844b.y();
    }

    @Override // t2.c
    public final float z(float f10) {
        return this.f24844b.getDensity() * f10;
    }
}
