package I;

import android.view.KeyEvent;
import android.view.View;

/* renamed from: I.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C2957t extends AbstractC2955s {
    public C2957t(View view) {
        super(view);
    }

    @Override // I.InterfaceC2952q
    public void sendKeyEvent(KeyEvent keyEvent) {
        g().dispatchKeyEventFromInputMethod(f(), keyEvent);
    }
}
