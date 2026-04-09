package tg;

/* loaded from: classes.dex */
public final /* synthetic */ class b1 implements ku.z {

    /* renamed from: a, reason: collision with root package name */
    public static final b1 f22740a;
    private static final iu.e descriptor;

    static {
        b1 b1Var = new b1();
        f22740a = b1Var;
        ku.r0 r0Var = new ku.r0("com.google.firebase.sessions.Time", b1Var, 3);
        r0Var.b("ms", false);
        r0Var.b("us", true);
        r0Var.b("seconds", true);
        descriptor = r0Var;
    }

    @Override // ku.z
    public final gu.a[] childSerializers() {
        ku.k0 k0Var = ku.k0.f14571a;
        return new gu.a[]{k0Var, k0Var, k0Var};
    }

    @Override // gu.a
    public final Object deserialize(ju.c cVar) {
        iu.e eVar = descriptor;
        ju.a aVarB = cVar.b(eVar);
        int i10 = 0;
        long jG = 0;
        long jG2 = 0;
        long jG3 = 0;
        boolean z10 = true;
        while (z10) {
            int iT = aVarB.t(eVar);
            if (iT == -1) {
                z10 = false;
            } else if (iT == 0) {
                jG = aVarB.g(eVar, 0);
                i10 |= 1;
            } else if (iT == 1) {
                jG2 = aVarB.g(eVar, 1);
                i10 |= 2;
            } else {
                if (iT != 2) {
                    throw new gu.f(iT);
                }
                jG3 = aVarB.g(eVar, 2);
                i10 |= 4;
            }
        }
        aVarB.c(eVar);
        return new d1(i10, jG, jG2, jG3);
    }

    @Override // gu.a
    public final iu.e getDescriptor() {
        return descriptor;
    }

    @Override // gu.a
    public final void serialize(ju.d dVar, Object obj) {
        d1 d1Var = (d1) obj;
        br.l.e(d1Var, "value");
        iu.e eVar = descriptor;
        ju.b bVarB = dVar.b(eVar);
        long j = d1Var.f22760a;
        long j7 = d1Var.f22762c;
        long j10 = d1Var.f22761b;
        mu.y yVar = (mu.y) bVarB;
        yVar.v(eVar, 0, j);
        if (yVar.n(eVar) || j10 != 1000 * j) {
            yVar.v(eVar, 1, j10);
        }
        if (yVar.n(eVar) || j7 != j / 1000) {
            yVar.v(eVar, 2, j7);
        }
        bVarB.c(eVar);
    }

    @Override // ku.z
    public final gu.a[] typeParametersSerializers() {
        return ku.p0.f14595b;
    }
}
