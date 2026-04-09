package ii;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.SuperscriptSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewParent;
import androidx.lifecycle.f1;
import ci.b;
import com.applovin.sdk.AppLovinEventTypes;
import com.applovin.sdk.AppLovinMediationProvider;
import com.google.android.gms.internal.play_billing.m1;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.utilities.f;
import com.liuzh.deviceinfo.utilities.l;
import com.liuzh.deviceinfo.widget.OverViewWidget4x2;
import ed.e;
import ed.h;
import ed.j;
import ed.m;
import h3.g;
import j$.util.DesugarCollections;
import j2.h0;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import je.u;
import nk.k;
import nk.v;
import o7.d;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p6.i;
import rl.c0;
import rl.t;
import rl.z;
import t6.c;
import u0.p;
import va.o;
import zj.n;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: b, reason: collision with root package name */
    public static d f26002b;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26003a;

    public /* synthetic */ a(int i4) {
        this.f26003a = i4;
    }

    public static int A(Context context) {
        TypedValue typedValueY = y(R.attr.minTouchTargetSize, context);
        return (int) ((typedValueY == null || typedValueY.type != 5) ? context.getResources().getDimension(R.dimen.mtrl_min_touch_target_size) : typedValueY.getDimension(context.getResources().getDisplayMetrics()));
    }

    public static TypedValue B(Context context, int i4, String str) {
        TypedValue typedValueY = y(i4, context);
        if (typedValueY != null) {
            return typedValueY;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i4)));
    }

    public static CharSequence C(String str) {
        if (!str.endsWith(" for Galaxy")) {
            return str;
        }
        SpannableString spannableString = new SpannableString(str);
        int length = str.length() - 11;
        int length2 = str.length();
        spannableString.setSpan(new RelativeSizeSpan(0.6f), length, length2, 33);
        spannableString.setSpan(new SuperscriptSpan(), length, length2, 33);
        return spannableString;
    }

    public static final long D(long j) {
        return (Math.round(Float.intBitsToFloat((int) (j & 4294967295L))) & 4294967295L) | (Math.round(Float.intBitsToFloat((int) (j >> 32))) << 32);
    }

    public static void E(View view, j jVar) {
        wc.a aVar = jVar.f23316b.f23300c;
        if (aVar == null || !aVar.f36599a) {
            return;
        }
        float elevation = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            elevation += ((View) parent).getElevation();
        }
        h hVar = jVar.f23316b;
        if (hVar.f23308m != elevation) {
            hVar.f23308m = elevation;
            jVar.v();
        }
    }

    public static void F(Context context, MenuItem menuItem, int i4, Drawable drawable) {
        SpannableString spannableString = new SpannableString(u.t("  ", context.getString(i4)));
        spannableString.setSpan(new ImageSpan(drawable), 0, 1, 33);
        menuItem.setTitle(spannableString);
    }

    public static final String G(int i4, p pVar) {
        return ((Resources) pVar.j(h0.f27171c)).getString(i4);
    }

    public static void H(int i4, int i10) {
        String strC;
        if (i4 < 0 || i4 >= i10) {
            if (i4 < 0) {
                strC = jm.a.C("%s (%s) must not be negative", "index", Integer.valueOf(i4));
            } else {
                if (i10 < 0) {
                    throw new IllegalArgumentException(u.r(i10, "negative size: "));
                }
                strC = jm.a.C("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i4), Integer.valueOf(i10));
            }
            throw new IndexOutOfBoundsException(strC);
        }
    }

    public static void I(int i4, int i10) {
        if (i4 < 0 || i4 > i10) {
            throw new IndexOutOfBoundsException(L(i4, i10, "index"));
        }
    }

    public static Object J(Class cls, String str, y4.a... aVarArr) {
        int length = aVarArr.length;
        Class<?>[] clsArr = new Class[length];
        Object[] objArr = new Object[length];
        for (int i4 = 0; i4 < aVarArr.length; i4++) {
            y4.a aVar = aVarArr[i4];
            aVar.getClass();
            clsArr[i4] = (Class) aVar.f37323a;
            objArr[i4] = aVarArr[i4].f37324b;
        }
        return cls.getDeclaredMethod(str, clsArr).invoke(null, objArr);
    }

    public static void K(int i4, int i10, int i11) {
        if (i4 < 0 || i10 < i4 || i10 > i11) {
            throw new IndexOutOfBoundsException((i4 < 0 || i4 > i11) ? L(i4, i11, "start index") : (i10 < 0 || i10 > i11) ? L(i10, i11, "end index") : jm.a.C("end index (%s) must not be less than start index (%s)", Integer.valueOf(i10), Integer.valueOf(i4)));
        }
    }

    public static String L(int i4, int i10, String str) {
        if (i4 < 0) {
            return jm.a.C("%s (%s) must not be negative", str, Integer.valueOf(i4));
        }
        if (i10 >= 0) {
            return jm.a.C("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i4), Integer.valueOf(i10));
        }
        throw new IllegalArgumentException(u.r(i10, "negative size: "));
    }

    public static final long a(int i4, int i10) {
        return (i10 & 4294967295L) | (i4 << 32);
    }

    public static final ExecutorService b(boolean z3) {
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new c(z3));
        k.d(executorServiceNewFixedThreadPool, "newFixedThreadPool(...)");
        return executorServiceNewFixedThreadPool;
    }

    public static int c(int i4) {
        return wi.h.g ? i4 | 67108864 : i4;
    }

    public static final int g(d6.c cVar, String str) {
        k.e(cVar, "<this>");
        int iH = h(cVar, str);
        if (iH >= 0) {
            return iH;
        }
        int iH2 = h(cVar, "`" + str + '`');
        if (iH2 >= 0) {
            return iH2;
        }
        if (Build.VERSION.SDK_INT > 25 || str.length() == 0) {
            return -1;
        }
        int columnCount = cVar.getColumnCount();
        String strConcat = ".".concat(str);
        String strP = d.h.p('`', ".", str);
        for (int i4 = 0; i4 < columnCount; i4++) {
            String columnName = cVar.getColumnName(i4);
            if (columnName.length() >= str.length() + 2 && (vk.p.p0(columnName, strConcat, false) || (columnName.charAt(0) == '`' && vk.p.p0(columnName, strP, false)))) {
                return i4;
            }
        }
        return -1;
    }

    public static final int h(d6.c cVar, String str) {
        k.e(cVar, "<this>");
        k.e(str, "name");
        int columnCount = cVar.getColumnCount();
        for (int i4 = 0; i4 < columnCount; i4++) {
            if (str.equals(cVar.getColumnName(i4))) {
                return i4;
            }
        }
        return -1;
    }

    public static m1 i(int i4) {
        return i4 != 0 ? i4 != 1 ? new m() : new e() : new m();
    }

    public static void j(String str, String str2, Object obj) {
        String strR = r(str);
        if (Log.isLoggable(strR, 3)) {
            Log.d(strR, String.format(str2, obj));
        }
    }

    public static void k(String str, String str2, Exception exc) {
        String strR = r(str);
        if (Log.isLoggable(strR, 6)) {
            Log.e(strR, str2, exc);
        }
    }

    public static void l(JSONObject jSONObject) throws JSONException {
        String strOptString = jSONObject.optString("NAME");
        if ("Snapdragon™ 865".equals(strOptString) || "Snapdragon 865".equals(strOptString)) {
            int i4 = (int) l.t()[1];
            if (i4 > 3150) {
                jSONObject.put("NAME", "Snapdragon 870");
                return;
            } else {
                if (i4 > 3000) {
                    jSONObject.put("NAME", "Snapdragon 865+");
                    return;
                }
                return;
            }
        }
        if ("Snapdragon™ 855".equals(strOptString) || "Snapdragon 855".equals(strOptString)) {
            if (((int) l.t()[1]) > 2950) {
                jSONObject.put("NAME", "Snapdragon 855+/860");
                return;
            }
            return;
        }
        if ("Snapdragon™ 888".equals(strOptString) || "Snapdragon 888".equals(strOptString)) {
            if (((int) l.t()[1]) > 2900) {
                jSONObject.put("NAME", "Snapdragon 888+");
                return;
            }
            return;
        }
        if ("Dimensity 8000".equals(strOptString)) {
            int i10 = (int) l.t()[1];
            if (i10 > 3000) {
                jSONObject.put("NAME", "Dimensity 8200");
                jSONObject.put("CPU", "1 x Cortex-A78@3.1GHz\n3 x Cortex-A78@3.0GHz\n4 x Cortex-A55@2.0GHz");
                return;
            } else {
                if (i10 > 2800) {
                    jSONObject.put("NAME", "Dimensity 8100");
                    jSONObject.put("CPU", "4 x Cortex-A78@2.85 GHz\n4 x Cortex-A55@2.0GHz");
                    return;
                }
                return;
            }
        }
        if ("Dimensity 9000".equals(strOptString)) {
            if (((int) l.t()[1]) > 3100) {
                jSONObject.put("NAME", "Dimensity 9000+");
                jSONObject.put("CPU", "1 x Cortex-X2@3.20GHz\n3 x Cortex-A710@2.85GHz\n4 x Cortex-A510@1.80GHz");
                return;
            }
            return;
        }
        if ("Snapdragon™ 8 Gen 3".equals(strOptString) || "Snapdragon 8 Gen 3".equals(strOptString)) {
            if (!"samsung".equals(Build.MANUFACTURER) || ((int) l.t()[1]) < 3350) {
                return;
            }
            jSONObject.put("NAME", "Snapdragon 8 Gen 3 for Galaxy");
            jSONObject.put("CPU", "1 x Kryo Prime (X4)@3.4GHz\n3 x Kryo Gold (A720)@3.15GHz\n2 x Kryo Gold (A720)@2.95GHz\n2 x Kryo Silver (A520)@2.26GHz");
            return;
        }
        if ("Snapdragon™ 8 Gen 2".equals(strOptString) || "Snapdragon 8 Gen 2".equals(strOptString)) {
            if (!"samsung".equals(Build.MANUFACTURER) || ((int) l.t()[1]) < 3300) {
                return;
            }
            jSONObject.put("NAME", "Snapdragon 8 Gen 2 for Galaxy");
            jSONObject.put("CPU", "1 x Kryo Prime (X3)@3.3GHz\n2 x Kryo Gold (A715)@2.8GHz\n2 x Kryo Gold (A710)@2.8GHz\n3 x Kryo Silver (A510)@2.0GHz");
            return;
        }
        if ("Snapdragon™ 8 Gen 1".equals(strOptString) || "Snapdragon 8 Gen 1".equals(strOptString)) {
            if (((int) l.t()[1]) < 2930) {
                jSONObject.put("NAME", "Snapdragon 7+ Gen 2");
                jSONObject.put("CPU", "1 x Kryo Prime (X2)@2.9GHz\n3 x Kryo Gold (A710)@2.5GHz\n4 x Kryo Silver (A510)@1.8GHz");
                jSONObject.put("CHANNELS", "");
                jSONObject.put("FAB", "4nm N4(TSMC)");
                return;
            }
            return;
        }
        if ("Snapdragon™ 8+ Gen 1".equals(strOptString) || "Snapdragon 8+ Gen 1".equals(strOptString)) {
            if (((int) l.t()[1]) < 3160) {
                jSONObject.put("CPU", "1 x Kryo Prime (X2)@3.0GHz\n3 x Kryo Gold (A710)@2.5GHz\n4 x Kryo Silver (A510)@1.8GHz");
                return;
            }
            return;
        }
        if ("Snapdragon™ 778G".equals(strOptString) || "Snapdragon 778G".equals(strOptString)) {
            if (((int) l.t()[1]) > 2600) {
                jSONObject.put("NAME", "Snapdragon 782G");
                jSONObject.put("CPU", "1 x Kryo 670 Prime@2.7GHz\n3 x Kryo 670 Gold@2.4GHz\n4 x Kryo 670 Silver@1.8GHz");
                return;
            }
            return;
        }
        if ("Kirin 710".equals(strOptString)) {
            if (((int) l.t()[1]) < 2100) {
                jSONObject.put("NAME", "Kirin 710A");
                jSONObject.put("CPU", "4 x Cortex-A73@2.0GHz\n4 x Cortex-A53@1.7GHz");
                jSONObject.put("FAB", "14nm");
                return;
            }
            return;
        }
        if ("Kirin 9000E".equals(strOptString)) {
            if (Runtime.getRuntime().availableProcessors() == 6) {
                jSONObject.put("NAME", "Kirin 9000L");
                jSONObject.put("CPU", "1 x Cortex-A77@3.13GHz\n2 x Cortex-A77@2.54GHz\n3 x Cortex-A55@2.05GHz");
                return;
            }
            return;
        }
        if ("Dimensity 9200".equals(strOptString)) {
            if (((int) l.t()[1]) > 3300) {
                jSONObject.put("NAME", "Dimensity 9200+");
                jSONObject.put("CPU", "1 x Cortex-X3@3.35GHz\n3 x Cortex-A715@3.00GHz\n4 x Cortex-A510@2.00GHz");
                return;
            }
            return;
        }
        if ("Dimensity 8100".equals(strOptString)) {
            if (((int) l.t()[1]) < 2790) {
                jSONObject.put("NAME", "Dimensity 8000-MAX");
                jSONObject.put("CPU", "4 × Cortex-A78@2.75GHz\n4 × Cortex-A55@2.0GHz");
                return;
            }
            return;
        }
        if ("Dimensity 700".equals(strOptString)) {
            if (((int) l.t()[1]) > 2300) {
                jSONObject.put("NAME", "Dimensity 6080(810)");
                jSONObject.put("CPU", "2 × Cortex-A76@2.4GHz\n6 × Cortex-A55@2.0GHz");
                jSONObject.put("FAB", "6 nm (TSMC N6)");
                return;
            }
            return;
        }
        if (!"Dimensity 9300".equals(strOptString) || ((int) l.t()[1]) <= 3350) {
            return;
        }
        jSONObject.put("NAME", "Dimensity 9300+");
        jSONObject.put("CPU", "1 × Cortex-X4@3.4GHz\n3 × Cortex-X4@2.85GHz\n4 × Cortex-A720@2.0GHz");
    }

    public static final int m(d6.c cVar, String str) {
        k.e(cVar, "stmt");
        int iG = g(cVar, str);
        if (iG >= 0) {
            return iG;
        }
        int columnCount = cVar.getColumnCount();
        ArrayList arrayList = new ArrayList(columnCount);
        for (int i4 = 0; i4 < columnCount; i4++) {
            arrayList.add(cVar.getColumnName(i4));
        }
        throw new IllegalArgumentException("Column '" + str + "' does not exist. Available columns: [" + n.g0(arrayList, null, null, null, null, 63) + ']');
    }

    public static Set n() {
        try {
            Object objInvoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (objInvoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) objInvoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    public static String o() throws Throwable {
        int iLastIndexOf;
        z zVar;
        z zVarX;
        z zVarW;
        c0 c0Var;
        JSONObject jSONObjectOptJSONObject;
        z zVar2 = null;
        if (!f.f21257c.getBoolean("soc_not_found", false) && !b.t(Build.MODEL.trim(), Build.DEVICE.trim(), Build.BRAND)) {
            String strM = l.M();
            if (l.a0(strM)) {
                strM = l.w();
            } else {
                if (strM.endsWith(")") && (iLastIndexOf = strM.lastIndexOf("(")) > 0) {
                    strM = strM.substring(0, iLastIndexOf);
                }
                if (strM.endsWith(")") || l.a0(strM)) {
                    strM = l.w();
                } else if (strM.contains(" ")) {
                    String[] strArrSplit = strM.split(" ");
                    String str = strArrSplit[strArrSplit.length - 1];
                    if (!str.equalsIgnoreCase("5g") && !str.equalsIgnoreCase("aie")) {
                        try {
                            Integer.parseInt(str);
                            if (strArrSplit.length > 1) {
                                str = strArrSplit[strArrSplit.length - 2] + " " + strArrSplit[strArrSplit.length - 1];
                            }
                        } catch (NumberFormatException unused) {
                        }
                    } else if (strArrSplit.length > 1) {
                        str = strArrSplit[strArrSplit.length - 2] + " " + strArrSplit[strArrSplit.length - 1];
                    }
                    strM = l.a0(str) ? l.w() : str;
                }
            }
            if (!TextUtils.isEmpty(strM) && !l.a0(strM)) {
                try {
                    zVarW = w(String.format(a.a.s() ? "https://gitlab.com/liuzho/SOCS/raw/master/socs/%1$s.json" : "https://raw.githubusercontent.com/liuzho/SOCS/master/socs/%1$s.json", URLEncoder.encode(strM.trim().toLowerCase(Locale.US), "utf-8")));
                } catch (IOException | JSONException unused2) {
                    zVarX = null;
                    zVarW = null;
                } catch (Throwable th2) {
                    th = th2;
                    zVar = null;
                }
                try {
                    try {
                        c0Var = zVarW.g;
                    } catch (IOException | JSONException unused3) {
                        zVarX = null;
                    }
                    if (zVarW.f33217p) {
                        if (c0Var == null) {
                            wd.b.d(zVarW);
                            return null;
                        }
                        String strP = c0Var.p();
                        wd.b.d(zVarW);
                        return strP;
                    }
                    zVarX = x(strM);
                    try {
                        try {
                            if (zVarX.f33217p) {
                                c0 c0Var2 = zVarX.g;
                                if (c0Var2 != null && (jSONObjectOptJSONObject = new JSONObject(c0Var2.p()).optJSONObject("data")) != null) {
                                    String string = jSONObjectOptJSONObject.toString();
                                    wd.b.d(zVarW);
                                    wd.b.d(zVarX);
                                    return string;
                                }
                            } else if (zVarX.f33207d == 404) {
                                f fVar = f.f21256b;
                                f.k("soc_not_found", true);
                            }
                        } catch (Throwable th3) {
                            zVar = zVarX;
                            th = th3;
                            zVar2 = zVarW;
                            wd.b.d(zVar2);
                            wd.b.d(zVar);
                            throw th;
                        }
                    } catch (IOException | JSONException unused4) {
                    }
                    wd.b.d(zVarW);
                    wd.b.d(zVarX);
                    return null;
                } catch (Throwable th4) {
                    th = th4;
                    zVar = null;
                }
            }
        }
        return null;
    }

    public static synchronized i p() {
        boolean z3;
        f fVar = f.f21256b;
        String string = f.f21257c.getString("cached_soc_json", null);
        if (TextUtils.isEmpty(string)) {
            string = o();
            z3 = true;
        } else {
            z3 = false;
        }
        if (string == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(string);
            l(jSONObject);
            f.m("cached_soc_json", jSONObject.toString());
            if (z3) {
                OverViewWidget4x2.c();
            }
            return new i(jSONObject);
        } catch (JSONException e2) {
            wd.b.B(new RuntimeException("bad json for: ".concat(string), e2));
            return null;
        }
    }

    public static i q() {
        f fVar = f.f21256b;
        String string = f.f21257c.getString("cached_soc_json", null);
        if (!TextUtils.isEmpty(string)) {
            try {
                return new i(new JSONObject(string));
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public static String r(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            return "TRuntime.".concat(str);
        }
        String strConcat = "TRuntime.".concat(str);
        return strConcat.length() > 23 ? strConcat.substring(0, 23) : strConcat;
    }

    public static boolean s(String str) {
        p6.b bVar = p6.l.f31387a;
        Set<p6.d> setUnmodifiableSet = DesugarCollections.unmodifiableSet(p6.c.f31377c);
        HashSet hashSet = new HashSet();
        for (p6.d dVar : setUnmodifiableSet) {
            if (((p6.c) dVar).f31378a.equals(str)) {
                hashSet.add(dVar);
            }
        }
        if (hashSet.isEmpty()) {
            throw new RuntimeException("Unknown feature ".concat(str));
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            p6.c cVar = (p6.c) ((p6.d) it.next());
            if (cVar.a() || cVar.b()) {
                return true;
            }
        }
        return false;
    }

    public static final long t(long j, long j8) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) + ((int) (j8 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) + ((int) (j8 & 4294967295L));
        return (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L);
    }

    public static z w(String str) {
        f1 f1Var = new f1(24);
        f1Var.L(str);
        f1Var.G("GET", null);
        t tVar = hi.b.f25152a;
        o oVar = new o(f1Var);
        tVar.getClass();
        return new vl.m(tVar, oVar).e();
    }

    public static z x(String str) throws JSONException {
        String str2 = Build.MODEL;
        String strTrim = str2.trim();
        String strTrim2 = Build.DEVICE.trim();
        String strTrim3 = Build.BRAND.trim();
        String strL = b.l(str2);
        int i4 = 0;
        km.n nVar = new km.n(0);
        for (Map.Entry entry : l.e().entrySet()) {
            nVar.g((String) entry.getKey(), (String) entry.getValue());
        }
        String strN = l.N("ro.config.cpu_info_display");
        if (!TextUtils.isEmpty(strN)) {
            nVar.g("ro.config.cpu_info_display", strN);
        }
        ArrayList arrayListU = l.u();
        JSONArray jSONArray = new JSONArray();
        try {
            int size = arrayListU.size();
            while (i4 < size) {
                Object obj = arrayListU.get(i4);
                i4++;
                Point point = (Point) obj;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("min", point.x);
                jSONObject.put(AppLovinMediationProvider.MAX, point.y);
                jSONArray.put(jSONObject);
            }
            nVar.g("fixed_name", str);
            nVar.g("structs", jSONArray.toString());
            nVar.g("device", strTrim2);
            nVar.g("model", strTrim);
            nVar.g("brand", strTrim3);
            nVar.g(AppLovinEventTypes.USER_VIEWED_PRODUCT, strL);
            nVar.g("vcode", "327");
            nVar.g("vflavor", "google");
            nVar.g("rv", "1");
            rl.j jVar = new rl.j((ArrayList) nVar.f28442b, (ArrayList) nVar.f28443c);
            f1 f1Var = new f1(24);
            f1Var.L("https://liuzhosoft.com/server/devinfo/api/socinfo");
            f1Var.G("POST", jVar);
            t tVar = hi.b.f25152a;
            o oVar = new o(f1Var);
            tVar.getClass();
            return new vl.m(tVar, oVar).e();
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    public static TypedValue y(int i4, Context context) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i4, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean z(Context context, int i4, boolean z3) {
        TypedValue typedValueY = y(i4, context);
        return (typedValueY == null || typedValueY.type != 18) ? z3 : typedValueY.data != 0;
    }

    public abstract boolean d(g gVar, h3.c cVar, h3.c cVar2);

    public abstract boolean e(g gVar, Object obj, Object obj2);

    public abstract boolean f(g gVar, h3.f fVar, h3.f fVar2);

    public int hashCode() {
        switch (this.f26003a) {
            case 8:
                return toString().hashCode();
            default:
                return super.hashCode();
        }
    }

    public String toString() {
        switch (this.f26003a) {
            case 8:
                String strC = v.a(getClass()).c();
                k.b(strC);
                return strC;
            default:
                return super.toString();
        }
    }

    public abstract void u(h3.f fVar, h3.f fVar2);

    public abstract void v(h3.f fVar, Thread thread);
}
