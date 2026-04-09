package com.google.android.exoplayer2;

/* loaded from: classes.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public final ya.v f4421a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4422b;

    /* renamed from: c, reason: collision with root package name */
    public final long f4423c;

    /* renamed from: d, reason: collision with root package name */
    public final long f4424d;

    /* renamed from: e, reason: collision with root package name */
    public final long f4425e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f4426f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f4427g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f4428h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f4429i;

    public r0(ya.v vVar, long j, long j7, long j10, long j11, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14 = true;
        qb.b.g(!z13 || z11);
        qb.b.g(!z12 || z11);
        if (z10 && (z11 || z12 || z13)) {
            z14 = false;
        }
        qb.b.g(z14);
        this.f4421a = vVar;
        this.f4422b = j;
        this.f4423c = j7;
        this.f4424d = j10;
        this.f4425e = j11;
        this.f4426f = z10;
        this.f4427g = z11;
        this.f4428h = z12;
        this.f4429i = z13;
    }

    public final r0 a(long j) {
        if (j == this.f4423c) {
            return this;
        }
        return new r0(this.f4421a, this.f4422b, j, this.f4424d, this.f4425e, this.f4426f, this.f4427g, this.f4428h, this.f4429i);
    }

    public final r0 b(long j) {
        if (j == this.f4422b) {
            return this;
        }
        return new r0(this.f4421a, j, this.f4423c, this.f4424d, this.f4425e, this.f4426f, this.f4427g, this.f4428h, this.f4429i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r0.class == obj.getClass()) {
            r0 r0Var = (r0) obj;
            if (this.f4422b == r0Var.f4422b && this.f4423c == r0Var.f4423c && this.f4424d == r0Var.f4424d && this.f4425e == r0Var.f4425e && this.f4426f == r0Var.f4426f && this.f4427g == r0Var.f4427g && this.f4428h == r0Var.f4428h && this.f4429i == r0Var.f4429i && qb.v.a(this.f4421a, r0Var.f4421a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((this.f4421a.hashCode() + 527) * 31) + ((int) this.f4422b)) * 31) + ((int) this.f4423c)) * 31) + ((int) this.f4424d)) * 31) + ((int) this.f4425e)) * 31) + (this.f4426f ? 1 : 0)) * 31) + (this.f4427g ? 1 : 0)) * 31) + (this.f4428h ? 1 : 0)) * 31) + (this.f4429i ? 1 : 0);
    }
}
