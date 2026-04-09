package k0;

import android.util.Log;
import android.view.View;
import androidx.lifecycle.InterfaceC0298u;

/* renamed from: k0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2608l implements androidx.lifecycle.E {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC2610n f21644a;

    public C2608l(DialogInterfaceOnCancelListenerC2610n dialogInterfaceOnCancelListenerC2610n) {
        this.f21644a = dialogInterfaceOnCancelListenerC2610n;
    }

    @Override // androidx.lifecycle.E
    public final void b(Object obj) {
        if (((InterfaceC0298u) obj) != null) {
            DialogInterfaceOnCancelListenerC2610n dialogInterfaceOnCancelListenerC2610n = this.f21644a;
            if (dialogInterfaceOnCancelListenerC2610n.f21653r0) {
                View viewS = dialogInterfaceOnCancelListenerC2610n.S();
                if (viewS.getParent() != null) {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
                if (dialogInterfaceOnCancelListenerC2610n.v0 != null) {
                    if (K.H(3)) {
                        Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + dialogInterfaceOnCancelListenerC2610n.v0);
                    }
                    dialogInterfaceOnCancelListenerC2610n.v0.setContentView(viewS);
                }
            }
        }
    }
}
