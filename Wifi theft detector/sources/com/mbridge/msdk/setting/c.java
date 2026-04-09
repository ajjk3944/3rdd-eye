package com.mbridge.msdk.setting;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class c {
    private String A;
    private int D;
    private int E;
    private int I;
    private String K;
    private int N;

    /* renamed from: b, reason: collision with root package name */
    private List<Integer> f16981b;

    /* renamed from: c, reason: collision with root package name */
    private List<Integer> f16982c;

    /* renamed from: d, reason: collision with root package name */
    private int f16983d;

    /* renamed from: e, reason: collision with root package name */
    private int f16984e;

    /* renamed from: f, reason: collision with root package name */
    private int f16985f;

    /* renamed from: g, reason: collision with root package name */
    private int f16986g;

    /* renamed from: h, reason: collision with root package name */
    private int f16987h;

    /* renamed from: i, reason: collision with root package name */
    private int f16988i;

    /* renamed from: k, reason: collision with root package name */
    private long f16990k;

    /* renamed from: l, reason: collision with root package name */
    private long f16991l;

    /* renamed from: m, reason: collision with root package name */
    private int f16992m;

    /* renamed from: n, reason: collision with root package name */
    private int f16993n;

    /* renamed from: o, reason: collision with root package name */
    private int f16994o;

    /* renamed from: p, reason: collision with root package name */
    private long f16995p;

    /* renamed from: q, reason: collision with root package name */
    private long f16996q;

    /* renamed from: r, reason: collision with root package name */
    private int f16997r;

    /* renamed from: s, reason: collision with root package name */
    private String f16998s;

    /* renamed from: t, reason: collision with root package name */
    private int f16999t;

    /* renamed from: u, reason: collision with root package name */
    private int f17000u;

    /* renamed from: z, reason: collision with root package name */
    private String f17005z;

    /* renamed from: a, reason: collision with root package name */
    private String f16980a = "";

    /* renamed from: j, reason: collision with root package name */
    private int f16989j = 0;

    /* renamed from: v, reason: collision with root package name */
    private int f17001v = 30;

    /* renamed from: w, reason: collision with root package name */
    private int f17002w = 1;

    /* renamed from: x, reason: collision with root package name */
    private int f17003x = 10;

    /* renamed from: y, reason: collision with root package name */
    private int f17004y = 60;
    private int B = 1;
    private String C = "";
    private int F = 100;
    private int G = 60;
    private int H = 5000;
    private int J = 1;
    private String L = "";
    private String M = "";

    public static l a(JSONObject jSONObject) {
        l lVar;
        l lVar2 = null;
        if (jSONObject != null) {
            try {
                lVar = new l();
            } catch (Exception e10) {
                e = e10;
            }
            try {
                lVar.e(jSONObject.optString("unitId"));
                lVar.a(jSONObject.optString("ab_id"));
                lVar.f(jSONObject.optString("rid"));
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("adSourceList");
                if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                    ArrayList arrayList = new ArrayList();
                    for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                        arrayList.add(Integer.valueOf(jSONArrayOptJSONArray.optInt(i10)));
                    }
                    lVar.a(arrayList);
                }
                JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("ad_source_timeout");
                if (jSONArrayOptJSONArray2 != null && jSONArrayOptJSONArray2.length() > 0) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i11 = 0; i11 < jSONArrayOptJSONArray2.length(); i11++) {
                        arrayList2.add(Integer.valueOf(jSONArrayOptJSONArray2.optInt(i11)));
                    }
                    lVar.b(arrayList2);
                }
                lVar.x(jSONObject.optInt("tpqn"));
                lVar.c(jSONObject.optInt("aqn"));
                lVar.b(jSONObject.optInt("acn"));
                lVar.z(jSONObject.optInt("wt"));
                int i12 = 1;
                lVar.o(jSONObject.optInt("iscasf", 1));
                lVar.w(jSONObject.optInt("spmxrt", 5000));
                lVar.c(jSONObject.optLong("current_time"));
                lVar.r(jSONObject.optInt("offset"));
                lVar.d(jSONObject.optLong("dlct", 3600L));
                lVar.d(jSONObject.optInt("autoplay", 0));
                lVar.k(jSONObject.optInt("dlnet", 2));
                lVar.c(jSONObject.optString("no_offer"));
                lVar.f(jSONObject.optInt("cb_type"));
                lVar.b(jSONObject.optLong("clct", 86400L));
                lVar.a(jSONObject.optLong("clcq", 300L));
                lVar.u(jSONObject.optInt(CampaignEx.JSON_KEY_READY_RATE, 100));
                lVar.g(jSONObject.optInt("cd_rate", 0));
                lVar.i(jSONObject.optInt("content", 1));
                lVar.m(jSONObject.optInt("impt", 0));
                lVar.l(jSONObject.optInt("icon_type", 1));
                lVar.b(jSONObject.optString("no_ads_url", ""));
                lVar.t(jSONObject.optInt("playclosebtn_tm", -1));
                lVar.s(jSONObject.optInt("play_ctdown", 0));
                lVar.h(jSONObject.optInt("close_alert", 0));
                lVar.n(jSONObject.optInt("intershowlimit", 30));
                lVar.v(jSONObject.optInt("refreshFq", 60));
                lVar.e(jSONObject.optInt("closeBtn", 0));
                int iOptInt = jSONObject.optInt("tmorl", 1);
                if (iOptInt <= 2 && iOptInt > 0) {
                    i12 = iOptInt;
                }
                lVar.y(i12);
                lVar.d(jSONObject.optString("placementid", ""));
                lVar.p(jSONObject.optInt("ltafemty", 10));
                lVar.q(jSONObject.optInt("ltorwc", 60));
                lVar.g(jSONObject.optString("vtag", ""));
                return lVar;
            } catch (Exception e11) {
                e = e11;
                lVar2 = lVar;
                e.printStackTrace();
                return lVar2;
            }
        }
        return lVar2;
    }

    public int A() {
        return this.D;
    }

    public int B() {
        return this.E;
    }

    public int C() {
        return this.F;
    }

    public int D() {
        return this.G;
    }

    public int E() {
        return this.H;
    }

    public int F() {
        return this.I;
    }

    public int G() {
        return this.J;
    }

    public String H() {
        return this.K;
    }

    public String I() {
        return this.L;
    }

    public String J() {
        return this.M;
    }

    public int K() {
        return this.N;
    }

    public int L() {
        return this.f16986g;
    }

    public JSONObject M() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            List<Integer> listB = b();
            if (listB != null && listB.size() > 0) {
                int size = listB.size();
                JSONArray jSONArray = new JSONArray();
                for (int i10 = 0; i10 < size; i10++) {
                    jSONArray.put(listB.get(i10));
                }
                jSONObject.put("adSourceList", jSONArray);
            }
            List<Integer> listC = c();
            if (listC != null && listC.size() > 0) {
                int size2 = listC.size();
                JSONArray jSONArray2 = new JSONArray();
                for (int i11 = 0; i11 < size2; i11++) {
                    jSONArray2.put(listC.get(i11));
                }
                jSONObject.put("ad_source_timeout", jSONArray2);
            }
            jSONObject.put("tpqn", F());
            jSONObject.put("aqn", f());
            jSONObject.put("acn", e());
            jSONObject.put("wt", K());
            jSONObject.put("current_time", o());
            jSONObject.put("offset", y());
            jSONObject.put("dlct", p());
            jSONObject.put("autoplay", L());
            jSONObject.put("dlnet", q());
            jSONObject.put("no_offer", x());
            jSONObject.put("cb_type", h());
            jSONObject.put("clct", k());
            jSONObject.put("clcq", j());
            jSONObject.put(CampaignEx.JSON_KEY_READY_RATE, C());
            jSONObject.put("content", m());
            jSONObject.put("impt", s());
            jSONObject.put("icon_type", r());
            jSONObject.put("no_ads_url", w());
            jSONObject.put("playclosebtn_tm", B());
            jSONObject.put("play_ctdown", A());
            jSONObject.put("close_alert", l());
            jSONObject.put("closeBtn", g());
            jSONObject.put("refreshFq", D());
            jSONObject.put("countdown", n());
            jSONObject.put("allowSkip", d());
            jSONObject.put("tmorl", G());
            jSONObject.put("unitId", H());
            jSONObject.put("placementid", z());
            jSONObject.put("ltafemty", u());
            jSONObject.put("ltorwc", v());
            jSONObject.put("vtag", J());
            return jSONObject;
        } catch (Exception e10) {
            e10.printStackTrace();
            return jSONObject;
        }
    }

    public List<Integer> b() {
        return this.f16981b;
    }

    public void c(String str) {
        this.A = str;
    }

    public void d(int i10) {
        this.f16986g = i10;
    }

    public int e() {
        return this.f16984e;
    }

    public int f() {
        return this.f16985f;
    }

    public int g() {
        return this.f16987h;
    }

    public int h() {
        return this.f16988i;
    }

    public int i() {
        return this.f16989j;
    }

    public long j() {
        return this.f16990k;
    }

    public long k() {
        return this.f16991l;
    }

    public int l() {
        return this.f16992m;
    }

    public int m() {
        return this.f16993n;
    }

    public int n() {
        return this.f16994o;
    }

    public long o() {
        return this.f16995p;
    }

    public long p() {
        return this.f16996q;
    }

    public int q() {
        return this.f16997r;
    }

    public int r() {
        return this.f16999t;
    }

    public int s() {
        return this.f17000u;
    }

    public int t() {
        return this.f17002w;
    }

    public String toString() {
        List<Integer> list = this.f16981b;
        String str = "";
        if (list != null && list.size() > 0) {
            Iterator<Integer> it = this.f16981b.iterator();
            while (it.hasNext()) {
                str = str + it.next() + ",";
            }
        }
        return "offset = " + y() + " unitId = " + this.K + " fbPlacementId = " + this.f16998s + str;
    }

    public int u() {
        return this.f17003x;
    }

    public int v() {
        return this.f17004y;
    }

    public String w() {
        return this.f17005z;
    }

    public String x() {
        return this.A;
    }

    public void y(int i10) {
        this.J = i10;
    }

    public String z() {
        return this.C;
    }

    public void b(List<Integer> list) {
        this.f16982c = list;
    }

    public List<Integer> c() {
        return this.f16982c;
    }

    public int d() {
        return this.f16983d;
    }

    public void e(int i10) {
        this.f16987h = i10;
    }

    public void f(int i10) {
        this.f16988i = i10;
    }

    public void g(int i10) {
        this.f16989j = i10;
    }

    public void h(int i10) {
        this.f16992m = i10;
    }

    public void i(int i10) {
        this.f16993n = i10;
    }

    public void j(int i10) {
        this.f16994o = i10;
    }

    public void k(int i10) {
        this.f16997r = i10;
    }

    public void l(int i10) {
        this.f16999t = i10;
    }

    public void m(int i10) {
        this.f17000u = i10;
    }

    public void n(int i10) {
        this.f17001v = i10;
    }

    public void o(int i10) {
        this.f17002w = i10;
    }

    public void p(int i10) {
        this.f17003x = i10;
    }

    public void q(int i10) {
        this.f17004y = i10;
    }

    public void r(int i10) {
        this.B = i10;
    }

    public void s(int i10) {
        this.D = i10;
    }

    public void t(int i10) {
        this.E = i10;
    }

    public void u(int i10) {
        this.F = i10;
    }

    public void v(int i10) {
        this.G = i10;
    }

    public void w(int i10) {
        this.H = i10;
    }

    public void x(int i10) {
        this.I = i10;
    }

    public int y() {
        return this.B;
    }

    public void z(int i10) {
        this.N = i10;
    }

    public void b(int i10) {
        this.f16984e = i10;
    }

    public void c(int i10) {
        this.f16985f = i10;
    }

    public void d(long j10) {
        this.f16996q = j10;
    }

    public void e(String str) {
        this.K = str;
    }

    public void f(String str) {
        this.L = str;
    }

    public void g(String str) {
        this.M = str;
    }

    public void b(long j10) {
        this.f16991l = j10;
    }

    public void c(long j10) {
        this.f16995p = j10;
    }

    public void d(String str) {
        this.C = str;
    }

    public void b(String str) {
        this.f17005z = str;
    }

    public String a() {
        return this.f16980a;
    }

    public void a(String str) {
        this.f16980a = str;
        com.mbridge.msdk.foundation.controller.a.f14694r.put(this.K, str);
    }

    public void a(List<Integer> list) {
        this.f16981b = list;
    }

    public void a(int i10) {
        this.f16983d = i10;
    }

    public void a(long j10) {
        this.f16990k = j10;
    }
}
