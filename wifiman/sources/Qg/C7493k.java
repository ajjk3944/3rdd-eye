package qg;

import gg.y;
import java.util.concurrent.TimeUnit;
import yg.EnumC8672g;

/* renamed from: qg.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7493k extends AbstractC7484b {

    /* renamed from: c, reason: collision with root package name */
    final long f59089c;

    /* renamed from: d, reason: collision with root package name */
    final TimeUnit f59090d;

    /* renamed from: e, reason: collision with root package name */
    final gg.y f59091e;

    /* renamed from: f, reason: collision with root package name */
    final boolean f59092f;

    /* renamed from: qg.k$a */
    static final class a implements gg.l, Dj.c {

        /* renamed from: a, reason: collision with root package name */
        final Dj.b f59093a;

        /* renamed from: b, reason: collision with root package name */
        final long f59094b;

        /* renamed from: c, reason: collision with root package name */
        final TimeUnit f59095c;

        /* renamed from: d, reason: collision with root package name */
        final y.c f59096d;

        /* renamed from: e, reason: collision with root package name */
        final boolean f59097e;

        /* renamed from: f, reason: collision with root package name */
        Dj.c f59098f;

        /* renamed from: qg.k$a$a, reason: collision with other inner class name */
        final class RunnableC2074a implements Runnable {
            RunnableC2074a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    a.this.f59093a.a();
                } finally {
                    a.this.f59096d.dispose();
                }
            }
        }

        /* renamed from: qg.k$a$b */
        final class b implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            private final Throwable f59100a;

            b(Throwable th2) {
                this.f59100a = th2;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    a.this.f59093a.onError(this.f59100a);
                } finally {
                    a.this.f59096d.dispose();
                }
            }
        }

        /* renamed from: qg.k$a$c */
        final class c implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            private final Object f59102a;

            c(Object obj) {
                this.f59102a = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f59093a.h(this.f59102a);
            }
        }

        a(Dj.b bVar, long j10, TimeUnit timeUnit, y.c cVar, boolean z10) {
            this.f59093a = bVar;
            this.f59094b = j10;
            this.f59095c = timeUnit;
            this.f59096d = cVar;
            this.f59097e = z10;
        }

        @Override // Dj.b
        public void a() {
            this.f59096d.c(new RunnableC2074a(), this.f59094b, this.f59095c);
        }

        @Override // Dj.c
        public void cancel() {
            this.f59098f.cancel();
            this.f59096d.dispose();
        }

        @Override // Dj.b
        public void h(Object obj) {
            this.f59096d.c(new c(obj), this.f59094b, this.f59095c);
        }

        @Override // gg.l
        public void j(Dj.c cVar) {
            if (EnumC8672g.validate(this.f59098f, cVar)) {
                this.f59098f = cVar;
                this.f59093a.j(this);
            }
        }

        @Override // Dj.b
        public void onError(Throwable th2) {
            this.f59096d.c(new b(th2), this.f59097e ? this.f59094b : 0L, this.f59095c);
        }

        @Override // Dj.c
        public void request(long j10) {
            this.f59098f.request(j10);
        }
    }

    public C7493k(gg.i iVar, long j10, TimeUnit timeUnit, gg.y yVar, boolean z10) {
        super(iVar);
        this.f59089c = j10;
        this.f59090d = timeUnit;
        this.f59091e = yVar;
        this.f59092f = z10;
    }

    @Override // gg.i
    protected void E1(Dj.b bVar) {
        this.f58857b.D1(new a(this.f59092f ? bVar : new Ig.a(bVar), this.f59089c, this.f59090d, this.f59091e.c(), this.f59092f));
    }
}
