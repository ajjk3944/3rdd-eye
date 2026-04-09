package com.mbridge.msdk.config.component.common.network.connect.socket;

import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: d, reason: collision with root package name */
    private static volatile c f13253d;

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentLinkedQueue<Runnable> f13254a = new ConcurrentLinkedQueue<>();

    /* renamed from: b, reason: collision with root package name */
    private ThreadPoolExecutor f13255b;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f13256c;

    public class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        private final AtomicInteger f13257a = new AtomicInteger(1);

        public a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "Socket-Thread-" + this.f13257a.getAndIncrement());
            thread.setDaemon(true);
            return thread;
        }
    }

    private c() {
        int iAvailableProcessors = (Runtime.getRuntime().availableProcessors() * 2) + 1;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(iAvailableProcessors, iAvailableProcessors, 10L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(), new ThreadPoolExecutor.DiscardPolicy());
        this.f13255b = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f13256c = new AtomicBoolean(false);
    }

    private boolean b() {
        try {
            int iH = m0.h();
            if (iH > 0) {
                int iW = m0.w();
                return iW > 0 && (((double) iH) / ((double) iW)) * 100.0d <= 5.0d;
            }
        } catch (Exception e10) {
            q0.b("SocketThreadPoolManager", "Memory check failed: " + e10.getMessage());
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        while (!this.f13254a.isEmpty()) {
            try {
                Runnable runnablePoll = this.f13254a.poll();
                if (runnablePoll != null) {
                    if ((runnablePoll instanceof b) && ((b) runnablePoll).e() != null) {
                        ((b) runnablePoll).e().callStart();
                    }
                    runnablePoll.run();
                }
            } catch (Throwable th) {
                this.f13256c.set(false);
                if (!this.f13254a.isEmpty()) {
                    d();
                }
                throw th;
            }
        }
        this.f13256c.set(false);
        if (this.f13254a.isEmpty()) {
            return;
        }
        d();
    }

    private void d() {
        if (this.f13256c.compareAndSet(false, true)) {
            this.f13255b.execute(new Runnable() { // from class: com.mbridge.msdk.config.component.common.network.connect.socket.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f13259a.c();
                }
            });
        }
    }

    public static c a() {
        if (f13253d == null) {
            synchronized (c.class) {
                try {
                    if (f13253d == null) {
                        f13253d = new c();
                    }
                } finally {
                }
            }
        }
        return f13253d;
    }

    public void a(Runnable runnable, com.mbridge.msdk.config.component.nori.monitor.a aVar) {
        if (runnable == null) {
            return;
        }
        if (b()) {
            if (aVar != null) {
                aVar.a("Memory low");
            }
        } else if (this.f13254a.offer(runnable)) {
            if (aVar != null) {
                aVar.m();
                a(aVar);
            }
            d();
        }
    }

    private void a(com.mbridge.msdk.config.component.nori.monitor.a aVar) {
        ThreadPoolExecutor threadPoolExecutor;
        if (aVar == null || (threadPoolExecutor = this.f13255b) == null) {
            return;
        }
        aVar.a(threadPoolExecutor.getPoolSize(), this.f13255b.getActiveCount(), this.f13255b.getQueue().size());
    }
}
