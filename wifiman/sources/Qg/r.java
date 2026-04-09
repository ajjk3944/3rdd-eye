package qg;

import hg.InterfaceC6043c;
import ng.InterfaceC6941b;
import yg.EnumC8672g;

/* loaded from: classes4.dex */
public final class r extends gg.n implements InterfaceC6941b {

    /* renamed from: a, reason: collision with root package name */
    final gg.i f59212a;

    /* renamed from: b, reason: collision with root package name */
    final long f59213b;

    static final class a implements gg.l, InterfaceC6043c {

        /* renamed from: a, reason: collision with root package name */
        final gg.p f59214a;

        /* renamed from: b, reason: collision with root package name */
        final long f59215b;

        /* renamed from: c, reason: collision with root package name */
        Dj.c f59216c;

        /* renamed from: d, reason: collision with root package name */
        long f59217d;

        /* renamed from: e, reason: collision with root package name */
        boolean f59218e;

        a(gg.p pVar, long j10) {
            this.f59214a = pVar;
            this.f59215b = j10;
        }

        @Override // Dj.b
        public void a() {
            this.f59216c = EnumC8672g.CANCELLED;
            if (this.f59218e) {
                return;
            }
            this.f59218e = true;
            this.f59214a.a();
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            this.f59216c.cancel();
            this.f59216c = EnumC8672g.CANCELLED;
        }

        @Override // Dj.b
        public void h(Object obj) {
            if (this.f59218e) {
                return;
            }
            long j10 = this.f59217d;
            if (j10 != this.f59215b) {
                this.f59217d = j10 + 1;
                return;
            }
            this.f59218e = true;
            this.f59216c.cancel();
            this.f59216c = EnumC8672g.CANCELLED;
            this.f59214a.onSuccess(obj);
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return this.f59216c == EnumC8672g.CANCELLED;
        }

        @Override // gg.l
        public void j(Dj.c cVar) {
            if (EnumC8672g.validate(this.f59216c, cVar)) {
                this.f59216c = cVar;
                this.f59214a.c(this);
                cVar.request(this.f59215b + 1);
            }
        }

        @Override // Dj.b
        public void onError(Throwable th2) {
            if (this.f59218e) {
                Eg.a.v(th2);
                return;
            }
            this.f59218e = true;
            this.f59216c = EnumC8672g.CANCELLED;
            this.f59214a.onError(th2);
        }
    }

    public r(gg.i iVar, long j10) {
        this.f59212a = iVar;
        this.f59213b = j10;
    }

    @Override // ng.InterfaceC6941b
    public gg.i f() {
        return Eg.a.o(new C7499q(this.f59212a, this.f59213b, null, false));
    }

    @Override // gg.n
    protected void v(gg.p pVar) {
        this.f59212a.D1(new a(pVar, this.f59213b));
    }
}
