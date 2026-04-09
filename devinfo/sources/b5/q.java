package b5;

import android.app.Dialog;
import android.content.DialogInterface;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class q implements DialogInterface.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f1851a;

    public q(s sVar) {
        this.f1851a = sVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        s sVar = this.f1851a;
        Dialog dialog = sVar.f1867k0;
        if (dialog != null) {
            sVar.onDismiss(dialog);
        }
    }
}
