package k0;

import android.view.View;

/* renamed from: k0.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2613q extends I5.b {
    public final /* synthetic */ AbstractComponentCallbacksC2617v i;

    public C2613q(AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v) {
        this.i = abstractComponentCallbacksC2617v;
    }

    @Override // I5.b
    public final View u(int i) {
        AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v = this.i;
        View view = abstractComponentCallbacksC2617v.f21696T;
        if (view != null) {
            return view.findViewById(i);
        }
        throw new IllegalStateException("Fragment " + abstractComponentCallbacksC2617v + " does not have a view");
    }

    @Override // I5.b
    public final boolean v() {
        return this.i.f21696T != null;
    }
}
