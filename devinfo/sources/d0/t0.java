package d0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f21842a;

    /* renamed from: b, reason: collision with root package name */
    public final long f21843b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f21844c;

    public t0(long j, long j8, boolean z3) {
        this.f21842a = j;
        this.f21843b = j8;
        this.f21844c = z3;
    }

    public final t0 a(t0 t0Var) {
        return new t0(o1.b.h(this.f21842a, t0Var.f21842a), Math.max(this.f21843b, t0Var.f21843b), this.f21844c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return o1.b.b(this.f21842a, t0Var.f21842a) && this.f21843b == t0Var.f21843b && this.f21844c == t0Var.f21844c;
    }

    public final int hashCode() {
        int iF = o1.b.f(this.f21842a) * 31;
        long j = this.f21843b;
        return ((iF + ((int) (j ^ (j >>> 32)))) * 31) + (this.f21844c ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MouseWheelScrollDelta(value=");
        sb2.append((Object) o1.b.j(this.f21842a));
        sb2.append(", timeMillis=");
        sb2.append(this.f21843b);
        sb2.append(", shouldApplyImmediately=");
        return d.h.x(sb2, this.f21844c, ')');
    }
}
