package com.mbridge.msdk.foundation.same.report.crashreport;

import android.annotation.TargetApi;
import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;

/* loaded from: classes3.dex */
public class c extends Thread {

    /* renamed from: e, reason: collision with root package name */
    private static volatile c f15221e;

    /* renamed from: a, reason: collision with root package name */
    private final Handler f15222a;

    /* renamed from: b, reason: collision with root package name */
    private volatile b f15223b;

    /* renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.foundation.same.report.crashreport.a f15224c;

    /* renamed from: d, reason: collision with root package name */
    private int f15225d;

    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private long f15226a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f15227b;

        /* renamed from: c, reason: collision with root package name */
        private long f15228c;

        private b() {
            this.f15226a = SystemClock.uptimeMillis();
        }

        public void b() {
            this.f15227b = false;
            this.f15228c = SystemClock.uptimeMillis();
            c.this.f15222a.postAtFrontOfQueue(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (c.this) {
                this.f15227b = true;
                this.f15226a = SystemClock.uptimeMillis();
            }
        }

        public boolean a() {
            return !this.f15227b || this.f15226a - this.f15228c >= ((long) c.this.f15225d);
        }
    }

    private c() {
        super("AnrMonitor-Thread");
        this.f15222a = new Handler(Looper.getMainLooper());
        this.f15225d = 5000;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    @TargetApi(16)
    public void run() throws InterruptedException, SecurityException, IllegalArgumentException {
        Process.setThreadPriority(10);
        while (true) {
            if (isInterrupted() || !(this.f15223b == null || this.f15223b.f15227b)) {
                try {
                    Thread.sleep(this.f15225d);
                } catch (Exception unused) {
                }
            } else {
                synchronized (this) {
                    try {
                        if (this.f15223b == null) {
                            this.f15223b = new b();
                        }
                        this.f15223b.b();
                        long jUptimeMillis = this.f15225d;
                        long jUptimeMillis2 = SystemClock.uptimeMillis();
                        while (jUptimeMillis > 0) {
                            try {
                                wait(jUptimeMillis);
                            } catch (InterruptedException e10) {
                                Log.w("AnrMonitor", e10.toString());
                            }
                            jUptimeMillis = this.f15225d - (SystemClock.uptimeMillis() - jUptimeMillis2);
                        }
                        if (!this.f15223b.a()) {
                            com.mbridge.msdk.foundation.same.report.crashreport.a aVar = this.f15224c;
                            if (aVar != null) {
                                aVar.a();
                            }
                        } else if (!Debug.isDebuggerConnected() && !Debug.waitingForDebugger() && this.f15224c != null) {
                            StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
                            this.f15224c.a(d.b(stackTrace), stackTrace);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    public static c a() {
        if (f15221e == null) {
            synchronized (c.class) {
                try {
                    if (f15221e == null) {
                        f15221e = new c();
                    }
                } finally {
                }
            }
        }
        return f15221e;
    }

    public c a(int i10, com.mbridge.msdk.foundation.same.report.crashreport.a aVar) {
        this.f15225d = i10;
        this.f15224c = aVar;
        return this;
    }
}
