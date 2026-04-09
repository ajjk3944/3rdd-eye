package c0;

import java.util.List;
import x1.l0;
import x1.m0;

/* loaded from: classes.dex */
public final class i implements v1.r {

    /* renamed from: a, reason: collision with root package name */
    public final z0.e f3086a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3087b;

    public i(z0.e eVar, boolean z10) {
        this.f3086a = eVar;
        this.f3087b = z10;
    }

    @Override // v1.r
    public final l0 a(final m0 m0Var, final List list, long j) {
        boolean zIsEmpty = list.isEmpty();
        mq.x xVar = mq.x.f16946a;
        if (zIsEmpty) {
            return m0Var.g0(t2.a.j(j), t2.a.i(j), xVar, new lu.u(13));
        }
        long j7 = this.f3087b ? j : j & (-8589934589L);
        if (list.size() == 1) {
            final v1.q qVar = (v1.q) list.get(0);
            qVar.t();
            final v1.v vVarS = qVar.s(j7);
            final int iMax = Math.max(t2.a.j(j), vVarS.f23809b);
            final int iMax2 = Math.max(t2.a.i(j), vVarS.f23810c);
            return m0Var.g0(iMax, iMax2, xVar, new ar.k() { // from class: c0.g
                @Override // ar.k
                public final Object a(Object obj) {
                    f.b((v1.u) obj, vVarS, qVar, m0Var.getLayoutDirection(), iMax, iMax2, this.f3086a);
                    return lq.b0.f15562a;
                }
            });
        }
        final v1.v[] vVarArr = new v1.v[list.size()];
        final br.u uVar = new br.u();
        uVar.f2915a = t2.a.j(j);
        final br.u uVar2 = new br.u();
        uVar2.f2915a = t2.a.i(j);
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            v1.q qVar2 = (v1.q) list.get(i10);
            qVar2.t();
            v1.v vVarS2 = qVar2.s(j7);
            vVarArr[i10] = vVarS2;
            uVar.f2915a = Math.max(uVar.f2915a, vVarS2.f23809b);
            uVar2.f2915a = Math.max(uVar2.f2915a, vVarS2.f23810c);
        }
        return m0Var.g0(uVar.f2915a, uVar2.f2915a, xVar, new ar.k() { // from class: c0.h
            @Override // ar.k
            public final Object a(Object obj) {
                v1.u uVar3 = (v1.u) obj;
                v1.v[] vVarArr2 = vVarArr;
                int length = vVarArr2.length;
                int i11 = 0;
                int i12 = 0;
                while (i12 < length) {
                    int i13 = i11;
                    v1.v vVar = vVarArr2[i12];
                    br.l.c(vVar, "null cannot be cast to non-null type androidx.compose.ui.layout.Placeable");
                    f.b(uVar3, vVar, (v1.q) list.get(i13), m0Var.getLayoutDirection(), uVar.f2915a, uVar2.f2915a, this.f3086a);
                    i12++;
                    i11 = i13 + 1;
                }
                return lq.b0.f15562a;
            }
        });
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f3086a.equals(iVar.f3086a) && this.f3087b == iVar.f3087b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f3087b) + (this.f3086a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BoxMeasurePolicy(alignment=");
        sb2.append(this.f3086a);
        sb2.append(", propagateMinConstraints=");
        return c7.a.r(sb2, this.f3087b, ')');
    }
}
