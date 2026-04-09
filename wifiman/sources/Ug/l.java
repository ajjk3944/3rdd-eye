package ug;

import gg.AbstractC5912b;
import gg.D;
import gg.InterfaceC5914d;
import hg.InterfaceC6043c;
import ig.AbstractC6152a;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import lg.EnumC6592b;

/* loaded from: classes4.dex */
public final class l extends AbstractC5912b {

    /* renamed from: a, reason: collision with root package name */
    final D f63004a;

    /* renamed from: b, reason: collision with root package name */
    final kg.n f63005b;

    static final class a extends AtomicReference implements gg.B, InterfaceC5914d, InterfaceC6043c {

        /* renamed from: a, reason: collision with root package name */
        final InterfaceC5914d f63006a;

        /* renamed from: b, reason: collision with root package name */
        final kg.n f63007b;

        a(InterfaceC5914d interfaceC5914d, kg.n nVar) {
            this.f63006a = interfaceC5914d;
            this.f63007b = nVar;
        }

        @Override // gg.InterfaceC5914d
        public void a() {
            this.f63006a.a();
        }

        @Override // gg.B
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

        @Override // gg.B
        public void onError(Throwable th2) {
            this.f63006a.onError(th2);
        }

        @Override // gg.B
        public void onSuccess(Object obj) {
            try {
                Object objApply = this.f63007b.apply(obj);
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

    public l(D d10, kg.n nVar) {
        this.f63004a = d10;
        this.f63005b = nVar;
    }

    @Override // gg.AbstractC5912b
    protected void V(InterfaceC5914d interfaceC5914d) {
        a aVar = new a(interfaceC5914d, this.f63005b);
        interfaceC5914d.c(aVar);
        this.f63004a.a(aVar);
    }
}
