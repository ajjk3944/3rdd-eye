package rg;

import gg.B;
import gg.D;
import gg.z;
import hg.InterfaceC6043c;
import java.util.concurrent.atomic.AtomicReference;
import lg.EnumC6592b;

/* loaded from: classes4.dex */
public final class u extends z {

    /* renamed from: a, reason: collision with root package name */
    final gg.r f60585a;

    /* renamed from: b, reason: collision with root package name */
    final D f60586b;

    static final class a extends AtomicReference implements gg.p, InterfaceC6043c {

        /* renamed from: a, reason: collision with root package name */
        final B f60587a;

        /* renamed from: b, reason: collision with root package name */
        final D f60588b;

        /* renamed from: rg.u$a$a, reason: collision with other inner class name */
        static final class C2123a implements B {

            /* renamed from: a, reason: collision with root package name */
            final B f60589a;

            /* renamed from: b, reason: collision with root package name */
            final AtomicReference f60590b;

            C2123a(B b10, AtomicReference atomicReference) {
                this.f60589a = b10;
                this.f60590b = atomicReference;
            }

            @Override // gg.B
            public void c(InterfaceC6043c interfaceC6043c) {
                EnumC6592b.setOnce(this.f60590b, interfaceC6043c);
            }

            @Override // gg.B
            public void onError(Throwable th2) {
                this.f60589a.onError(th2);
            }

            @Override // gg.B
            public void onSuccess(Object obj) {
                this.f60589a.onSuccess(obj);
            }
        }

        a(B b10, D d10) {
            this.f60587a = b10;
            this.f60588b = d10;
        }

        @Override // gg.p
        public void a() {
            InterfaceC6043c interfaceC6043c = (InterfaceC6043c) get();
            if (interfaceC6043c == EnumC6592b.DISPOSED || !compareAndSet(interfaceC6043c, null)) {
                return;
            }
            this.f60588b.a(new C2123a(this.f60587a, this));
        }

        @Override // gg.p
        public void c(InterfaceC6043c interfaceC6043c) {
            if (EnumC6592b.setOnce(this, interfaceC6043c)) {
                this.f60587a.c(this);
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
            this.f60587a.onError(th2);
        }

        @Override // gg.p
        public void onSuccess(Object obj) {
            this.f60587a.onSuccess(obj);
        }
    }

    public u(gg.r rVar, D d10) {
        this.f60585a = rVar;
        this.f60586b = d10;
    }

    @Override // gg.z
    protected void N(B b10) {
        this.f60585a.a(new a(b10, this.f60586b));
    }
}
