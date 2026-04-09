package g0;

import com.google.android.gms.internal.measurement.z3;
import g2.s0;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class o implements g2.j0, d0 {
    public o() {
        l lVar = e.f24108a;
    }

    @Override // g0.d0
    public final int a(s0 s0Var) {
        return s0Var.f24408a;
    }

    @Override // g2.j0
    public final int b(g2.q qVar, List list, int i4) {
        l lVar = e.f24108a;
        int iQ = qVar.Q(0);
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
                int iMin2 = Math.min(i0Var.d(Integer.MAX_VALUE), i4 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i4 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, i0Var.t(iMin2));
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
                iMax = Math.max(iMax, i0Var2.t(iRound != Integer.MAX_VALUE ? Math.round(iRound * fC2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // g0.d0
    public final long c(int i4, int i10, int i11, boolean z3) {
        return !z3 ? d3.b.a(0, i11, i4, i10) : z3.f(0, i11, i4, i10);
    }

    @Override // g2.j0
    public final int d(g2.q qVar, List list, int i4) {
        l lVar = e.f24108a;
        int iQ = qVar.Q(0);
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
                int iMin2 = Math.min(i0Var.d(Integer.MAX_VALUE), i4 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i4 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, i0Var.n(iMin2));
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
                iMax = Math.max(iMax, i0Var2.n(iRound != Integer.MAX_VALUE ? Math.round(iRound * fC2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // g2.j0
    public final int e(g2.q qVar, List list, int i4) {
        l lVar = e.f24108a;
        int iQ = qVar.Q(0);
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
            int iJ = i0Var.J(i4);
            if (fC == 0.0f) {
                i10 += iJ;
            } else if (fC > 0.0f) {
                f10 += fC;
                iMax = Math.max(iMax, Math.round(iJ / fC));
            }
        }
        return ((list.size() - 1) * iQ) + Math.round(iMax * f10) + i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        Object obj2 = e.f24109b;
        if (!obj2.equals(obj2)) {
            return false;
        }
        i1.c cVar = i1.b.f25540l;
        return cVar.equals(cVar);
    }

    @Override // g2.j0
    public final g2.k0 f(g2.l0 l0Var, List list, long j) {
        int i4 = d3.a.i(j);
        int iJ = d3.a.j(j);
        int iG = d3.a.g(j);
        int iH = d3.a.h(j);
        l lVar = e.f24108a;
        return x.d(this, i4, iJ, iG, iH, l0Var.Q(0), l0Var, list, new s0[list.size()], list.size());
    }

    @Override // g0.d0
    public final g2.k0 g(s0[] s0VarArr, g2.l0 l0Var, int[] iArr, int i4, int i10) {
        return l0Var.O(i10, i4, zj.t.f38318a, new n(s0VarArr, this, i10, l0Var, iArr));
    }

    @Override // g2.j0
    public final int h(g2.q qVar, List list, int i4) {
        l lVar = e.f24108a;
        int iQ = qVar.Q(0);
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
            int iD = i0Var.d(i4);
            if (fC == 0.0f) {
                i10 += iD;
            } else if (fC > 0.0f) {
                f10 += fC;
                iMax = Math.max(iMax, Math.round(iD / fC));
            }
        }
        return ((list.size() - 1) * iQ) + Math.round(iMax * f10) + i10;
    }

    public final int hashCode() {
        return Float.floatToIntBits(-1.0f) + (e.f24109b.hashCode() * 31);
    }

    @Override // g0.d0
    public final int i(s0 s0Var) {
        return s0Var.f24409b;
    }

    @Override // g0.d0
    public final void j(int i4, g2.l0 l0Var, int[] iArr, int[] iArr2) {
        l lVar = e.f24108a;
        e.b(iArr, iArr2, false);
    }

    public final String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + e.f24109b + ", horizontalAlignment=" + i1.b.f25540l + ')';
    }
}
