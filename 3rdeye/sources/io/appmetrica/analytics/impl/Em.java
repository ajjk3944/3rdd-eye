package io.appmetrica.analytics.impl;

/* loaded from: classes3.dex */
public final class Em {

    /* renamed from: a, reason: collision with root package name */
    public final long f39385a;

    public Em(long j4) {
        this.f39385a = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && Em.class == obj.getClass() && this.f39385a == ((Em) obj).f39385a;
    }

    public final int hashCode() {
        long j4 = this.f39385a;
        return (int) (j4 ^ (j4 >>> 32));
    }

    public final String toString() {
        return androidx.work.s.f(new StringBuilder("StatSending{disabledReportingInterval="), this.f39385a, '}');
    }
}
