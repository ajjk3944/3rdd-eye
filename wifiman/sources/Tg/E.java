package tg;

import hg.InterfaceC6043c;
import yg.EnumC8672g;

/* loaded from: classes4.dex */
public final class E extends gg.s {

    /* renamed from: a, reason: collision with root package name */
    final Dj.a f62127a;

    static final class a implements gg.l, InterfaceC6043c {

        /* renamed from: a, reason: collision with root package name */
        final gg.x f62128a;

        /* renamed from: b, reason: collision with root package name */
        Dj.c f62129b;

        a(gg.x xVar) {
            this.f62128a = xVar;
        }

        @Override // Dj.b
        public void a() {
            this.f62128a.a();
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            this.f62129b.cancel();
            this.f62129b = EnumC8672g.CANCELLED;
        }

        @Override // Dj.b
        public void h(Object obj) {
            this.f62128a.h(obj);
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return this.f62129b == EnumC8672g.CANCELLED;
        }

        @Override // gg.l
        public void j(Dj.c cVar) {
            if (EnumC8672g.validate(this.f62129b, cVar)) {
                this.f62129b = cVar;
                this.f62128a.c(this);
                cVar.request(Long.MAX_VALUE);
            }
        }

        @Override // Dj.b
        public void onError(Throwable th2) {
            this.f62128a.onError(th2);
        }
    }

    public E(Dj.a aVar) {
        this.f62127a = aVar;
    }

    @Override // gg.s
    protected void L0(gg.x xVar) {
        this.f62127a.b(new a(xVar));
    }
}
