package r0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class m0 {

    /* renamed from: a, reason: collision with root package name */
    public static final u0.a0 f32598a = new u0.a0(new i0(0));

    public static final i1.n a(i1.n nVar, p1.j0 j0Var, long j, c0.x xVar, float f10) {
        i1.n nVarM;
        i1.n wVar = i1.k.f25553a;
        if (f10 > 0.0f) {
            long j8 = p1.m0.f31006a;
            long j9 = p1.a0.f30947a;
            nVarM = p1.z.m(wVar, 1.0f, 1.0f, f10, j8, j0Var, false, j9, j9);
        } else {
            nVarM = wVar;
        }
        i1.n nVarB = nVar.b(nVarM);
        if (xVar != null) {
            wVar = new c0.w(xVar.f2522a, xVar.f2523b, j0Var);
        }
        return p1.z.n(c0.o.c(nVarB.b(wVar), j, j0Var), j0Var, 518143);
    }

    public static final long b(long j, float f10, u0.p pVar) {
        l lVar = (l) pVar.j(m.f32596a);
        boolean zBooleanValue = ((Boolean) pVar.j(m.f32597b)).booleanValue();
        long j8 = lVar.f32577p;
        if (!p1.s.c(j, j8) || !zBooleanValue) {
            return j;
        }
        if (d3.f.b(f10, 0)) {
            return j8;
        }
        return p1.z.h(p1.s.b(lVar.f32581t, ((((float) Math.log(f10 + 1)) * 4.5f) + 2.0f) / 100.0f), j8);
    }
}
