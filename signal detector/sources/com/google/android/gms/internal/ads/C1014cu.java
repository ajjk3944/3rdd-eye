package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import j2.EnumC2546b;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import org.json.JSONObject;
import q2.C2852x0;

/* renamed from: com.google.android.gms.internal.ads.cu, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1014cu implements InterfaceC1223gl, XJ, ZA, InterfaceC0801Wn, VP {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13694a;

    /* renamed from: b, reason: collision with root package name */
    public Object f13695b;

    public C1014cu(int i) {
        this.f13694a = i;
        switch (i) {
            case 10:
                this.f13695b = RB.n(2, 1, 5);
                break;
            case 11:
            default:
                this.f13695b = new int[2];
                break;
            case 12:
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.ZA
    public /* synthetic */ Object a() {
        return (Rx) this.f13695b;
    }

    @Override // com.google.android.gms.internal.ads.VP
    public int b(Object obj) {
        LP lp = (LP) obj;
        HashMap map = WP.f12225a;
        TP tp = (TP) this.f13695b;
        String str = lp.f9691b;
        return ((str.equals(tp.f11397m) || str.equals(WP.d(tp))) && lp.f(tp, false) && lp.g(tp)) ? 1 : 0;
    }

    @Override // com.google.android.gms.internal.ads.XJ
    public Object c(String str) {
        return ((InterfaceC0877aK) this.f13695b).d(str, null);
    }

    public JSONObject d(View view) {
        if (view == null) {
            return AbstractC1718pw.a(0, 0, 0, 0);
        }
        int[] iArr = (int[]) this.f13695b;
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(iArr);
        return AbstractC1718pw.a(iArr[0], iArr[1], width, height);
    }

    public void e(int i, long j6, Jv jv, String str) {
        C0697Ql c0697QlA = ((C0784Vn) this.f13695b).a();
        c0697QlA.r("action", "start_preload");
        c0697QlA.r("sp_ts", Long.toString(j6));
        c0697QlA.r("ad_format", jv.a());
        c0697QlA.r("ad_unit_id", jv.f9395a);
        c0697QlA.r("pid", jv.f9397c);
        c0697QlA.r("max_ads", Integer.toString(i));
        c0697QlA.r("pv", str);
        c0697QlA.s();
    }

    public void f(Exception exc) {
        AbstractC2022vd.K("MediaCodecAudioRenderer", "Audio sink error", exc);
        Vu vu = ((C1909tP) this.f13695b).f16910Q0;
        Handler handler = (Handler) vu.f12105a;
        if (handler != null) {
            handler.post(new RunnableC0882aP(vu, exc, 5));
        }
    }

    public void g(EnumMap enumMap, long j6) {
        C0697Ql c0697QlA = ((C0784Vn) this.f13695b).a();
        c0697QlA.r("action", "start_preload");
        c0697QlA.r("sp_ts", Long.toString(j6));
        c0697QlA.r("pv", "1");
        for (EnumC2546b enumC2546b : enumMap.keySet()) {
            String strValueOf = String.valueOf(enumC2546b.name().toLowerCase(Locale.ENGLISH));
            c0697QlA.r(strValueOf.concat("_count"), Integer.toString(((Integer) enumMap.get(enumC2546b)).intValue()));
        }
        c0697QlA.s();
    }

    public int h() {
        int iOptInt = ((JSONObject) this.f13695b).optInt("media_type", -1);
        if (iOptInt != 0) {
            return iOptInt != 1 ? 3 : 1;
        }
        return 2;
    }

    public void i(int i, int i3, long j6, Long l2, String str, Jv jv, String str2) {
        C0697Ql c0697QlA = ((C0784Vn) this.f13695b).a();
        c0697QlA.r("plaac_ts", Long.toString(j6));
        c0697QlA.r("max_ads", Integer.toString(i));
        c0697QlA.r("cache_size", Integer.toString(i3));
        c0697QlA.r("action", "is_ad_available");
        if (jv != null) {
            c0697QlA.r("ad_unit_id", jv.f9395a);
            c0697QlA.r("pid", jv.f9397c);
            c0697QlA.r("ad_format", jv.a());
        }
        if (l2 != null) {
            c0697QlA.r("plaay_ts", Long.toString(l2.longValue()));
        }
        if (str != null) {
            c0697QlA.r("gqi", str);
        }
        c0697QlA.r("pv", str2);
        c0697QlA.s();
    }

    public void j(long j6, int i, int i3, String str, Jv jv, String str2) {
        C0697Ql c0697QlA = ((C0784Vn) this.f13695b).a();
        c0697QlA.r("ppla_ts", Long.toString(j6));
        c0697QlA.r("ad_format", jv.a());
        c0697QlA.r("ad_unit_id", jv.f9395a);
        c0697QlA.r("pid", jv.f9397c);
        c0697QlA.r("max_ads", Integer.toString(i));
        c0697QlA.r("cache_size", Integer.toString(i3));
        c0697QlA.r("action", "poll_ad");
        if (str != null) {
            c0697QlA.r("gqi", str);
        }
        c0697QlA.r("pv", str2);
        c0697QlA.s();
    }

    public void k(long j6, Jv jv, C2852x0 c2852x0, int i, int i3, String str) {
        C0697Ql c0697QlA = ((C0784Vn) this.f13695b).a();
        c0697QlA.r("action", "pftla");
        c0697QlA.r("pftlat_ts", Long.toString(j6));
        c0697QlA.r("pftlaec", Integer.toString(c2852x0.f23273a));
        c0697QlA.r("ad_format", jv.a());
        c0697QlA.r("max_ads", Integer.toString(i));
        c0697QlA.r("cache_size", Integer.toString(i3));
        c0697QlA.r("ad_unit_id", jv.f9395a);
        c0697QlA.r("pid", jv.f9397c);
        c0697QlA.r("pv", str);
        c0697QlA.s();
    }

    public void l(int i, Object obj, JL jl) {
        VK vk = (VK) this.f13695b;
        FK fk = (FK) obj;
        vk.M(i, 2);
        vk.b0(fk.d(jl));
        jl.f(fk, this);
    }

    public void m(String str, long j6, String str2, String str3, EnumC2546b enumC2546b, int i, int i3, int i6) {
        C0697Ql c0697QlA = ((C0784Vn) this.f13695b).a();
        c0697QlA.r("action", str);
        c0697QlA.r("pat", Long.toString(j6));
        c0697QlA.r("ad_format", enumC2546b.name().toLowerCase(Locale.ENGLISH));
        c0697QlA.r("max_ads", Integer.toString(i));
        c0697QlA.r("cache_size", Integer.toString(i3));
        c0697QlA.r("pas", Integer.toString(i6));
        c0697QlA.r("pv", "2");
        c0697QlA.r("ad_unit_id", str3);
        c0697QlA.r("pid", str2);
        c0697QlA.s();
    }

    public void n(String str, String str2, long j6, int i, int i3, String str3, Jv jv, String str4) {
        C0697Ql c0697QlA = ((C0784Vn) this.f13695b).a();
        c0697QlA.r(str2, Long.toString(j6));
        if (jv != null) {
            c0697QlA.r("ad_unit_id", jv.f9395a);
            c0697QlA.r("ad_format", jv.a());
            c0697QlA.r("pid", jv.f9397c);
        }
        c0697QlA.r("action", str);
        if (str3 != null) {
            c0697QlA.r("gqi", str3);
        }
        if (i >= 0) {
            c0697QlA.r("max_ads", Integer.toString(i));
        }
        if (i3 >= 0) {
            c0697QlA.r("cache_size", Integer.toString(i3));
        }
        c0697QlA.r("pv", str4);
        c0697QlA.s();
    }

    public void o(String str, long j6, String str2, String str3, EnumC2546b enumC2546b, int i, int i3, int i6, int i7, int i8) {
        C0697Ql c0697QlA = ((C0784Vn) this.f13695b).a();
        c0697QlA.r("action", str);
        c0697QlA.r("pat", Long.toString(j6));
        c0697QlA.r("pid", str2);
        c0697QlA.r("ad_unit_id", str3);
        c0697QlA.r("max_ads", Integer.toString(i));
        c0697QlA.r("cache_size", Integer.toString(i3));
        c0697QlA.r("tpcnt", Integer.toString(i7));
        c0697QlA.r("mpl", Integer.toString(i8));
        if (enumC2546b != null) {
            c0697QlA.r("ad_format", enumC2546b.name().toLowerCase(Locale.ENGLISH));
        }
        if (i6 > 0) {
            c0697QlA.r("nptr", Integer.toString(i6));
        }
        c0697QlA.s();
    }

    public /* synthetic */ C1014cu(int i, Object obj) {
        this.f13694a = i;
        this.f13695b = obj;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1223gl, com.google.android.gms.internal.ads.InterfaceC0801Wn
    /* renamed from: b */
    public void mo4b(Object obj) {
        switch (this.f13694a) {
            case 1:
                Ju ju = (Ju) this.f13695b;
                ((Nu) obj).a(ju.f9393b);
                break;
            default:
                ((CO) obj).o((IOException) this.f13695b);
                break;
        }
    }

    public /* synthetic */ C1014cu(BO bo, C1319iQ c1319iQ, C1587nQ c1587nQ, IOException iOException, boolean z6) {
        this.f13694a = 11;
        this.f13695b = iOException;
    }

    public C1014cu(Matcher matcher) {
        this.f13694a = 5;
        matcher.getClass();
        this.f13695b = matcher;
    }

    public C1014cu(K4.e eVar, C1431kf c1431kf, Context context, View view, Activity activity, String str, HashMap map, S5 s5, EnumC1450ky enumC1450ky) {
        this.f13694a = 4;
        C1907tN c1907tNA = C1907tN.a(enumC1450ky);
        C1907tN c1907tNB = C1907tN.b(str);
        C1907tN c1907tNA2 = C1907tN.a(s5);
        C1799rN c1799rN = (C1799rN) c1431kf.f15174c;
        C1907tN c1907tN = (C1907tN) eVar.f2238b;
        C1799rN c1799rN2 = (C1799rN) eVar.i;
        C1775qz c1775qz = new C1775qz(c1907tNA2, c1799rN, c1907tN, c1799rN2, 0);
        C1927tq c1927tq = new C1927tq(c1907tNA2, c1799rN, c1799rN2, 9);
        C1907tN c1907tNA3 = C1907tN.a(map);
        C1799rN c1799rN3 = (C1799rN) c1431kf.f15174c;
        C1799rN c1799rN4 = (C1799rN) eVar.i;
        int i = 1;
        C1613nz c1613nz = new C1613nz(c1907tNA2, c1799rN3, c1907tNA3, c1799rN4, i);
        C1775qz c1775qz2 = new C1775qz(c1907tNA2, c1799rN3, (C1907tN) eVar.f2241e, c1799rN4, i);
        Ay ay = new Ay(c1907tNA2, c1799rN3, c1907tNA, c1907tNA3, c1799rN4, 2);
        C1927tq c1927tq2 = new C1927tq(c1907tNA2, c1799rN3, c1799rN4, 10);
        C1907tN c1907tNA4 = C1907tN.a(context);
        C1799rN c1799rN5 = (C1799rN) c1431kf.f15174c;
        C1799rN c1799rN6 = (C1799rN) eVar.i;
        C0663Ol c0663Ol = new C0663Ol(c1907tNA2, c1799rN5, c1907tNA, c1907tNA4, c1907tNA3, c1799rN6);
        C1907tN c1907tN2 = (C1907tN) eVar.f2238b;
        C1907tN c1907tN3 = (C1907tN) eVar.f2241e;
        C0682Pn c0682Pn = new C0682Pn(c1907tNA2, c1799rN5, c1907tNA3, c1907tN2, c1907tNA, c1907tN3, c1799rN6);
        C1775qz c1775qz3 = new C1775qz(c1907tNA2, c1799rN5, c1907tN2, c1799rN6, 2);
        Ry ry = new Ry(c1907tNA2, c1799rN5, c1907tNA3, c1907tN2, c1799rN6, 1);
        C1613nz c1613nz2 = new C1613nz(c1907tNA2, c1907tNA3, c1907tN3, c1799rN6);
        int i3 = C2123xN.f17584c;
        ArrayList arrayList = new ArrayList(11);
        List list = Collections.EMPTY_LIST;
        arrayList.add(c1775qz);
        arrayList.add(c1927tq);
        arrayList.add(c1613nz);
        arrayList.add(c1775qz2);
        arrayList.add(ay);
        arrayList.add(c1927tq2);
        arrayList.add(c0663Ol);
        arrayList.add(c0682Pn);
        arrayList.add(c1775qz3);
        arrayList.add(ry);
        arrayList.add(c1613nz2);
        C2123xN c2123xN = new C2123xN(arrayList, list);
        C1907tN c1907tNB2 = C1907tN.b(view);
        C1907tN c1907tNB3 = C1907tN.b(activity);
        C1799rN c1799rN7 = (C1799rN) c1431kf.f15174c;
        C1799rN c1799rN8 = (C1799rN) eVar.i;
        Ay ay2 = new Ay(c1907tNA2, c1799rN7, c1907tNB2, c1907tNB3, c1799rN8, 1);
        C1799rN c1799rNA = C1799rN.a(new C1440ko(c1907tNA4, 7));
        Ry ry2 = new Ry(c1907tNA2, c1799rN7, c1799rNA, c1907tNB2, c1799rN8, 3);
        ArrayList arrayList2 = new ArrayList(11);
        List list2 = Collections.EMPTY_LIST;
        arrayList2.add(c1775qz);
        arrayList2.add(c1927tq);
        arrayList2.add(c1775qz2);
        arrayList2.add(ay2);
        arrayList2.add(ry2);
        arrayList2.add(ay);
        arrayList2.add(c1927tq2);
        arrayList2.add(c0663Ol);
        arrayList2.add(c0682Pn);
        arrayList2.add(c1775qz3);
        arrayList2.add(ry);
        C2123xN c2123xN2 = new C2123xN(arrayList2, list2);
        Ry ry3 = new Ry(c1907tNA2, (C1799rN) c1431kf.f15174c, c1907tNA3, c1799rNA, (C1799rN) eVar.i, 2);
        ArrayList arrayList3 = new ArrayList(12);
        List list3 = Collections.EMPTY_LIST;
        arrayList3.add(c1775qz);
        arrayList3.add(c1927tq);
        arrayList3.add(c1775qz2);
        arrayList3.add(ay2);
        arrayList3.add(ry2);
        arrayList3.add(ay);
        arrayList3.add(c1927tq2);
        arrayList3.add(c0663Ol);
        arrayList3.add(c0682Pn);
        arrayList3.add(c1775qz3);
        arrayList3.add(ry);
        arrayList3.add(ry3);
        this.f13695b = C1799rN.a(new C0847Zi((C1799rN) eVar.f2245j, (C1799rN) eVar.f2247l, (C1799rN) c1431kf.f15174c, c1907tNA, c1907tNB, c1907tNA2, c2123xN, c2123xN2, new C2123xN(arrayList3, list3), (C1799rN) eVar.i));
    }

    public C1014cu(VK vk) {
        this.f13694a = 7;
        Charset charset = AbstractC1528mL.f15610a;
        if (vk == null) {
            throw new NullPointerException("output");
        }
        this.f13695b = vk;
        vk.f11983b = this;
    }
}
