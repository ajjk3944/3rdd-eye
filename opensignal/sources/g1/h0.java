package g1;

/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: d, reason: collision with root package name */
    public static final h0 f9234d = new h0(f0.c(4278190080L), 0, 0.0f);

    /* renamed from: a, reason: collision with root package name */
    public final long f9235a;

    /* renamed from: b, reason: collision with root package name */
    public final long f9236b;

    /* renamed from: c, reason: collision with root package name */
    public final float f9237c;

    public h0(long j, long j7, float f10) {
        this.f9235a = j;
        this.f9236b = j7;
        this.f9237c = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return r.c(this.f9235a, h0Var.f9235a) && f1.b.a(this.f9236b, h0Var.f9236b) && this.f9237c == h0Var.f9237c;
    }

    public final int hashCode() {
        int i10 = r.f9270h;
        return Float.hashCode(this.f9237c) + h0.b.b(Long.hashCode(this.f9235a) * 31, 31, this.f9236b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Shadow(color=");
        h0.b.A(this.f9235a, ", offset=", sb2);
        sb2.append((Object) f1.b.f(this.f9236b));
        sb2.append(", blurRadius=");
        return h0.b.q(sb2, this.f9237c, ')');
    }
}
