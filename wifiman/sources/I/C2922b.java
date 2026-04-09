package I;

import android.view.InputDevice;
import android.view.KeyEvent;
import mh.InterfaceC6824a;
import w0.AbstractC8249c;
import w0.AbstractC8250d;

/* renamed from: I.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2922b extends g1 {
    @Override // I.g1
    public boolean b(KeyEvent keyEvent, o1 o1Var, l1 l1Var, J.j jVar, boolean z10, boolean z11, InterfaceC6824a interfaceC6824a) {
        if (AbstractC8249c.e(AbstractC8250d.b(keyEvent), AbstractC8249c.f64330a.a()) && keyEvent.isFromSource(257) && !h1.c(keyEvent)) {
            jVar.w0(false);
        }
        return super.b(keyEvent, o1Var, l1Var, jVar, z10, z11, interfaceC6824a);
    }

    @Override // I.g1
    public boolean c(KeyEvent keyEvent, o1 o1Var, J.j jVar, k0.e eVar, androidx.compose.ui.platform.n1 n1Var) {
        if (super.c(keyEvent, o1Var, jVar, eVar, n1Var)) {
            return true;
        }
        InputDevice device = keyEvent.getDevice();
        if (device != null && device.supportsSource(513) && !device.isVirtual() && AbstractC8249c.e(AbstractC8250d.b(keyEvent), AbstractC8249c.f64330a.a()) && keyEvent.getSource() != 257) {
            if (h1.d(keyEvent, 19)) {
                return eVar.k(androidx.compose.ui.focus.d.f28823b.h());
            }
            if (h1.d(keyEvent, 20)) {
                return eVar.k(androidx.compose.ui.focus.d.f28823b.a());
            }
            if (h1.d(keyEvent, 21)) {
                return eVar.k(androidx.compose.ui.focus.d.f28823b.d());
            }
            if (h1.d(keyEvent, 22)) {
                return eVar.k(androidx.compose.ui.focus.d.f28823b.g());
            }
            if (h1.d(keyEvent, 23)) {
                n1Var.b();
                return true;
            }
        }
        return false;
    }
}
