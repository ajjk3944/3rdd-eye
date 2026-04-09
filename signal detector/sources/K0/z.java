package k0;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class z implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ P f21735a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LayoutInflaterFactory2C2596A f21736b;

    public z(LayoutInflaterFactory2C2596A layoutInflaterFactory2C2596A, P p6) {
        this.f21736b = layoutInflaterFactory2C2596A;
        this.f21735a = p6;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        P p6 = this.f21735a;
        AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v = p6.f21558c;
        p6.k();
        C2605i.f((ViewGroup) abstractComponentCallbacksC2617v.f21696T.getParent(), this.f21736b.f21474a).e();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
