package d5;

/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final o5.z f6988a;

    /* renamed from: b, reason: collision with root package name */
    public final long f6989b;

    /* renamed from: c, reason: collision with root package name */
    public final long f6990c;

    /* renamed from: d, reason: collision with root package name */
    public final long f6991d;

    /* renamed from: e, reason: collision with root package name */
    public final long f6992e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f6993f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f6994g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f6995h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f6996i;

    public g0(o5.z zVar, long j, long j7, long j10, long j11, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14 = true;
        a5.a.e(!z13 || z11);
        a5.a.e(!z12 || z11);
        if (z10 && (z11 || z12 || z13)) {
            z14 = false;
        }
        a5.a.e(z14);
        this.f6988a = zVar;
        this.f6989b = j;
        this.f6990c = j7;
        this.f6991d = j10;
        this.f6992e = j11;
        this.f6993f = z10;
        this.f6994g = z11;
        this.f6995h = z12;
        this.f6996i = z13;
    }

    public final g0 a(long j) {
        if (j == this.f6990c) {
            return this;
        }
        return new g0(this.f6988a, this.f6989b, j, this.f6991d, this.f6992e, this.f6993f, this.f6994g, this.f6995h, this.f6996i);
    }

    public final g0 b(long j) {
        if (j == this.f6989b) {
            return this;
        }
        return new g0(this.f6988a, j, this.f6990c, this.f6991d, this.f6992e, this.f6993f, this.f6994g, this.f6995h, this.f6996i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g0.class == obj.getClass()) {
            g0 g0Var = (g0) obj;
            if (this.f6989b == g0Var.f6989b && this.f6990c == g0Var.f6990c && this.f6991d == g0Var.f6991d && this.f6992e == g0Var.f6992e && this.f6993f == g0Var.f6993f && this.f6994g == g0Var.f6994g && this.f6995h == g0Var.f6995h && this.f6996i == g0Var.f6996i && a5.d0.a(this.f6988a, g0Var.f6988a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((this.f6988a.hashCode() + 527) * 31) + ((int) this.f6989b)) * 31) + ((int) this.f6990c)) * 31) + ((int) this.f6991d)) * 31) + ((int) this.f6992e)) * 31) + (this.f6993f ? 1 : 0)) * 31) + (this.f6994g ? 1 : 0)) * 31) + (this.f6995h ? 1 : 0)) * 31) + (this.f6996i ? 1 : 0);
    }
}
