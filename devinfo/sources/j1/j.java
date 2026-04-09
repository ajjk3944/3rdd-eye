package j1;

import android.util.Log;
import android.view.View;
import android.view.autofill.AutofillManager$AutofillCallback;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class j extends AutofillManager$AutofillCallback {

    /* renamed from: a, reason: collision with root package name */
    public static final j f27051a = new j();

    public final void a(a aVar) {
        aVar.f27037c.registerCallback(this);
    }

    public final void b(a aVar) {
        aVar.f27037c.unregisterCallback(this);
    }

    public final void onAutofillEvent(View view, int i4, int i10) {
        super.onAutofillEvent(view, i4, i10);
        Log.d("Autofill Status", i10 != 1 ? i10 != 2 ? i10 != 3 ? "Unknown status event." : "Autofill popup isn't shown because autofill is not available.\n\nDid you set up autofill?\n1. Go to Settings > System > Languages&input > Advanced > Autofill Service\n2. Pick a service\n\nDid you add an account?\n1. Go to Settings > System > Languages&input > Advanced\n2. Click on the settings icon next to the Autofill Service\n3. Add your account" : "Autofill popup was hidden." : "Autofill popup was shown.");
    }
}
