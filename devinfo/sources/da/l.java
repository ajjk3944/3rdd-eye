package da;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class l extends a {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f22138a;

    /* renamed from: b, reason: collision with root package name */
    public final String f22139b;

    /* renamed from: c, reason: collision with root package name */
    public final String f22140c;

    /* renamed from: d, reason: collision with root package name */
    public final String f22141d;

    /* renamed from: e, reason: collision with root package name */
    public final String f22142e;

    /* renamed from: f, reason: collision with root package name */
    public final String f22143f;
    public final String g;

    /* renamed from: h, reason: collision with root package name */
    public final String f22144h;

    /* renamed from: i, reason: collision with root package name */
    public final String f22145i;
    public final String j;

    /* renamed from: k, reason: collision with root package name */
    public final String f22146k;

    /* renamed from: l, reason: collision with root package name */
    public final String f22147l;

    public l(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f22138a = num;
        this.f22139b = str;
        this.f22140c = str2;
        this.f22141d = str3;
        this.f22142e = str4;
        this.f22143f = str5;
        this.g = str6;
        this.f22144h = str7;
        this.f22145i = str8;
        this.j = str9;
        this.f22146k = str10;
        this.f22147l = str11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            Integer num = this.f22138a;
            if (num != null ? num.equals(((l) aVar).f22138a) : ((l) aVar).f22138a == null) {
                String str = this.f22139b;
                if (str != null ? str.equals(((l) aVar).f22139b) : ((l) aVar).f22139b == null) {
                    String str2 = this.f22140c;
                    if (str2 != null ? str2.equals(((l) aVar).f22140c) : ((l) aVar).f22140c == null) {
                        String str3 = this.f22141d;
                        if (str3 != null ? str3.equals(((l) aVar).f22141d) : ((l) aVar).f22141d == null) {
                            String str4 = this.f22142e;
                            if (str4 != null ? str4.equals(((l) aVar).f22142e) : ((l) aVar).f22142e == null) {
                                String str5 = this.f22143f;
                                if (str5 != null ? str5.equals(((l) aVar).f22143f) : ((l) aVar).f22143f == null) {
                                    String str6 = this.g;
                                    if (str6 != null ? str6.equals(((l) aVar).g) : ((l) aVar).g == null) {
                                        String str7 = this.f22144h;
                                        if (str7 != null ? str7.equals(((l) aVar).f22144h) : ((l) aVar).f22144h == null) {
                                            String str8 = this.f22145i;
                                            if (str8 != null ? str8.equals(((l) aVar).f22145i) : ((l) aVar).f22145i == null) {
                                                String str9 = this.j;
                                                if (str9 != null ? str9.equals(((l) aVar).j) : ((l) aVar).j == null) {
                                                    String str10 = this.f22146k;
                                                    if (str10 != null ? str10.equals(((l) aVar).f22146k) : ((l) aVar).f22146k == null) {
                                                        String str11 = this.f22147l;
                                                        if (str11 != null ? str11.equals(((l) aVar).f22147l) : ((l) aVar).f22147l == null) {
                                                            return true;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.f22138a;
        int iHashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.f22139b;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f22140c;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f22141d;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f22142e;
        int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f22143f;
        int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.g;
        int iHashCode7 = (iHashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.f22144h;
        int iHashCode8 = (iHashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.f22145i;
        int iHashCode9 = (iHashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.j;
        int iHashCode10 = (iHashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.f22146k;
        int iHashCode11 = (iHashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        String str11 = this.f22147l;
        return (str11 != null ? str11.hashCode() : 0) ^ iHashCode11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AndroidClientInfo{sdkVersion=");
        sb2.append(this.f22138a);
        sb2.append(", model=");
        sb2.append(this.f22139b);
        sb2.append(", hardware=");
        sb2.append(this.f22140c);
        sb2.append(", device=");
        sb2.append(this.f22141d);
        sb2.append(", product=");
        sb2.append(this.f22142e);
        sb2.append(", osBuild=");
        sb2.append(this.f22143f);
        sb2.append(", manufacturer=");
        sb2.append(this.g);
        sb2.append(", fingerprint=");
        sb2.append(this.f22144h);
        sb2.append(", locale=");
        sb2.append(this.f22145i);
        sb2.append(", country=");
        sb2.append(this.j);
        sb2.append(", mccMnc=");
        sb2.append(this.f22146k);
        sb2.append(", applicationBuild=");
        return d.h.w(sb2, this.f22147l, "}");
    }
}
