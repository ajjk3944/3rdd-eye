package r3;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC3994e;
import s3.AbstractC7901p;

/* loaded from: classes.dex */
public class k extends DialogInterfaceOnCancelListenerC3994e {

    /* renamed from: J1, reason: collision with root package name */
    private Dialog f60097J1;

    /* renamed from: K1, reason: collision with root package name */
    private DialogInterface.OnCancelListener f60098K1;

    /* renamed from: L1, reason: collision with root package name */
    private Dialog f60099L1;

    public static k R1(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        k kVar = new k();
        Dialog dialog2 = (Dialog) AbstractC7901p.m(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        kVar.f60097J1 = dialog2;
        if (onCancelListener != null) {
            kVar.f60098K1 = onCancelListener;
        }
        return kVar;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC3994e
    public Dialog J1(Bundle bundle) {
        Dialog dialog = this.f60097J1;
        if (dialog != null) {
            return dialog;
        }
        O1(false);
        if (this.f60099L1 == null) {
            this.f60099L1 = new AlertDialog.Builder((Context) AbstractC7901p.l(s())).create();
        }
        return this.f60099L1;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC3994e
    public void Q1(androidx.fragment.app.w wVar, String str) {
        super.Q1(wVar, str);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC3994e, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f60098K1;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
