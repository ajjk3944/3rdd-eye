package W0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: b, reason: collision with root package name */
    public static final a f23488b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final int f23489c;

    /* renamed from: d, reason: collision with root package name */
    private static final int f23490d;

    /* renamed from: e, reason: collision with root package name */
    private static final int f23491e;

    /* renamed from: f, reason: collision with root package name */
    private static final int f23492f;

    /* renamed from: a, reason: collision with root package name */
    private final int f23493a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return f.f23489c;
        }

        public final int b() {
            return f.f23492f;
        }

        private a() {
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final a f23494a = new a(null);

        /* renamed from: b, reason: collision with root package name */
        private static final int f23495b = d(1);

        /* renamed from: c, reason: collision with root package name */
        private static final int f23496c = d(2);

        /* renamed from: d, reason: collision with root package name */
        private static final int f23497d = d(3);

        /* renamed from: e, reason: collision with root package name */
        private static final int f23498e = d(0);

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final int a() {
                return b.f23497d;
            }

            public final int b() {
                return b.f23496c;
            }

            public final int c() {
                return b.f23495b;
            }

            private a() {
            }
        }

        public static int d(int i10) {
            return i10;
        }

        public static final boolean e(int i10, int i11) {
            return i10 == i11;
        }

        public static String f(int i10) {
            return e(i10, f23495b) ? "Strategy.Simple" : e(i10, f23496c) ? "Strategy.HighQuality" : e(i10, f23497d) ? "Strategy.Balanced" : e(i10, f23498e) ? "Strategy.Unspecified" : "Invalid";
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public static final a f23499a = new a(null);

        /* renamed from: b, reason: collision with root package name */
        private static final int f23500b = e(1);

        /* renamed from: c, reason: collision with root package name */
        private static final int f23501c = e(2);

        /* renamed from: d, reason: collision with root package name */
        private static final int f23502d = e(3);

        /* renamed from: e, reason: collision with root package name */
        private static final int f23503e = e(4);

        /* renamed from: f, reason: collision with root package name */
        private static final int f23504f = e(0);

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final int a() {
                return c.f23500b;
            }

            public final int b() {
                return c.f23501c;
            }

            public final int c() {
                return c.f23502d;
            }

            public final int d() {
                return c.f23503e;
            }

            private a() {
            }
        }

        public static int e(int i10) {
            return i10;
        }

        public static final boolean f(int i10, int i11) {
            return i10 == i11;
        }

        public static String g(int i10) {
            return f(i10, f23500b) ? "Strictness.None" : f(i10, f23501c) ? "Strictness.Loose" : f(i10, f23502d) ? "Strictness.Normal" : f(i10, f23503e) ? "Strictness.Strict" : f(i10, f23504f) ? "Strictness.Unspecified" : "Invalid";
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public static final a f23505a = new a(null);

        /* renamed from: b, reason: collision with root package name */
        private static final int f23506b = c(1);

        /* renamed from: c, reason: collision with root package name */
        private static final int f23507c = c(2);

        /* renamed from: d, reason: collision with root package name */
        private static final int f23508d = c(0);

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final int a() {
                return d.f23506b;
            }

            public final int b() {
                return d.f23507c;
            }

            private a() {
            }
        }

        public static int c(int i10) {
            return i10;
        }

        public static final boolean d(int i10, int i11) {
            return i10 == i11;
        }

        public static String e(int i10) {
            return d(i10, f23506b) ? "WordBreak.None" : d(i10, f23507c) ? "WordBreak.Phrase" : d(i10, f23508d) ? "WordBreak.Unspecified" : "Invalid";
        }
    }

    static {
        b.a aVar = b.f23494a;
        int iC = aVar.c();
        c.a aVar2 = c.f23499a;
        int iC2 = aVar2.c();
        d.a aVar3 = d.f23505a;
        f23489c = d(g.e(iC, iC2, aVar3.a()));
        f23490d = d(g.e(aVar.a(), aVar2.b(), aVar3.b()));
        f23491e = d(g.e(aVar.b(), aVar2.d(), aVar3.a()));
        f23492f = d(0);
    }

    private /* synthetic */ f(int i10) {
        this.f23493a = i10;
    }

    public static final /* synthetic */ f c(int i10) {
        return new f(i10);
    }

    private static int d(int i10) {
        return i10;
    }

    public static boolean e(int i10, Object obj) {
        return (obj instanceof f) && i10 == ((f) obj).l();
    }

    public static final boolean f(int i10, int i11) {
        return i10 == i11;
    }

    public static final int g(int i10) {
        return b.d(g.f(i10));
    }

    public static final int h(int i10) {
        return c.e(g.g(i10));
    }

    public static final int i(int i10) {
        return d.c(g.h(i10));
    }

    public static int j(int i10) {
        return Integer.hashCode(i10);
    }

    public static String k(int i10) {
        return "LineBreak(strategy=" + ((Object) b.f(g(i10))) + ", strictness=" + ((Object) c.g(h(i10))) + ", wordBreak=" + ((Object) d.e(i(i10))) + ')';
    }

    public boolean equals(Object obj) {
        return e(this.f23493a, obj);
    }

    public int hashCode() {
        return j(this.f23493a);
    }

    public final /* synthetic */ int l() {
        return this.f23493a;
    }

    public String toString() {
        return k(this.f23493a);
    }
}
