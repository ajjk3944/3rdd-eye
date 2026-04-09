package qg;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import yg.EnumC8672g;
import zg.AbstractC8756i;
import zg.C8750c;

/* loaded from: classes4.dex */
public final class o0 extends AbstractC7484b {

    /* renamed from: c, reason: collision with root package name */
    final Dj.a f59172c;

    static final class a extends AtomicInteger implements Dg.a, Dj.c {

        /* renamed from: a, reason: collision with root package name */
        final Dj.b f59173a;

        /* renamed from: b, reason: collision with root package name */
        final AtomicReference f59174b = new AtomicReference();

        /* renamed from: c, reason: collision with root package name */
        final AtomicLong f59175c = new AtomicLong();

        /* renamed from: d, reason: collision with root package name */
        final C2075a f59176d = new C2075a();

        /* renamed from: e, reason: collision with root package name */
        final C8750c f59177e = new C8750c();

        /* renamed from: f, reason: collision with root package name */
        volatile boolean f59178f;

        /* renamed from: qg.o0$a$a, reason: collision with other inner class name */
        final class C2075a extends AtomicReference implements gg.l {
            C2075a() {
            }

            @Override // Dj.b
            public void a() {
                a.this.f59178f = true;
            }

            @Override // Dj.b
            public void h(Object obj) {
                a.this.f59178f = true;
                ((Dj.c) get()).cancel();
            }

            @Override // gg.l
            public void j(Dj.c cVar) {
                EnumC8672g.setOnce(this, cVar, Long.MAX_VALUE);
            }

            @Override // Dj.b
            public void onError(Throwable th2) {
                EnumC8672g.cancel(a.this.f59174b);
                a aVar = a.this;
                AbstractC8756i.c(aVar.f59173a, th2, aVar, aVar.f59177e);
            }
        }

        a(Dj.b bVar) {
            this.f59173a = bVar;
        }

        @Override // Dj.b
        public void a() {
            EnumC8672g.cancel(this.f59176d);
            AbstractC8756i.a(this.f59173a, this, this.f59177e);
        }

        @Override // Dj.c
        public void cancel() {
            EnumC8672g.cancel(this.f59174b);
            EnumC8672g.cancel(this.f59176d);
        }

        @Override // Dj.b
        public void h(Object obj) {
            if (m(obj)) {
                return;
            }
            ((Dj.c) this.f59174b.get()).request(1L);
        }

        @Override // gg.l
        public void j(Dj.c cVar) {
            EnumC8672g.deferredSetOnce(this.f59174b, this.f59175c, cVar);
        }

        @Override // Dg.a
        public boolean m(Object obj) {
            if (!this.f59178f) {
                return false;
            }
            AbstractC8756i.f(this.f59173a, obj, this, this.f59177e);
            return true;
        }

        @Override // Dj.b
        public void onError(Throwable th2) {
            EnumC8672g.cancel(this.f59176d);
            AbstractC8756i.c(this.f59173a, th2, this, this.f59177e);
        }

        @Override // Dj.c
        public void request(long j10) {
            EnumC8672g.deferredRequest(this.f59174b, this.f59175c, j10);
        }
    }

    public o0(gg.i iVar, Dj.a aVar) {
        super(iVar);
        this.f59172c = aVar;
    }

    @Override // gg.i
    protected void E1(Dj.b bVar) {
        a aVar = new a(bVar);
        bVar.j(aVar);
        this.f59172c.b(aVar.f59176d);
        this.f58857b.D1(aVar);
    }
}
