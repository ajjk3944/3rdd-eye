package R0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: R0.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3471y {

    /* renamed from: b, reason: collision with root package name */
    public static final a f19528b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final int f19529c = l(0);

    /* renamed from: d, reason: collision with root package name */
    private static final int f19530d = l(1);

    /* renamed from: e, reason: collision with root package name */
    private static final int f19531e = l(2);

    /* renamed from: f, reason: collision with root package name */
    private static final int f19532f = l(3);

    /* renamed from: g, reason: collision with root package name */
    private static final int f19533g = l(4);

    /* renamed from: h, reason: collision with root package name */
    private static final int f19534h = l(5);

    /* renamed from: i, reason: collision with root package name */
    private static final int f19535i = l(6);

    /* renamed from: j, reason: collision with root package name */
    private static final int f19536j = l(7);

    /* renamed from: k, reason: collision with root package name */
    private static final int f19537k = l(8);

    /* renamed from: l, reason: collision with root package name */
    private static final int f19538l = l(9);

    /* renamed from: a, reason: collision with root package name */
    private final int f19539a;

    /* renamed from: R0.y$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return C3471y.f19531e;
        }

        public final int b() {
            return C3471y.f19538l;
        }

        public final int c() {
            return C3471y.f19535i;
        }

        public final int d() {
            return C3471y.f19532f;
        }

        public final int e() {
            return C3471y.f19537k;
        }

        public final int f() {
            return C3471y.f19536j;
        }

        public final int g() {
            return C3471y.f19533g;
        }

        public final int h() {
            return C3471y.f19530d;
        }

        public final int i() {
            return C3471y.f19529c;
        }

        public final int j() {
            return C3471y.f19534h;
        }

        private a() {
        }
    }

    private /* synthetic */ C3471y(int i10) {
        this.f19539a = i10;
    }

    public static final /* synthetic */ C3471y k(int i10) {
        return new C3471y(i10);
    }

    private static int l(int i10) {
        return i10;
    }

    public static boolean m(int i10, Object obj) {
        return (obj instanceof C3471y) && i10 == ((C3471y) obj).q();
    }

    public static final boolean n(int i10, int i11) {
        return i10 == i11;
    }

    public static int o(int i10) {
        return Integer.hashCode(i10);
    }

    public static String p(int i10) {
        return n(i10, f19529c) ? "Unspecified" : n(i10, f19530d) ? "Text" : n(i10, f19531e) ? "Ascii" : n(i10, f19532f) ? "Number" : n(i10, f19533g) ? "Phone" : n(i10, f19534h) ? "Uri" : n(i10, f19535i) ? "Email" : n(i10, f19536j) ? "Password" : n(i10, f19537k) ? "NumberPassword" : n(i10, f19538l) ? "Decimal" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m(this.f19539a, obj);
    }

    public int hashCode() {
        return o(this.f19539a);
    }

    public final /* synthetic */ int q() {
        return this.f19539a;
    }

    public String toString() {
        return p(this.f19539a);
    }
}
