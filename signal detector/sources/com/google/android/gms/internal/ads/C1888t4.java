package com.google.android.gms.internal.ads;

import android.os.Process;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

/* renamed from: com.google.android.gms.internal.ads.t4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1888t4 extends Thread {

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f16848g = I4.f9068a;

    /* renamed from: a, reason: collision with root package name */
    public final BlockingQueue f16849a;

    /* renamed from: b, reason: collision with root package name */
    public final BlockingQueue f16850b;

    /* renamed from: c, reason: collision with root package name */
    public final N4 f16851c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f16852d = false;

    /* renamed from: e, reason: collision with root package name */
    public final C1431kf f16853e;

    /* renamed from: f, reason: collision with root package name */
    public final L6 f16854f;

    public C1888t4(PriorityBlockingQueue priorityBlockingQueue, PriorityBlockingQueue priorityBlockingQueue2, N4 n42, L6 l6) {
        this.f16849a = priorityBlockingQueue;
        this.f16850b = priorityBlockingQueue2;
        this.f16851c = n42;
        this.f16854f = l6;
        this.f16853e = new C1431kf(this, priorityBlockingQueue2, l6);
    }

    public final void a() {
        C4 c42 = (C4) this.f16849a.take();
        c42.a("cache-queue-take");
        c42.c();
        try {
            c42.e();
            N4 n42 = this.f16851c;
            C1834s4 c1834s4A = n42.a(c42.d());
            if (c1834s4A == null) {
                c42.a("cache-miss");
                if (!this.f16853e.t(c42)) {
                    this.f16850b.put(c42);
                }
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (c1834s4A.f16675e < jCurrentTimeMillis) {
                    c42.a("cache-hit-expired");
                    c42.f7524j = c1834s4A;
                    if (!this.f16853e.t(c42)) {
                        this.f16850b.put(c42);
                    }
                } else {
                    c42.a("cache-hit");
                    byte[] bArr = c1834s4A.f16671a;
                    Map map = c1834s4A.f16677g;
                    A1.s sVarI = c42.i(new A4(TTAdConstant.MATE_VALID, bArr, map, A4.a(map), false));
                    c42.a("cache-hit-parsed");
                    if (!(((F4) sVarI.f125d) == null)) {
                        c42.a("cache-parsing-failed");
                        String strD = c42.d();
                        synchronized (n42) {
                            try {
                                C1834s4 c1834s4A2 = n42.a(strD);
                                if (c1834s4A2 != null) {
                                    c1834s4A2.f16676f = 0L;
                                    c1834s4A2.f16675e = 0L;
                                    n42.b(strD, c1834s4A2);
                                }
                            } finally {
                            }
                        }
                        c42.f7524j = null;
                        if (!this.f16853e.t(c42)) {
                            this.f16850b.put(c42);
                        }
                    } else if (c1834s4A.f16676f < jCurrentTimeMillis) {
                        c42.a("cache-hit-refresh-needed");
                        c42.f7524j = c1834s4A;
                        sVarI.f122a = true;
                        if (this.f16853e.t(c42)) {
                            this.f16854f.n(c42, sVarI, null);
                        } else {
                            this.f16854f.n(c42, sVarI, new CD(this, c42, 3, false));
                        }
                    } else {
                        this.f16854f.n(c42, sVarI, null);
                    }
                }
            }
            c42.c();
        } catch (Throwable th) {
            c42.c();
            throw th;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        if (f16848g) {
            I4.a("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.f16851c.c();
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                if (this.f16852d) {
                    Thread.currentThread().interrupt();
                    return;
                }
                I4.c("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
