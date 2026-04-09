package pg;

import gg.AbstractC5912b;
import gg.InterfaceC5914d;
import hg.InterfaceC6043c;
import ig.AbstractC6152a;
import java.util.concurrent.atomic.AtomicInteger;
import kg.InterfaceC6464a;
import lg.EnumC6592b;

/* loaded from: classes4.dex */
public final class i extends AbstractC5912b {

    /* renamed from: a, reason: collision with root package name */
    final gg.f f57963a;

    /* renamed from: b, reason: collision with root package name */
    final InterfaceC6464a f57964b;

    static final class a extends AtomicInteger implements InterfaceC5914d, InterfaceC6043c {

        /* renamed from: a, reason: collision with root package name */
        final InterfaceC5914d f57965a;

        /* renamed from: b, reason: collision with root package name */
        final InterfaceC6464a f57966b;

        /* renamed from: c, reason: collision with root package name */
        InterfaceC6043c f57967c;

        a(InterfaceC5914d interfaceC5914d, InterfaceC6464a interfaceC6464a) {
            this.f57965a = interfaceC5914d;
            this.f57966b = interfaceC6464a;
        }

        @Override // gg.InterfaceC5914d
        public void a() {
            this.f57965a.a();
            d();
        }

        @Override // gg.InterfaceC5914d
        public void c(InterfaceC6043c interfaceC6043c) {
            if (EnumC6592b.validate(this.f57967c, interfaceC6043c)) {
                this.f57967c = interfaceC6043c;
                this.f57965a.c(this);
            }
        }

        void d() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f57966b.run();
                } catch (Throwable th2) {
                    AbstractC6152a.b(th2);
                    Eg.a.v(th2);
                }
            }
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            this.f57967c.dispose();
            d();
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return this.f57967c.isDisposed();
        }

        @Override // gg.InterfaceC5914d
        public void onError(Throwable th2) {
            this.f57965a.onError(th2);
            d();
        }
    }

    public i(gg.f fVar, InterfaceC6464a interfaceC6464a) {
        this.f57963a = fVar;
        this.f57964b = interfaceC6464a;
    }

    @Override // gg.AbstractC5912b
    protected void V(InterfaceC5914d interfaceC5914d) {
        this.f57963a.e(new a(interfaceC5914d, this.f57964b));
    }
}
