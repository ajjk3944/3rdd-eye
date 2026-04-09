package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

/* renamed from: com.google.android.gms.internal.ads.y4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2158y4 extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final BlockingQueue f17673a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC2104x4 f17674b;

    /* renamed from: c, reason: collision with root package name */
    public final N4 f17675c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f17676d = false;

    /* renamed from: e, reason: collision with root package name */
    public final L6 f17677e;

    public C2158y4(PriorityBlockingQueue priorityBlockingQueue, C0697Ql c0697Ql, N4 n42, L6 l6) {
        this.f17673a = priorityBlockingQueue;
        this.f17674b = c0697Ql;
        this.f17675c = n42;
        this.f17677e = l6;
    }

    public final void a() {
        L6 l6 = this.f17677e;
        C4 c42 = (C4) this.f17673a.take();
        SystemClock.elapsedRealtime();
        c42.c();
        try {
            try {
                c42.a("network-queue-take");
                c42.e();
                TrafficStats.setThreadStatsTag(c42.f7519d);
                A4 a4G = this.f17674b.g(c42);
                c42.a("network-http-complete");
                if (a4G.f6930e && c42.h()) {
                    c42.b("not-modified");
                    c42.m();
                } else {
                    A1.s sVarI = c42.i(a4G);
                    c42.a("network-parse-complete");
                    C1834s4 c1834s4 = (C1834s4) sVarI.f124c;
                    if (c1834s4 != null) {
                        this.f17675c.b(c42.d(), c1834s4);
                        c42.a("network-cache-written");
                    }
                    synchronized (c42.f7520e) {
                        c42.i = true;
                    }
                    l6.n(c42, sVarI, null);
                    c42.l(sVarI);
                }
            } catch (F4 e6) {
                SystemClock.elapsedRealtime();
                l6.getClass();
                c42.a("post-error");
                ((ExecutorC1996v4) l6.f9620b).f17222b.post(new RunnableC0912b0(c42, new A1.s(e6), (Object) null, 1));
                c42.m();
            } catch (Exception e7) {
                Log.e("Volley", I4.d("Unhandled exception %s", e7.toString()), e7);
                F4 f42 = new F4(e7);
                SystemClock.elapsedRealtime();
                l6.getClass();
                c42.a("post-error");
                ((ExecutorC1996v4) l6.f9620b).f17222b.post(new RunnableC0912b0(c42, new A1.s(f42), (Object) null, 1));
                c42.m();
            }
            c42.c();
        } catch (Throwable th) {
            c42.c();
            throw th;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(10);
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                if (this.f17676d) {
                    Thread.currentThread().interrupt();
                    return;
                }
                I4.c("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
