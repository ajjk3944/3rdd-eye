package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class no {

    /* renamed from: a, reason: collision with root package name */
    public static final io f14362a = new io(12);

    /* renamed from: b, reason: collision with root package name */
    public static final io f14363b = new io(13);

    /* renamed from: c, reason: collision with root package name */
    public static final io f14364c = new io(14);

    /* renamed from: d, reason: collision with root package name */
    public static final io f14365d = new io(15);

    /* renamed from: e, reason: collision with root package name */
    public static final io f14366e = new io(16);

    /* renamed from: f, reason: collision with root package name */
    public static final io f14367f = new io(17);
    public static final ly g = new ly();

    /* renamed from: h, reason: collision with root package name */
    public static final io f14368h = new io(25);

    /* renamed from: i, reason: collision with root package name */
    public static final ho f14369i = new ho();
    public static final lo j = new lo();

    /* renamed from: k, reason: collision with root package name */
    public static final io f14370k = new io(18);

    /* renamed from: l, reason: collision with root package name */
    public static final io f14371l = new io(19);

    /* renamed from: m, reason: collision with root package name */
    public static final io f14372m = new io(0);

    /* renamed from: n, reason: collision with root package name */
    public static final io f14373n = new io(1);

    /* renamed from: o, reason: collision with root package name */
    public static final io f14374o = new io(2);

    /* renamed from: p, reason: collision with root package name */
    public static final io f14375p = new io(3);

    /* renamed from: q, reason: collision with root package name */
    public static final io f14376q = new io(4);

    /* renamed from: r, reason: collision with root package name */
    public static final io f14377r = new io(5);

    /* renamed from: s, reason: collision with root package name */
    public static final io f14378s = new io(6);

    /* renamed from: t, reason: collision with root package name */
    public static final io f14379t = new io(7);

    /* renamed from: u, reason: collision with root package name */
    public static final io f14380u = new io(8);

    /* renamed from: v, reason: collision with root package name */
    public static final io f14381v = new io(9);

    /* renamed from: w, reason: collision with root package name */
    public static final io f14382w = new io(10);

    /* renamed from: x, reason: collision with root package name */
    public static final io f14383x = new io(11);

    public static vd.b a(qz qzVar, String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        String strD;
        String strReplace;
        Uri uriB = Uri.parse(str);
        try {
            oe oeVarH0 = qzVar.H0();
            jq0 jq0VarL0 = qzVar.L0();
            if (!((Boolean) va.s.f36163e.f36166c.a(sk.f16216ld)).booleanValue() || jq0VarL0 == null) {
                if (oeVarH0 != null && oeVarH0.a(uriB)) {
                    uriB = oeVarH0.b(uriB, qzVar.getContext(), qzVar.N(), qzVar.A1());
                }
            } else if (oeVarH0 != null && oeVarH0.a(uriB)) {
                uriB = jq0VarL0.a(uriB, qzVar.getContext(), qzVar.N(), qzVar.A1());
            }
        } catch (pe unused) {
            za.i.h("Unable to append parameter to URL: ".concat(str));
        }
        HashMap map = new HashMap();
        if (qzVar.s() != null) {
            map = qzVar.s().f18115w0;
        }
        Context context = qzVar.getContext();
        dw dwVar = ua.j.C.f35281y;
        if (dwVar.a(context) && (strD = dwVar.d(context)) != null) {
            pk pkVar = sk.H0;
            rk rkVar = va.s.f36163e.f36166c;
            String str2 = (String) rkVar.a(pkVar);
            String string = uriB.toString();
            if (((Boolean) rkVar.a(sk.G0)).booleanValue() && string.contains(str2)) {
                dwVar.h(context, "_ac", strD, dw.f((Map) map.get("_ac")));
                strReplace = a80.x(context, string).replace(str2, strD);
            } else if (!TextUtils.isEmpty(uriB.getQueryParameter("fbs_aeid")) || ((Boolean) rkVar.a(sk.F0)).booleanValue()) {
                strReplace = string;
            } else {
                String string2 = a80.q(a80.x(context, string), "fbs_aeid", strD).toString();
                dwVar.h(context, "_ac", strD, dw.f((Map) map.get("_ac")));
                strReplace = string2;
            }
        } else {
            strReplace = uriB.toString();
        }
        long jLongValue = ((Long) tl.f16873e.u()).longValue();
        if (jLongValue <= 0 || jLongValue > 254715000) {
            return yo0.e(strReplace);
        }
        n81 n81VarS = n81.s(qzVar.h0());
        o5 o5Var = o5.f14542c;
        ex exVar = fx.g;
        return yo0.C(yo0.G(yo0.C(n81VarS, Throwable.class, o5Var, exVar), new ko(strReplace, 0), exVar), Throwable.class, new ko(strReplace, 1), exVar);
    }

    public static void b(Map map, t80 t80Var) {
        if (((Boolean) va.s.f36163e.f36166c.a(sk.Yb)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals("1") && t80Var != null) {
            t80Var.x();
        }
    }
}
