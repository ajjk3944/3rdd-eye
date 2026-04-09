package io.sentry.android.replay;

import android.view.View;
import android.view.ViewTreeObserver;
import io.sentry.b5;
import io.sentry.x5;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import lf.t1;

/* loaded from: classes.dex */
public final class s implements ViewTreeObserver.OnDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final x5 f11948a;

    /* renamed from: d, reason: collision with root package name */
    public WeakReference f11949d;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f11950g;

    /* renamed from: r, reason: collision with root package name */
    public final AtomicBoolean f11951r;

    /* renamed from: x, reason: collision with root package name */
    public final io.sentry.android.replay.screenshot.f f11952x;

    public s(x5 x5Var, ReplayIntegration replayIntegration, t tVar, a0 a0Var) {
        io.sentry.android.replay.screenshot.f bVar;
        br.l.e(a0Var, "executorProvider");
        this.f11948a = x5Var;
        this.f11950g = new AtomicBoolean(true);
        io.sentry.android.replay.util.a aVar = new io.sentry.android.replay.util.a();
        this.f11951r = new AtomicBoolean(false);
        int i10 = r.f11947a[x5Var.getSessionReplay().f12084m.ordinal()];
        if (i10 == 1) {
            bVar = new io.sentry.android.replay.screenshot.b(x5Var, replayIntegration, tVar, a0Var);
        } else {
            if (i10 != 2) {
                throw new bf.n();
            }
            bVar = new fj.o(a0Var, replayIntegration, x5Var, tVar, aVar);
        }
        this.f11952x = bVar;
    }

    public final void a(View view) {
        br.l.e(view, "root");
        WeakReference weakReference = this.f11949d;
        c(weakReference != null ? (View) weakReference.get() : null);
        WeakReference weakReference2 = this.f11949d;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        this.f11949d = new WeakReference(view);
        se.b.h(view, this);
        this.f11951r.set(true);
        this.f11952x.onContentChanged();
    }

    public final void b() {
        x5 x5Var = this.f11948a;
        boolean z10 = x5Var.getSessionReplay().f12083l;
        AtomicBoolean atomicBoolean = this.f11950g;
        if (z10) {
            x5Var.getLogger().m(b5.DEBUG, "Capturing screenshot, isCapturing: %s", Boolean.valueOf(atomicBoolean.get()));
        }
        if (!atomicBoolean.get()) {
            if (x5Var.getSessionReplay().f12083l) {
                x5Var.getLogger().m(b5.DEBUG, "ScreenshotRecorder is paused, not capturing screenshot", new Object[0]);
                return;
            }
            return;
        }
        boolean z11 = x5Var.getSessionReplay().f12083l;
        io.sentry.android.replay.screenshot.f fVar = this.f11952x;
        AtomicBoolean atomicBoolean2 = this.f11951r;
        if (z11) {
            x5Var.getLogger().m(b5.DEBUG, "Capturing screenshot, contentChanged: %s, lastCaptureSuccessful: %s", Boolean.valueOf(atomicBoolean2.get()), Boolean.valueOf(fVar.a()));
        }
        if (!atomicBoolean2.get()) {
            fVar.c();
            return;
        }
        WeakReference weakReference = this.f11949d;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (view == null || view.getWidth() <= 0 || view.getHeight() <= 0 || !view.isShown()) {
            x5Var.getLogger().m(b5.DEBUG, "Root view is invalid, not capturing screenshot", new Object[0]);
            return;
        }
        if (t1.t(view) == null) {
            x5Var.getLogger().m(b5.DEBUG, "Window is invalid, not capturing screenshot", new Object[0]);
            return;
        }
        try {
            atomicBoolean2.set(false);
            fVar.b(view);
        } catch (Throwable th2) {
            x5Var.getLogger().g(b5.WARNING, "Failed to capture replay recording", th2);
        }
    }

    public final void c(View view) {
        this.f11948a.getReplayController().getClass();
        if (view == null || view.getViewTreeObserver() == null || !view.getViewTreeObserver().isAlive()) {
            return;
        }
        try {
            view.getViewTreeObserver().removeOnDrawListener(this);
        } catch (IllegalStateException unused) {
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        if (this.f11950g.get()) {
            WeakReference weakReference = this.f11949d;
            View view = weakReference != null ? (View) weakReference.get() : null;
            if (view == null || view.getWidth() <= 0 || view.getHeight() <= 0 || !view.isShown()) {
                this.f11948a.getLogger().m(b5.DEBUG, "Root view is invalid, not capturing screenshot", new Object[0]);
            } else {
                this.f11951r.set(true);
                this.f11952x.onContentChanged();
            }
        }
    }
}
