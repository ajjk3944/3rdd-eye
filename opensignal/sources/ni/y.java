package ni;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final String f18297a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f18298b;

    /* renamed from: c, reason: collision with root package name */
    public final String f18299c;

    public y(String str, String str2, Long l10) {
        this.f18297a = str;
        this.f18298b = l10;
        this.f18299c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return br.l.a(this.f18297a, yVar.f18297a) && br.l.a(this.f18298b, yVar.f18298b) && br.l.a(this.f18299c, yVar.f18299c);
    }

    public final int hashCode() {
        String str = this.f18297a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l10 = this.f18298b;
        int iHashCode2 = (iHashCode + (l10 == null ? 0 : l10.hashCode())) * 31;
        String str2 = this.f18299c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LastPublicIpCoreResult(lastPublicIp=");
        sb2.append(this.f18297a);
        sb2.append(", lastPublicIpTime=");
        sb2.append(this.f18298b);
        sb2.append(", lastPublicIps=");
        return h0.b.r(sb2, this.f18299c, ')');
    }
}
