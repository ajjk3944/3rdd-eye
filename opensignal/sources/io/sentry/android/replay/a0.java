package io.sentry.android.replay;

import android.graphics.Point;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.View;
import h7.r1;
import io.sentry.b5;
import io.sentry.x5;
import java.io.Closeable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import lf.t1;

/* loaded from: classes.dex */
public final class a0 implements f, Closeable {
    public final ArrayList B;
    public final Point D;
    public final io.sentry.util.a E;
    public final io.sentry.util.a F;
    public final io.sentry.util.a G;
    public volatile x H;
    public volatile HandlerThread I;
    public volatile Handler J;

    /* renamed from: a, reason: collision with root package name */
    public final x5 f11838a;

    /* renamed from: d, reason: collision with root package name */
    public final ReplayIntegration f11839d;

    /* renamed from: g, reason: collision with root package name */
    public final ReplayIntegration f11840g;

    /* renamed from: r, reason: collision with root package name */
    public final r1 f11841r;

    /* renamed from: x, reason: collision with root package name */
    public final ScheduledExecutorService f11842x;

    /* renamed from: y, reason: collision with root package name */
    public final AtomicBoolean f11843y;

    public a0(x5 x5Var, ReplayIntegration replayIntegration, ReplayIntegration replayIntegration2, r1 r1Var, io.sentry.android.replay.util.b bVar) {
        br.l.e(r1Var, "mainLooperHandler");
        br.l.e(bVar, "replayExecutor");
        this.f11838a = x5Var;
        this.f11839d = replayIntegration;
        this.f11840g = replayIntegration2;
        this.f11841r = r1Var;
        this.f11842x = bVar;
        this.f11843y = new AtomicBoolean(false);
        this.B = new ArrayList();
        this.D = new Point();
        this.E = new io.sentry.util.a();
        this.F = new io.sentry.util.a();
        this.G = new io.sentry.util.a();
    }

