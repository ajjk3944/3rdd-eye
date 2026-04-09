package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class O1 implements B3 {

    /* renamed from: a, reason: collision with root package name */
    public final float f10124a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10125b;

    public O1(int i, float f2) {
        this.f10124a = f2;
        this.f10125b = i;
    }

    @Override // com.google.android.gms.internal.ads.B3
    public final /* synthetic */ void a(O2 o22) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && O1.class == obj.getClass()) {
            O1 o12 = (O1) obj;
            if (this.f10124a == o12.f10124a && this.f10125b == o12.f10125b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.floatToIntBits(this.f10124a) + 527) * 31) + this.f10125b;
    }

    public final String toString() {
        float f2 = this.f10124a;
        int length = String.valueOf(f2).length();
        int i = this.f10125b;
        StringBuilder sb = new StringBuilder(length + 47 + String.valueOf(i).length());
        sb.append("smta: captureFrameRate=");
        sb.append(f2);
        sb.append(", svcTemporalLayerCount=");
        sb.append(i);
        return sb.toString();
    }
}
