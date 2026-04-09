package com.mbridge.msdk.foundation.same.net.utils;

import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.DomainNameUtils;
import com.mbridge.msdk.foundation.same.report.m;
import com.mbridge.msdk.foundation.same.report.n;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.s0;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.h;
import com.mbridge.msdk.tracker.network.toolbox.i;
import com.mbridge.msdk.tracker.p;
import com.mbridge.msdk.tracker.u;
import com.mbridge.msdk.tracker.x;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Pattern;
import org.json.JSONException;

/* loaded from: classes3.dex */
public class d {
    public String A;
    private String B;
    public String C;
    public String D;
    private String E;
    public String F;
    private String G;
    public String H;
    private String I;
    public String J;
    public String K;
    private String L;
    public String M;
    private String N;
    public String O;
    private String P;
    public String Q;
    public String R;
    private String S;
    public String T;
    public String U;
    private String V;
    public String W;
    public String X;
    private String Y;
    public String Z;

    /* renamed from: a, reason: collision with root package name */
    private final String f15159a;

    /* renamed from: a0, reason: collision with root package name */
    private String f15160a0;

    /* renamed from: b, reason: collision with root package name */
    public String f15161b;

    /* renamed from: b0, reason: collision with root package name */
    public String f15162b0;

    /* renamed from: c, reason: collision with root package name */
    public String f15163c;

    /* renamed from: c0, reason: collision with root package name */
    private String f15164c0;

    /* renamed from: d, reason: collision with root package name */
    public String f15165d;

    /* renamed from: d0, reason: collision with root package name */
    public String f15166d0;

    /* renamed from: e, reason: collision with root package name */
    public String f15167e;

    /* renamed from: e0, reason: collision with root package name */
    private boolean f15168e0;

    /* renamed from: f, reason: collision with root package name */
    public String f15169f;

    /* renamed from: f0, reason: collision with root package name */
    private int f15170f0;

    /* renamed from: g, reason: collision with root package name */
    public String f15171g;

    /* renamed from: h, reason: collision with root package name */
    public String f15172h;

    /* renamed from: i, reason: collision with root package name */
    public String f15173i;

    /* renamed from: j, reason: collision with root package name */
    public String f15174j;

    /* renamed from: k, reason: collision with root package name */
    public String f15175k;

    /* renamed from: l, reason: collision with root package name */
    public String f15176l;

    /* renamed from: m, reason: collision with root package name */
    public String f15177m;

    /* renamed from: n, reason: collision with root package name */
    public int f15178n;

    /* renamed from: o, reason: collision with root package name */
    public int f15179o;

    /* renamed from: p, reason: collision with root package name */
    public int f15180p;

    /* renamed from: q, reason: collision with root package name */
    public int f15181q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f15182r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f15183s;

    /* renamed from: t, reason: collision with root package name */
    public int f15184t;

    /* renamed from: u, reason: collision with root package name */
    public ArrayList<String> f15185u;

    /* renamed from: v, reason: collision with root package name */
    public int f15186v;

    /* renamed from: w, reason: collision with root package name */
    public int f15187w;

    /* renamed from: x, reason: collision with root package name */
    public ArrayList<String> f15188x;

    /* renamed from: y, reason: collision with root package name */
    public String f15189y;

