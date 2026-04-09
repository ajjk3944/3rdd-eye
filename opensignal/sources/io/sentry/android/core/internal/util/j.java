package io.sentry.android.core.internal.util;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import io.sentry.android.core.f0;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class j implements ViewTreeObserver.OnDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f11664a = new Handler(Looper.getMainLooper());

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReference f11665d;

    /* renamed from: g, reason: collision with root package name */
    public final Runnable f11666g;

    public j(View view, Runnable runnable) {
        this.f11665d = new AtomicReference(view);
        this.f11666g = runnable;
    }

    public static void a(Activity activity, Runnable runnable, f0 f0Var) {
        Window window = activity.getWindow();
        if (window != null) {
            View viewPeekDecorView = window.peekDecorView();
            if (viewPeekDecorView != null) {
                b(viewPeekDecorView, runnable, f0Var);
            } else {
                Window.Callback callback = window.getCallback();
                window.setCallback(new io.sentry.android.core.performance.h(callback != null ? callback : new io.sentry.android.core.internal.gestures.b(), new h(window, callback, runnable, f0Var, 0)));
            }
        }
    }

    public static void b(View view, Runnable runnable, f0 f0Var) {
        j jVar = new j(view, runnable);
        f0Var.getClass();
        if (Build.VERSION.SDK_INT >= 26 || (view.getViewTreeObserver().isAlive() && view.isAttachedToWindow())) {
            view.getViewTreeObserver().addOnDrawListener(jVar);
        } else {
            view.addOnAttachStateChangeListener(new g1.e(3, jVar));
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        final View view = (View) this.f11665d.getAndSet(null);
        if (view == null) {
            return;
        }
        view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: io.sentry.android.core.internal.util.i
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                j jVar = this.f11662a;
                jVar.getClass();
                view.getViewTreeObserver().removeOnDrawListener(jVar);
            }
        });
        this.f11664a.postAtFrontOfQueue(this.f11666g);
    }
}
