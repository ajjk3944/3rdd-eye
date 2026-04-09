package i2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class g0 implements r1.d {

    /* renamed from: a, reason: collision with root package name */
    public final r1.b f25668a = new r1.b();

    /* renamed from: b, reason: collision with root package name */
    public l f25669b;

    @Override // r1.d
    public final void A(p1.g gVar, long j, long j8, long j9, float f10, p1.m mVar, int i4) {
        this.f25668a.A(gVar, j, j8, j9, f10, mVar, i4);
    }

    @Override // d3.c
    public final float C(int i4) {
        return this.f25668a.C(i4);
    }

    @Override // d3.c
    public final float D(float f10) {
        return f10 / this.f25668a.a();
    }

    @Override // d3.c
    public final float F() {
        return this.f25668a.F();
    }

    @Override // d3.c
    public final float I(float f10) {
        return this.f25668a.a() * f10;
    }

    @Override // r1.d
    public final i0.f M() {
        return this.f25668a.f32718b;
    }

    @Override // d3.c
    public final int Q(float f10) {
        r1.b bVar = this.f25668a;
        bVar.getClass();
        return d.h.i(bVar, f10);
    }

    @Override // d3.c
    public final long T(long j) {
        r1.b bVar = this.f25668a;
        bVar.getClass();
        return d.h.m(j, bVar);
    }

    @Override // d3.c
    public final float W(long j) {
        r1.b bVar = this.f25668a;
        bVar.getClass();
        return d.h.l(j, bVar);
    }

    @Override // d3.c
    public final float a() {
        return this.f25668a.a();
    }

    public final void b() {
        r1.b bVar = this.f25668a;
        p1.q qVarX = bVar.f32718b.x();
        i iVar = this.f25669b;
        if (iVar == null) {
            throw d.h.o("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
        }
        i1.m mVar = (i1.m) iVar;
        i1.m mVarE = mVar.f25554a.f25559f;
        if (mVarE == null || (mVarE.f25557d & 4) == 0) {
            mVarE = null;
        } else {
            while (mVarE != null) {
                int i4 = mVarE.f25556c;
                if ((i4 & 2) != 0) {
                    break;
                } else if ((i4 & 4) != 0) {
                    break;
                } else {
                    mVarE = mVarE.f25559f;
                }
            }
            mVarE = null;
        }
        if (mVarE == null) {
            d1 d1VarQ = k.q(iVar, 4);
            if (d1VarQ.z0() == mVar.f25554a) {
                d1VarQ = d1VarQ.f25611p;
                nk.k.b(d1VarQ);
            }
            d1VarQ.O0(qVarX, (s1.b) bVar.f32718b.f25417c);
            return;
        }
        w0.e eVar = null;
        while (mVarE != null) {
            if (mVarE instanceof l) {
                l lVar = (l) mVarE;
                s1.b bVar2 = (s1.b) bVar.f32718b.f25417c;
                d1 d1VarQ2 = k.q(lVar, 4);
                long jF = me.t1.F(d1VarQ2.f24410c);
                e0 e0Var = d1VarQ2.f25610o;
                e0Var.getClass();
                ((j2.r) h0.a(e0Var)).getSharedDrawScope().d(qVarX, jF, d1VarQ2, lVar, bVar2);
            } else if ((mVarE.f25556c & 4) != 0 && (mVarE instanceof j)) {
                int i10 = 0;
                for (i1.m mVar2 = ((j) mVarE).f25691p; mVar2 != null; mVar2 = mVar2.f25559f) {
                    if ((mVar2.f25556c & 4) != 0) {
                        i10++;
                        if (i10 == 1) {
                            mVarE = mVar2;
                        } else {
                            if (eVar == null) {
                                eVar = new w0.e(new i1.m[16]);
                            }
                            if (mVarE != null) {
                                eVar.b(mVarE);
                                mVarE = null;
                            }
                            eVar.b(mVar2);
                        }
                    }
                }
                if (i10 == 1) {
                }
            }
            mVarE = k.e(eVar);
        }
    }

    @Override // r1.d
    public final long c() {
        return this.f25668a.f32718b.E();
    }

    public final void d(p1.q qVar, long j, d1 d1Var, l lVar, s1.b bVar) {
        l lVar2 = this.f25669b;
        this.f25669b = lVar;
        d3.l lVar3 = d1Var.f25610o.A;
        r1.b bVar2 = this.f25668a;
        i0.f fVar = bVar2.f32718b;
        r1.a aVar = ((r1.b) fVar.f25418d).f32717a;
        d3.c cVar = aVar.f32713a;
        d3.l lVar4 = aVar.f32714b;
        p1.q qVarX = fVar.x();
        i0.f fVar2 = bVar2.f32718b;
        long jE = fVar2.E();
        s1.b bVar3 = (s1.b) fVar2.f25417c;
        fVar2.P(d1Var);
        fVar2.Q(lVar3);
        fVar2.O(qVar);
        fVar2.R(j);
        fVar2.f25417c = bVar;
        qVar.c();
        try {
            lVar.J(this);
            qVar.k();
            fVar2.P(cVar);
            fVar2.Q(lVar4);
            fVar2.O(qVarX);
            fVar2.R(jE);
            fVar2.f25417c = bVar3;
            this.f25669b = lVar2;
        } catch (Throwable th2) {
            qVar.k();
            fVar2.P(cVar);
            fVar2.Q(lVar4);
            fVar2.O(qVarX);
            fVar2.R(jE);
            fVar2.f25417c = bVar3;
            throw th2;
        }
    }

    public final void e(p1.j jVar, long j, r1.c cVar) {
        r1.b bVar = this.f25668a;
        bVar.f32717a.f32715c.o(jVar, r1.b.b(bVar, j, cVar, 3));
    }

    @Override // r1.d
    public final d3.l getLayoutDirection() {
        return this.f25668a.f32717a.f32714b;
    }

    @Override // r1.d
    public final void k(long j, long j8, long j9, r1.c cVar, int i4) {
        this.f25668a.k(j, j8, j9, cVar, i4);
    }

    @Override // d3.c
    public final float o(long j) {
        r1.b bVar = this.f25668a;
        bVar.getClass();
        return d.h.k(j, bVar);
    }

    @Override // r1.d
    public final void s(p1.j jVar, p1.z zVar, float f10, r1.c cVar, int i4) {
        this.f25668a.s(jVar, zVar, f10, cVar, i4);
    }

    @Override // d3.c
    public final long x(float f10) {
        return this.f25668a.x(f10);
    }
}
