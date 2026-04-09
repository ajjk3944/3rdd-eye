package l9;

/* loaded from: classes.dex */
public final class l extends a {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f15028a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15029b;

    /* renamed from: c, reason: collision with root package name */
    public final String f15030c;

    /* renamed from: d, reason: collision with root package name */
    public final String f15031d;

    /* renamed from: e, reason: collision with root package name */
    public final String f15032e;

    /* renamed from: f, reason: collision with root package name */
    public final String f15033f;

    /* renamed from: g, reason: collision with root package name */
    public final String f15034g;

    /* renamed from: h, reason: collision with root package name */
    public final String f15035h;

    /* renamed from: i, reason: collision with root package name */
    public final String f15036i;
    public final String j;
    public final String k;

    /* renamed from: l, reason: collision with root package name */
    public final String f15037l;

    public l(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f15028a = num;
        this.f15029b = str;
        this.f15030c = str2;
        this.f15031d = str3;
        this.f15032e = str4;
        this.f15033f = str5;
        this.f15034g = str6;
        this.f15035h = str7;
        this.f15036i = str8;
        this.j = str9;
        this.k = str10;
        this.f15037l = str11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            Integer num = this.f15028a;
            if (num != null ? num.equals(((l) aVar).f15028a) : ((l) aVar).f15028a == null) {
                String str = this.f15029b;
                if (str != null ? str.equals(((l) aVar).f15029b) : ((l) aVar).f15029b == null) {
                    String str2 = this.f15030c;
                    if (str2 != null ? str2.equals(((l) aVar).f15030c) : ((l) aVar).f15030c == null) {
                        String str3 = this.f15031d;
                        if (str3 != null ? str3.equals(((l) aVar).f15031d) : ((l) aVar).f15031d == null) {
                            String str4 = this.f15032e;
                            if (str4 != null ? str4.equals(((l) aVar).f15032e) : ((l) aVar).f15032e == null) {
                                String str5 = this.f15033f;
                                if (str5 != null ? str5.equals(((l) aVar).f15033f) : ((l) aVar).f15033f == null) {
                                    String str6 = this.f15034g;
                                    if (str6 != null ? str6.equals(((l) aVar).f15034g) : ((l) aVar).f15034g == null) {
                                        String str7 = this.f15035h;
                                        if (str7 != null ? str7.equals(((l) aVar).f15035h) : ((l) aVar).f15035h == null) {
                                            String str8 = this.f15036i;
                                            if (str8 != null ? str8.equals(((l) aVar).f15036i) : ((l) aVar).f15036i == null) {
                                                String str9 = this.j;
                                                if (str9 != null ? str9.equals(((l) aVar).j) : ((l) aVar).j == null) {
                                                    String str10 = this.k;
                                                    if (str10 != null ? str10.equals(((l) aVar).k) : ((l) aVar).k == null) {
                                                        String str11 = this.f15037l;
                                                        if (str11 != null ? str11.equals(((l) aVar).f15037l) : ((l) aVar).f15037l == null) {
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
        Integer num = this.f15028a;
        int iHashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.f15029b;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f15030c;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f15031d;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f15032e;
        int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f15033f;
        int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.f15034g;
        int iHashCode7 = (iHashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.f15035h;
        int iHashCode8 = (iHashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.f15036i;
        int iHashCode9 = (iHashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.j;
        int iHashCode10 = (iHashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.k;
        int iHashCode11 = (iHashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        String str11 = this.f15037l;
        return (str11 != null ? str11.hashCode() : 0) ^ iHashCode11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AndroidClientInfo{sdkVersion=");
        sb2.append(this.f15028a);
        sb2.append(", model=");
        sb2.append(this.f15029b);
        sb2.append(", hardware=");
        sb2.append(this.f15030c);
        sb2.append(", device=");
        sb2.append(this.f15031d);
        sb2.append(", product=");
        sb2.append(this.f15032e);
        sb2.append(", osBuild=");
        sb2.append(this.f15033f);
        sb2.append(", manufacturer=");
        sb2.append(this.f15034g);
        sb2.append(", fingerprint=");
        sb2.append(this.f15035h);
        sb2.append(", locale=");
        sb2.append(this.f15036i);
        sb2.append(", country=");
        sb2.append(this.j);
        sb2.append(", mccMnc=");
        sb2.append(this.k);
        sb2.append(", applicationBuild=");
        return w.g.j(sb2, this.f15037l, "}");
    }
}
