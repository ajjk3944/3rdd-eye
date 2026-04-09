package r3;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import s3.AbstractC7901p;

/* renamed from: r3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class DialogFragmentC7565c extends DialogFragment {

    /* renamed from: a, reason: collision with root package name */
    private Dialog f60075a;

    /* renamed from: b, reason: collision with root package name */
    private DialogInterface.OnCancelListener f60076b;

    /* renamed from: c, reason: collision with root package name */
    private Dialog f60077c;

    public static DialogFragmentC7565c a(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        DialogFragmentC7565c dialogFragmentC7565c = new DialogFragmentC7565c();
        Dialog dialog2 = (Dialog) AbstractC7901p.m(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        dialogFragmentC7565c.f60075a = dialog2;
        if (onCancelListener != null) {
            dialogFragmentC7565c.f60076b = onCancelListener;
        }
        return dialogFragmentC7565c;
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f60076b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f60075a;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f60077c == null) {
            this.f60077c = new AlertDialog.Builder((Context) AbstractC7901p.l(getActivity())).create();
        }
        return this.f60077c;
    }

    @Override // android.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
