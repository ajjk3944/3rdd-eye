package qg;

import gg.InterfaceC5914d;
import hg.C6042b;
import hg.InterfaceC6043c;
import ig.AbstractC6152a;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import lg.EnumC6592b;
import yg.AbstractC8666a;
import yg.EnumC8672g;
import zg.C8750c;

/* renamed from: qg.x, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7505x extends AbstractC7484b {

    /* renamed from: c, reason: collision with root package name */
    final kg.n f59334c;

    /* renamed from: d, reason: collision with root package name */
    final int f59335d;

    /* renamed from: e, reason: collision with root package name */
    final boolean f59336e;

    /* renamed from: qg.x$a */
    static final class a extends AbstractC8666a implements gg.l {

        /* renamed from: a, reason: collision with root package name */
        final Dj.b f59337a;

        /* renamed from: c, reason: collision with root package name */
        final kg.n f59339c;

        /* renamed from: d, reason: collision with root package name */
        final boolean f59340d;

        /* renamed from: f, reason: collision with root package name */
        final int f59342f;

        /* renamed from: g, reason: collision with root package name */
        Dj.c f59343g;

        /* renamed from: h, reason: collision with root package name */
        volatile boolean f59344h;

        /* renamed from: b, reason: collision with root package name */
        final C8750c f59338b = new C8750c();

        /* renamed from: e, reason: collision with root package name */
        final C6042b f59341e = new C6042b();

        /* renamed from: qg.x$a$a, reason: collision with other inner class name */
        final class C2078a extends AtomicReference implements InterfaceC5914d, InterfaceC6043c {
            C2078a() {
            }

            @Override // gg.InterfaceC5914d
            public void a() {
                a.this.d(this);
            }

            @Override // gg.InterfaceC5914d
            public void c(InterfaceC6043c interfaceC6043c) {
                EnumC6592b.setOnce(this, interfaceC6043c);
            }

            @Override // hg.InterfaceC6043c
            public void dispose() {
                EnumC6592b.dispose(this);
            }

            @Override // hg.InterfaceC6043c
            public boolean isDisposed() {
                return EnumC6592b.isDisposed((InterfaceC6043c) get());
            }

            @Override // gg.InterfaceC5914d
            public void onError(Throwable th2) {
                a.this.g(this, th2);
            }
        }

        a(Dj.b bVar, kg.n nVar, boolean z10, int i10) {
            this.f59337a = bVar;
            this.f59339c = nVar;
            this.f59340d = z10;
            this.f59342f = i10;
            lazySet(1);
        }

        @Override // Dj.b
        public void a() {
            if (decrementAndGet() == 0) {
                this.f59338b.j(this.f59337a);
            } else if (this.f59342f != Integer.MAX_VALUE) {
                this.f59343g.request(1L);
            }
        }

        @Override // Dj.c
        public void cancel() {
            this.f59344h = true;
            this.f59343g.cancel();
            this.f59341e.dispose();
            this.f59338b.h();
        }

        @Override // Dg.g
        public void clear() {
        }

        void d(C2078a c2078a) {
            this.f59341e.c(c2078a);
            a();
        }

        void g(C2078a c2078a, Throwable th2) {
            this.f59341e.c(c2078a);
            onError(th2);
        }

        @Override // Dj.b
        public void h(Object obj) {
            try {
                Object objApply = this.f59339c.apply(obj);
                Objects.requireNonNull(objApply, "The mapper returned a null CompletableSource");
                gg.f fVar = (gg.f) objApply;
                getAndIncrement();
                C2078a c2078a = new C2078a();
                if (this.f59344h || !this.f59341e.a(c2078a)) {
                    return;
                }
                fVar.e(c2078a);
            } catch (Throwable th2) {
                AbstractC6152a.b(th2);
                this.f59343g.cancel();
                onError(th2);
            }
        }

        @Override // Dg.g
        public boolean isEmpty() {
            return true;
        }

        @Override // gg.l
        public void j(Dj.c cVar) {
            if (EnumC8672g.validate(this.f59343g, cVar)) {
                this.f59343g = cVar;
                this.f59337a.j(this);
                int i10 = this.f59342f;
                if (i10 == Integer.MAX_VALUE) {
                    cVar.request(Long.MAX_VALUE);
                } else {
                    cVar.request(i10);
                }
            }
        }

        @Override // Dj.b
        public void onError(Throwable th2) {
            if (this.f59338b.g(th2)) {
                if (!this.f59340d) {
                    this.f59344h = true;
                    this.f59343g.cancel();
                    this.f59341e.dispose();
                    this.f59338b.j(this.f59337a);
                    return;
                }
                if (decrementAndGet() == 0) {
                    this.f59338b.j(this.f59337a);
                } else if (this.f59342f != Integer.MAX_VALUE) {
                    this.f59343g.request(1L);
                }
            }
        }

        @Override // Dg.g
        public Object poll() {
            return null;
        }

        @Override // Dj.c
        public void request(long j10) {
        }

        @Override // Dg.c
        public int requestFusion(int i10) {
            return i10 & 2;
        }
    }

    public C7505x(gg.i iVar, kg.n nVar, boolean z10, int i10) {
        super(iVar);
        this.f59334c = nVar;
        this.f59336e = z10;
        this.f59335d = i10;
    }

    @Override // gg.i
    protected void E1(Dj.b bVar) {
        this.f58857b.D1(new a(bVar, this.f59334c, this.f59336e, this.f59335d));
    }
}
