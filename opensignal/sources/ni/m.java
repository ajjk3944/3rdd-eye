package ni;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f18013a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f18014b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f18015c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f18016d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f18017e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f18018f;

    /* renamed from: g, reason: collision with root package name */
    public final Integer f18019g;

    public m(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7) {
        this.f18013a = num;
        this.f18014b = num2;
        this.f18015c = num3;
        this.f18016d = num4;
        this.f18017e = num5;
        this.f18018f = num6;
        this.f18019g = num7;
    }

    public final String a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("dns1", this.f18013a);
        jSONObject.put("dns2", this.f18014b);
        jSONObject.put("gateway", this.f18015c);
        jSONObject.put("dhcp_ip", this.f18016d);
        jSONObject.put("lease_dur", this.f18017e);
        jSONObject.put("netmask", this.f18018f);
        jSONObject.put("server_address", this.f18019g);
        String string = jSONObject.toString();
        br.l.d(string, "toString(...)");
        return string;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return br.l.a(this.f18013a, mVar.f18013a) && br.l.a(this.f18014b, mVar.f18014b) && br.l.a(this.f18015c, mVar.f18015c) && br.l.a(this.f18016d, mVar.f18016d) && br.l.a(this.f18017e, mVar.f18017e) && br.l.a(this.f18018f, mVar.f18018f) && br.l.a(this.f18019g, mVar.f18019g);
    }

    public final int hashCode() {
        Integer num = this.f18013a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f18014b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f18015c;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f18016d;
        int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.f18017e;
        int iHashCode5 = (iHashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.f18018f;
        int iHashCode6 = (iHashCode5 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.f18019g;
        return iHashCode6 + (num7 != null ? num7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DhcpStatusCoreResult(dns1=");
        sb2.append(this.f18013a);
        sb2.append(", dns2=");
        sb2.append(this.f18014b);
        sb2.append(", gateway=");
        sb2.append(this.f18015c);
        sb2.append(", ipAddress=");
        sb2.append(this.f18016d);
        sb2.append(", leaseDuration=");
        sb2.append(this.f18017e);
        sb2.append(", netmask=");
        sb2.append(this.f18018f);
        sb2.append(", serverAddress=");
        return w.g.i(sb2, this.f18019g, ')');
    }
}
