package y0;

import androidx.compose.ui.input.pointer.PointerHoverIconModifierElement;

/* renamed from: y0.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8600u {
    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar, InterfaceC8599t interfaceC8599t, boolean z10) {
        return eVar.b0(new PointerHoverIconModifierElement(interfaceC8599t, z10));
    }

    public static /* synthetic */ androidx.compose.ui.e b(androidx.compose.ui.e eVar, InterfaceC8599t interfaceC8599t, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return a(eVar, interfaceC8599t, z10);
    }
}
