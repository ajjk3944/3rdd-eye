package com.yandex.mobile.ads.impl;

import Q9.C1526e;
import R9.AbstractC1564a;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.Location;
import android.net.Uri;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.telephony.CellLocation;
import android.telephony.TelephonyManager;
import android.telephony.gsm.GsmCellLocation;
import b9.C2001h;
import b9.InterfaceC2000g;
import c9.C2090k;
import c9.C2097r;
import c9.C2099t;
import com.applovin.sdk.AppLovinEventTypes;
import com.singular.sdk.internal.Constants;
import com.yandex.mobile.ads.impl.cq;
import com.yandex.mobile.ads.impl.ew1;
import com.yandex.mobile.ads.impl.ks0;
import d9.C4285c;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p9.InterfaceC5480a;

/* loaded from: classes3.dex */
public final class za0 {

    /* renamed from: a, reason: collision with root package name */
    private final l7 f36264a;

    /* renamed from: b, reason: collision with root package name */
    private final q50 f36265b;

    /* renamed from: c, reason: collision with root package name */
    private final x9.g<Map.Entry<String, Object>> f36266c;

    /* renamed from: d, reason: collision with root package name */
    private final x9.g<Map.Entry<String, Object>> f36267d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC2000g f36268e;

    public static final class a {

        /* renamed from: A, reason: collision with root package name */
        private Integer f36269A;

        /* renamed from: A0, reason: collision with root package name */
        private String f36270A0;

        /* renamed from: B, reason: collision with root package name */
        private Integer f36271B;

        /* renamed from: B0, reason: collision with root package name */
        private String f36272B0;

        /* renamed from: C, reason: collision with root package name */
        private Float f36273C;

        /* renamed from: C0, reason: collision with root package name */
        private String f36274C0;

        /* renamed from: D, reason: collision with root package name */
        private Integer f36275D;

        /* renamed from: D0, reason: collision with root package name */
        private String f36276D0;

        /* renamed from: E, reason: collision with root package name */
        private Integer f36277E;

        /* renamed from: E0, reason: collision with root package name */
        private String f36278E0;

        /* renamed from: F, reason: collision with root package name */
        private String f36279F;
        private String F0;

        /* renamed from: G, reason: collision with root package name */
        private String f36280G;

        /* renamed from: G0, reason: collision with root package name */
        private String f36281G0;

        /* renamed from: H, reason: collision with root package name */
        private h7 f36282H;

        /* renamed from: H0, reason: collision with root package name */
        private Boolean f36283H0;

        /* renamed from: I, reason: collision with root package name */
        private Integer f36284I;

        /* renamed from: I0, reason: collision with root package name */
        private String f36285I0;

        /* renamed from: J, reason: collision with root package name */
        private Integer f36286J;

        /* renamed from: J0, reason: collision with root package name */
        private String f36287J0;

        /* renamed from: K, reason: collision with root package name */
        private String f36288K;

        /* renamed from: K0, reason: collision with root package name */
        private String f36289K0;

        /* renamed from: L, reason: collision with root package name */
        private Boolean f36290L;

        /* renamed from: L0, reason: collision with root package name */
        private String f36291L0;

        /* renamed from: M, reason: collision with root package name */
        private Boolean f36292M;

        /* renamed from: M0, reason: collision with root package name */
        private String f36293M0;

        /* renamed from: N, reason: collision with root package name */
        private String f36294N;

        /* renamed from: N0, reason: collision with root package name */
        private String f36295N0;

        /* renamed from: O, reason: collision with root package name */
        private Boolean f36296O;

        /* renamed from: O0, reason: collision with root package name */
        private Boolean f36297O0;

        /* renamed from: P, reason: collision with root package name */
        private String f36298P;

        /* renamed from: P0, reason: collision with root package name */
        private Boolean f36299P0;

        /* renamed from: Q, reason: collision with root package name */
        private Integer f36300Q;

        /* renamed from: Q0, reason: collision with root package name */
        private Boolean f36301Q0;

        /* renamed from: R, reason: collision with root package name */
        private Boolean f36302R;

        /* renamed from: S, reason: collision with root package name */
        private String f36303S;

        /* renamed from: T, reason: collision with root package name */
        private String f36304T;

        /* renamed from: U, reason: collision with root package name */
        private String f36305U;

        /* renamed from: V, reason: collision with root package name */
        private String f36306V;

        /* renamed from: W, reason: collision with root package name */
        private String f36307W;

        /* renamed from: X, reason: collision with root package name */
        private Long f36308X;

        /* renamed from: Y, reason: collision with root package name */
        private String f36309Y;

        /* renamed from: Z, reason: collision with root package name */
        private String f36310Z;

        /* renamed from: a, reason: collision with root package name */
        private final boolean f36311a;

        /* renamed from: a0, reason: collision with root package name */
        private String f36312a0;

        /* renamed from: b0, reason: collision with root package name */
        private String f36314b0;

        /* renamed from: c0, reason: collision with root package name */
        private String f36316c0;

        /* renamed from: d0, reason: collision with root package name */
        private String f36318d0;

        /* renamed from: e0, reason: collision with root package name */
        private String f36320e0;

        /* renamed from: f, reason: collision with root package name */
        private boolean f36321f;

        /* renamed from: f0, reason: collision with root package name */
        private String f36322f0;

        /* renamed from: g0, reason: collision with root package name */
        private String f36324g0;

