package r2;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: b, reason: collision with root package name */
    public static final float f21199b;

    /* renamed from: c, reason: collision with root package name */
    public static final float f21200c;

    /* renamed from: d, reason: collision with root package name */
    public static final float f21201d;

    /* renamed from: a, reason: collision with root package name */
    public final float f21202a;

    static {
        a(0.0f);
        a(0.5f);
        f21199b = 0.5f;
        a(-1.0f);
        f21200c = -1.0f;
        a(1.0f);
        f21201d = 1.0f;
    }

    public static void a(float f10) {
        if ((0.0f > f10 || f10 > 1.0f) && f10 != -1.0f) {
            m2.a.b("topRatio should be in [0..1] range or -1");
        }
    }

    public static String b(float f10) {
        if (f10 == 0.0f) {
            return "LineHeightStyle.Alignment.Top";
        }
        if (f10 == f21199b) {
            return "LineHeightStyle.Alignment.Center";
        }
        if (f10 == f21200c) {
            return "LineHeightStyle.Alignment.Proportional";
        }
        if (f10 == f21201d) {
            return "LineHeightStyle.Alignment.Bottom";
        }
        return "LineHeightStyle.Alignment(topPercentage = " + f10 + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return Float.compare(this.f21202a, ((f) obj).f21202a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f21202a);
    }

    public final String toString() {
        return b(this.f21202a);
    }
}
