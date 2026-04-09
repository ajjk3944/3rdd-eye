package nb;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import pb.y;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class c extends DialogFragment {

    /* renamed from: a, reason: collision with root package name */
    public Dialog f29889a;

    /* renamed from: b, reason: collision with root package name */
    public DialogInterface.OnCancelListener f29890b;

    /* renamed from: c, reason: collision with root package name */
    public AlertDialog f29891c;

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f29890b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f29889a;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f29891c == null) {
            Activity activity = getActivity();
            y.h(activity);
            this.f29891c = new AlertDialog.Builder(activity).create();
        }
        return this.f29891c;
    }
}
