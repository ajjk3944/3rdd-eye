package c0;

import java.util.List;
import x1.l0;
import x1.m0;

/* loaded from: classes.dex */
public final class x implements v1.r, u {

    /* renamed from: a, reason: collision with root package name */
    public final b f3112a;

    /* renamed from: b, reason: collision with root package name */
    public final z0.d f3113b;

    public x(b bVar, z0.d dVar) {
        this.f3112a = bVar;
        this.f3113b = dVar;
    }

    @Override // v1.r
    public final l0 a(m0 m0Var, List list, long j) {
        return b0.c(this, t2.a.j(j), t2.a.i(j), t2.a.h(j), t2.a.g(j), m0Var.G(this.f3112a.b()), m0Var, list, new v1.v[list.size()], list.size());
    }

    @Override // c0.u
    public final long b(int i10, int i11, int i12, boolean z10) {
        return !z10 ? t2.b.a(i10, i11, 0, i12) : dr.a.n(i10, i11, 0, i12);
    }

    @Override // c0.u
    public final int c(v1.v vVar) {
        return vVar.f23809b;
    }

    @Override // c0.u
    public final int d(v1.v vVar) {
        return vVar.f23810c;
    }

    @Override // c0.u
    public final void e(int i10, int[] iArr, int[] iArr2, m0 m0Var) {
        this.f3112a.a(i10, iArr, m0Var.getLayoutDirection(), iArr2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return br.l.a(this.f3112a, xVar.f3112a) && this.f3113b.equals(xVar.f3113b);
    }

    @Override // c0.u
    public final l0 f(v1.v[] vVarArr, m0 m0Var, int[] iArr, int i10, int i11) {
        return m0Var.g0(i10, i11, mq.x.f16946a, new k(vVarArr, this, i11, iArr));
    }

    public final int hashCode() {
        return Float.hashCode(this.f3113b.f26487a) + (this.f3112a.hashCode() * 31);
    }

    public final String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.f3112a + ", verticalAlignment=" + this.f3113b + ')';
    }
}
