package pf;

import com.google.android.gms.internal.ads.be1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class d1 implements ml.e {

    /* renamed from: a, reason: collision with root package name */
    public static final d1 f31801a;
    private static final kl.d descriptor;

    static {
        d1 d1Var = new d1();
        f31801a = d1Var;
        ml.m mVar = new ml.m("com.google.firebase.sessions.Time", d1Var, 3);
        mVar.l("ms", false);
        mVar.l("us", true);
        mVar.l("seconds", true);
        descriptor = mVar;
    }

    @Override // il.a
    public final Object a(be1 be1Var) {
        nk.k.e(be1Var, "decoder");
        kl.d dVar = descriptor;
        be1 be1VarB = be1Var.b(dVar);
        int i4 = 0;
        long j = 0;
        long j8 = 0;
        long j9 = 0;
        boolean z3 = true;
        while (z3) {
            int iF = be1VarB.f(dVar);
            if (iF == -1) {
                z3 = false;
            } else if (iF == 0) {
                j = be1VarB.j(dVar, 0);
                i4 |= 1;
            } else if (iF == 1) {
                j8 = be1VarB.j(dVar, 1);
                i4 |= 2;
            } else {
                if (iF != 2) {
                    throw new il.d(iF);
                }
                j9 = be1VarB.j(dVar, 2);
                i4 |= 4;
            }
        }
        be1VarB.s(dVar);
        return new f1(i4, j, j8, j9);
    }

    @Override // il.a
    public final void b(d0.z0 z0Var, Object obj) {
        f1 f1Var = (f1) obj;
        nk.k.e(f1Var, "value");
        kl.d dVar = descriptor;
        d0.z0 z0VarC = z0Var.c(dVar);
        long j = f1Var.f31818a;
        long j8 = f1Var.f31820c;
        long j9 = f1Var.f31819b;
        z0VarC.h(dVar, 0, j);
        if (z0VarC.s(dVar) || j9 != 1000 * j) {
            z0VarC.h(dVar, 1, j9);
        }
        if (z0VarC.s(dVar) || j8 != j / 1000) {
            z0VarC.h(dVar, 2, j8);
        }
        z0VarC.o(dVar);
    }

    @Override // ml.e
    public final il.a[] c() {
        ml.i iVar = ml.i.f29415a;
        return new il.a[]{iVar, iVar, iVar};
    }

    @Override // il.a
    public final kl.d d() {
        return descriptor;
    }
}
