package tg;

import hg.InterfaceC6043c;
import ig.AbstractC6152a;
import lg.EnumC6592b;

/* loaded from: classes4.dex */
public final class j0 extends AbstractC8090a {

    /* renamed from: b, reason: collision with root package name */
    final kg.p f62434b;

    static final class a implements gg.x, InterfaceC6043c {

        /* renamed from: a, reason: collision with root package name */
        final gg.x f62435a;

        /* renamed from: b, reason: collision with root package name */
        final kg.p f62436b;

        /* renamed from: c, reason: collision with root package name */
        InterfaceC6043c f62437c;

        /* renamed from: d, reason: collision with root package name */
        boolean f62438d;

        a(gg.x xVar, kg.p pVar) {
            this.f62435a = xVar;
            this.f62436b = pVar;
        }

        @Override // gg.x
        public void a() {
            if (this.f62438d) {
                return;
            }
            this.f62438d = true;
            this.f62435a.a();
        }

        @Override // gg.x
        public void c(InterfaceC6043c interfaceC6043c) {
            if (EnumC6592b.validate(this.f62437c, interfaceC6043c)) {
                this.f62437c = interfaceC6043c;
                this.f62435a.c(this);
            }
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            this.f62437c.dispose();
        }

        @Override // gg.x
        public void h(Object obj) {
            if (this.f62438d) {
                return;
            }
            this.f62435a.h(obj);
            try {
                if (this.f62436b.test(obj)) {
                    this.f62438d = true;
                    this.f62437c.dispose();
                    this.f62435a.a();
                }
            } catch (Throwable th2) {
                AbstractC6152a.b(th2);
                this.f62437c.dispose();
                onError(th2);
            }
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return this.f62437c.isDisposed();
        }

        @Override // gg.x
        public void onError(Throwable th2) {
            if (this.f62438d) {
                Eg.a.v(th2);
            } else {
                this.f62438d = true;
                this.f62435a.onError(th2);
            }
        }
    }

    public j0(gg.v vVar, kg.p pVar) {
        super(vVar);
        this.f62434b = pVar;
    }

    @Override // gg.s
    public void L0(gg.x xVar) {
        this.f62287a.d(new a(xVar, this.f62434b));
    }
}
