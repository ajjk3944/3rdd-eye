package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class Ew {

    /* renamed from: a, reason: collision with root package name */
    public final String f8043a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f8044b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f8045c;

    /* renamed from: d, reason: collision with root package name */
    public final long f8046d;

    /* renamed from: e, reason: collision with root package name */
    public final long f8047e;

    public Ew(String str, boolean z6, boolean z7, long j6, long j7) {
        this.f8043a = str;
        this.f8044b = z6;
        this.f8045c = z7;
        this.f8046d = j6;
        this.f8047e = j7;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Ew)) {
            return false;
        }
        Ew ew = (Ew) obj;
        return this.f8043a.equals(ew.f8043a) && this.f8044b == ew.f8044b && this.f8045c == ew.f8045c && this.f8046d == ew.f8046d && this.f8047e == ew.f8047e;
    }

    public final int hashCode() {
        return ((((((((((((this.f8043a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f8044b ? 1237 : 1231)) * 1000003) ^ (true != this.f8045c ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003) ^ ((int) this.f8046d)) * 1000003) ^ 1237) * 1000003) ^ ((int) this.f8047e);
    }

    public final String toString() {
        boolean z6 = this.f8044b;
        int length = String.valueOf(z6).length();
        boolean z7 = this.f8045c;
        int length2 = String.valueOf(z7).length();
        long j6 = this.f8046d;
        int length3 = String.valueOf(j6).length();
        long j7 = this.f8047e;
        int length4 = String.valueOf(j7).length();
        String str = this.f8043a;
        StringBuilder sb = new StringBuilder(str.length() + 56 + length + 32 + length2 + 57 + length3 + 61 + length4 + 1);
        sb.append("AdShield2Options{clientVersion=");
        sb.append(str);
        sb.append(", shouldGetAdvertisingId=");
        sb.append(z6);
        sb.append(", isGooglePlayServicesAvailable=");
        sb.append(z7);
        sb.append(", enableQuerySignalsTimeout=false, querySignalsTimeoutMs=");
        sb.append(j6);
        sb.append(", enableQuerySignalsCache=false, querySignalsCacheTtlSeconds=");
        sb.append(j7);
        sb.append("}");
        return sb.toString();
    }
}
