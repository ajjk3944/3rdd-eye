package u2;

import o4.AbstractC2763b;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final int f23811a;

    /* renamed from: b, reason: collision with root package name */
    public final int f23812b;

    /* renamed from: c, reason: collision with root package name */
    public final double f23813c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f23814d;

    public j(int i, int i3, double d6, boolean z6) {
        this.f23811a = i;
        this.f23812b = i3;
        this.f23813c = d6;
        this.f23814d = z6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f23811a == jVar.f23811a && this.f23812b == jVar.f23812b && Double.doubleToLongBits(this.f23813c) == Double.doubleToLongBits(jVar.f23813c) && this.f23814d == jVar.f23814d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        double d6 = this.f23813c;
        return ((((int) (Double.doubleToLongBits(d6) ^ (Double.doubleToLongBits(d6) >>> 32))) ^ ((((this.f23811a ^ 1000003) * 1000003) ^ this.f23812b) * 1000003)) * 1000003) ^ (true != this.f23814d ? 1237 : 1231);
    }

    public final String toString() {
        int i = this.f23811a;
        int length = String.valueOf(i).length();
        int i3 = this.f23812b;
        int length2 = String.valueOf(i3).length();
        double d6 = this.f23813c;
        int length3 = String.valueOf(d6).length();
        boolean z6 = this.f23814d;
        StringBuilder sb = new StringBuilder(length + 44 + length2 + 20 + length3 + 25 + String.valueOf(z6).length() + 1);
        AbstractC2763b.h(sb, "PingStrategy{maxAttempts=", i, ", initialBackoffMs=", i3);
        sb.append(", backoffMultiplier=");
        sb.append(d6);
        sb.append(", bufferAfterMaxAttempts=");
        sb.append(z6);
        sb.append("}");
        return sb.toString();
    }
}
