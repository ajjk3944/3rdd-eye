package tg;

import hg.InterfaceC6043c;
import lg.EnumC6592b;
import ng.InterfaceC6943d;

/* renamed from: tg.q, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8106q extends gg.n implements InterfaceC6943d {

    /* renamed from: a, reason: collision with root package name */
    final gg.v f62547a;

    /* renamed from: b, reason: collision with root package name */
    final long f62548b;

    /* renamed from: tg.q$a */
    static final class a implements gg.x, InterfaceC6043c {

        /* renamed from: a, reason: collision with root package name */
        final gg.p f62549a;

        /* renamed from: b, reason: collision with root package name */
        final long f62550b;

        /* renamed from: c, reason: collision with root package name */
        InterfaceC6043c f62551c;

        /* renamed from: d, reason: collision with root package name */
        long f62552d;

        /* renamed from: e, reason: collision with root package name */
        boolean f62553e;

        a(gg.p pVar, long j10) {
            this.f62549a = pVar;
            this.f62550b = j10;
        }

        @Override // gg.x
        public void a() {
            if (this.f62553e) {
                return;
            }
            this.f62553e = true;
            this.f62549a.a();
        }

        @Override // gg.x
        public void c(InterfaceC6043c interfaceC6043c) {
            if (EnumC6592b.validate(this.f62551c, interfaceC6043c)) {
                this.f62551c = interfaceC6043c;
                this.f62549a.c(this);
            }
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            this.f62551c.dispose();
        }

        @Override // gg.x
        public void h(Object obj) {
            if (this.f62553e) {
                return;
            }
            long j10 = this.f62552d;
            if (j10 != this.f62550b) {
                this.f62552d = j10 + 1;
                return;
            }
            this.f62553e = true;
            this.f62551c.dispose();
            this.f62549a.onSuccess(obj);
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return this.f62551c.isDisposed();
        }

        @Override // gg.x
        public void onError(Throwable th2) {
            if (this.f62553e) {
                Eg.a.v(th2);
            } else {
                this.f62553e = true;
                this.f62549a.onError(th2);
            }
        }
    }

    public C8106q(gg.v vVar, long j10) {
        this.f62547a = vVar;
        this.f62548b = j10;
    }

    @Override // ng.InterfaceC6943d
    public gg.s b() {
        return Eg.a.q(new C8105p(this.f62547a, this.f62548b, null, false));
    }

    @Override // gg.n
    public void v(gg.p pVar) {
        this.f62547a.d(new a(pVar, this.f62548b));
    }
}
