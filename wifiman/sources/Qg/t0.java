package qg;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import yg.EnumC8672g;
import zg.AbstractC8756i;
import zg.C8750c;

/* loaded from: classes4.dex */
public final class t0 extends AbstractC7484b {

    /* renamed from: c, reason: collision with root package name */
    final Dj.a f59254c;

    static final class a extends AtomicInteger implements gg.l, Dj.c {

        /* renamed from: a, reason: collision with root package name */
        final Dj.b f59255a;

        /* renamed from: b, reason: collision with root package name */
        final AtomicLong f59256b = new AtomicLong();

        /* renamed from: c, reason: collision with root package name */
        final AtomicReference f59257c = new AtomicReference();

        /* renamed from: e, reason: collision with root package name */
        final C2077a f59259e = new C2077a();

        /* renamed from: d, reason: collision with root package name */
        final C8750c f59258d = new C8750c();

        /* renamed from: qg.t0$a$a, reason: collision with other inner class name */
        final class C2077a extends AtomicReference implements gg.l {
            C2077a() {
            }

            @Override // Dj.b
            public void a() {
                EnumC8672g.cancel(a.this.f59257c);
                a aVar = a.this;
                AbstractC8756i.a(aVar.f59255a, aVar, aVar.f59258d);
            }

            @Override // Dj.b
            public void h(Object obj) {
                EnumC8672g.cancel(this);
                a();
            }

            @Override // gg.l
            public void j(Dj.c cVar) {
                EnumC8672g.setOnce(this, cVar, Long.MAX_VALUE);
            }

            @Override // Dj.b
            public void onError(Throwable th2) {
                EnumC8672g.cancel(a.this.f59257c);
                a aVar = a.this;
                AbstractC8756i.c(aVar.f59255a, th2, aVar, aVar.f59258d);
            }
        }

        a(Dj.b bVar) {
            this.f59255a = bVar;
        }

        @Override // Dj.b
        public void a() {
            EnumC8672g.cancel(this.f59259e);
            AbstractC8756i.a(this.f59255a, this, this.f59258d);
        }

        @Override // Dj.c
        public void cancel() {
            EnumC8672g.cancel(this.f59257c);
            EnumC8672g.cancel(this.f59259e);
        }

        @Override // Dj.b
        public void h(Object obj) {
            AbstractC8756i.f(this.f59255a, obj, this, this.f59258d);
        }

        @Override // gg.l
        public void j(Dj.c cVar) {
            EnumC8672g.deferredSetOnce(this.f59257c, this.f59256b, cVar);
        }

        @Override // Dj.b
        public void onError(Throwable th2) {
            EnumC8672g.cancel(this.f59259e);
            AbstractC8756i.c(this.f59255a, th2, this, this.f59258d);
        }

        @Override // Dj.c
        public void request(long j10) {
            EnumC8672g.deferredRequest(this.f59257c, this.f59256b, j10);
        }
    }

    public t0(gg.i iVar, Dj.a aVar) {
        super(iVar);
        this.f59254c = aVar;
    }

    @Override // gg.i
    protected void E1(Dj.b bVar) {
        a aVar = new a(bVar);
        bVar.j(aVar);
        this.f59254c.b(aVar.f59259e);
        this.f58857b.D1(aVar);
    }
}
