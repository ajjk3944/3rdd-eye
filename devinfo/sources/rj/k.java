package rj;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f33016a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f33017b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f33018c;

    /* renamed from: d, reason: collision with root package name */
    public final long f33019d;

    public k(boolean z3, boolean z10, boolean z11, long j) {
        this.f33016a = z3;
        this.f33017b = z10;
        this.f33018c = z11;
        this.f33019d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f33016a == kVar.f33016a && this.f33017b == kVar.f33017b && this.f33018c == kVar.f33018c && this.f33019d == kVar.f33019d;
    }

    public final int hashCode() {
        int i4 = (((this.f33016a ? 1231 : 1237) * 31) + (this.f33017b ? 1231 : 1237)) * 31;
        int i10 = this.f33018c ? 1231 : 1237;
        long j = this.f33019d;
        return ((i4 + i10) * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "KeepScore(nonWarning=" + this.f33016a + ", nonCache=" + this.f33017b + ", nonTemp=" + this.f33018c + ", time=" + this.f33019d + ")";
    }
}
