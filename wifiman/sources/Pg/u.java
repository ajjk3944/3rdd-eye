package pg;

import gg.AbstractC5912b;
import gg.InterfaceC5914d;
import hg.InterfaceC6043c;
import ig.AbstractC6152a;
import io.reactivex.rxjava3.exceptions.CompositeException;

/* loaded from: classes4.dex */
public final class u extends AbstractC5912b {

    /* renamed from: a, reason: collision with root package name */
    final gg.f f57997a;

    /* renamed from: b, reason: collision with root package name */
    final kg.p f57998b;

    static final class a implements InterfaceC5914d {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC5914d f57999a;

        /* renamed from: b, reason: collision with root package name */
        private final kg.p f58000b;

        a(InterfaceC5914d interfaceC5914d, kg.p pVar) {
            this.f57999a = interfaceC5914d;
            this.f58000b = pVar;
        }

        @Override // gg.InterfaceC5914d
        public void a() {
            this.f57999a.a();
        }

        @Override // gg.InterfaceC5914d
        public void c(InterfaceC6043c interfaceC6043c) {
            this.f57999a.c(interfaceC6043c);
        }

        @Override // gg.InterfaceC5914d
        public void onError(Throwable th2) {
            try {
                if (this.f58000b.test(th2)) {
                    this.f57999a.a();
                } else {
                    this.f57999a.onError(th2);
                }
            } catch (Throwable th3) {
                AbstractC6152a.b(th3);
                this.f57999a.onError(new CompositeException(th2, th3));
            }
        }
    }

    public u(gg.f fVar, kg.p pVar) {
        this.f57997a = fVar;
        this.f57998b = pVar;
    }

    @Override // gg.AbstractC5912b
    protected void V(InterfaceC5914d interfaceC5914d) {
        this.f57997a.e(new a(interfaceC5914d, this.f57998b));
    }
}
