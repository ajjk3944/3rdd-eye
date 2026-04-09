package g0;

import br.l;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final h2.f f9165a;

    /* renamed from: b, reason: collision with root package name */
    public h2.f f9166b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f9167c = false;

    /* renamed from: d, reason: collision with root package name */
    public d f9168d = null;

    public g(h2.f fVar, h2.f fVar2) {
        this.f9165a = fVar;
        this.f9166b = fVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return l.a(this.f9165a, gVar.f9165a) && l.a(this.f9166b, gVar.f9166b) && this.f9167c == gVar.f9167c && l.a(this.f9168d, gVar.f9168d);
    }

    public final int hashCode() {
        int iB = w.g.b((this.f9166b.hashCode() + (this.f9165a.hashCode() * 31)) * 31, this.f9167c, 31);
        d dVar = this.f9168d;
        return iB + (dVar == null ? 0 : dVar.hashCode());
    }

    public final String toString() {
        return "TextSubstitutionValue(original=" + ((Object) this.f9165a) + ", substitution=" + ((Object) this.f9166b) + ", isShowingSubstitution=" + this.f9167c + ", layoutCache=" + this.f9168d + ')';
    }
}
