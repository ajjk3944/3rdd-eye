package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class x32 {
    public static final o32 a = new o32(12);
    public static final o32 b = new o32(13);
    public static final o32 c = new o32(14);
    public static final o32 d = new o32(15);
    public static final o32 e = new o32(16);
    public static final o32 f = new o32(17);
    public static final ve2 g = new ve2();
    public static final o32 h = new o32(25);
    public static final n32 i = new n32();
    public static final v32 j = new v32();
    public static final o32 k = new o32(18);
    public static final o32 l = new o32(19);
    public static final o32 m = new o32(0);
    public static final o32 n = new o32(1);
    public static final o32 o = new o32(2);
    public static final o32 p = new o32(3);
    public static final o32 q = new o32(4);
    public static final o32 r = new o32(5);
    public static final o32 s = new o32(6);
    public static final o32 t = new o32(7);
    public static final o32 u = new o32(8);
    public static final o32 v = new o32(9);
    public static final o32 w = new o32(10);
    public static final o32 x = new o32(11);

    public static n70 a(ag2 ag2Var, String str) {
        String strD;
        String strReplace;
        Uri uriB = Uri.parse(str);
        try {
            vs1 vs1VarW = ag2Var.W();
            m83 m83VarU0 = ag2Var.u0();
            if (!((Boolean) tw1.e.c.a(mz1.Mc)).booleanValue() || m83VarU0 == null) {
                if (vs1VarW != null && vs1VarW.a(uriB)) {
                    uriB = vs1VarW.b(uriB, ag2Var.getContext(), ag2Var.p0(), ag2Var.g());
                }
            } else if (vs1VarW != null && vs1VarW.a(uriB)) {
                uriB = m83VarU0.a(uriB, ag2Var.getContext(), ag2Var.p0(), ag2Var.g());
            }
        } catch (ws1 unused) {
            gi2.i0("Unable to append parameter to URL: ".concat(str));
        }
        HashMap map = new HashMap();
        if (ag2Var.F() != null) {
            map = ag2Var.F().w0;
        }
        Context context = ag2Var.getContext();
        oc2 oc2Var = hg4.C.y;
        if (oc2Var.a(context) && (strD = oc2Var.d(context)) != null) {
            iz1 iz1Var = mz1.s0;
            kz1 kz1Var = tw1.e.c;
            String str2 = (String) kz1Var.a(iz1Var);
            String string = uriB.toString();
            if (((Boolean) kz1Var.a(mz1.r0)).booleanValue() && string.contains(str2)) {
                oc2Var.h(context, "_ac", strD, oc2.f((Map) map.get("_ac")));
                strReplace = m54.S(context, string).replace(str2, strD);
            } else if (!TextUtils.isEmpty(uriB.getQueryParameter("fbs_aeid")) || ((Boolean) kz1Var.a(mz1.q0)).booleanValue()) {
                strReplace = string;
            } else {
                String string2 = m54.P(m54.S(context, string), "fbs_aeid", strD).toString();
                oc2Var.h(context, "_ac", strD, oc2.f((Map) map.get("_ac")));
                strReplace = string2;
            }
        } else {
            strReplace = uriB.toString();
        }
        long jLongValue = ((Long) r02.e.w()).longValue();
        if (jLongValue <= 0 || jLongValue > 253830000) {
            return pu1.r(strReplace);
        }
        gq3 gq3VarR = gq3.r(ag2Var.t0());
        gj1 gj1Var = gj1.e;
        ld2 ld2Var = md2.g;
        return pu1.J(pu1.P(pu1.J(gq3VarR, Throwable.class, gj1Var, ld2Var), new u32(strReplace, 0), ld2Var), Throwable.class, new u32(strReplace, 1), ld2Var);
    }

    public static void b(Map map, xp2 xp2Var) {
        if (((Boolean) tw1.e.c.a(mz1.zb)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals("1") && xp2Var != null) {
            xp2Var.s0();
        }
    }
}
