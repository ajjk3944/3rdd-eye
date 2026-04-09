package W0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final C0872a f23475b = new C0872a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final float f23476c = c(0.5f);

    /* renamed from: d, reason: collision with root package name */
    private static final float f23477d = c(-0.5f);

    /* renamed from: e, reason: collision with root package name */
    private static final float f23478e = c(0.0f);

    /* renamed from: a, reason: collision with root package name */
    private final float f23479a;

    /* renamed from: W0.a$a, reason: collision with other inner class name */
    public static final class C0872a {
        public /* synthetic */ C0872a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final float a() {
            return a.f23478e;
        }

        private C0872a() {
        }
    }

    private /* synthetic */ a(float f10) {
        this.f23479a = f10;
    }

    public static final /* synthetic */ a b(float f10) {
        return new a(f10);
    }

    public static float c(float f10) {
        return f10;
    }

    public static boolean d(float f10, Object obj) {
        return (obj instanceof a) && Float.compare(f10, ((a) obj).h()) == 0;
    }

    public static final boolean e(float f10, float f11) {
        return Float.compare(f10, f11) == 0;
    }

    public static int f(float f10) {
        return Float.hashCode(f10);
    }

    public static String g(float f10) {
        return "BaselineShift(multiplier=" + f10 + ')';
    }

    public boolean equals(Object obj) {
        return d(this.f23479a, obj);
    }

    public final /* synthetic */ float h() {
        return this.f23479a;
    }

    public int hashCode() {
        return f(this.f23479a);
    }

    public String toString() {
        return g(this.f23479a);
    }
}
