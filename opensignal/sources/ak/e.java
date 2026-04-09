package ak;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final long f505a;

    /* renamed from: b, reason: collision with root package name */
    public final long f506b;

    /* renamed from: c, reason: collision with root package name */
    public final long f507c;

    public e(long j, long j7, long j10) {
        this.f505a = j;
        this.f506b = j7;
        this.f507c = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f505a == eVar.f505a && this.f506b == eVar.f506b && this.f507c == eVar.f507c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f507c) + h0.b.b(Long.hashCode(this.f505a) * 31, 31, this.f506b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CellConfig(nrCellMinNrarfcn=");
        sb2.append(this.f505a);
        sb2.append(", nrCellMaxNrarfcn=");
        sb2.append(this.f506b);
        sb2.append(", freshnessMs=");
        return w.g.h(sb2, this.f507c, ')');
    }
}
