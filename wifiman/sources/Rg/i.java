package rg;

import gg.B;
import gg.D;
import hg.InterfaceC6043c;
import ig.AbstractC6152a;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import lg.EnumC6592b;

/* loaded from: classes4.dex */
public final class i extends gg.n {

    /* renamed from: a, reason: collision with root package name */
    final gg.r f60538a;

    /* renamed from: b, reason: collision with root package name */
    final kg.n f60539b;

    static final class a extends AtomicReference implements gg.p, InterfaceC6043c {

        /* renamed from: a, reason: collision with root package name */
        final gg.p f60540a;

        /* renamed from: b, reason: collision with root package name */
        final kg.n f60541b;

        a(gg.p pVar, kg.n nVar) {
            this.f60540a = pVar;
            this.f60541b = nVar;
        }

        @Override // gg.p
        public void a() {
            this.f60540a.a();
        }

        @Override // gg.p
        public void c(InterfaceC6043c interfaceC6043c) {
            if (EnumC6592b.setOnce(this, interfaceC6043c)) {
                this.f60540a.c(this);
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
            this.f60540a.onError(th2);
        }

        @Override // gg.p
        public void onSuccess(Object obj) {
            try {
                Object objApply = this.f60541b.apply(obj);
                Objects.requireNonNull(objApply, "The mapper returned a null SingleSource");
                D d10 = (D) objApply;
                if (isDisposed()) {
                    return;
                }
                d10.a(new b(this, this.f60540a));
            } catch (Throwable th2) {
                AbstractC6152a.b(th2);
                onError(th2);
            }
        }
    }

    static final class b implements B {

        /* renamed from: a, reason: collision with root package name */
        final AtomicReference f60542a;

        /* renamed from: b, reason: collision with root package name */
        final gg.p f60543b;

        b(AtomicReference atomicReference, gg.p pVar) {
            this.f60542a = atomicReference;
            this.f60543b = pVar;
        }

        @Override // gg.B
        public void c(InterfaceC6043c interfaceC6043c) {
            EnumC6592b.replace(this.f60542a, interfaceC6043c);
        }

        @Override // gg.B
        public void onError(Throwable th2) {
            this.f60543b.onError(th2);
        }

        @Override // gg.B
        public void onSuccess(Object obj) {
            this.f60543b.onSuccess(obj);
        }
    }

    public i(gg.r rVar, kg.n nVar) {
        this.f60538a = rVar;
        this.f60539b = nVar;
    }

    @Override // gg.n
    protected void v(gg.p pVar) {
        this.f60538a.a(new a(pVar, this.f60539b));
    }
}
