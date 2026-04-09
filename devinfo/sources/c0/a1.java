package c0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f2364a;

    /* renamed from: b, reason: collision with root package name */
    public final g0.a0 f2365b;

    public a1() {
        long jC = p1.z.c(4284900966L);
        float f10 = 0;
        g0.a0 a0Var = new g0.a0(f10, f10, f10, f10);
        this.f2364a = jC;
        this.f2365b = a0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!a1.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        nk.k.c(obj, "null cannot be cast to non-null type androidx.compose.foundation.OverscrollConfiguration");
        a1 a1Var = (a1) obj;
        return p1.s.c(this.f2364a, a1Var.f2364a) && nk.k.a(this.f2365b, a1Var.f2365b);
    }

    public final int hashCode() {
        int i4 = p1.s.f31019i;
        return this.f2365b.hashCode() + (yj.q.a(this.f2364a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OverscrollConfiguration(glowColor=");
        a0.g.w(this.f2364a, ", drawPadding=", sb2);
        sb2.append(this.f2365b);
        sb2.append(')');
        return sb2.toString();
    }
}
