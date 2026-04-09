package androidx.compose.foundation.layout;

import c0.r;
import kotlin.Metadata;
import x1.z0;
import z0.l;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/LayoutWeightElement;", "Lx1/z0;", "Lc0/r;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LayoutWeightElement extends z0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f1073a;

    public LayoutWeightElement(float f10) {
        this.f1073a = f10;
    }

    @Override // x1.z0
    public final l d() {
        r rVar = new r();
        rVar.f3099p = this.f1073a;
        rVar.f3100q = true;
        return rVar;
    }

    @Override // x1.z0
    public final void e(l lVar) {
        r rVar = (r) lVar;
        rVar.f3099p = this.f1073a;
        rVar.f3100q = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        LayoutWeightElement layoutWeightElement = obj instanceof LayoutWeightElement ? (LayoutWeightElement) obj : null;
        return layoutWeightElement != null && this.f1073a == layoutWeightElement.f1073a;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (Float.hashCode(this.f1073a) * 31);
    }
}
