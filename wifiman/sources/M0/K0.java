package m0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class K0 {

    /* renamed from: b, reason: collision with root package name */
    public static final a f52822b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final int f52823c = g(0);

    /* renamed from: d, reason: collision with root package name */
    private static final int f52824d = g(1);

    /* renamed from: e, reason: collision with root package name */
    private static final int f52825e = g(2);

    /* renamed from: f, reason: collision with root package name */
    private static final int f52826f = g(3);

    /* renamed from: g, reason: collision with root package name */
    private static final int f52827g = g(4);

    /* renamed from: a, reason: collision with root package name */
    private final int f52828a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return K0.f52824d;
        }

        public final int b() {
            return K0.f52823c;
        }

        public final int c() {
            return K0.f52826f;
        }

        public final int d() {
            return K0.f52827g;
        }

        public final int e() {
            return K0.f52825e;
        }

        private a() {
        }
    }

    private /* synthetic */ K0(int i10) {
        this.f52828a = i10;
    }

    public static final /* synthetic */ K0 f(int i10) {
        return new K0(i10);
    }

    public static int g(int i10) {
        return i10;
    }

    public static boolean h(int i10, Object obj) {
        return (obj instanceof K0) && i10 == ((K0) obj).l();
    }

    public static final boolean i(int i10, int i11) {
        return i10 == i11;
    }

    public static int j(int i10) {
        return Integer.hashCode(i10);
    }

    public static String k(int i10) {
        return i(i10, f52823c) ? "Argb8888" : i(i10, f52824d) ? "Alpha8" : i(i10, f52825e) ? "Rgb565" : i(i10, f52826f) ? "F16" : i(i10, f52827g) ? "Gpu" : "Unknown";
    }

    public boolean equals(Object obj) {
        return h(this.f52828a, obj);
    }

    public int hashCode() {
        return j(this.f52828a);
    }

    public final /* synthetic */ int l() {
        return this.f52828a;
    }

    public String toString() {
        return k(this.f52828a);
    }
}
