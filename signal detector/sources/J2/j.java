package J2;

import M2.u;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import k0.DialogInterfaceOnCancelListenerC2610n;

/* loaded from: classes.dex */
public class j extends DialogInterfaceOnCancelListenerC2610n {

    /* renamed from: A0, reason: collision with root package name */
    public Dialog f2066A0;

    /* renamed from: B0, reason: collision with root package name */
    public DialogInterface.OnCancelListener f2067B0;

    /* renamed from: C0, reason: collision with root package name */
    public AlertDialog f2068C0;

    @Override // k0.DialogInterfaceOnCancelListenerC2610n
    public final Dialog b0(Bundle bundle) {
        Dialog dialog = this.f2066A0;
        if (dialog != null) {
            return dialog;
        }
        this.f21653r0 = false;
        if (this.f2068C0 == null) {
            Context contextM = m();
            u.e(contextM);
            this.f2068C0 = new AlertDialog.Builder(contextM).create();
        }
        return this.f2068C0;
    }

    @Override // k0.DialogInterfaceOnCancelListenerC2610n, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f2067B0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
