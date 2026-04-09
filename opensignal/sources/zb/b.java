package zb;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import cc.s;

/* loaded from: classes.dex */
public class b extends DialogFragment {

    /* renamed from: a, reason: collision with root package name */
    public Dialog f26810a;

    /* renamed from: d, reason: collision with root package name */
    public DialogInterface.OnCancelListener f26811d;

    /* renamed from: g, reason: collision with root package name */
    public AlertDialog f26812g;

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f26811d;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f26810a;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f26812g == null) {
            Activity activity = getActivity();
            s.h(activity);
            this.f26812g = new AlertDialog.Builder(activity).create();
        }
        return this.f26812g;
    }
}
