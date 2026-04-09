package ni;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f17947a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f17948b;

    /* renamed from: c, reason: collision with root package name */
    public final Long f17949c;

    /* renamed from: d, reason: collision with root package name */
    public final Long f17950d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f17951e;

    /* renamed from: f, reason: collision with root package name */
    public final Long f17952f;

    /* renamed from: g, reason: collision with root package name */
    public final Long f17953g;

    /* renamed from: h, reason: collision with root package name */
    public final Long f17954h;

    public j(String str, Long l10, Long l11, Long l12, Long l13, Long l14, Long l15, Long l16) {
        this.f17947a = str;
        this.f17948b = l10;
        this.f17949c = l11;
        this.f17950d = l12;
        this.f17951e = l13;
        this.f17952f = l14;
        this.f17953g = l15;
        this.f17954h = l16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return br.l.a(this.f17947a, jVar.f17947a) && br.l.a(this.f17948b, jVar.f17948b) && br.l.a(this.f17949c, jVar.f17949c) && br.l.a(this.f17950d, jVar.f17950d) && br.l.a(this.f17951e, jVar.f17951e) && br.l.a(this.f17952f, jVar.f17952f) && br.l.a(this.f17953g, jVar.f17953g) && br.l.a(this.f17954h, jVar.f17954h);
    }

    public final int hashCode() {
        String str = this.f17947a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l10 = this.f17948b;
        int iHashCode2 = (iHashCode + (l10 == null ? 0 : l10.hashCode())) * 31;
        Long l11 = this.f17949c;
        int iHashCode3 = (iHashCode2 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.f17950d;
        int iHashCode4 = (iHashCode3 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Long l13 = this.f17951e;
        int iHashCode5 = (iHashCode4 + (l13 == null ? 0 : l13.hashCode())) * 31;
        Long l14 = this.f17952f;
        int iHashCode6 = (iHashCode5 + (l14 == null ? 0 : l14.hashCode())) * 31;
        Long l15 = this.f17953g;
        int iHashCode7 = (iHashCode6 + (l15 == null ? 0 : l15.hashCode())) * 31;
        Long l16 = this.f17954h;
        return iHashCode7 + (l16 != null ? l16.hashCode() : 0);
    }

    public final String toString() {
        return "DeviceConnectionCoreResult(id=" + this.f17947a + ", startTime=" + this.f17948b + ", connectionTxBytes=" + this.f17949c + ", connectionTxBytesWifi=" + this.f17950d + ", connectionTxBytesCell=" + this.f17951e + ", connectionRxBytes=" + this.f17952f + ", connectionRxBytesWifi=" + this.f17953g + ", connectionRxBytesCell=" + this.f17954h + ')';
    }
}
