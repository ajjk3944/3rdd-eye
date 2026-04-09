package tg;

import gg.y;
import hg.InterfaceC6043c;
import java.util.concurrent.TimeUnit;
import lg.EnumC6592b;

/* renamed from: tg.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8099j extends AbstractC8090a {

    /* renamed from: b, reason: collision with root package name */
    final long f62419b;

    /* renamed from: c, reason: collision with root package name */
    final TimeUnit f62420c;

    /* renamed from: d, reason: collision with root package name */
    final gg.y f62421d;

    /* renamed from: e, reason: collision with root package name */
    final boolean f62422e;

    /* renamed from: tg.j$a */
    static final class a implements gg.x, InterfaceC6043c {

        /* renamed from: a, reason: collision with root package name */
        final gg.x f62423a;

        /* renamed from: b, reason: collision with root package name */
        final long f62424b;

        /* renamed from: c, reason: collision with root package name */
        final TimeUnit f62425c;

        /* renamed from: d, reason: collision with root package name */
        final y.c f62426d;

        /* renamed from: e, reason: collision with root package name */
        final boolean f62427e;

        /* renamed from: f, reason: collision with root package name */
        InterfaceC6043c f62428f;

        /* renamed from: tg.j$a$a, reason: collision with other inner class name */
        final class RunnableC2185a implements Runnable {
            RunnableC2185a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    a.this.f62423a.a();
                } finally {
                    a.this.f62426d.dispose();
                }
            }
        }

        /* renamed from: tg.j$a$b */
        final class b implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            private final Throwable f62430a;

            b(Throwable th2) {
                this.f62430a = th2;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    a.this.f62423a.onError(this.f62430a);
                } finally {
                    a.this.f62426d.dispose();
                }
            }
        }

        /* renamed from: tg.j$a$c */
        final class c implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            private final Object f62432a;

            c(Object obj) {
                this.f62432a = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f62423a.h(this.f62432a);
            }
        }

        a(gg.x xVar, long j10, TimeUnit timeUnit, y.c cVar, boolean z10) {
            this.f62423a = xVar;
            this.f62424b = j10;
            this.f62425c = timeUnit;
            this.f62426d = cVar;
            this.f62427e = z10;
        }

        @Override // gg.x
        public void a() {
            this.f62426d.c(new RunnableC2185a(), this.f62424b, this.f62425c);
        }

        @Override // gg.x
        public void c(InterfaceC6043c interfaceC6043c) {
            if (EnumC6592b.validate(this.f62428f, interfaceC6043c)) {
                this.f62428f = interfaceC6043c;
                this.f62423a.c(this);
            }
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            this.f62428f.dispose();
            this.f62426d.dispose();
        }

        @Override // gg.x
        public void h(Object obj) {
            this.f62426d.c(new c(obj), this.f62424b, this.f62425c);
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return this.f62426d.isDisposed();
        }

        @Override // gg.x
        public void onError(Throwable th2) {
            this.f62426d.c(new b(th2), this.f62427e ? this.f62424b : 0L, this.f62425c);
        }
    }

    public C8099j(gg.v vVar, long j10, TimeUnit timeUnit, gg.y yVar, boolean z10) {
        super(vVar);
        this.f62419b = j10;
        this.f62420c = timeUnit;
        this.f62421d = yVar;
        this.f62422e = z10;
    }

    @Override // gg.s
    public void L0(gg.x xVar) {
        this.f62287a.d(new a(this.f62422e ? xVar : new Cg.c(xVar), this.f62419b, this.f62420c, this.f62421d.c(), this.f62422e));
    }
}
