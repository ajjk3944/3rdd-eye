package qg;

import gg.y;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import yg.EnumC8672g;
import zg.AbstractC8751d;

/* loaded from: classes4.dex */
public final class p0 extends AbstractC7484b {

    /* renamed from: c, reason: collision with root package name */
    final gg.y f59188c;

    /* renamed from: d, reason: collision with root package name */
    final boolean f59189d;

    static final class a extends AtomicReference implements gg.l, Dj.c, Runnable {

        /* renamed from: a, reason: collision with root package name */
        final Dj.b f59190a;

        /* renamed from: b, reason: collision with root package name */
        final y.c f59191b;

        /* renamed from: c, reason: collision with root package name */
        final AtomicReference f59192c = new AtomicReference();

        /* renamed from: d, reason: collision with root package name */
        final AtomicLong f59193d = new AtomicLong();

        /* renamed from: e, reason: collision with root package name */
        final boolean f59194e;

        /* renamed from: f, reason: collision with root package name */
        Dj.a f59195f;

        /* renamed from: qg.p0$a$a, reason: collision with other inner class name */
        static final class RunnableC2076a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final Dj.c f59196a;

            /* renamed from: b, reason: collision with root package name */
            final long f59197b;

            RunnableC2076a(Dj.c cVar, long j10) {
                this.f59196a = cVar;
                this.f59197b = j10;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f59196a.request(this.f59197b);
            }
        }

        a(Dj.b bVar, y.c cVar, Dj.a aVar, boolean z10) {
            this.f59190a = bVar;
            this.f59191b = cVar;
            this.f59195f = aVar;
            this.f59194e = !z10;
        }

        @Override // Dj.b
        public void a() {
            this.f59190a.a();
            this.f59191b.dispose();
        }

        void c(long j10, Dj.c cVar) {
            if (this.f59194e || Thread.currentThread() == get()) {
                cVar.request(j10);
            } else {
                this.f59191b.b(new RunnableC2076a(cVar, j10));
            }
        }

        @Override // Dj.c
        public void cancel() {
            EnumC8672g.cancel(this.f59192c);
            this.f59191b.dispose();
        }

        @Override // Dj.b
        public void h(Object obj) {
            this.f59190a.h(obj);
        }

        @Override // gg.l
        public void j(Dj.c cVar) {
            if (EnumC8672g.setOnce(this.f59192c, cVar)) {
                long andSet = this.f59193d.getAndSet(0L);
                if (andSet != 0) {
                    c(andSet, cVar);
                }
            }
        }

        @Override // Dj.b
        public void onError(Throwable th2) {
            this.f59190a.onError(th2);
            this.f59191b.dispose();
        }

        @Override // Dj.c
        public void request(long j10) {
            if (EnumC8672g.validate(j10)) {
                Dj.c cVar = (Dj.c) this.f59192c.get();
                if (cVar != null) {
                    c(j10, cVar);
                    return;
                }
                AbstractC8751d.a(this.f59193d, j10);
                Dj.c cVar2 = (Dj.c) this.f59192c.get();
                if (cVar2 != null) {
                    long andSet = this.f59193d.getAndSet(0L);
                    if (andSet != 0) {
                        c(andSet, cVar2);
                    }
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            lazySet(Thread.currentThread());
            Dj.a aVar = this.f59195f;
            this.f59195f = null;
            aVar.b(this);
        }
    }

    public p0(gg.i iVar, gg.y yVar, boolean z10) {
        super(iVar);
        this.f59188c = yVar;
        this.f59189d = z10;
    }

    @Override // gg.i
    public void E1(Dj.b bVar) {
        y.c cVarC = this.f59188c.c();
        a aVar = new a(bVar, cVarC, this.f58857b, this.f59189d);
        bVar.j(aVar);
        cVarC.b(aVar);
    }
}
