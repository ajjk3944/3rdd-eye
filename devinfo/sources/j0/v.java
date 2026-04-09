package j0;

import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class v extends i1.m implements i2.l {

    /* renamed from: o, reason: collision with root package name */
    public y f26989o;

    @Override // i2.l
    public final void J(i2.g0 g0Var) {
        r1.b bVar = g0Var.f25668a;
        ArrayList arrayList = this.f26989o.f27031i;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            s sVar = (s) arrayList.get(i4);
            s1.b bVar2 = sVar.f26969n;
            if (bVar2 != null) {
                long j = sVar.f26968m;
                long j8 = bVar2.f33248t;
                float f10 = ((int) (j >> 32)) - ((int) (j8 >> 32));
                float f11 = ((int) (j & 4294967295L)) - ((int) (j8 & 4294967295L));
                ((nm.d0) bVar.f32718b.f25416b).w(f10, f11);
                try {
                    wb.e.o(g0Var, bVar2);
                } finally {
                    ((nm.d0) bVar.f32718b.f25416b).w(-f10, -f11);
                }
            }
        }
        g0Var.b();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && nk.k.a(this.f26989o, ((v) obj).f26989o);
    }

    @Override // i1.m
    public final void f0() {
        this.f26989o.j = this;
    }

    @Override // i1.m
    public final void h0() {
        y yVar = this.f26989o;
        yVar.d();
        yVar.f27025b = null;
        yVar.f27026c = -1;
    }

    public final int hashCode() {
        return this.f26989o.hashCode();
    }

    public final String toString() {
        return "DisplayingDisappearingItemsNode(animator=" + this.f26989o + ')';
    }

    @Override // i2.l
    public final /* synthetic */ void z() {
    }
}
