package rg;

import hg.InterfaceC6043c;
import java.util.concurrent.atomic.AtomicReference;
import lg.EnumC6592b;

/* loaded from: classes4.dex */
public final class t extends AbstractC7607a {

    /* renamed from: b, reason: collision with root package name */
    final gg.r f60580b;

    static final class a extends AtomicReference implements gg.p, InterfaceC6043c {

        /* renamed from: a, reason: collision with root package name */
        final gg.p f60581a;

        /* renamed from: b, reason: collision with root package name */
        final gg.r f60582b;

        /* renamed from: rg.t$a$a, reason: collision with other inner class name */
        static final class C2122a implements gg.p {

            /* renamed from: a, reason: collision with root package name */
            final gg.p f60583a;

            /* renamed from: b, reason: collision with root package name */
            final AtomicReference f60584b;

            C2122a(gg.p pVar, AtomicReference atomicReference) {
                this.f60583a = pVar;
                this.f60584b = atomicReference;
            }

            @Override // gg.p
            public void a() {
                this.f60583a.a();
            }

            @Override // gg.p
            public void c(InterfaceC6043c interfaceC6043c) {
                EnumC6592b.setOnce(this.f60584b, interfaceC6043c);
            }

            @Override // gg.p
            public void onError(Throwable th2) {
                this.f60583a.onError(th2);
            }

            @Override // gg.p
            public void onSuccess(Object obj) {
                this.f60583a.onSuccess(obj);
            }
        }

        a(gg.p pVar, gg.r rVar) {
            this.f60581a = pVar;
            this.f60582b = rVar;
        }

        @Override // gg.p
        public void a() {
            InterfaceC6043c interfaceC6043c = (InterfaceC6043c) get();
            if (interfaceC6043c == EnumC6592b.DISPOSED || !compareAndSet(interfaceC6043c, null)) {
                return;
            }
            this.f60582b.a(new C2122a(this.f60581a, this));
        }

        @Override // gg.p
        public void c(InterfaceC6043c interfaceC6043c) {
            if (EnumC6592b.setOnce(this, interfaceC6043c)) {
                this.f60581a.c(this);
            }
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            EnumC6592b.dispose(this);
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return EnumC6592b.isDisposed((InterfaceC6043c) get());
        }

        @Override // gg.p
        public void onError(Throwable th2) {
            this.f60581a.onError(th2);
        }

        @Override // gg.p
        public void onSuccess(Object obj) {
            this.f60581a.onSuccess(obj);
        }
    }

    public t(gg.r rVar, gg.r rVar2) {
        super(rVar);
        this.f60580b = rVar2;
    }

    @Override // gg.n
    protected void v(gg.p pVar) {
        this.f60507a.a(new a(pVar, this.f60580b));
    }
}
