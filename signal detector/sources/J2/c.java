package J2;

import M2.u;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

/* loaded from: classes.dex */
public class c extends DialogFragment {

    /* renamed from: a, reason: collision with root package name */
    public Dialog f2049a;

    /* renamed from: b, reason: collision with root package name */
    public DialogInterface.OnCancelListener f2050b;

    /* renamed from: c, reason: collision with root package name */
    public AlertDialog f2051c;

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f2050b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f2049a;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f2051c == null) {
            Activity activity = getActivity();
            u.e(activity);
            this.f2051c = new AlertDialog.Builder(activity).create();
        }
        return this.f2051c;
    }
}
