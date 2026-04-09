package h;

import android.app.Dialog;
import android.os.Bundle;
import k0.DialogInterfaceOnCancelListenerC2610n;

/* loaded from: classes.dex */
public class y extends DialogInterfaceOnCancelListenerC2610n {
    @Override // k0.DialogInterfaceOnCancelListenerC2610n
    public Dialog b0(Bundle bundle) {
        return new x(m(), a0());
    }

    @Override // k0.DialogInterfaceOnCancelListenerC2610n
    public final void d0(Dialog dialog, int i) {
        if (!(dialog instanceof x)) {
            super.d0(dialog, i);
            return;
        }
        x xVar = (x) dialog;
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            } else {
                dialog.getWindow().addFlags(24);
            }
        }
        xVar.c().j(1);
    }
}
