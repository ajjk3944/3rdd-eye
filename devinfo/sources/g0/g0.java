package g0;

import com.google.android.gms.internal.measurement.z3;
import g2.s0;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class g0 implements g2.j0, d0 {

    /* renamed from: a, reason: collision with root package name */
    public final b f24115a;

    /* renamed from: b, reason: collision with root package name */
    public final i1.d f24116b;

    public g0(b bVar, i1.d dVar) {
        this.f24115a = bVar;
        this.f24116b = dVar;
    }

    @Override // g0.d0
    public final int a(s0 s0Var) {
        return s0Var.f24409b;
    }

    @Override // g2.j0
    public final int b(g2.q qVar, List list, int i4) {
        int iQ = qVar.Q(this.f24115a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i10 = 0;
        float f10 = 0.0f;
        for (int i11 = 0; i11 < size; i11++) {
            g2.i0 i0Var = (g2.i0) list.get(i11);
            float fC = x.c(x.b(i0Var));
            int iT = i0Var.t(i4);
            if (fC == 0.0f) {
                i10 += iT;
            } else if (fC > 0.0f) {
                f10 += fC;
                iMax = Math.max(iMax, Math.round(iT / fC));
            }
        }
        return ((list.size() - 1) * iQ) + Math.round(iMax * f10) + i10;
    }

    @Override // g0.d0
    public final long c(int i4, int i10, int i11, boolean z3) {
        return !z3 ? d3.b.a(i4, i10, 0, i11) : z3.g(i4, i10, 0, i11);
    }

    @Override // g2.j0
    public final int d(g2.q qVar, List list, int i4) {
        int iQ = qVar.Q(this.f24115a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i10 = 0;
        float f10 = 0.0f;
        for (int i11 = 0; i11 < size; i11++) {
            g2.i0 i0Var = (g2.i0) list.get(i11);
            float fC = x.c(x.b(i0Var));
            int iN = i0Var.n(i4);
            if (fC == 0.0f) {
                i10 += iN;
            } else if (fC > 0.0f) {
                f10 += fC;
                iMax = Math.max(iMax, Math.round(iN / fC));
            }
        }
        return ((list.size() - 1) * iQ) + Math.round(iMax * f10) + i10;
    }

    @Override // g2.j0
    public final int e(g2.q qVar, List list, int i4) {
        int iQ = qVar.Q(this.f24115a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iQ, i4);
        int size = list.size();
        int iMax = 0;
        float f10 = 0.0f;
        for (int i10 = 0; i10 < size; i10++) {
            g2.i0 i0Var = (g2.i0) list.get(i10);
            float fC = x.c(x.b(i0Var));
            if (fC == 0.0f) {
                int iMin2 = Math.min(i0Var.t(Integer.MAX_VALUE), i4 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i4 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, i0Var.J(iMin2));
            } else if (fC > 0.0f) {
                f10 += fC;
            }
        }
        int iRound = f10 == 0.0f ? 0 : i4 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i4 - iMin, 0) / f10);
        int size2 = list.size();
        for (int i11 = 0; i11 < size2; i11++) {
            g2.i0 i0Var2 = (g2.i0) list.get(i11);
            float fC2 = x.c(x.b(i0Var2));
            if (fC2 > 0.0f) {
                iMax = Math.max(iMax, i0Var2.J(iRound != Integer.MAX_VALUE ? Math.round(iRound * fC2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return nk.k.a(this.f24115a, g0Var.f24115a) && this.f24116b.equals(g0Var.f24116b);
    }

    @Override // g2.j0
    public final g2.k0 f(g2.l0 l0Var, List list, long j) {
        return x.d(this, d3.a.j(j), d3.a.i(j), d3.a.h(j), d3.a.g(j), l0Var.Q(this.f24115a.a()), l0Var, list, new s0[list.size()], list.size());
    }

    @Override // g0.d0
    public final g2.k0 g(s0[] s0VarArr, g2.l0 l0Var, int[] iArr, int i4, int i10) {
        return l0Var.O(i4, i10, zj.t.f38318a, new n(s0VarArr, this, i10, iArr));
    }

    @Override // g2.j0
    public final int h(g2.q qVar, List list, int i4) {
        int iQ = qVar.Q(this.f24115a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iQ, i4);
        int size = list.size();
        int iMax = 0;
        float f10 = 0.0f;
        for (int i10 = 0; i10 < size; i10++) {
            g2.i0 i0Var = (g2.i0) list.get(i10);
            float fC = x.c(x.b(i0Var));
            if (fC == 0.0f) {
                int iMin2 = Math.min(i0Var.t(Integer.MAX_VALUE), i4 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i4 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, i0Var.d(iMin2));
            } else if (fC > 0.0f) {
                f10 += fC;
            }
        }
        int iRound = f10 == 0.0f ? 0 : i4 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i4 - iMin, 0) / f10);
        int size2 = list.size();
        for (int i11 = 0; i11 < size2; i11++) {
            g2.i0 i0Var2 = (g2.i0) list.get(i11);
            float fC2 = x.c(x.b(i0Var2));
            if (fC2 > 0.0f) {
                iMax = Math.max(iMax, i0Var2.d(iRound != Integer.MAX_VALUE ? Math.round(iRound * fC2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f24116b.f25543a) + (this.f24115a.hashCode() * 31);
    }

    @Override // g0.d0
    public final int i(s0 s0Var) {
        return s0Var.f24408a;
    }

    @Override // g0.d0
    public final void j(int i4, g2.l0 l0Var, int[] iArr, int[] iArr2) {
        this.f24115a.c(l0Var, i4, iArr, l0Var.getLayoutDirection(), iArr2);
    }

    public final String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.f24115a + ", verticalAlignment=" + this.f24116b + ')';
    }
}