        /* renamed from: h0, reason: collision with root package name */
        private String f36326h0;
        private Boolean i;

        /* renamed from: i0, reason: collision with root package name */
        private String f36327i0;

        /* renamed from: j, reason: collision with root package name */
        private Boolean f36328j;

        /* renamed from: j0, reason: collision with root package name */
        private String f36329j0;

        /* renamed from: k, reason: collision with root package name */
        private String f36330k;

        /* renamed from: k0, reason: collision with root package name */
        private String f36331k0;

        /* renamed from: l, reason: collision with root package name */
        private Integer f36332l;

        /* renamed from: l0, reason: collision with root package name */
        private String f36333l0;

        /* renamed from: m, reason: collision with root package name */
        private boolean f36334m;

        /* renamed from: m0, reason: collision with root package name */
        private String f36335m0;

        /* renamed from: n, reason: collision with root package name */
        private String f36336n;

        /* renamed from: n0, reason: collision with root package name */
        private List<String> f36337n0;

        /* renamed from: o, reason: collision with root package name */
        private String f36338o;

        /* renamed from: o0, reason: collision with root package name */
        private String f36339o0;

        /* renamed from: p, reason: collision with root package name */
        private String f36340p;

        /* renamed from: p0, reason: collision with root package name */
        private String f36341p0;

        /* renamed from: q, reason: collision with root package name */
        private String f36342q;

        /* renamed from: q0, reason: collision with root package name */
        private String f36343q0;

        /* renamed from: r, reason: collision with root package name */
        private String f36344r;

        /* renamed from: r0, reason: collision with root package name */
        private String f36345r0;

        /* renamed from: s, reason: collision with root package name */
        private String f36346s;

        /* renamed from: s0, reason: collision with root package name */
        private int f36347s0;

        /* renamed from: t, reason: collision with root package name */
        private String f36348t;

        /* renamed from: t0, reason: collision with root package name */
        private float f36349t0;

        /* renamed from: u, reason: collision with root package name */
        private String f36350u;

        /* renamed from: u0, reason: collision with root package name */
        private float f36351u0;

        /* renamed from: v, reason: collision with root package name */
        private Integer f36352v;

        /* renamed from: v0, reason: collision with root package name */
        private float f36353v0;

        /* renamed from: w, reason: collision with root package name */
        private Integer f36354w;

        /* renamed from: w0, reason: collision with root package name */
        private float f36355w0;

        /* renamed from: x, reason: collision with root package name */
        private String f36356x;

        /* renamed from: x0, reason: collision with root package name */
        private float f36357x0;

        /* renamed from: y, reason: collision with root package name */
        private String f36358y;

        /* renamed from: y0, reason: collision with root package name */
        private float f36359y0;

        /* renamed from: z, reason: collision with root package name */
        private Location f36360z;

        /* renamed from: z0, reason: collision with root package name */
        private String f36361z0;

        /* renamed from: b, reason: collision with root package name */
        private final e10 f36313b = new e10(0);

        /* renamed from: c, reason: collision with root package name */
        private final kf f36315c = new kf();

        /* renamed from: d, reason: collision with root package name */
        private final lw1 f36317d = new lw1();

        /* renamed from: e, reason: collision with root package name */
        private final dc f36319e = new dc();

        /* renamed from: g, reason: collision with root package name */
        private final HashMap f36323g = new HashMap();

        /* renamed from: h, reason: collision with root package name */
        private final HashMap f36325h = new HashMap();

        public a(boolean z10) {
            this.f36311a = z10;
        }

        public final String A() {
            return this.f36345r0;
        }

        public final String A0() {
            return this.f36295N0;
        }

        public final String B() {
            return this.F0;
        }

        public final String B0() {
            return this.f36287J0;
        }

        public final String C() {
            return this.f36324g0;
        }

        public final Boolean C0() {
            return this.i;
        }

        public final Boolean D() {
            return this.f36292M;
        }

        public final String D0() {
            return this.f36312a0;
        }

        public final String E() {
            return this.f36336n;
        }

        public final String E0() {
            return this.f36346s;
        }

        public final String F() {
            return this.f36338o;
        }

        public final String F0() {
            return this.f36342q;
        }

        public final String G() {
            return this.f36270A0;
        }

        public final String G0() {
            return this.f36281G0;
        }

        public final Boolean H() {
            return this.f36297O0;
        }

        public final Boolean H0() {
            return this.f36301Q0;
        }

        public final String I() {
            return this.f36294N;
        }

        public final Boolean I0() {
            return this.f36283H0;
        }

        public final Boolean J() {
            return this.f36290L;
        }

        public final Integer J0() {
            return this.f36352v;
        }

        public final boolean K() {
            return this.f36321f;
        }

        public final String K0() {
            return this.f36288K;
        }

        public final String L() {
            return this.f36318d0;
        }

        public final Boolean L0() {
            return this.f36302R;
        }

        public final Integer M() {
            return this.f36354w;
        }

        public final a M0() {
            this.f36328j = ew1.a.a().e();
            return this;
        }

        public final String N() {
            return this.f36298P;
        }

        public final a N0() {
            this.f36276D0 = this.f36315c.a();
            return this;
        }

        public final Boolean O() {
            return this.f36296O;
        }

        public final a O0() {
            this.f36309Y = Constants.ENCODING;
            return this;
        }

        public final String P() {
            return this.f36305U;
        }

