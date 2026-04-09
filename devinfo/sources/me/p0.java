package me;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class p0 extends j2 {

    /* renamed from: a, reason: collision with root package name */
    public final long f29271a;

    /* renamed from: b, reason: collision with root package name */
    public final String f29272b;

    /* renamed from: c, reason: collision with root package name */
    public final d2 f29273c;

    /* renamed from: d, reason: collision with root package name */
    public final e2 f29274d;

    /* renamed from: e, reason: collision with root package name */
    public final f2 f29275e;

    /* renamed from: f, reason: collision with root package name */
    public final i2 f29276f;

    public p0(long j, String str, d2 d2Var, e2 e2Var, f2 f2Var, i2 i2Var) {
        this.f29271a = j;
        this.f29272b = str;
        this.f29273c = d2Var;
        this.f29274d = e2Var;
        this.f29275e = f2Var;
        this.f29276f = i2Var;
    }

    public final o0 a() {
        o0 o0Var = new o0();
        o0Var.f29261a = this.f29271a;
        o0Var.f29262b = this.f29272b;
        o0Var.f29263c = this.f29273c;
        o0Var.f29264d = this.f29274d;
        o0Var.f29265e = this.f29275e;
        o0Var.f29266f = this.f29276f;
        o0Var.g = (byte) 1;
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
            i2 i2Var2 = p0Var.f29276f;
            f2 f2Var2 = p0Var.f29275e;
            if (this.f29271a == p0Var.f29271a && this.f29272b.equals(p0Var.f29272b) && this.f29273c.equals(p0Var.f29273c) && this.f29274d.equals(p0Var.f29274d) && ((f2Var = this.f29275e) != null ? f2Var.equals(f2Var2) : f2Var2 == null) && ((i2Var = this.f29276f) != null ? i2Var.equals(i2Var2) : i2Var2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f29271a;
        int iHashCode = (((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f29272b.hashCode()) * 1000003) ^ this.f29273c.hashCode()) * 1000003) ^ this.f29274d.hashCode()) * 1000003;
        f2 f2Var = this.f29275e;
        int iHashCode2 = (iHashCode ^ (f2Var == null ? 0 : f2Var.hashCode())) * 1000003;
        i2 i2Var = this.f29276f;
        return iHashCode2 ^ (i2Var != null ? i2Var.hashCode() : 0);
    }

    public final String toString() {
        return "Event{timestamp=" + this.f29271a + ", type=" + this.f29272b + ", app=" + this.f29273c + ", device=" + this.f29274d + ", log=" + this.f29275e + ", rollouts=" + this.f29276f + "}";
    }
}
