package w;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import q.AbstractC7407z;
import r.InterfaceC7550z;
import s.AbstractC7841b;
import s.S;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public static final x f64038a = new x();

    private x() {
    }

    public final n a(InterfaceC3540l interfaceC3540l, int i10) {
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(1107739818, i10, -1, "androidx.compose.foundation.gestures.ScrollableDefaults.flingBehavior (Scrollable.kt:570)");
        }
        InterfaceC7550z interfaceC7550zB = AbstractC7407z.b(interfaceC3540l, 0);
        boolean zT = interfaceC3540l.T(interfaceC7550zB);
        Object objF = interfaceC3540l.f();
        if (zT || objF == InterfaceC3540l.f21100a.a()) {
            objF = new h(interfaceC7550zB, null, 2, null);
            interfaceC3540l.K(objF);
        }
        h hVar = (h) objF;
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return hVar;
    }

    public final S b(InterfaceC3540l interfaceC3540l, int i10) {
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(1809802212, i10, -1, "androidx.compose.foundation.gestures.ScrollableDefaults.overscrollEffect (Scrollable.kt:583)");
        }
        S sA = AbstractC7841b.a(interfaceC3540l, 0);
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return sA;
    }

    public final boolean c(Y0.t tVar, q qVar, boolean z10) {
        return (tVar != Y0.t.Rtl || qVar == q.Vertical) ? !z10 : z10;
    }
}
