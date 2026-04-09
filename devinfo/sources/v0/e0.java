package v0;

import u0.e2;
import u0.m1;
import u0.v1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e0 extends j0 {

    /* renamed from: c, reason: collision with root package name */
    public static final e0 f35572c = new e0(1, 0, 2);

    @Override // v0.j0
    public final void a(androidx.datastore.preferences.protobuf.k kVar, u0.c cVar, e2 e2Var, c1.o oVar, k0 k0Var) {
        int i4 = kVar.i(0);
        int i10 = e2Var.f34798v;
        int iN = e2Var.N(e2Var.r(i10), e2Var.f34780b);
        int iG = e2Var.g(e2Var.r(i10 + 1), e2Var.f34780b);
        for (int iMax = Math.max(iN, iG - i4); iMax < iG; iMax++) {
            Object obj = e2Var.f34781c[e2Var.h(iMax)];
            if (obj instanceof v1) {
                oVar.e((v1) obj);
            } else if (obj instanceof m1) {
                ((m1) obj).d();
            }
        }
        if (i4 <= 0) {
            u0.r.a("Check failed");
        }
        int i11 = e2Var.f34798v;
        int iN2 = e2Var.N(e2Var.r(i11), e2Var.f34780b);
        int iG2 = e2Var.g(e2Var.r(i11 + 1), e2Var.f34780b) - i4;
        if (iG2 < iN2) {
            u0.r.a("Check failed");
        }
        e2Var.J(iG2, i4, i11);
        int i12 = e2Var.f34786i;
        if (i12 >= iN2) {
            e2Var.f34786i = i12 - i4;
        }
    }
}
