package tg;

import hg.InterfaceC6043c;
import ig.AbstractC6152a;
import io.reactivex.rxjava3.exceptions.CompositeException;
import kg.InterfaceC6464a;
import kg.InterfaceC6469f;
import lg.EnumC6592b;

/* renamed from: tg.n, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8103n extends AbstractC8090a {

    /* renamed from: b, reason: collision with root package name */
    final InterfaceC6469f f62500b;

    /* renamed from: c, reason: collision with root package name */
    final InterfaceC6469f f62501c;

    /* renamed from: d, reason: collision with root package name */
    final InterfaceC6464a f62502d;

    /* renamed from: e, reason: collision with root package name */
    final InterfaceC6464a f62503e;

    /* renamed from: tg.n$a */
    static final class a implements gg.x, InterfaceC6043c {

        /* renamed from: a, reason: collision with root package name */
        final gg.x f62504a;

        /* renamed from: b, reason: collision with root package name */
        final InterfaceC6469f f62505b;

        /* renamed from: c, reason: collision with root package name */
        final InterfaceC6469f f62506c;

        /* renamed from: d, reason: collision with root package name */
        final InterfaceC6464a f62507d;

        /* renamed from: e, reason: collision with root package name */
        final InterfaceC6464a f62508e;

        /* renamed from: f, reason: collision with root package name */
        InterfaceC6043c f62509f;

        /* renamed from: g, reason: collision with root package name */
        boolean f62510g;

        a(gg.x xVar, InterfaceC6469f interfaceC6469f, InterfaceC6469f interfaceC6469f2, InterfaceC6464a interfaceC6464a, InterfaceC6464a interfaceC6464a2) {
            this.f62504a = xVar;
            this.f62505b = interfaceC6469f;
            this.f62506c = interfaceC6469f2;
            this.f62507d = interfaceC6464a;
            this.f62508e = interfaceC6464a2;
        }

        @Override // gg.x
        public void a() {
            if (this.f62510g) {
                return;
            }
            try {
                this.f62507d.run();
                this.f62510g = true;
                this.f62504a.a();
                try {
                    this.f62508e.run();
                } catch (Throwable th2) {
                    AbstractC6152a.b(th2);
                    Eg.a.v(th2);
                }
            } catch (Throwable th3) {
                AbstractC6152a.b(th3);
                onError(th3);
            }
        }

        @Override // gg.x
        public void c(InterfaceC6043c interfaceC6043c) {
            if (EnumC6592b.validate(this.f62509f, interfaceC6043c)) {
                this.f62509f = interfaceC6043c;
                this.f62504a.c(this);
            }
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            this.f62509f.dispose();
        }

        @Override // gg.x
        public void h(Object obj) {
            if (this.f62510g) {
                return;
            }
            try {
                this.f62505b.accept(obj);
                this.f62504a.h(obj);
            } catch (Throwable th2) {
                AbstractC6152a.b(th2);
                this.f62509f.dispose();
                onError(th2);
            }
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return this.f62509f.isDisposed();
        }

        @Override // gg.x
        public void onError(Throwable th2) {
            if (this.f62510g) {
                Eg.a.v(th2);
                return;
            }
            this.f62510g = true;
            try {
                this.f62506c.accept(th2);
            } catch (Throwable th3) {
                AbstractC6152a.b(th3);
                th2 = new CompositeException(th2, th3);
            }
            this.f62504a.onError(th2);
            try {
                this.f62508e.run();
            } catch (Throwable th4) {
                AbstractC6152a.b(th4);
                Eg.a.v(th4);
            }
        }
    }

    public C8103n(gg.v vVar, InterfaceC6469f interfaceC6469f, InterfaceC6469f interfaceC6469f2, InterfaceC6464a interfaceC6464a, InterfaceC6464a interfaceC6464a2) {
        super(vVar);
        this.f62500b = interfaceC6469f;
        this.f62501c = interfaceC6469f2;
        this.f62502d = interfaceC6464a;
        this.f62503e = interfaceC6464a2;
    }

    @Override // gg.s
    public void L0(gg.x xVar) {
        this.f62287a.d(new a(xVar, this.f62500b, this.f62501c, this.f62502d, this.f62503e));
    }
}
