package g0;

import g2.r0;
import g2.s0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final x.e0 f24117a = b(true);

    /* renamed from: b, reason: collision with root package name */
    public static final x.e0 f24118b = b(false);

    public static final void a(r0 r0Var, s0 s0Var, g2.i0 i0Var, d3.l lVar, int i4, int i10, i1.e eVar) {
        i1.e eVar2;
        Object objW = i0Var.w();
        g gVar = objW instanceof g ? (g) objW : null;
        r0.h(r0Var, s0Var, ((gVar == null || (eVar2 = gVar.f24114o) == null) ? eVar : eVar2).a((s0Var.f24408a << 32) | (s0Var.f24409b & 4294967295L), (i4 << 32) | (i10 & 4294967295L), lVar));
    }

    public static final x.e0 b(boolean z3) {
        x.e0 e0Var = new x.e0(9);
        i1.e eVar = i1.b.f25531a;
        e0Var.m(eVar, new k(eVar, z3));
        i1.e eVar2 = i1.b.f25532b;
        e0Var.m(eVar2, new k(eVar2, z3));
        i1.e eVar3 = i1.b.f25533c;
        e0Var.m(eVar3, new k(eVar3, z3));
        i1.e eVar4 = i1.b.f25534d;
        e0Var.m(eVar4, new k(eVar4, z3));
        i1.e eVar5 = i1.b.f25535e;
        e0Var.m(eVar5, new k(eVar5, z3));
        i1.e eVar6 = i1.b.f25536f;
        e0Var.m(eVar6, new k(eVar6, z3));
        i1.e eVar7 = i1.b.g;
        e0Var.m(eVar7, new k(eVar7, z3));
        i1.e eVar8 = i1.b.f25537h;
        e0Var.m(eVar8, new k(eVar8, z3));
        i1.e eVar9 = i1.b.f25538i;
        e0Var.m(eVar9, new k(eVar9, z3));
        return e0Var;
    }

    public static final g2.j0 c(i1.e eVar, boolean z3) {
        g2.j0 j0Var = (g2.j0) (z3 ? f24117a : f24118b).g(eVar);
        return j0Var == null ? new k(eVar, z3) : j0Var;
    }
}
