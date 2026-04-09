package com.google.android.gms.internal.ads;

import java.util.Locale;

/* renamed from: com.google.android.gms.internal.ads.y5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2159y5 {

    /* renamed from: d, reason: collision with root package name */
    public static final C2159y5 f17678d = new C2159y5(1.0f, 1.0f);

    /* renamed from: a, reason: collision with root package name */
    public final float f17679a;

    /* renamed from: b, reason: collision with root package name */
    public final float f17680b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17681c;

    static {
        String str = Vt.f12096a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public C2159y5(float f2, float f5) {
        AbstractC0582Jp.m(f2 > 0.0f);
        AbstractC0582Jp.m(f5 > 0.0f);
        this.f17679a = f2;
        this.f17680b = f5;
        this.f17681c = Math.round(f2 * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2159y5.class == obj.getClass()) {
            C2159y5 c2159y5 = (C2159y5) obj;
            if (this.f17679a == c2159y5.f17679a && this.f17680b == c2159y5.f17680b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f17680b) + ((Float.floatToRawIntBits(this.f17679a) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.f17679a), Float.valueOf(this.f17680b)};
        String str = Vt.f12096a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }
}