        public final a P0() {
            this.f36310Z = null;
            return this;
        }

        public final String Q() {
            return this.f36293M0;
        }

        public final a Q0() {
            ArrayList arrayListA = new ir(new no0()).a();
            AbstractC1564a.C0160a c0160a = AbstractC1564a.f11780d;
            c0160a.getClass();
            this.f36322f0 = c0160a.b(new C1526e(Q9.C0.f11399a), arrayListA);
            return this;
        }

        public final Integer R() {
            return this.f36286J;
        }

        public final a R0() {
            this.f36272B0 = this.f36317d.a();
            this.f36274C0 = this.f36317d.b();
            return this;
        }

        public final String S() {
            return this.f36333l0;
        }

        public final a S0() {
            this.i = ew1.a.a().i();
            return this;
        }

        public final Location T() {
            return this.f36360z;
        }

        public final a T0() {
            this.f36312a0 = null;
            return this;
        }

        public final String U() {
            return this.f36329j0;
        }

        public final String V() {
            return this.f36330k;
        }

        public final Integer W() {
            return this.f36275D;
        }

        public final Integer X() {
            return this.f36277E;
        }

        public final String Y() {
            return this.f36331k0;
        }

        public final String Z() {
            return this.f36279F;
        }

        public final h7 a() {
            return this.f36282H;
        }

        public final String a0() {
            return this.f36314b0;
        }

        public final String b() {
            return this.f36356x;
        }

        public final Boolean b0() {
            return this.f36299P0;
        }

        public final String c() {
            return this.f36350u;
        }

        public final String c0() {
            return this.f36358y;
        }

        public final String d() {
            return this.f36348t;
        }

        public final String d0() {
            return this.f36326h0;
        }

        public final String e() {
            return this.f36344r;
        }

        public final String e0() {
            return this.f36327i0;
        }

        public final HashMap f() {
            return this.f36323g;
        }

        public final HashMap f0() {
            return this.f36325h;
        }

        public final Integer g() {
            return this.f36332l;
        }

        public final List<String> g0() {
            return this.f36337n0;
        }

        public final String h() {
            return this.f36361z0;
        }

        public final String h0() {
            return this.f36278E0;
        }

        public final Boolean i() {
            return this.f36328j;
        }

        public final String i0() {
            return this.f36320e0;
        }

        public final String j() {
            return this.f36339o0;
        }

        public final String j0() {
            return this.f36340p;
        }

        public final String k() {
            return this.f36335m0;
        }

        public final String k0() {
            return this.f36306V;
        }

        public final String l() {
            return this.f36276D0;
        }

        public final float l0() {
            return this.f36355w0;
        }

        public final String m() {
            return this.f36341p0;
        }

        public final float m0() {
            return this.f36349t0;
        }

        public final String n() {
            return this.f36343q0;
        }

        public final float n0() {
            return this.f36353v0;
        }

        public final String o() {
            return this.f36316c0;
        }

        public final float o0() {
            return this.f36351u0;
        }

        public final Integer p() {
            return this.f36300Q;
        }

        public final Float p0() {
            return this.f36273C;
        }

        public final String q() {
            return this.f36280G;
        }

        public final int q0() {
            return this.f36347s0;
        }

        public final Integer r() {
            return this.f36284I;
        }

        public final Integer r0() {
            return this.f36271B;
        }

        public final String s() {
            return this.f36309Y;
        }

        public final Integer s0() {
            return this.f36269A;
        }

        public final boolean t() {
            return this.f36334m;
        }

        public final String t0() {
            return this.f36272B0;
        }

        public final String u() {
            return this.f36322f0;
        }

        public final String u0() {
            return this.f36274C0;
        }

        public final String v() {
            return this.f36303S;
        }

        public final String v0() {
            return this.f36291L0;
        }

        public final String w() {
            return this.f36304T;
        }

        public final String w0() {
            return this.f36289K0;
        }

        public final float x() {
            return this.f36359y0;
        }

        public final Long x0() {
            return this.f36308X;
        }

        public final float y() {
            return this.f36357x0;
        }

        public final String y0() {
            return this.f36307W;
        }

        public final String z() {
            return this.f36310Z;
        }

        public final String z0() {
            return this.f36285I0;
        }

