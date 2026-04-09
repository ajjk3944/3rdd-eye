package rg;

import hg.InterfaceC6043c;
import ig.AbstractC6152a;
import io.reactivex.rxjava3.exceptions.CompositeException;
import kg.InterfaceC6464a;
import kg.InterfaceC6469f;
import lg.EnumC6592b;
import lg.EnumC6593c;

/* loaded from: classes4.dex */
public final class s extends AbstractC7607a {

    /* renamed from: b, reason: collision with root package name */
    final InterfaceC6469f f60571b;

    /* renamed from: c, reason: collision with root package name */
    final InterfaceC6469f f60572c;

    /* renamed from: d, reason: collision with root package name */
    final InterfaceC6469f f60573d;

    /* renamed from: e, reason: collision with root package name */
    final InterfaceC6464a f60574e;

    /* renamed from: f, reason: collision with root package name */
    final InterfaceC6464a f60575f;

    /* renamed from: g, reason: collision with root package name */
    final InterfaceC6464a f60576g;

    static final class a implements gg.p, InterfaceC6043c {

        /* renamed from: a, reason: collision with root package name */
        final gg.p f60577a;

        /* renamed from: b, reason: collision with root package name */
        final s f60578b;

        /* renamed from: c, reason: collision with root package name */
        InterfaceC6043c f60579c;

        a(gg.p pVar, s sVar) {
            this.f60577a = pVar;
            this.f60578b = sVar;
        }

        @Override // gg.p
        public void a() {
            InterfaceC6043c interfaceC6043c = this.f60579c;
            EnumC6592b enumC6592b = EnumC6592b.DISPOSED;
            if (interfaceC6043c == enumC6592b) {
                return;
            }
            try {
                this.f60578b.f60574e.run();
                this.f60579c = enumC6592b;
                this.f60577a.a();
                b();
            } catch (Throwable th2) {
                AbstractC6152a.b(th2);
                d(th2);
            }
        }

        void b() {
            try {
                this.f60578b.f60575f.run();
            } catch (Throwable th2) {
                AbstractC6152a.b(th2);
                Eg.a.v(th2);
            }
        }

        @Override // gg.p
        public void c(InterfaceC6043c interfaceC6043c) {
            if (EnumC6592b.validate(this.f60579c, interfaceC6043c)) {
                try {
                    this.f60578b.f60571b.accept(interfaceC6043c);
                    this.f60579c = interfaceC6043c;
                    this.f60577a.c(this);
                } catch (Throwable th2) {
                    AbstractC6152a.b(th2);
                    interfaceC6043c.dispose();
                    this.f60579c = EnumC6592b.DISPOSED;
                    EnumC6593c.error(th2, this.f60577a);
                }
            }
        }

        void d(Throwable th2) {
            try {
                this.f60578b.f60573d.accept(th2);
            } catch (Throwable th3) {
                AbstractC6152a.b(th3);
                th2 = new CompositeException(th2, th3);
            }
            this.f60579c = EnumC6592b.DISPOSED;
            this.f60577a.onError(th2);
            b();
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            try {
                this.f60578b.f60576g.run();
            } catch (Throwable th2) {
                AbstractC6152a.b(th2);
                Eg.a.v(th2);
            }
            this.f60579c.dispose();
            this.f60579c = EnumC6592b.DISPOSED;
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return this.f60579c.isDisposed();
        }

        @Override // gg.p
        public void onError(Throwable th2) {
            if (this.f60579c == EnumC6592b.DISPOSED) {
                Eg.a.v(th2);
            } else {
                d(th2);
            }
        }

        @Override // gg.p
        public void onSuccess(Object obj) {
            InterfaceC6043c interfaceC6043c = this.f60579c;
            EnumC6592b enumC6592b = EnumC6592b.DISPOSED;
            if (interfaceC6043c == enumC6592b) {
                return;
            }
            try {
                this.f60578b.f60572c.accept(obj);
                this.f60579c = enumC6592b;
                this.f60577a.onSuccess(obj);
                b();
            } catch (Throwable th2) {
                AbstractC6152a.b(th2);
                d(th2);
            }
        }
    }

    public s(gg.r rVar, InterfaceC6469f interfaceC6469f, InterfaceC6469f interfaceC6469f2, InterfaceC6469f interfaceC6469f3, InterfaceC6464a interfaceC6464a, InterfaceC6464a interfaceC6464a2, InterfaceC6464a interfaceC6464a3) {
        super(rVar);
        this.f60571b = interfaceC6469f;
        this.f60572c = interfaceC6469f2;
        this.f60573d = interfaceC6469f3;
        this.f60574e = interfaceC6464a;
        this.f60575f = interfaceC6464a2;
        this.f60576g = interfaceC6464a3;
    }

    @Override // gg.n
    protected void v(gg.p pVar) {
        this.f60507a.a(new a(pVar, this));
    }
}
