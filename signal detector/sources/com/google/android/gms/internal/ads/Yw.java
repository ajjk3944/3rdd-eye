package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class Yw implements B3 {

    /* renamed from: a, reason: collision with root package name */
    public final float f12734a;

    /* renamed from: b, reason: collision with root package name */
    public final float f12735b;

    public Yw(float f2, float f5) {
        boolean z6 = false;
        if (f2 >= -90.0f && f2 <= 90.0f && f5 >= -180.0f && f5 <= 180.0f) {
            z6 = true;
        }
        AbstractC0582Jp.y("Invalid latitude or longitude", z6);
        this.f12734a = f2;
        this.f12735b = f5;
    }

    @Override // com.google.android.gms.internal.ads.B3
    public final /* synthetic */ void a(O2 o22) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Yw.class == obj.getClass()) {
            Yw yw = (Yw) obj;
            if (this.f12734a == yw.f12734a && this.f12735b == yw.f12735b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f12735b) + ((Float.floatToIntBits(this.f12734a) + 527) * 31);
    }

    public final String toString() {
        float f2 = this.f12734a;
        int length = String.valueOf(f2).length();
        float f5 = this.f12735b;
        StringBuilder sb = new StringBuilder(length + 26 + String.valueOf(f5).length());
        sb.append("xyz: latitude=");
        sb.append(f2);
        sb.append(", longitude=");
        sb.append(f5);
        return sb.toString();
    }
}
