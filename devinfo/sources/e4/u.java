package e4;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class u implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final View f22397a;

    /* renamed from: b, reason: collision with root package name */
    public ViewTreeObserver f22398b;

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f22399c;

    public u(View view, Runnable runnable) {
        this.f22397a = view;
        this.f22398b = view.getViewTreeObserver();
        this.f22399c = runnable;
    }

    public static void a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        u uVar = new u(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(uVar);
        view.addOnAttachStateChangeListener(uVar);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean zIsAlive = this.f22398b.isAlive();
        View view = this.f22397a;
        if (zIsAlive) {
            this.f22398b.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f22399c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f22398b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean zIsAlive = this.f22398b.isAlive();
        View view2 = this.f22397a;
        if (zIsAlive) {
            this.f22398b.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
