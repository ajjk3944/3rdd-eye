package com.google.android.exoplayer2;

import java.util.Locale;

/* loaded from: classes.dex */
public final class b1 {

    /* renamed from: d, reason: collision with root package name */
    public static final b1 f4069d = new b1(1.0f, 1.0f);

    /* renamed from: a, reason: collision with root package name */
    public final float f4070a;

    /* renamed from: b, reason: collision with root package name */
    public final float f4071b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4072c;

    public b1(float f10, float f11) {
        qb.b.g(f10 > 0.0f);
        qb.b.g(f11 > 0.0f);
        this.f4070a = f10;
        this.f4071b = f11;
        this.f4072c = Math.round(f10 * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b1.class == obj.getClass()) {
            b1 b1Var = (b1) obj;
            if (this.f4070a == b1Var.f4070a && this.f4071b == b1Var.f4071b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f4071b) + ((Float.floatToRawIntBits(this.f4070a) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.f4070a), Float.valueOf(this.f4071b)};
        int i10 = qb.v.f20828a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }
}
