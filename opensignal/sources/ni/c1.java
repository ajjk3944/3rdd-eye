package ni;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class c1 extends vj.c {

    /* renamed from: a, reason: collision with root package name */
    public final long f17706a;

    /* renamed from: b, reason: collision with root package name */
    public final long f17707b;

    /* renamed from: c, reason: collision with root package name */
    public final String f17708c;

    /* renamed from: d, reason: collision with root package name */
    public final String f17709d;

    /* renamed from: e, reason: collision with root package name */
    public final String f17710e;

    /* renamed from: f, reason: collision with root package name */
    public final long f17711f;

    /* renamed from: g, reason: collision with root package name */
    public final long f17712g;

    /* renamed from: h, reason: collision with root package name */
    public final long f17713h;

    /* renamed from: i, reason: collision with root package name */
    public final long f17714i;
    public final long j;
    public final Long k;

    /* renamed from: l, reason: collision with root package name */
    public final String f17715l;

    /* renamed from: m, reason: collision with root package name */
    public final String f17716m;

    /* renamed from: n, reason: collision with root package name */
    public final String f17717n;

    /* renamed from: o, reason: collision with root package name */
    public final String f17718o;

    /* renamed from: p, reason: collision with root package name */
    public final int f17719p;

    /* renamed from: q, reason: collision with root package name */
    public final String f17720q;

    /* renamed from: r, reason: collision with root package name */
    public final int f17721r;

    /* renamed from: s, reason: collision with root package name */
    public final String f17722s;

    /* renamed from: t, reason: collision with root package name */
    public final int f17723t;

    /* renamed from: u, reason: collision with root package name */
    public final long f17724u;

    /* renamed from: v, reason: collision with root package name */
    public final long f17725v;

    /* renamed from: w, reason: collision with root package name */
    public final long f17726w;

    /* renamed from: x, reason: collision with root package name */
    public final String f17727x;

    /* renamed from: y, reason: collision with root package name */
    public final String f17728y;

    public c1(long j, long j7, String str, String str2, String str3, long j10, long j11, long j12, long j13, long j14, Long l10, String str4, String str5, String str6, String str7, int i10, String str8, int i11, String str9, int i12, long j15, long j16, long j17, String str10, String str11) {
        br.l.e(str, "taskName");
        br.l.e(str2, "jobType");
        br.l.e(str3, "dataEndpoint");
        br.l.e(str6, "uploadIp");
        br.l.e(str7, "uploadHost");
        br.l.e(str8, "uploadCdnName");
        this.f17706a = j;
        this.f17707b = j7;
        this.f17708c = str;
        this.f17709d = str2;
        this.f17710e = str3;
        this.f17711f = j10;
        this.f17712g = j11;
        this.f17713h = j12;
        this.f17714i = j13;
        this.j = j14;
        this.k = l10;
        this.f17715l = str4;
        this.f17716m = str5;
        this.f17717n = str6;
        this.f17718o = str7;
        this.f17719p = i10;
        this.f17720q = str8;
        this.f17721r = i11;
        this.f17722s = str9;
        this.f17723t = i12;
        this.f17724u = j15;
        this.f17725v = j16;
        this.f17726w = j17;
        this.f17727x = str10;
        this.f17728y = str11;
    }

    public static c1 i(c1 c1Var, long j) {
        long j7 = c1Var.f17707b;
        String str = c1Var.f17708c;
        String str2 = c1Var.f17709d;
        String str3 = c1Var.f17710e;
        long j10 = c1Var.f17711f;
        long j11 = c1Var.f17712g;
        long j12 = c1Var.f17713h;
        long j13 = c1Var.f17714i;
        long j14 = c1Var.j;
        Long l10 = c1Var.k;
        String str4 = c1Var.f17715l;
        String str5 = c1Var.f17716m;
        String str6 = c1Var.f17717n;
        String str7 = c1Var.f17718o;
        int i10 = c1Var.f17719p;
        String str8 = c1Var.f17720q;
        int i11 = c1Var.f17721r;
        String str9 = c1Var.f17722s;
        int i12 = c1Var.f17723t;
        long j15 = c1Var.f17724u;
        long j16 = c1Var.f17725v;
        long j17 = c1Var.f17726w;
        String str10 = c1Var.f17727x;
        String str11 = c1Var.f17728y;
        br.l.e(str, "taskName");
        br.l.e(str2, "jobType");
        br.l.e(str3, "dataEndpoint");
        br.l.e(str6, "uploadIp");
        br.l.e(str7, "uploadHost");
        br.l.e(str8, "uploadCdnName");
        return new c1(j, j7, str, str2, str3, j10, j11, j12, j13, j14, l10, str4, str5, str6, str7, i10, str8, i11, str9, i12, j15, j16, j17, str10, str11);
    }

    @Override // vj.c
    public final String a() {
        return this.f17710e;
    }

    @Override // vj.c
    public final long b() {
        return this.f17706a;
    }

    @Override // vj.c
    public final String c() {
        return this.f17709d;
    }

    @Override // vj.c
    public final long d() {
        return this.f17707b;
    }

    @Override // vj.c
    public final String e() {
        return this.f17708c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        return this.f17706a == c1Var.f17706a && this.f17707b == c1Var.f17707b && br.l.a(this.f17708c, c1Var.f17708c) && br.l.a(this.f17709d, c1Var.f17709d) && br.l.a(this.f17710e, c1Var.f17710e) && this.f17711f == c1Var.f17711f && this.f17712g == c1Var.f17712g && this.f17713h == c1Var.f17713h && this.f17714i == c1Var.f17714i && this.j == c1Var.j && br.l.a(this.k, c1Var.k) && br.l.a(this.f17715l, c1Var.f17715l) && br.l.a(this.f17716m, c1Var.f17716m) && br.l.a(this.f17717n, c1Var.f17717n) && br.l.a(this.f17718o, c1Var.f17718o) && this.f17719p == c1Var.f17719p && br.l.a(this.f17720q, c1Var.f17720q) && this.f17721r == c1Var.f17721r && br.l.a(this.f17722s, c1Var.f17722s) && this.f17723t == c1Var.f17723t && this.f17724u == c1Var.f17724u && this.f17725v == c1Var.f17725v && this.f17726w == c1Var.f17726w && br.l.a(this.f17727x, c1Var.f17727x) && br.l.a(this.f17728y, c1Var.f17728y);
    }

    @Override // vj.c
    public final long f() {
        return this.f17711f;
    }

    @Override // vj.c
    public final void g(JSONObject jSONObject) throws JSONException {
        jSONObject.put("upload_time_response", this.f17712g);
        jSONObject.put("upload_speed", this.f17713h);
        jSONObject.put("trimmed_upload_speed", this.f17714i);
        jSONObject.put("upload_file_size", this.j);
        xu.d.Y(jSONObject, "upload_last_time", this.k);
        xu.d.Y(jSONObject, "upload_file_sizes", this.f17715l);
        xu.d.Y(jSONObject, "upload_times", this.f17716m);
        jSONObject.put("upload_ip", this.f17717n);
        jSONObject.put("upload_host", this.f17718o);
        jSONObject.put("upload_thread_count", this.f17719p);
        jSONObject.put("upload_cdn_name", this.f17720q);
        jSONObject.put("upload_unreliability", this.f17721r);
        xu.d.Y(jSONObject, "upload_events", this.f17722s);
        jSONObject.put("upload_monitor_type", this.f17723t);
        jSONObject.put("upload_speed_buffer", this.f17724u);
        jSONObject.put("upload_trimmed_speed_buffer", this.f17725v);
        jSONObject.put("upload_test_duration", this.f17726w);
        xu.d.Y(jSONObject, "upload_buffer_file_sizes", this.f17727x);
        xu.d.Y(jSONObject, "upload_buffer_times", this.f17728y);
    }

    public final int hashCode() {
        int iB = h0.b.b(h0.b.b(h0.b.b(h0.b.b(h0.b.b(c7.a.g(this.f17710e, c7.a.g(this.f17709d, c7.a.g(this.f17708c, h0.b.b(Long.hashCode(this.f17706a) * 31, 31, this.f17707b), 31), 31), 31), 31, this.f17711f), 31, this.f17712g), 31, this.f17713h), 31, this.f17714i), 31, this.j);
        Long l10 = this.k;
        int iHashCode = (iB + (l10 == null ? 0 : l10.hashCode())) * 31;
        String str = this.f17715l;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f17716m;
        int iC = c7.a.C(this.f17721r, c7.a.g(this.f17720q, c7.a.C(this.f17719p, c7.a.g(this.f17718o, c7.a.g(this.f17717n, (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31), 31), 31), 31);
        String str3 = this.f17722s;
        int iB2 = h0.b.b(h0.b.b(h0.b.b(c7.a.C(this.f17723t, (iC + (str3 == null ? 0 : str3.hashCode())) * 31, 31), 31, this.f17724u), 31, this.f17725v), 31, this.f17726w);
        String str4 = this.f17727x;
        int iHashCode3 = (iB2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f17728y;
        return iHashCode3 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UploadSpeedResult(id=");
        sb2.append(this.f17706a);
        sb2.append(", taskId=");
        sb2.append(this.f17707b);
        sb2.append(", taskName=");
        sb2.append(this.f17708c);
        sb2.append(", jobType=");
        sb2.append(this.f17709d);
        sb2.append(", dataEndpoint=");
        sb2.append(this.f17710e);
        sb2.append(", timeOfResult=");
        sb2.append(this.f17711f);
        sb2.append(", uploadTimeResponse=");
        sb2.append(this.f17712g);
        sb2.append(", uploadSpeed=");
        sb2.append(this.f17713h);
        sb2.append(", trimmedUploadSpeed=");
        sb2.append(this.f17714i);
        sb2.append(", uploadFileSize=");
        sb2.append(this.j);
        sb2.append(", lastUploadTime=");
        sb2.append(this.k);
        sb2.append(", uploadedFileSizes=");
        sb2.append(this.f17715l);
        sb2.append(", uploadTimes=");
        sb2.append(this.f17716m);
        sb2.append(", uploadIp=");
        sb2.append(this.f17717n);
        sb2.append(", uploadHost=");
        sb2.append(this.f17718o);
        sb2.append(", uploadThreadsCount=");
        sb2.append(this.f17719p);
        sb2.append(", uploadCdnName=");
        sb2.append(this.f17720q);
        sb2.append(", uploadUnreliability=");
        sb2.append(this.f17721r);
        sb2.append(", uploadEvents=");
        sb2.append(this.f17722s);
        sb2.append(", uploadMonitorType=");
        sb2.append(this.f17723t);
        sb2.append(", uploadSpeedBuffer=");
        sb2.append(this.f17724u);
        sb2.append(", uploadTrimmedSpeedBuffer=");
        sb2.append(this.f17725v);
        sb2.append(", testDuration=");
        sb2.append(this.f17726w);
        sb2.append(", uploadBufferFileSizes=");
        sb2.append(this.f17727x);
        sb2.append(", uploadBufferTimes=");
        return h0.b.r(sb2, this.f17728y, ')');
    }
}
