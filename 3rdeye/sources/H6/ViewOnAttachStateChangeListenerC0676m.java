package H6;

import android.view.View;

/* compiled from: View.kt */
/* renamed from: H6.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0676m implements View.OnAttachStateChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0675l f2210b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0675l f2211c;

    public ViewOnAttachStateChangeListenerC0676m(C0675l c0675l, C0675l c0675l2) {
        this.f2210b = c0675l;
        this.f2211c = c0675l2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f2210b.removeOnAttachStateChangeListener(this);
        this.f2211c.getDiv2Component$div_release().v().a();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
