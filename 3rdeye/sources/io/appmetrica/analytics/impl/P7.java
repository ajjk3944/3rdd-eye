package io.appmetrica.analytics.impl;

/* loaded from: classes3.dex */
public final class P7 {

    /* renamed from: a, reason: collision with root package name */
    public final long f39963a;

    /* renamed from: b, reason: collision with root package name */
    public final int f39964b;

    public P7(int i, long j4) {
        this.f39963a = j4;
        this.f39964b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P7)) {
            return false;
        }
        P7 p72 = (P7) obj;
        return this.f39963a == p72.f39963a && this.f39964b == p72.f39964b;
    }

    public final int hashCode() {
        long j4 = this.f39963a;
        return this.f39964b + (((int) (j4 ^ (j4 >>> 32))) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DecimalProtoModel(mantissa=");
        sb.append(this.f39963a);
        sb.append(", exponent=");
        return N7.H7.p(sb, this.f39964b, ')');
    }
}
