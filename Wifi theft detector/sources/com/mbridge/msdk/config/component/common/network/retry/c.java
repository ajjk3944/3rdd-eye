package com.mbridge.msdk.config.component.common.network.retry;

import com.mbridge.msdk.foundation.tools.q0;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: d, reason: collision with root package name */
    private ScheduledFuture<?> f13271d;

    /* renamed from: f, reason: collision with root package name */
    private final String f13273f;

    /* renamed from: g, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.nori.model.a f13274g;

    /* renamed from: h, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.common.network.a f13275h;

    /* renamed from: i, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.result.a f13276i;

    /* renamed from: j, reason: collision with root package name */
    private com.mbridge.msdk.config.component.nori.monitor.b f13277j;

    /* renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.connect.socket.a f13268a = null;

    /* renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.connect.okhttp.a f13269b = null;

    /* renamed from: c, reason: collision with root package name */
    private volatile boolean f13270c = false;

    /* renamed from: e, reason: collision with root package name */
    private ScheduledExecutorService f13272e = null;

    /* renamed from: k, reason: collision with root package name */
    private final AtomicInteger f13278k = new AtomicInteger(0);

    public class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        private final AtomicInteger f13279a = new AtomicInteger(1);

        public a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "Retry-InstanceScheduler-" + System.currentTimeMillis() + "-" + this.f13279a.getAndIncrement());
            thread.setDaemon(true);
            return thread;
        }
    }

    public class b implements com.mbridge.msdk.config.component.common.network.retry.a {
        public b() {
        }

        @Override // com.mbridge.msdk.config.component.common.network.retry.a
        public void a() {
            c.this.a();
        }

        @Override // com.mbridge.msdk.config.component.common.network.retry.a
        public void b() {
            c.this.g();
        }
    }

    /* renamed from: com.mbridge.msdk.config.component.common.network.retry.c$c, reason: collision with other inner class name */
    public class C0242c implements com.mbridge.msdk.config.component.common.network.retry.b {
        public C0242c() {
        }

        @Override // com.mbridge.msdk.config.component.common.network.retry.b
        public void a() {
            c.this.a();
        }
    }

    public class d implements com.mbridge.msdk.config.component.common.network.retry.a {
        public d() {
        }

        @Override // com.mbridge.msdk.config.component.common.network.retry.a
        public void a() {
            c.this.a();
        }

        @Override // com.mbridge.msdk.config.component.common.network.retry.a
        public void b() {
            c.this.g();
        }
    }

    public class e implements com.mbridge.msdk.config.component.common.network.retry.b {
        public e() {
        }

        @Override // com.mbridge.msdk.config.component.common.network.retry.b
        public void a() {
            c.this.a();
        }
    }

    public static class f {

        /* renamed from: b, reason: collision with root package name */
        private static final f f13285b = new f();

        /* renamed from: a, reason: collision with root package name */
        private final ThreadPoolExecutor f13286a = new ThreadPoolExecutor(3, 5, 10, TimeUnit.SECONDS, new LinkedBlockingQueue(100), new a(), new ThreadPoolExecutor.DiscardOldestPolicy());

        public class a implements ThreadFactory {

            /* renamed from: a, reason: collision with root package name */
            private final AtomicInteger f13287a = new AtomicInteger(1);

            public a() {
            }

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable, "Retry-NetworkThread-" + this.f13287a.getAndIncrement());
                thread.setDaemon(true);
                return thread;
            }
        }

        private f() {
        }

        public static f a() {
            return f13285b;
        }

        public ThreadPoolExecutor b() {
            return this.f13286a;
        }
    }

    public c(String str, com.mbridge.msdk.config.component.nori.model.a aVar, com.mbridge.msdk.config.component.common.network.a aVar2, com.mbridge.msdk.config.component.common.network.result.a aVar3) {
        this.f13273f = str;
        this.f13274g = aVar;
        this.f13275h = aVar2;
        this.f13276i = aVar3;
        this.f13277j = aVar3.a();
        b();
    }

    private void d() {
        com.mbridge.msdk.config.component.common.network.connect.okhttp.a aVar;
        try {
            try {
                this.f13269b = new com.mbridge.msdk.config.component.common.network.connect.okhttp.a(this.f13274g, this.f13276i, this.f13275h);
                h();
                this.f13269b.a(this.f13273f);
                aVar = this.f13269b;
                if (aVar == null) {
                    return;
                }
            } catch (Exception e10) {
                this.f13276i.c(0);
                this.f13276i.b(0);
                this.f13276i.a(e10.getMessage());
                g();
                aVar = this.f13269b;
                if (aVar == null) {
                    return;
                }
            }
            aVar.a();
        } catch (Throwable th) {
            com.mbridge.msdk.config.component.common.network.connect.okhttp.a aVar2 = this.f13269b;
            if (aVar2 != null) {
                aVar2.a();
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (this.f13270c) {
            q0.c("RequestRetry", "重试任务已被取消，停止执行");
        } else if (this.f13274g.i().equals(com.mbridge.msdk.config.component.common.util.c.a("340"))) {
            f();
        } else if (this.f13274g.i().equals(com.mbridge.msdk.config.component.common.util.c.a("341"))) {
            d();
        }
    }

    private void f() {
        com.mbridge.msdk.config.component.common.network.connect.socket.a aVar;
        try {
            try {
                this.f13268a = new com.mbridge.msdk.config.component.common.network.connect.socket.a(this.f13274g, this.f13276i, this.f13275h);
                i();
                this.f13268a.a(this.f13273f);
                aVar = this.f13268a;
                if (aVar == null) {
                    return;
                }
            } catch (Exception e10) {
                this.f13276i.c(0);
                this.f13276i.b(0);
                this.f13276i.a(e10.getMessage());
                g();
                aVar = this.f13268a;
                if (aVar == null) {
                    return;
                }
            }
            aVar.a();
        } catch (Throwable th) {
            com.mbridge.msdk.config.component.common.network.connect.socket.a aVar2 = this.f13268a;
            if (aVar2 != null) {
                aVar2.a();
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (this.f13270c) {
            q0.c("RequestRetry", "重试任务已被取消，停止调度重试");
            return;
        }
        this.f13278k.incrementAndGet();
        if (this.f13278k.get() >= this.f13274g.g()) {
            q0.c("RequestRetry", "重试次数已达上限: " + this.f13278k.get());
            com.mbridge.msdk.config.component.common.network.a aVar = this.f13275h;
            if (aVar != null) {
                aVar.d(this.f13276i);
            }
            a();
            return;
        }
        q0.b("RequestRetry", "重试 次数 " + this.f13278k.get());
        try {
            ScheduledExecutorService scheduledExecutorService = this.f13272e;
            if (scheduledExecutorService != null) {
                this.f13271d = scheduledExecutorService.schedule(new Runnable() { // from class: com.mbridge.msdk.config.component.common.network.retry.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f13289a.c();
                    }
                }, this.f13274g.h(), TimeUnit.SECONDS);
                q0.c("RequestRetry", "已调度第 " + this.f13278k.get() + " 次重试");
            }
        } catch (Exception e10) {
            q0.b("RequestRetry", "调度重试任务失败: " + e10.getMessage());
            com.mbridge.msdk.config.component.common.network.a aVar2 = this.f13275h;
            if (aVar2 != null) {
                aVar2.d(this.f13276i);
            }
            a();
        }
    }

    private void h() {
        com.mbridge.msdk.config.component.common.network.connect.okhttp.a aVar = this.f13269b;
        if (aVar != null) {
            aVar.a(new d());
        }
        com.mbridge.msdk.config.component.nori.monitor.b bVar = this.f13277j;
        if (bVar != null) {
            bVar.a(new e());
        }
    }

    private void i() {
        com.mbridge.msdk.config.component.common.network.connect.socket.a aVar = this.f13268a;
        if (aVar != null) {
            aVar.a(new b());
        }
        com.mbridge.msdk.config.component.nori.monitor.b bVar = this.f13277j;
        if (bVar != null) {
            bVar.a(new C0242c());
        }
    }

    private void j() {
        ScheduledExecutorService scheduledExecutorService = this.f13272e;
        if (scheduledExecutorService == null || scheduledExecutorService.isShutdown()) {
            return;
        }
        try {
            q0.c("RequestRetry", "正在关闭独立调度器");
            this.f13272e.shutdown();
            if (this.f13272e.awaitTermination(5L, TimeUnit.SECONDS)) {
                q0.c("RequestRetry", "独立调度器已成功关闭");
            } else {
                q0.d("RequestRetry", "独立调度器未能在5秒内关闭，强制关闭");
                this.f13272e.shutdownNow();
            }
        } catch (InterruptedException e10) {
            q0.b("RequestRetry", "关闭独立调度器时被中断: " + e10.getMessage());
            this.f13272e.shutdownNow();
            Thread.currentThread().interrupt();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (this.f13270c) {
            return;
        }
        q0.c("RequestRetry", "取消所有重试任务");
        this.f13270c = true;
        ScheduledFuture<?> scheduledFuture = this.f13271d;
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            this.f13271d.cancel(true);
            q0.c("RequestRetry", "已取消当前重试调度任务");
        }
        com.mbridge.msdk.config.component.common.network.connect.socket.a aVar = this.f13268a;
        if (aVar != null) {
            aVar.a();
            q0.c("RequestRetry", "已取消TCP连接");
        }
        com.mbridge.msdk.config.component.common.network.connect.okhttp.a aVar2 = this.f13269b;
        if (aVar2 != null) {
            aVar2.a();
            q0.c("RequestRetry", "已取消HTTP连接");
        }
        j();
    }

    private void b() {
        try {
            this.f13272e = Executors.newSingleThreadScheduledExecutor(new a());
            q0.c("RequestRetry", "创建独立调度器成功");
        } catch (Exception e10) {
            q0.b("RequestRetry", "创建独立调度器失败: " + e10.getMessage());
        }
    }

    public void c() {
        if (this.f13270c) {
            q0.c("RequestRetry", "重试任务已被取消，跳过执行");
        } else {
            f.a().b().execute(new Runnable() { // from class: com.mbridge.msdk.config.component.common.network.retry.e
                @Override // java.lang.Runnable
                public final void run() {
                    this.f13290a.e();
                }
            });
        }
    }
}