        public final a a(h7 h7Var) {
            String strDecode;
            if (h7Var != null) {
                String strDecode2 = null;
                this.f36282H = this.f36311a ? null : h7Var;
                String strC = h7Var.c();
                if (strC == null || strC.length() == 0) {
                    strDecode = null;
                } else {
                    String strEncode = Uri.encode(strC);
                    if (strEncode != null && strEncode.length() > 1024) {
                        int i = um1.f34089b;
                        um1.a("Exceeded the length of the parameter! The maximum size of the parameter is %s bytes. First %s bytes of the parameter will be used", 1024, 1024);
                        String strEncode2 = Uri.encode(" ");
                        String strSubstring = strEncode.substring(0, 1024);
                        kotlin.jvm.internal.l.e(strSubstring, "substring(...)");
                        kotlin.jvm.internal.l.c(strEncode2);
                        boolean Z10 = y9.n.Z(1024, strEncode, strEncode2, false);
                        int iJ0 = y9.q.j0(6, strSubstring, strEncode2);
                        if (Z10 || iJ0 < 0) {
                            strEncode = strSubstring;
                        } else {
                            strEncode = strSubstring.substring(0, iJ0);
                            kotlin.jvm.internal.l.e(strEncode, "substring(...)");
                        }
                    }
                    strDecode = Uri.decode(strEncode);
                }
                this.f36303S = strDecode;
                List<String> listD = h7Var.d();
                String string = "";
                if (listD != null) {
                    StringBuilder sb = new StringBuilder();
                    for (String str : listD) {
                        sb.append(string);
                        sb.append(str);
                        sb.append("\n");
                        string = "3";
                    }
                    string = sb.toString();
                    kotlin.jvm.internal.l.e(string, "toString(...)");
                }
                if (string.length() != 0) {
                    String strEncode3 = Uri.encode(string);
                    if (strEncode3 != null && strEncode3.length() > 2048) {
                        int i10 = um1.f34089b;
                        um1.a("Exceeded the length of the parameter! The maximum size of the parameter is %s bytes. First %s bytes of the parameter will be used", 2048, 2048);
                        String strEncode4 = Uri.encode("\n");
                        strEncode3 = strEncode3.substring(0, 2048);
                        kotlin.jvm.internal.l.e(strEncode3, "substring(...)");
                        kotlin.jvm.internal.l.c(strEncode4);
                        int iJ02 = y9.q.j0(6, strEncode3, strEncode4);
                        if (!y9.n.T(strEncode3, strEncode4) && iJ02 >= 0) {
                            strEncode3 = strEncode3.substring(0, iJ02);
                            kotlin.jvm.internal.l.e(strEncode3, "substring(...)");
                        }
                    }
                    strDecode2 = Uri.decode(strEncode3);
                }
                this.f36304T = strDecode2;
                this.f36361z0 = n7.a(h7Var.b());
                this.f36270A0 = n7.a(h7Var.e());
                this.f36314b0 = h7Var.g();
                hq1 hq1VarI = h7Var.i();
                if (hq1VarI != null) {
                    this.f36278E0 = n7.a(hq1VarI.a());
                }
                a(n7.a(h7Var.h()));
            }
            return this;
        }

        public final a b(Context context) {
            kotlin.jvm.internal.l.f(context, "context");
            String packageName = context.getPackageName();
            kotlin.jvm.internal.l.e(packageName, "getPackageName(...)");
            this.f36339o0 = packageName;
            this.f36341p0 = ke.a(context);
            this.f36343q0 = ke.b(context);
            return this;
        }

        public final a c(Context context) {
            kotlin.jvm.internal.l.f(context, "context");
            cq.f25747a.getClass();
            this.f36334m = ((eq) cq.a.a(context)).e();
            return this;
        }

        public final a d(Context context) {
            kotlin.jvm.internal.l.f(context, "context");
            this.F0 = (new kv(context).a() ? hq1.f28335d : hq1.f28334c).a();
            return this;
        }

        public final a e(Context context) {
            kotlin.jvm.internal.l.f(context, "context");
            cq.f25747a.getClass();
            this.f36336n = ((eq) cq.a.a(context)).a();
            return this;
        }

        public final a f(Context context) {
            kotlin.jvm.internal.l.f(context, "context");
            cq.f25747a.getClass();
            this.f36338o = ((eq) cq.a.a(context)).b();
            return this;
        }

