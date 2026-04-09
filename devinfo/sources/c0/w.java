package c0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class w extends i2.v0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f2519a;

    /* renamed from: b, reason: collision with root package name */
    public final p1.l0 f2520b;

    /* renamed from: c, reason: collision with root package name */
    public final p1.j0 f2521c;

    public w(float f10, p1.l0 l0Var, p1.j0 j0Var) {
        this.f2519a = f10;
        this.f2520b = l0Var;
        this.f2521c = j0Var;
    }

    @Override // i2.v0
    public final i1.m d() {
        return new v(this.f2519a, this.f2520b, this.f2521c);
    }

    @Override // i2.v0
    public final void e(i1.m mVar) {
        v vVar = (v) mVar;
        float f10 = vVar.f2512r;
        m1.b bVar = vVar.f2515u;
        float f11 = this.f2519a;
        if (!d3.f.b(f10, f11)) {
            vVar.f2512r = f11;
            bVar.p0();
        }
        p1.l0 l0Var = vVar.f2513s;
        p1.l0 l0Var2 = this.f2520b;
        if (!nk.k.a(l0Var, l0Var2)) {
            vVar.f2513s = l0Var2;
            bVar.p0();
        }
        p1.j0 j0Var = vVar.f2514t;
        p1.j0 j0Var2 = this.f2521c;
        if (nk.k.a(j0Var, j0Var2)) {
            return;
        }
        vVar.f2514t = j0Var2;
        bVar.p0();
        i2.k.l(vVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return d3.f.b(this.f2519a, wVar.f2519a) && this.f2520b.equals(wVar.f2520b) && nk.k.a(this.f2521c, wVar.f2521c);
    }

    public final int hashCode() {
        return this.f2521c.hashCode() + ((this.f2520b.hashCode() + (Float.floatToIntBits(this.f2519a) * 31)) * 31);
    }

    public final String toString() {
        return "BorderModifierNodeElement(width=" + ((Object) d3.f.c(this.f2519a)) + ", brush=" + this.f2520b + ", shape=" + this.f2521c + ')';
    }
}
