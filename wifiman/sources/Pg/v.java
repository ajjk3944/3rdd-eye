package pg;

import gg.AbstractC5912b;
import gg.InterfaceC5914d;
import hg.InterfaceC6043c;
import ig.AbstractC6152a;
import io.reactivex.rxjava3.exceptions.CompositeException;
import kg.InterfaceC6464a;
import kg.InterfaceC6469f;
import lg.EnumC6592b;
import lg.EnumC6593c;

/* loaded from: classes4.dex */
public final class v extends AbstractC5912b {

    /* renamed from: a, reason: collision with root package name */
    final gg.f f58001a;

    /* renamed from: b, reason: collision with root package name */
    final InterfaceC6469f f58002b;

    /* renamed from: c, reason: collision with root package name */
    final InterfaceC6469f f58003c;

    /* renamed from: d, reason: collision with root package name */
    final InterfaceC6464a f58004d;

    /* renamed from: e, reason: collision with root package name */
    final InterfaceC6464a f58005e;

    /* renamed from: f, reason: collision with root package name */
    final InterfaceC6464a f58006f;

    /* renamed from: g, reason: collision with root package name */
    final InterfaceC6464a f58007g;

    final class a implements InterfaceC5914d, InterfaceC6043c {

        /* renamed from: a, reason: collision with root package name */
        final InterfaceC5914d f58008a;

        /* renamed from: b, reason: collision with root package name */
        InterfaceC6043c f58009b;

        a(InterfaceC5914d interfaceC5914d) {
            this.f58008a = interfaceC5914d;
        }

        @Override // gg.InterfaceC5914d
        public void a() {
            if (this.f58009b == EnumC6592b.DISPOSED) {
                return;
            }
            try {
                v.this.f58004d.run();
                v.this.f58005e.run();
                this.f58008a.a();
                b();
            } catch (Throwable th2) {
                AbstractC6152a.b(th2);
                this.f58008a.onError(th2);
            }
        }

        void b() {
            try {
                v.this.f58006f.run();
            } catch (Throwable th2) {
                AbstractC6152a.b(th2);
                Eg.a.v(th2);
            }
        }

        @Override // gg.InterfaceC5914d
        public void c(InterfaceC6043c interfaceC6043c) {
            try {
                v.this.f58002b.accept(interfaceC6043c);
                if (EnumC6592b.validate(this.f58009b, interfaceC6043c)) {
                    this.f58009b = interfaceC6043c;
                    this.f58008a.c(this);
                }
            } catch (Throwable th2) {
                AbstractC6152a.b(th2);
                interfaceC6043c.dispose();
                this.f58009b = EnumC6592b.DISPOSED;
                EnumC6593c.error(th2, this.f58008a);
            }
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            try {
                v.this.f58007g.run();
            } catch (Throwable th2) {
                AbstractC6152a.b(th2);
                Eg.a.v(th2);
            }
            this.f58009b.dispose();
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return this.f58009b.isDisposed();
        }

        @Override // gg.InterfaceC5914d
        public void onError(Throwable th2) {
            if (this.f58009b == EnumC6592b.DISPOSED) {
                Eg.a.v(th2);
                return;
            }
            try {
                v.this.f58003c.accept(th2);
                v.this.f58005e.run();
            } catch (Throwable th3) {
                AbstractC6152a.b(th3);
                th2 = new CompositeException(th2, th3);
            }
            this.f58008a.onError(th2);
            b();
        }
    }

    public v(gg.f fVar, InterfaceC6469f interfaceC6469f, InterfaceC6469f interfaceC6469f2, InterfaceC6464a interfaceC6464a, InterfaceC6464a interfaceC6464a2, InterfaceC6464a interfaceC6464a3, InterfaceC6464a interfaceC6464a4) {
        this.f58001a = fVar;
        this.f58002b = interfaceC6469f;
        this.f58003c = interfaceC6469f2;
        this.f58004d = interfaceC6464a;
        this.f58005e = interfaceC6464a2;
        this.f58006f = interfaceC6464a3;
        this.f58007g = interfaceC6464a4;
    }

    @Override // gg.AbstractC5912b
    protected void V(InterfaceC5914d interfaceC5914d) {
        this.f58001a.e(new a(interfaceC5914d));
    }
}
