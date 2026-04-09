package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class p4 implements c8 {

    /* renamed from: a, reason: collision with root package name */
    public final float f14892a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14893b;

    public p4(int i4, float f10) {
        this.f14892a = f10;
        this.f14893b = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p4.class == obj.getClass()) {
            p4 p4Var = (p4) obj;
            if (this.f14892a == p4Var.f14892a && this.f14893b == p4Var.f14893b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return r5.c.d(this.f14892a, 527, 31) + this.f14893b;
    }

    public final String toString() {
        float f10 = this.f14892a;
        int length = String.valueOf(f10).length();
        int i4 = this.f14893b;
        StringBuilder sb2 = new StringBuilder(length + 47 + String.valueOf(i4).length());
        sb2.append("smta: captureFrameRate=");
        sb2.append(f10);
        sb2.append(", svcTemporalLayerCount=");
        sb2.append(i4);
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.c8
    public final /* synthetic */ void a(o6 o6Var) {
    }
}
