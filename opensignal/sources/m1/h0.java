package m1;

import java.util.List;

/* loaded from: classes.dex */
public final class h0 extends g0 {
    public final float B;
    public final float D;
    public final int E;
    public final int F;
    public final float G;
    public final float H;
    public final float I;
    public final float J;

    /* renamed from: a, reason: collision with root package name */
    public final String f16204a;

    /* renamed from: d, reason: collision with root package name */
    public final List f16205d;

    /* renamed from: g, reason: collision with root package name */
    public final int f16206g;

    /* renamed from: r, reason: collision with root package name */
    public final g1.f0 f16207r;

    /* renamed from: x, reason: collision with root package name */
    public final float f16208x;

    /* renamed from: y, reason: collision with root package name */
    public final g1.f0 f16209y;

    public h0(String str, List list, int i10, g1.f0 f0Var, float f10, g1.f0 f0Var2, float f11, float f12, int i11, int i12, float f13, float f14, float f15, float f16) {
        this.f16204a = str;
        this.f16205d = list;
        this.f16206g = i10;
        this.f16207r = f0Var;
        this.f16208x = f10;
        this.f16209y = f0Var2;
        this.B = f11;
        this.D = f12;
        this.E = i11;
        this.F = i12;
        this.G = f13;
        this.H = f14;
        this.I = f15;
        this.J = f16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h0.class == obj.getClass()) {
            h0 h0Var = (h0) obj;
            return br.l.a(this.f16204a, h0Var.f16204a) && br.l.a(this.f16207r, h0Var.f16207r) && this.f16208x == h0Var.f16208x && br.l.a(this.f16209y, h0Var.f16209y) && this.B == h0Var.B && this.D == h0Var.D && this.E == h0Var.E && this.F == h0Var.F && this.G == h0Var.G && this.H == h0Var.H && this.I == h0Var.I && this.J == h0Var.J && this.f16206g == h0Var.f16206g && br.l.a(this.f16205d, h0Var.f16205d);
        }
        return false;
    }

    public final int hashCode() {
        int iC = h0.b.c(this.f16204a.hashCode() * 31, 31, this.f16205d);
        g1.f0 f0Var = this.f16207r;
        int iA = w.g.a((iC + (f0Var != null ? f0Var.hashCode() : 0)) * 31, this.f16208x, 31);
        g1.f0 f0Var2 = this.f16209y;
        return Integer.hashCode(this.f16206g) + w.g.a(w.g.a(w.g.a(w.g.a(c7.a.C(this.F, c7.a.C(this.E, w.g.a(w.g.a((iA + (f0Var2 != null ? f0Var2.hashCode() : 0)) * 31, this.B, 31), this.D, 31), 31), 31), this.G, 31), this.H, 31), this.I, 31), this.J, 31);
    }
}
