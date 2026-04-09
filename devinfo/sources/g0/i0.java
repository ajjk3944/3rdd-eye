package g0;

import i2.v0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
final class i0 extends v0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f24126a;

    /* renamed from: b, reason: collision with root package name */
    public final float f24127b;

    /* renamed from: c, reason: collision with root package name */
    public final float f24128c;

    /* renamed from: d, reason: collision with root package name */
    public final float f24129d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f24130e;

    public i0(float f10, float f11, float f12, float f13, boolean z3) {
        this.f24126a = f10;
        this.f24127b = f11;
        this.f24128c = f12;
        this.f24129d = f13;
        this.f24130e = z3;
    }

    @Override // i2.v0
    public final i1.m d() {
        k0 k0Var = new k0();
        k0Var.f24145o = this.f24126a;
        k0Var.f24146p = this.f24127b;
        k0Var.f24147q = this.f24128c;
        k0Var.f24148r = this.f24129d;
        k0Var.f24149s = this.f24130e;
        return k0Var;
    }

    @Override // i2.v0
    public final void e(i1.m mVar) {
        k0 k0Var = (k0) mVar;
        k0Var.f24145o = this.f24126a;
        k0Var.f24146p = this.f24127b;
        k0Var.f24147q = this.f24128c;
        k0Var.f24148r = this.f24129d;
        k0Var.f24149s = this.f24130e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return d3.f.b(this.f24126a, i0Var.f24126a) && d3.f.b(this.f24127b, i0Var.f24127b) && d3.f.b(this.f24128c, i0Var.f24128c) && d3.f.b(this.f24129d, i0Var.f24129d) && this.f24130e == i0Var.f24130e;
    }

    public final int hashCode() {
        return r5.c.d(this.f24129d, r5.c.d(this.f24128c, r5.c.d(this.f24127b, Float.floatToIntBits(this.f24126a) * 31, 31), 31), 31) + (this.f24130e ? 1231 : 1237);
    }

    public /* synthetic */ i0(float f10, float f11, float f12, float f13, int i4) {
        this((i4 & 1) != 0 ? Float.NaN : f10, (i4 & 2) != 0 ? Float.NaN : f11, (i4 & 4) != 0 ? Float.NaN : f12, (i4 & 8) != 0 ? Float.NaN : f13, true);
    }
}
