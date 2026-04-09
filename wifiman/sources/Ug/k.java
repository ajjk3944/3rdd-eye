package ug;

import gg.D;
import hg.InterfaceC6043c;
import ig.AbstractC6152a;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import lg.EnumC6592b;

/* loaded from: classes4.dex */
public final class k extends gg.z {

    /* renamed from: a, reason: collision with root package name */
    final D f62998a;

    /* renamed from: b, reason: collision with root package name */
    final kg.n f62999b;

    static final class a extends AtomicReference implements gg.B, InterfaceC6043c {

        /* renamed from: a, reason: collision with root package name */
        final gg.B f63000a;

        /* renamed from: b, reason: collision with root package name */
        final kg.n f63001b;

        /* renamed from: ug.k$a$a, reason: collision with other inner class name */
        static final class C2233a implements gg.B {

            /* renamed from: a, reason: collision with root package name */
            final AtomicReference f63002a;

            /* renamed from: b, reason: collision with root package name */
            final gg.B f63003b;

            C2233a(AtomicReference atomicReference, gg.B b10) {
                this.f63002a = atomicReference;
                this.f63003b = b10;
            }

            @Override // gg.B
            public void c(InterfaceC6043c interfaceC6043c) {
                EnumC6592b.replace(this.f63002a, interfaceC6043c);
            }

            @Override // gg.B
            public void onError(Throwable th2) {
                this.f63003b.onError(th2);
            }

            @Override // gg.B
            public void onSuccess(Object obj) {
                this.f63003b.onSuccess(obj);
            }
        }

        a(gg.B b10, kg.n nVar) {
            this.f63000a = b10;
            this.f63001b = nVar;
        }

        @Override // gg.B
        public void c(InterfaceC6043c interfaceC6043c) {
            if (EnumC6592b.setOnce(this, interfaceC6043c)) {
                this.f63000a.c(this);
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

        @Override // gg.B
        public void onError(Throwable th2) {
            this.f63000a.onError(th2);
        }

        @Override // gg.B
        public void onSuccess(Object obj) {
            try {
                Object objApply = this.f63001b.apply(obj);
                Objects.requireNonNull(objApply, "The single returned by the mapper is null");
                D d10 = (D) objApply;
                if (isDisposed()) {
                    return;
                }
                d10.a(new C2233a(this, this.f63000a));
            } catch (Throwable th2) {
                AbstractC6152a.b(th2);
                this.f63000a.onError(th2);
            }
        }
    }

    public k(D d10, kg.n nVar) {
        this.f62999b = nVar;
        this.f62998a = d10;
    }

    @Override // gg.z
    protected void N(gg.B b10) {
        this.f62998a.a(new a(b10, this.f62999b));
    }
}
