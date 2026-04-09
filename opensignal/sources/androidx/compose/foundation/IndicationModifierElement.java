package androidx.compose.foundation;

import a0.i;
import kotlin.Metadata;
import x1.z0;
import y.p;
import y.q;
import z0.l;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/IndicationModifierElement;", "Lx1/z0;", "Ly/p;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class IndicationModifierElement extends z0 {

    /* renamed from: a, reason: collision with root package name */
    public final i f1069a;

    /* renamed from: b, reason: collision with root package name */
    public final q f1070b;

    public IndicationModifierElement(i iVar, q qVar) {
        this.f1069a = iVar;
        this.f1070b = qVar;
    }

    @Override // x1.z0
    public final l d() {
        x1.i iVarA = this.f1070b.a(this.f1069a);
        p pVar = new p();
        pVar.f25611r = iVarA;
        pVar.c0(iVarA);
        return pVar;
    }

    @Override // x1.z0
    public final void e(l lVar) {
        p pVar = (p) lVar;
        x1.i iVarA = this.f1070b.a(this.f1069a);
        pVar.d0(pVar.f25611r);
        pVar.f25611r = iVarA;
        pVar.c0(iVarA);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IndicationModifierElement)) {
            return false;
        }
        IndicationModifierElement indicationModifierElement = (IndicationModifierElement) obj;
        return br.l.a(this.f1069a, indicationModifierElement.f1069a) && br.l.a(this.f1070b, indicationModifierElement.f1070b);
    }

    public final int hashCode() {
        return this.f1070b.hashCode() + (this.f1069a.hashCode() * 31);
    }
}
