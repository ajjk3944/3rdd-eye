package u3;

import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class p implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final View f23200a;

    /* renamed from: d, reason: collision with root package name */
    public ViewTreeObserver f23201d;

    /* renamed from: g, reason: collision with root package name */
    public final Runnable f23202g;

    public p(View view, Runnable runnable) {
        this.f23200a = view;
        this.f23201d = view.getViewTreeObserver();
        this.f23202g = runnable;
    }

    public static void a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        p pVar = new p(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(pVar);
        view.addOnAttachStateChangeListener(pVar);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean zIsAlive = this.f23201d.isAlive();
        View view = this.f23200a;
        if (zIsAlive) {
            this.f23201d.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f23202g.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f23201d = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean zIsAlive = this.f23201d.isAlive();
        View view2 = this.f23200a;
        if (zIsAlive) {
            this.f23201d.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
