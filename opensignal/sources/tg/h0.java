package tg;

/* loaded from: classes.dex */
public final /* synthetic */ class h0 implements ku.z {

    /* renamed from: a, reason: collision with root package name */
    public static final h0 f22791a;
    private static final iu.e descriptor;

    static {
        h0 h0Var = new h0();
        f22791a = h0Var;
        ku.r0 r0Var = new ku.r0("com.google.firebase.sessions.SessionDetails", h0Var, 4);
        r0Var.b("sessionId", false);
        r0Var.b("firstSessionId", false);
        r0Var.b("sessionIndex", false);
        r0Var.b("sessionStartTimestampUs", false);
        descriptor = r0Var;
    }

    @Override // ku.z
    public final gu.a[] childSerializers() {
        ku.c1 c1Var = ku.c1.f14534a;
        return new gu.a[]{c1Var, c1Var, ku.e0.f14542a, ku.k0.f14571a};
    }

    @Override // gu.a
    public final Object deserialize(ju.c cVar) {
        iu.e eVar = descriptor;
        ju.a aVarB = cVar.b(eVar);
        int i10 = 0;
        int iH = 0;
        String strQ = null;
        String strQ2 = null;
        long jG = 0;
        boolean z10 = true;
        while (z10) {
            int iT = aVarB.t(eVar);
            if (iT == -1) {
                z10 = false;
            } else if (iT == 0) {
                strQ = aVarB.q(eVar, 0);
                i10 |= 1;
            } else if (iT == 1) {
                strQ2 = aVarB.q(eVar, 1);
                i10 |= 2;
            } else if (iT == 2) {
                iH = aVarB.h(eVar, 2);
                i10 |= 4;
            } else {
                if (iT != 3) {
                    throw new gu.f(iT);
                }
                jG = aVarB.g(eVar, 3);
                i10 |= 8;
            }
        }
        aVarB.c(eVar);
        return new j0(i10, strQ, strQ2, iH, jG);
    }

    @Override // gu.a
    public final iu.e getDescriptor() {
        return descriptor;
    }

    @Override // gu.a
    public final void serialize(ju.d dVar, Object obj) {
        j0 j0Var = (j0) obj;
        br.l.e(j0Var, "value");
        iu.e eVar = descriptor;
        ju.b bVarB = dVar.b(eVar);
        mu.y yVar = (mu.y) bVarB;
        yVar.x(eVar, 0, j0Var.f22806a);
        yVar.x(eVar, 1, j0Var.f22807b);
        int i10 = j0Var.f22808c;
        yVar.t(eVar, 2);
        yVar.p(i10);
        yVar.v(eVar, 3, j0Var.f22809d);
        bVarB.c(eVar);
    }

    @Override // ku.z
    public final gu.a[] typeParametersSerializers() {
        return ku.p0.f14595b;
    }
}
