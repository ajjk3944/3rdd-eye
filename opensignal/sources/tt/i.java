package tt;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f23002a;

    /* renamed from: b, reason: collision with root package name */
    public final hr.d f23003b;

    public i(String str, hr.d dVar) {
        this.f23002a = str;
        this.f23003b = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return br.l.a(this.f23002a, iVar.f23002a) && br.l.a(this.f23003b, iVar.f23003b);
    }

    public final int hashCode() {
        return this.f23003b.hashCode() + (this.f23002a.hashCode() * 31);
    }

    public final String toString() {
        return "MatchGroup(value=" + this.f23002a + ", range=" + this.f23003b + ')';
    }
}
