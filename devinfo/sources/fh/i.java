package fh;

import je.u;
import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @uf.b("prepay_id")
    private final String f24052a;

    /* renamed from: b, reason: collision with root package name */
    @uf.b("timestamp")
    private final long f24053b;

    /* renamed from: c, reason: collision with root package name */
    @uf.b("timestamp_bj")
    private final long f24054c;

    /* renamed from: d, reason: collision with root package name */
    @uf.b("partner_id")
    private final String f24055d;

    /* renamed from: e, reason: collision with root package name */
    @uf.b("package_value")
    private final String f24056e;

    /* renamed from: f, reason: collision with root package name */
    @uf.b("nonce_str")
    private final String f24057f;

    @uf.b("sign")
    private final String g;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return k.a(this.f24052a, iVar.f24052a) && this.f24053b == iVar.f24053b && this.f24054c == iVar.f24054c && k.a(this.f24055d, iVar.f24055d) && k.a(this.f24056e, iVar.f24056e) && k.a(this.f24057f, iVar.f24057f) && k.a(this.g, iVar.g);
    }

    public final int hashCode() {
        int iHashCode = this.f24052a.hashCode() * 31;
        long j = this.f24053b;
        int i4 = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j8 = this.f24054c;
        return this.g.hashCode() + u.m(u.m(u.m((i4 + ((int) (j8 ^ (j8 >>> 32)))) * 31, 31, this.f24055d), 31, this.f24056e), 31, this.f24057f);
    }

    public final String toString() {
        String str = this.f24052a;
        long j = this.f24053b;
        long j8 = this.f24054c;
        String str2 = this.f24055d;
        String str3 = this.f24056e;
        String str4 = this.f24057f;
        String str5 = this.g;
        StringBuilder sb2 = new StringBuilder("WxpayData(prepayId=");
        sb2.append(str);
        sb2.append(", timestamp=");
        sb2.append(j);
        a0.g.A(sb2, ", timestampBeiJing=", j8, ", partnerId=");
        u.B(sb2, str2, ", packageValue=", str3, ", nonceStr=");
        return a0.g.p(sb2, str4, ", sign=", str5, ")");
    }
}
