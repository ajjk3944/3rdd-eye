package tg;

import hg.InterfaceC6043c;
import ig.AbstractC6152a;
import lg.EnumC6592b;

/* loaded from: classes4.dex */
public final class k0 extends AbstractC8090a {

    /* renamed from: b, reason: collision with root package name */
    final kg.p f62446b;

    static final class a implements gg.x, InterfaceC6043c {

        /* renamed from: a, reason: collision with root package name */
        final gg.x f62447a;

        /* renamed from: b, reason: collision with root package name */
        final kg.p f62448b;

        /* renamed from: c, reason: collision with root package name */
        InterfaceC6043c f62449c;

        /* renamed from: d, reason: collision with root package name */
        boolean f62450d;

        a(gg.x xVar, kg.p pVar) {
            this.f62447a = xVar;
            this.f62448b = pVar;
        }

        @Override // gg.x
        public void a() {
            if (this.f62450d) {
                return;
            }
            this.f62450d = true;
            this.f62447a.a();
        }

        @Override // gg.x
        public void c(InterfaceC6043c interfaceC6043c) {
            if (EnumC6592b.validate(this.f62449c, interfaceC6043c)) {
                this.f62449c = interfaceC6043c;
                this.f62447a.c(this);
            }
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            this.f62449c.dispose();
        }

        @Override // gg.x
        public void h(Object obj) {
            if (this.f62450d) {
                return;
            }
            try {
                if (this.f62448b.test(obj)) {
                    this.f62447a.h(obj);
                    return;
                }
                this.f62450d = true;
                this.f62449c.dispose();
                this.f62447a.a();
            } catch (Throwable th2) {
                AbstractC6152a.b(th2);
                this.f62449c.dispose();
                onError(th2);
            }
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return this.f62449c.isDisposed();
        }

        @Override // gg.x
        public void onError(Throwable th2) {
            if (this.f62450d) {
                Eg.a.v(th2);
            } else {
                this.f62450d = true;
                this.f62447a.onError(th2);
            }
        }
    }

    public k0(gg.v vVar, kg.p pVar) {
        super(vVar);
        this.f62446b = pVar;
    }

    @Override // gg.s
    public void L0(gg.x xVar) {
        this.f62287a.d(new a(xVar, this.f62446b));
    }
}
