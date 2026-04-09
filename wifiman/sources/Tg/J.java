package tg;

import kg.InterfaceC6464a;
import kg.InterfaceC6469f;

/* loaded from: classes4.dex */
public abstract class J {

    static final class a implements InterfaceC6464a {

        /* renamed from: a, reason: collision with root package name */
        final gg.x f62159a;

        a(gg.x xVar) {
            this.f62159a = xVar;
        }

        @Override // kg.InterfaceC6464a
        public void run() {
            this.f62159a.a();
        }
    }

    static final class b implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        final gg.x f62160a;

        b(gg.x xVar) {
            this.f62160a = xVar;
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Throwable th2) {
            this.f62160a.onError(th2);
        }
    }

    static final class c implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        final gg.x f62161a;

        c(gg.x xVar) {
            this.f62161a = xVar;
        }

        @Override // kg.InterfaceC6469f
        public void accept(Object obj) {
            this.f62161a.h(obj);
        }
    }

    public static InterfaceC6464a a(gg.x xVar) {
        return new a(xVar);
    }

    public static InterfaceC6469f b(gg.x xVar) {
        return new b(xVar);
    }

    public static InterfaceC6469f c(gg.x xVar) {
        return new c(xVar);
    }
}
