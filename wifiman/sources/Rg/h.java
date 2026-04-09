package rg;

import gg.AbstractC5912b;
import gg.InterfaceC5914d;
import hg.InterfaceC6043c;
import ig.AbstractC6152a;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import lg.EnumC6592b;

/* loaded from: classes4.dex */
public final class h extends AbstractC5912b {

    /* renamed from: a, reason: collision with root package name */
    final gg.r f60534a;

    /* renamed from: b, reason: collision with root package name */
    final kg.n f60535b;

    static final class a extends AtomicReference implements gg.p, InterfaceC5914d, InterfaceC6043c {

        /* renamed from: a, reason: collision with root package name */
        final InterfaceC5914d f60536a;

        /* renamed from: b, reason: collision with root package name */
        final kg.n f60537b;

        a(InterfaceC5914d interfaceC5914d, kg.n nVar) {
            this.f60536a = interfaceC5914d;
            this.f60537b = nVar;
        }

        @Override // gg.p
        public void a() {
            this.f60536a.a();
        }

        @Override // gg.p
        public void c(InterfaceC6043c interfaceC6043c) {
            EnumC6592b.replace(this, interfaceC6043c);
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
            this.f60536a.onError(th2);
        }

        @Override // gg.p
        public void onSuccess(Object obj) {
            try {
                Object objApply = this.f60537b.apply(obj);
                Objects.requireNonNull(objApply, "The mapper returned a null CompletableSource");
                gg.f fVar = (gg.f) objApply;
                if (isDisposed()) {
                    return;
                }
                fVar.e(this);
            } catch (Throwable th2) {
                AbstractC6152a.b(th2);
                onError(th2);
            }
        }
    }

    public h(gg.r rVar, kg.n nVar) {
        this.f60534a = rVar;
        this.f60535b = nVar;
    }

    @Override // gg.AbstractC5912b
    protected void V(InterfaceC5914d interfaceC5914d) {
        a aVar = new a(interfaceC5914d, this.f60535b);
        interfaceC5914d.c(aVar);
        this.f60534a.a(aVar);
    }
}
