package com.mbridge.msdk.tracker.network;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public class u {

    /* renamed from: a, reason: collision with root package name */
    private volatile ThreadPoolExecutor f18405a;

    /* renamed from: e, reason: collision with root package name */
    private final int f18409e;

    /* renamed from: f, reason: collision with root package name */
    private final com.mbridge.msdk.tracker.network.b f18410f;

    /* renamed from: g, reason: collision with root package name */
    private final m f18411g;

    /* renamed from: h, reason: collision with root package name */
    private final w f18412h;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicInteger f18406b = new AtomicInteger();

    /* renamed from: c, reason: collision with root package name */
    private final Set<t<?>> f18407c = new HashSet();

    /* renamed from: d, reason: collision with root package name */
    private final PriorityBlockingQueue<t<?>> f18408d = new PriorityBlockingQueue<>();

    /* renamed from: i, reason: collision with root package name */
    private final List<c> f18413i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    private boolean f18414j = false;

    public class a implements ThreadFactory {
        public a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "NetworkDispatcher");
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                new n(u.this.f18408d, u.this.f18411g, u.this.f18410f, u.this.f18412h).run();
            } catch (Throwable unused) {
            }
        }
    }

    public interface c {
        void a(t<?> tVar, int i10);
    }

    public u(m mVar, w wVar, int i10, com.mbridge.msdk.tracker.network.b bVar) {
        this.f18409e = i10;
        this.f18410f = bVar;
        this.f18411g = mVar;
        this.f18412h = wVar;
    }

    private void a(int i10) {
        if (this.f18405a != null) {
            return;
        }
        try {
            b(i10);
        } catch (Throwable unused) {
            try {
                b(5);
            } catch (Exception unused2) {
                this.f18405a = null;
            }
        }
    }

    public void b() {
        if (!this.f18414j || this.f18405a == null) {
            a(this.f18409e);
            this.f18414j = true;
        }
    }

    public <T> void c(t<T> tVar) {
        synchronized (this.f18407c) {
            this.f18407c.remove(tVar);
        }
        a(tVar, 5);
    }

    public <T> void d(t<T> tVar) {
        this.f18408d.add(tVar);
    }

    private void b(int i10) {
        this.f18405a = new ThreadPoolExecutor(i10, i10, 100L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new a(), new ThreadPoolExecutor.DiscardPolicy());
    }

    public int a() {
        return this.f18406b.incrementAndGet();
    }

    public <T> void b(t<T> tVar) {
        d(tVar);
    }

    public <T> t<T> a(t<T> tVar) {
        tVar.a(this);
        synchronized (this.f18407c) {
            this.f18407c.add(tVar);
        }
        tVar.b(a());
        tVar.a("add-to-queue");
        a(tVar, 0);
        b(tVar);
        if (this.f18405a == null) {
            a(this.f18409e);
        }
        if (!this.f18405a.isShutdown()) {
            this.f18405a.execute(new b());
        }
        return tVar;
    }

    public void a(t<?> tVar, int i10) {
        synchronized (this.f18413i) {
            try {
                Iterator<c> it = this.f18413i.iterator();
                while (it.hasNext()) {
                    it.next().a(tVar, i10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
