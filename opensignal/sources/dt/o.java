package dt;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final Object f7515a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f7516b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f7517c;

    /* renamed from: d, reason: collision with root package name */
    public final ps.f f7518d;

    /* renamed from: e, reason: collision with root package name */
    public final String f7519e;

    /* renamed from: f, reason: collision with root package name */
    public final qs.b f7520f;

    public o(Object obj, Object obj2, ps.f fVar, ps.f fVar2, String str, qs.b bVar) {
        br.l.e(str, "filePath");
        this.f7515a = obj;
        this.f7516b = obj2;
        this.f7517c = fVar;
        this.f7518d = fVar2;
        this.f7519e = str;
        this.f7520f = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f7515a.equals(oVar.f7515a) && br.l.a(this.f7516b, oVar.f7516b) && br.l.a(this.f7517c, oVar.f7517c) && this.f7518d.equals(oVar.f7518d) && br.l.a(this.f7519e, oVar.f7519e) && this.f7520f.equals(oVar.f7520f);
    }

    public final int hashCode() {
        int iHashCode = this.f7515a.hashCode() * 31;
        Object obj = this.f7516b;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.f7517c;
        return this.f7520f.hashCode() + c7.a.g(this.f7519e, (this.f7518d.hashCode() + ((iHashCode2 + (obj2 != null ? obj2.hashCode() : 0)) * 31)) * 31, 31);
    }

    public final String toString() {
        return "IncompatibleVersionErrorData(actualVersion=" + this.f7515a + ", compilerVersion=" + this.f7516b + ", languageVersion=" + this.f7517c + ", expectedVersion=" + this.f7518d + ", filePath=" + this.f7519e + ", classId=" + this.f7520f + ')';
    }
}
