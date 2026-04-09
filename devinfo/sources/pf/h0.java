package pf;

import com.google.android.gms.internal.ads.be1;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class h0 implements ml.e {

    /* renamed from: a, reason: collision with root package name */
    public static final h0 f31833a;
    private static final kl.d descriptor;

    static {
        h0 h0Var = new h0();
        f31833a = h0Var;
        ml.m mVar = new ml.m("com.google.firebase.sessions.SessionData", h0Var, 3);
        mVar.l("sessionDetails", false);
        mVar.l("backgroundTime", true);
        mVar.l("processDataMap", true);
        descriptor = mVar;
    }

    @Override // il.a
    public final Object a(be1 be1Var) {
        nk.k.e(be1Var, "decoder");
        kl.d dVar = descriptor;
        be1 be1VarB = be1Var.b(dVar);
        il.a[] aVarArr = j0.f31854d;
        n0 n0Var = null;
        boolean z3 = true;
        int i4 = 0;
        f1 f1Var = null;
        Map map = null;
        while (z3) {
            int iF = be1VarB.f(dVar);
            if (iF == -1) {
                z3 = false;
            } else if (iF == 0) {
                n0Var = (n0) be1VarB.m(dVar, 0, l0.f31863a, n0Var);
                i4 |= 1;
            } else if (iF == 1) {
                f1Var = (f1) be1VarB.l(dVar, 1, d1.f31801a, f1Var);
                i4 |= 2;
            } else {
                if (iF != 2) {
                    throw new il.d(iF);
                }
                map = (Map) be1VarB.l(dVar, 2, aVarArr[2], map);
                i4 |= 4;
            }
        }
        be1VarB.s(dVar);
        return new j0(i4, n0Var, f1Var, map);
    }

    @Override // il.a
    public final void b(d0.z0 z0Var, Object obj) {
        j0 j0Var = (j0) obj;
        nk.k.e(j0Var, "value");
        kl.d dVar = descriptor;
        d0.z0 z0VarC = z0Var.c(dVar);
        il.a[] aVarArr = j0.f31854d;
        l0 l0Var = l0.f31863a;
        n0 n0Var = j0Var.f31855a;
        Map map = j0Var.f31857c;
        f1 f1Var = j0Var.f31856b;
        z0VarC.k(dVar, 0, l0Var, n0Var);
        if (z0VarC.s(dVar) || f1Var != null) {
            z0VarC.j(dVar, 1, d1.f31801a, f1Var);
        }
        if (z0VarC.s(dVar) || map != null) {
            z0VarC.j(dVar, 2, aVarArr[2], map);
        }
        z0VarC.o(dVar);
    }

    @Override // ml.e
    public final il.a[] c() {
        return new il.a[]{l0.f31863a, com.bumptech.glide.c.n(d1.f31801a), com.bumptech.glide.c.n(j0.f31854d[2])};
    }

    @Override // il.a
    public final kl.d d() {
        return descriptor;
    }
}
