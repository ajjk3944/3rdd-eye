package C0;

import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6835l;

/* renamed from: C0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC2525e {

    /* renamed from: C0.e$a */
    public interface a {
        boolean a();
    }

    /* renamed from: C0.e$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final a f2133a = new a(null);

        /* renamed from: b, reason: collision with root package name */
        private static final int f2134b = g(1);

        /* renamed from: c, reason: collision with root package name */
        private static final int f2135c = g(2);

        /* renamed from: d, reason: collision with root package name */
        private static final int f2136d = g(3);

        /* renamed from: e, reason: collision with root package name */
        private static final int f2137e = g(4);

        /* renamed from: f, reason: collision with root package name */
        private static final int f2138f = g(5);

        /* renamed from: g, reason: collision with root package name */
        private static final int f2139g = g(6);

        /* renamed from: C0.e$b$a */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final int a() {
                return b.f2138f;
            }

            public final int b() {
                return b.f2135c;
            }

            public final int c() {
                return b.f2134b;
            }

            public final int d() {
                return b.f2139g;
            }

            public final int e() {
                return b.f2136d;
            }

            public final int f() {
                return b.f2137e;
            }

            private a() {
            }
        }

        public static int g(int i10) {
            return i10;
        }

        public static final boolean h(int i10, int i11) {
            return i10 == i11;
        }
    }

    Object a(int i10, InterfaceC6835l interfaceC6835l);
}
