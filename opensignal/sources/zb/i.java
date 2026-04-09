package zb;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import cc.s;

/* loaded from: classes.dex */
public class i extends o4.p {
    public Dialog M0;
    public DialogInterface.OnCancelListener N0;
    public AlertDialog O0;

    @Override // o4.p
    public final Dialog h0() {
        Dialog dialog = this.M0;
        if (dialog != null) {
            return dialog;
        }
        this.D0 = false;
        if (this.O0 == null) {
            Context contextN = n();
            s.h(contextN);
            this.O0 = new AlertDialog.Builder(contextN).create();
        }
        return this.O0;
    }

    @Override // o4.p, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.N0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
