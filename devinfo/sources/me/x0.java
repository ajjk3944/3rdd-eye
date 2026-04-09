package me;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class x0 extends z1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f29344a;

    /* renamed from: b, reason: collision with root package name */
    public final String f29345b;

    /* renamed from: c, reason: collision with root package name */
    public final String f29346c;

    /* renamed from: d, reason: collision with root package name */
    public final long f29347d;

    /* renamed from: e, reason: collision with root package name */
    public final int f29348e;

    public x0(long j, String str, String str2, long j8, int i4) {
        this.f29344a = j;
        this.f29345b = str;
        this.f29346c = str2;
        this.f29347d = j8;
        this.f29348e = i4;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof z1) {
            x0 x0Var = (x0) ((z1) obj);
            String str2 = x0Var.f29346c;
            if (this.f29344a == x0Var.f29344a && this.f29345b.equals(x0Var.f29345b) && ((str = this.f29346c) != null ? str.equals(str2) : str2 == null) && this.f29347d == x0Var.f29347d && this.f29348e == x0Var.f29348e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f29344a;
        int iHashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f29345b.hashCode()) * 1000003;
        String str = this.f29346c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j8 = this.f29347d;
        return ((iHashCode2 ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003) ^ this.f29348e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Frame{pc=");
        sb2.append(this.f29344a);
        sb2.append(", symbol=");
        sb2.append(this.f29345b);
        sb2.append(", file=");
        sb2.append(this.f29346c);
        sb2.append(", offset=");
        sb2.append(this.f29347d);
        sb2.append(", importance=");
        return r5.c.j(this.f29348e, "}", sb2);
    }
}
