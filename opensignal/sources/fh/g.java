package fh;

import br.l;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f8872a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8873b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8874c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8875d;

    /* renamed from: e, reason: collision with root package name */
    public final long f8876e;

    /* renamed from: f, reason: collision with root package name */
    public final String f8877f;

    /* renamed from: g, reason: collision with root package name */
    public final Long f8878g;

    /* renamed from: h, reason: collision with root package name */
    public final Long f8879h;

    public /* synthetic */ g(String str, int i10, Long l10, Long l11) {
        this(str, null, i10, 501, -1L, null, l10, l11);
    }

    public static g a(g gVar, String str, int i10, long j, String str2, int i11) {
        String str3 = gVar.f8872a;
        if ((i11 & 2) != 0) {
            str = gVar.f8873b;
        }
        String str4 = str;
        int i12 = gVar.f8874c;
        if ((i11 & 8) != 0) {
            i10 = gVar.f8875d;
        }
        int i13 = i10;
        if ((i11 & 16) != 0) {
            j = gVar.f8876e;
        }
        long j7 = j;
        if ((i11 & 32) != 0) {
            str2 = gVar.f8877f;
        }
        Long l10 = gVar.f8878g;
        Long l11 = gVar.f8879h;
        gVar.getClass();
        l.e(str3, "url");
        return new g(str3, str4, i12, i13, j7, str2, l10, l11);
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        xu.d.Y(jSONObject, "url", this.f8872a);
        xu.d.Y(jSONObject, "location", this.f8873b);
        xu.d.Y(jSONObject, "endpoint_type", Integer.valueOf(this.f8874c));
        xu.d.Y(jSONObject, "response_code", Integer.valueOf(this.f8875d));
        xu.d.Y(jSONObject, "latency_ms", Long.valueOf(this.f8876e));
        xu.d.Y(jSONObject, "exception", this.f8877f);
        xu.d.Y(jSONObject, "connection_timeout_ms", this.f8878g);
        xu.d.Y(jSONObject, "test_timeout_ms", this.f8879h);
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return l.a(this.f8872a, gVar.f8872a) && l.a(this.f8873b, gVar.f8873b) && this.f8874c == gVar.f8874c && this.f8875d == gVar.f8875d && this.f8876e == gVar.f8876e && l.a(this.f8877f, gVar.f8877f) && l.a(this.f8878g, gVar.f8878g) && l.a(this.f8879h, gVar.f8879h);
    }

    public final int hashCode() {
        int iHashCode = this.f8872a.hashCode() * 31;
        String str = this.f8873b;
        int iB = h0.b.b(c7.a.C(this.f8875d, c7.a.C(this.f8874c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31, this.f8876e);
        String str2 = this.f8877f;
        int iHashCode2 = (iB + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l10 = this.f8878g;
        int iHashCode3 = (iHashCode2 + (l10 == null ? 0 : l10.hashCode())) * 31;
        Long l11 = this.f8879h;
        return iHashCode3 + (l11 != null ? l11.hashCode() : 0);
    }

    public final String toString() {
        return "HttpHeadLatencyTestResult(url=" + this.f8872a + ", location=" + this.f8873b + ", endpointType=" + this.f8874c + ", responseCode=" + this.f8875d + ", latencyMs=" + this.f8876e + ", exception=" + this.f8877f + ", connectionTimeoutMs=" + this.f8878g + ", testTimeoutMs=" + this.f8879h + ')';
    }

    public g(String str, String str2, int i10, int i11, long j, String str3, Long l10, Long l11) {
        this.f8872a = str;
        this.f8873b = str2;
        this.f8874c = i10;
        this.f8875d = i11;
        this.f8876e = j;
        this.f8877f = str3;
        this.f8878g = l10;
        this.f8879h = l11;
    }
}
