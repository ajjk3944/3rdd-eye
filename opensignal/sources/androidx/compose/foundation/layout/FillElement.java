package androidx.compose.foundation.layout;

import c0.n;
import c0.p;
import kotlin.Metadata;
import x1.z0;
import z0.l;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/FillElement;", "Lx1/z0;", "Lc0/p;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FillElement extends z0 {

    /* renamed from: a, reason: collision with root package name */
    public final n f1072a;

    public FillElement(n nVar) {
        this.f1072a = nVar;
    }

    @Override // x1.z0
    public final l d() {
        p pVar = new p();
        pVar.f3097p = this.f1072a;
        pVar.f3098q = 1.0f;
        return pVar;
    }

    @Override // x1.z0
    public final void e(l lVar) {
        p pVar = (p) lVar;
        pVar.f3097p = this.f1072a;
        pVar.f3098q = 1.0f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FillElement) {
            return this.f1072a == ((FillElement) obj).f1072a;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(1.0f) + (this.f1072a.hashCode() * 31);
    }
}
