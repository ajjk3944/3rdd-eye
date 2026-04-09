package as;

import java.util.Collection;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final is.h f2236a;

    /* renamed from: b, reason: collision with root package name */
    public final Collection f2237b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2238c;

    public o(is.h hVar, Collection collection) {
        this(hVar, collection, hVar.f12955a == is.g.NOT_NULL);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return br.l.a(this.f2236a, oVar.f2236a) && br.l.a(this.f2237b, oVar.f2237b) && this.f2238c == oVar.f2238c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int iHashCode = (this.f2237b.hashCode() + (this.f2236a.hashCode() * 31)) * 31;
        boolean z10 = this.f2238c;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return iHashCode + i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("JavaDefaultQualifiers(nullabilityQualifier=");
        sb2.append(this.f2236a);
        sb2.append(", qualifierApplicabilityTypes=");
        sb2.append(this.f2237b);
        sb2.append(", definitelyNotNull=");
        return c7.a.r(sb2, this.f2238c, ')');
    }

    public o(is.h hVar, Collection collection, boolean z10) {
        br.l.e(collection, "qualifierApplicabilityTypes");
        this.f2236a = hVar;
        this.f2237b = collection;
        this.f2238c = z10;
    }
}
