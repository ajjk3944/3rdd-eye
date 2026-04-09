package tg;

import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class d0 implements ku.z {

    /* renamed from: a, reason: collision with root package name */
    public static final d0 f22759a;
    private static final iu.e descriptor;

    static {
        d0 d0Var = new d0();
        f22759a = d0Var;
        ku.r0 r0Var = new ku.r0("com.google.firebase.sessions.SessionData", d0Var, 3);
        r0Var.b("sessionDetails", false);
        r0Var.b("backgroundTime", true);
        r0Var.b("processDataMap", true);
        descriptor = r0Var;
    }

    @Override // ku.z
    public final gu.a[] childSerializers() {
        return new gu.a[]{h0.f22791a, xu.d.F(b1.f22740a), xu.d.F(f0.f22773d[2])};
    }

    @Override // gu.a
    public final Object deserialize(ju.c cVar) {
        iu.e eVar = descriptor;
        ju.a aVarB = cVar.b(eVar);
        gu.a[] aVarArr = f0.f22773d;
        j0 j0Var = null;
        boolean z10 = true;
        int i10 = 0;
        d1 d1Var = null;
        Map map = null;
        while (z10) {
            int iT = aVarB.t(eVar);
            if (iT == -1) {
                z10 = false;
            } else if (iT == 0) {
                j0Var = (j0) aVarB.m(eVar, 0, h0.f22791a, j0Var);
                i10 |= 1;
            } else if (iT == 1) {
                d1Var = (d1) aVarB.y(eVar, 1, b1.f22740a, d1Var);
                i10 |= 2;
            } else {
                if (iT != 2) {
                    throw new gu.f(iT);
                }
                map = (Map) aVarB.y(eVar, 2, aVarArr[2], map);
                i10 |= 4;
            }
        }
        aVarB.c(eVar);
        return new f0(i10, j0Var, d1Var, map);
    }

    @Override // gu.a
    public final iu.e getDescriptor() {
        return descriptor;
    }

    @Override // gu.a
    public final void serialize(ju.d dVar, Object obj) {
        f0 f0Var = (f0) obj;
        br.l.e(f0Var, "value");
        iu.e eVar = descriptor;
        ju.b bVarB = dVar.b(eVar);
        gu.a[] aVarArr = f0.f22773d;
        h0 h0Var = h0.f22791a;
        j0 j0Var = f0Var.f22774a;
        Map map = f0Var.f22776c;
        d1 d1Var = f0Var.f22775b;
        mu.y yVar = (mu.y) bVarB;
        yVar.w(eVar, 0, h0Var, j0Var);
        if (yVar.n(eVar) || d1Var != null) {
            yVar.i(eVar, 1, b1.f22740a, d1Var);
        }
        if (yVar.n(eVar) || map != null) {
            yVar.i(eVar, 2, aVarArr[2], map);
        }
        bVarB.c(eVar);
    }

    @Override // ku.z
    public final gu.a[] typeParametersSerializers() {
        return ku.p0.f14595b;
    }
}