        public final a g(Context context) {
            int lac;
            int cid;
            kotlin.jvm.internal.l.f(context, "context");
            String string = null;
            try {
                Object systemService = context.getSystemService("phone");
                kotlin.jvm.internal.l.d(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
                CellLocation cellLocation = ((TelephonyManager) systemService).getCellLocation();
                kotlin.jvm.internal.l.d(cellLocation, "null cannot be cast to non-null type android.telephony.gsm.GsmCellLocation");
                cid = ((GsmCellLocation) cellLocation).getCid();
            } catch (Exception unused) {
            }
            Integer numValueOf = -1 != cid ? Integer.valueOf(cid & 65535) : null;
            this.f36284I = numValueOf;
            try {
                Object systemService2 = context.getSystemService("phone");
                kotlin.jvm.internal.l.d(systemService2, "null cannot be cast to non-null type android.telephony.TelephonyManager");
                CellLocation cellLocation2 = ((TelephonyManager) systemService2).getCellLocation();
                kotlin.jvm.internal.l.d(cellLocation2, "null cannot be cast to non-null type android.telephony.gsm.GsmCellLocation");
                lac = ((GsmCellLocation) cellLocation2).getLac();
            } catch (Exception unused2) {
            }
            Integer numValueOf2 = -1 != lac ? Integer.valueOf(lac & 65535) : null;
            this.f36286J = numValueOf2;
            try {
                Object systemService3 = context.getApplicationContext().getSystemService(Constants.WIFI);
                kotlin.jvm.internal.l.d(systemService3, "null cannot be cast to non-null type android.net.wifi.WifiManager");
                WifiManager wifiManager = (WifiManager) systemService3;
                if (wifiManager.isWifiEnabled()) {
                    List<ScanResult> scanResults = wifiManager.getScanResults();
                    if (scanResults == null) {
                        scanResults = C2099t.f18581b;
                    }
                    List listC0 = C2097r.C0(new bh1(), scanResults);
                    if (!listC0.isEmpty()) {
                        StringBuilder sb = new StringBuilder();
                        int iMin = Math.min(3, listC0.size());
                        int i = 0;
                        while (i < iMin) {
                            sb.append(((ScanResult) listC0.get(i)).BSSID);
                            sb.append(StringUtils.COMMA);
                            sb.append(((ScanResult) listC0.get(i)).level);
                            i++;
                            sb.append(i < iMin ? ";" : "");
                        }
                        string = sb.toString();
                    }
                }
            } catch (Exception unused3) {
            }
            this.f36288K = string;
            return this;
        }

        public final a h(Context context) {
            kotlin.jvm.internal.l.f(context, "context");
            this.f36360z = this.f36311a ? null : ks0.a.a(context).c();
            return this;
        }

        public final a i(Context context) {
            Integer numQ;
            Integer numQ2;
            kotlin.jvm.internal.l.f(context, "context");
            String str = null;
            try {
                Object systemService = context.getSystemService("phone");
                kotlin.jvm.internal.l.d(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
                String networkOperator = ((TelephonyManager) systemService).getNetworkOperator();
                kotlin.jvm.internal.l.e(networkOperator, "getNetworkOperator(...)");
                String strSubstring = networkOperator.substring(0, 3);
                kotlin.jvm.internal.l.e(strSubstring, "substring(...)");
                numQ = y9.m.Q(strSubstring);
            } catch (Exception unused) {
                numQ = null;
            }
            this.f36275D = numQ;
            try {
                Object systemService2 = context.getSystemService("phone");
                kotlin.jvm.internal.l.d(systemService2, "null cannot be cast to non-null type android.telephony.TelephonyManager");
                String networkOperator2 = ((TelephonyManager) systemService2).getNetworkOperator();
                kotlin.jvm.internal.l.e(networkOperator2, "getNetworkOperator(...)");
                String strSubstring2 = networkOperator2.substring(3);
                kotlin.jvm.internal.l.e(strSubstring2, "substring(...)");
                numQ2 = y9.m.Q(strSubstring2);
            } catch (Exception unused2) {
                numQ2 = null;
            }
            this.f36277E = numQ2;
            this.f36279F = ch1.a(context);
            try {
                Object systemService3 = context.getSystemService("phone");
                kotlin.jvm.internal.l.d(systemService3, "null cannot be cast to non-null type android.telephony.TelephonyManager");
                String networkOperatorName = ((TelephonyManager) systemService3).getNetworkOperatorName();
                if (networkOperatorName.length() != 0) {
                    str = networkOperatorName;
                }
            } catch (Exception unused3) {
            }
            this.f36280G = str;
            return this;
        }

        public final a j(Context context) {
            kotlin.jvm.internal.l.f(context, "context");
            cq.f25747a.getClass();
            this.f36340p = ((eq) cq.a.a(context)).c();
            return this;
        }

        public final a k(Context context) {
            kotlin.jvm.internal.l.f(context, "context");
            o10 o10VarA = vj2.a(context);
            this.f36349t0 = o10VarA.e();
            this.f36351u0 = o10VarA.g();
            this.f36353v0 = o10VarA.f();
            this.f36355w0 = o10VarA.b();
            this.f36357x0 = o10VarA.d();
            this.f36359y0 = o10VarA.c();
            return this;
        }

        public final a l(Context context) {
            kotlin.jvm.internal.l.f(context, "context");
            this.f36269A = Integer.valueOf(jh2.d(context));
            this.f36271B = Integer.valueOf(jh2.b(context));
            this.f36273C = Float.valueOf(context.getResources().getDisplayMetrics().density);
            this.f36347s0 = jh2.a(context);
            return this;
        }

        public final a m(Context context) {
            kotlin.jvm.internal.l.f(context, "context");
            du1 du1VarA = ew1.a.a().a(context);
            if (du1VarA != null) {
                this.f36285I0 = du1VarA.T();
            }
            return this;
        }

        public final a n(Context context) {
            kotlin.jvm.internal.l.f(context, "context");
            cq.f25747a.getClass();
            this.f36342q = ((eq) cq.a.a(context)).f();
            return this;
        }

        public final a o(Context context) {
            kotlin.jvm.internal.l.f(context, "context");
            this.f36283H0 = Boolean.valueOf(aa.a(context));
            return this;
        }

        public final a c(String str) {
            this.f36318d0 = str;
            return this;
        }

        public final a e(String str) {
            this.f36330k = str;
            return this;
        }

        public final a f(String str) {
            this.f36320e0 = str;
            return this;
        }

        public final a h(String str) {
            this.f36289K0 = str;
            return this;
        }

        public final a j(String str) {
            this.f36346s = str;
            return this;
        }

        public final a d(String str) {
            this.f36293M0 = str;
            return this;
        }

        public final a b(String str) {
            this.f36316c0 = str;
            return this;
        }

        public final a b(Integer num) {
            this.f36300Q = num;
            return this;
        }

        public final a b(boolean z10) {
            this.f36299P0 = z10 ? Boolean.valueOf(z10) : null;
            return this;
        }

        public final a b(Map<String, String> map) {
            if (map != null) {
                this.f36325h.putAll(map);
            }
            return this;
        }

        public final a i(String str) {
            this.f36287J0 = str;
            return this;
        }

        public final a g(String str) {
            this.f36291L0 = str;
            return this;
        }

        public final a a(ns nsVar) {
            if (nsVar != null) {
                this.f36350u = nsVar.b();
            }
            return this;
        }

        public final a a(String str) {
            this.f36348t = str;
            return this;
        }

        public final a a(Context context) {
            kotlin.jvm.internal.l.f(context, "context");
            cq.f25747a.getClass();
            this.f36344r = ((eq) cq.a.a(context)).d();
            return this;
        }

        public final a a(Map<String, String> map) {
            if (map != null) {
                this.f36323g.putAll(map);
            }
            return this;
        }

        public final a a(Integer num) {
            this.f36332l = num;
            return this;
        }

        public final a a(Context context, String str) {
            kotlin.jvm.internal.l.f(context, "context");
            this.f36324g0 = this.f36313b.b(context);
            this.f36313b.getClass();
            this.f36326h0 = ConstantDeviceInfo.APP_PLATFORM;
            this.f36313b.getClass();
            this.f36327i0 = Build.VERSION.RELEASE;
            this.f36313b.getClass();
            this.f36329j0 = e10.a();
            this.f36313b.getClass();
            this.f36331k0 = Build.MODEL;
            this.f36333l0 = this.f36313b.c(context);
            this.f36335m0 = this.f36313b.a(context);
            this.f36337n0 = this.f36313b.d(context);
            if (this.f36311a) {
                str = null;
            }
            this.f36345r0 = str;
            this.f36302R = Boolean.valueOf(this.f36313b.c());
            return this;
        }

        public final a a(ec ecVar, boolean z10) {
            if (ecVar != null) {
                this.f36290L = Boolean.valueOf(ecVar.b());
                this.f36292M = Boolean.valueOf(z10);
                String strA = ecVar.a();
                this.f36319e.getClass();
                boolean z11 = (strA == null || strA.length() == 0 || "00000000-0000-0000-0000-000000000000".equals(strA)) ? false : true;
                if (!this.f36311a && kotlin.jvm.internal.l.b(this.f36290L, Boolean.FALSE) && z11) {
                    this.f36294N = strA;
                }
            }
            return this;
        }

        public final a a(j50 environmentConfiguration) {
            kotlin.jvm.internal.l.f(environmentConfiguration, "environmentConfiguration");
            this.f36297O0 = Boolean.valueOf(environmentConfiguration.c());
            return this;
        }

        public final a a(boolean z10) {
            this.f36321f = z10;
            return this;
        }

        public final a a(ec ecVar) {
            if (ecVar != null) {
                this.f36296O = Boolean.valueOf(ecVar.b());
                String strA = ecVar.a();
                this.f36319e.getClass();
                boolean z10 = (strA == null || strA.length() == 0 || "00000000-0000-0000-0000-000000000000".equals(strA)) ? false : true;
                if (!this.f36311a && kotlin.jvm.internal.l.b(this.f36296O, Boolean.FALSE) && z10) {
                    this.f36298P = strA;
                }
            }
            return this;
        }

        public final a a(List<String> list) {
            this.f36305U = list != null ? C2097r.u0(list, StringUtils.COMMA, null, null, null, 62) : null;
            return this;
        }

        public final a a(int i) {
            String str;
            if (1 == i) {
                str = "portrait";
            } else {
                str = "landscape";
            }
            this.f36358y = str;
            return this;
        }

        public final a a(r91 r91Var) {
            if (r91Var != null) {
                this.f36306V = r91Var.a();
            }
            return this;
        }

        public final a a(long j4) {
            this.f36308X = Long.valueOf(j4);
            return this;
        }

        public final a a(Context context, vy1 vy1Var) {
            kotlin.jvm.internal.l.f(context, "context");
            if (vy1Var != null) {
                this.f36356x = vy1Var.a().a();
                this.f36352v = Integer.valueOf(vy1Var.c(context));
                this.f36354w = Integer.valueOf(vy1Var.a(context));
            }
            return this;
        }

        public final a a(u91 u91Var) {
            if (u91Var != null && u91.f33977d == u91Var) {
                this.f36307W = u91Var.a();
            }
            return this;
        }

        public final a a(bu1 bu1Var) {
            this.f36295N0 = bu1Var != null ? bu1Var.a() : null;
            return this;
        }

        public final a a(Context context, C4072a3 adConfiguration) {
            String strA;
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
            String strC = adConfiguration.c();
            int iO = adConfiguration.o();
            if (strC != null && (strA = new dh2(context).a(new fh2(iO, strC))) != null) {
                this.f36281G0 = strA;
            }
            return this;
        }

        public final a a(Boolean bool) {
            this.f36301Q0 = bool;
            return this;
        }
    }

    public static final class b {
        private b() {
        }

        public static a a(Context context, zw1 sensitiveModeChecker, oq configuration, oq1 resourceUtils, af1 optOutRepository) {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(sensitiveModeChecker, "sensitiveModeChecker");
            kotlin.jvm.internal.l.f(configuration, "configuration");
            kotlin.jvm.internal.l.f(resourceUtils, "resourceUtils");
            kotlin.jvm.internal.l.f(optOutRepository, "optOutRepository");
            j50 j50VarB = configuration.b();
            cc ccVarA = configuration.a();
            a aVarA = new a(sensitiveModeChecker.b(context)).b(context).N0().a(ccVarA.a(), ccVarA.b()).a(ccVarA.c());
            Integer numValueOf = null;
            try {
                Intent intentRegisterReceiver = context.getApplicationContext().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (intentRegisterReceiver != null) {
                    int intExtra = intentRegisterReceiver.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1);
                    int intExtra2 = intentRegisterReceiver.getIntExtra("scale", -1);
                    if (intExtra > -1 && intExtra2 > 0) {
                        numValueOf = Integer.valueOf(com.google.gson.internal.c.y((intExtra / intExtra2) * 100));
                    }
                }
            } catch (Exception unused) {
                fp0.c(new Object[0]);
            }
            a aVarA2 = aVarA.b(numValueOf).O0().g(context).h(context).i(context).l(context).k(context).R0().a(zw1.a(context)).a(aa.a());
            j50VarB.getClass();
            return aVarA2.P0().a(context, j50VarB.b()).j(j50VarB.g()).e(j50VarB.e()).a(configuration.c()).d(context).S0().a(context.getResources().getConfiguration().orientation).M0().e(context).f(context).c(context).j(context).n(context).a(context).o(context).m(context).a(j50VarB).b(optOutRepository.a()).a(ch1.c(context)).Q0();
        }

        public /* synthetic */ b(int i) {
            this();
        }

        public static a a(Context context, C4072a3 adConfiguration, zw1 sensitiveModeChecker) {
            oq1 oq1Var = new oq1();
            af1 af1Var = new af1(context, es0.a(context));
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
            kotlin.jvm.internal.l.f(sensitiveModeChecker, "sensitiveModeChecker");
            return a(context, sensitiveModeChecker, adConfiguration.g(), oq1Var, af1Var).a(adConfiguration.a()).a(adConfiguration.b()).a(adConfiguration.d()).a(adConfiguration.c()).a(adConfiguration.p()).a(context, adConfiguration.r()).a(adConfiguration.s()).T0().b(adConfiguration.f()).c(adConfiguration.l()).f(adConfiguration.n()).a(adConfiguration.o()).a(context, adConfiguration);
        }
    }

