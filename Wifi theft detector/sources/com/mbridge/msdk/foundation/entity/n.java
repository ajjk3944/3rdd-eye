package com.mbridge.msdk.foundation.entity;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.mbridge.msdk.foundation.tools.m0;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class n {
    public static int N = 1;
    public static int O;
    private String A;
    private String B;
    private int C;
    private String D;
    private String E;
    private String G;
    private String H;
    private String I;
    private int J;
    private long K;
    private String L;
    private int M;

    /* renamed from: b, reason: collision with root package name */
    private String f14942b;

    /* renamed from: c, reason: collision with root package name */
    private int f14943c;

    /* renamed from: e, reason: collision with root package name */
    private int f14945e;

    /* renamed from: f, reason: collision with root package name */
    private String f14946f;

    /* renamed from: g, reason: collision with root package name */
    private String f14947g;

    /* renamed from: h, reason: collision with root package name */
    private String f14948h;

    /* renamed from: i, reason: collision with root package name */
    private String f14949i;

    /* renamed from: j, reason: collision with root package name */
    private String f14950j;

    /* renamed from: k, reason: collision with root package name */
    private String f14951k;

    /* renamed from: l, reason: collision with root package name */
    private String f14952l;

    /* renamed from: m, reason: collision with root package name */
    private String f14953m;

    /* renamed from: n, reason: collision with root package name */
    private String f14954n;

    /* renamed from: o, reason: collision with root package name */
    private String f14955o;

    /* renamed from: p, reason: collision with root package name */
    private int f14956p;

    /* renamed from: q, reason: collision with root package name */
    private String f14957q;

    /* renamed from: r, reason: collision with root package name */
    private String f14958r;

    /* renamed from: s, reason: collision with root package name */
    private String f14959s;

    /* renamed from: u, reason: collision with root package name */
    private int f14961u;

    /* renamed from: v, reason: collision with root package name */
    private String f14962v;

    /* renamed from: w, reason: collision with root package name */
    private String f14963w;

    /* renamed from: x, reason: collision with root package name */
    private String f14964x;

    /* renamed from: y, reason: collision with root package name */
    private String f14965y;

    /* renamed from: z, reason: collision with root package name */
    private String f14966z;

    /* renamed from: a, reason: collision with root package name */
    private Map<String, String> f14941a = null;

    /* renamed from: d, reason: collision with root package name */
    private int f14944d = 0;

    /* renamed from: t, reason: collision with root package name */
    private int f14960t = 0;
    private int F = 0;

    public n(String str, int i10, int i11, int i12, int i13, String str2, String str3, int i14, String str4, int i15, String str5) {
        this.f14957q = str;
        this.f14961u = i10;
        this.f14962v = str5;
        this.f14956p = i11;
        this.M = i12;
        this.J = i13;
        try {
            if (!TextUtils.isEmpty(str2)) {
                this.f14963w = URLEncoder.encode(str2, "utf-8");
            }
        } catch (UnsupportedEncodingException e10) {
            e10.printStackTrace();
        }
        this.f14964x = str3;
        this.C = i14;
        this.f14949i = str4;
        this.K = i15;
    }

    public String A() {
        return this.H;
    }

    public String B() {
        return this.I;
    }

    public int C() {
        return this.J;
    }

    public long D() {
        return this.K;
    }

    public String E() {
        return this.L;
    }

    public int F() {
        return this.M;
    }

    public String a() {
        return this.f14942b;
    }

    public void b(String str) {
        this.f14946f = str;
    }

    public void c(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f14947g = URLEncoder.encode(str);
    }

    public String d() {
        return this.f14946f;
    }

    public String e() {
        return this.f14947g;
    }

    public String f() {
        return this.f14948h;
    }

    public String g() {
        return this.f14949i;
    }

    public String h() {
        return this.f14950j;
    }

    public String i() {
        return this.f14951k;
    }

    public void j(String str) {
        this.f14957q = str;
    }

    public String k() {
        return this.f14953m;
    }

    public void l(String str) {
        this.f14962v = str;
    }

    public void m(String str) {
        this.f14964x = str;
    }

    public String n() {
        return this.f14957q;
    }

    public void o(String str) {
        this.f14966z = str;
    }

    public void p(String str) {
        this.A = str;
    }

    public int q() {
        return this.f14961u;
    }

    public String r() {
        return this.f14962v;
    }

    public String s() {
        return this.f14963w;
    }

    public String t() {
        return TextUtils.isEmpty(this.f14964x) ? "" : this.f14964x;
    }

    @NonNull
    public String toString() {
        return "RewardReportData [key=" + this.f14957q + ", networkType=" + this.f14961u + ", isCompleteView=" + this.f14956p + ", watchedMillis=" + this.M + ", videoLength=" + this.J + ", offerUrl=" + this.f14963w + ", reason=" + this.f14964x + ", result=" + this.C + ", duration=" + this.f14949i + ", videoSize=" + this.K + "]";
    }

    public void u(String str) {
        this.I = str;
    }

    public String v() {
        return this.f14966z;
    }

    public String w() {
        return this.A;
    }

    public int x() {
        return this.C;
    }

    public int y() {
        return this.F;
    }

    public String z() {
        return this.G;
    }

    public void a(String str) {
        this.f14942b = str;
    }

    public int b() {
        return this.f14943c;
    }

    public void d(String str) {
        this.f14948h = str;
    }

    public void e(String str) {
        this.f14949i = str;
    }

    public void f(String str) {
        this.f14950j = str;
    }

    public void g(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f14951k = URLEncoder.encode(str, "utf-8");
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void h(String str) {
        this.f14952l = str;
    }

    public void i(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f14955o = URLEncoder.encode(str, "utf-8");
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public String j() {
        return this.f14952l;
    }

    public void k(String str) {
        this.f14959s = str;
    }

    public String l() {
        return this.f14955o;
    }

    public int m() {
        return this.f14956p;
    }

    public void n(String str) {
        this.f14965y = str;
    }

    public String o() {
        return this.f14958r;
    }

    public int p() {
        return this.f14960t;
    }

    public void q(String str) {
        this.B = str;
    }

    public void r(String str) {
        this.D = str;
    }

    public void s(String str) {
        this.E = str;
    }

    public void t(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.G = URLEncoder.encode(str, "utf-8");
        } catch (UnsupportedEncodingException e10) {
            e10.printStackTrace();
        }
    }

    public String u() {
        return this.f14965y;
    }

    public void v(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.L = URLEncoder.encode(str, "utf-8");
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void a(int i10) {
        this.f14943c = i10;
    }

    public void b(int i10) {
        this.f14960t = i10;
    }

    public void c(int i10) {
        this.f14961u = i10;
    }

    public void d(int i10) {
        this.C = i10;
    }

    public void e(int i10) {
        this.F = i10;
    }

    public String a(String str, String str2) {
        Map<String, String> map;
        if (!TextUtils.isEmpty(str) && (map = this.f14941a) != null) {
            try {
                String str3 = map.get(str);
                if (!TextUtils.isEmpty(str3)) {
                    return str3;
                }
            } catch (Exception unused) {
            }
        }
        return str2;
    }

    public void b(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        if (this.f14941a == null) {
            this.f14941a = new HashMap();
        }
        try {
            this.f14941a.put(str, str2);
        } catch (Exception unused) {
        }
    }

    public int c() {
        return this.f14945e;
    }

    public n() {
    }

    public n(String str, int i10, String str2, String str3, String str4) {
        this.f14957q = str;
        this.f14962v = str4;
        this.f14961u = i10;
        if (!TextUtils.isEmpty(str2)) {
            try {
                this.f14963w = URLEncoder.encode(str2, "utf-8");
            } catch (UnsupportedEncodingException e10) {
                e10.printStackTrace();
            }
        }
        this.f14964x = str3;
    }

    public n(String str, int i10, int i11, String str2, int i12, String str3, int i13, String str4) {
        this.f14957q = str;
        this.f14961u = i10;
        this.f14962v = str4;
        this.J = i11;
        if (!TextUtils.isEmpty(str2)) {
            try {
                this.f14963w = URLEncoder.encode(str2, "utf-8");
            } catch (UnsupportedEncodingException e10) {
                e10.printStackTrace();
            }
        }
        this.C = i12;
        this.f14949i = str3;
        this.K = i13;
    }

    public n(Context context, CampaignEx campaignEx, int i10, String str, long j10, int i11) {
        if (i11 == 1 || i11 == 287 || i11 == 94) {
            this.f14957q = "m_download_end";
        } else if (i11 == 95) {
            this.f14957q = "2000025";
        }
        int iS = m0.s(context);
        this.f14961u = iS;
        this.f14962v = m0.a(context, iS);
        this.J = campaignEx.getVideoLength();
        this.f14965y = campaignEx.getRequestId();
        this.f14966z = campaignEx.getRequestIdNotice();
        if (!TextUtils.isEmpty(this.f14963w)) {
            try {
                this.f14963w = URLEncoder.encode(campaignEx.getNoticeUrl() == null ? campaignEx.getClickURL() : campaignEx.getNoticeUrl(), "utf-8");
            } catch (UnsupportedEncodingException e10) {
                e10.printStackTrace();
            }
        }
        this.C = i10;
        this.f14949i = str;
        this.K = j10 == 0 ? campaignEx.getVideoSize() : j10;
    }

    public n(String str, String str2, String str3, String str4, String str5, String str6, int i10, String str7) {
        this.f14957q = str;
        this.f14953m = str2;
        this.H = str3;
        this.f14958r = str4;
        this.I = str5;
        this.f14946f = str6;
        this.f14961u = i10;
        this.f14962v = str7;
    }

    public n(String str) {
        this.f14954n = str;
    }

    public n(String str, int i10, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f14957q = str;
        this.C = i10;
        this.f14949i = str2;
        try {
            if (!TextUtils.isEmpty(str3)) {
                this.f14951k = URLEncoder.encode(str3, "utf-8");
            }
        } catch (UnsupportedEncodingException e10) {
            e10.printStackTrace();
        }
        this.f14946f = str4;
        this.I = str5;
        this.f14964x = str6;
        this.f14950j = str7;
        if (Integer.valueOf(str2).intValue() > com.mbridge.msdk.foundation.same.a.L) {
            this.C = 2;
        }
    }

    public n(String str, String str2, String str3, String str4, String str5, int i10) {
        this.f14957q = str;
        this.f14946f = str2;
        this.f14965y = str3;
        this.f14966z = str4;
        this.I = str5;
        this.f14961u = i10;
    }

    public n(String str, String str2, String str3, String str4, String str5, int i10, int i11, String str6) {
        this.f14957q = str;
        this.f14946f = str2;
        this.f14965y = str3;
        this.f14966z = str4;
        this.I = str5;
        this.f14961u = i10;
        this.f14964x = str6;
        this.f14945e = i11;
    }
}
