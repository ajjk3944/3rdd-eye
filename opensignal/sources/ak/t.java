package ak;

import android.os.Build;
import java.util.List;

/* loaded from: classes.dex */
public final class t {
    public final int A;
    public final Double B;
    public final Double C;
    public final String D;
    public final String E;
    public final Integer F;
    public final String G;
    public final String H;
    public final String I;
    public final String J;
    public final Long K;
    public final Long L;
    public final String M;
    public final String N;
    public final String O;
    public final Integer P;
    public final Integer Q;
    public final String R;
    public final Integer S;
    public final String T;

    /* renamed from: a, reason: collision with root package name */
    public final String f696a;

    /* renamed from: b, reason: collision with root package name */
    public final String f697b;

    /* renamed from: c, reason: collision with root package name */
    public final String f698c;

    /* renamed from: d, reason: collision with root package name */
    public final String f699d;

    /* renamed from: e, reason: collision with root package name */
    public final String f700e;

    /* renamed from: f, reason: collision with root package name */
    public final String f701f;

    /* renamed from: g, reason: collision with root package name */
    public final String f702g;

    /* renamed from: h, reason: collision with root package name */
    public final String f703h;

    /* renamed from: i, reason: collision with root package name */
    public final String f704i;
    public final String j;
    public final String k;

    /* renamed from: l, reason: collision with root package name */
    public final List f705l;

    /* renamed from: m, reason: collision with root package name */
    public final String f706m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f707n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f708o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f709p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f710q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f711r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f712s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f713t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f714u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f715v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f716w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f717x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f718y;

    /* renamed from: z, reason: collision with root package name */
    public final String f719z;

    public t(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List list, String str12, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, String str13, int i10, Double d6, Double d10, String str14, String str15, Integer num, String str16, String str17, String str18, String str19, Long l10, Long l11, String str20, String str21, String str22, Integer num2, Integer num3, String str23, Integer num4, String str24) {
        String str25 = Build.MODEL;
        String str26 = Build.MANUFACTURER;
        String str27 = Build.TAGS;
        String str28 = Build.HARDWARE;
        br.l.e(str25, "model");
        br.l.e(str26, "manufacturer");
        br.l.e(str2, "tosAppVersionCode");
        br.l.e(str3, "phoneType");
        br.l.e(str6, "tosTime");
        br.l.e(str10, "configId");
        br.l.e(str11, "packageName");
        br.l.e(str12, "androidTargetSdk");
        br.l.e(str28, "hardware");
        this.f696a = str;
        this.f697b = str2;
        this.f698c = str3;
        this.f699d = str4;
        this.f700e = str5;
        this.f701f = str6;
        this.f702g = str7;
        this.f703h = str8;
        this.f704i = str9;
        this.j = str10;
        this.k = str11;
        this.f705l = list;
        this.f706m = str12;
        this.f707n = z10;
        this.f708o = z11;
        this.f709p = z12;
        this.f710q = z13;
        this.f711r = z14;
        this.f712s = z15;
        this.f713t = z16;
        this.f714u = z17;
        this.f715v = z18;
        this.f716w = z19;
        this.f717x = z20;
        this.f718y = z21;
        this.f719z = str13;
        this.A = i10;
        this.B = d6;
        this.C = d10;
        this.D = str14;
        this.E = str15;
        this.F = num;
        this.G = str16;
        this.H = str17;
        this.I = str18;
        this.J = str19;
        this.K = l10;
        this.L = l11;
        this.M = str20;
        this.N = str21;
        this.O = str22;
        this.P = num2;
        this.Q = num3;
        this.R = str23;
        this.S = num4;
        this.T = str24;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        String str = Build.MODEL;
        if (!br.l.a(str, str)) {
            return false;
        }
        String str2 = Build.MANUFACTURER;
        if (!br.l.a(str2, str2) || !br.l.a(this.f696a, tVar.f696a) || !br.l.a(this.f697b, tVar.f697b) || !br.l.a(this.f698c, tVar.f698c) || !br.l.a(this.f699d, tVar.f699d) || !br.l.a(this.f700e, tVar.f700e) || !br.l.a(this.f701f, tVar.f701f) || !this.f702g.equals(tVar.f702g) || !this.f703h.equals(tVar.f703h) || !br.l.a(this.f704i, tVar.f704i) || !br.l.a(this.j, tVar.j) || !br.l.a(this.k, tVar.k) || !this.f705l.equals(tVar.f705l) || !br.l.a(this.f706m, tVar.f706m) || this.f707n != tVar.f707n || this.f708o != tVar.f708o || this.f709p != tVar.f709p || this.f710q != tVar.f710q || this.f711r != tVar.f711r || this.f712s != tVar.f712s || this.f713t != tVar.f713t || this.f714u != tVar.f714u || this.f715v != tVar.f715v || this.f716w != tVar.f716w || this.f717x != tVar.f717x || this.f718y != tVar.f718y || !br.l.a(this.f719z, tVar.f719z) || this.A != tVar.A || !br.l.a(this.B, tVar.B) || !br.l.a(this.C, tVar.C) || !br.l.a(this.D, tVar.D) || !br.l.a(this.E, tVar.E) || !this.F.equals(tVar.F) || !br.l.a(this.G, tVar.G) || !br.l.a(this.H, tVar.H) || !br.l.a(this.I, tVar.I) || !br.l.a(this.J, tVar.J)) {
            return false;
        }
        String str3 = Build.TAGS;
        if (!br.l.a(str3, str3) || !br.l.a(this.K, tVar.K) || !br.l.a(this.L, tVar.L) || !br.l.a(this.M, tVar.M) || !br.l.a(this.N, tVar.N) || !br.l.a(this.O, tVar.O) || !br.l.a(this.P, tVar.P) || !br.l.a(this.Q, tVar.Q)) {
            return false;
        }
        String str4 = Build.HARDWARE;
        return br.l.a(str4, str4) && br.l.a(this.R, tVar.R) && br.l.a(this.S, tVar.S) && br.l.a(this.T, tVar.T);
    }

