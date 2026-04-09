package ni;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f17633a;

    /* renamed from: b, reason: collision with root package name */
    public final String f17634b;

    /* renamed from: c, reason: collision with root package name */
    public final String f17635c;

    /* renamed from: d, reason: collision with root package name */
    public final Float f17636d;

    /* renamed from: e, reason: collision with root package name */
    public final Float f17637e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f17638f;

    /* renamed from: g, reason: collision with root package name */
    public final Integer f17639g;

    /* renamed from: h, reason: collision with root package name */
    public final Integer f17640h;

    /* renamed from: i, reason: collision with root package name */
    public final String f17641i;
    public final String j;
    public final Float k;

    /* renamed from: l, reason: collision with root package name */
    public final String f17642l;

    public a0(String str, String str2, String str3, Float f10, Float f11, Integer num, Integer num2, Integer num3, String str4, String str5, Float f12, String str6) {
        this.f17633a = str;
        this.f17634b = str2;
        this.f17635c = str3;
        this.f17636d = f10;
        this.f17637e = f11;
        this.f17638f = num;
        this.f17639g = num2;
        this.f17640h = num3;
        this.f17641i = str4;
        this.j = str5;
        this.k = f12;
        this.f17642l = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return br.l.a(this.f17633a, a0Var.f17633a) && br.l.a(this.f17634b, a0Var.f17634b) && br.l.a(this.f17635c, a0Var.f17635c) && br.l.a(this.f17636d, a0Var.f17636d) && br.l.a(this.f17637e, a0Var.f17637e) && br.l.a(this.f17638f, a0Var.f17638f) && br.l.a(this.f17639g, a0Var.f17639g) && br.l.a(this.f17640h, a0Var.f17640h) && br.l.a(this.f17641i, a0Var.f17641i) && br.l.a(this.j, a0Var.j) && br.l.a(this.k, a0Var.k) && br.l.a(this.f17642l, a0Var.f17642l);
    }

    public final int hashCode() {
        String str = this.f17633a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f17634b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f17635c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Float f10 = this.f17636d;
        int iHashCode4 = (iHashCode3 + (f10 == null ? 0 : f10.hashCode())) * 31;
        Float f11 = this.f17637e;
        int iHashCode5 = (iHashCode4 + (f11 == null ? 0 : f11.hashCode())) * 31;
        Integer num = this.f17638f;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f17639g;
        int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f17640h;
        int iHashCode8 = (iHashCode7 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str4 = this.f17641i;
        int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.j;
        int iHashCode10 = (iHashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Float f12 = this.k;
        int iHashCode11 = (iHashCode10 + (f12 == null ? 0 : f12.hashCode())) * 31;
        String str6 = this.f17642l;
        return iHashCode11 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LatencyResultItem(endpointName=");
        sb2.append(this.f17633a);
        sb2.append(", endpointUrl=");
        sb2.append(this.f17634b);
        sb2.append(", hostname=");
        sb2.append(this.f17635c);
        sb2.append(", mean=");
        sb2.append(this.f17636d);
        sb2.append(", median=");
        sb2.append(this.f17637e);
        sb2.append(", min=");
        sb2.append(this.f17638f);
        sb2.append(", max=");
        sb2.append(this.f17639g);
        sb2.append(", nr=");
        sb2.append(this.f17640h);
        sb2.append(", full=");
        sb2.append(this.f17641i);
        sb2.append(", ip=");
        sb2.append(this.j);
        sb2.append(", success=");
        sb2.append(this.k);
        sb2.append(", results=");
        return h0.b.r(sb2, this.f17642l, ')');
    }
}
