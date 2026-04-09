package se;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f21997a;

    /* renamed from: b, reason: collision with root package name */
    public final long f21998b;

    /* renamed from: c, reason: collision with root package name */
    public final long f21999c;

    public a(long j, long j7, long j10) {
        this.f21997a = j;
        this.f21998b = j7;
        this.f21999c = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f21997a == aVar.f21997a && this.f21998b == aVar.f21998b && this.f21999c == aVar.f21999c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f21997a;
        long j7 = this.f21998b;
        int i10 = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003;
        long j10 = this.f21999c;
        return i10 ^ ((int) ((j10 >>> 32) ^ j10));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StartupTime{epochMillis=");
        sb2.append(this.f21997a);
        sb2.append(", elapsedRealtime=");
        sb2.append(this.f21998b);
        sb2.append(", uptimeMillis=");
        return c7.a.n(this.f21999c, "}", sb2);
    }
}
