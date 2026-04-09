package s2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class p implements b {

    /* renamed from: a, reason: collision with root package name */
    public final int f33411a;

    /* renamed from: b, reason: collision with root package name */
    public final int f33412b;

    /* renamed from: c, reason: collision with root package name */
    public final long f33413c;

    /* renamed from: d, reason: collision with root package name */
    public final c3.q f33414d;

    /* renamed from: e, reason: collision with root package name */
    public final r f33415e;

    /* renamed from: f, reason: collision with root package name */
    public final c3.i f33416f;
    public final int g;

    /* renamed from: h, reason: collision with root package name */
    public final int f33417h;

    /* renamed from: i, reason: collision with root package name */
    public final c3.s f33418i;

    public p(int i4, int i10, long j, c3.q qVar, r rVar, c3.i iVar, int i11, int i12, c3.s sVar) {
        this.f33411a = i4;
        this.f33412b = i10;
        this.f33413c = j;
        this.f33414d = qVar;
        this.f33415e = rVar;
        this.f33416f = iVar;
        this.g = i11;
        this.f33417h = i12;
        this.f33418i = sVar;
        if (d3.n.a(j, d3.n.f21971c) || d3.n.c(j) >= 0.0f) {
            return;
        }
        x2.a.b("lineHeight can't be negative (" + d3.n.c(j) + ')');
    }

    public final p a(p pVar) {
        return pVar == null ? this : q.a(this, pVar.f33411a, pVar.f33412b, pVar.f33413c, pVar.f33414d, pVar.f33415e, pVar.f33416f, pVar.g, pVar.f33417h, pVar.f33418i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f33411a == pVar.f33411a && this.f33412b == pVar.f33412b && d3.n.a(this.f33413c, pVar.f33413c) && nk.k.a(this.f33414d, pVar.f33414d) && nk.k.a(this.f33415e, pVar.f33415e) && nk.k.a(this.f33416f, pVar.f33416f) && this.g == pVar.g && this.f33417h == pVar.f33417h && nk.k.a(this.f33418i, pVar.f33418i);
    }

    public final int hashCode() {
        int iD = (d3.n.d(this.f33413c) + (((this.f33411a * 31) + this.f33412b) * 31)) * 31;
        c3.q qVar = this.f33414d;
        int iHashCode = (iD + (qVar != null ? qVar.hashCode() : 0)) * 31;
        r rVar = this.f33415e;
        int iHashCode2 = (iHashCode + (rVar != null ? rVar.hashCode() : 0)) * 31;
        c3.i iVar = this.f33416f;
        int iHashCode3 = (((((iHashCode2 + (iVar != null ? iVar.hashCode() : 0)) * 31) + this.g) * 31) + this.f33417h) * 31;
        c3.s sVar = this.f33418i;
        return iHashCode3 + (sVar != null ? sVar.hashCode() : 0);
    }

    public final String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) c3.k.a(this.f33411a)) + ", textDirection=" + ((Object) c3.m.a(this.f33412b)) + ", lineHeight=" + ((Object) d3.n.e(this.f33413c)) + ", textIndent=" + this.f33414d + ", platformStyle=" + this.f33415e + ", lineHeightStyle=" + this.f33416f + ", lineBreak=" + ((Object) c3.e.a(this.g)) + ", hyphens=" + ((Object) c3.d.a(this.f33417h)) + ", textMotion=" + this.f33418i + ')';
    }
}
