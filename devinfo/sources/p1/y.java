package p1;

import i2.d1;
import i2.v0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
final class y extends v0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f31024a;

    /* renamed from: b, reason: collision with root package name */
    public final float f31025b;

    /* renamed from: c, reason: collision with root package name */
    public final float f31026c;

    /* renamed from: d, reason: collision with root package name */
    public final long f31027d;

    /* renamed from: e, reason: collision with root package name */
    public final j0 f31028e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f31029f;
    public final long g;

    /* renamed from: h, reason: collision with root package name */
    public final long f31030h;

    public y(float f10, float f11, float f12, long j, j0 j0Var, boolean z3, long j8, long j9) {
        this.f31024a = f10;
        this.f31025b = f11;
        this.f31026c = f12;
        this.f31027d = j;
        this.f31028e = j0Var;
        this.f31029f = z3;
        this.g = j8;
        this.f31030h = j9;
    }

    @Override // i2.v0
    public final i1.m d() {
        k0 k0Var = new k0();
        k0Var.f30990o = this.f31024a;
        k0Var.f30991p = this.f31025b;
        k0Var.f30992q = 1.0f;
        k0Var.f30993r = this.f31026c;
        k0Var.f30994s = 8.0f;
        k0Var.f30995t = this.f31027d;
        k0Var.f30996u = this.f31028e;
        k0Var.f30997v = this.f31029f;
        k0Var.f30998w = this.g;
        k0Var.f30999x = this.f31030h;
        k0Var.f31000y = 3;
        k0Var.f31001z = new c2.l0(19, k0Var);
        return k0Var;
    }

    @Override // i2.v0
    public final void e(i1.m mVar) {
        d1 d1Var;
        k0 k0Var = (k0) mVar;
        k0Var.f30990o = this.f31024a;
        k0Var.f30991p = this.f31025b;
        k0Var.f30992q = 1.0f;
        k0Var.f30993r = this.f31026c;
        k0Var.f30994s = 8.0f;
        k0Var.f30995t = this.f31027d;
        k0Var.f30996u = this.f31028e;
        k0Var.f30997v = this.f31029f;
        k0Var.f30998w = this.g;
        k0Var.f30999x = this.f31030h;
        k0Var.f31000y = 3;
        c2.l0 l0Var = k0Var.f31001z;
        if (k0Var.f25554a.f25565n && (d1Var = i2.k.q(k0Var, 2).f25611p) != null) {
            d1Var.U0(l0Var, true);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y) {
            y yVar = (y) obj;
            if (Float.compare(this.f31024a, yVar.f31024a) == 0 && Float.compare(this.f31025b, yVar.f31025b) == 0 && Float.compare(1.0f, 1.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(this.f31026c, yVar.f31026c) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(8.0f, 8.0f) == 0) {
                long j = yVar.f31027d;
                int i4 = m0.f31007b;
                if (this.f31027d == j && nk.k.a(this.f31028e, yVar.f31028e) && this.f31029f == yVar.f31029f && s.c(this.g, yVar.g) && s.c(this.f31030h, yVar.f31030h)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iD = r5.c.d(8.0f, r5.c.d(0.0f, r5.c.d(0.0f, r5.c.d(0.0f, r5.c.d(this.f31026c, r5.c.d(0.0f, r5.c.d(0.0f, r5.c.d(1.0f, r5.c.d(this.f31025b, Float.floatToIntBits(this.f31024a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
        int i4 = m0.f31007b;
        long j = this.f31027d;
        int iHashCode = (((this.f31028e.hashCode() + ((iD + ((int) (j ^ (j >>> 32)))) * 31)) * 31) + (this.f31029f ? 1231 : 1237)) * 961;
        int i10 = s.f31019i;
        return (((yj.q.a(this.f31030h) + a0.g.f(iHashCode, 31, this.g)) * 961) + 3) * 31;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GraphicsLayerElement(scaleX=");
        sb2.append(this.f31024a);
        sb2.append(", scaleY=");
        sb2.append(this.f31025b);
        sb2.append(", alpha=1.0, translationX=0.0, translationY=0.0, shadowElevation=");
        sb2.append(this.f31026c);
        sb2.append(", rotationX=0.0, rotationY=0.0, rotationZ=0.0, cameraDistance=8.0, transformOrigin=");
        int i4 = m0.f31007b;
        sb2.append((Object) ("TransformOrigin(packedValue=" + this.f31027d + ')'));
        sb2.append(", shape=");
        sb2.append(this.f31028e);
        sb2.append(", clip=");
        sb2.append(this.f31029f);
        sb2.append(", renderEffect=null, ambientShadowColor=");
        a0.g.w(this.g, ", spotShadowColor=", sb2);
        sb2.append((Object) s.i(this.f31030h));
        sb2.append(", compositingStrategy=CompositingStrategy(value=0), blendMode=");
        sb2.append((Object) z.w(3));
        sb2.append(", colorFilter=null)");
        return sb2.toString();
    }
}
