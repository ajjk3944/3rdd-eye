package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class kw0 implements c8 {

    /* renamed from: a, reason: collision with root package name */
    public final long f13259a;

    /* renamed from: b, reason: collision with root package name */
    public final long f13260b;

    /* renamed from: c, reason: collision with root package name */
    public final long f13261c;

    public kw0(long j, long j8, long j9) {
        this.f13259a = j;
        this.f13260b = j8;
        this.f13261c = j9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kw0)) {
            return false;
        }
        kw0 kw0Var = (kw0) obj;
        return this.f13259a == kw0Var.f13259a && this.f13260b == kw0Var.f13260b && this.f13261c == kw0Var.f13261c;
    }

    public final int hashCode() {
        long j = this.f13259a;
        long j8 = this.f13260b;
        int i4 = (((((int) (j ^ (j >>> 32))) + 527) * 31) + ((int) (j8 ^ (j8 >>> 32)))) * 31;
        long j9 = this.f13261c;
        return i4 + ((int) ((j9 >>> 32) ^ j9));
    }

    public final String toString() {
        long j = this.f13259a;
        int length = String.valueOf(j).length();
        long j8 = this.f13260b;
        int length2 = String.valueOf(j8).length();
        long j9 = this.f13261c;
        StringBuilder sb2 = new StringBuilder(length + 48 + length2 + 12 + String.valueOf(j9).length());
        a0.g.A(sb2, "Mp4Timestamp: creation time=", j, ", modification time=");
        sb2.append(j8);
        sb2.append(", timescale=");
        sb2.append(j9);
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.c8
    public final /* synthetic */ void a(o6 o6Var) {
    }
}
