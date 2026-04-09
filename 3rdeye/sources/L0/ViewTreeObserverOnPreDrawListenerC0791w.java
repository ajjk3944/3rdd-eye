package L0;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: OneShotPreDrawListener.java */
/* renamed from: L0.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0791w implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final View f3933b;

    /* renamed from: c, reason: collision with root package name */
    public ViewTreeObserver f3934c;

    /* renamed from: d, reason: collision with root package name */
    public final Runnable f3935d;

    public ViewTreeObserverOnPreDrawListenerC0791w(View view, Runnable runnable) {
        this.f3933b = view;
        this.f3934c = view.getViewTreeObserver();
        this.f3935d = runnable;
    }

    public static void a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        ViewTreeObserverOnPreDrawListenerC0791w viewTreeObserverOnPreDrawListenerC0791w = new ViewTreeObserverOnPreDrawListenerC0791w(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0791w);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC0791w);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean zIsAlive = this.f3934c.isAlive();
        View view = this.f3933b;
        if (zIsAlive) {
            this.f3934c.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f3935d.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f3934c = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean zIsAlive = this.f3934c.isAlive();
        View view2 = this.f3933b;
        if (zIsAlive) {
            this.f3934c.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
