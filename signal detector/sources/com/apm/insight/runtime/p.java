package com.apm.insight.runtime;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    private final HandlerThread f6471a;

    /* renamed from: d, reason: collision with root package name */
    private volatile Handler f6474d;

    /* renamed from: b, reason: collision with root package name */
    private final Queue<c> f6472b = new ConcurrentLinkedQueue();

    /* renamed from: c, reason: collision with root package name */
    private final Queue<Message> f6473c = new ConcurrentLinkedQueue();

    /* renamed from: e, reason: collision with root package name */
    private final Object f6475e = new Object();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            while (!p.this.f6473c.isEmpty()) {
                if (p.this.f6474d != null) {
                    try {
                        p.this.f6474d.sendMessageAtFrontOfQueue((Message) p.this.f6473c.poll());
                    } catch (Throwable unused) {
                    }
                }
            }
            while (!p.this.f6472b.isEmpty()) {
                c cVar = (c) p.this.f6472b.poll();
                if (p.this.f6474d != null) {
                    try {
                        p.this.f6474d.sendMessageAtTime(cVar.f6480a, cVar.f6481b);
                    } catch (Throwable unused2) {
                    }
                }
            }
        }
    }

    public class b extends HandlerThread {

        /* renamed from: a, reason: collision with root package name */
        private volatile int f6477a;

        /* renamed from: b, reason: collision with root package name */
        private volatile boolean f6478b;

        public b(String str) {
            super(str);
            this.f6477a = 0;
            this.f6478b = false;
        }

        @Override // android.os.HandlerThread
        public final void onLooperPrepared() {
            super.onLooperPrepared();
            synchronized (p.this.f6475e) {
                p.this.f6474d = new Handler();
            }
            p.this.f6474d.post(p.this.new a());
            while (true) {
                try {
                    Looper.loop();
                } catch (Throwable th) {
                    try {
                        com.apm.insight.b.f.a(com.apm.insight.e.g()).a().c();
                        if (this.f6477a < 5) {
                            com.apm.insight.c.a();
                            j.a(th, "NPTH_CATCH");
                        } else if (!this.f6478b) {
                            this.f6478b = true;
                            com.apm.insight.c.a();
                            j.a(new RuntimeException(), "NPTH_ERR_MAX");
                        }
                        this.f6477a++;
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        Message f6480a;

        /* renamed from: b, reason: collision with root package name */
        long f6481b;

        public c(Message message, long j6) {
            this.f6480a = message;
            this.f6481b = j6;
        }
    }

    static {
        new Object() { // from class: com.apm.insight.runtime.p.1
        };
        new Object() { // from class: com.apm.insight.runtime.p.2
        };
    }

    public p(String str) {
        this.f6471a = new b(str);
    }

    public final void b() {
        this.f6471a.start();
    }

    public final HandlerThread c() {
        return this.f6471a;
    }

    private Message b(Runnable runnable) {
        return Message.obtain(this.f6474d, runnable);
    }

    public final Handler a() {
        return this.f6474d;
    }

    private boolean b(Message message, long j6) {
        if (this.f6474d == null) {
            synchronized (this.f6475e) {
                try {
                    if (this.f6474d == null) {
                        this.f6472b.add(new c(message, j6));
                        return true;
                    }
                } finally {
                }
            }
        }
        try {
            return this.f6474d.sendMessageAtTime(message, j6);
        } catch (Throwable unused) {
            return true;
        }
    }

    public final boolean a(Runnable runnable) {
        return a(b(runnable), 0L);
    }

    public final boolean a(Runnable runnable, long j6) {
        return a(b(runnable), j6);
    }

    private boolean a(Message message, long j6) {
        if (j6 < 0) {
            j6 = 0;
        }
        return b(message, SystemClock.uptimeMillis() + j6);
    }
}