    public final int hashCode() {
        int iG = c7.a.g(Build.MANUFACTURER, Build.MODEL.hashCode() * 31, 31);
        String str = this.f696a;
        int iG2 = c7.a.g(this.f698c, c7.a.g(this.f697b, (iG + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
        String str2 = this.f699d;
        int iHashCode = (iG2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f700e;
        int iG3 = c7.a.g(this.f703h, c7.a.g(this.f702g, c7.a.g(this.f701f, (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31, 31), 31), 31);
        String str4 = this.f704i;
        int iB = w.g.b(w.g.b(w.g.b(w.g.b(w.g.b(w.g.b(w.g.b(w.g.b(w.g.b(w.g.b(w.g.b(w.g.b(c7.a.g(this.f706m, h0.b.c(c7.a.g(this.k, c7.a.g(this.j, (iG3 + (str4 == null ? 0 : str4.hashCode())) * 31, 31), 31), 31, this.f705l), 31), this.f707n, 31), this.f708o, 31), this.f709p, 31), this.f710q, 31), this.f711r, 31), this.f712s, 31), this.f713t, 31), this.f714u, 31), this.f715v, 31), this.f716w, 31), this.f717x, 31), this.f718y, 31);
        String str5 = this.f719z;
        int iC = c7.a.C(this.A, (iB + (str5 == null ? 0 : str5.hashCode())) * 31, 31);
        Double d6 = this.B;
        int iHashCode2 = (iC + (d6 == null ? 0 : d6.hashCode())) * 31;
        Double d10 = this.C;
        int iHashCode3 = (iHashCode2 + (d10 == null ? 0 : d10.hashCode())) * 31;
        String str6 = this.D;
        int iHashCode4 = (iHashCode3 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.E;
        int iC2 = c7.a.C(4, (this.F.hashCode() + ((iHashCode4 + (str7 == null ? 0 : str7.hashCode())) * 31)) * 31, 31);
        String str8 = this.G;
        int iHashCode5 = (iC2 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.H;
        int iHashCode6 = (iHashCode5 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.I;
        int iHashCode7 = (iHashCode6 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.J;
        int iHashCode8 = (iHashCode7 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = Build.TAGS;
        int iHashCode9 = (iHashCode8 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Long l10 = this.K;
        int iHashCode10 = (iHashCode9 + (l10 == null ? 0 : l10.hashCode())) * 31;
        Long l11 = this.L;
        int iHashCode11 = (iHashCode10 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str13 = this.M;
        int iHashCode12 = (iHashCode11 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.N;
        int iHashCode13 = (iHashCode12 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.O;
        int iHashCode14 = (iHashCode13 + (str15 == null ? 0 : str15.hashCode())) * 31;
        Integer num = this.P;
        int iHashCode15 = (iHashCode14 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.Q;
        int iC3 = c7.a.C(16, w.g.b(c7.a.g(Build.HARDWARE, (iHashCode15 + (num2 == null ? 0 : num2.hashCode())) * 31, 31), false, 31), 31);
        String str16 = this.R;
        int iHashCode16 = (((iC3 + (str16 == null ? 0 : str16.hashCode())) * 31) + 966202827) * 31;
        Integer num3 = this.S;
        int iHashCode17 = (iHashCode16 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str17 = this.T;
        return iHashCode17 + (str17 != null ? str17.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeviceInstallationInfo(model=");
        sb2.append(Build.MODEL);
        sb2.append(", manufacturer=");
        sb2.append(Build.MANUFACTURER);
        sb2.append(", manufacturerCode=");
        sb2.append(this.f696a);
        sb2.append(", tosAppVersionCode=");
        sb2.append(this.f697b);
        sb2.append(", phoneType=");
        sb2.append(this.f698c);
        sb2.append(", tosNetworkId=");
        sb2.append(this.f699d);
        sb2.append(", tosNetworkIdSim=");
        sb2.append(this.f700e);
        sb2.append(", tosTime=");
        sb2.append(this.f701f);
        sb2.append(", clientCode=");
        sb2.append(this.f702g);
        sb2.append(", deviceIdTime=");
        sb2.append(this.f703h);
        sb2.append(", typeAllocationCode=");
        sb2.append(this.f704i);
        sb2.append(", configId=");
        sb2.append(this.j);
        sb2.append(", packageName=");
        sb2.append(this.k);
        sb2.append(", installedSdkPackages=");
        sb2.append(this.f705l);
        sb2.append(", androidTargetSdk=");
        sb2.append(this.f706m);
        sb2.append(", hasPhoneStatePermission=");
        sb2.append(this.f707n);
        sb2.append(", hasReadBasicPhoneStatePermission=");
        sb2.append(this.f708o);
        sb2.append(", hasFineLocationPermission=");
        sb2.append(this.f709p);
        sb2.append(", hasCoarseLocationPermission=");
        sb2.append(this.f710q);
        sb2.append(", hasBackgroundLocationPermission=");
        sb2.append(this.f711r);
        sb2.append(", hasAccessWifiStatePermission=");
        sb2.append(this.f712s);
        sb2.append(", hasAccessNetworkStatePermission=");
        sb2.append(this.f713t);
        sb2.append(", hasReceiveBootCompletedPermission=");
        sb2.append(this.f714u);
        sb2.append(", hasRequestIgnoreBatteryOptimisations=");
        sb2.append(this.f715v);
        sb2.append(", isCoreEnabled=");
        sb2.append(this.f716w);
        sb2.append(", isSpeedCellEnabled=");
        sb2.append(this.f717x);
        sb2.append(", isSpeedWifiEnabled=");
        sb2.append(this.f718y);
        sb2.append(", sbNetworkId=");
        sb2.append(this.f719z);
        sb2.append(", googlePlayServicesVersion=");
        sb2.append(this.A);
        sb2.append(", latitude=");
        sb2.append(this.B);
        sb2.append(", longitude=");
        sb2.append(this.C);
        sb2.append(", networkOperatorName=");
        sb2.append(this.D);
        sb2.append(", simOperatorName=");
        sb2.append(this.E);
        sb2.append(", phoneCount=");
        sb2.append(this.F);
        sb2.append(", sdkGeneration=4, socManufacturer=");
        sb2.append(this.G);
        sb2.append(", socModel=");
        sb2.append(this.H);
        sb2.append(", sku=");
        sb2.append(this.I);
        sb2.append(", odmSku=");
        sb2.append(this.J);
        sb2.append(", tags=");
        sb2.append(Build.TAGS);
        sb2.append(", ramTotalBytes=");
        sb2.append(this.K);
        sb2.append(", storageTotalBytes=");
        sb2.append(this.L);
        sb2.append(", deviceLanguage=");
        sb2.append(this.M);
        sb2.append(", deviceCountryCode=");
        sb2.append(this.N);
        sb2.append(", deviceUserAgent=");
        sb2.append(this.O);
        sb2.append(", screenWidthInLandscape=");
        sb2.append(this.P);
        sb2.append(", screenHeightInLandscape=");
        sb2.append(this.Q);
        sb2.append(", hardware=");
        sb2.append(Build.HARDWARE);
        sb2.append(", isSdkProcess=false, pid=16, registrationKey=");
        sb2.append(this.R);
        sb2.append(", sdkPackageName=com.opensignal.sdk, timezoneOffsetMs=");
        sb2.append(this.S);
        sb2.append(", timezoneId=");
        return h0.b.r(sb2, this.T, ')');
    }
}