    /* renamed from: z, reason: collision with root package name */
    private String f15190z;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private static final d f15191a = new d();
    }

    private boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.compile("(https|http)://[-A-Za-z0-9{}+&@#/%?=~_|!:,.;]+[-A-Za-z0-9+&@#/%=~_|]").matcher(str.trim()).matches();
    }

    private void b() {
        this.M = this.f15169f + this.L;
    }

    private void c() throws JSONException {
        this.A = this.f15189y + this.f15190z;
        this.H = this.f15189y + this.G;
        i.b().f(this.f15189y);
    }

    public static d h() {
        return b.f15191a;
    }

    public void d(int i10) {
        this.f15170f0 = i10;
    }

    public void e() {
        this.Q = this.f15173i + this.P;
        this.C = this.f15173i + this.B;
        this.T = this.f15173i + this.S;
        this.J = this.f15173i + this.I;
        this.W = this.f15173i + this.V;
    }

    public void f() {
        this.R = this.f15177m + this.P;
        this.D = this.f15177m + this.B;
        this.U = this.f15177m + this.S;
        this.K = this.f15177m + this.I;
        this.X = this.f15177m + this.V;
    }

    public boolean g() {
        try {
            if (this.f15183s) {
                ArrayList<String> arrayList = this.f15188x;
                if (arrayList != null && this.f15187w <= arrayList.size() - 1) {
                    if (!a(this.f15188x.get(this.f15187w))) {
                        this.f15177m = this.f15188x.get(this.f15187w);
                        f();
                    }
                    return true;
                }
            } else {
                ArrayList<String> arrayList2 = this.f15185u;
                if (arrayList2 != null && this.f15186v <= arrayList2.size() - 1) {
                    this.f15173i = this.f15185u.get(this.f15186v);
                    e();
                    return true;
                }
            }
            if (this.f15182r) {
                this.f15186v = 0;
                this.f15187w = 0;
            }
            return false;
        } catch (Throwable th) {
            q0.a("RequestUrlUtil", th.getMessage());
            return false;
        }
    }

    public int i() {
        return this.f15170f0;
    }

    public void j() {
        HashMap<String, String> mapD;
        g gVarD = h.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
        if (gVarD != null) {
            com.mbridge.msdk.setting.a aVarJ = gVarD.j();
            if (aVarJ != null) {
                this.f15176l = aVarJ.f();
                this.f15180p = aVarJ.g();
                this.f15172h = aVarJ.e();
                a();
            }
            com.mbridge.msdk.setting.d dVarZ = gVarD.z();
            if (dVarZ != null) {
                this.f15175k = dVarZ.d();
                this.f15179o = dVarZ.e();
                this.f15169f = dVarZ.c();
                b();
                a(gVarD);
            }
            this.f15183s = gVarD.r0() == 2;
            this.f15184t = gVarD.r0();
            a(!gVarD.b(2));
            if (gVarD.D() != null && gVarD.D().size() > 0 && (mapD = gVarD.D()) != null && mapD.size() > 0) {
                if (mapD.containsKey("v") && !TextUtils.isEmpty(mapD.get("v")) && a(mapD.get("v"))) {
                    this.f15167e = mapD.get("v");
                    d();
                }
                if (mapD.containsKey(CampaignEx.JSON_KEY_HB) && !TextUtils.isEmpty(mapD.get(CampaignEx.JSON_KEY_HB)) && a(mapD.get(CampaignEx.JSON_KEY_HB))) {
                    this.f15189y = mapD.get(CampaignEx.JSON_KEY_HB);
                    c();
                }
                if (mapD.containsKey("lg") && !TextUtils.isEmpty(mapD.get("lg"))) {
                    String str = mapD.get("lg");
                    if (a(str)) {
                        this.f15165d = str;
                    } else {
                        this.f15174j = str;
                    }
                }
                if (mapD.containsKey("lgt") && !TextUtils.isEmpty(mapD.get("lgt"))) {
                    String str2 = mapD.get("lgt");
                    if (a(str2)) {
                        String strB = b(str2);
                        if (!TextUtils.isEmpty(strB)) {
                            this.f15174j = strB;
                        }
                    } else {
                        this.f15174j = str2;
                    }
                }
            }
            String strV = gVarD.v();
            if (!TextUtils.isEmpty(strV)) {
                this.f15173i = strV;
                e();
                this.f15185u.add(0, strV);
            }
            String strW = gVarD.w();
            if (TextUtils.isEmpty(strW)) {
                return;
            }
            this.f15177m = strW;
            f();
            this.f15188x.add(0, strW);
        }
    }

    private d() {
        this.f15159a = "RequestUrlUtil";
        this.f15161b = DomainNameUtils.getInstance().DEFAULT_HOST_APPLETS;
        this.f15163c = DomainNameUtils.getInstance().DEFAULT_CDN_SPARE_SETTING_URL;
        this.f15165d = DomainNameUtils.getInstance().DEFAULT_HOST_ANALYTICS;
        this.f15167e = DomainNameUtils.getInstance().DEFAULT_HOST_API;
        this.f15169f = DomainNameUtils.getInstance().DEFAULT_HOST_MONITOR_DEFAULT;
        this.f15171g = DomainNameUtils.getInstance().DEFAULT_HOST_PRIVACY;
        this.f15172h = DomainNameUtils.getInstance().DEFAULT_HOST_REVENUE_DEFAULT;
        this.f15173i = DomainNameUtils.getInstance().DEFAULT_HOST_SETTING;
        this.f15174j = DomainNameUtils.getInstance().DEFAULT_HOST_TCP_ANALYTICS;
        this.f15175k = DomainNameUtils.getInstance().DEFAULT_HOST_TCP_MONITOR;
        this.f15176l = DomainNameUtils.getInstance().DEFAULT_HOST_TCP_REVENUE;
        this.f15177m = DomainNameUtils.getInstance().DEFAULT_HOST_TCP_SETTING;
        this.f15178n = 9377;
        this.f15179o = 9377;
        this.f15180p = 9988;
        this.f15181q = 9377;
        this.f15182r = false;
        this.f15183s = false;
        this.f15184t = 1;
        this.f15185u = DomainNameUtils.getInstance().SPARE_SETTING_HOST;
        this.f15186v = 0;
        this.f15187w = 0;
        this.f15188x = DomainNameUtils.getInstance().SPARE_TCP_SETTING_HOST;
        this.f15189y = DomainNameUtils.getInstance().DEFAULT_HB_HOST;
        this.f15190z = "/bid";
        this.A = this.f15189y + this.f15190z;
        this.B = "/sdk/customid";
        this.C = this.f15173i + this.B;
        this.D = this.f15177m + this.B;
        this.E = "/image";
        this.F = this.f15167e + this.E;
        this.G = "/load";
        this.H = this.f15189y + this.G;
        this.I = "/mapping";
        this.J = this.f15173i + this.I;
        this.K = this.f15177m + this.I;
        this.L = "";
        this.M = this.f15172h + this.L;
        this.N = "/batchPaidEvent";
        this.O = this.f15172h + this.N;
        this.P = "/setting";
        this.Q = this.f15173i + this.P;
        this.R = this.f15177m + this.P;
        this.S = "/rewardsetting";
        this.T = this.f15173i + this.S;
        this.U = this.f15177m + this.S;
        this.V = "/appwall/setting";
        this.W = this.f15173i + this.V;
        this.X = this.f15177m + this.V;
        this.Y = "/openapi/ad/v3";
        this.Z = this.f15167e + this.Y;
        this.f15160a0 = "/openapi/ad/v4";
        this.f15162b0 = this.f15167e + this.f15160a0;
        this.f15164c0 = "/openapi/ad/v5";
        this.f15166d0 = this.f15167e + this.f15164c0;
        this.f15168e0 = true;
        this.f15170f0 = 0;
    }

    private String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return Uri.parse(str).getHost();
        } catch (Throwable th) {
            q0.b("RequestUrlUtil", th.getMessage());
            return "";
        }
    }

    private void d() {
        this.Z = this.f15167e + this.Y;
        this.f15162b0 = this.f15167e + this.f15160a0;
        this.f15166d0 = this.f15167e + this.f15164c0;
        this.F = this.f15167e + this.E;
    }

    public void c(int i10) {
        this.f15181q = i10;
    }

    public String a(String str, int i10) {
        try {
            if (!TextUtils.isEmpty(str)) {
                String[] strArrSplit = str.split("_");
                if (strArrSplit.length > 1) {
                    return a(true, strArrSplit[1]);
                }
                return a(true, "");
            }
        } catch (Exception e10) {
            q0.b("RequestUrlUtil", e10.getMessage());
        }
        return i10 % 2 == 0 ? this.f15166d0 : this.Z;
    }

    public void b(int i10) {
        this.f15178n = i10;
    }

    public String a(boolean z10, String str) {
        if (z10) {
            if (this.H.contains(JsonUtils.EMPTY_JSON) && !TextUtils.isEmpty(str)) {
                return this.H.replace(JsonUtils.EMPTY_JSON, str + "-");
            }
            return this.H.replace(JsonUtils.EMPTY_JSON, "");
        }
        return this.A.replace(JsonUtils.EMPTY_JSON, "");
    }

    public void a(boolean z10) {
        this.f15168e0 = z10;
    }

    private void a() {
        this.O = this.f15172h + this.N;
    }

    private void a(g gVar) {
        com.mbridge.msdk.setting.d dVarZ;
        if (gVar == null || (dVarZ = gVar.z()) == null || dVarZ.a() == 1) {
            return;
        }
        int iB = s0.a().b("monitor", HandleInvocationsFromAdViewer.KEY_AD_TYPE, s0.a().b("t_r_t", 1));
        if (iB != 0 && iB != 1) {
            iB = 0;
        }
        u.a().a(com.mbridge.msdk.foundation.controller.c.n().d(), new x.b().a(new com.mbridge.msdk.foundation.same.report.d()).a(new n()).a(iB, a(iB)).a(s0.a().b("t_m_e_t", 604800000)).b(s0.a().b("t_m_e_s", 50)).d(s0.a().b("t_m_r_c", 50)).c(s0.a().b("t_m_t", DefaultLoadControl.DEFAULT_MIN_BUFFER_MS)).e(s0.a().b("t_m_r_t_s", 1)).a(), dVarZ.b() * 1000, com.mbridge.msdk.foundation.same.report.c.b());
    }

    private p a(int i10) {
        if (i10 == 1) {
            return new p(new m((byte) 2), h().f15175k, h().f15179o);
        }
        return new p(new com.mbridge.msdk.tracker.network.toolbox.h(), h().M, 0);
    }
}
