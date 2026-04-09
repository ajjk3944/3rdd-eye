package androidx.compose.ui.input.rotary;

import kotlin.Metadata;
import x1.z0;
import y1.n;
import z0.l;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/rotary/RotaryInputElement;", "Lx1/z0;", "Lt1/a;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class RotaryInputElement extends z0 {
    @Override // x1.z0
    public final l d() {
        n nVar = n.f25747x;
        t1.a aVar = new t1.a();
        aVar.f22380p = nVar;
        return aVar;
    }

    @Override // x1.z0
    public final void e(l lVar) {
        ((t1.a) lVar).f22380p = n.f25747x;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof RotaryInputElement);
    }

    public final int hashCode() {
        return n.f25747x.hashCode() * 31;
    }
}
