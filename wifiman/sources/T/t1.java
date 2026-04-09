package T;

import Zg.AbstractC3682n;

/* loaded from: classes.dex */
abstract /* synthetic */ class t1 {
    public static final androidx.compose.runtime.snapshots.k a() {
        return new androidx.compose.runtime.snapshots.k();
    }

    public static final androidx.compose.runtime.snapshots.k b(Object... objArr) {
        androidx.compose.runtime.snapshots.k kVar = new androidx.compose.runtime.snapshots.k();
        kVar.addAll(AbstractC3682n.d1(objArr));
        return kVar;
    }

    public static final InterfaceC3551q0 c(Object obj, n1 n1Var) {
        return AbstractC3514b.d(obj, n1Var);
    }

    public static /* synthetic */ InterfaceC3551q0 d(Object obj, n1 n1Var, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            n1Var = o1.p();
        }
        return o1.h(obj, n1Var);
    }

    public static final z1 e(Object obj, InterfaceC3540l interfaceC3540l, int i10) {
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-1058319986, i10, -1, "androidx.compose.runtime.rememberUpdatedState (SnapshotState.kt:309)");
        }
        Object objF = interfaceC3540l.f();
        if (objF == InterfaceC3540l.f21100a.a()) {
            objF = d(obj, null, 2, null);
            interfaceC3540l.K(objF);
        }
        InterfaceC3551q0 interfaceC3551q0 = (InterfaceC3551q0) objF;
        interfaceC3551q0.setValue(obj);
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return interfaceC3551q0;
    }
}
