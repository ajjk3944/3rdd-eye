package R;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: R.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0190q implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final View f3354a;

    /* renamed from: b, reason: collision with root package name */
    public ViewTreeObserver f3355b;

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f3356c;

    public ViewTreeObserverOnPreDrawListenerC0190q(View view, Runnable runnable) {
        this.f3354a = view;
        this.f3355b = view.getViewTreeObserver();
        this.f3356c = runnable;
    }

    public static void a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        ViewTreeObserverOnPreDrawListenerC0190q viewTreeObserverOnPreDrawListenerC0190q = new ViewTreeObserverOnPreDrawListenerC0190q(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0190q);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC0190q);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean zIsAlive = this.f3355b.isAlive();
        View view = this.f3354a;
        if (zIsAlive) {
            this.f3355b.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f3356c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f3355b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean zIsAlive = this.f3355b.isAlive();
        View view2 = this.f3354a;
        if (zIsAlive) {
            this.f3355b.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
