package c0;

import java.util.List;
import x1.l0;
import x1.m0;

/* loaded from: classes.dex */
public final class l implements v1.r, u {
    public l() {
        c cVar = d.f3066a;
    }

    @Override // v1.r
    public final l0 a(m0 m0Var, List list, long j) {
        int i10 = t2.a.i(j);
        int iJ = t2.a.j(j);
        int iG = t2.a.g(j);
        int iH = t2.a.h(j);
        c cVar = d.f3066a;
        return b0.c(this, i10, iJ, iG, iH, m0Var.G(0), m0Var, list, new v1.v[list.size()], list.size());
    }

    @Override // c0.u
    public final long b(int i10, int i11, int i12, boolean z10) {
        return !z10 ? t2.b.a(0, i12, i10, i11) : dr.a.m(0, i12, i10, i11);
    }

    @Override // c0.u
    public final int c(v1.v vVar) {
        return vVar.f23810c;
    }

    @Override // c0.u
    public final int d(v1.v vVar) {
        return vVar.f23809b;
    }

    @Override // c0.u
    public final void e(int i10, int[] iArr, int[] iArr2, m0 m0Var) {
        c cVar = d.f3066a;
        d.b(iArr, iArr2, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        Object obj2 = d.f3067b;
        if (!obj2.equals(obj2)) {
            return false;
        }
        z0.c cVar = z0.b.H;
        return cVar.equals(cVar);
    }

    @Override // c0.u
    public final l0 f(v1.v[] vVarArr, m0 m0Var, int[] iArr, int i10, int i11) {
        return m0Var.g0(i11, i10, mq.x.f16946a, new k(vVarArr, this, i11, m0Var, iArr));
    }

    public final int hashCode() {
        return Float.hashCode(-1.0f) + (d.f3067b.hashCode() * 31);
    }

    public final String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + d.f3067b + ", horizontalAlignment=" + z0.b.H + ')';
    }
}
