package Y0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class h implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    public static final a f24523b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final float f24524c = j(0.0f);

    /* renamed from: d, reason: collision with root package name */
    private static final float f24525d = j(Float.POSITIVE_INFINITY);

    /* renamed from: e, reason: collision with root package name */
    private static final float f24526e = j(Float.NaN);

    /* renamed from: a, reason: collision with root package name */
    private final float f24527a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final float a() {
            return h.f24524c;
        }

        public final float b() {
            return h.f24525d;
        }

        public final float c() {
            return h.f24526e;
        }

        private a() {
        }
    }

    private /* synthetic */ h(float f10) {
        this.f24527a = f10;
    }

    public static final /* synthetic */ h d(float f10) {
        return new h(f10);
    }

    public static int h(float f10, float f11) {
        return Float.compare(f10, f11);
    }

    public static float j(float f10) {
        return f10;
    }

    public static boolean l(float f10, Object obj) {
        return (obj instanceof h) && Float.compare(f10, ((h) obj).s()) == 0;
    }

    public static final boolean n(float f10, float f11) {
        return Float.compare(f10, f11) == 0;
    }

    public static int p(float f10) {
        return Float.hashCode(f10);
    }

    public static String r(float f10) {
        if (Float.isNaN(f10)) {
            return "Dp.Unspecified";
        }
        return f10 + ".dp";
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return g(((h) obj).s());
    }

    public boolean equals(Object obj) {
        return l(this.f24527a, obj);
    }

    public int g(float f10) {
        return h(this.f24527a, f10);
    }

    public int hashCode() {
        return p(this.f24527a);
    }

    public final /* synthetic */ float s() {
        return this.f24527a;
    }

    public String toString() {
        return r(this.f24527a);
    }
}
