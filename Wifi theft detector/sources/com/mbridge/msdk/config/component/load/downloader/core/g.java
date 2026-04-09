package com.mbridge.msdk.config.component.load.downloader.core;

import com.mbridge.msdk.config.component.load.downloader.DownloadProgress;
import com.mbridge.msdk.config.component.load.downloader.database.c;
import com.mbridge.msdk.foundation.download.core.IDownloadTask;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class g implements m {

    /* renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.config.component.load.downloader.database.c f13443b;

    /* renamed from: c, reason: collision with root package name */
    private volatile com.mbridge.msdk.config.component.load.downloader.b f13444c;

    /* renamed from: f, reason: collision with root package name */
    private volatile d f13447f;

    /* renamed from: a, reason: collision with root package name */
    private final Object f13442a = new Object();

    /* renamed from: d, reason: collision with root package name */
    private volatile com.mbridge.msdk.config.component.load.downloader.database.b f13445d = null;

    /* renamed from: e, reason: collision with root package name */
    private volatile boolean f13446e = true;

    public class a implements c.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CountDownLatch f13448a;

        public a(CountDownLatch countDownLatch) {
            this.f13448a = countDownLatch;
        }

        @Override // com.mbridge.msdk.config.component.load.downloader.database.c.a
        public void a(com.mbridge.msdk.config.component.load.downloader.database.b bVar) {
            synchronized (g.this.f13442a) {
                try {
                    if (g.this.f13446e) {
                        g.this.f13445d = bVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f13448a.countDown();
        }
    }

    private g(d dVar, com.mbridge.msdk.config.component.load.downloader.b bVar, com.mbridge.msdk.config.component.load.downloader.database.c cVar) {
        this.f13447f = dVar;
        this.f13444c = bVar;
        this.f13443b = cVar;
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.core.m
    public com.mbridge.msdk.config.component.load.downloader.d run() {
        String strF = this.f13447f.f();
        if (this.f13447f.j() == com.mbridge.msdk.config.component.load.downloader.e.CANCELLED) {
            com.mbridge.msdk.config.component.load.downloader.d dVar = new com.mbridge.msdk.config.component.load.downloader.d();
            dVar.a(true);
            return dVar;
        }
        if (this.f13444c.c() == 0) {
            com.mbridge.msdk.config.component.load.downloader.d dVar2 = new com.mbridge.msdk.config.component.load.downloader.d();
            dVar2.b(true);
            return dVar2;
        }
        String strE = this.f13444c.e();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.f13443b.a(strF, strE, new a(countDownLatch));
        try {
            try {
                countDownLatch.await(10L, TimeUnit.SECONDS);
                synchronized (this.f13442a) {
                    this.f13446e = false;
                }
            } catch (InterruptedException e10) {
                q0.a(IDownloadTask.TAG, e10.getMessage(), e10);
                countDownLatch.countDown();
                synchronized (this.f13442a) {
                    this.f13446e = false;
                }
            }
            com.mbridge.msdk.config.component.load.downloader.d dVarRun = k.a(this.f13447f, this.f13445d, this.f13443b, strF, this.f13444c).run();
            if (!com.mbridge.msdk.config.component.load.downloader.utils.a.a(dVarRun) || !dVarRun.c()) {
                if (this.f13444c != null) {
                    this.f13444c.a(false);
                }
                return n.a(this.f13447f, this.f13445d, this.f13443b, this.f13444c).run();
            }
            if (this.f13444c != null) {
                this.f13444c.a(true);
                this.f13444c.a(this.f13447f.l());
                this.f13444c.a(this.f13445d.d());
                this.f13444c.a(((this.f13447f.g() * 1.0f) / this.f13447f.l()) * 100.0f);
            }
            a(this.f13447f, this.f13444c);
            this.f13445d = com.mbridge.msdk.config.component.load.downloader.database.b.a(this.f13445d.c(), this.f13445d.e(), this.f13445d.b(), this.f13445d.i(), System.currentTimeMillis(), this.f13447f.l(), this.f13445d.a(), this.f13445d.f(), this.f13445d.d());
            this.f13443b.a(this.f13445d, this.f13444c.e());
            return dVarRun;
        } catch (Throwable th) {
            synchronized (this.f13442a) {
                this.f13446e = false;
                throw th;
            }
        }
    }

    public static m a(d dVar, com.mbridge.msdk.config.component.load.downloader.b bVar, com.mbridge.msdk.config.component.load.downloader.database.c cVar) {
        return new g(dVar, bVar, cVar);
    }

    private void a(d dVar, com.mbridge.msdk.config.component.load.downloader.b bVar) {
        if (dVar.j() != com.mbridge.msdk.config.component.load.downloader.e.CANCELLED) {
            long jG = this.f13447f.g();
            long jL = this.f13447f.l();
            dVar.a(bVar, new DownloadProgress(jG, jL, com.mbridge.msdk.config.component.load.downloader.utils.b.a(jL, jG)));
        }
    }
}
