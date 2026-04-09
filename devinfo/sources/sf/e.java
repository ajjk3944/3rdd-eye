package sf;

import com.google.android.gms.internal.ads.be1;
import d0.z0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements ml.e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f33575a;
    private static final kl.d descriptor;

    static {
        e eVar = new e();
        f33575a = eVar;
        ml.m mVar = new ml.m("com.google.firebase.sessions.settings.SessionConfigs", eVar, 5);
        mVar.l("sessionsEnabled", false);
        mVar.l("sessionSamplingRate", false);
        mVar.l("sessionTimeoutSeconds", false);
        mVar.l("cacheDurationSeconds", false);
        mVar.l("cacheUpdatedTimeSeconds", false);
        descriptor = mVar;
    }

    @Override // il.a
    public final Object a(be1 be1Var) {
        nk.k.e(be1Var, "decoder");
        kl.d dVar = descriptor;
        be1 be1VarB = be1Var.b(dVar);
        int i4 = 0;
        Boolean bool = null;
        Double d10 = null;
        Integer num = null;
        Integer num2 = null;
        Long l10 = null;
        boolean z3 = true;
        while (z3) {
            int iF = be1VarB.f(dVar);
            if (iF == -1) {
                z3 = false;
            } else if (iF == 0) {
                bool = (Boolean) be1VarB.l(dVar, 0, ml.a.f29400a, bool);
                i4 |= 1;
            } else if (iF == 1) {
                d10 = (Double) be1VarB.l(dVar, 1, ml.c.f29402a, d10);
                i4 |= 2;
            } else if (iF == 2) {
                num = (Integer) be1VarB.l(dVar, 2, ml.f.f29409a, num);
                i4 |= 4;
            } else if (iF == 3) {
                num2 = (Integer) be1VarB.l(dVar, 3, ml.f.f29409a, num2);
                i4 |= 8;
            } else {
                if (iF != 4) {
                    throw new il.d(iF);
                }
                l10 = (Long) be1VarB.l(dVar, 4, ml.i.f29415a, l10);
                i4 |= 16;
            }
        }
        be1VarB.s(dVar);
        return new g(i4, bool, d10, num, num2, l10);
    }

    @Override // il.a
    public final void b(z0 z0Var, Object obj) {
        g gVar = (g) obj;
        nk.k.e(gVar, "value");
        kl.d dVar = descriptor;
        z0 z0VarC = z0Var.c(dVar);
        z0VarC.j(dVar, 0, ml.a.f29400a, gVar.f33576a);
        z0VarC.j(dVar, 1, ml.c.f29402a, gVar.f33577b);
        ml.f fVar = ml.f.f29409a;
        z0VarC.j(dVar, 2, fVar, gVar.f33578c);
        z0VarC.j(dVar, 3, fVar, gVar.f33579d);
        z0VarC.j(dVar, 4, ml.i.f29415a, gVar.f33580e);
        z0VarC.o(dVar);
    }

    @Override // ml.e
    public final il.a[] c() {
        il.a aVarN = com.bumptech.glide.c.n(ml.a.f29400a);
        il.a aVarN2 = com.bumptech.glide.c.n(ml.c.f29402a);
        ml.f fVar = ml.f.f29409a;
        return new il.a[]{aVarN, aVarN2, com.bumptech.glide.c.n(fVar), com.bumptech.glide.c.n(fVar), com.bumptech.glide.c.n(ml.i.f29415a)};
    }

    @Override // il.a
    public final kl.d d() {
        return descriptor;
    }
}
