package g1;

import androidx.compose.ui.semantics.SemanticsConfiguration;
import x1.m0;
import x1.t1;

/* loaded from: classes.dex */
public final class j0 extends z0.l implements x1.v, t1 {

    /* renamed from: p, reason: collision with root package name */
    public float f9242p;

    /* renamed from: q, reason: collision with root package name */
    public float f9243q;

    /* renamed from: r, reason: collision with root package name */
    public float f9244r;

    /* renamed from: s, reason: collision with root package name */
    public float f9245s;

    /* renamed from: t, reason: collision with root package name */
    public long f9246t;

    /* renamed from: u, reason: collision with root package name */
    public i0 f9247u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f9248v;

    /* renamed from: w, reason: collision with root package name */
    public long f9249w;

    /* renamed from: x, reason: collision with root package name */
    public long f9250x;

    /* renamed from: y, reason: collision with root package name */
    public int f9251y;

    /* renamed from: z, reason: collision with root package name */
    public as.d f9252z;

    @Override // x1.v
    public final x1.l0 K(m0 m0Var, v1.q qVar, long j) {
        v1.v vVarS = qVar.s(j);
        return m0Var.g0(vVarS.f23809b, vVarS.f23810c, mq.x.f16946a, new c7.b(vVarS, 8, this));
    }

    @Override // z0.l
    public final boolean R() {
        return false;
    }

    @Override // x1.t1
    public final boolean c() {
        return false;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SimpleGraphicsLayerModifier(scaleX=");
        sb2.append(this.f9242p);
        sb2.append(", scaleY=");
        sb2.append(this.f9243q);
        sb2.append(", alpha = ");
        sb2.append(this.f9244r);
        sb2.append(", translationX=0.0, translationY=0.0, shadowElevation=0.0, rotationX=0.0, rotationY=0.0, rotationZ=0.0, cameraDistance=");
        sb2.append(this.f9245s);
        sb2.append(", transformOrigin=");
        long j = this.f9246t;
        int i10 = l0.f9256b;
        sb2.append((Object) ("TransformOrigin(packedValue=" + j + ')'));
        sb2.append(", shape=");
        sb2.append(this.f9247u);
        sb2.append(", clip=");
        sb2.append(this.f9248v);
        sb2.append(", renderEffect=null, ambientShadowColor=");
        h0.b.A(this.f9249w, ", spotShadowColor=", sb2);
        h0.b.A(this.f9250x, ", compositingStrategy=CompositingStrategy(value=0), blendMode=", sb2);
        sb2.append((Object) f0.u(this.f9251y));
        sb2.append(", colorFilter=null)");
        return sb2.toString();
    }

    @Override // x1.t1
    public final void O(SemanticsConfiguration semanticsConfiguration) {
    }
}
