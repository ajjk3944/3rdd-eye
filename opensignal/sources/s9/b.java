package s9;

import java.util.Set;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f21930a;

    /* renamed from: b, reason: collision with root package name */
    public final long f21931b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f21932c;

    public b(long j, long j7, Set set) {
        this.f21930a = j;
        this.f21931b = j7;
        this.f21932c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f21930a == bVar.f21930a && this.f21931b == bVar.f21931b && this.f21932c.equals(bVar.f21932c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f21930a;
        int i10 = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j7 = this.f21931b;
        return ((i10 ^ ((int) ((j7 >>> 32) ^ j7))) * 1000003) ^ this.f21932c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f21930a + ", maxAllowedDelay=" + this.f21931b + ", flags=" + this.f21932c + "}";
    }
}
