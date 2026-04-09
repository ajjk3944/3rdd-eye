package ak;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f524a;

    /* renamed from: b, reason: collision with root package name */
    public final int f525b;

    /* renamed from: c, reason: collision with root package name */
    public final int f526c;

    /* renamed from: d, reason: collision with root package name */
    public final String f527d;

    /* renamed from: e, reason: collision with root package name */
    public final String f528e;

    /* renamed from: f, reason: collision with root package name */
    public final c0 f529f;

    /* renamed from: g, reason: collision with root package name */
    public final w0 f530g;

    public g(String str, int i10, int i11, String str2, String str3, c0 c0Var, w0 w0Var) {
        this.f524a = str;
        this.f525b = i10;
        this.f526c = i11;
        this.f527d = str2;
        this.f528e = str3;
        this.f529f = c0Var;
        this.f530g = w0Var;
    }

    public static g a(g gVar, c0 c0Var, w0 w0Var, int i10) {
        String str = gVar.f524a;
        int i11 = gVar.f525b;
        int i12 = gVar.f526c;
        String str2 = gVar.f527d;
        String str3 = gVar.f528e;
        if ((i10 & 32) != 0) {
            c0Var = gVar.f529f;
        }
        c0 c0Var2 = c0Var;
        if ((i10 & 64) != 0) {
            w0Var = gVar.f530g;
        }
        gVar.getClass();
        br.l.e(c0Var2, "measurementConfig");
        return new g(str, i11, i12, str2, str3, c0Var2, w0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return br.l.a(this.f524a, gVar.f524a) && this.f525b == gVar.f525b && this.f526c == gVar.f526c && br.l.a(this.f527d, gVar.f527d) && br.l.a(this.f528e, gVar.f528e) && br.l.a(this.f529f, gVar.f529f) && br.l.a(this.f530g, gVar.f530g);
    }

    public final int hashCode() {
        return this.f530g.hashCode() + ((this.f529f.hashCode() + c7.a.g(this.f528e, c7.a.g(this.f527d, c7.a.C(this.f526c, c7.a.C(this.f525b, this.f524a.hashCode() * 31, 31), 31), 31), 31)) * 31);
    }

    public final String toString() {
        return "Config(lastModifiedAt=" + this.f524a + ", metaId=" + this.f525b + ", configId=" + this.f526c + ", configHash=" + this.f527d + ", cohortId=" + this.f528e + ", measurementConfig=" + this.f529f + ", taskSchedulerConfig=" + this.f530g + ')';
    }
}
