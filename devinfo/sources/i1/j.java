package i1;

import d0.a1;
import j2.z0;
import me.t1;
import nk.x;
import nm.c0;
import nm.d0;
import nm.e0;
import nm.f0;
import nm.h0;
import nm.l0;
import nm.n0;
import nm.s;
import nm.w;
import u0.d1;
import xk.a0;
import yj.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class j extends nk.l implements mk.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25551a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f25552b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int i4, Object obj) {
        super(2);
        this.f25551a = i4;
        this.f25552b = obj;
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        long j;
        nm.b bVar;
        long jH;
        boolean zB;
        c0 c0VarC;
        ck.c cVar;
        switch (this.f25551a) {
            case 0:
                n nVar = (n) obj;
                n nVarV = (l) obj2;
                u0.p pVar = (u0.p) this.f25552b;
                if (nVarV instanceof h) {
                    mk.f fVar = ((h) nVarV).f25549a;
                    x.d(3, fVar);
                    nVarV = com.bumptech.glide.d.v((n) fVar.a(k.f25553a, pVar, 0), pVar);
                }
                return nVar.b(nVarV);
            case 1:
                u0.p pVar2 = (u0.p) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (pVar2.O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ((j2.a) this.f25552b).a(0, pVar2);
                } else {
                    pVar2.R();
                }
                return u.f37649a;
            case 2:
                ((Number) obj2).intValue();
                ((z0) this.f25552b).a(u0.q.z(1), (u0.p) obj);
                return u.f37649a;
            case 3:
                ((k1.e) this.f25552b).l(((Number) obj).intValue(), (p2.p) obj2);
                return u.f37649a;
            default:
                c2.p pVar3 = (c2.p) obj;
                long j8 = ((o1.b) obj2).f30364a;
                nk.k.e(pVar3, "change");
                pVar3.a();
                e0 e0Var = ((nm.o) this.f25552b).f30109a;
                gl.c cVar2 = e0Var.j;
                n0 n0Var = e0Var.f30019f;
                d0 d0Var = e0Var.f30014a;
                d1 d1Var = e0Var.f30024m;
                d1Var.setValue(new o1.b(o1.b.h(((o1.b) d1Var.getValue()).f30364a, j8)));
                c0 c0VarD = e0Var.d();
                if (c0VarD != null) {
                    long jH2 = e0Var.h(e0Var.e());
                    e0Var.i(jH2);
                    long jB = c0VarD.b();
                    long jH3 = o1.b.h(com.bumptech.glide.d.a((int) (jB >> 32), (int) (jB & 4294967295L)), jH2);
                    long jF = t1.F(c0VarD.c());
                    long jA = com.bumptech.glide.d.a(Float.intBitsToFloat((int) (jF >> 32)) + o1.b.d(jH3), Float.intBitsToFloat((int) (jF & 4294967295L)) + o1.b.e(jH3));
                    km.i iVarO = d0Var.o();
                    nm.a aVar = e0Var.f30018e;
                    nk.k.e(aVar, "padding");
                    a1 a1VarL = iVarO.l();
                    ((i0.p) iVarO.f28426b).getClass();
                    nk.k.e(a1VarL, "orientation");
                    int iOrdinal = a1VarL.ordinal();
                    if (iOrdinal == 0) {
                        j = 4294967295L;
                        bVar = new nm.b(aVar.f29996c, aVar.f29997d);
                    } else {
                        if (iOrdinal != 1) {
                            throw new ac.m();
                        }
                        j = 4294967295L;
                        bVar = new nm.b(aVar.f29994a, aVar.f29995b);
                    }
                    f0 f0VarN = iVarO.n(bVar);
                    float f10 = f0VarN.f30037a;
                    float f11 = f0VarN.f30038b;
                    ((i0.p) d0Var.o().f28426b).getClass();
                    boolean z3 = e0Var.f30020h == d3.l.f21967b && e0Var.f() == a1.f21663b;
                    if (z3) {
                        jH = o1.b.g(jA, e0Var.f30028q);
                    } else {
                        if (z3) {
                            throw new ac.m();
                        }
                        jH = o1.b.h(jH3, e0Var.f30028q);
                    }
                    long jO = wd.b.o(e0Var.f(), -((i0.p) d0Var.o().f28426b).f25473l);
                    long jH4 = o1.b.h(jH, com.bumptech.glide.d.a((int) (jO >> 32), (int) (jO & j)));
                    float fQ = wd.b.q(jH4, e0Var.f()) - f10;
                    if (fQ < 0.0f) {
                        fQ = 0.0f;
                    }
                    float fQ2 = f11 - wd.b.q(jH4, e0Var.f());
                    if (fQ2 < 0.0f) {
                        fQ2 = 0.0f;
                    }
                    float f12 = e0Var.f30017d;
                    ck.c cVar3 = null;
                    if (fQ < f12) {
                        zB = n0Var.b(h0.f30051a, (1 - ci.b.d((fQ + f12) / (f12 * 2), 0.0f, 1.0f)) * 10, new s(e0Var, 2), new w(e0Var, cVar3, 0));
                    } else if (fQ2 < f12) {
                        zB = n0Var.b(h0.f30052b, (1 - ci.b.d((fQ2 + f12) / (f12 * 2), 0.0f, 1.0f)) * 10, new s(e0Var, 3), new w(e0Var, cVar3, 1));
                    } else {
                        xk.x.v(n0Var.f30105b, null, null, new l0(n0Var, cVar3, 1), 3);
                        zB = false;
                    }
                    if (cVar2.f()) {
                        a0 a0Var = n0Var.f30107d;
                        if ((a0Var != null && a0Var.c()) || zB || (c0VarC = e0.c(e0Var, com.bumptech.glide.e.h(jH3, jA), d0Var.o().q(), null, new c2.l0(17, c0VarD), 4)) == null) {
                            cVar = null;
                        } else {
                            cVar = null;
                            xk.x.v(e0Var.f30015b, null, null, new nm.u(e0Var, c0VarD, c0VarC, cVar, 1), 3);
                        }
                        cVar2.e(cVar);
                    }
                }
                return u.f37649a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(z0 z0Var, int i4) {
        super(2);
        this.f25551a = 2;
        this.f25552b = z0Var;
    }
}
