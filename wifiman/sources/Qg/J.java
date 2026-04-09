package qg;

import kg.InterfaceC6464a;
import kg.InterfaceC6465b;
import kg.InterfaceC6469f;

/* loaded from: classes4.dex */
public abstract class J {

    public enum a implements InterfaceC6469f {
        INSTANCE;

        @Override // kg.InterfaceC6469f
        public void accept(Dj.c cVar) {
            cVar.request(Long.MAX_VALUE);
        }
    }

    static final class b implements InterfaceC6465b {

        /* renamed from: a, reason: collision with root package name */
        final InterfaceC6469f f58724a;

        b(InterfaceC6469f interfaceC6469f) {
            this.f58724a = interfaceC6469f;
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Object apply(Object obj, gg.h hVar) {
            this.f58724a.accept(hVar);
            return obj;
        }
    }

    static final class c implements InterfaceC6464a {

        /* renamed from: a, reason: collision with root package name */
        final Dj.b f58725a;

        c(Dj.b bVar) {
            this.f58725a = bVar;
        }

        @Override // kg.InterfaceC6464a
        public void run() {
            this.f58725a.a();
        }
    }

    static final class d implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        final Dj.b f58726a;

        d(Dj.b bVar) {
            this.f58726a = bVar;
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Throwable th2) {
            this.f58726a.onError(th2);
        }
    }

    static final class e implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        final Dj.b f58727a;

        e(Dj.b bVar) {
            this.f58727a = bVar;
        }

        @Override // kg.InterfaceC6469f
        public void accept(Object obj) {
            this.f58727a.h(obj);
        }
    }

    public static InterfaceC6465b a(InterfaceC6469f interfaceC6469f) {
        return new b(interfaceC6469f);
    }

    public static InterfaceC6464a b(Dj.b bVar) {
        return new c(bVar);
    }

    public static InterfaceC6469f c(Dj.b bVar) {
        return new d(bVar);
    }

    public static InterfaceC6469f d(Dj.b bVar) {
        return new e(bVar);
    }
}
