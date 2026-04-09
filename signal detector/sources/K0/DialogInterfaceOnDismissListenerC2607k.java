package k0;

import android.app.Dialog;
import android.content.DialogInterface;

/* renamed from: k0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnDismissListenerC2607k implements DialogInterface.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC2610n f21643a;

    public DialogInterfaceOnDismissListenerC2607k(DialogInterfaceOnCancelListenerC2610n dialogInterfaceOnCancelListenerC2610n) {
        this.f21643a = dialogInterfaceOnCancelListenerC2610n;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC2610n dialogInterfaceOnCancelListenerC2610n = this.f21643a;
        Dialog dialog = dialogInterfaceOnCancelListenerC2610n.v0;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC2610n.onDismiss(dialog);
        }
    }
}
