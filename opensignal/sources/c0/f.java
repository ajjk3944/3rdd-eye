package c0;

import com.google.android.gms.internal.measurement.y3;
import n0.f1;
import n0.k1;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final u.a0 f3071a = c(true);

    /* renamed from: b, reason: collision with root package name */
    public static final u.a0 f3072b = c(false);

    /* renamed from: c, reason: collision with root package name */
    public static final e f3073c = e.f3068b;

    public static final void a(z0.m mVar, n0.p pVar, int i10) {
        pVar.T(-211209833);
        int i11 = (pVar.e(mVar) ? 4 : 2) | i10;
        if (pVar.K(i11 & 1, (i11 & 3) != 2)) {
            int iHashCode = Long.hashCode(pVar.S);
            z0.m mVarF = y3.F(pVar, mVar);
            f1 f1VarK = pVar.k();
            x1.g.f24833a.getClass();
            x1.y yVar = x1.f.f24793b;
            pVar.U();
            if (pVar.R) {
                pVar.j(yVar);
            } else {
                pVar.e0();
            }
            n0.w.k(x1.f.f24796e, f3073c, pVar);
            n0.w.k(x1.f.f24795d, f1VarK, pVar);
            n0.w.k(x1.f.f24794c, mVarF, pVar);
            x1.e eVar = x1.f.f24797f;
            if (pVar.R || !br.l.a(pVar.I(), Integer.valueOf(iHashCode))) {
                w.g.m(iHashCode, pVar, iHashCode, eVar);
            }
            pVar.o(true);
        } else {
            pVar.N();
        }
        k1 k1VarQ = pVar.q();
        if (k1VarQ != null) {
            k1VarQ.f17207d = new au.v(mVar, i10);
        }
    }

    public static final void b(v1.u uVar, v1.v vVar, v1.q qVar, t2.i iVar, int i10, int i11, z0.e eVar) {
        qVar.t();
        v1.u.f(uVar, vVar, eVar.a((vVar.f23809b << 32) | (vVar.f23810c & 4294967295L), (i10 << 32) | (i11 & 4294967295L), iVar));
    }

    public static final u.a0 c(boolean z10) {
        u.a0 a0Var = new u.a0(9);
        z0.e eVar = z0.b.f26480a;
        a0Var.l(eVar, new i(eVar, z10));
        z0.e eVar2 = z0.b.f26481d;
        a0Var.l(eVar2, new i(eVar2, z10));
        z0.e eVar3 = z0.b.f26482g;
        a0Var.l(eVar3, new i(eVar3, z10));
        z0.e eVar4 = z0.b.f26483r;
        a0Var.l(eVar4, new i(eVar4, z10));
        z0.e eVar5 = z0.b.f26484x;
        a0Var.l(eVar5, new i(eVar5, z10));
        z0.e eVar6 = z0.b.f26485y;
        a0Var.l(eVar6, new i(eVar6, z10));
        z0.e eVar7 = z0.b.B;
        a0Var.l(eVar7, new i(eVar7, z10));
        z0.e eVar8 = z0.b.D;
        a0Var.l(eVar8, new i(eVar8, z10));
        z0.e eVar9 = z0.b.E;
        a0Var.l(eVar9, new i(eVar9, z10));
        return a0Var;
    }

    public static final v1.r d(z0.e eVar, boolean z10) {
        v1.r rVar = (v1.r) (z10 ? f3071a : f3072b).g(eVar);
        return rVar == null ? new i(eVar, z10) : rVar;
    }
}
