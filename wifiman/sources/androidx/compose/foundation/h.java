package androidx.compose.foundation;

import y.InterfaceC8558m;

/* loaded from: classes.dex */
public abstract class h {
    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar, InterfaceC8558m interfaceC8558m, boolean z10) {
        return eVar.b0(z10 ? new HoverableElement(interfaceC8558m) : androidx.compose.ui.e.f28771b0);
    }

    public static /* synthetic */ androidx.compose.ui.e b(androidx.compose.ui.e eVar, InterfaceC8558m interfaceC8558m, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return a(eVar, interfaceC8558m, z10);
    }
}
