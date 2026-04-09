package j$.util;

/* loaded from: classes2.dex */
public final class d0 {

    /* renamed from: c, reason: collision with root package name */
    public static final d0 f26364c = new d0();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f26365a;

    /* renamed from: b, reason: collision with root package name */
    public final long f26366b;

    public d0() {
        this.f26365a = false;
        this.f26366b = 0L;
    }

    public d0(long j) {
        this.f26365a = true;
        this.f26366b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        boolean z3 = d0Var.f26365a;
        boolean z10 = this.f26365a;
        return (z10 && z3) ? this.f26366b == d0Var.f26366b : z10 == z3;
    }

    public final int hashCode() {
        if (!this.f26365a) {
            return 0;
        }
        long j = this.f26366b;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        if (this.f26365a) {
            return "OptionalLong[" + this.f26366b + "]";
        }
        return "OptionalLong.empty";
    }
}
