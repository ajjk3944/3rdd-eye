package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Debug;
import android.os.Handler;
import android.os.SystemClock;
import io.sentry.b5;
import io.sentry.c4;
import io.sentry.t4;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class a extends Thread {
    public final io.sentry.u0 B;
    public volatile long D;
    public final AtomicBoolean E;
    public final Context F;
    public final androidx.lifecycle.f0 G;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f11532a;

    /* renamed from: d, reason: collision with root package name */
    public final androidx.media3.exoplayer.trackselection.h f11533d;

    /* renamed from: g, reason: collision with root package name */
    public final f0 f11534g;

    /* renamed from: r, reason: collision with root package name */
    public final d5.v f11535r;

    /* renamed from: x, reason: collision with root package name */
    public final long f11536x;

    /* renamed from: y, reason: collision with root package name */
    public final long f11537y;

    public a(long j, boolean z10, androidx.media3.exoplayer.trackselection.h hVar, io.sentry.u0 u0Var, Context context) {
        d5.v vVar = new d5.v(20);
        f0 f0Var = new f0();
        super("|ANR-WatchDog|");
        this.D = 0L;
        this.E = new AtomicBoolean(false);
        this.f11535r = vVar;
        this.f11537y = j;
        this.f11536x = 500L;
        this.f11532a = z10;
        this.f11533d = hVar;
        this.B = u0Var;
        this.f11534g = f0Var;
        this.F = context;
        this.G = new androidx.lifecycle.f0(this, vVar);
        if (j < 1000) {
            throw new IllegalArgumentException(String.format("ANRWatchDog: timeoutIntervalMillis has to be at least %d ms", 1000L));
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws Throwable {
        List<ActivityManager.ProcessErrorStateInfo> processesInErrorState;
        this.G.run();
        while (!isInterrupted()) {
            ((Handler) this.f11534g.f11569a).post(this.G);
            try {
                Thread.sleep(this.f11536x);
                this.f11535r.getClass();
                if (SystemClock.uptimeMillis() - this.D > this.f11537y) {
                    if (this.f11532a || !(Debug.isDebuggerConnected() || Debug.waitingForDebugger())) {
                        ActivityManager activityManager = (ActivityManager) this.F.getSystemService("activity");
                        if (activityManager != null) {
                            try {
                                processesInErrorState = activityManager.getProcessesInErrorState();
                            } catch (Throwable th2) {
                                this.B.g(b5.ERROR, "Error getting ActivityManager#getProcessesInErrorState.", th2);
                                processesInErrorState = null;
                            }
                            if (processesInErrorState != null) {
                                Iterator<ActivityManager.ProcessErrorStateInfo> it = processesInErrorState.iterator();
                                while (it.hasNext()) {
                                    if (it.next().condition == 2) {
                                    }
                                }
                            }
                        }
                        if (this.E.compareAndSet(false, true)) {
                            ApplicationNotResponding applicationNotResponding = new ApplicationNotResponding(c7.a.n(this.f11537y, " ms.", new StringBuilder("Application Not Responding for at least ")), ((Handler) this.f11534g.f11569a).getLooper().getThread());
                            androidx.media3.exoplayer.trackselection.h hVar = this.f11533d;
                            Object obj = hVar.f1895d;
                            SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) hVar.f1896g;
                            a aVar = AnrIntegration.f11477x;
                            sentryAndroidOptions.getLogger().m(b5.INFO, "ANR triggered with message: %s", applicationNotResponding.getMessage());
                            boolean zEquals = Boolean.TRUE.equals(d0.f11554x.f11558r);
                            String strP = "ANR for at least " + sentryAndroidOptions.getAnrTimeoutIntervalMillis() + " ms.";
                            if (zEquals) {
                                strP = c7.a.p("Background ", strP);
                            }
                            ApplicationNotResponding applicationNotResponding2 = new ApplicationNotResponding(strP, applicationNotResponding.f11495a);
                            io.sentry.protocol.k kVar = new io.sentry.protocol.k();
                            kVar.f12580a = "ANR";
                            t4 t4Var = new t4(new io.sentry.exception.a(kVar, applicationNotResponding2, applicationNotResponding2.f11495a, true));
                            t4Var.Q = b5.ERROR;
                            c4.c().y(t4Var, dr.a.j(new u(zEquals)));
                        }
                    } else {
                        this.B.m(b5.DEBUG, "An ANR was detected but ignored because the debugger is connected.", new Object[0]);
                        this.E.set(true);
                    }
                }
            } catch (InterruptedException e4) {
                try {
                    Thread.currentThread().interrupt();
                    this.B.m(b5.WARNING, "Interrupted: %s", e4.getMessage());
                    return;
                } catch (SecurityException unused) {
                    this.B.m(b5.WARNING, "Failed to interrupt due to SecurityException: %s", e4.getMessage());
                    return;
                }
            }
        }
    }
}
