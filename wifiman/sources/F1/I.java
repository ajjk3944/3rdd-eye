package F1;

import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class I implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    private final View f5655a;

    /* renamed from: b, reason: collision with root package name */
    private ViewTreeObserver f5656b;

    /* renamed from: c, reason: collision with root package name */
    private final Runnable f5657c;

    private I(View view, Runnable runnable) {
        this.f5655a = view;
        this.f5656b = view.getViewTreeObserver();
        this.f5657c = runnable;
    }

    public static I a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        if (runnable == null) {
            throw new NullPointerException("runnable == null");
        }
        I i10 = new I(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(i10);
        view.addOnAttachStateChangeListener(i10);
        return i10;
    }

    public void b() {
        if (this.f5656b.isAlive()) {
            this.f5656b.removeOnPreDrawListener(this);
        } else {
            this.f5655a.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f5655a.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        b();
        this.f5657c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f5656b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        b();
    }
}
