package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class vh1 implements em {

    /* renamed from: e, reason: collision with root package name */
    public static final vh1 f34541e = new vh1(1.0f, 1.0f);

    /* renamed from: b, reason: collision with root package name */
    public final float f34542b;

    /* renamed from: c, reason: collision with root package name */
    public final float f34543c;

    /* renamed from: d, reason: collision with root package name */
    private final int f34544d;

    public vh1(float f10, float f11) {
        zf.a(f10 > 0.0f);
        zf.a(f11 > 0.0f);
        this.f34542b = f10;
        this.f34543c = f11;
        this.f34544d = Math.round(f10 * 1000.0f);
    }

    public final long a(long j4) {
        return j4 * this.f34544d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && vh1.class == obj.getClass()) {
            vh1 vh1Var = (vh1) obj;
            if (this.f34542b == vh1Var.f34542b && this.f34543c == vh1Var.f34543c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f34543c) + ((Float.floatToRawIntBits(this.f34542b) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.f34542b), Float.valueOf(this.f34543c)};
        int i = s82.f32899a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }

    private static vh1 a(Bundle bundle) {
        return new vh1(bundle.getFloat(Integer.toString(0, 36), 1.0f), bundle.getFloat(Integer.toString(1, 36), 1.0f));
    }
}
