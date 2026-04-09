package mv;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f17067a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f17068b;

    public d(int i10, boolean z10, boolean z11) {
        z10 = (i10 & 1) != 0 ? false : z10;
        z11 = (i10 & 2) != 0 ? false : z11;
        this.f17067a = z10;
        this.f17068b = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f17067a == dVar.f17067a && this.f17068b == dVar.f17068b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        boolean z10 = this.f17067a;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = i10 * 31;
        boolean z11 = this.f17068b;
        return (i11 + (z11 ? 1 : z11 ? 1 : 0)) * 31;
    }

    public final String toString() {
        return "Options(isCreatedAtStart=" + this.f17067a + ", override=" + this.f17068b + ", isExtraDefinition=false)";
    }
}
