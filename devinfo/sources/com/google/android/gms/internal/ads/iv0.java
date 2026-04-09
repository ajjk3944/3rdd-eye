package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class iv0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f12488a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f12489b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f12490c;

    /* renamed from: d, reason: collision with root package name */
    public final long f12491d;

    /* renamed from: e, reason: collision with root package name */
    public final long f12492e;

    public iv0(String str, boolean z3, boolean z10, long j, long j8) {
        this.f12488a = str;
        this.f12489b = z3;
        this.f12490c = z10;
        this.f12491d = j;
        this.f12492e = j8;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof iv0)) {
            return false;
        }
        iv0 iv0Var = (iv0) obj;
        return this.f12488a.equals(iv0Var.f12488a) && this.f12489b == iv0Var.f12489b && this.f12490c == iv0Var.f12490c && this.f12491d == iv0Var.f12491d && this.f12492e == iv0Var.f12492e;
    }

    public final int hashCode() {
        return ((((((((((((this.f12488a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f12489b ? 1237 : 1231)) * 1000003) ^ (true != this.f12490c ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003) ^ ((int) this.f12491d)) * 1000003) ^ 1237) * 1000003) ^ ((int) this.f12492e);
    }

    public final String toString() {
        boolean z3 = this.f12489b;
        int length = String.valueOf(z3).length();
        boolean z10 = this.f12490c;
        int length2 = String.valueOf(z10).length();
        long j = this.f12491d;
        int length3 = String.valueOf(j).length();
        long j8 = this.f12492e;
        int length4 = String.valueOf(j8).length();
        String str = this.f12488a;
        StringBuilder sb2 = new StringBuilder(str.length() + 56 + length + 32 + length2 + 57 + length3 + 61 + length4 + 1);
        sb2.append("AdShield2Options{clientVersion=");
        sb2.append(str);
        sb2.append(", shouldGetAdvertisingId=");
        sb2.append(z3);
        sb2.append(", isGooglePlayServicesAvailable=");
        sb2.append(z10);
        sb2.append(", enableQuerySignalsTimeout=false, querySignalsTimeoutMs=");
        sb2.append(j);
        sb2.append(", enableQuerySignalsCache=false, querySignalsCacheTtlSeconds=");
        sb2.append(j8);
        sb2.append("}");
        return sb2.toString();
    }
}
