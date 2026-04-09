package g0;

import g2.r0;
import g2.s0;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class k implements g2.j0 {

    /* renamed from: a, reason: collision with root package name */
    public final i1.e f24143a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f24144b;

    public k(i1.e eVar, boolean z3) {
        this.f24143a = eVar;
        this.f24144b = z3;
    }

    @Override // g2.j0
    public final /* synthetic */ int b(g2.q qVar, List list, int i4) {
        return d.h.c(this, qVar, list, i4);
    }

    @Override // g2.j0
    public final /* synthetic */ int d(g2.q qVar, List list, int i4) {
        return d.h.g(this, qVar, list, i4);
    }

    @Override // g2.j0
    public final /* synthetic */ int e(g2.q qVar, List list, int i4) {
        return d.h.e(this, qVar, list, i4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f24143a.equals(kVar.f24143a) && this.f24144b == kVar.f24144b;
    }

    @Override // g2.j0
    public final g2.k0 f(final g2.l0 l0Var, final List list, long j) {
        boolean zIsEmpty = list.isEmpty();
        zj.t tVar = zj.t.f38318a;
        if (zIsEmpty) {
            return l0Var.O(d3.a.j(j), d3.a.i(j), tVar, new b7.w(2));
        }
        long j8 = this.f24144b ? j : j & (-8589934589L);
        if (list.size() == 1) {
            final g2.i0 i0Var = (g2.i0) list.get(0);
            i0Var.w();
            final s0 s0VarV = i0Var.v(j8);
            final int iMax = Math.max(d3.a.j(j), s0VarV.f24408a);
            final int iMax2 = Math.max(d3.a.i(j), s0VarV.f24409b);
            return l0Var.O(iMax, iMax2, tVar, new mk.c() { // from class: g0.i
                @Override // mk.c
                public final Object invoke(Object obj) {
                    h.a((r0) obj, s0VarV, i0Var, l0Var.getLayoutDirection(), iMax, iMax2, this.f24143a);
                    return yj.u.f37649a;
                }
            });
        }
        final s0[] s0VarArr = new s0[list.size()];
        final nk.s sVar = new nk.s();
        sVar.f29984a = d3.a.j(j);
        final nk.s sVar2 = new nk.s();
        sVar2.f29984a = d3.a.i(j);
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            g2.i0 i0Var2 = (g2.i0) list.get(i4);
            i0Var2.w();
            s0 s0VarV2 = i0Var2.v(j8);
            s0VarArr[i4] = s0VarV2;
            sVar.f29984a = Math.max(sVar.f29984a, s0VarV2.f24408a);
            sVar2.f29984a = Math.max(sVar2.f29984a, s0VarV2.f24409b);
        }
        return l0Var.O(sVar.f29984a, sVar2.f29984a, tVar, new mk.c() { // from class: g0.j
            @Override // mk.c
            public final Object invoke(Object obj) {
                r0 r0Var = (r0) obj;
                s0[] s0VarArr2 = s0VarArr;
                int length = s0VarArr2.length;
                int i10 = 0;
                int i11 = 0;
                while (i11 < length) {
                    int i12 = i10;
                    s0 s0Var = s0VarArr2[i11];
                    nk.k.c(s0Var, "null cannot be cast to non-null type androidx.compose.ui.layout.Placeable");
                    h.a(r0Var, s0Var, (g2.i0) list.get(i12), l0Var.getLayoutDirection(), sVar.f29984a, sVar2.f29984a, this.f24143a);
                    i11++;
                    i10 = i12 + 1;
                }
                return yj.u.f37649a;
            }
        });
    }

    @Override // g2.j0
    public final /* synthetic */ int h(g2.q qVar, List list, int i4) {
        return d.h.a(this, qVar, list, i4);
    }

    public final int hashCode() {
        return (this.f24143a.hashCode() * 31) + (this.f24144b ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BoxMeasurePolicy(alignment=");
        sb2.append(this.f24143a);
        sb2.append(", propagateMinConstraints=");
        return d.h.x(sb2, this.f24144b, ')');
    }
}
