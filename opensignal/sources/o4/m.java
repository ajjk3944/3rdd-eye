package o4;

import android.app.Dialog;
import android.content.DialogInterface;

/* loaded from: classes.dex */
public final class m implements DialogInterface.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f18821a;

    public m(p pVar) {
        this.f18821a = pVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        p pVar = this.f18821a;
        Dialog dialog = pVar.H0;
        if (dialog != null) {
            pVar.onDismiss(dialog);
        }
    }
}
