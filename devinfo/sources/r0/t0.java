package r0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
final class t0 extends i2.v0 {

    /* renamed from: a, reason: collision with root package name */
    public final e0.i f32658a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f32659b;

    /* renamed from: c, reason: collision with root package name */
    public final a0.z f32660c;

    public t0(e0.i iVar, boolean z3, a0.z zVar) {
        this.f32658a = iVar;
        this.f32659b = z3;
        this.f32660c = zVar;
    }

    @Override // i2.v0
    public final i1.m d() {
        v0 v0Var = new v0();
        v0Var.f32675o = this.f32658a;
        v0Var.f32676p = this.f32659b;
        v0Var.f32677q = this.f32660c;
        v0Var.f32681u = Float.NaN;
        v0Var.f32682v = Float.NaN;
        return v0Var;
    }

    @Override // i2.v0
    public final void e(i1.m mVar) {
        v0 v0Var = (v0) mVar;
        v0Var.f32675o = this.f32658a;
        boolean z3 = v0Var.f32676p;
        boolean z10 = this.f32659b;
        if (z3 != z10) {
            i2.k.k(v0Var);
        }
        v0Var.f32676p = z10;
        v0Var.f32677q = this.f32660c;
        if (v0Var.f32680t == null && !Float.isNaN(v0Var.f32682v)) {
            v0Var.f32680t = a0.f.a(v0Var.f32682v);
        }
        if (v0Var.f32679s != null || Float.isNaN(v0Var.f32681u)) {
            return;
        }
        v0Var.f32679s = a0.f.a(v0Var.f32681u);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return nk.k.a(this.f32658a, t0Var.f32658a) && this.f32659b == t0Var.f32659b && nk.k.a(this.f32660c, t0Var.f32660c);
    }

    public final int hashCode() {
        return this.f32660c.hashCode() + (((this.f32658a.hashCode() * 31) + (this.f32659b ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        return "ThumbElement(interactionSource=" + this.f32658a + ", checked=" + this.f32659b + ", animationSpec=" + this.f32660c + ')';
    }
}
