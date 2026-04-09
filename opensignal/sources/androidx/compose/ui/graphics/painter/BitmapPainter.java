package androidx.compose.ui.graphics.painter;

import br.l;
import g1.g;
import g1.m;
import h0.b;
import i1.d;
import ir.f0;
import kc.f;
import kotlin.Metadata;
import l1.a;
import x1.h0;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/painter/BitmapPainter;", "Ll1/a;", "ui-graphics_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BitmapPainter extends a {

    /* renamed from: e, reason: collision with root package name */
    public final g f1136e;

    /* renamed from: f, reason: collision with root package name */
    public final long f1137f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1138g = 1;

    /* renamed from: h, reason: collision with root package name */
    public final long f1139h;

    /* renamed from: i, reason: collision with root package name */
    public float f1140i;
    public m j;

    public BitmapPainter(g gVar) {
        int i10;
        int i11;
        long width = (gVar.f9217a.getWidth() << 32) | (gVar.f9217a.getHeight() & 4294967295L);
        this.f1136e = gVar;
        this.f1137f = width;
        if (((int) 0) < 0 || ((int) 0) < 0 || (i10 = (int) (width >> 32)) < 0 || (i11 = (int) (width & 4294967295L)) < 0 || i10 > gVar.f9217a.getWidth() || i11 > gVar.f9217a.getHeight()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.f1139h = width;
        this.f1140i = 1.0f;
    }

    @Override // l1.a
    public final void a(float f10) {
        this.f1140i = f10;
    }

    @Override // l1.a
    public final void b(m mVar) {
        this.j = mVar;
    }

    @Override // l1.a
    public final long d() {
        return f.V(this.f1139h);
    }

    @Override // l1.a
    public final void e(h0 h0Var) {
        d.F(h0Var, this.f1136e, this.f1137f, (Math.round(Float.intBitsToFloat((int) (r1.C() & 4294967295L))) & 4294967295L) | (Math.round(Float.intBitsToFloat((int) (h0Var.f24844b.C() >> 32))) << 32), this.f1140i, this.j, this.f1138g, 328);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BitmapPainter)) {
            return false;
        }
        BitmapPainter bitmapPainter = (BitmapPainter) obj;
        return l.a(this.f1136e, bitmapPainter.f1136e) && i3.g.l(0L, 0L) && f0.t(this.f1137f, bitmapPainter.f1137f) && this.f1138g == bitmapPainter.f1138g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f1138g) + b.b(b.b(this.f1136e.hashCode() * 31, 31, 0L), 31, this.f1137f);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BitmapPainter(image=");
        sb2.append(this.f1136e);
        sb2.append(", srcOffset=");
        StringBuilder sb3 = new StringBuilder("(");
        sb3.append((int) (0 >> 32));
        sb3.append(", ");
        sb2.append((Object) c7.a.q(sb3, (int) (0 & 4294967295L), ')'));
        sb2.append(", srcSize=");
        sb2.append((Object) f0.Z(this.f1137f));
        sb2.append(", filterQuality=");
        int i10 = this.f1138g;
        sb2.append((Object) (i10 == 0 ? "None" : i10 == 1 ? "Low" : i10 == 2 ? "Medium" : i10 == 3 ? "High" : "Unknown"));
        sb2.append(')');
        return sb2.toString();
    }
}
