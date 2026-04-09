package rg;

import gg.B;
import gg.D;
import hg.InterfaceC6043c;
import lg.EnumC6592b;

/* loaded from: classes4.dex */
public final class m extends gg.n {

    /* renamed from: a, reason: collision with root package name */
    final D f60553a;

    static final class a implements B, InterfaceC6043c {

        /* renamed from: a, reason: collision with root package name */
        final gg.p f60554a;

        /* renamed from: b, reason: collision with root package name */
        InterfaceC6043c f60555b;

        a(gg.p pVar) {
            this.f60554a = pVar;
        }

        @Override // gg.B
        public void c(InterfaceC6043c interfaceC6043c) {
            if (EnumC6592b.validate(this.f60555b, interfaceC6043c)) {
                this.f60555b = interfaceC6043c;
                this.f60554a.c(this);
            }
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            this.f60555b.dispose();
            this.f60555b = EnumC6592b.DISPOSED;
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return this.f60555b.isDisposed();
        }

        @Override // gg.B
        public void onError(Throwable th2) {
            this.f60555b = EnumC6592b.DISPOSED;
            this.f60554a.onError(th2);
        }

        @Override // gg.B
        public void onSuccess(Object obj) {
            this.f60555b = EnumC6592b.DISPOSED;
            this.f60554a.onSuccess(obj);
        }
    }

    public m(D d10) {
        this.f60553a = d10;
    }

    @Override // gg.n
    protected void v(gg.p pVar) {
        this.f60553a.a(new a(pVar));
    }
}
