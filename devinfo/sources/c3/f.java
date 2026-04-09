package c3;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: b, reason: collision with root package name */
    public static final float f2709b;

    /* renamed from: c, reason: collision with root package name */
    public static final float f2710c;

    /* renamed from: d, reason: collision with root package name */
    public static final float f2711d;

    /* renamed from: a, reason: collision with root package name */
    public final float f2712a;

    static {
        a(0.0f);
        a(0.5f);
        f2709b = 0.5f;
        a(-1.0f);
        f2710c = -1.0f;
        a(1.0f);
        f2711d = 1.0f;
    }

    public static void a(float f10) {
        if ((0.0f > f10 || f10 > 1.0f) && f10 != -1.0f) {
            x2.a.b("topRatio should be in [0..1] range or -1");
        }
    }

    public static String b(float f10) {
        if (f10 == 0.0f) {
            return "LineHeightStyle.Alignment.Top";
        }
        if (f10 == f2709b) {
            return "LineHeightStyle.Alignment.Center";
        }
        if (f10 == f2710c) {
            return "LineHeightStyle.Alignment.Proportional";
        }
        if (f10 == f2711d) {
            return "LineHeightStyle.Alignment.Bottom";
        }
        return "LineHeightStyle.Alignment(topPercentage = " + f10 + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return Float.compare(this.f2712a, ((f) obj).f2712a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f2712a);
    }

    public final String toString() {
        return b(this.f2712a);
    }
}
