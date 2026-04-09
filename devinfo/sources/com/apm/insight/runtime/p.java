package com.apm.insight.runtime;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    private final HandlerThread f3508a;

    /* renamed from: d, reason: collision with root package name */
    private volatile Handler f3511d;

    /* renamed from: b, reason: collision with root package name */
    private final Queue<c> f3509b = new ConcurrentLinkedQueue();

    /* renamed from: c, reason: collision with root package name */
    private final Queue<Message> f3510c = new ConcurrentLinkedQueue();

    /* renamed from: e, reason: collision with root package name */
    private final Object f3512e = new Object();

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            while (!p.this.f3510c.isEmpty()) {
                if (p.this.f3511d != null) {
                    try {
                        p.this.f3511d.sendMessageAtFrontOfQueue((Message) p.this.f3510c.poll());
                    } catch (Throwable unused) {
                    }
                }
            }
            while (!p.this.f3509b.isEmpty()) {
                c cVar = (c) p.this.f3509b.poll();
                if (p.this.f3511d != null) {
                    try {
                        p.this.f3511d.sendMessageAtTime(cVar.f3517a, cVar.f3518b);
                    } catch (Throwable unused2) {
                    }
                }
            }
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class b extends HandlerThread {

        /* renamed from: a, reason: collision with root package name */
        private volatile int f3514a;

        /* renamed from: b, reason: collision with root package name */
        private volatile boolean f3515b;

        public b(String str) {
            super(str);
            this.f3514a = 0;
            this.f3515b = false;
        }

        @Override // android.os.HandlerThread
        public final void onLooperPrepared() {
            super.onLooperPrepared();
            synchronized (p.this.f3512e) {
                p.this.f3511d = new Handler();
            }
            p.this.f3511d.post(p.this.new a());
            while (true) {
                try {
                    Looper.loop();
                } catch (Throwable th2) {
                    try {
                        com.apm.insight.b.f.a(com.apm.insight.e.g()).a().c();
                        if (this.f3514a < 5) {
                            com.apm.insight.c.a();
                            j.a(th2, "NPTH_CATCH");
                        } else if (!this.f3515b) {
                            this.f3515b = true;
                            com.apm.insight.c.a();
                            j.a(new RuntimeException(), "NPTH_ERR_MAX");
                        }
                        this.f3514a++;
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        Message f3517a;

        /* renamed from: b, reason: collision with root package name */
        long f3518b;

        public c(Message message, long j) {
            this.f3517a = message;
            this.f3518b = j;
        }
    }

    static {
        new Object() { // from class: com.apm.insight.runtime.p.1
        };
        new Object() { // from class: com.apm.insight.runtime.p.2
        };
    }

    public p(String str) {
        this.f3508a = new b(str);
    }

    public final void b() {
        this.f3508a.start();
    }

    public final HandlerThread c() {
        return this.f3508a;
    }

    private Message b(Runnable runnable) {
        return Message.obtain(this.f3511d, runnable);
    }

    public final Handler a() {
        return this.f3511d;
    }

    private boolean b(Message message, long j) {
        if (this.f3511d == null) {
            synchronized (this.f3512e) {
                try {
                    if (this.f3511d == null) {
                        this.f3509b.add(new c(message, j));
                        return true;
                    }
                } finally {
                }
            }
        }
        try {
            return this.f3511d.sendMessageAtTime(message, j);
        } catch (Throwable unused) {
            return true;
        }
    }

    public final boolean a(Runnable runnable) {
        return a(b(runnable), 0L);
    }

    public final boolean a(Runnable runnable, long j) {
        return a(b(runnable), j);
    }

    private boolean a(Message message, long j) {
        if (j < 0) {
            j = 0;
        }
        return b(message, SystemClock.uptimeMillis() + j);
    }
}
