package l2;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public String f23064a;

    /* renamed from: b, reason: collision with root package name */
    public Long f23065b;

    public d(String str, boolean z10) {
        this(str, z10 ? 1L : 0L);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (!this.f23064a.equals(dVar.f23064a)) {
            return false;
        }
        Long l10 = this.f23065b;
        Long l11 = dVar.f23065b;
        return l10 != null ? l10.equals(l11) : l11 == null;
    }

    public int hashCode() {
        int iHashCode = this.f23064a.hashCode() * 31;
        Long l10 = this.f23065b;
        return iHashCode + (l10 != null ? l10.hashCode() : 0);
    }

    public d(String str, long j10) {
        this.f23064a = str;
        this.f23065b = Long.valueOf(j10);
    }
}
