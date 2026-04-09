package rg;

import hg.InterfaceC6043c;
import ig.AbstractC6152a;
import java.util.Objects;
import lg.EnumC6592b;

/* loaded from: classes4.dex */
public final class q extends AbstractC7607a {

    /* renamed from: b, reason: collision with root package name */
    final kg.n f60562b;

    static final class a implements gg.p, InterfaceC6043c {

        /* renamed from: a, reason: collision with root package name */
        final gg.p f60563a;

        /* renamed from: b, reason: collision with root package name */
        final kg.n f60564b;

        /* renamed from: c, reason: collision with root package name */
        InterfaceC6043c f60565c;

        a(gg.p pVar, kg.n nVar) {
            this.f60563a = pVar;
            this.f60564b = nVar;
        }

        @Override // gg.p
        public void a() {
            this.f60563a.a();
        }

        @Override // gg.p
        public void c(InterfaceC6043c interfaceC6043c) {
            if (EnumC6592b.validate(this.f60565c, interfaceC6043c)) {
                this.f60565c = interfaceC6043c;
                this.f60563a.c(this);
            }
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            InterfaceC6043c interfaceC6043c = this.f60565c;
            this.f60565c = EnumC6592b.DISPOSED;
            interfaceC6043c.dispose();
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return this.f60565c.isDisposed();
        }

        @Override // gg.p
        public void onError(Throwable th2) {
            this.f60563a.onError(th2);
        }

        @Override // gg.p
        public void onSuccess(Object obj) {
            try {
                Object objApply = this.f60564b.apply(obj);
                Objects.requireNonNull(objApply, "The mapper returned a null item");
                this.f60563a.onSuccess(objApply);
            } catch (Throwable th2) {
                AbstractC6152a.b(th2);
                this.f60563a.onError(th2);
            }
        }
    }

    public q(gg.r rVar, kg.n nVar) {
        super(rVar);
        this.f60562b = nVar;
    }

    @Override // gg.n
    protected void v(gg.p pVar) {
        this.f60507a.a(new a(pVar, this.f60562b));
    }
}
