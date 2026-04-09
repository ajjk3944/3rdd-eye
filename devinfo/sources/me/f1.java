package me;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class f1 extends g2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f29129a;

    /* renamed from: b, reason: collision with root package name */
    public final String f29130b;

    public f1(String str, String str2) {
        this.f29129a = str;
        this.f29130b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g2) {
            f1 f1Var = (f1) ((g2) obj);
            if (this.f29129a.equals(f1Var.f29129a) && this.f29130b.equals(f1Var.f29130b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f29129a.hashCode() ^ 1000003) * 1000003) ^ this.f29130b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutVariant{rolloutId=");
        sb2.append(this.f29129a);
        sb2.append(", variantId=");
        return d.h.w(sb2, this.f29130b, "}");
    }
}
