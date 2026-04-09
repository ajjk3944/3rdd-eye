package com.google.android.exoplayer2;

/* loaded from: classes.dex */
public final class u1 {

    /* renamed from: a, reason: collision with root package name */
    public Object f4594a;

    /* renamed from: b, reason: collision with root package name */
    public Object f4595b;

    /* renamed from: c, reason: collision with root package name */
    public int f4596c;

    /* renamed from: d, reason: collision with root package name */
    public long f4597d;

    /* renamed from: e, reason: collision with root package name */
    public long f4598e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4599f;

    /* renamed from: g, reason: collision with root package name */
    public za.b f4600g = za.b.f26804c;

    public final long a(int i10, int i11) {
        za.a aVarA = this.f4600g.a(i10);
        if (aVarA.f26800a != -1) {
            return aVarA.f26803d[i11];
        }
        return -9223372036854775807L;
    }

    public final int b(long j) {
        za.a aVarA;
        int i10;
        za.b bVar = this.f4600g;
        long j7 = this.f4597d;
        int i11 = bVar.f26806a;
        if (j != Long.MIN_VALUE && (j7 == -9223372036854775807L || j < j7)) {
            int i12 = 0;
            while (i12 < i11) {
                bVar.a(i12).getClass();
                bVar.a(i12).getClass();
                if (0 > j && ((i10 = (aVarA = bVar.a(i12)).f26800a) == -1 || aVarA.a(-1) < i10)) {
                    break;
                }
                i12++;
            }
            if (i12 < i11) {
                return i12;
            }
        }
        return -1;
    }

    public final long c(int i10) {
        this.f4600g.a(i10).getClass();
        return 0L;
    }

    public final int d(int i10) {
        return this.f4600g.a(i10).a(-1);
    }

    public final boolean e(int i10) {
        this.f4600g.a(i10).getClass();
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !u1.class.equals(obj.getClass())) {
            return false;
        }
        u1 u1Var = (u1) obj;
        return qb.v.a(this.f4594a, u1Var.f4594a) && qb.v.a(this.f4595b, u1Var.f4595b) && this.f4596c == u1Var.f4596c && this.f4597d == u1Var.f4597d && this.f4598e == u1Var.f4598e && this.f4599f == u1Var.f4599f && qb.v.a(this.f4600g, u1Var.f4600g);
    }

    public final int hashCode() {
        Object obj = this.f4594a;
        int iHashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.f4595b;
        int iHashCode2 = (((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f4596c) * 31;
        long j = this.f4597d;
        int i10 = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
        long j7 = this.f4598e;
        return this.f4600g.hashCode() + ((((i10 + ((int) (j7 ^ (j7 >>> 32)))) * 31) + (this.f4599f ? 1 : 0)) * 31);
    }
}
