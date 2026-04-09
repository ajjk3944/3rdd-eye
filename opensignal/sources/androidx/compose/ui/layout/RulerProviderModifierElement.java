package androidx.compose.ui.layout;

import android.annotation.SuppressLint;
import kotlin.Metadata;
import v1.l;
import v1.z;
import x1.f0;
import x1.k;
import x1.z0;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/RulerProviderModifierElement;", "Lx1/z0;", "Lv1/z;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ModifierNodeInspectableProperties"})
/* loaded from: classes.dex */
final class RulerProviderModifierElement extends z0 {

    /* renamed from: a, reason: collision with root package name */
    public final l f1147a;

    public RulerProviderModifierElement(l lVar) {
        this.f1147a = lVar;
    }

    @Override // x1.z0
    public final z0.l d() {
        return new z(this.f1147a);
    }

    @Override // x1.z0
    public final void e(z0.l lVar) {
        z zVar = (z) lVar;
        l lVar2 = zVar.f23820p;
        l lVar3 = this.f1147a;
        if (lVar2 != lVar3) {
            zVar.f23820p = lVar3;
            f0.n0(k.r(zVar), false, 7);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        RulerProviderModifierElement rulerProviderModifierElement = obj instanceof RulerProviderModifierElement ? (RulerProviderModifierElement) obj : null;
        return (rulerProviderModifierElement != null ? rulerProviderModifierElement.f1147a : null) == this.f1147a;
    }

    public final int hashCode() {
        return this.f1147a.hashCode();
    }
}
