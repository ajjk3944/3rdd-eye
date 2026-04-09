package o0;

import com.google.android.gms.internal.measurement.b4;
import n0.v1;

/* loaded from: classes.dex */
public final class i extends ns.d {

    /* renamed from: d, reason: collision with root package name */
    public static final i f18712d = new i(0, 2, 1);

    @Override // ns.d
    public final void c(androidx.datastore.preferences.protobuf.l lVar, n0.c cVar, v1 v1Var, al.g gVar, g0 g0Var) {
        int i10;
        v0.e eVar = (v0.e) lVar.g(0);
        int iC = v1Var.c((n0.a) lVar.g(1));
        if (v1Var.f17350t >= iC) {
            n0.q.c("Check failed");
        }
        b4.P(v1Var, cVar, iC);
        int i11 = v1Var.f17350t;
        int iC2 = v1Var.f17352v;
        while (iC2 >= 0 && !v1Var.x(iC2)) {
            iC2 = v1Var.C(v1Var.f17334b, iC2);
        }
        int iT = iC2 + 1;
        int iJ = 0;
        while (iT < i11) {
            if (v1Var.u(i11, iT)) {
                if (v1Var.x(iT)) {
                    iJ = 0;
                }
                iT++;
            } else {
                iJ += v1Var.x(iT) ? 1 : v1Var.f17334b[(v1Var.r(iT) * 5) + 1] & 67108863;
                iT += v1Var.t(iT);
            }
        }
        while (true) {
            i10 = v1Var.f17350t;
            if (i10 >= iC) {
                break;
            }
            if (v1Var.u(iC, i10)) {
                int i12 = v1Var.f17350t;
                if (i12 < v1Var.f17351u && (v1Var.f17334b[(v1Var.r(i12) * 5) + 1] & 1073741824) != 0) {
                    cVar.e(v1Var.B(v1Var.f17350t));
                    iJ = 0;
                }
                v1Var.N();
            } else {
                iJ += v1Var.J();
            }
        }
        if (i10 != iC) {
            n0.q.c("Check failed");
        }
        eVar.f23741a = iJ;
    }
}
