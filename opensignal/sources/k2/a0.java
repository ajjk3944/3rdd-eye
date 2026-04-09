package k2;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final h f13969a;

    /* renamed from: b, reason: collision with root package name */
    public final r f13970b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13971c;

    /* renamed from: d, reason: collision with root package name */
    public final int f13972d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f13973e;

    public a0(h hVar, r rVar, int i10, int i11, Object obj) {
        this.f13969a = hVar;
        this.f13970b = rVar;
        this.f13971c = i10;
        this.f13972d = i11;
        this.f13973e = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return br.l.a(this.f13969a, a0Var.f13969a) && br.l.a(this.f13970b, a0Var.f13970b) && this.f13971c == a0Var.f13971c && this.f13972d == a0Var.f13972d && br.l.a(this.f13973e, a0Var.f13973e);
    }

    public final int hashCode() {
        h hVar = this.f13969a;
        int iC = c7.a.C(this.f13972d, c7.a.C(this.f13971c, (((hVar == null ? 0 : hVar.hashCode()) * 31) + this.f13970b.f14004a) * 31, 31), 31);
        Object obj = this.f13973e;
        return iC + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TypefaceRequest(fontFamily=");
        sb2.append(this.f13969a);
        sb2.append(", fontWeight=");
        sb2.append(this.f13970b);
        sb2.append(", fontStyle=");
        String str = "Invalid";
        int i10 = this.f13971c;
        sb2.append((Object) (i10 == 0 ? "Normal" : i10 == 1 ? "Italic" : "Invalid"));
        sb2.append(", fontSynthesis=");
        int i11 = this.f13972d;
        if (i11 == 0) {
            str = "None";
        } else if (i11 == 1) {
            str = "Weight";
        } else if (i11 == 2) {
            str = "Style";
        } else if (i11 == 65535) {
            str = "All";
        }
        sb2.append((Object) str);
        sb2.append(", resourceLoaderCacheKey=");
        sb2.append(this.f13973e);
        sb2.append(')');
        return sb2.toString();
    }
}