    public static final class c extends kotlin.jvm.internal.m implements InterfaceC5480a<String> {
        public c() {
            super(0);
        }

        @Override // p9.InterfaceC5480a
        public final String invoke() {
            x9.g gVar = za0.this.f36266c;
            x9.g elements = za0.this.f36267d;
            kotlin.jvm.internal.l.f(gVar, "<this>");
            kotlin.jvm.internal.l.f(elements, "elements");
            return x9.l.I(new x9.e(new C2090k(new x9.g[]{gVar, elements}), new A8.d(2), new w1.t(1)), "&", ab0.f24600b, 30);
        }
    }

    private za0(a aVar) {
        l7 l7Var = new l7();
        this.f36264a = l7Var;
        this.f36265b = new q50();
        C4285c c4285c = new C4285c();
        a(c4285c, Constants.ADMON_AD_UNIT_ID, aVar.d());
        a(c4285c, "width", aVar.J0());
        a(c4285c, "height", aVar.M());
        a(c4285c, "ad_size_type", aVar.b());
        a(c4285c, "orientation", aVar.c0());
        a(c4285c, "ads_count", aVar.g());
        a(c4285c, CommonUrlParts.SCREEN_WIDTH, aVar.s0());
        a(c4285c, CommonUrlParts.SCREEN_HEIGHT, aVar.r0());
        a(c4285c, CommonUrlParts.SCALE_FACTOR, aVar.p0());
        a(c4285c, Constants.ADMON_AD_TYPE, aVar.c());
        a(c4285c, "network_type", aVar.Z());
        a(c4285c, "carrier", aVar.q());
        a((Map<String, Object>) c4285c, "dnt", aVar.J());
        a((Map<String, Object>) c4285c, "gaid_reset", aVar.D());
        a((Map<String, Object>) c4285c, "huawei_dnt", aVar.O());
        a(c4285c, "battery_charge", aVar.p());
        a(c4285c, "image_sizes", aVar.P());
        a(c4285c, "response_ad_format", aVar.k0());
        a(c4285c, "ad_source", aVar.y0());
        a(c4285c, "debug_uid", aVar.z());
        a(c4285c, "user_id", aVar.D0());
        a(c4285c, "open_bidding_data", aVar.a0());
        a(c4285c, "session_random", aVar.x0());
        a(c4285c, "charset", aVar.s());
        a(c4285c, l7Var.b(), aVar.C());
        a(c4285c, l7Var.f(), aVar.d0());
        a(c4285c, l7Var.g(), aVar.e0());
        a(c4285c, l7Var.d(), aVar.U());
        a(c4285c, l7Var.e(), aVar.Y());
        a((Map<String, Object>) c4285c, l7Var.c(), aVar.L0());
        a(c4285c, CommonUrlParts.LOCALE, aVar.S());
        a(c4285c, "content_language", aVar.k());
        List<String> listG0 = aVar.g0();
        a(c4285c, "device_languages", listG0 != null ? C2097r.u0(listG0, StringUtils.PROCESS_POSTFIX_DELIMITER, null, null, null, 62) : null);
        a(c4285c, CommonUrlParts.APP_ID, aVar.j());
        a(c4285c, "app_version_code", aVar.m());
        a(c4285c, CommonUrlParts.APP_VERSION, aVar.n());
        a(c4285c, "appmetrica_version", aVar.l());
        a(c4285c, CommonUrlParts.SCREEN_DPI, Integer.valueOf(aVar.q0()));
        a(c4285c, "safe_area_inset_left", Float.valueOf(aVar.m0()));
        a(c4285c, "safe_area_inset_top", Float.valueOf(aVar.o0()));
        a(c4285c, "safe_area_inset_right", Float.valueOf(aVar.n0()));
        a(c4285c, "safe_area_inset_bottom", Float.valueOf(aVar.l0()));
        a(c4285c, "cutout_safe_area_inset_top", Float.valueOf(aVar.y()));
        a(c4285c, "cutout_safe_area_inset_bottom", Float.valueOf(aVar.x()));
        a((Map<String, Object>) c4285c, "user_consent", aVar.C0());
        a(c4285c, "gdpr", aVar.E());
        a(c4285c, "gdpr_consent", aVar.F());
        a((Map<String, Object>) c4285c, "cmp_present", Boolean.valueOf(aVar.t()));
        a(c4285c, "parsed_purpose_consents", aVar.j0());
        a(c4285c, "parsed_vendor_consents", aVar.F0());
        a(c4285c, "addtl_consent", aVar.e());
        a(c4285c, "bidding_data", aVar.L());
        a(c4285c, "prefetched_mediation_data", aVar.i0());
        a(c4285c, "connected_network_ids", aVar.u());
        a(c4285c, "sdk_version", aVar.t0());
        a(c4285c, "sdk_version_name", aVar.u0());
        a(c4285c, "sdk_vendor", "yandex");
        a(c4285c, "preferred_theme", aVar.h0());
        a(c4285c, "device_theme", aVar.B());
        a((Map<String, Object>) c4285c, "age_restricted_user", aVar.i());
        a(c4285c, "view_size_info", aVar.G0());
        a((Map<String, Object>) c4285c, "web_view_available", aVar.I0());
        a(c4285c, "startup_version", aVar.z0());
        a(c4285c, "session-data", aVar.w0());
        a(c4285c, "user-agent", aVar.B0());
        a(c4285c, "server_side_client_ip", aVar.v0());
        a(c4285c, "ipv6", aVar.Q());
        a(c4285c, "stub_reason", aVar.A0());
        a((Map<String, Object>) c4285c, "gms_available", aVar.H());
        a((Map<String, Object>) c4285c, "opt_out", aVar.b0());
        a((Map<String, Object>) c4285c, "vpn_enabled", aVar.H0());
        a(c4285c, aVar.f0());
        a(c4285c, aVar);
        this.f36266c = C2097r.j0(c4285c.c().entrySet());
        C4285c c4285c2 = new C4285c();
        for (Map.Entry entry : aVar.f().entrySet()) {
            a(c4285c2, (String) entry.getKey(), entry.getValue());
        }
        this.f36267d = C2097r.j0(c4285c2.c().entrySet());
        this.f36268e = C2001h.b(new c());
    }

