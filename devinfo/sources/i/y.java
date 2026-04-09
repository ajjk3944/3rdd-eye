package i;

import android.app.Dialog;
import android.os.Bundle;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class y extends b5.s {
    @Override // b5.s
    public Dialog e0(Bundle bundle) {
        return new x(p(), this.f1861e0);
    }

    @Override // b5.s
    public final void g0(Dialog dialog, int i4) {
        if (!(dialog instanceof x)) {
            super.g0(dialog, i4);
            return;
        }
        x xVar = (x) dialog;
        if (i4 != 1 && i4 != 2) {
            if (i4 != 3) {
                return;
            } else {
                dialog.getWindow().addFlags(24);
            }
        }
        xVar.d().h(1);
    }
}
