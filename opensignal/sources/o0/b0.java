package o0;

import n0.k1;
import n0.q1;
import n0.v1;

/* loaded from: classes.dex */
public final class b0 extends ns.d {

    /* renamed from: d, reason: collision with root package name */
    public static final b0 f18694d = new b0(1, 0, 2);

    @Override // ns.d
    public final void c(androidx.datastore.preferences.protobuf.l lVar, n0.c cVar, v1 v1Var, al.g gVar, g0 g0Var) {
        int iF = lVar.f(0);
        int i10 = v1Var.f17352v;
        int iL = v1Var.L(v1Var.f17334b, v1Var.r(i10));
        int iG = v1Var.g(v1Var.f17334b, v1Var.r(i10 + 1));
        for (int iMax = Math.max(iL, iG - iF); iMax < iG; iMax++) {
            Object obj = v1Var.f17335c[v1Var.h(iMax)];
            if (obj instanceof q1) {
                gVar.f((q1) obj);
            } else if (obj instanceof k1) {
                ((k1) obj).d();
            }
        }
        if (iF <= 0) {
            n0.q.c("Check failed");
        }
        int i11 = v1Var.f17352v;
        int iL2 = v1Var.L(v1Var.f17334b, v1Var.r(i11));
        int iG2 = v1Var.g(v1Var.f17334b, v1Var.r(i11 + 1)) - iF;
        if (iG2 < iL2) {
            n0.q.c("Check failed");
        }
        v1Var.H(iG2, iF, i11);
        int i12 = v1Var.f17341i;
        if (i12 >= iL2) {
            v1Var.f17341i = i12 - iF;
        }
    }
}
