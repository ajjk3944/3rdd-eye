package x3;

/* compiled from: AutoValue_AndroidClientInfo.java */
/* loaded from: classes.dex */
public final class l extends AbstractC5759a {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f47713a;

    /* renamed from: b, reason: collision with root package name */
    public final String f47714b;

    /* renamed from: c, reason: collision with root package name */
    public final String f47715c;

    /* renamed from: d, reason: collision with root package name */
    public final String f47716d;

    /* renamed from: e, reason: collision with root package name */
    public final String f47717e;

    /* renamed from: f, reason: collision with root package name */
    public final String f47718f;

    /* renamed from: g, reason: collision with root package name */
    public final String f47719g;

    /* renamed from: h, reason: collision with root package name */
    public final String f47720h;
    public final String i;

    /* renamed from: j, reason: collision with root package name */
    public final String f47721j;

    /* renamed from: k, reason: collision with root package name */
    public final String f47722k;

    /* renamed from: l, reason: collision with root package name */
    public final String f47723l;

    public l(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f47713a = num;
        this.f47714b = str;
        this.f47715c = str2;
        this.f47716d = str3;
        this.f47717e = str4;
        this.f47718f = str5;
        this.f47719g = str6;
        this.f47720h = str7;
        this.i = str8;
        this.f47721j = str9;
        this.f47722k = str10;
        this.f47723l = str11;
    }

    @Override // x3.AbstractC5759a
    public final String a() {
        return this.f47723l;
    }

    @Override // x3.AbstractC5759a
    public final String b() {
        return this.f47721j;
    }

    @Override // x3.AbstractC5759a
    public final String c() {
        return this.f47716d;
    }

    @Override // x3.AbstractC5759a
    public final String d() {
        return this.f47720h;
    }

    @Override // x3.AbstractC5759a
    public final String e() {
        return this.f47715c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC5759a)) {
            return false;
        }
        AbstractC5759a abstractC5759a = (AbstractC5759a) obj;
        Integer num = this.f47713a;
        if (num == null) {
            if (abstractC5759a.l() != null) {
                return false;
            }
        } else if (!num.equals(abstractC5759a.l())) {
            return false;
        }
        String str = this.f47714b;
        if (str == null) {
            if (abstractC5759a.i() != null) {
                return false;
            }
        } else if (!str.equals(abstractC5759a.i())) {
            return false;
        }
        String str2 = this.f47715c;
        if (str2 == null) {
            if (abstractC5759a.e() != null) {
                return false;
            }
        } else if (!str2.equals(abstractC5759a.e())) {
            return false;
        }
        String str3 = this.f47716d;
        if (str3 == null) {
            if (abstractC5759a.c() != null) {
                return false;
            }
        } else if (!str3.equals(abstractC5759a.c())) {
            return false;
        }
        String str4 = this.f47717e;
        if (str4 == null) {
            if (abstractC5759a.k() != null) {
                return false;
            }
        } else if (!str4.equals(abstractC5759a.k())) {
            return false;
        }
        String str5 = this.f47718f;
        if (str5 == null) {
            if (abstractC5759a.j() != null) {
                return false;
            }
        } else if (!str5.equals(abstractC5759a.j())) {
            return false;
        }
        String str6 = this.f47719g;
        if (str6 == null) {
            if (abstractC5759a.g() != null) {
                return false;
            }
        } else if (!str6.equals(abstractC5759a.g())) {
            return false;
        }
        String str7 = this.f47720h;
        if (str7 == null) {
            if (abstractC5759a.d() != null) {
                return false;
            }
        } else if (!str7.equals(abstractC5759a.d())) {
            return false;
        }
        String str8 = this.i;
        if (str8 == null) {
            if (abstractC5759a.f() != null) {
                return false;
            }
        } else if (!str8.equals(abstractC5759a.f())) {
            return false;
        }
        String str9 = this.f47721j;
        if (str9 == null) {
            if (abstractC5759a.b() != null) {
                return false;
            }
        } else if (!str9.equals(abstractC5759a.b())) {
            return false;
        }
        String str10 = this.f47722k;
        if (str10 == null) {
            if (abstractC5759a.h() != null) {
                return false;
            }
        } else if (!str10.equals(abstractC5759a.h())) {
            return false;
        }
        String str11 = this.f47723l;
        return str11 == null ? abstractC5759a.a() == null : str11.equals(abstractC5759a.a());
    }

    @Override // x3.AbstractC5759a
    public final String f() {
        return this.i;
    }

    @Override // x3.AbstractC5759a
    public final String g() {
        return this.f47719g;
    }

    @Override // x3.AbstractC5759a
    public final String h() {
        return this.f47722k;
    }

    public final int hashCode() {
        Integer num = this.f47713a;
        int iHashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.f47714b;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f47715c;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f47716d;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f47717e;
        int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f47718f;
        int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.f47719g;
        int iHashCode7 = (iHashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.f47720h;
        int iHashCode8 = (iHashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.i;
        int iHashCode9 = (iHashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.f47721j;
        int iHashCode10 = (iHashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.f47722k;
        int iHashCode11 = (iHashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        String str11 = this.f47723l;
        return (str11 != null ? str11.hashCode() : 0) ^ iHashCode11;
    }

    @Override // x3.AbstractC5759a
    public final String i() {
        return this.f47714b;
    }

    @Override // x3.AbstractC5759a
    public final String j() {
        return this.f47718f;
    }

    @Override // x3.AbstractC5759a
    public final String k() {
        return this.f47717e;
    }

    @Override // x3.AbstractC5759a
    public final Integer l() {
        return this.f47713a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidClientInfo{sdkVersion=");
        sb.append(this.f47713a);
        sb.append(", model=");
        sb.append(this.f47714b);
        sb.append(", hardware=");
        sb.append(this.f47715c);
        sb.append(", device=");
        sb.append(this.f47716d);
        sb.append(", product=");
        sb.append(this.f47717e);
        sb.append(", osBuild=");
        sb.append(this.f47718f);
        sb.append(", manufacturer=");
        sb.append(this.f47719g);
        sb.append(", fingerprint=");
        sb.append(this.f47720h);
        sb.append(", locale=");
        sb.append(this.i);
        sb.append(", country=");
        sb.append(this.f47721j);
        sb.append(", mccMnc=");
        sb.append(this.f47722k);
        sb.append(", applicationBuild=");
        return B4.f.c(sb, this.f47723l, "}");
    }
}
