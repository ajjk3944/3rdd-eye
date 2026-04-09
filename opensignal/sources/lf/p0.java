package lf;

/* loaded from: classes.dex */
public final class p0 extends j2 {

    /* renamed from: a, reason: collision with root package name */
    public final long f15389a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15390b;

    /* renamed from: c, reason: collision with root package name */
    public final d2 f15391c;

    /* renamed from: d, reason: collision with root package name */
    public final e2 f15392d;

    /* renamed from: e, reason: collision with root package name */
    public final f2 f15393e;

    /* renamed from: f, reason: collision with root package name */
    public final i2 f15394f;

    public p0(long j, String str, d2 d2Var, e2 e2Var, f2 f2Var, i2 i2Var) {
        this.f15389a = j;
        this.f15390b = str;
        this.f15391c = d2Var;
        this.f15392d = e2Var;
        this.f15393e = f2Var;
        this.f15394f = i2Var;
    }

    public final o0 a() {
        o0 o0Var = new o0();
        o0Var.f15378a = this.f15389a;
        o0Var.f15379b = this.f15390b;
        o0Var.f15380c = this.f15391c;
        o0Var.f15381d = this.f15392d;
        o0Var.f15382e = this.f15393e;
        o0Var.f15383f = this.f15394f;
        o0Var.f15384g = (byte) 1;
        return o0Var;
    }

    public final boolean equals(Object obj) {
        f2 f2Var;
        i2 i2Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof j2) {
            p0 p0Var = (p0) ((j2) obj);
            i2 i2Var2 = p0Var.f15394f;
            f2 f2Var2 = p0Var.f15393e;
            if (this.f15389a == p0Var.f15389a && this.f15390b.equals(p0Var.f15390b) && this.f15391c.equals(p0Var.f15391c) && this.f15392d.equals(p0Var.f15392d) && ((f2Var = this.f15393e) != null ? f2Var.equals(f2Var2) : f2Var2 == null) && ((i2Var = this.f15394f) != null ? i2Var.equals(i2Var2) : i2Var2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f15389a;
        int iHashCode = (((((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.f15390b.hashCode()) * 1000003) ^ this.f15391c.hashCode()) * 1000003) ^ this.f15392d.hashCode()) * 1000003;
        f2 f2Var = this.f15393e;
        int iHashCode2 = (iHashCode ^ (f2Var == null ? 0 : f2Var.hashCode())) * 1000003;
        i2 i2Var = this.f15394f;
        return iHashCode2 ^ (i2Var != null ? i2Var.hashCode() : 0);
    }

    public final String toString() {
        return "Event{timestamp=" + this.f15389a + ", type=" + this.f15390b + ", app=" + this.f15391c + ", device=" + this.f15392d + ", log=" + this.f15393e + ", rollouts=" + this.f15394f + "}";
    }
}
