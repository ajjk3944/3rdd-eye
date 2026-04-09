package k0;

import android.app.Dialog;
import android.content.DialogInterface;
import t2.C2925i;

/* renamed from: k0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnCancelListenerC2606j implements DialogInterface.OnCancelListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21641a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f21642b;

    public /* synthetic */ DialogInterfaceOnCancelListenerC2606j(int i, Object obj) {
        this.f21641a = i;
        this.f21642b = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f21641a) {
            case 0:
                DialogInterfaceOnCancelListenerC2610n dialogInterfaceOnCancelListenerC2610n = (DialogInterfaceOnCancelListenerC2610n) this.f21642b;
                Dialog dialog = dialogInterfaceOnCancelListenerC2610n.v0;
                if (dialog != null) {
                    dialogInterfaceOnCancelListenerC2610n.onCancel(dialog);
                    break;
                }
                break;
            default:
                ((C2925i) this.f21642b).b();
                break;
        }
    }
}
