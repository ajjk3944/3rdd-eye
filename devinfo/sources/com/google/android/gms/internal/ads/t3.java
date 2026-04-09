package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class t3 implements c8 {

    /* renamed from: a, reason: collision with root package name */
    public final long f16677a;

    /* renamed from: b, reason: collision with root package name */
    public final long f16678b;

    /* renamed from: c, reason: collision with root package name */
    public final long f16679c;

    /* renamed from: d, reason: collision with root package name */
    public final long f16680d;

    /* renamed from: e, reason: collision with root package name */
    public final long f16681e;

    public t3(long j, long j8, long j9, long j10, long j11) {
        this.f16677a = j;
        this.f16678b = j8;
        this.f16679c = j9;
        this.f16680d = j10;
        this.f16681e = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && t3.class == obj.getClass()) {
            t3 t3Var = (t3) obj;
            if (this.f16677a == t3Var.f16677a && this.f16678b == t3Var.f16678b && this.f16679c == t3Var.f16679c && this.f16680d == t3Var.f16680d && this.f16681e == t3Var.f16681e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f16677a;
        long j8 = this.f16678b;
        int i4 = (((((int) (j ^ (j >>> 32))) + 527) * 31) + ((int) (j8 ^ (j8 >>> 32)))) * 31;
        long j9 = this.f16679c;
        int i10 = (i4 + ((int) (j9 ^ (j9 >>> 32)))) * 31;
        long j10 = this.f16680d;
        int i11 = (i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f16681e;
        return i11 + ((int) ((j11 >>> 32) ^ j11));
    }

    public final String toString() {
        long j = this.f16677a;
        int length = String.valueOf(j).length();
        long j8 = this.f16678b;
        int length2 = String.valueOf(j8).length();
        long j9 = this.f16679c;
        int length3 = String.valueOf(j9).length();
        long j10 = this.f16680d;
        int length4 = String.valueOf(j10).length();
        long j11 = this.f16681e;
        StringBuilder sb2 = new StringBuilder(length + 54 + length2 + 31 + length3 + 21 + length4 + 12 + String.valueOf(j11).length());
        a0.g.A(sb2, "Motion photo metadata: photoStartPosition=", j, ", photoSize=");
        sb2.append(j8);
        a0.g.A(sb2, ", photoPresentationTimestampUs=", j9, ", videoStartPosition=");
        sb2.append(j10);
        sb2.append(", videoSize=");
        sb2.append(j11);
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.c8
    public final /* synthetic */ void a(o6 o6Var) {
    }
}
