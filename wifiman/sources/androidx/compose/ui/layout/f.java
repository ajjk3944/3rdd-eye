package androidx.compose.ui.layout;

import C0.B;
import C0.InterfaceC2540u;

/* loaded from: classes.dex */
public abstract class f {
    public static final Object a(B b10) {
        Object objB = b10.b();
        InterfaceC2540u interfaceC2540u = objB instanceof InterfaceC2540u ? (InterfaceC2540u) objB : null;
        if (interfaceC2540u != null) {
            return interfaceC2540u.g0();
        }
        return null;
    }

    public static final androidx.compose.ui.e b(androidx.compose.ui.e eVar, Object obj) {
        return eVar.b0(new LayoutIdElement(obj));
    }
}
