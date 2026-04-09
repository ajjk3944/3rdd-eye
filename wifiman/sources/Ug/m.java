package ug;

import gg.D;
import hg.InterfaceC6043c;
import ig.AbstractC6152a;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import lg.EnumC6592b;

/* loaded from: classes4.dex */
public final class m extends gg.n {

    /* renamed from: a, reason: collision with root package name */
    final D f63008a;

    /* renamed from: b, reason: collision with root package name */
    final kg.n f63009b;

    static final class a implements gg.p {

        /* renamed from: a, reason: collision with root package name */
        final AtomicReference f63010a;

        /* renamed from: b, reason: collision with root package name */
        final gg.p f63011b;

        a(AtomicReference atomicReference, gg.p pVar) {
            this.f63010a = atomicReference;
            this.f63011b = pVar;
        }

        @Override // gg.p
        public void a() {
            this.f63011b.a();
        }

        @Override // gg.p
        public void c(InterfaceC6043c interfaceC6043c) {
            EnumC6592b.replace(this.f63010a, interfaceC6043c);
        }

        @Override // gg.p
        public void onError(Throwable th2) {
            this.f63011b.onError(th2);
        }

        @Override // gg.p
        public void onSuccess(Object obj) {
            this.f63011b.onSuccess(obj);
        }
    }

    static final class b extends AtomicReference implements gg.B, InterfaceC6043c {

        /* renamed from: a, reason: collision with root package name */
        final gg.p f63012a;

        /* renamed from: b, reason: collision with root package name */
        final kg.n f63013b;

        b(gg.p pVar, kg.n nVar) {
            this.f63012a = pVar;
            this.f63013b = nVar;
        }

        @Override // gg.B
        public void c(InterfaceC6043c interfaceC6043c) {
            if (EnumC6592b.setOnce(this, interfaceC6043c)) {
                this.f63012a.c(this);
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
            this.f63012a.onError(th2);
        }

        @Override // gg.B
        public void onSuccess(Object obj) {
            try {
                Object objApply = this.f63013b.apply(obj);
                Objects.requireNonNull(objApply, "The mapper returned a null MaybeSource");
                gg.r rVar = (gg.r) objApply;
                if (isDisposed()) {
                    return;
                }
                rVar.a(new a(this, this.f63012a));
            } catch (Throwable th2) {
                AbstractC6152a.b(th2);
                onError(th2);
            }
        }
    }

    public m(D d10, kg.n nVar) {
        this.f63009b = nVar;
        this.f63008a = d10;
    }

    @Override // gg.n
    protected void v(gg.p pVar) {
        this.f63008a.a(new b(pVar, this.f63009b));
    }
}
