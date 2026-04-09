package is;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final g f12955a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f12956b;

    public h(g gVar, boolean z10) {
        br.l.e(gVar, "qualifier");
        this.f12955a = gVar;
        this.f12956b = z10;
    }

    public static h a(h hVar, g gVar, boolean z10, int i10) {
        if ((i10 & 1) != 0) {
            gVar = hVar.f12955a;
        }
        if ((i10 & 2) != 0) {
            z10 = hVar.f12956b;
        }
        hVar.getClass();
        br.l.e(gVar, "qualifier");
        return new h(gVar, z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f12955a == hVar.f12955a && this.f12956b == hVar.f12956b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int iHashCode = this.f12955a.hashCode() * 31;
        boolean z10 = this.f12956b;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return iHashCode + i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NullabilityQualifierWithMigrationStatus(qualifier=");
        sb2.append(this.f12955a);
        sb2.append(", isForWarningOnly=");
        return c7.a.r(sb2, this.f12956b, ')');
    }
}
