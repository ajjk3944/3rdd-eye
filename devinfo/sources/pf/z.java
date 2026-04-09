package pf;

import com.google.android.gms.internal.ads.be1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class z implements ml.e {

    /* renamed from: a, reason: collision with root package name */
    public static final z f31929a;
    private static final kl.d descriptor;

    static {
        z zVar = new z();
        f31929a = zVar;
        ml.m mVar = new ml.m("com.google.firebase.sessions.ProcessData", zVar, 2);
        mVar.l("pid", false);
        mVar.l("uuid", false);
        descriptor = mVar;
    }

    @Override // il.a
    public final Object a(be1 be1Var) {
        nk.k.e(be1Var, "decoder");
        kl.d dVar = descriptor;
        be1 be1VarB = be1Var.b(dVar);
        String strP = null;
        boolean z3 = true;
        int i4 = 0;
        int iH = 0;
        while (z3) {
            int iF = be1VarB.f(dVar);
            if (iF == -1) {
                z3 = false;
            } else if (iF == 0) {
                iH = be1VarB.h(dVar, 0);
                i4 |= 1;
            } else {
                if (iF != 1) {
                    throw new il.d(iF);
                }
                strP = be1VarB.p(dVar, 1);
                i4 |= 2;
            }
        }
        be1VarB.s(dVar);
        return new b0(i4, iH, strP);
    }

    @Override // il.a
    public final void b(d0.z0 z0Var, Object obj) {
        b0 b0Var = (b0) obj;
        nk.k.e(b0Var, "value");
        kl.d dVar = descriptor;
        d0.z0 z0VarC = z0Var.c(dVar);
        int i4 = b0Var.f31766a;
        z0VarC.e(dVar, 0);
        z0VarC.f(i4);
        z0VarC.n(dVar, 1, b0Var.f31767b);
        z0VarC.o(dVar);
    }

    @Override // ml.e
    public final il.a[] c() {
        return new il.a[]{ml.f.f29409a, ml.p.f29436a};
    }

    @Override // il.a
    public final kl.d d() {
        return descriptor;
    }
}
