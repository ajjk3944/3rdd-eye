package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class cw0 implements c8 {

    /* renamed from: a, reason: collision with root package name */
    public final float f10232a;

    /* renamed from: b, reason: collision with root package name */
    public final float f10233b;

    public cw0(float f10, float f11) {
        boolean z3 = false;
        if (f10 >= -90.0f && f10 <= 90.0f && f11 >= -180.0f && f11 <= 180.0f) {
            z3 = true;
        }
        mq0.y("Invalid latitude or longitude", z3);
        this.f10232a = f10;
        this.f10233b = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && cw0.class == obj.getClass()) {
            cw0 cw0Var = (cw0) obj;
            if (this.f10232a == cw0Var.f10232a && this.f10233b == cw0Var.f10233b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f10233b) + ((Float.floatToIntBits(this.f10232a) + 527) * 31);
    }

    public final String toString() {
        float f10 = this.f10232a;
        int length = String.valueOf(f10).length();
        float f11 = this.f10233b;
        StringBuilder sb2 = new StringBuilder(length + 26 + String.valueOf(f11).length());
        sb2.append("xyz: latitude=");
        sb2.append(f10);
        sb2.append(", longitude=");
        sb2.append(f11);
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.c8
    public final /* synthetic */ void a(o6 o6Var) {
    }
}
