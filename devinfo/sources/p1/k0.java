package p1;

import g2.s0;
import i2.u1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class k0 extends i1.m implements i2.u, u1 {

    /* renamed from: o, reason: collision with root package name */
    public float f30990o;

    /* renamed from: p, reason: collision with root package name */
    public float f30991p;

    /* renamed from: q, reason: collision with root package name */
    public float f30992q;

    /* renamed from: r, reason: collision with root package name */
    public float f30993r;

    /* renamed from: s, reason: collision with root package name */
    public float f30994s;

    /* renamed from: t, reason: collision with root package name */
    public long f30995t;

    /* renamed from: u, reason: collision with root package name */
    public j0 f30996u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f30997v;

    /* renamed from: w, reason: collision with root package name */
    public long f30998w;

    /* renamed from: x, reason: collision with root package name */
    public long f30999x;

    /* renamed from: y, reason: collision with root package name */
    public int f31000y;

    /* renamed from: z, reason: collision with root package name */
    public c2.l0 f31001z;

    @Override // i2.u
    public final /* synthetic */ int L(i2.m0 m0Var, g2.i0 i0Var, int i4) {
        return d.h.d(this, m0Var, i0Var, i4);
    }

    @Override // i2.u
    public final /* synthetic */ int S(i2.m0 m0Var, g2.i0 i0Var, int i4) {
        return d.h.h(this, m0Var, i0Var, i4);
    }

    @Override // i2.u1
    public final /* synthetic */ boolean Y() {
        return false;
    }

    @Override // i2.u
    public final g2.k0 a0(g2.l0 l0Var, g2.i0 i0Var, long j) {
        s0 s0VarV = i0Var.v(j);
        return l0Var.O(s0VarV.f24408a, s0VarV.f24409b, zj.t.f38318a, new c2.w(12, s0VarV, this));
    }

    @Override // i2.u1
    public final boolean b() {
        return false;
    }

    @Override // i1.m
    public final boolean c0() {
        return false;
    }

    @Override // i2.u
    public final /* synthetic */ int h(i2.m0 m0Var, g2.i0 i0Var, int i4) {
        return d.h.f(this, m0Var, i0Var, i4);
    }

    @Override // i2.u1
    public final void l(p2.x xVar) {
        if (this.f30997v) {
            p2.v.b(xVar, this.f30996u);
        }
    }

    @Override // i2.u
    public final /* synthetic */ int t(i2.m0 m0Var, g2.i0 i0Var, int i4) {
        return d.h.b(this, m0Var, i0Var, i4);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SimpleGraphicsLayerModifier(scaleX=");
        sb2.append(this.f30990o);
        sb2.append(", scaleY=");
        sb2.append(this.f30991p);
        sb2.append(", alpha = ");
        sb2.append(this.f30992q);
        sb2.append(", translationX=0.0, translationY=0.0, shadowElevation=");
        sb2.append(this.f30993r);
        sb2.append(", rotationX=0.0, rotationY=0.0, rotationZ=0.0, cameraDistance=");
        sb2.append(this.f30994s);
        sb2.append(", transformOrigin=");
        long j = this.f30995t;
        int i4 = m0.f31007b;
        sb2.append((Object) ("TransformOrigin(packedValue=" + j + ')'));
        sb2.append(", shape=");
        sb2.append(this.f30996u);
        sb2.append(", clip=");
        sb2.append(this.f30997v);
        sb2.append(", renderEffect=null, ambientShadowColor=");
        a0.g.w(this.f30998w, ", spotShadowColor=", sb2);
        a0.g.w(this.f30999x, ", compositingStrategy=CompositingStrategy(value=0), blendMode=", sb2);
        sb2.append((Object) z.w(this.f31000y));
        sb2.append(", colorFilter=null)");
        return sb2.toString();
    }

    @Override // i2.u1
    public final /* synthetic */ boolean v() {
        return false;
    }
}
