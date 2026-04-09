package com.google.android.gms.internal.ads;

import java.util.Locale;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class fc {

    /* renamed from: d, reason: collision with root package name */
    public static final fc f11093d = new fc(1.0f, 1.0f);

    /* renamed from: a, reason: collision with root package name */
    public final float f11094a;

    /* renamed from: b, reason: collision with root package name */
    public final float f11095b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11096c;

    static {
        String str = bq0.f9768a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public fc(float f10, float f11) {
        mq0.m(f10 > 0.0f);
        mq0.m(f11 > 0.0f);
        this.f11094a = f10;
        this.f11095b = f11;
        this.f11096c = Math.round(f10 * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && fc.class == obj.getClass()) {
            fc fcVar = (fc) obj;
            if (this.f11094a == fcVar.f11094a && this.f11095b == fcVar.f11095b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f11095b) + ((Float.floatToRawIntBits(this.f11094a) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.f11094a), Float.valueOf(this.f11095b)};
        String str = bq0.f9768a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }
}
