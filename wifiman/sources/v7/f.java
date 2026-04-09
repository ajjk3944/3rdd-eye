package v7;

import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
final class f {

    /* renamed from: a, reason: collision with root package name */
    private final long f63491a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f63492b;

    public f(long j10, Object obj) {
        this.f63491a = j10;
        this.f63492b = obj;
    }

    public final long a() {
        return this.f63491a;
    }

    public final Object b() {
        return this.f63492b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f63491a == fVar.f63491a && AbstractC6492s.d(this.f63492b, fVar.f63492b);
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.f63491a) * 31;
        Object obj = this.f63492b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        return "TTLCacheEntry(expireAtMs=" + this.f63491a + ", value=" + this.f63492b + ")";
    }
}
