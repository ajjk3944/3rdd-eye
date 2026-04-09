package R0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: b, reason: collision with root package name */
    public static final a f19498b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final int f19499c = k(-1);

    /* renamed from: d, reason: collision with root package name */
    private static final int f19500d = k(1);

    /* renamed from: e, reason: collision with root package name */
    private static final int f19501e = k(0);

    /* renamed from: f, reason: collision with root package name */
    private static final int f19502f = k(2);

    /* renamed from: g, reason: collision with root package name */
    private static final int f19503g = k(3);

    /* renamed from: h, reason: collision with root package name */
    private static final int f19504h = k(4);

    /* renamed from: i, reason: collision with root package name */
    private static final int f19505i = k(5);

    /* renamed from: j, reason: collision with root package name */
    private static final int f19506j = k(6);

    /* renamed from: k, reason: collision with root package name */
    private static final int f19507k = k(7);

    /* renamed from: a, reason: collision with root package name */
    private final int f19508a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return r.f19500d;
        }

        public final int b() {
            return r.f19507k;
        }

        public final int c() {
            return r.f19502f;
        }

        public final int d() {
            return r.f19506j;
        }

        public final int e() {
            return r.f19501e;
        }

        public final int f() {
            return r.f19505i;
        }

        public final int g() {
            return r.f19503g;
        }

        public final int h() {
            return r.f19504h;
        }

        public final int i() {
            return r.f19499c;
        }

        private a() {
        }
    }

    private /* synthetic */ r(int i10) {
        this.f19508a = i10;
    }

    public static final /* synthetic */ r j(int i10) {
        return new r(i10);
    }

    private static int k(int i10) {
        return i10;
    }

    public static boolean l(int i10, Object obj) {
        return (obj instanceof r) && i10 == ((r) obj).p();
    }

    public static final boolean m(int i10, int i11) {
        return i10 == i11;
    }

    public static int n(int i10) {
        return Integer.hashCode(i10);
    }

    public static String o(int i10) {
        return m(i10, f19499c) ? "Unspecified" : m(i10, f19501e) ? "None" : m(i10, f19500d) ? "Default" : m(i10, f19502f) ? "Go" : m(i10, f19503g) ? "Search" : m(i10, f19504h) ? "Send" : m(i10, f19505i) ? "Previous" : m(i10, f19506j) ? "Next" : m(i10, f19507k) ? "Done" : "Invalid";
    }

    public boolean equals(Object obj) {
        return l(this.f19508a, obj);
    }

    public int hashCode() {
        return n(this.f19508a);
    }

    public final /* synthetic */ int p() {
        return this.f19508a;
    }

    public String toString() {
        return o(this.f19508a);
    }
}
