package ni;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class g extends vj.c {
    public final n0 A;
    public final String B;
    public final j1 C;
    public final m D;
    public final e0 E;
    public final a F;
    public final c G;
    public final d H;
    public final b I;
    public final e J;
    public final l0 K;
    public final i0 L;
    public final r M;
    public final k0 N;
    public final q0 O;
    public final y P;
    public final i Q;
    public final r0 R;
    public final Long S;
    public final int T;
    public final j U;
    public final k V;
    public final b0 W;
    public final Boolean X;
    public final Integer Y;
    public final Integer Z;

    /* renamed from: a, reason: collision with root package name */
    public final long f17822a;

    /* renamed from: b, reason: collision with root package name */
    public final long f17823b;

    /* renamed from: c, reason: collision with root package name */
    public final String f17824c;

    /* renamed from: d, reason: collision with root package name */
    public final String f17825d;

    /* renamed from: e, reason: collision with root package name */
    public final String f17826e;

    /* renamed from: f, reason: collision with root package name */
    public final long f17827f;

    /* renamed from: g, reason: collision with root package name */
    public final String f17828g;

    /* renamed from: h, reason: collision with root package name */
    public final Integer f17829h;

    /* renamed from: i, reason: collision with root package name */
    public final String f17830i;
    public final long j;
    public final String k;

    /* renamed from: l, reason: collision with root package name */
    public final String f17831l;

    /* renamed from: m, reason: collision with root package name */
    public final int f17832m;

    /* renamed from: n, reason: collision with root package name */
    public final int f17833n;

    /* renamed from: o, reason: collision with root package name */
    public final int f17834o;

    /* renamed from: p, reason: collision with root package name */
    public final String f17835p;

    /* renamed from: q, reason: collision with root package name */
    public final String f17836q;

    /* renamed from: r, reason: collision with root package name */
    public final j0 f17837r;

    /* renamed from: s, reason: collision with root package name */
    public final f0 f17838s;

    /* renamed from: t, reason: collision with root package name */
    public final c0 f17839t;

    /* renamed from: u, reason: collision with root package name */
    public final d0 f17840u;

    /* renamed from: v, reason: collision with root package name */
    public final m0 f17841v;

    /* renamed from: w, reason: collision with root package name */
    public final p0 f17842w;

    /* renamed from: x, reason: collision with root package name */
    public final l f17843x;

    /* renamed from: y, reason: collision with root package name */
    public final String f17844y;

    /* renamed from: z, reason: collision with root package name */
    public final int f17845z;

    public g(long j, long j7, String str, String str2, String str3, long j10, String str4, Integer num, String str5, long j11, String str6, String str7, int i10, int i11, int i12, String str8, String str9, j0 j0Var, f0 f0Var, c0 c0Var, d0 d0Var, m0 m0Var, p0 p0Var, l lVar, String str10, int i13, n0 n0Var, String str11, j1 j1Var, m mVar, e0 e0Var, a aVar, c cVar, d dVar, b bVar, e eVar, l0 l0Var, i0 i0Var, r rVar, k0 k0Var, q0 q0Var, y yVar, i iVar, r0 r0Var, Long l10, int i14, j jVar, k kVar, b0 b0Var, Boolean bool, Integer num2, Integer num3) {
        br.l.e(str, "taskName");
        br.l.e(str2, "jobType");
        br.l.e(str3, "dataEndpoint");
        br.l.e(str4, "deviceSdkInt");
        br.l.e(str5, "appVersion");
        br.l.e(str6, "sdkVersionCode");
        br.l.e(str7, "androidReleaseName");
        this.f17822a = j;
        this.f17823b = j7;
        this.f17824c = str;
        this.f17825d = str2;
        this.f17826e = str3;
        this.f17827f = j10;
        this.f17828g = str4;
        this.f17829h = num;
        this.f17830i = str5;
        this.j = j11;
        this.k = str6;
        this.f17831l = str7;
        this.f17832m = i10;
        this.f17833n = i11;
        this.f17834o = i12;
        this.f17835p = str8;
        this.f17836q = str9;
        this.f17837r = j0Var;
        this.f17838s = f0Var;
        this.f17839t = c0Var;
        this.f17840u = d0Var;
        this.f17841v = m0Var;
        this.f17842w = p0Var;
        this.f17843x = lVar;
        this.f17844y = str10;
        this.f17845z = i13;
        this.A = n0Var;
        this.B = str11;
        this.C = j1Var;
        this.D = mVar;
        this.E = e0Var;
        this.F = aVar;
        this.G = cVar;
        this.H = dVar;
        this.I = bVar;
        this.J = eVar;
        this.K = l0Var;
        this.L = i0Var;
        this.M = rVar;
        this.N = k0Var;
        this.O = q0Var;
        this.P = yVar;
        this.Q = iVar;
        this.R = r0Var;
        this.S = l10;
        this.T = i14;
        this.U = jVar;
        this.V = kVar;
        this.W = b0Var;
        this.X = bool;
        this.Y = num2;
        this.Z = num3;
    }

    @Override // vj.c
    public final String a() {
        return this.f17826e;
    }

    @Override // vj.c
    public final long b() {
        return this.f17822a;
    }

    @Override // vj.c
    public final String c() {
        return this.f17825d;
    }

    @Override // vj.c
    public final long d() {
        return this.f17823b;
    }

    @Override // vj.c
    public final String e() {
        return this.f17824c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f17822a == gVar.f17822a && this.f17823b == gVar.f17823b && br.l.a(this.f17824c, gVar.f17824c) && br.l.a(this.f17825d, gVar.f17825d) && br.l.a(this.f17826e, gVar.f17826e) && this.f17827f == gVar.f17827f && br.l.a(this.f17828g, gVar.f17828g) && br.l.a(this.f17829h, gVar.f17829h) && br.l.a(this.f17830i, gVar.f17830i) && this.j == gVar.j && br.l.a(this.k, gVar.k) && br.l.a(this.f17831l, gVar.f17831l) && this.f17832m == gVar.f17832m && this.f17833n == gVar.f17833n && this.f17834o == gVar.f17834o && br.l.a(this.f17835p, gVar.f17835p) && br.l.a(this.f17836q, gVar.f17836q) && br.l.a(this.f17837r, gVar.f17837r) && br.l.a(this.f17838s, gVar.f17838s) && br.l.a(this.f17839t, gVar.f17839t) && br.l.a(this.f17840u, gVar.f17840u) && br.l.a(this.f17841v, gVar.f17841v) && br.l.a(this.f17842w, gVar.f17842w) && br.l.a(this.f17843x, gVar.f17843x) && br.l.a(this.f17844y, gVar.f17844y) && this.f17845z == gVar.f17845z && br.l.a(this.A, gVar.A) && br.l.a(this.B, gVar.B) && br.l.a(this.C, gVar.C) && br.l.a(this.D, gVar.D) && br.l.a(this.E, gVar.E) && br.l.a(this.F, gVar.F) && br.l.a(this.G, gVar.G) && br.l.a(this.H, gVar.H) && br.l.a(this.I, gVar.I) && br.l.a(this.J, gVar.J) && br.l.a(this.K, gVar.K) && br.l.a(this.L, gVar.L) && br.l.a(this.M, gVar.M) && br.l.a(this.N, gVar.N) && br.l.a(this.O, gVar.O) && br.l.a(this.P, gVar.P) && br.l.a(this.Q, gVar.Q) && br.l.a(this.R, gVar.R) && br.l.a(this.S, gVar.S) && this.T == gVar.T && br.l.a(this.U, gVar.U) && br.l.a(this.V, gVar.V) && br.l.a(this.W, gVar.W) && br.l.a(this.X, gVar.X) && br.l.a(this.Y, gVar.Y) && br.l.a(this.Z, gVar.Z);
    }

    @Override // vj.c
    public final long f() {
        return this.f17827f;
    }

    @Override // vj.c
    public final void g(JSONObject jSONObject) throws JSONException {
        jSONObject.put("device_sdk_int", this.f17828g);
        xu.d.Y(jSONObject, "device_sdk_int_full", this.f17829h);
        jSONObject.put("app_version", this.f17830i);
        jSONObject.put("CLIENT_VRS_CODE", this.j);
        jSONObject.put("ANDROID_VRS", this.f17831l);
        jSONObject.put("DC_VRS_CODE", this.k);
        jSONObject.put("DB_VRS_CODE", this.f17832m);
        jSONObject.put("REPORT_CONFIG_REVISION", this.f17833n);
        jSONObject.put("REPORT_CONFIG_ID", this.f17834o);
        jSONObject.put("CONFIG_HASH", this.f17835p);
        jSONObject.put("COHORT_ID", this.f17836q);
        jSONObject.put("CELLS_INFO", this.f17844y);
        jSONObject.put("NETWORK_CONNECTION_TYPE", this.f17845z);
        xu.d.Y(jSONObject, "EXPERIMENTAL", this.B);
        j0 j0Var = this.f17837r;
        if (j0Var != null) {
            jSONObject.put("SERVICE_STATE", new JSONObject(j0Var.a()));
        }
        f0 f0Var = this.f17838s;
        if (f0Var != null) {
            jSONObject.put("PERMISSION_STATE", new JSONObject(f0Var.a()));
        }
        m0 m0Var = this.f17841v;
        if (m0Var != null) {
            jSONObject.put("SUBSCRIPTIONS", new JSONObject(m0Var.a()));
        }
        p0 p0Var = this.f17842w;
        if (p0Var != null) {
            jSONObject.put("TELEPHONY_DATA", new JSONObject(p0Var.a()));
        }
        c0 c0Var = this.f17839t;
        if (c0Var != null) {
            jSONObject.put("LOCATION_DATA", new JSONObject(c0Var.a()));
        }
        d0 d0Var = this.f17840u;
        if (d0Var != null) {
            JSONObject jSONObject2 = new JSONObject();
            xu.d.Y(jSONObject2, "location_enabled", d0Var.f17740a);
            String string = jSONObject2.toString();
            br.l.d(string, "toString(...)");
            jSONObject.put("LOCATION_SETTINGS", new JSONObject(string));
        }
        if (m0Var != null) {
            jSONObject.put("SUBSCRIPTIONS", new JSONObject(m0Var.a()));
        }
        if (f0Var != null) {
            jSONObject.put("PERMISSION_STATE", new JSONObject(f0Var.a()));
        }
        if (j0Var != null) {
            jSONObject.put("SERVICE_STATE", new JSONObject(j0Var.a()));
        }
        n0 n0Var = this.A;
        if (n0Var != null) {
            jSONObject.put("SYSTEM_STATUS", new JSONObject(n0Var.a()));
        }
        j1 j1Var = this.C;
        if (j1Var != null) {
            jSONObject.put("WIFI_STATUS", new JSONObject(j1Var.a()));
        }
        m mVar = this.D;
        if (mVar != null) {
            jSONObject.put("DHCP_STATUS", new JSONObject(mVar.a()));
        }
        e0 e0Var = this.E;
        if (e0Var != null) {
            jSONObject.put("NETWORK_CAPABILITY", new JSONObject(e0Var.a()));
        }
        a aVar = this.F;
        if (aVar != null) {
            jSONObject.put("BATTERY_STATUS", new JSONObject(aVar.a()));
        }
        c cVar = this.G;
        if (cVar != null) {
            jSONObject.put("CELL_INFO_GSM", new JSONObject(cVar.a()));
        }
        d dVar = this.H;
        if (dVar != null) {
            jSONObject.put("CELL_INFO_LTE", new JSONObject(dVar.a()));
        }
        b bVar = this.I;
        if (bVar != null) {
            jSONObject.put("CELL_INFO_CDMA", new JSONObject(bVar.a()));
        }
        e eVar = this.J;
        if (eVar != null) {
            jSONObject.put("CELL_INFO_WCDMA", new JSONObject(eVar.a()));
        }
        l0 l0Var = this.K;
        if (l0Var != null) {
            jSONObject.put("SIM_CARRIER", new JSONObject(l0Var.a()));
        }
        i0 i0Var = this.L;
        if (i0Var != null) {
            JSONObject jSONObject3 = new JSONObject();
            xu.d.Y(jSONObject3, "is_screen_on", i0Var.f17921a);
            xu.d.Y(jSONObject3, "is_screen_locked", i0Var.f17922b);
            String string2 = jSONObject3.toString();
            br.l.d(string2, "toString(...)");
            jSONObject.put("SCREEN_STATUS", new JSONObject(string2));
        }
        r rVar = this.M;
        if (rVar != null) {
            jSONObject.put("ESIM_STATUS", new JSONObject(rVar.a()));
        }
        l lVar = this.f17843x;
        if (lVar != null) {
            jSONObject.put("DEVICE_SETTINGS", new JSONObject(lVar.a()));
        }
        k0 k0Var = this.N;
        if (k0Var != null) {
            jSONObject.put("SIGNAL_STRENGTH_FIELDS", new JSONObject(k0Var.a()));
        }
        q0 q0Var = this.O;
        if (q0Var != null) {
            jSONObject.put("TELEPHONY_DISPLAY_INFO", new JSONObject(q0Var.a()));
        }
        y yVar = this.P;
        if (yVar != null) {
            yVar.getClass();
            JSONObject jSONObject4 = new JSONObject();
            xu.d.Y(jSONObject4, "last_public_ip", yVar.f18297a);
            xu.d.Y(jSONObject4, "last_public_ip_timestamp", yVar.f18298b);
            xu.d.Y(jSONObject4, "last_public_ips", yVar.f18299c);
            String string3 = jSONObject4.toString();
            br.l.d(string3, "toString(...)");
            jSONObject.put("LAST_PUBLIC_IP", new JSONObject(string3));
        }
        i iVar = this.Q;
        if (iVar != null) {
            jSONObject.put("DATA_USAGE", new JSONObject(iVar.a()));
        }
        r0 r0Var = this.R;
        if (r0Var != null) {
            r0Var.getClass();
            JSONObject jSONObject5 = new JSONObject();
            xu.d.Y(jSONObject5, "physical_channel_config_string", r0Var.f18119a);
            xu.d.Y(jSONObject5, "physical_channel_config_timestamp", r0Var.f18120b);
            String string4 = jSONObject5.toString();
            br.l.d(string4, "toString(...)");
            jSONObject.put("TELEPHONY_PHYSICAL_CHANNEL_CONFIG", new JSONObject(string4));
        }
        Long l10 = this.S;
        if (l10 != null) {
            jSONObject.put("ELAPSED_REAL_TIME", l10.longValue());
        }
        jSONObject.put("AUDIO_MODE", this.T);
        j jVar = this.U;
        if (jVar != null) {
            jVar.getClass();
            JSONObject jSONObject6 = new JSONObject();
            xu.d.Y(jSONObject6, "connection_id", jVar.f17947a);
            xu.d.Y(jSONObject6, "connection_start_time", jVar.f17948b);
            xu.d.Y(jSONObject6, "connection_tx_bytes", jVar.f17949c);
            xu.d.Y(jSONObject6, "connection_tx_bytes_wifi", jVar.f17950d);
            xu.d.Y(jSONObject6, "connection_tx_bytes_cell", jVar.f17951e);
            xu.d.Y(jSONObject6, "connection_rx_bytes", jVar.f17952f);
            xu.d.Y(jSONObject6, "connection_rx_bytes_wifi", jVar.f17953g);
            xu.d.Y(jSONObject6, "connection_rx_bytes_cell", jVar.f17954h);
            String string5 = jSONObject6.toString();
            br.l.d(string5, "toString(...)");
            jSONObject.put("DEVICE_CONNECTION", new JSONObject(string5));
        }
        k kVar = this.V;
        if (kVar != null) {
            kVar.getClass();
            JSONObject jSONObject7 = new JSONObject();
            xu.d.Y(jSONObject7, "DEVICE_STORAGE_FREE_BYTES", kVar.f17988a);
            xu.d.Y(jSONObject7, "DEVICE_STORAGE_USED_BYTES", kVar.f17989b);
            xu.d.Y(jSONObject7, "DEVICE_RAM_FREE_BYTES", kVar.f17990c);
            xu.d.Y(jSONObject7, "DEVICE_RAM_USED_BYTES", kVar.f17991d);
            String string6 = jSONObject7.toString();
            br.l.d(string6, "toString(...)");
            jSONObject.put("DEVICE_INFO", new JSONObject(string6));
        }
        b0 b0Var = this.W;
        if (b0Var != null) {
            b0Var.getClass();
            JSONObject jSONObject8 = new JSONObject();
            xu.d.Y(jSONObject8, "light_acc", b0Var.f17669a);
            xu.d.Y(jSONObject8, "light", b0Var.f17670b);
            String string7 = jSONObject8.toString();
            br.l.d(string7, "toString(...)");
            jSONObject.put("LIGHT_SENSOR", new JSONObject(string7));
        }
        xu.d.Y(jSONObject, "IS_CONNECTED", this.X);
        xu.d.Y(jSONObject, "NETWORK_STATE", this.Y);
        xu.d.Y(jSONObject, "NETWORK_DETAILED_STATE", this.Z);
    }

    public final int hashCode() {
        int iG = c7.a.g(this.f17828g, h0.b.b(c7.a.g(this.f17826e, c7.a.g(this.f17825d, c7.a.g(this.f17824c, h0.b.b(Long.hashCode(this.f17822a) * 31, 31, this.f17823b), 31), 31), 31), 31, this.f17827f), 31);
        Integer num = this.f17829h;
        int iG2 = c7.a.g(this.f17836q, c7.a.g(this.f17835p, c7.a.C(this.f17834o, c7.a.C(this.f17833n, c7.a.C(this.f17832m, c7.a.g(this.f17831l, c7.a.g(this.k, h0.b.b(c7.a.g(this.f17830i, (iG + (num == null ? 0 : num.hashCode())) * 31, 31), 31, this.j), 31), 31), 31), 31), 31), 31), 31);
        j0 j0Var = this.f17837r;
        int iHashCode = (iG2 + (j0Var == null ? 0 : j0Var.hashCode())) * 31;
        f0 f0Var = this.f17838s;
        int iHashCode2 = (iHashCode + (f0Var == null ? 0 : f0Var.hashCode())) * 31;
        c0 c0Var = this.f17839t;
        int iHashCode3 = (iHashCode2 + (c0Var == null ? 0 : c0Var.hashCode())) * 31;
        d0 d0Var = this.f17840u;
        int iHashCode4 = (iHashCode3 + (d0Var == null ? 0 : d0Var.hashCode())) * 31;
        m0 m0Var = this.f17841v;
        int iHashCode5 = (iHashCode4 + (m0Var == null ? 0 : m0Var.hashCode())) * 31;
        p0 p0Var = this.f17842w;
        int iHashCode6 = (iHashCode5 + (p0Var == null ? 0 : p0Var.hashCode())) * 31;
        l lVar = this.f17843x;
        int iHashCode7 = (iHashCode6 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        String str = this.f17844y;
        int iC = c7.a.C(this.f17845z, (iHashCode7 + (str == null ? 0 : str.hashCode())) * 31, 31);
        n0 n0Var = this.A;
        int iHashCode8 = (iC + (n0Var == null ? 0 : n0Var.hashCode())) * 31;
        String str2 = this.B;
        int iHashCode9 = (iHashCode8 + (str2 == null ? 0 : str2.hashCode())) * 31;
        j1 j1Var = this.C;
        int iHashCode10 = (iHashCode9 + (j1Var == null ? 0 : j1Var.hashCode())) * 31;
        m mVar = this.D;
        int iHashCode11 = (iHashCode10 + (mVar == null ? 0 : mVar.hashCode())) * 31;
        e0 e0Var = this.E;
        int iHashCode12 = (iHashCode11 + (e0Var == null ? 0 : e0Var.hashCode())) * 31;
        a aVar = this.F;
        int iHashCode13 = (iHashCode12 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        c cVar = this.G;
        int iHashCode14 = (iHashCode13 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        d dVar = this.H;
        int iHashCode15 = (iHashCode14 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        b bVar = this.I;
        int iHashCode16 = (iHashCode15 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        e eVar = this.J;
        int iHashCode17 = (iHashCode16 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        l0 l0Var = this.K;
        int iHashCode18 = (iHashCode17 + (l0Var == null ? 0 : l0Var.hashCode())) * 31;
        i0 i0Var = this.L;
        int iHashCode19 = (iHashCode18 + (i0Var == null ? 0 : i0Var.hashCode())) * 31;
        r rVar = this.M;
        int iHashCode20 = (iHashCode19 + (rVar == null ? 0 : rVar.hashCode())) * 31;
        k0 k0Var = this.N;
        int iHashCode21 = (iHashCode20 + (k0Var == null ? 0 : k0Var.hashCode())) * 31;
        q0 q0Var = this.O;
        int iHashCode22 = (iHashCode21 + (q0Var == null ? 0 : q0Var.hashCode())) * 31;
        y yVar = this.P;
        int iHashCode23 = (iHashCode22 + (yVar == null ? 0 : yVar.hashCode())) * 31;
        i iVar = this.Q;
        int iHashCode24 = (iHashCode23 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        r0 r0Var = this.R;
        int iHashCode25 = (iHashCode24 + (r0Var == null ? 0 : r0Var.hashCode())) * 31;
        Long l10 = this.S;
        int iC2 = c7.a.C(this.T, (iHashCode25 + (l10 == null ? 0 : l10.hashCode())) * 31, 31);
        j jVar = this.U;
        int iHashCode26 = (iC2 + (jVar == null ? 0 : jVar.hashCode())) * 31;
        k kVar = this.V;
        int iHashCode27 = (iHashCode26 + (kVar == null ? 0 : kVar.hashCode())) * 31;
        b0 b0Var = this.W;
        int iHashCode28 = (iHashCode27 + (b0Var == null ? 0 : b0Var.hashCode())) * 31;
        Boolean bool = this.X;
        int iHashCode29 = (iHashCode28 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num2 = this.Y;
        int iHashCode30 = (iHashCode29 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.Z;
        return iHashCode30 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CoreResultItem(id=");
        sb2.append(this.f17822a);
        sb2.append(", taskId=");
        sb2.append(this.f17823b);
        sb2.append(", taskName=");
        sb2.append(this.f17824c);
        sb2.append(", jobType=");
        sb2.append(this.f17825d);
        sb2.append(", dataEndpoint=");
        sb2.append(this.f17826e);
        sb2.append(", timeOfResult=");
        sb2.append(this.f17827f);
        sb2.append(", deviceSdkInt=");
        sb2.append(this.f17828g);
        sb2.append(", deviceSdkIntFull=");
        sb2.append(this.f17829h);
        sb2.append(", appVersion=");
        sb2.append(this.f17830i);
        sb2.append(", clientVersionCode=");
        sb2.append(this.j);
        sb2.append(", sdkVersionCode=");
        sb2.append(this.k);
        sb2.append(", androidReleaseName=");
        sb2.append(this.f17831l);
        sb2.append(", databaseVersionCode=");
        sb2.append(this.f17832m);
        sb2.append(", configRevision=");
        sb2.append(this.f17833n);
        sb2.append(", configId=");
        sb2.append(this.f17834o);
        sb2.append(", configHash=");
        sb2.append(this.f17835p);
        sb2.append(", cohortId=");
        sb2.append(this.f17836q);
        sb2.append(", serviceStateCoreResult=");
        sb2.append(this.f17837r);
        sb2.append(", permissionCoreResult=");
        sb2.append(this.f17838s);
        sb2.append(", locationCoreResult=");
        sb2.append(this.f17839t);
        sb2.append(", locationSettingsResult=");
        sb2.append(this.f17840u);
        sb2.append(", subscriptionCoreResult=");
        sb2.append(this.f17841v);
        sb2.append(", telephonyCoreResult=");
        sb2.append(this.f17842w);
        sb2.append(", deviceSettingsCoreResult=");
        sb2.append(this.f17843x);
        sb2.append(", cellsInfoJson=");
        sb2.append(this.f17844y);
        sb2.append(", networkConnectionType=");
        sb2.append(this.f17845z);
        sb2.append(", systemStatusCoreResult=");
        sb2.append(this.A);
        sb2.append(", experimental=");
        sb2.append(this.B);
        sb2.append(", wifiStatusCoreResult=");
        sb2.append(this.C);
        sb2.append(", dhcpStatusCoreResult=");
        sb2.append(this.D);
        sb2.append(", networkCapabilityCoreResult=");
        sb2.append(this.E);
        sb2.append(", batteryStatusCoreResult=");
        sb2.append(this.F);
        sb2.append(", cellInfoGsmCoreResult=");
        sb2.append(this.G);
        sb2.append(", cellInfoLteCoreResult=");
        sb2.append(this.H);
        sb2.append(", cellInfoCdmaCoreResult=");
        sb2.append(this.I);
        sb2.append(", cellInfoWcdmaCoreResult=");
        sb2.append(this.J);
        sb2.append(", simCarrierCoreResult=");
        sb2.append(this.K);
        sb2.append(", screenStatusCoreResult=");
        sb2.append(this.L);
        sb2.append(", esimStatusCoreResult=");
        sb2.append(this.M);
        sb2.append(", signalStrengthFieldsCoreResult=");
        sb2.append(this.N);
        sb2.append(", telephonyDisplayInfoCoreResult=");
        sb2.append(this.O);
        sb2.append(", lastPublicIpCoreResult=");
        sb2.append(this.P);
        sb2.append(", dataUsageCoreResult=");
        sb2.append(this.Q);
        sb2.append(", telephonyPhysicalChannelConfigCoreResult=");
        sb2.append(this.R);
        sb2.append(", elapsedRealTime=");
        sb2.append(this.S);
        sb2.append(", audioMode=");
        sb2.append(this.T);
        sb2.append(", deviceConnectionCoreResult=");
        sb2.append(this.U);
        sb2.append(", deviceInfoCoreResult=");
        sb2.append(this.V);
        sb2.append(", lightSensorCoreResult=");
        sb2.append(this.W);
        sb2.append(", isConnected=");
        sb2.append(this.X);
        sb2.append(", networkState=");
        sb2.append(this.Y);
        sb2.append(", networkDetailedState=");
        return w.g.i(sb2, this.Z, ')');
    }
}
