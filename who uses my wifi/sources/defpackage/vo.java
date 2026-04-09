package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class vo implements DialogInterface.OnDismissListener {
    public final /* synthetic */ xo f;

    public vo(xo xoVar) {
        this.f = xoVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        xo xoVar = this.f;
        Dialog dialog = xoVar.k0;
        if (dialog != null) {
            xoVar.onDismiss(dialog);
        }
    }
}
