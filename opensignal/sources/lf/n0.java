package lf;

/* loaded from: classes.dex */
public final class n0 extends v1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f15363a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15364b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15365c;

    /* renamed from: d, reason: collision with root package name */
    public final long f15366d;

    /* renamed from: e, reason: collision with root package name */
    public final long f15367e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f15368f;

    /* renamed from: g, reason: collision with root package name */
    public final int f15369g;

    /* renamed from: h, reason: collision with root package name */
    public final String f15370h;

    /* renamed from: i, reason: collision with root package name */
    public final String f15371i;

    public n0(int i10, String str, int i11, long j, long j7, boolean z10, int i12, String str2, String str3) {
        this.f15363a = i10;
        this.f15364b = str;
        this.f15365c = i11;
        this.f15366d = j;
        this.f15367e = j7;
        this.f15368f = z10;
        this.f15369g = i12;
        this.f15370h = str2;
        this.f15371i = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v1) {
            n0 n0Var = (n0) ((v1) obj);
            if (this.f15363a == n0Var.f15363a && this.f15364b.equals(n0Var.f15364b) && this.f15365c == n0Var.f15365c && this.f15366d == n0Var.f15366d && this.f15367e == n0Var.f15367e && this.f15368f == n0Var.f15368f && this.f15369g == n0Var.f15369g && this.f15370h.equals(n0Var.f15370h) && this.f15371i.equals(n0Var.f15371i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((this.f15363a ^ 1000003) * 1000003) ^ this.f15364b.hashCode()) * 1000003) ^ this.f15365c) * 1000003;
        long j = this.f15366d;
        int i10 = (iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j7 = this.f15367e;
        return ((((((((i10 ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003) ^ (this.f15368f ? 1231 : 1237)) * 1000003) ^ this.f15369g) * 1000003) ^ this.f15370h.hashCode()) * 1000003) ^ this.f15371i.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device{arch=");
        sb2.append(this.f15363a);
        sb2.append(", model=");
        sb2.append(this.f15364b);
        sb2.append(", cores=");
        sb2.append(this.f15365c);
        sb2.append(", ram=");
        sb2.append(this.f15366d);
        sb2.append(", diskSpace=");
        sb2.append(this.f15367e);
        sb2.append(", simulator=");
        sb2.append(this.f15368f);
        sb2.append(", state=");
        sb2.append(this.f15369g);
        sb2.append(", manufacturer=");
        sb2.append(this.f15370h);
        sb2.append(", modelClass=");
        return w.g.j(sb2, this.f15371i, "}");
    }
}