    public final String toString() {
        return (String) this.f36268e.getValue();
    }

    private final void a(Map<String, Object> map, a aVar) {
        if (aVar.K()) {
            return;
        }
        a(map, "age", aVar.h());
        a(map, "gender", aVar.G());
        a(map, "context_query", aVar.v());
        a(map, "context_taglist", aVar.w());
        a(map, "google_aid", aVar.I());
        a(map, "huawei_oaid", aVar.N());
        a(map, CommonUrlParts.UUID, aVar.E0());
        a(map, "mauid", aVar.V());
        a(map, "autograb", aVar.o());
        a(map, this.f36264a.a(), aVar.A());
        a(map, "mcc", aVar.W());
        a(map, "mnc", aVar.X());
        a(map, "cellid", aVar.r());
        a(map, "lac", aVar.R());
        a(map, Constants.WIFI, aVar.K0());
        h7 h7VarA = aVar.a();
        Location locationF = h7VarA != null ? h7VarA.f() : null;
        if (locationF != null) {
            if (ew1.a.a().c()) {
                a(map, "lat", String.valueOf(locationF.getLatitude()));
                a(map, "lon", String.valueOf(locationF.getLongitude()));
                a(map, "location_timestamp", String.valueOf(locationF.getTime()));
                a(map, "precision", String.valueOf((int) locationF.getAccuracy()));
                return;
            }
            return;
        }
        Location locationT = aVar.T();
        if (locationT == null || !ew1.a.a().c()) {
            return;
        }
        a(map, "lat", String.valueOf(locationT.getLatitude()));
        a(map, "lon", String.valueOf(locationT.getLongitude()));
        a(map, "location_timestamp", String.valueOf(locationT.getTime()));
        a(map, "precision", String.valueOf((int) locationT.getAccuracy()));
    }

    private final void a(Map map, HashMap map2) {
        for (Map.Entry entry : map2.entrySet()) {
            a((Map<String, Object>) map, (String) entry.getKey(), (String) entry.getValue());
        }
    }

    private final void a(Map<String, Object> map, String str, Boolean bool) {
        if (bool != null) {
            a(map, str, Integer.valueOf(bool.booleanValue() ? 1 : 0));
        }
    }

    private final void a(Map<String, Object> map, String str, Object obj) {
        String strEncode;
        if (obj != null) {
            String strEncode2 = Uri.encode(str);
            if (this.f36265b.a(str)) {
                strEncode = Uri.encode(obj.toString());
            } else {
                strEncode = Uri.encode(obj.toString(), StringUtils.PROCESS_POSTFIX_DELIMITER);
            }
            kotlin.jvm.internal.l.c(strEncode2);
            kotlin.jvm.internal.l.c(strEncode);
            map.put(strEncode2, strEncode);
        }
    }

    public /* synthetic */ za0(a aVar, int i) {
        this(aVar);
    }
}
