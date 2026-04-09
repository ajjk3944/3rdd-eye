package tg;

/* loaded from: classes.dex */
public final /* synthetic */ class w implements ku.z {

    /* renamed from: a, reason: collision with root package name */
    public static final w f22861a;
    private static final iu.e descriptor;

    static {
        w wVar = new w();
        f22861a = wVar;
        ku.r0 r0Var = new ku.r0("com.google.firebase.sessions.ProcessData", wVar, 2);
        r0Var.b("pid", false);
        r0Var.b("uuid", false);
        descriptor = r0Var;
    }

    @Override // ku.z
    public final gu.a[] childSerializers() {
        return new gu.a[]{ku.e0.f14542a, ku.c1.f14534a};
    }

    @Override // gu.a
    public final Object deserialize(ju.c cVar) {
        iu.e eVar = descriptor;
        ju.a aVarB = cVar.b(eVar);
        String strQ = null;
        boolean z10 = true;
        int i10 = 0;
        int iH = 0;
        while (z10) {
            int iT = aVarB.t(eVar);
            if (iT == -1) {
                z10 = false;
            } else if (iT == 0) {
                iH = aVarB.h(eVar, 0);
                i10 |= 1;
            } else {
                if (iT != 1) {
                    throw new gu.f(iT);
                }
                strQ = aVarB.q(eVar, 1);
                i10 |= 2;
            }
        }
        aVarB.c(eVar);
        return new y(strQ, i10, iH);
    }

    @Override // gu.a
    public final iu.e getDescriptor() {
        return descriptor;
    }

    @Override // gu.a
    public final void serialize(ju.d dVar, Object obj) {
        y yVar = (y) obj;
        br.l.e(yVar, "value");
        iu.e eVar = descriptor;
        ju.b bVarB = dVar.b(eVar);
        int i10 = yVar.f22863a;
        mu.y yVar2 = (mu.y) bVarB;
        yVar2.t(eVar, 0);
        yVar2.p(i10);
        yVar2.x(eVar, 1, yVar.f22864b);
        bVarB.c(eVar);
    }

    @Override // ku.z
    public final gu.a[] typeParametersSerializers() {
        return ku.p0.f14595b;
    }
}
