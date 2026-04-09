package h;

import android.app.Dialog;
import android.os.Bundle;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC1758k;

/* compiled from: AppCompatDialogFragment.java */
/* loaded from: classes.dex */
public class m extends DialogInterfaceOnCancelListenerC1758k {
    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1758k
    public Dialog onCreateDialog(Bundle bundle) {
        return new l(getContext(), getTheme());
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1758k
    public final void setupDialog(Dialog dialog, int i) {
        if (!(dialog instanceof l)) {
            super.setupDialog(dialog, i);
            return;
        }
        l lVar = (l) dialog;
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            } else {
                dialog.getWindow().addFlags(24);
            }
        }
        lVar.c().w(1);
    }
}
