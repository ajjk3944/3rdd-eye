package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class qb4 {
    public final kh4 a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public qb4(kh4 kh4Var, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3) {
        zt0.D(!z3 || z);
        zt0.D(!z2 || z);
        this.a = kh4Var;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = z;
        this.g = z2;
        this.h = z3;
    }

    public final qb4 a(long j) {
        return j == this.b ? this : new qb4(this.a, j, this.c, this.d, this.e, this.f, this.g, this.h);
    }

    public final qb4 b(long j) {
        return j == this.c ? this : new qb4(this.a, this.b, j, this.d, this.e, this.f, this.g, this.h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && qb4.class == obj.getClass()) {
            qb4 qb4Var = (qb4) obj;
            if (this.b == qb4Var.b && this.c == qb4Var.c && this.d == qb4Var.d && this.e == qb4Var.e && this.f == qb4Var.f && this.g == qb4Var.g && this.h == qb4Var.h && Objects.equals(this.a, qb4Var.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((this.a.hashCode() + 527) * 31) + ((int) this.b)) * 31) + ((int) this.c)) * 31) + ((int) this.d)) * 31) + ((int) this.e)) * 29791) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0);
    }
}
