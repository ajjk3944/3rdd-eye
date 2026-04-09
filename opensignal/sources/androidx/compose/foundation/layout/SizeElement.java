package androidx.compose.foundation.layout;

import c0.z;
import kotlin.Metadata;
import t2.f;
import w.g;
import x1.z0;
import z0.l;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/SizeElement;", "Lx1/z0;", "Lc0/z;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class SizeElement extends z0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f1078a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1079b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1080c;

    /* renamed from: d, reason: collision with root package name */
    public final float f1081d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f1082e;

    public SizeElement(float f10, float f11, float f12, float f13) {
        this.f1078a = f10;
        this.f1079b = f11;
        this.f1080c = f12;
        this.f1081d = f13;
        this.f1082e = true;
    }

    @Override // x1.z0
    public final l d() {
        z zVar = new z();
        zVar.f3114p = this.f1078a;
        zVar.f3115q = this.f1079b;
        zVar.f3116r = this.f1080c;
        zVar.f3117s = this.f1081d;
        zVar.f3118t = this.f1082e;
        return zVar;
    }

    @Override // x1.z0
    public final void e(l lVar) {
        z zVar = (z) lVar;
        zVar.f3114p = this.f1078a;
        zVar.f3115q = this.f1079b;
        zVar.f3116r = this.f1080c;
        zVar.f3117s = this.f1081d;
        zVar.f3118t = this.f1082e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeElement)) {
            return false;
        }
        SizeElement sizeElement = (SizeElement) obj;
        return f.a(this.f1078a, sizeElement.f1078a) && f.a(this.f1079b, sizeElement.f1079b) && f.a(this.f1080c, sizeElement.f1080c) && f.a(this.f1081d, sizeElement.f1081d) && this.f1082e == sizeElement.f1082e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f1082e) + g.a(g.a(g.a(Float.hashCode(this.f1078a) * 31, this.f1079b, 31), this.f1080c, 31), this.f1081d, 31);
    }

    public /* synthetic */ SizeElement(float f10, float f11, float f12, float f13, int i10) {
        this((i10 & 1) != 0 ? Float.NaN : f10, (i10 & 2) != 0 ? Float.NaN : f11, (i10 & 4) != 0 ? Float.NaN : f12, (i10 & 8) != 0 ? Float.NaN : f13);
    }
}
