package g0;

import i2.v0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
final class m0 extends v0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f24154a;

    /* renamed from: b, reason: collision with root package name */
    public final float f24155b;

    public m0(float f10, float f11) {
        this.f24154a = f10;
        this.f24155b = f11;
    }

    @Override // i2.v0
    public final i1.m d() {
        n0 n0Var = new n0();
        n0Var.f24161o = this.f24154a;
        n0Var.f24162p = this.f24155b;
        return n0Var;
    }

    @Override // i2.v0
    public final void e(i1.m mVar) {
        n0 n0Var = (n0) mVar;
        n0Var.f24161o = this.f24154a;
        n0Var.f24162p = this.f24155b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return d3.f.b(this.f24154a, m0Var.f24154a) && d3.f.b(this.f24155b, m0Var.f24155b);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f24155b) + (Float.floatToIntBits(this.f24154a) * 31);
    }
}
