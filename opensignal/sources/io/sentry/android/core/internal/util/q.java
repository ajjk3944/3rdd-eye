package io.sentry.android.core.internal.util;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Choreographer;
import android.view.Window;
import io.sentry.android.core.f0;
import io.sentry.android.core.r;
import io.sentry.b5;
import io.sentry.u0;
import java.lang.Thread;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class q implements Application.ActivityLifecycleCallbacks {
    public static final long J = TimeUnit.SECONDS.toNanos(1);
    public static final long K = TimeUnit.MILLISECONDS.toNanos(700);
    public static final /* synthetic */ int L = 0;
    public final boolean B;
    public final d D;
    public final o E;
    public Choreographer F;
    public final Field G;
    public long H;
    public long I;

    /* renamed from: a, reason: collision with root package name */
    public final f0 f11683a;

    /* renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArraySet f11684d;

    /* renamed from: g, reason: collision with root package name */
    public final u0 f11685g;

    /* renamed from: r, reason: collision with root package name */
    public final Handler f11686r;

    /* renamed from: x, reason: collision with root package name */
    public WeakReference f11687x;

    /* renamed from: y, reason: collision with root package name */
    public final ConcurrentHashMap f11688y;

    /* JADX WARN: Type inference failed for: r4v5, types: [io.sentry.android.core.internal.util.o] */
    public q(Context context, final r rVar, final f0 f0Var) throws NoSuchFieldException, SecurityException {
        d dVar = new d();
        this.f11684d = new CopyOnWriteArraySet();
        this.f11688y = new ConcurrentHashMap();
        this.B = false;
        this.H = 0L;
        this.I = 0L;
        Context applicationContext = context.getApplicationContext();
        context = applicationContext != null ? applicationContext : context;
        ir.f0.T(rVar, "Logger is required");
        this.f11685g = rVar;
        ir.f0.T(f0Var, "BuildInfoProvider is required");
        this.f11683a = f0Var;
        this.D = dVar;
        if (context instanceof Application) {
            this.B = true;
            HandlerThread handlerThread = new HandlerThread("io.sentry.android.core.internal.util.SentryFrameMetricsCollector");
            handlerThread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: io.sentry.android.core.internal.util.n
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public final void uncaughtException(Thread thread, Throwable th2) {
                    rVar.g(b5.ERROR, "Error during frames measurements.", th2);
                }
            });
            handlerThread.start();
            this.f11686r = new Handler(handlerThread.getLooper());
            ((Application) context).registerActivityLifecycleCallbacks(this);
            new Handler(Looper.getMainLooper()).post(new a5.o(this, 24, rVar));
            try {
                Field declaredField = Choreographer.class.getDeclaredField("mLastFrameTimeNanos");
                this.G = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e4) {
                rVar.g(b5.ERROR, "Unable to get the frame timestamp from the choreographer: ", e4);
            }
            this.E = new Window.OnFrameMetricsAvailableListener() { // from class: io.sentry.android.core.internal.util.o
                /* JADX WARN: Removed duplicated region for block: B:18:0x0087  */
                @Override // android.view.Window.OnFrameMetricsAvailableListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final void onFrameMetricsAvailable(android.view.Window r21, android.view.FrameMetrics r22, int r23) {
                    /*
                        Method dump skipped, instructions count: 231
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.core.internal.util.o.onFrameMetricsAvailable(android.view.Window, android.view.FrameMetrics, int):void");
                }
            };
        }
    }

    public final void a(String str) {
        if (this.B) {
            ConcurrentHashMap concurrentHashMap = this.f11688y;
            if (str != null) {
                concurrentHashMap.remove(str);
            }
            WeakReference weakReference = this.f11687x;
            Window window = weakReference != null ? (Window) weakReference.get() : null;
            if (window == null || !concurrentHashMap.isEmpty()) {
                return;
            }
            new Handler(Looper.getMainLooper()).post(new m(this, window, 1));
        }
    }

    public final void b() {
        WeakReference weakReference = this.f11687x;
        Window window = weakReference != null ? (Window) weakReference.get() : null;
        if (window == null || !this.B || this.f11688y.isEmpty() || this.f11686r == null) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new m(this, window, 0));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        Window window = activity.getWindow();
        WeakReference weakReference = this.f11687x;
        if (weakReference == null || weakReference.get() != window) {
            this.f11687x = new WeakReference(window);
            b();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        new Handler(Looper.getMainLooper()).post(new m(this, activity.getWindow(), 1));
        WeakReference weakReference = this.f11687x;
        if (weakReference == null || weakReference.get() != activity.getWindow()) {
            return;
        }
        this.f11687x = null;
    }
}
