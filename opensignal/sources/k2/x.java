package k2;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final int f14007a;

    /* renamed from: b, reason: collision with root package name */
    public final r f14008b;

    /* renamed from: c, reason: collision with root package name */
    public final q f14009c;

    public x(int i10, r rVar, q qVar) {
        this.f14007a = i10;
        this.f14008b = rVar;
        this.f14009c = qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f14007a == xVar.f14007a && br.l.a(this.f14008b, xVar.f14008b) && this.f14009c.equals(xVar.f14009c);
    }

    public final int hashCode() {
        return this.f14009c.f13998a.hashCode() + c7.a.C(0, c7.a.C(0, ((this.f14007a * 31) + this.f14008b.f14004a) * 31, 31), 31);
    }

    public final String toString() {
        return "ResourceFont(resId=" + this.f14007a + ", weight=" + this.f14008b + ", style=" + ((Object) "Normal") + ", loadingStrategy=Blocking)";
    }
}
