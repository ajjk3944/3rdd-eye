package ni;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class t extends vj.c {
    public final String A;
    public final Integer B;
    public final Long C;
    public final Integer D;

    /* renamed from: a, reason: collision with root package name */
    public final long f18146a;

    /* renamed from: b, reason: collision with root package name */
    public final long f18147b;

    /* renamed from: c, reason: collision with root package name */
    public final String f18148c;

    /* renamed from: d, reason: collision with root package name */
    public final String f18149d;

    /* renamed from: e, reason: collision with root package name */
    public final String f18150e;

    /* renamed from: f, reason: collision with root package name */
    public final long f18151f;

    /* renamed from: g, reason: collision with root package name */
    public final String f18152g;

    /* renamed from: h, reason: collision with root package name */
    public final String f18153h;

    /* renamed from: i, reason: collision with root package name */
    public final int f18154i;
    public final String j;
    public final int k;

    /* renamed from: l, reason: collision with root package name */
    public final long f18155l;

    /* renamed from: m, reason: collision with root package name */
    public final String f18156m;

    /* renamed from: n, reason: collision with root package name */
    public final int f18157n;

    /* renamed from: o, reason: collision with root package name */
    public final int f18158o;

    /* renamed from: p, reason: collision with root package name */
    public final String f18159p;

    /* renamed from: q, reason: collision with root package name */
    public final String f18160q;

    /* renamed from: r, reason: collision with root package name */
    public final Integer f18161r;

    /* renamed from: s, reason: collision with root package name */
    public final Integer f18162s;

    /* renamed from: t, reason: collision with root package name */
    public final Long f18163t;

    /* renamed from: u, reason: collision with root package name */
    public final Long f18164u;

    /* renamed from: v, reason: collision with root package name */
    public final ak.f f18165v;

    /* renamed from: w, reason: collision with root package name */
    public final String f18166w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f18167x;

    /* renamed from: y, reason: collision with root package name */
    public final c0 f18168y;

    /* renamed from: z, reason: collision with root package name */
    public final String f18169z;

    public t(long j, long j7, String str, String str2, String str3, long j10, String str4, String str5, int i10, String str6, int i11, long j11, String str7, int i12, int i13, String str8, String str9, Integer num, Integer num2, Long l10, Long l11, ak.f fVar, String str10, boolean z10, c0 c0Var, String str11, String str12, Integer num3, Long l12, Integer num4) {
        br.l.e(str, "taskName");
        br.l.e(str2, "jobType");
        br.l.e(str3, "dataEndpoint");
        br.l.e(str4, "appVersion");
        br.l.e(str5, "sdkVersionCode");
        br.l.e(str6, "androidReleaseName");
        br.l.e(str9, "connectionId");
        this.f18146a = j;
        this.f18147b = j7;
        this.f18148c = str;
        this.f18149d = str2;
        this.f18150e = str3;
        this.f18151f = j10;
        this.f18152g = str4;
        this.f18153h = str5;
        this.f18154i = i10;
        this.j = str6;
        this.k = i11;
        this.f18155l = j11;
        this.f18156m = str7;
        this.f18157n = i12;
        this.f18158o = i13;
        this.f18159p = str8;
        this.f18160q = str9;
        this.f18161r = num;
        this.f18162s = num2;
        this.f18163t = l10;
        this.f18164u = l11;
        this.f18165v = fVar;
        this.f18166w = str10;
        this.f18167x = z10;
        this.f18168y = c0Var;
        this.f18169z = str11;
        this.A = str12;
        this.B = num3;
        this.C = l12;
        this.D = num4;
    }

    @Override // vj.c
    public final String a() {
        return this.f18150e;
    }

    @Override // vj.c
    public final long b() {
        return this.f18146a;
    }

    @Override // vj.c
    public final String c() {
        return this.f18149d;
    }

    @Override // vj.c
    public final long d() {
        return this.f18147b;
    }

    @Override // vj.c
    public final String e() {
        return this.f18148c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f18146a == tVar.f18146a && this.f18147b == tVar.f18147b && br.l.a(this.f18148c, tVar.f18148c) && br.l.a(this.f18149d, tVar.f18149d) && br.l.a(this.f18150e, tVar.f18150e) && this.f18151f == tVar.f18151f && br.l.a(this.f18152g, tVar.f18152g) && br.l.a(this.f18153h, tVar.f18153h) && this.f18154i == tVar.f18154i && br.l.a(this.j, tVar.j) && this.k == tVar.k && this.f18155l == tVar.f18155l && br.l.a(this.f18156m, tVar.f18156m) && this.f18157n == tVar.f18157n && this.f18158o == tVar.f18158o && br.l.a(this.f18159p, tVar.f18159p) && br.l.a(this.f18160q, tVar.f18160q) && br.l.a(this.f18161r, tVar.f18161r) && br.l.a(this.f18162s, tVar.f18162s) && br.l.a(this.f18163t, tVar.f18163t) && br.l.a(this.f18164u, tVar.f18164u) && br.l.a(this.f18165v, tVar.f18165v) && br.l.a(this.f18166w, tVar.f18166w) && this.f18167x == tVar.f18167x && br.l.a(this.f18168y, tVar.f18168y) && br.l.a(this.f18169z, tVar.f18169z) && br.l.a(this.A, tVar.A) && br.l.a(this.B, tVar.B) && br.l.a(this.C, tVar.C) && br.l.a(this.D, tVar.D);
    }

    @Override // vj.c
    public final long f() {
        return this.f18151f;
    }

    @Override // vj.c
    public final void g(JSONObject jSONObject) throws JSONException {
        jSONObject.put("APP_VRS_CODE", this.f18152g);
        jSONObject.put("DC_VRS_CODE", this.f18153h);
        jSONObject.put("DB_VRS_CODE", this.f18154i);
        jSONObject.put("ANDROID_VRS", this.j);
        jSONObject.put("ANDROID_SDK", this.k);
        xu.d.Y(jSONObject, "ANDROID_SDK_FULL", this.D);
        jSONObject.put("CLIENT_VRS_CODE", this.f18155l);
        jSONObject.put("COHORT_ID", this.f18156m);
        jSONObject.put("REPORT_CONFIG_REVISION", this.f18157n);
        jSONObject.put("REPORT_CONFIG_ID", this.f18158o);
        jSONObject.put("CONFIG_HASH", this.f18159p);
        jSONObject.put("DEVICE_CONNECTION_IS_ROAMING", this.f18167x);
        xu.d.Y(jSONObject, "CONNECTION_ID", this.f18160q);
        xu.d.Y(jSONObject, "CONNECTION_START_TIME", this.f18163t);
        xu.d.Y(jSONObject, "CONNECTION_END_TIME", this.f18164u);
        xu.d.Y(jSONObject, "DEVICE_CONNECTION_TYPE", this.f18161r);
        xu.d.Y(jSONObject, "DEVICE_CONNECTION_MOBILE_SUBTYPE", this.f18162s);
        xu.d.Y(jSONObject, "DEVICE_CONNECTION_WIFI_BSSID", this.f18166w);
        ak.f fVar = this.f18165v;
        xu.d.Y(jSONObject, "DEVICE_CONNECTION_CELL_TOWER", fVar != null ? fVar.a() : null);
        c0 c0Var = this.f18168y;
        xu.d.Y(jSONObject, "JOB_RESULT_DEVICE_CONNECTION_LOCATION", c0Var != null ? c0Var.a() : null);
        xu.d.Y(jSONObject, "JOB_RESULT_DEVICE_CONNECTION_NETWORK_ID_SIM", this.f18169z);
        xu.d.Y(jSONObject, "JOB_RESULT_DEVICE_CONNECTION_NETWORK_NAME_SIM", this.A);
        xu.d.Y(jSONObject, "JOB_RESULT_DEVICE_CONNECTION_NR_STATE", this.B);
        xu.d.Y(jSONObject, "JOB_RESULT_DEVICE_CONNECTION_LAST_TASK_TIME", this.C);
    }

    public final int hashCode() {
        int iG = c7.a.g(this.f18160q, c7.a.g(this.f18159p, c7.a.C(this.f18158o, c7.a.C(this.f18157n, c7.a.g(this.f18156m, h0.b.b(c7.a.C(this.k, c7.a.g(this.j, c7.a.C(this.f18154i, c7.a.g(this.f18153h, c7.a.g(this.f18152g, h0.b.b(c7.a.g(this.f18150e, c7.a.g(this.f18149d, c7.a.g(this.f18148c, h0.b.b(Long.hashCode(this.f18146a) * 31, 31, this.f18147b), 31), 31), 31), 31, this.f18151f), 31), 31), 31), 31), 31), 31, this.f18155l), 31), 31), 31), 31), 31);
        Integer num = this.f18161r;
        int iHashCode = (iG + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f18162s;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l10 = this.f18163t;
        int iHashCode3 = (iHashCode2 + (l10 == null ? 0 : l10.hashCode())) * 31;
        Long l11 = this.f18164u;
        int iHashCode4 = (iHashCode3 + (l11 == null ? 0 : l11.hashCode())) * 31;
        ak.f fVar = this.f18165v;
        int iHashCode5 = (iHashCode4 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        String str = this.f18166w;
        int iB = w.g.b((iHashCode5 + (str == null ? 0 : str.hashCode())) * 31, this.f18167x, 31);
        c0 c0Var = this.f18168y;
        int iHashCode6 = (iB + (c0Var == null ? 0 : c0Var.hashCode())) * 31;
        String str2 = this.f18169z;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num3 = this.B;
        int iHashCode9 = (iHashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Long l12 = this.C;
        int iHashCode10 = (iHashCode9 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Integer num4 = this.D;
        return iHashCode10 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FlushConnectionInfoJobResultItem(id=");
        sb2.append(this.f18146a);
        sb2.append(", taskId=");
        sb2.append(this.f18147b);
        sb2.append(", taskName=");
        sb2.append(this.f18148c);
        sb2.append(", jobType=");
        sb2.append(this.f18149d);
        sb2.append(", dataEndpoint=");
        sb2.append(this.f18150e);
        sb2.append(", timeOfResult=");
        sb2.append(this.f18151f);
        sb2.append(", appVersion=");
        sb2.append(this.f18152g);
        sb2.append(", sdkVersionCode=");
        sb2.append(this.f18153h);
        sb2.append(", databaseVersionCode=");
        sb2.append(this.f18154i);
        sb2.append(", androidReleaseName=");
        sb2.append(this.j);
        sb2.append(", deviceSdkInt=");
        sb2.append(this.k);
        sb2.append(", clientVersionCode=");
        sb2.append(this.f18155l);
        sb2.append(", cohortId=");
        sb2.append(this.f18156m);
        sb2.append(", configRevision=");
        sb2.append(this.f18157n);
        sb2.append(", configId=");
        sb2.append(this.f18158o);
        sb2.append(", configHash=");
        sb2.append(this.f18159p);
        sb2.append(", connectionId=");
        sb2.append(this.f18160q);
        sb2.append(", type=");
        sb2.append(this.f18161r);
        sb2.append(", mobileSubtype=");
        sb2.append(this.f18162s);
        sb2.append(", startTime=");
        sb2.append(this.f18163t);
        sb2.append(", endTime=");
        sb2.append(this.f18164u);
        sb2.append(", cellTower=");
        sb2.append(this.f18165v);
        sb2.append(", wifiBssid=");
        sb2.append(this.f18166w);
        sb2.append(", isRoaming=");
        sb2.append(this.f18167x);
        sb2.append(", locationCoreResult=");
        sb2.append(this.f18168y);
        sb2.append(", simOperator=");
        sb2.append(this.f18169z);
        sb2.append(", simOperatorName=");
        sb2.append(this.A);
        sb2.append(", nrState=");
        sb2.append(this.B);
        sb2.append(", lastTaskTime=");
        sb2.append(this.C);
        sb2.append(", deviceSdkFullInt=");
        return w.g.i(sb2, this.D, ')');
    }
}
