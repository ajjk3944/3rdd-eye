package rg;

import gg.B;
import gg.D;
import hg.InterfaceC6043c;
import ig.AbstractC6152a;
import lg.EnumC6592b;

/* loaded from: classes4.dex */
public final class g extends gg.n {

    /* renamed from: a, reason: collision with root package name */
    final D f60529a;

    /* renamed from: b, reason: collision with root package name */
    final kg.p f60530b;

    static final class a implements B, InterfaceC6043c {

        /* renamed from: a, reason: collision with root package name */
        final gg.p f60531a;

        /* renamed from: b, reason: collision with root package name */
        final kg.p f60532b;

        /* renamed from: c, reason: collision with root package name */
        InterfaceC6043c f60533c;

        a(gg.p pVar, kg.p pVar2) {
            this.f60531a = pVar;
            this.f60532b = pVar2;
        }

        @Override // gg.B
        public void c(InterfaceC6043c interfaceC6043c) {
            if (EnumC6592b.validate(this.f60533c, interfaceC6043c)) {
                this.f60533c = interfaceC6043c;
                this.f60531a.c(this);
            }
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            InterfaceC6043c interfaceC6043c = this.f60533c;
            this.f60533c = EnumC6592b.DISPOSED;
            interfaceC6043c.dispose();
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return this.f60533c.isDisposed();
        }

        @Override // gg.B
        public void onError(Throwable th2) {
            this.f60531a.onError(th2);
        }

        @Override // gg.B
        public void onSuccess(Object obj) {
            try {
                if (this.f60532b.test(obj)) {
                    this.f60531a.onSuccess(obj);
                } else {
                    this.f60531a.a();
                }
            } catch (Throwable th2) {
                AbstractC6152a.b(th2);
                this.f60531a.onError(th2);
            }
        }
    }

    public g(D d10, kg.p pVar) {
        this.f60529a = d10;
        this.f60530b = pVar;
    }

    @Override // gg.n
    protected void v(gg.p pVar) {
        this.f60529a.a(new a(pVar, this.f60530b));
    }
}
