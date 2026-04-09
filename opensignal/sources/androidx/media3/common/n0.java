package androidx.media3.common;

import java.util.Locale;

/* loaded from: classes.dex */
public final class n0 implements i {

    /* renamed from: r, reason: collision with root package name */
    public static final n0 f1724r = new n0(1.0f, 1.0f);

    /* renamed from: a, reason: collision with root package name */
    public final float f1725a;

    /* renamed from: d, reason: collision with root package name */
    public final float f1726d;

    /* renamed from: g, reason: collision with root package name */
    public final int f1727g;

    static {
        int i10 = a5.d0.f105a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public n0(float f10, float f11) {
        a5.a.e(f10 > 0.0f);
        a5.a.e(f11 > 0.0f);
        this.f1725a = f10;
        this.f1726d = f11;
        this.f1727g = Math.round(f10 * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n0.class == obj.getClass()) {
            n0 n0Var = (n0) obj;
            if (this.f1725a == n0Var.f1725a && this.f1726d == n0Var.f1726d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f1726d) + ((Float.floatToRawIntBits(this.f1725a) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.f1725a), Float.valueOf(this.f1726d)};
        int i10 = a5.d0.f105a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }
}
