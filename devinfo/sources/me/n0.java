package me;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class n0 extends v1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f29247a;

    /* renamed from: b, reason: collision with root package name */
    public final String f29248b;

    /* renamed from: c, reason: collision with root package name */
    public final int f29249c;

    /* renamed from: d, reason: collision with root package name */
    public final long f29250d;

    /* renamed from: e, reason: collision with root package name */
    public final long f29251e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f29252f;
    public final int g;

    /* renamed from: h, reason: collision with root package name */
    public final String f29253h;

    /* renamed from: i, reason: collision with root package name */
    public final String f29254i;

    public n0(int i4, String str, int i10, long j, long j8, boolean z3, int i11, String str2, String str3) {
        this.f29247a = i4;
        this.f29248b = str;
        this.f29249c = i10;
        this.f29250d = j;
        this.f29251e = j8;
        this.f29252f = z3;
        this.g = i11;
        this.f29253h = str2;
        this.f29254i = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v1) {
            n0 n0Var = (n0) ((v1) obj);
            if (this.f29247a == n0Var.f29247a && this.f29248b.equals(n0Var.f29248b) && this.f29249c == n0Var.f29249c && this.f29250d == n0Var.f29250d && this.f29251e == n0Var.f29251e && this.f29252f == n0Var.f29252f && this.g == n0Var.g && this.f29253h.equals(n0Var.f29253h) && this.f29254i.equals(n0Var.f29254i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((this.f29247a ^ 1000003) * 1000003) ^ this.f29248b.hashCode()) * 1000003) ^ this.f29249c) * 1000003;
        long j = this.f29250d;
        int i4 = (iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j8 = this.f29251e;
        return ((((((((i4 ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003) ^ (this.f29252f ? 1231 : 1237)) * 1000003) ^ this.g) * 1000003) ^ this.f29253h.hashCode()) * 1000003) ^ this.f29254i.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device{arch=");
        sb2.append(this.f29247a);
        sb2.append(", model=");
        sb2.append(this.f29248b);
        sb2.append(", cores=");
        sb2.append(this.f29249c);
        sb2.append(", ram=");
        sb2.append(this.f29250d);
        sb2.append(", diskSpace=");
        sb2.append(this.f29251e);
        sb2.append(", simulator=");
        sb2.append(this.f29252f);
        sb2.append(", state=");
        sb2.append(this.g);
        sb2.append(", manufacturer=");
        sb2.append(this.f29253h);
        sb2.append(", modelClass=");
        return d.h.w(sb2, this.f29254i, "}");
    }
}
