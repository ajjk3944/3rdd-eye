package tg;

import hg.InterfaceC6043c;
import lg.EnumC6592b;

/* loaded from: classes4.dex */
public final class e0 extends AbstractC8090a {

    /* renamed from: b, reason: collision with root package name */
    final long f62356b;

    static final class a implements gg.x, InterfaceC6043c {

        /* renamed from: a, reason: collision with root package name */
        final gg.x f62357a;

        /* renamed from: b, reason: collision with root package name */
        long f62358b;

        /* renamed from: c, reason: collision with root package name */
        InterfaceC6043c f62359c;

        a(gg.x xVar, long j10) {
            this.f62357a = xVar;
            this.f62358b = j10;
        }

        @Override // gg.x
        public void a() {
            this.f62357a.a();
        }

        @Override // gg.x
        public void c(InterfaceC6043c interfaceC6043c) {
            if (EnumC6592b.validate(this.f62359c, interfaceC6043c)) {
                this.f62359c = interfaceC6043c;
                this.f62357a.c(this);
            }
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            this.f62359c.dispose();
        }

        @Override // gg.x
        public void h(Object obj) {
            long j10 = this.f62358b;
            if (j10 != 0) {
                this.f62358b = j10 - 1;
            } else {
                this.f62357a.h(obj);
            }
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return this.f62359c.isDisposed();
        }

        @Override // gg.x
        public void onError(Throwable th2) {
            this.f62357a.onError(th2);
        }
    }

    public e0(gg.v vVar, long j10) {
        super(vVar);
        this.f62356b = j10;
    }

    @Override // gg.s
    public void L0(gg.x xVar) {
        this.f62287a.d(new a(xVar, this.f62356b));
    }
}
