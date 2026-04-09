package ka;

import java.util.Set;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f28111a;

    /* renamed from: b, reason: collision with root package name */
    public final long f28112b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f28113c;

    public b(long j, long j8, Set set) {
        this.f28111a = j;
        this.f28112b = j8;
        this.f28113c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f28111a == bVar.f28111a && this.f28112b == bVar.f28112b && this.f28113c.equals(bVar.f28113c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f28111a;
        int i4 = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j8 = this.f28112b;
        return ((i4 ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003) ^ this.f28113c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f28111a + ", maxAllowedDelay=" + this.f28112b + ", flags=" + this.f28113c + "}";
    }
}
