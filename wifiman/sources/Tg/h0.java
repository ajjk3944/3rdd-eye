package tg;

import hg.InterfaceC6043c;
import lg.EnumC6592b;
import lg.EnumC6593c;

/* loaded from: classes4.dex */
public final class h0 extends AbstractC8090a {

    /* renamed from: b, reason: collision with root package name */
    final long f62407b;

    static final class a implements gg.x, InterfaceC6043c {

        /* renamed from: a, reason: collision with root package name */
        final gg.x f62408a;

        /* renamed from: b, reason: collision with root package name */
        boolean f62409b;

        /* renamed from: c, reason: collision with root package name */
        InterfaceC6043c f62410c;

        /* renamed from: d, reason: collision with root package name */
        long f62411d;

        a(gg.x xVar, long j10) {
            this.f62408a = xVar;
            this.f62411d = j10;
        }

        @Override // gg.x
        public void a() {
            if (this.f62409b) {
                return;
            }
            this.f62409b = true;
            this.f62410c.dispose();
            this.f62408a.a();
        }

        @Override // gg.x
        public void c(InterfaceC6043c interfaceC6043c) {
            if (EnumC6592b.validate(this.f62410c, interfaceC6043c)) {
                this.f62410c = interfaceC6043c;
                if (this.f62411d != 0) {
                    this.f62408a.c(this);
                    return;
                }
                this.f62409b = true;
                interfaceC6043c.dispose();
                EnumC6593c.complete(this.f62408a);
            }
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            this.f62410c.dispose();
        }

        @Override // gg.x
        public void h(Object obj) {
            if (this.f62409b) {
                return;
            }
            long j10 = this.f62411d;
            long j11 = j10 - 1;
            this.f62411d = j11;
            if (j10 > 0) {
                boolean z10 = j11 == 0;
                this.f62408a.h(obj);
                if (z10) {
                    a();
                }
            }
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return this.f62410c.isDisposed();
        }

        @Override // gg.x
        public void onError(Throwable th2) {
            if (this.f62409b) {
                Eg.a.v(th2);
                return;
            }
            this.f62409b = true;
            this.f62410c.dispose();
            this.f62408a.onError(th2);
        }
    }

    public h0(gg.v vVar, long j10) {
        super(vVar);
        this.f62407b = j10;
    }

    @Override // gg.s
    protected void L0(gg.x xVar) {
        this.f62287a.d(new a(xVar, this.f62407b));
    }
}
