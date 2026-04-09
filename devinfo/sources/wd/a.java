package wd;

import je.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f36604a;

    /* renamed from: b, reason: collision with root package name */
    public final long f36605b;

    /* renamed from: c, reason: collision with root package name */
    public final long f36606c;

    public a(long j, long j8, long j9) {
        this.f36604a = j;
        this.f36605b = j8;
        this.f36606c = j9;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f36604a == aVar.f36604a && this.f36605b == aVar.f36605b && this.f36606c == aVar.f36606c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f36604a;
        long j8 = this.f36605b;
        int i4 = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003;
        long j9 = this.f36606c;
        return i4 ^ ((int) ((j9 >>> 32) ^ j9));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StartupTime{epochMillis=");
        sb2.append(this.f36604a);
        sb2.append(", elapsedRealtime=");
        sb2.append(this.f36605b);
        sb2.append(", uptimeMillis=");
        return u.s(this.f36606c, "}", sb2);
    }
}
