package k0;

import android.app.Dialog;
import android.view.View;

/* renamed from: k0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2609m extends I5.b {
    public final /* synthetic */ C2613q i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC2610n f21645j;

    public C2609m(DialogInterfaceOnCancelListenerC2610n dialogInterfaceOnCancelListenerC2610n, C2613q c2613q) {
        this.f21645j = dialogInterfaceOnCancelListenerC2610n;
        this.i = c2613q;
    }

    @Override // I5.b
    public final View u(int i) {
        C2613q c2613q = this.i;
        if (c2613q.v()) {
            return c2613q.u(i);
        }
        Dialog dialog = this.f21645j.v0;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    @Override // I5.b
    public final boolean v() {
        return this.i.v() || this.f21645j.f21660z0;
    }
}
