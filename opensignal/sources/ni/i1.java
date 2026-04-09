package ni;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class i1 extends vj.c {
    public final String A;
    public final c0 B;

    /* renamed from: a, reason: collision with root package name */
    public final long f17923a;

    /* renamed from: b, reason: collision with root package name */
    public final long f17924b;

    /* renamed from: c, reason: collision with root package name */
    public final String f17925c;

    /* renamed from: d, reason: collision with root package name */
    public final String f17926d;

    /* renamed from: e, reason: collision with root package name */
    public final String f17927e;

    /* renamed from: f, reason: collision with root package name */
    public final long f17928f;

    /* renamed from: g, reason: collision with root package name */
    public final String f17929g;

    /* renamed from: h, reason: collision with root package name */
    public final String f17930h;

    /* renamed from: i, reason: collision with root package name */
    public final int f17931i;
    public final String j;
    public final int k;

    /* renamed from: l, reason: collision with root package name */
    public final Integer f17932l;

    /* renamed from: m, reason: collision with root package name */
    public final long f17933m;

    /* renamed from: n, reason: collision with root package name */
    public final String f17934n;

    /* renamed from: o, reason: collision with root package name */
    public final int f17935o;

    /* renamed from: p, reason: collision with root package name */
    public final int f17936p;

    /* renamed from: q, reason: collision with root package name */
    public final String f17937q;

    /* renamed from: r, reason: collision with root package name */
    public final String f17938r;

    /* renamed from: s, reason: collision with root package name */
    public final Long f17939s;

    /* renamed from: t, reason: collision with root package name */
    public final String f17940t;

    /* renamed from: u, reason: collision with root package name */
    public final String f17941u;

    /* renamed from: v, reason: collision with root package name */
    public final int f17942v;

    /* renamed from: w, reason: collision with root package name */
    public final int f17943w;

    /* renamed from: x, reason: collision with root package name */
    public final String f17944x;

    /* renamed from: y, reason: collision with root package name */
    public final Integer f17945y;

    /* renamed from: z, reason: collision with root package name */
    public final Integer f17946z;

    public i1(long j, long j7, String str, String str2, String str3, long j10, String str4, String str5, int i10, String str6, int i11, Integer num, long j11, String str7, int i12, int i13, String str8, String str9, Long l10, String str10, String str11, int i14, int i15, String str12, Integer num2, Integer num3, String str13, c0 c0Var) {
        br.l.e(str, "taskName");
        br.l.e(str2, "jobType");
        br.l.e(str3, "dataEndpoint");
        br.l.e(str4, "appVersion");
        br.l.e(str5, "sdkVersionCode");
        br.l.e(str6, "androidReleaseName");
        this.f17923a = j;
        this.f17924b = j7;
        this.f17925c = str;
        this.f17926d = str2;
        this.f17927e = str3;
        this.f17928f = j10;
        this.f17929g = str4;
        this.f17930h = str5;
        this.f17931i = i10;
        this.j = str6;
        this.k = i11;
        this.f17932l = num;
        this.f17933m = j11;
        this.f17934n = str7;
        this.f17935o = i12;
        this.f17936p = i13;
        this.f17937q = str8;
        this.f17938r = str9;
        this.f17939s = l10;
        this.f17940t = str10;
        this.f17941u = str11;
        this.f17942v = i14;
        this.f17943w = i15;
        this.f17944x = str12;
        this.f17945y = num2;
        this.f17946z = num3;
        this.A = str13;
        this.B = c0Var;
    }

    @Override // vj.c
    public final String a() {
        return this.f17927e;
    }

    @Override // vj.c
    public final long b() {
        return this.f17923a;
    }

    @Override // vj.c
    public final String c() {
        return this.f17926d;
    }

    @Override // vj.c
    public final long d() {
        return this.f17924b;
    }

    @Override // vj.c
    public final String e() {
        return this.f17925c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        return this.f17923a == i1Var.f17923a && this.f17924b == i1Var.f17924b && br.l.a(this.f17925c, i1Var.f17925c) && br.l.a(this.f17926d, i1Var.f17926d) && br.l.a(this.f17927e, i1Var.f17927e) && this.f17928f == i1Var.f17928f && br.l.a(this.f17929g, i1Var.f17929g) && br.l.a(this.f17930h, i1Var.f17930h) && this.f17931i == i1Var.f17931i && br.l.a(this.j, i1Var.j) && this.k == i1Var.k && br.l.a(this.f17932l, i1Var.f17932l) && this.f17933m == i1Var.f17933m && br.l.a(this.f17934n, i1Var.f17934n) && this.f17935o == i1Var.f17935o && this.f17936p == i1Var.f17936p && br.l.a(this.f17937q, i1Var.f17937q) && br.l.a(this.f17938r, i1Var.f17938r) && br.l.a(this.f17939s, i1Var.f17939s) && br.l.a(this.f17940t, i1Var.f17940t) && br.l.a(this.f17941u, i1Var.f17941u) && this.f17942v == i1Var.f17942v && this.f17943w == i1Var.f17943w && br.l.a(this.f17944x, i1Var.f17944x) && br.l.a(this.f17945y, i1Var.f17945y) && br.l.a(this.f17946z, i1Var.f17946z) && br.l.a(this.A, i1Var.A) && br.l.a(this.B, i1Var.B);
    }

    @Override // vj.c
    public final long f() {
        return this.f17928f;
    }

    @Override // vj.c
    public final void g(JSONObject jSONObject) throws JSONException {
        jSONObject.put("APP_VRS_CODE", this.f17929g);
        jSONObject.put("DC_VRS_CODE", this.f17930h);
        jSONObject.put("DB_VRS_CODE", this.f17931i);
        jSONObject.put("ANDROID_VRS", this.j);
        jSONObject.put("ANDROID_SDK", this.k);
        xu.d.Y(jSONObject, "ANDROID_SDK_FULL", this.f17932l);
        jSONObject.put("CLIENT_VRS_CODE", this.f17933m);
        jSONObject.put("COHORT_ID", this.f17934n);
        jSONObject.put("REPORT_CONFIG_REVISION", this.f17935o);
        jSONObject.put("REPORT_CONFIG_ID", this.f17936p);
        jSONObject.put("CONFIG_HASH", this.f17937q);
        xu.d.Y(jSONObject, "CONNECTION_ID", this.f17938r);
        xu.d.Y(jSONObject, "CONNECTION_START_TIME", this.f17939s);
        jSONObject.put("wifi_bssid", this.f17940t);
        jSONObject.put("wifi_ssid", this.f17941u);
        jSONObject.put("wifi_rssi", this.f17942v);
        jSONObject.put("wifi_frequency", this.f17943w);
        jSONObject.put("wifi_capabilities", this.f17944x);
        xu.d.Y(jSONObject, "wifi_channel_width", this.f17945y);
        xu.d.Y(jSONObject, "wifi_standard", this.f17946z);
        xu.d.Y(jSONObject, "wifi_information_elements", this.A);
        c0 c0Var = this.B;
        xu.d.Y(jSONObject, "wifi_scan_location", c0Var != null ? c0Var.a() : null);
    }

    public final int hashCode() {
        int iC = c7.a.C(this.k, c7.a.g(this.j, c7.a.C(this.f17931i, c7.a.g(this.f17930h, c7.a.g(this.f17929g, h0.b.b(c7.a.g(this.f17927e, c7.a.g(this.f17926d, c7.a.g(this.f17925c, h0.b.b(Long.hashCode(this.f17923a) * 31, 31, this.f17924b), 31), 31), 31), 31, this.f17928f), 31), 31), 31), 31), 31);
        Integer num = this.f17932l;
        int iG = c7.a.g(this.f17937q, c7.a.C(this.f17936p, c7.a.C(this.f17935o, c7.a.g(this.f17934n, h0.b.b((iC + (num == null ? 0 : num.hashCode())) * 31, 31, this.f17933m), 31), 31), 31), 31);
        String str = this.f17938r;
        int iHashCode = (iG + (str == null ? 0 : str.hashCode())) * 31;
        Long l10 = this.f17939s;
        int iG2 = c7.a.g(this.f17944x, c7.a.C(this.f17943w, c7.a.C(this.f17942v, c7.a.g(this.f17941u, c7.a.g(this.f17940t, (iHashCode + (l10 == null ? 0 : l10.hashCode())) * 31, 31), 31), 31), 31), 31);
        Integer num2 = this.f17945y;
        int iHashCode2 = (iG2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f17946z;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str2 = this.A;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        c0 c0Var = this.B;
        return iHashCode4 + (c0Var != null ? c0Var.hashCode() : 0);
    }

    public final String toString() {
        return "WifiScanJobResultItem(id=" + this.f17923a + ", taskId=" + this.f17924b + ", taskName=" + this.f17925c + ", jobType=" + this.f17926d + ", dataEndpoint=" + this.f17927e + ", timeOfResult=" + this.f17928f + ", appVersion=" + this.f17929g + ", sdkVersionCode=" + this.f17930h + ", databaseVersionCode=" + this.f17931i + ", androidReleaseName=" + this.j + ", deviceSdkInt=" + this.k + ", deviceSdkFullInt=" + this.f17932l + ", clientVersionCode=" + this.f17933m + ", cohortId=" + this.f17934n + ", configRevision=" + this.f17935o + ", configId=" + this.f17936p + ", configHash=" + this.f17937q + ", connectionId=" + this.f17938r + ", connectionStartTime=" + this.f17939s + ", bssid=" + this.f17940t + ", ssid=" + this.f17941u + ", rssi=" + this.f17942v + ", frequency=" + this.f17943w + ", capabilities=" + this.f17944x + ", channelWidth=" + this.f17945y + ", wifiStandard=" + this.f17946z + ", informationElements=" + this.A + ", wifiScanResultLocation=" + this.B + ')';
    }
}
