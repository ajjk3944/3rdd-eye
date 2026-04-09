package a0;

import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class q implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: b, reason: collision with root package name */
    private final View f214b;

    /* renamed from: c, reason: collision with root package name */
    private ViewTreeObserver f215c;

    /* renamed from: d, reason: collision with root package name */
    private final Runnable f216d;

    private q(View view, Runnable runnable) {
        this.f214b = view;
        this.f215c = view.getViewTreeObserver();
        this.f216d = runnable;
    }

    public static q a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        if (runnable == null) {
            throw new NullPointerException("runnable == null");
        }
        q qVar = new q(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(qVar);
        view.addOnAttachStateChangeListener(qVar);
        return qVar;
    }

    public void b() {
        (this.f215c.isAlive() ? this.f215c : this.f214b.getViewTreeObserver()).removeOnPreDrawListener(this);
        this.f214b.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        b();
        this.f216d.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f215c = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        b();
    }
}
