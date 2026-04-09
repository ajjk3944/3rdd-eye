package o4;

import android.app.Dialog;
import android.content.DialogInterface;

/* loaded from: classes.dex */
public final class l implements DialogInterface.OnCancelListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f18813a;

    public l(p pVar) {
        this.f18813a = pVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        p pVar = this.f18813a;
        Dialog dialog = pVar.H0;
        if (dialog != null) {
            pVar.onCancel(dialog);
        }
    }
}
