package androidx.compose.ui.graphics;

import as.d;
import g1.f0;
import g1.i0;
import g1.j0;
import g1.l0;
import g1.r;
import h0.b;
import kotlin.Metadata;
import w.g;
import x1.f1;
import x1.k;
import x1.z0;
import z0.l;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/GraphicsLayerElement;", "Lx1/z0;", "Lg1/j0;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class GraphicsLayerElement extends z0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f1128a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1129b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1130c;

    /* renamed from: d, reason: collision with root package name */
    public final long f1131d;

    /* renamed from: e, reason: collision with root package name */
    public final i0 f1132e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f1133f;

    /* renamed from: g, reason: collision with root package name */
    public final long f1134g;

    /* renamed from: h, reason: collision with root package name */
    public final long f1135h;

    public GraphicsLayerElement(float f10, float f11, float f12, long j, i0 i0Var, boolean z10, long j7, long j10) {
        this.f1128a = f10;
        this.f1129b = f11;
        this.f1130c = f12;
        this.f1131d = j;
        this.f1132e = i0Var;
        this.f1133f = z10;
        this.f1134g = j7;
        this.f1135h = j10;
    }

    @Override // x1.z0
    public final l d() {
        j0 j0Var = new j0();
        j0Var.f9242p = this.f1128a;
        j0Var.f9243q = this.f1129b;
        j0Var.f9244r = this.f1130c;
        j0Var.f9245s = 8.0f;
        j0Var.f9246t = this.f1131d;
        j0Var.f9247u = this.f1132e;
        j0Var.f9248v = this.f1133f;
        j0Var.f9249w = this.f1134g;
        j0Var.f9250x = this.f1135h;
        j0Var.f9251y = 3;
        j0Var.f9252z = new d(16, j0Var);
        return j0Var;
    }

    @Override // x1.z0
    public final void e(l lVar) {
        j0 j0Var = (j0) lVar;
        j0Var.f9242p = this.f1128a;
        j0Var.f9243q = this.f1129b;
        j0Var.f9244r = this.f1130c;
        j0Var.f9245s = 8.0f;
        j0Var.f9246t = this.f1131d;
        j0Var.f9247u = this.f1132e;
        j0Var.f9248v = this.f1133f;
        j0Var.f9249w = this.f1134g;
        j0Var.f9250x = this.f1135h;
        j0Var.f9251y = 3;
        f1 f1Var = k.q(j0Var, 2).f24822p;
        if (f1Var != null) {
            f1Var.S0(j0Var.f9252z, true);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GraphicsLayerElement) {
            GraphicsLayerElement graphicsLayerElement = (GraphicsLayerElement) obj;
            if (Float.compare(this.f1128a, graphicsLayerElement.f1128a) == 0 && Float.compare(this.f1129b, graphicsLayerElement.f1129b) == 0 && Float.compare(this.f1130c, graphicsLayerElement.f1130c) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(8.0f, 8.0f) == 0) {
                long j = graphicsLayerElement.f1131d;
                int i10 = l0.f9256b;
                if (this.f1131d == j && br.l.a(this.f1132e, graphicsLayerElement.f1132e) && this.f1133f == graphicsLayerElement.f1133f && r.c(this.f1134g, graphicsLayerElement.f1134g) && r.c(this.f1135h, graphicsLayerElement.f1135h)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iA = g.a(g.a(g.a(g.a(g.a(g.a(g.a(g.a(g.a(Float.hashCode(this.f1128a) * 31, this.f1129b, 31), this.f1130c, 31), 0.0f, 31), 0.0f, 31), 0.0f, 31), 0.0f, 31), 0.0f, 31), 0.0f, 31), 8.0f, 31);
        int i10 = l0.f9256b;
        int iB = g.b((this.f1132e.hashCode() + b.b(iA, 31, this.f1131d)) * 31, this.f1133f, 961);
        int i11 = r.f9270h;
        return c7.a.C(3, c7.a.C(0, b.b(b.b(iB, 31, this.f1134g), 31, this.f1135h), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GraphicsLayerElement(scaleX=");
        sb2.append(this.f1128a);
        sb2.append(", scaleY=");
        sb2.append(this.f1129b);
        sb2.append(", alpha=");
        sb2.append(this.f1130c);
        sb2.append(", translationX=0.0, translationY=0.0, shadowElevation=0.0, rotationX=0.0, rotationY=0.0, rotationZ=0.0, cameraDistance=8.0, transformOrigin=");
        int i10 = l0.f9256b;
        sb2.append((Object) ("TransformOrigin(packedValue=" + this.f1131d + ')'));
        sb2.append(", shape=");
        sb2.append(this.f1132e);
        sb2.append(", clip=");
        sb2.append(this.f1133f);
        sb2.append(", renderEffect=null, ambientShadowColor=");
        b.A(this.f1134g, ", spotShadowColor=", sb2);
        sb2.append((Object) r.i(this.f1135h));
        sb2.append(", compositingStrategy=CompositingStrategy(value=0), blendMode=");
        sb2.append((Object) f0.u(3));
        sb2.append(", colorFilter=null)");
        return sb2.toString();
    }
}
