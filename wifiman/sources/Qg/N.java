package qg;

import hg.InterfaceC6043c;
import yg.EnumC8672g;

/* loaded from: classes4.dex */
public final class N extends gg.n {

    /* renamed from: a, reason: collision with root package name */
    final Dj.a f58746a;

    static final class a implements gg.l, InterfaceC6043c {

        /* renamed from: a, reason: collision with root package name */
        final gg.p f58747a;

        /* renamed from: b, reason: collision with root package name */
        Dj.c f58748b;

        /* renamed from: c, reason: collision with root package name */
        Object f58749c;

        a(gg.p pVar) {
            this.f58747a = pVar;
        }

        @Override // Dj.b
        public void a() {
            this.f58748b = EnumC8672g.CANCELLED;
            Object obj = this.f58749c;
            if (obj == null) {
                this.f58747a.a();
            } else {
                this.f58749c = null;
                this.f58747a.onSuccess(obj);
            }
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            this.f58748b.cancel();
            this.f58748b = EnumC8672g.CANCELLED;
        }

        @Override // Dj.b
        public void h(Object obj) {
            this.f58749c = obj;
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return this.f58748b == EnumC8672g.CANCELLED;
        }

        @Override // gg.l
        public void j(Dj.c cVar) {
            if (EnumC8672g.validate(this.f58748b, cVar)) {
                this.f58748b = cVar;
                this.f58747a.c(this);
                cVar.request(Long.MAX_VALUE);
            }
        }

        @Override // Dj.b
        public void onError(Throwable th2) {
            this.f58748b = EnumC8672g.CANCELLED;
            this.f58749c = null;
            this.f58747a.onError(th2);
        }
    }

    public N(Dj.a aVar) {
        this.f58746a = aVar;
    }

    @Override // gg.n
    protected void v(gg.p pVar) {
        this.f58746a.b(new a(pVar));
    }
}
