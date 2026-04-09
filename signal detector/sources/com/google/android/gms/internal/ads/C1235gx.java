package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.gx, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1235gx implements B3 {

    /* renamed from: a, reason: collision with root package name */
    public final long f14400a;

    /* renamed from: b, reason: collision with root package name */
    public final long f14401b;

    /* renamed from: c, reason: collision with root package name */
    public final long f14402c;

    public C1235gx(long j6, long j7, long j8) {
        this.f14400a = j6;
        this.f14401b = j7;
        this.f14402c = j8;
    }

    @Override // com.google.android.gms.internal.ads.B3
    public final /* synthetic */ void a(O2 o22) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1235gx)) {
            return false;
        }
        C1235gx c1235gx = (C1235gx) obj;
        return this.f14400a == c1235gx.f14400a && this.f14401b == c1235gx.f14401b && this.f14402c == c1235gx.f14402c;
    }

    public final int hashCode() {
        long j6 = this.f14400a;
        long j7 = this.f14401b;
        int i = (((((int) (j6 ^ (j6 >>> 32))) + 527) * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 31;
        long j8 = this.f14402c;
        return i + ((int) ((j8 >>> 32) ^ j8));
    }

    public final String toString() {
        long j6 = this.f14400a;
        int length = String.valueOf(j6).length();
        long j7 = this.f14401b;
        int length2 = String.valueOf(j7).length();
        long j8 = this.f14402c;
        StringBuilder sb = new StringBuilder(length + 48 + length2 + 12 + String.valueOf(j8).length());
        A.f.v(sb, "Mp4Timestamp: creation time=", j6, ", modification time=");
        sb.append(j7);
        sb.append(", timescale=");
        sb.append(j8);
        return sb.toString();
    }
}
