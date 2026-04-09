package W0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: c, reason: collision with root package name */
    public static final b f23509c;

    /* renamed from: d, reason: collision with root package name */
    private static final h f23510d;

    /* renamed from: a, reason: collision with root package name */
    private final float f23511a;

    /* renamed from: b, reason: collision with root package name */
    private final int f23512b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0873a f23513a = new C0873a(null);

        /* renamed from: b, reason: collision with root package name */
        private static final float f23514b = c(0.0f);

        /* renamed from: c, reason: collision with root package name */
        private static final float f23515c = c(0.5f);

        /* renamed from: d, reason: collision with root package name */
        private static final float f23516d = c(-1.0f);

        /* renamed from: e, reason: collision with root package name */
        private static final float f23517e = c(1.0f);

        /* renamed from: W0.h$a$a, reason: collision with other inner class name */
        public static final class C0873a {
            public /* synthetic */ C0873a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final float a() {
                return a.f23515c;
            }

            public final float b() {
                return a.f23516d;
            }

            private C0873a() {
            }
        }

        public static float c(float f10) {
            if ((0.0f > f10 || f10 > 1.0f) && f10 != -1.0f) {
                throw new IllegalStateException("topRatio should be in [0..1] range or -1");
            }
            return f10;
        }

        public static final boolean d(float f10, float f11) {
            return Float.compare(f10, f11) == 0;
        }

        public static int e(float f10) {
            return Float.hashCode(f10);
        }

        public static String f(float f10) {
            if (f10 == f23514b) {
                return "LineHeightStyle.Alignment.Top";
            }
            if (f10 == f23515c) {
                return "LineHeightStyle.Alignment.Center";
            }
            if (f10 == f23516d) {
                return "LineHeightStyle.Alignment.Proportional";
            }
            if (f10 == f23517e) {
                return "LineHeightStyle.Alignment.Bottom";
            }
            return "LineHeightStyle.Alignment(topPercentage = " + f10 + ')';
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final h a() {
            return h.f23510d;
        }

        private b() {
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public static final a f23518a = new a(null);

        /* renamed from: b, reason: collision with root package name */
        private static final int f23519b = c(1);

        /* renamed from: c, reason: collision with root package name */
        private static final int f23520c = c(16);

        /* renamed from: d, reason: collision with root package name */
        private static final int f23521d = c(17);

        /* renamed from: e, reason: collision with root package name */
        private static final int f23522e = c(0);

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final int a() {
                return c.f23521d;
            }

            public final int b() {
                return c.f23522e;
            }

            private a() {
            }
        }

        private static int c(int i10) {
            return i10;
        }

        public static final boolean d(int i10, int i11) {
            return i10 == i11;
        }

        public static int e(int i10) {
            return Integer.hashCode(i10);
        }

        public static final boolean f(int i10) {
            return (i10 & 1) > 0;
        }

        public static final boolean g(int i10) {
            return (i10 & 16) > 0;
        }

        public static String h(int i10) {
            return i10 == f23519b ? "LineHeightStyle.Trim.FirstLineTop" : i10 == f23520c ? "LineHeightStyle.Trim.LastLineBottom" : i10 == f23521d ? "LineHeightStyle.Trim.Both" : i10 == f23522e ? "LineHeightStyle.Trim.None" : "Invalid";
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        f23509c = new b(defaultConstructorMarker);
        f23510d = new h(a.f23513a.b(), c.f23518a.a(), defaultConstructorMarker);
    }

    public /* synthetic */ h(float f10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, i10);
    }

    public final float b() {
        return this.f23511a;
    }

    public final int c() {
        return this.f23512b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return a.d(this.f23511a, hVar.f23511a) && c.d(this.f23512b, hVar.f23512b);
    }

    public int hashCode() {
        return (a.e(this.f23511a) * 31) + c.e(this.f23512b);
    }

    public String toString() {
        return "LineHeightStyle(alignment=" + ((Object) a.f(this.f23511a)) + ", trim=" + ((Object) c.h(this.f23512b)) + ')';
    }

    private h(float f10, int i10) {
        this.f23511a = f10;
        this.f23512b = i10;
    }
}
