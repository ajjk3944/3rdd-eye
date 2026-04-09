package androidx.media3.common;

/* loaded from: classes.dex */
public final class h1 implements i {

    /* renamed from: x, reason: collision with root package name */
    public static final h1 f1694x = new h1(0, 0, 0, 1.0f);

    /* renamed from: a, reason: collision with root package name */
    public final int f1695a;

    /* renamed from: d, reason: collision with root package name */
    public final int f1696d;

    /* renamed from: g, reason: collision with root package name */
    public final int f1697g;

    /* renamed from: r, reason: collision with root package name */
    public final float f1698r;

    static {
        int i10 = a5.d0.f105a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
    }

    public h1(int i10, int i11, int i12, float f10) {
        this.f1695a = i10;
        this.f1696d = i11;
        this.f1697g = i12;
        this.f1698r = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h1) {
            h1 h1Var = (h1) obj;
            if (this.f1695a == h1Var.f1695a && this.f1696d == h1Var.f1696d && this.f1697g == h1Var.f1697g && this.f1698r == h1Var.f1698r) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f1698r) + ((((((217 + this.f1695a) * 31) + this.f1696d) * 31) + this.f1697g) * 31);
    }
}
