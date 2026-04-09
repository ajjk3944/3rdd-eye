package com.bumptech.glide.load.engine;

import android.os.Process;
import com.bumptech.glide.load.engine.o;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
final class a {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f34299a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f34300b;

    /* renamed from: c, reason: collision with root package name */
    final Map f34301c;

    /* renamed from: d, reason: collision with root package name */
    private final ReferenceQueue f34302d;

    /* renamed from: e, reason: collision with root package name */
    private o.a f34303e;

    /* renamed from: f, reason: collision with root package name */
    private volatile boolean f34304f;

    /* renamed from: com.bumptech.glide.load.engine.a$a, reason: collision with other inner class name */
    class ThreadFactoryC1194a implements ThreadFactory {

        /* renamed from: com.bumptech.glide.load.engine.a$a$a, reason: collision with other inner class name */
        class RunnableC1195a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Runnable f34305a;

            RunnableC1195a(Runnable runnable) {
                this.f34305a = runnable;
            }

            @Override // java.lang.Runnable
            public void run() throws SecurityException, IllegalArgumentException {
                Process.setThreadPriority(10);
                this.f34305a.run();
            }
        }

        ThreadFactoryC1194a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(new RunnableC1195a(runnable), "glide-active-resources");
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.b();
        }
    }

    static final class c extends WeakReference {

        /* renamed from: a, reason: collision with root package name */
        final C2.e f34308a;

        /* renamed from: b, reason: collision with root package name */
        final boolean f34309b;

        /* renamed from: c, reason: collision with root package name */
        E2.c f34310c;

        c(C2.e eVar, o oVar, ReferenceQueue referenceQueue, boolean z10) {
            super(oVar, referenceQueue);
            this.f34308a = (C2.e) W2.k.d(eVar);
            this.f34310c = (oVar.f() && z10) ? (E2.c) W2.k.d(oVar.e()) : null;
            this.f34309b = oVar.f();
        }

        void a() {
            this.f34310c = null;
            clear();
        }
    }

    a(boolean z10) {
        this(z10, Executors.newSingleThreadExecutor(new ThreadFactoryC1194a()));
    }

    synchronized void a(C2.e eVar, o oVar) {
        c cVar = (c) this.f34301c.put(eVar, new c(eVar, oVar, this.f34302d, this.f34299a));
        if (cVar != null) {
            cVar.a();
        }
    }

    void b() {
        while (!this.f34304f) {
            try {
                c((c) this.f34302d.remove());
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    void c(c cVar) {
        E2.c cVar2;
        synchronized (this) {
            this.f34301c.remove(cVar.f34308a);
            if (cVar.f34309b && (cVar2 = cVar.f34310c) != null) {
                this.f34303e.c(cVar.f34308a, new o(cVar2, true, false, cVar.f34308a, this.f34303e));
            }
        }
    }

    synchronized void d(C2.e eVar) {
        c cVar = (c) this.f34301c.remove(eVar);
        if (cVar != null) {
            cVar.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    synchronized o e(C2.e eVar) {
        c cVar = (c) this.f34301c.get(eVar);
        if (cVar == null) {
            return null;
        }
        o oVar = (o) cVar.get();
        if (oVar == null) {
            c(cVar);
        }
        return oVar;
    }

    void f(o.a aVar) {
        synchronized (aVar) {
            synchronized (this) {
                this.f34303e = aVar;
            }
        }
    }

    a(boolean z10, Executor executor) {
        this.f34301c = new HashMap();
        this.f34302d = new ReferenceQueue();
        this.f34299a = z10;
        this.f34300b = executor;
        executor.execute(new b());
    }
}
