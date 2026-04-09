package tg;

import hg.InterfaceC6043c;
import lg.C6595e;

/* renamed from: tg.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8100k extends gg.s {

    /* renamed from: a, reason: collision with root package name */
    final gg.v f62439a;

    /* renamed from: b, reason: collision with root package name */
    final gg.v f62440b;

    /* renamed from: tg.k$a */
    final class a implements gg.x {

        /* renamed from: a, reason: collision with root package name */
        final C6595e f62441a;

        /* renamed from: b, reason: collision with root package name */
        final gg.x f62442b;

        /* renamed from: c, reason: collision with root package name */
        boolean f62443c;

        /* renamed from: tg.k$a$a, reason: collision with other inner class name */
        final class C2186a implements gg.x {
            C2186a() {
            }

            @Override // gg.x
            public void a() {
                a.this.f62442b.a();
            }

            @Override // gg.x
            public void c(InterfaceC6043c interfaceC6043c) {
                a.this.f62441a.c(interfaceC6043c);
            }

            @Override // gg.x
            public void h(Object obj) {
                a.this.f62442b.h(obj);
            }

            @Override // gg.x
            public void onError(Throwable th2) {
                a.this.f62442b.onError(th2);
            }
        }

        a(C6595e c6595e, gg.x xVar) {
            this.f62441a = c6595e;
            this.f62442b = xVar;
        }

        @Override // gg.x
        public void a() {
            if (this.f62443c) {
                return;
            }
            this.f62443c = true;
            C8100k.this.f62439a.d(new C2186a());
        }

        @Override // gg.x
        public void c(InterfaceC6043c interfaceC6043c) {
            this.f62441a.c(interfaceC6043c);
        }

        @Override // gg.x
        public void h(Object obj) {
            a();
        }

        @Override // gg.x
        public void onError(Throwable th2) {
            if (this.f62443c) {
                Eg.a.v(th2);
            } else {
                this.f62443c = true;
                this.f62442b.onError(th2);
            }
        }
    }

    public C8100k(gg.v vVar, gg.v vVar2) {
        this.f62439a = vVar;
        this.f62440b = vVar2;
    }

    @Override // gg.s
    public void L0(gg.x xVar) {
        C6595e c6595e = new C6595e();
        xVar.c(c6595e);
        this.f62440b.d(new a(c6595e, xVar));
    }
}
