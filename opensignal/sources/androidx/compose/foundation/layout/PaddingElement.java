package androidx.compose.foundation.layout;

import c0.t;
import kotlin.Metadata;
import t2.f;
import w.g;
import x1.z0;
import z0.l;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/PaddingElement;", "Lx1/z0;", "Lc0/t;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class PaddingElement extends z0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f1074a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1075b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1076c;

    /* renamed from: d, reason: collision with root package name */
    public final float f1077d;

    public PaddingElement(float f10, float f11, float f12, float f13) {
        this.f1074a = f10;
        this.f1075b = f11;
        this.f1076c = f12;
        this.f1077d = f13;
        boolean z10 = true;
        boolean z11 = (f10 >= 0.0f || Float.isNaN(f10)) & (f11 >= 0.0f || Float.isNaN(f11)) & (f12 >= 0.0f || Float.isNaN(f12));
        if (f13 < 0.0f && !Float.isNaN(f13)) {
            z10 = false;
        }
        if (!z11 || !z10) {
            d0.a.a("Padding must be non-negative");
        }
    }

    @Override // x1.z0
    public final l d() {
        t tVar = new t();
        tVar.f3104p = this.f1074a;
        tVar.f3105q = this.f1075b;
        tVar.f3106r = this.f1076c;
        tVar.f3107s = this.f1077d;
        tVar.f3108t = true;
        return tVar;
    }

    @Override // x1.z0
    public final void e(l lVar) {
        t tVar = (t) lVar;
        tVar.f3104p = this.f1074a;
        tVar.f3105q = this.f1075b;
        tVar.f3106r = this.f1076c;
        tVar.f3107s = this.f1077d;
        tVar.f3108t = true;
    }

    public final boolean equals(Object obj) {
        PaddingElement paddingElement = obj instanceof PaddingElement ? (PaddingElement) obj : null;
        return paddingElement != null && f.a(this.f1074a, paddingElement.f1074a) && f.a(this.f1075b, paddingElement.f1075b) && f.a(this.f1076c, paddingElement.f1076c) && f.a(this.f1077d, paddingElement.f1077d);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + g.a(g.a(g.a(Float.hashCode(this.f1074a) * 31, this.f1075b, 31), this.f1076c, 31), this.f1077d, 31);
    }
}
