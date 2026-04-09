package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class ez0 extends xo {
    public Dialog p0;
    public DialogInterface.OnCancelListener q0;
    public AlertDialog r0;

    @Override // defpackage.xo
    public final Dialog O(Bundle bundle) {
        Dialog dialog = this.p0;
        if (dialog != null) {
            return dialog;
        }
        this.g0 = false;
        if (this.r0 == null) {
            Context contextI = i();
            ou1.j(contextI);
            this.r0 = new AlertDialog.Builder(contextI).create();
        }
        return this.r0;
    }

    @Override // defpackage.xo, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.q0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
