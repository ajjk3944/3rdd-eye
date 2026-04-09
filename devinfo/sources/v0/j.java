package v0;

import u0.e2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class j extends j0 {

    /* renamed from: c, reason: collision with root package name */
    public static final j f35581c = new j(0, 2, 1);

    @Override // v0.j0
    public final void a(androidx.datastore.preferences.protobuf.k kVar, u0.c cVar, e2 e2Var, c1.o oVar, k0 k0Var) {
        int i4;
        c1.i iVar = (c1.i) kVar.j(0);
        int iC = e2Var.c((u0.a) kVar.j(1));
        if (e2Var.f34796t >= iC) {
            u0.r.a("Check failed");
        }
        nh.a.s(e2Var, cVar, iC);
        int i10 = e2Var.f34796t;
        int iE = e2Var.f34798v;
        while (iE >= 0 && !e2Var.y(iE)) {
            iE = e2Var.E(iE, e2Var.f34780b);
        }
        int iU = iE + 1;
        int iL = 0;
        while (iU < i10) {
            if (e2Var.v(i10, iU)) {
                if (e2Var.y(iU)) {
                    iL = 0;
                }
                iU++;
            } else {
                iL += e2Var.y(iU) ? 1 : e2Var.f34780b[(e2Var.r(iU) * 5) + 1] & 67108863;
                iU += e2Var.u(iU);
            }
        }
        while (true) {
            i4 = e2Var.f34796t;
            if (i4 >= iC) {
                break;
            }
            if (e2Var.v(iC, i4)) {
                int i11 = e2Var.f34796t;
                if (i11 < e2Var.f34797u && (e2Var.f34780b[(e2Var.r(i11) * 5) + 1] & 1073741824) != 0) {
                    cVar.d(e2Var.D(e2Var.f34796t));
                    iL = 0;
                }
                e2Var.P();
            } else {
                iL += e2Var.L();
            }
        }
        if (i4 != iC) {
            u0.r.a("Check failed");
        }
        iVar.f2562a = iL;
    }
}
