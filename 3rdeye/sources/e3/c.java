package E3;

import E3.e;
import java.util.Set;

/* compiled from: AutoValue_SchedulerConfig_ConfigValue.java */
/* loaded from: classes.dex */
public final class c extends e.a {

    /* renamed from: a, reason: collision with root package name */
    public final long f1377a;

    /* renamed from: b, reason: collision with root package name */
    public final long f1378b;

    /* renamed from: c, reason: collision with root package name */
    public final Set<e.b> f1379c;

    public c(long j4, long j10, Set set) {
        this.f1377a = j4;
        this.f1378b = j10;
        this.f1379c = set;
    }

    @Override // E3.e.a
    public final long a() {
        return this.f1377a;
    }

    @Override // E3.e.a
    public final Set<e.b> b() {
        return this.f1379c;
    }

    @Override // E3.e.a
    public final long c() {
        return this.f1378b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e.a)) {
            return false;
        }
        e.a aVar = (e.a) obj;
        return this.f1377a == aVar.a() && this.f1378b == aVar.c() && this.f1379c.equals(aVar.b());
    }

    public final int hashCode() {
        long j4 = this.f1377a;
        int i = (((int) (j4 ^ (j4 >>> 32))) ^ 1000003) * 1000003;
        long j10 = this.f1378b;
        return ((i ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f1379c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f1377a + ", maxAllowedDelay=" + this.f1378b + ", flags=" + this.f1379c + "}";
    }
}
