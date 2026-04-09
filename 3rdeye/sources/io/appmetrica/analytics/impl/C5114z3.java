package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.z3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5114z3 {

    /* renamed from: a, reason: collision with root package name */
    public final long f42161a;

    public C5114z3(long j4) {
        this.f42161a = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C5114z3.class == obj.getClass() && this.f42161a == ((C5114z3) obj).f42161a;
    }

    public final int hashCode() {
        long j4 = this.f42161a;
        return (int) (j4 ^ (j4 >>> 32));
    }

    public final String toString() {
        return androidx.work.s.f(new StringBuilder("CacheControl{lastKnownLocationTtl="), this.f42161a, '}');
    }
}
