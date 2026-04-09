package me;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class k1 {

    /* renamed from: a, reason: collision with root package name */
    public final l1 f29207a;

    /* renamed from: b, reason: collision with root package name */
    public final n1 f29208b;

    /* renamed from: c, reason: collision with root package name */
    public final m1 f29209c;

    public k1(l1 l1Var, n1 n1Var, m1 m1Var) {
        this.f29207a = l1Var;
        this.f29208b = n1Var;
        this.f29209c = m1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k1) {
            k1 k1Var = (k1) obj;
            if (this.f29207a.equals(k1Var.f29207a) && this.f29208b.equals(k1Var.f29208b) && this.f29209c.equals(k1Var.f29209c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f29207a.hashCode() ^ 1000003) * 1000003) ^ this.f29208b.hashCode()) * 1000003) ^ this.f29209c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.f29207a + ", osData=" + this.f29208b + ", deviceData=" + this.f29209c + "}";
    }
}
