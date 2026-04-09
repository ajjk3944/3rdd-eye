package rg;

import hg.InterfaceC6043c;
import ig.AbstractC6152a;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import lg.EnumC6592b;

/* loaded from: classes4.dex */
public final class j extends AbstractC7607a {

    /* renamed from: b, reason: collision with root package name */
    final kg.n f60544b;

    static final class a extends AtomicReference implements gg.p, InterfaceC6043c {

        /* renamed from: a, reason: collision with root package name */
        final gg.p f60545a;

        /* renamed from: b, reason: collision with root package name */
        final kg.n f60546b;

        /* renamed from: c, reason: collision with root package name */
        InterfaceC6043c f60547c;

        /* renamed from: rg.j$a$a, reason: collision with other inner class name */
        final class C2120a implements gg.p {
            C2120a() {
            }

            @Override // gg.p
            public void a() {
                a.this.f60545a.a();
            }

            @Override // gg.p
            public void c(InterfaceC6043c interfaceC6043c) {
                EnumC6592b.setOnce(a.this, interfaceC6043c);
            }

            @Override // gg.p
            public void onError(Throwable th2) {
                a.this.f60545a.onError(th2);
            }

            @Override // gg.p
            public void onSuccess(Object obj) {
                a.this.f60545a.onSuccess(obj);
            }
        }

        a(gg.p pVar, kg.n nVar) {
            this.f60545a = pVar;
            this.f60546b = nVar;
        }

        @Override // gg.p
        public void a() {
            this.f60545a.a();
        }

        @Override // gg.p
        public void c(InterfaceC6043c interfaceC6043c) {
            if (EnumC6592b.validate(this.f60547c, interfaceC6043c)) {
                this.f60547c = interfaceC6043c;
                this.f60545a.c(this);
            }
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            EnumC6592b.dispose(this);
            this.f60547c.dispose();
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return EnumC6592b.isDisposed((InterfaceC6043c) get());
        }

        @Override // gg.p
        public void onError(Throwable th2) {
            this.f60545a.onError(th2);
        }

        @Override // gg.p
        public void onSuccess(Object obj) {
            try {
                Object objApply = this.f60546b.apply(obj);
                Objects.requireNonNull(objApply, "The mapper returned a null MaybeSource");
                gg.r rVar = (gg.r) objApply;
                if (isDisposed()) {
                    return;
                }
                rVar.a(new C2120a());
            } catch (Throwable th2) {
                AbstractC6152a.b(th2);
                this.f60545a.onError(th2);
            }
        }
    }

    public j(gg.r rVar, kg.n nVar) {
        super(rVar);
        this.f60544b = nVar;
    }

    @Override // gg.n
    protected void v(gg.p pVar) {
        this.f60507a.a(new a(pVar, this.f60544b));
    }
}
