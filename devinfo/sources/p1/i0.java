package p1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: d, reason: collision with root package name */
    public static final i0 f30982d = new i0(z.c(4278190080L), 0, 0.0f);

    /* renamed from: a, reason: collision with root package name */
    public final long f30983a;

    /* renamed from: b, reason: collision with root package name */
    public final long f30984b;

    /* renamed from: c, reason: collision with root package name */
    public final float f30985c;

    public i0(long j, long j8, float f10) {
        this.f30983a = j;
        this.f30984b = j8;
        this.f30985c = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return s.c(this.f30983a, i0Var.f30983a) && o1.b.b(this.f30984b, i0Var.f30984b) && this.f30985c == i0Var.f30985c;
    }

    public final int hashCode() {
        int i4 = s.f31019i;
        return Float.floatToIntBits(this.f30985c) + ((o1.b.f(this.f30984b) + (yj.q.a(this.f30983a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Shadow(color=");
        a0.g.w(this.f30983a, ", offset=", sb2);
        sb2.append((Object) o1.b.j(this.f30984b));
        sb2.append(", blurRadius=");
        return r5.c.k(sb2, this.f30985c, ')');
    }
}
