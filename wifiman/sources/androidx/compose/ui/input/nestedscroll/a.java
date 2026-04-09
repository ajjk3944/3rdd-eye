package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.e;
import x0.C8413b;
import x0.InterfaceC8412a;

/* loaded from: classes.dex */
public abstract class a {
    public static final e a(e eVar, InterfaceC8412a interfaceC8412a, C8413b c8413b) {
        return eVar.b0(new NestedScrollElement(interfaceC8412a, c8413b));
    }

    public static /* synthetic */ e b(e eVar, InterfaceC8412a interfaceC8412a, C8413b c8413b, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            c8413b = null;
        }
        return a(eVar, interfaceC8412a, c8413b);
    }
}
