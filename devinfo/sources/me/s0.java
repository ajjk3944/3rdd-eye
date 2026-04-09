package me;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class s0 extends w1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f29305a;

    /* renamed from: b, reason: collision with root package name */
    public final long f29306b;

    /* renamed from: c, reason: collision with root package name */
    public final String f29307c;

    /* renamed from: d, reason: collision with root package name */
    public final String f29308d;

    public s0(long j, long j8, String str, String str2) {
        this.f29305a = j;
        this.f29306b = j8;
        this.f29307c = str;
        this.f29308d = str2;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof w1) {
            s0 s0Var = (s0) ((w1) obj);
            String str2 = s0Var.f29308d;
            if (this.f29305a == s0Var.f29305a && this.f29306b == s0Var.f29306b && this.f29307c.equals(s0Var.f29307c) && ((str = this.f29308d) != null ? str.equals(str2) : str2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f29305a;
        long j8 = this.f29306b;
        int iHashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003) ^ this.f29307c.hashCode()) * 1000003;
        String str = this.f29308d;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BinaryImage{baseAddress=");
        sb2.append(this.f29305a);
        sb2.append(", size=");
        sb2.append(this.f29306b);
        sb2.append(", name=");
        sb2.append(this.f29307c);
        sb2.append(", uuid=");
        return d.h.w(sb2, this.f29308d, "}");
    }
}