    @Override // io.sentry.android.replay.f
    public final void b(View view, boolean z10) throws InterruptedException {
        s sVar;
        s sVar2;
        s sVar3;
        br.l.e(view, "root");
        io.sentry.q qVarA = this.E.a();
        try {
            if (!z10) {
                x xVar = this.H;
                if (xVar != null && (sVar2 = (s) xVar.f12035r) != null) {
                    sVar2.c(view);
                }
                mq.t.e0(this.B, new z(view, 0));
                WeakReference weakReference = (WeakReference) mq.o.A0(this.B);
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && !view.equals(view2)) {
                    x xVar2 = this.H;
                    if (xVar2 != null && (sVar = (s) xVar2.f12035r) != null) {
                        sVar.a(view2);
                    }
                    f(view2);
                }
            } else {
                if (t1.t(view) == null) {
                    this.f11838a.getLogger().m(b5.WARNING, "Root view does not have a phone window, skipping.", new Object[0]);
                    vc.e.e(qVarA, null);
                    return;
                }
                this.B.add(new WeakReference(view));
                x xVar3 = this.H;
                if (xVar3 != null && (sVar3 = (s) xVar3.f12035r) != null) {
                    sVar3.a(view);
                }
                f(view);
            }
            vc.e.e(qVarA, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                vc.e.e(qVarA, th2);
                throw th3;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws InterruptedException {
        q();
        r1 r1Var = this.f11841r;
        x xVar = this.H;
        Handler handler = (Handler) r1Var.f10199d;
        if (xVar != null) {
            handler.removeCallbacks(xVar);
        }
        io.sentry.q qVarA = this.G.a();
        try {
            Handler handler2 = this.J;
            if (handler2 != null) {
                handler2.removeCallbacksAndMessages(null);
            }
            HandlerThread handlerThread = this.I;
            if (handlerThread != null) {
                handlerThread.quitSafely();
            }
            vc.e.e(qVarA, null);
            y();
        } finally {
        }
    }

    public final void f(View view) {
        br.l.e(view, "root");
        if (view.getWidth() <= 0 || view.getHeight() <= 0) {
            y yVar = new y(this, view);
            if (view.getViewTreeObserver() == null || !view.getViewTreeObserver().isAlive()) {
                return;
            }
            try {
                view.getViewTreeObserver().addOnPreDrawListener(yVar);
                return;
            } catch (IllegalStateException unused) {
                return;
            }
        }
        int width = view.getWidth();
        Point point = this.D;
        if (width == point.x || view.getHeight() == point.y) {
            return;
        }
        point.set(view.getWidth(), view.getHeight());
        this.f11840g.Y(view.getWidth(), view.getHeight());
    }

    public final Handler h() throws InterruptedException {
        if (this.J == null) {
            io.sentry.q qVarA = this.G.a();
            try {
                if (this.J == null) {
                    this.I = new HandlerThread("SentryReplayBackgroundProcessing");
                    HandlerThread handlerThread = this.I;
                    if (handlerThread != null) {
                        handlerThread.start();
                    }
                    HandlerThread handlerThread2 = this.I;
                    br.l.b(handlerThread2);
                    this.J = new Handler(handlerThread2.getLooper());
                }
                vc.e.e(qVarA, null);
            } finally {
            }
        }
        Handler handler = this.J;
        br.l.b(handler);
        return handler;
    }

    public final void i() {
        x xVar = this.H;
        if (xVar != null) {
            s sVar = (s) xVar.f12035r;
            if (sVar != null) {
                sVar.f11950g.set(false);
                WeakReference weakReference = sVar.f11949d;
                sVar.c(weakReference != null ? (View) weakReference.get() : null);
            }
            ((AtomicBoolean) xVar.f12037y).getAndSet(false);
        }
    }

    public final void q() throws InterruptedException {
        s sVar;
        this.D.set(0, 0);
        io.sentry.q qVarA = this.E.a();
        try {
            Iterator it = this.B.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                x xVar = this.H;
                if (xVar != null && (sVar = (s) xVar.f12035r) != null) {
                    sVar.c((View) weakReference.get());
                }
            }
            this.B.clear();
            vc.e.e(qVarA, null);
        } finally {
        }
    }

    public final void w() {
        View view;
        x xVar = this.H;
        if (xVar != null) {
            r1 r1Var = (r1) xVar.f12034g;
            x5 x5Var = (x5) xVar.f12033d;
            if (x5Var.getSessionReplay().f12083l) {
                x5Var.getLogger().m(b5.DEBUG, "Resuming the capture runnable.", new Object[0]);
            }
            s sVar = (s) xVar.f12035r;
            if (sVar != null) {
                WeakReference weakReference = sVar.f11949d;
                if (weakReference != null && (view = (View) weakReference.get()) != null) {
                    se.b.h(view, sVar);
                }
                sVar.f11950g.set(true);
            }
            ((AtomicBoolean) xVar.f12037y).getAndSet(true);
            ((Handler) r1Var.f10199d).removeCallbacks(xVar);
            if (((Handler) r1Var.f10199d).post(xVar)) {
                return;
            }
            x5Var.getLogger().m(b5.WARNING, "Failed to post the capture runnable, main looper is not ready.", new Object[0]);
        }
    }

    public final void y() throws InterruptedException {
        x xVar = this.H;
        if (xVar != null) {
            s sVar = (s) xVar.f12035r;
            if (sVar != null) {
                sVar.f11950g.set(false);
                WeakReference weakReference = sVar.f11949d;
                sVar.c(weakReference != null ? (View) weakReference.get() : null);
                WeakReference weakReference2 = sVar.f11949d;
                if (weakReference2 != null) {
                    weakReference2.clear();
                }
                sVar.f11952x.close();
            }
            xVar.f12035r = null;
            ((AtomicBoolean) xVar.f12037y).getAndSet(false);
        }
        io.sentry.q qVarA = this.F.a();
        try {
            this.H = null;
            vc.e.e(qVarA, null);
            this.f11843y.set(false);
        } finally {
        }
    }
}
