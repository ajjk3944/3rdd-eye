package Q0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: b, reason: collision with root package name */
    public static final a f19104b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final int f19105c = f(0);

    /* renamed from: d, reason: collision with root package name */
    private static final int f19106d = f(1);

    /* renamed from: e, reason: collision with root package name */
    private static final int f19107e = f(2);

    /* renamed from: f, reason: collision with root package name */
    private static final int f19108f = f(3);

    /* renamed from: a, reason: collision with root package name */
    private final int f19109a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return w.f19106d;
        }

        public final int b() {
            return w.f19105c;
        }

        public final int c() {
            return w.f19108f;
        }

        public final int d() {
            return w.f19107e;
        }

        private a() {
        }
    }

    private /* synthetic */ w(int i10) {
        this.f19109a = i10;
    }

    public static final /* synthetic */ w e(int i10) {
        return new w(i10);
    }

    public static int f(int i10) {
        return i10;
    }

    public static boolean g(int i10, Object obj) {
        return (obj instanceof w) && i10 == ((w) obj).m();
    }

    public static final boolean h(int i10, int i11) {
        return i10 == i11;
    }

    public static int i(int i10) {
        return Integer.hashCode(i10);
    }

    public static final boolean j(int i10) {
        return h(i10, f19106d) || h(i10, f19108f);
    }

    public static final boolean k(int i10) {
        return h(i10, f19106d) || h(i10, f19107e);
    }

    public static String l(int i10) {
        return h(i10, f19105c) ? "None" : h(i10, f19106d) ? "All" : h(i10, f19107e) ? "Weight" : h(i10, f19108f) ? "Style" : "Invalid";
    }

    public boolean equals(Object obj) {
        return g(this.f19109a, obj);
    }

    public int hashCode() {
        return i(this.f19109a);
    }

    public final /* synthetic */ int m() {
        return this.f19109a;
    }

    public String toString() {
        return l(this.f19109a);
    }
}
