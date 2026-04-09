package pf;

import com.google.android.gms.internal.ads.be1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class l0 implements ml.e {

    /* renamed from: a, reason: collision with root package name */
    public static final l0 f31863a;
    private static final kl.d descriptor;

    static {
        l0 l0Var = new l0();
        f31863a = l0Var;
        ml.m mVar = new ml.m("com.google.firebase.sessions.SessionDetails", l0Var, 4);
        mVar.l("sessionId", false);
        mVar.l("firstSessionId", false);
        mVar.l("sessionIndex", false);
        mVar.l("sessionStartTimestampUs", false);
        descriptor = mVar;
    }

    @Override // il.a
    public final Object a(be1 be1Var) {
        nk.k.e(be1Var, "decoder");
        kl.d dVar = descriptor;
        be1 be1VarB = be1Var.b(dVar);
        int i4 = 0;
        int iH = 0;
        String strP = null;
        String strP2 = null;
        long j = 0;
        boolean z3 = true;
        while (z3) {
            int iF = be1VarB.f(dVar);
            if (iF == -1) {
                z3 = false;
            } else if (iF == 0) {
                strP = be1VarB.p(dVar, 0);
                i4 |= 1;
            } else if (iF == 1) {
                strP2 = be1VarB.p(dVar, 1);
                i4 |= 2;
            } else if (iF == 2) {
                iH = be1VarB.h(dVar, 2);
                i4 |= 4;
            } else {
                if (iF != 3) {
                    throw new il.d(iF);
                }
                j = be1VarB.j(dVar, 3);
                i4 |= 8;
            }
        }
        be1VarB.s(dVar);
        return new n0(i4, strP, strP2, iH, j);
    }

    @Override // il.a
    public final void b(d0.z0 z0Var, Object obj) {
        n0 n0Var = (n0) obj;
        nk.k.e(n0Var, "value");
        kl.d dVar = descriptor;
        d0.z0 z0VarC = z0Var.c(dVar);
        z0VarC.n(dVar, 0, n0Var.f31871a);
        z0VarC.n(dVar, 1, n0Var.f31872b);
        int i4 = n0Var.f31873c;
        z0VarC.e(dVar, 2);
        z0VarC.f(i4);
        z0VarC.h(dVar, 3, n0Var.f31874d);
        z0VarC.o(dVar);
    }

    @Override // ml.e
    public final il.a[] c() {
        ml.p pVar = ml.p.f29436a;
        return new il.a[]{pVar, pVar, ml.f.f29409a, ml.i.f29415a};
    }

    @Override // il.a
    public final kl.d d() {
        return descriptor;
    }
}
