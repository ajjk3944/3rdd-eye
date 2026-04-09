package sm;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final long f22112a;

    /* renamed from: b, reason: collision with root package name */
    public final float f22113b;

    /* renamed from: c, reason: collision with root package name */
    public final float f22114c;

    /* renamed from: d, reason: collision with root package name */
    public final float f22115d;

    /* renamed from: e, reason: collision with root package name */
    public final float f22116e;

    /* renamed from: f, reason: collision with root package name */
    public final float f22117f;

    public c(long j, float f10, float f11, float f12, float f13, float f14) {
        this.f22112a = j;
        this.f22113b = f10;
        this.f22114c = f11;
        this.f22115d = f12;
        this.f22116e = f13;
        this.f22117f = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f22112a == cVar.f22112a && Float.compare(this.f22113b, cVar.f22113b) == 0 && Float.compare(this.f22114c, cVar.f22114c) == 0 && Float.compare(this.f22115d, cVar.f22115d) == 0 && Float.compare(this.f22116e, cVar.f22116e) == 0 && Float.compare(this.f22117f, cVar.f22117f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f22117f) + w.g.a(w.g.a(w.g.a(w.g.a(Long.hashCode(this.f22112a) * 31, this.f22113b, 31), this.f22114c, 31), this.f22115d, 31), this.f22116e, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NetworkAvailability(testsContributed=");
        sb2.append(this.f22112a);
        sb2.append(", noSignalTime=");
        sb2.append(this.f22113b);
        sb2.append(", twoGTime=");
        sb2.append(this.f22114c);
        sb2.append(", threeGTime=");
        sb2.append(this.f22115d);
        sb2.append(", fourGTime=");
        sb2.append(this.f22116e);
        sb2.append(", fiveGTime=");
        return h0.b.q(sb2, this.f22117f, ')');
    }
}
