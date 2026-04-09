package io.appmetrica.analytics.impl;

/* loaded from: classes3.dex */
public final class U9 {

    /* renamed from: a, reason: collision with root package name */
    public final long f40231a;

    public U9(long j4) {
        this.f40231a = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof U9) && this.f40231a == ((U9) obj).f40231a;
    }

    public final int hashCode() {
        long j4 = this.f40231a;
        return (int) (j4 ^ (j4 >>> 32));
    }

    public final String toString() {
        return androidx.work.s.f(new StringBuilder("ExternalAttributionConfig(collectingInterval="), this.f40231a, ')');
    }
}
