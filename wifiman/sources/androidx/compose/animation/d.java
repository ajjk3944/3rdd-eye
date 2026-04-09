package androidx.compose.animation;

import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6835l;
import r.AbstractC7535j;
import r.H;
import r.I0;
import r.o0;

/* loaded from: classes.dex */
public interface d extends o0.b {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final C1029a f27532a = new C1029a(null);

        /* renamed from: b, reason: collision with root package name */
        private static final int f27533b = g(0);

        /* renamed from: c, reason: collision with root package name */
        private static final int f27534c = g(1);

        /* renamed from: d, reason: collision with root package name */
        private static final int f27535d = g(2);

        /* renamed from: e, reason: collision with root package name */
        private static final int f27536e = g(3);

        /* renamed from: f, reason: collision with root package name */
        private static final int f27537f = g(4);

        /* renamed from: g, reason: collision with root package name */
        private static final int f27538g = g(5);

        /* renamed from: androidx.compose.animation.d$a$a, reason: collision with other inner class name */
        public static final class C1029a {
            public /* synthetic */ C1029a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final int a() {
                return a.f27536e;
            }

            public final int b() {
                return a.f27538g;
            }

            public final int c() {
                return a.f27533b;
            }

            public final int d() {
                return a.f27534c;
            }

            public final int e() {
                return a.f27537f;
            }

            public final int f() {
                return a.f27535d;
            }

            private C1029a() {
            }
        }

        public static int g(int i10) {
            return i10;
        }

        public static final boolean h(int i10, int i11) {
            return i10 == i11;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class b extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final b f27539a = new b();

        b() {
            super(1);
        }

        public final Integer a(int i10) {
            return Integer.valueOf(i10);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class c extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final c f27540a = new c();

        c() {
            super(1);
        }

        public final Integer a(int i10) {
            return Integer.valueOf(i10);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    static /* synthetic */ k a(d dVar, int i10, H h10, InterfaceC6835l interfaceC6835l, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: slideOutOfContainer-mOhB8PU");
        }
        if ((i11 & 2) != 0) {
            h10 = AbstractC7535j.j(0.0f, 0.0f, Y0.n.b(I0.c(Y0.n.f24536b)), 3, null);
        }
        if ((i11 & 4) != 0) {
            interfaceC6835l = c.f27540a;
        }
        return dVar.g(i10, h10, interfaceC6835l);
    }

    static /* synthetic */ i c(d dVar, int i10, H h10, InterfaceC6835l interfaceC6835l, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: slideIntoContainer-mOhB8PU");
        }
        if ((i11 & 2) != 0) {
            h10 = AbstractC7535j.j(0.0f, 0.0f, Y0.n.b(I0.c(Y0.n.f24536b)), 3, null);
        }
        if ((i11 & 4) != 0) {
            interfaceC6835l = b.f27539a;
        }
        return dVar.b(i10, h10, interfaceC6835l);
    }

    i b(int i10, H h10, InterfaceC6835l interfaceC6835l);

    k g(int i10, H h10, InterfaceC6835l interfaceC6835l);
}
