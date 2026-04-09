package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import f4.InterfaceFutureC2326a;
import java.util.HashMap;
import java.util.Map;
import q2.C2841s;

/* renamed from: com.google.android.gms.internal.ads.Cb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0449Cb {

    /* renamed from: a, reason: collision with root package name */
    public static final C2128xb f7599a = new C2128xb(12);

    /* renamed from: b, reason: collision with root package name */
    public static final C2128xb f7600b = new C2128xb(13);

    /* renamed from: c, reason: collision with root package name */
    public static final C2128xb f7601c = new C2128xb(14);

    /* renamed from: d, reason: collision with root package name */
    public static final C2128xb f7602d = new C2128xb(15);

    /* renamed from: e, reason: collision with root package name */
    public static final C2128xb f7603e = new C2128xb(16);

    /* renamed from: f, reason: collision with root package name */
    public static final C2128xb f7604f = new C2128xb(17);

    /* renamed from: g, reason: collision with root package name */
    public static final C1917tg f7605g = new C1917tg();

    /* renamed from: h, reason: collision with root package name */
    public static final C2128xb f7606h = new C2128xb(25);
    public static final C2074wb i = new C2074wb();

    /* renamed from: j, reason: collision with root package name */
    public static final C0415Ab f7607j = new C0415Ab();

    /* renamed from: k, reason: collision with root package name */
    public static final C2128xb f7608k = new C2128xb(18);

    /* renamed from: l, reason: collision with root package name */
    public static final C2128xb f7609l = new C2128xb(19);

    /* renamed from: m, reason: collision with root package name */
    public static final C2128xb f7610m = new C2128xb(0);

    /* renamed from: n, reason: collision with root package name */
    public static final C2128xb f7611n = new C2128xb(1);

    /* renamed from: o, reason: collision with root package name */
    public static final C2128xb f7612o = new C2128xb(2);

    /* renamed from: p, reason: collision with root package name */
    public static final C2128xb f7613p = new C2128xb(3);

    /* renamed from: q, reason: collision with root package name */
    public static final C2128xb f7614q = new C2128xb(4);

    /* renamed from: r, reason: collision with root package name */
    public static final C2128xb f7615r = new C2128xb(5);

    /* renamed from: s, reason: collision with root package name */
    public static final C2128xb f7616s = new C2128xb(6);

    /* renamed from: t, reason: collision with root package name */
    public static final C2128xb f7617t = new C2128xb(7);

    /* renamed from: u, reason: collision with root package name */
    public static final C2128xb f7618u = new C2128xb(8);

    /* renamed from: v, reason: collision with root package name */
    public static final C2128xb f7619v = new C2128xb(9);

    /* renamed from: w, reason: collision with root package name */
    public static final C2128xb f7620w = new C2128xb(10);

    /* renamed from: x, reason: collision with root package name */
    public static final C2128xb f7621x = new C2128xb(11);

    public static InterfaceFutureC2326a a(InterfaceC0828Yg interfaceC0828Yg, String str) {
        String strD;
        String strReplace;
        Uri uriB = Uri.parse(str);
        try {
            H6 h6Q0 = interfaceC0828Yg.Q0();
            C1068du c1068duW0 = interfaceC0828Yg.W0();
            if (!((Boolean) C2841s.f23267e.f23270c.a(H9.jd)).booleanValue() || c1068duW0 == null) {
                if (h6Q0 != null && h6Q0.a(uriB)) {
                    uriB = h6Q0.b(uriB, interfaceC0828Yg.getContext(), interfaceC0828Yg.b0(), interfaceC0828Yg.h());
                }
            } else if (h6Q0 != null && h6Q0.a(uriB)) {
                uriB = c1068duW0.a(uriB, interfaceC0828Yg.getContext(), interfaceC0828Yg.b0(), interfaceC0828Yg.h());
            }
        } catch (I6 unused) {
            u2.k.h("Unable to append parameter to URL: ".concat(str));
        }
        HashMap map = new HashMap();
        if (interfaceC0828Yg.J() != null) {
            map = interfaceC0828Yg.J().f10799w0;
        }
        Context context = interfaceC0828Yg.getContext();
        C1593nf c1593nf = p2.j.f22785C.f22811y;
        if (c1593nf.a(context) && (strD = c1593nf.d(context)) != null) {
            E9 e9 = H9.f8602H0;
            G9 g9 = C2841s.f23267e.f23270c;
            String str2 = (String) g9.a(e9);
            String string = uriB.toString();
            if (((Boolean) g9.a(H9.f8595G0)).booleanValue() && string.contains(str2)) {
                c1593nf.h(context, C1593nf.f((Map) map.get("_ac")), "_ac", strD);
                strReplace = AbstractC0933bL.w(context, string).replace(str2, strD);
            } else if (!TextUtils.isEmpty(uriB.getQueryParameter("fbs_aeid")) || ((Boolean) g9.a(H9.f8590F0)).booleanValue()) {
                strReplace = string;
            } else {
                String string2 = AbstractC0933bL.r(AbstractC0933bL.w(context, string), "fbs_aeid", strD).toString();
                c1593nf.h(context, C1593nf.f((Map) map.get("_ac")), "_ac", strD);
                strReplace = string2;
            }
        } else {
            strReplace = uriB.toString();
        }
        long jLongValue = ((Long) AbstractC1320ia.f14727e.v()).longValue();
        if (jLongValue <= 0 || jLongValue > 254715000) {
            return AbstractC1984ut.e(strReplace);
        }
        AbstractC2221zD abstractC2221zDR = AbstractC2221zD.r(interfaceC0828Yg.u0());
        C1563n2 c1563n2 = C1563n2.f15711c;
        C0623Mf c0623Mf = AbstractC0640Nf.f10011g;
        return AbstractC1984ut.C(AbstractC1984ut.G(AbstractC1984ut.C(abstractC2221zDR, Throwable.class, c1563n2, c0623Mf), new C2236zb(strReplace, 0), c0623Mf), Throwable.class, new C2236zb(strReplace, 1), c0623Mf);
    }

    public static void b(Map map, InterfaceC2084wl interfaceC2084wl) {
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.Wb)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals("1") && interfaceC2084wl != null) {
            interfaceC2084wl.L();
        }
    }
}
