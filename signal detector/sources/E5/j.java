package E5;

import z5.AbstractC3046w;

/* loaded from: classes3.dex */
public final /* synthetic */ class j extends q5.b implements p5.a, w5.a {

    /* renamed from: g, reason: collision with root package name */
    public final boolean f1396g;

    public j(k kVar) {
        super(kVar, AbstractC3046w.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", true);
        this.f1396g = false;
    }

    @Override // p5.a
    public final Object b() {
        return this.f23283b.getClass().getSimpleName();
    }

    public final w5.a d() {
        if (this.f1396g) {
            return this;
        }
        w5.a aVar = this.f23282a;
        if (aVar != null) {
            return aVar;
        }
        q5.p.f23300a.getClass();
        this.f23282a = this;
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            return a().equals(jVar.a()) && this.f23285d.equals(jVar.f23285d) && this.f23286e.equals(jVar.f23286e) && this.f23283b.equals(jVar.f23283b);
        }
        if (obj instanceof j) {
            return obj.equals(d());
        }
        return false;
    }

    public final int hashCode() {
        return this.f23286e.hashCode() + ((this.f23285d.hashCode() + (a().hashCode() * 31)) * 31);
    }

    public final String toString() {
        w5.a aVarD = d();
        return aVarD != this ? aVarD.toString() : A.f.p(new StringBuilder("property "), this.f23285d, " (Kotlin reflection is not available)");
    }
}
