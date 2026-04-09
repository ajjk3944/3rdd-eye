package com.apm.insight.runtime;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    private final HandlerThread f5294a;

    /* renamed from: d, reason: collision with root package name */
    private volatile Handler f5297d;

    /* renamed from: b, reason: collision with root package name */
    private final Queue<c> f5295b = new ConcurrentLinkedQueue();

    /* renamed from: c, reason: collision with root package name */
    private final Queue<Message> f5296c = new ConcurrentLinkedQueue();

    /* renamed from: e, reason: collision with root package name */
    private final Object f5298e = new Object();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            while (!p.this.f5296c.isEmpty()) {
                if (p.this.f5297d != null) {
                    try {
                        p.this.f5297d.sendMessageAtFrontOfQueue((Message) p.this.f5296c.poll());
                    } catch (Throwable unused) {
                    }
                }
            }
            while (!p.this.f5295b.isEmpty()) {
                c cVar = (c) p.this.f5295b.poll();
                if (p.this.f5297d != null) {
                    try {
                        p.this.f5297d.sendMessageAtTime(cVar.f5303a, cVar.f5304b);
                    } catch (Throwable unused2) {
                    }
                }
            }
        }
    }

    public class b extends HandlerThread {

        /* renamed from: a, reason: collision with root package name */
        private volatile int f5300a;

        /* renamed from: b, reason: collision with root package name */
        private volatile boolean f5301b;

        public b(String str) {
            super(str);
            this.f5300a = 0;
            this.f5301b = false;
        }

        @Override // android.os.HandlerThread
        public final void onLooperPrepared() {
            super.onLooperPrepared();
            synchronized (p.this.f5298e) {
                p.this.f5297d = new Handler();
            }
            p.this.f5297d.post(p.this.new a());
            while (true) {
                try {
                    Looper.loop();
                } catch (Throwable th) {
                    try {
                        com.apm.insight.b.f.a(com.apm.insight.e.g()).a().c();
                        if (this.f5300a < 5) {
                            com.apm.insight.c.a();
                            j.a(th, "NPTH_CATCH");
                        } else if (!this.f5301b) {
                            this.f5301b = true;
                            com.apm.insight.c.a();
                            j.a(new RuntimeException(), "NPTH_ERR_MAX");
                        }
                        this.f5300a++;
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        Message f5303a;

        /* renamed from: b, reason: collision with root package name */
        long f5304b;

        public c(Message message, long j10) {
            this.f5303a = message;
            this.f5304b = j10;
        }
    }

    static {
        new Object() { // from class: com.apm.insight.runtime.p.1
        };
        new Object() { // from class: com.apm.insight.runtime.p.2
        };
    }

    public p(String str) {
        this.f5294a = new b(str);
    }

    public final void b() {
        this.f5294a.start();
    }

    public final HandlerThread c() {
        return this.f5294a;
    }

    private Message b(Runnable runnable) {
        return Message.obtain(this.f5297d, runnable);
    }

    @Nullable
    public final Handler a() {
        return this.f5297d;
    }

    private boolean b(Message message, long j10) {
        if (this.f5297d == null) {
            synchronized (this.f5298e) {
                try {
                    if (this.f5297d == null) {
                        this.f5295b.add(new c(message, j10));
                        return true;
                    }
                } finally {
                }
            }
        }
        try {
            return this.f5297d.sendMessageAtTime(message, j10);
        } catch (Throwable unused) {
            return true;
        }
    }

    public final boolean a(Runnable runnable) {
        return a(b(runnable), 0L);
    }

    public final boolean a(Runnable runnable, long j10) {
        return a(b(runnable), j10);
    }

    private boolean a(Message message, long j10) {
        if (j10 < 0) {
            j10 = 0;
        }
        return b(message, SystemClock.uptimeMillis() + j10);
    }
}
