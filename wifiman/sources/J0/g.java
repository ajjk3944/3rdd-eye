package J0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: b, reason: collision with root package name */
    public static final a f9602b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final int f9603c = i(0);

    /* renamed from: d, reason: collision with root package name */
    private static final int f9604d = i(1);

    /* renamed from: e, reason: collision with root package name */
    private static final int f9605e = i(2);

    /* renamed from: f, reason: collision with root package name */
    private static final int f9606f = i(3);

    /* renamed from: g, reason: collision with root package name */
    private static final int f9607g = i(4);

    /* renamed from: h, reason: collision with root package name */
    private static final int f9608h = i(5);

    /* renamed from: i, reason: collision with root package name */
    private static final int f9609i = i(6);

    /* renamed from: a, reason: collision with root package name */
    private final int f9610a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return g.f9603c;
        }

        public final int b() {
            return g.f9604d;
        }

        public final int c() {
            return g.f9609i;
        }

        public final int d() {
            return g.f9608h;
        }

        public final int e() {
            return g.f9606f;
        }

        public final int f() {
            return g.f9605e;
        }

        public final int g() {
            return g.f9607g;
        }

        private a() {
        }
    }

    private /* synthetic */ g(int i10) {
        this.f9610a = i10;
    }

    public static final /* synthetic */ g h(int i10) {
        return new g(i10);
    }

    private static int i(int i10) {
        return i10;
    }

    public static boolean j(int i10, Object obj) {
        return (obj instanceof g) && i10 == ((g) obj).n();
    }

    public static final boolean k(int i10, int i11) {
        return i10 == i11;
    }

    public static int l(int i10) {
        return Integer.hashCode(i10);
    }

    public static String m(int i10) {
        return k(i10, f9603c) ? "Button" : k(i10, f9604d) ? "Checkbox" : k(i10, f9605e) ? "Switch" : k(i10, f9606f) ? "RadioButton" : k(i10, f9607g) ? "Tab" : k(i10, f9608h) ? "Image" : k(i10, f9609i) ? "DropdownList" : "Unknown";
    }

    public boolean equals(Object obj) {
        return j(this.f9610a, obj);
    }

    public int hashCode() {
        return l(this.f9610a);
    }

    public final /* synthetic */ int n() {
        return this.f9610a;
    }

    public String toString() {
        return m(this.f9610a);
    }
}
