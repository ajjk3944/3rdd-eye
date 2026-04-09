package j1;

import android.view.View;
import android.view.autofill.AutofillManager;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class i {
    public static void a(View view, AutofillManager autofillManager, int i4, boolean z3) {
        autofillManager.notifyViewVisibilityChanged(view, i4, z3);
    }
}
