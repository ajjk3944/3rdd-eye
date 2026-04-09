package me;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e1 extends h2 {

    /* renamed from: a, reason: collision with root package name */
    public final g2 f29120a;

    /* renamed from: b, reason: collision with root package name */
    public final String f29121b;

    /* renamed from: c, reason: collision with root package name */
    public final String f29122c;

    /* renamed from: d, reason: collision with root package name */
    public final long f29123d;

    public e1(f1 f1Var, String str, String str2, long j) {
        this.f29120a = f1Var;
        this.f29121b = str;
        this.f29122c = str2;
        this.f29123d = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h2) {
            e1 e1Var = (e1) ((h2) obj);
            if (this.f29120a.equals(e1Var.f29120a) && this.f29121b.equals(e1Var.f29121b) && this.f29122c.equals(e1Var.f29122c) && this.f29123d == e1Var.f29123d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((this.f29120a.hashCode() ^ 1000003) * 1000003) ^ this.f29121b.hashCode()) * 1000003) ^ this.f29122c.hashCode()) * 1000003;
        long j = this.f29123d;
        return iHashCode ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutAssignment{rolloutVariant=");
        sb2.append(this.f29120a);
        sb2.append(", parameterKey=");
        sb2.append(this.f29121b);
        sb2.append(", parameterValue=");
        sb2.append(this.f29122c);
        sb2.append(", templateVersion=");
        return je.u.s(this.f29123d, "}", sb2);
    }
}
