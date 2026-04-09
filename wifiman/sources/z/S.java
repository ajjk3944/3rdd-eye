package z;

import C0.InterfaceC2534n;

/* loaded from: classes.dex */
public abstract class S {
    public static final AbstractC8690m a(V v10) {
        if (v10 != null) {
            return v10.a();
        }
        return null;
    }

    public static final boolean b(V v10) {
        if (v10 != null) {
            return v10.b();
        }
        return true;
    }

    public static final V c(InterfaceC2534n interfaceC2534n) {
        Object objB = interfaceC2534n.b();
        if (objB instanceof V) {
            return (V) objB;
        }
        return null;
    }

    public static final V d(androidx.compose.ui.layout.t tVar) {
        Object objB = tVar.b();
        if (objB instanceof V) {
            return (V) objB;
        }
        return null;
    }

    public static final float e(V v10) {
        if (v10 != null) {
            return v10.d();
        }
        return 0.0f;
    }

    public static final boolean f(V v10) {
        AbstractC8690m abstractC8690mA = a(v10);
        if (abstractC8690mA != null) {
            return abstractC8690mA.c();
        }
        return false;
    }
}
