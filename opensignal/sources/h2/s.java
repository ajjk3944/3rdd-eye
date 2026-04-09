package h2;

/* loaded from: classes.dex */
public final class s implements c {

    /* renamed from: a, reason: collision with root package name */
    public final int f9869a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9870b;

    /* renamed from: c, reason: collision with root package name */
    public final long f9871c;

    /* renamed from: d, reason: collision with root package name */
    public final r2.q f9872d;

    /* renamed from: e, reason: collision with root package name */
    public final u f9873e;

    /* renamed from: f, reason: collision with root package name */
    public final r2.i f9874f;

    /* renamed from: g, reason: collision with root package name */
    public final int f9875g;

    /* renamed from: h, reason: collision with root package name */
    public final int f9876h;

    /* renamed from: i, reason: collision with root package name */
    public final r2.s f9877i;

    public s(int i10, int i11, long j, r2.q qVar, u uVar, r2.i iVar, int i12, int i13, r2.s sVar) {
        this.f9869a = i10;
        this.f9870b = i11;
        this.f9871c = j;
        this.f9872d = qVar;
        this.f9873e = uVar;
        this.f9874f = iVar;
        this.f9875g = i12;
        this.f9876h = i13;
        this.f9877i = sVar;
        if (t2.k.a(j, t2.k.f22394c) || t2.k.c(j) >= 0.0f) {
            return;
        }
        m2.a.b("lineHeight can't be negative (" + t2.k.c(j) + ')');
    }

    public final s a(s sVar) {
        return sVar == null ? this : t.a(this, sVar.f9869a, sVar.f9870b, sVar.f9871c, sVar.f9872d, sVar.f9873e, sVar.f9874f, sVar.f9875g, sVar.f9876h, sVar.f9877i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f9869a == sVar.f9869a && this.f9870b == sVar.f9870b && t2.k.a(this.f9871c, sVar.f9871c) && br.l.a(this.f9872d, sVar.f9872d) && br.l.a(this.f9873e, sVar.f9873e) && br.l.a(this.f9874f, sVar.f9874f) && this.f9875g == sVar.f9875g && this.f9876h == sVar.f9876h && br.l.a(this.f9877i, sVar.f9877i);
    }

    public final int hashCode() {
        int iC = c7.a.C(this.f9870b, Integer.hashCode(this.f9869a) * 31, 31);
        t2.l[] lVarArr = t2.k.f22393b;
        int iB = h0.b.b(iC, 31, this.f9871c);
        r2.q qVar = this.f9872d;
        int iHashCode = (iB + (qVar != null ? qVar.hashCode() : 0)) * 31;
        u uVar = this.f9873e;
        int iHashCode2 = (iHashCode + (uVar != null ? uVar.hashCode() : 0)) * 31;
        r2.i iVar = this.f9874f;
        int iC2 = c7.a.C(this.f9876h, c7.a.C(this.f9875g, (iHashCode2 + (iVar != null ? iVar.hashCode() : 0)) * 31, 31), 31);
        r2.s sVar = this.f9877i;
        return iC2 + (sVar != null ? sVar.hashCode() : 0);
    }

    public final String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) r2.k.a(this.f9869a)) + ", textDirection=" + ((Object) r2.m.a(this.f9870b)) + ", lineHeight=" + ((Object) t2.k.d(this.f9871c)) + ", textIndent=" + this.f9872d + ", platformStyle=" + this.f9873e + ", lineHeightStyle=" + this.f9874f + ", lineBreak=" + ((Object) r2.e.a(this.f9875g)) + ", hyphens=" + ((Object) r2.d.a(this.f9876h)) + ", textMotion=" + this.f9877i + ')';
    }
}
