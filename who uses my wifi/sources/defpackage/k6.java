package defpackage;

import android.app.Dialog;
import android.os.Bundle;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class k6 extends xo {
    @Override // defpackage.xo
    public Dialog O(Bundle bundle) {
        return new j6(i(), this.e0);
    }

    @Override // defpackage.xo
    public final void P(Dialog dialog, int i) {
        if (!(dialog instanceof j6)) {
            super.P(dialog, i);
            return;
        }
        j6 j6Var = (j6) dialog;
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            } else {
                dialog.getWindow().addFlags(24);
            }
        }
        j6Var.d().f(1);
    }
}
