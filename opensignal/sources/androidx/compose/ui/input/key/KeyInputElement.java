package androidx.compose.ui.input.key;

import kotlin.Metadata;
import q1.d;
import x1.z0;
import y1.p;
import z0.l;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/key/KeyInputElement;", "Lx1/z0;", "Lq1/d;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class KeyInputElement extends z0 {

    /* renamed from: a, reason: collision with root package name */
    public final p f1146a;

    public KeyInputElement(p pVar) {
        this.f1146a = pVar;
    }

    @Override // x1.z0
    public final l d() {
        d dVar = new d();
        dVar.f20672p = this.f1146a;
        return dVar;
    }

    @Override // x1.z0
    public final void e(l lVar) {
        ((d) lVar).f20672p = this.f1146a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof KeyInputElement) {
            return this.f1146a == ((KeyInputElement) obj).f1146a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f1146a.hashCode() * 31;
    }
}
