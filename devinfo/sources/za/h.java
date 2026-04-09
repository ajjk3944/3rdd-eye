package za;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f38151a;

    /* renamed from: b, reason: collision with root package name */
    public final int f38152b;

    /* renamed from: c, reason: collision with root package name */
    public final double f38153c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f38154d;

    public h(int i4, int i10, double d10, boolean z3) {
        this.f38151a = i4;
        this.f38152b = i10;
        this.f38153c = d10;
        this.f38154d = z3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.f38151a == hVar.f38151a && this.f38152b == hVar.f38152b && Double.doubleToLongBits(this.f38153c) == Double.doubleToLongBits(hVar.f38153c) && this.f38154d == hVar.f38154d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        double d10 = this.f38153c;
        return ((((int) (Double.doubleToLongBits(d10) ^ (Double.doubleToLongBits(d10) >>> 32))) ^ ((((this.f38151a ^ 1000003) * 1000003) ^ this.f38152b) * 1000003)) * 1000003) ^ (true != this.f38154d ? 1237 : 1231);
    }

    public final String toString() {
        int i4 = this.f38151a;
        int length = String.valueOf(i4).length();
        int i10 = this.f38152b;
        int length2 = String.valueOf(i10).length();
        double d10 = this.f38153c;
        int length3 = String.valueOf(d10).length();
        boolean z3 = this.f38154d;
        StringBuilder sb2 = new StringBuilder(length + 44 + length2 + 20 + length3 + 25 + String.valueOf(z3).length() + 1);
        r5.c.q(i4, i10, "PingStrategy{maxAttempts=", ", initialBackoffMs=", sb2);
        sb2.append(", backoffMultiplier=");
        sb2.append(d10);
        sb2.append(", bufferAfterMaxAttempts=");
        sb2.append(z3);
        sb2.append("}");
        return sb2.toString();
    }
}
