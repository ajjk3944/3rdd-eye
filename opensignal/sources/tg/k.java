package tg;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final j f22810a;

    /* renamed from: b, reason: collision with root package name */
    public final j f22811b;

    /* renamed from: c, reason: collision with root package name */
    public final double f22812c;

    public k(j jVar, j jVar2, double d6) {
        br.l.e(jVar, "performance");
        br.l.e(jVar2, "crashlytics");
        this.f22810a = jVar;
        this.f22811b = jVar2;
        this.f22812c = d6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f22810a == kVar.f22810a && this.f22811b == kVar.f22811b && Double.compare(this.f22812c, kVar.f22812c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f22812c) + ((this.f22811b.hashCode() + (this.f22810a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "DataCollectionStatus(performance=" + this.f22810a + ", crashlytics=" + this.f22811b + ", sessionSamplingRate=" + this.f22812c + ')';
    }
}
