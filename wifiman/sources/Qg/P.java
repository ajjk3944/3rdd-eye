package qg;

import gg.InterfaceC5914d;
import hg.InterfaceC6043c;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import lg.EnumC6592b;
import yg.EnumC8672g;
import zg.AbstractC8756i;
import zg.C8750c;

/* loaded from: classes4.dex */
public final class P extends AbstractC7484b {

    /* renamed from: c, reason: collision with root package name */
    final gg.f f58753c;

    static final class a extends AtomicInteger implements gg.l, Dj.c {

        /* renamed from: a, reason: collision with root package name */
        final Dj.b f58754a;

        /* renamed from: b, reason: collision with root package name */
        final AtomicReference f58755b = new AtomicReference();

        /* renamed from: c, reason: collision with root package name */
        final C2069a f58756c = new C2069a(this);

        /* renamed from: d, reason: collision with root package name */
        final C8750c f58757d = new C8750c();

        /* renamed from: e, reason: collision with root package name */
        final AtomicLong f58758e = new AtomicLong();

        /* renamed from: f, reason: collision with root package name */
        volatile boolean f58759f;

        /* renamed from: g, reason: collision with root package name */
        volatile boolean f58760g;

        /* renamed from: qg.P$a$a, reason: collision with other inner class name */
        static final class C2069a extends AtomicReference implements InterfaceC5914d {

            /* renamed from: a, reason: collision with root package name */
            final a f58761a;

            C2069a(a aVar) {
                this.f58761a = aVar;
            }

            @Override // gg.InterfaceC5914d
            public void a() {
                this.f58761a.c();
            }

            @Override // gg.InterfaceC5914d
            public void c(InterfaceC6043c interfaceC6043c) {
                EnumC6592b.setOnce(this, interfaceC6043c);
            }

            @Override // gg.InterfaceC5914d
            public void onError(Throwable th2) {
                this.f58761a.d(th2);
            }
        }

        a(Dj.b bVar) {
            this.f58754a = bVar;
        }

        @Override // Dj.b
        public void a() {
            this.f58759f = true;
            if (this.f58760g) {
                AbstractC8756i.a(this.f58754a, this, this.f58757d);
            }
        }

        void c() {
            this.f58760g = true;
            if (this.f58759f) {
                AbstractC8756i.a(this.f58754a, this, this.f58757d);
            }
        }

        @Override // Dj.c
        public void cancel() {
            EnumC8672g.cancel(this.f58755b);
            EnumC6592b.dispose(this.f58756c);
            this.f58757d.h();
        }

        void d(Throwable th2) {
            EnumC8672g.cancel(this.f58755b);
            AbstractC8756i.c(this.f58754a, th2, this, this.f58757d);
        }

        @Override // Dj.b
        public void h(Object obj) {
            AbstractC8756i.f(this.f58754a, obj, this, this.f58757d);
        }

        @Override // gg.l
        public void j(Dj.c cVar) {
            EnumC8672g.deferredSetOnce(this.f58755b, this.f58758e, cVar);
        }

        @Override // Dj.b
        public void onError(Throwable th2) {
            EnumC6592b.dispose(this.f58756c);
            AbstractC8756i.c(this.f58754a, th2, this, this.f58757d);
        }

        @Override // Dj.c
        public void request(long j10) {
            EnumC8672g.deferredRequest(this.f58755b, this.f58758e, j10);
        }
    }

    public P(gg.i iVar, gg.f fVar) {
        super(iVar);
        this.f58753c = fVar;
    }

    @Override // gg.i
    protected void E1(Dj.b bVar) {
        a aVar = new a(bVar);
        bVar.j(aVar);
        this.f58857b.D1(aVar);
        this.f58753c.e(aVar.f58756c);
    }
}
