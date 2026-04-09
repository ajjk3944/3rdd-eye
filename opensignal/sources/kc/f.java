package kc;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import bf.n;
import br.l;
import com.staircase3.opensignal.library.cells.NewCell;
import dt.m;
import ht.a1;
import ht.b0;
import ht.x;
import i.g0;
import io.sentry.android.core.e0;
import ir.f0;
import java.lang.reflect.Method;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import k2.r;
import lq.c0;
import lq.k;
import lq.p;
import lq.q;
import lq.y;
import lr.z1;
import mr.w;
import org.json.JSONException;
import org.json.JSONObject;
import rr.u0;
import u3.i0;
import u3.m0;
import u3.z;
import ur.q0;
import ur.v;

/* loaded from: classes.dex */
public abstract class f implements m0 {

    /* renamed from: a, reason: collision with root package name */
    public static ClassLoader f14285a;

    /* renamed from: b, reason: collision with root package name */
    public static Thread f14286b;

    /* renamed from: c, reason: collision with root package name */
    public static NewCell f14287c;

    /* renamed from: d, reason: collision with root package name */
    public static Context f14288d;

    public static final Method A(Class cls, rr.d dVar) throws NoSuchMethodException, SecurityException {
        l.e(dVar, "descriptor");
        try {
            Method declaredMethod = cls.getDeclaredMethod("unbox-impl", null);
            l.d(declaredMethod, "{\n        getDeclaredMet…LINE_CLASS_MEMBERS)\n    }");
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            throw new k("No unbox method found in inline class: " + cls + " (calling " + dVar + ')', 1);
        }
    }

    public static boolean D(Context context) {
        f0.T(context, "The application context is required.");
        return context.checkPermission("android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid()) == 0;
    }

    public static lq.h E(lq.j jVar, ar.a aVar) {
        y yVar = y.f15589a;
        l.e(jVar, "mode");
        l.e(aVar, "initializer");
        int i10 = lq.i.f15570a[jVar.ordinal()];
        if (i10 == 1) {
            return new q(aVar);
        }
        if (i10 == 2) {
            p pVar = new p();
            pVar.f15575a = aVar;
            pVar.f15576d = yVar;
            return pVar;
        }
        if (i10 != 3) {
            throw new n();
        }
        c0 c0Var = new c0();
        c0Var.f15563a = aVar;
        c0Var.f15564d = yVar;
        return c0Var;
    }

    public static q F(ar.a aVar) {
        l.e(aVar, "initializer");
        return new q(aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0091 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0162 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e6 A[PHI: r6
  0x00e6: PHI (r6v24 java.lang.String) = (r6v23 java.lang.String), (r6v38 java.lang.String) binds: [B:45:0x00ce, B:49:0x00e0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0173  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void G(android.content.Intent r23) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 562
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kc.f.G(android.content.Intent):void");
    }

    public static void H(String str, Bundle bundle) {
        try {
            se.f.c();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String string = bundle.getString("google.c.a.c_id");
            if (string != null) {
                bundle2.putString("_nmid", string);
            }
            String string2 = bundle.getString("google.c.a.c_l");
            if (string2 != null) {
                bundle2.putString("_nmn", string2);
            }
            String string3 = bundle.getString("google.c.a.m_l");
            if (!TextUtils.isEmpty(string3)) {
                bundle2.putString("label", string3);
            }
            String string4 = bundle.getString("google.c.a.m_c");
            if (!TextUtils.isEmpty(string4)) {
                bundle2.putString("message_channel", string4);
            }
            String string5 = bundle.getString("from");
            if (string5 == null || !string5.startsWith("/topics/")) {
                string5 = null;
            }
            if (string5 != null) {
                bundle2.putString("_nt", string5);
            }
            String string6 = bundle.getString("google.c.a.ts");
            if (string6 != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(string6));
                } catch (NumberFormatException e4) {
                    e0.q("FirebaseMessaging", "Error while parsing timestamp in GCM event", e4);
                }
            }
            String string7 = bundle.containsKey("google.c.a.udt") ? bundle.getString("google.c.a.udt") : null;
            if (string7 != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(string7));
                } catch (NumberFormatException e10) {
                    e0.q("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e10);
                }
            }
            String str2 = g0.D(bundle) ? "display" : "data";
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", str2);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                bundle2.toString();
            }
            we.b bVar = (we.b) se.f.c().b(we.b.class);
            if (bVar != null) {
                ((we.c) bVar).a("fcm", str, bundle2);
            } else {
                e0.p("FirebaseMessaging", "Unable to log event: analytics library is missing");
            }
        } catch (IllegalStateException unused) {
            e0.d("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    public static final String I(String str) {
        String strValueOf;
        l.e(str, "<this>");
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        l.d(lowerCase, "toLowerCase(...)");
        if (lowerCase.length() <= 0) {
            return lowerCase;
        }
        StringBuilder sb2 = new StringBuilder();
        char cCharAt = lowerCase.charAt(0);
        if (Character.isLowerCase(cCharAt)) {
            Locale locale2 = Locale.getDefault();
            l.d(locale2, "getDefault(...)");
            String strValueOf2 = String.valueOf(cCharAt);
            l.c(strValueOf2, "null cannot be cast to non-null type java.lang.String");
            strValueOf = strValueOf2.toUpperCase(locale2);
            l.d(strValueOf, "toUpperCase(...)");
            if (strValueOf.length() <= 1) {
                String strValueOf3 = String.valueOf(cCharAt);
                l.c(strValueOf3, "null cannot be cast to non-null type java.lang.String");
                String upperCase = strValueOf3.toUpperCase(locale);
                l.d(upperCase, "toUpperCase(...)");
                if (strValueOf.equals(upperCase)) {
                    strValueOf = String.valueOf(Character.toTitleCase(cCharAt));
                }
            } else if (cCharAt != 329) {
                char cCharAt2 = strValueOf.charAt(0);
                String strSubstring = strValueOf.substring(1);
                l.d(strSubstring, "substring(...)");
                String lowerCase2 = strSubstring.toLowerCase(locale);
                l.d(lowerCase2, "toLowerCase(...)");
                strValueOf = cCharAt2 + lowerCase2;
            }
        } else {
            strValueOf = String.valueOf(cCharAt);
        }
        sb2.append((Object) strValueOf);
        String strSubstring2 = lowerCase.substring(1);
        l.d(strSubstring2, "substring(...)");
        sb2.append(strSubstring2);
        return sb2.toString();
    }

    public static LinkedHashSet P(qs.g gVar, Collection collection, Collection collection2, rr.f fVar, m mVar, ts.n nVar, boolean z10) {
        if (gVar == null) {
            d(12);
            throw null;
        }
        if (collection == null) {
            d(13);
            throw null;
        }
        if (fVar == null) {
            d(15);
            throw null;
        }
        if (mVar == null) {
            d(16);
            throw null;
        }
        if (nVar == null) {
            d(17);
            throw null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        nVar.h(gVar, collection, collection2, fVar, new bs.b(mVar, linkedHashSet, z10));
        return linkedHashSet;
    }

    public static LinkedHashSet Q(qs.g gVar, AbstractCollection abstractCollection, Collection collection, rr.f fVar, m mVar, ts.n nVar) {
        if (gVar == null) {
            d(0);
            throw null;
        }
        if (fVar == null) {
            d(3);
            throw null;
        }
        if (mVar == null) {
            d(4);
            throw null;
        }
        if (nVar != null) {
            return P(gVar, abstractCollection, collection, fVar, mVar, nVar, false);
        }
        d(5);
        throw null;
    }

    public static LinkedHashSet R(qs.g gVar, Collection collection, AbstractCollection abstractCollection, es.j jVar, m mVar, ts.n nVar) {
        if (gVar == null) {
            d(6);
            throw null;
        }
        if (collection == null) {
            d(7);
            throw null;
        }
        if (jVar == null) {
            d(9);
            throw null;
        }
        if (mVar == null) {
            d(10);
            throw null;
        }
        if (nVar != null) {
            return P(gVar, collection, abstractCollection, jVar, mVar, nVar, true);
        }
        d(11);
        throw null;
    }

    public static boolean S(Intent intent) {
        Bundle extras;
        if (intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction()) || (extras = intent.getExtras()) == null) {
            return false;
        }
        return "1".equals(extras.getString("google.c.a.e"));
    }

    public static final Class T(x xVar) {
        b0 b0VarF;
        l.e(xVar, "<this>");
        Class clsU = U(xVar.Z().p());
        if (clsU == null) {
            return null;
        }
        if (a1.e(xVar) && ((b0VarF = ts.h.f(xVar)) == null || a1.e(b0VarF) || or.h.F(b0VarF))) {
            return null;
        }
        return clsU;
    }

    public static final Class U(rr.l lVar) {
        if (!(lVar instanceof rr.f) || !ts.h.b(lVar)) {
            return null;
        }
        rr.f fVar = (rr.f) lVar;
        Class clsJ = z1.j(fVar);
        if (clsJ != null) {
            return clsJ;
        }
        throw new k("Class object for the class " + fVar.getName() + " cannot be found (classId=" + xs.d.f((rr.i) lVar) + ')', 1);
    }

    public static final long V(long j) {
        return (Float.floatToRawIntBits((int) (j & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j >> 32)) << 32);
    }

    public static final Class X(ClassLoader classLoader, String str) {
        l.e(str, "fqName");
        try {
            return Class.forName(str, false, classLoader);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00b7 A[Catch: all -> 0x00b3, PHI: r2
  0x00b7: PHI (r2v1 java.lang.Thread) = (r2v0 java.lang.Thread), (r2v11 java.lang.Thread) binds: [B:7:0x000c, B:47:0x00b0] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #3 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000e, B:46:0x00ae, B:61:0x00e5, B:12:0x0023, B:52:0x00b6, B:53:0x00b7, B:64:0x00e9, B:65:0x00ea, B:13:0x0024, B:15:0x0031, B:25:0x004b, B:26:0x0052, B:28:0x005d, B:34:0x0072, B:35:0x0079, B:43:0x008a, B:44:0x00ac, B:18:0x0040, B:54:0x00b8, B:60:0x00e4, B:59:0x00c2), top: B:76:0x0003, inners: #2, #6 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized java.lang.ClassLoader Y() {
        /*
            Method dump skipped, instructions count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kc.f.Y():java.lang.ClassLoader");
    }

    public static String Z(String str, Object... objArr) {
        int length;
        int iIndexOf;
        StringBuilder sb2 = new StringBuilder(str.length() + (objArr.length * 16));
        int i10 = 0;
        int i11 = 0;
        while (true) {
            length = objArr.length;
            if (i10 >= length || (iIndexOf = str.indexOf("%s", i11)) == -1) {
                break;
            }
            sb2.append((CharSequence) str, i11, iIndexOf);
            sb2.append(a0(objArr[i10]));
            i11 = iIndexOf + 2;
            i10++;
        }
        sb2.append((CharSequence) str, i11, str.length());
        if (i10 < length) {
            String str2 = " [";
            while (i10 < objArr.length) {
                sb2.append(str2);
                sb2.append(a0(objArr[i10]));
                i10++;
                str2 = ", ";
            }
            sb2.append(']');
        }
        return sb2.toString();
    }

    public static String a0(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e4) {
            String name = obj.getClass().getName();
            String hexString = Integer.toHexString(System.identityHashCode(obj));
            String strS = h0.b.s(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strS), (Throwable) e4);
            String name2 = e4.getClass().getName();
            StringBuilder sb2 = new StringBuilder(strS.length() + 8 + name2.length() + 1);
            w.g.q(sb2, "<", strS, " threw ", name2);
            sb2.append(">");
            return sb2.toString();
        }
    }

    public static /* synthetic */ void d(int i10) {
        String str = i10 != 18 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i10 != 18 ? 3 : 2];
        switch (i10) {
            case 1:
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
            case 13:
                objArr[0] = "membersFromSupertypes";
                break;
            case 2:
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
            case 14:
                objArr[0] = "membersFromCurrent";
                break;
            case 3:
            case 9:
            case 15:
                objArr[0] = "classDescriptor";
                break;
            case 4:
            case 10:
            case 16:
                objArr[0] = "errorReporter";
                break;
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
            case 11:
            case 17:
                objArr[0] = "overridingUtil";
                break;
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
            case 12:
            case 19:
            default:
                objArr[0] = "name";
                break;
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
                break;
            case 20:
                objArr[0] = "annotationClass";
                break;
        }
        if (i10 != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
        } else {
            objArr[1] = "resolveOverrides";
        }
        switch (i10) {
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
            case 9:
            case 10:
            case 11:
                objArr[2] = "resolveOverridesForStaticMembers";
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "resolveOverrides";
                break;
            case 18:
                break;
            case 19:
            case 20:
                objArr[2] = "getAnnotationParameterByName";
                break;
            default:
                objArr[2] = "resolveOverridesForNonStaticMembers";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 == 18) {
            throw new IllegalStateException(str2);
        }
    }

    public static float e(float f10) {
        return f10 <= 0.04045f ? f10 / 12.92f : (float) Math.pow((f10 + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public static float f(float f10) {
        return f10 <= 0.0031308f ? f10 * 12.92f : (float) ((Math.pow(f10, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    public static final f1.d g(float f10, float f11, float f12, float f13, long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        long jFloatToRawIntBits = (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (4294967295L & Float.floatToRawIntBits(fIntBitsToFloat2));
        return new f1.d(f10, f11, f12, f13, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits);
    }

    public static final Application h(uv.b bVar) throws ev.a {
        l.e(bVar, "<this>");
        try {
            return (Application) bVar.a(null, br.x.f2918a.b(Application.class), null);
        } catch (Exception unused) {
            throw new ev.a("Can't resolve Application instance. Please use androidContext() function in your KoinApplication configuration.", 0);
        }
    }

    public static final Context i(uv.b bVar) throws ev.a {
        l.e(bVar, "<this>");
        try {
            return (Context) bVar.a(null, br.x.f2918a.b(Context.class), null);
        } catch (Exception unused) {
            throw new ev.a("Can't resolve Context instance. Please use androidContext() function in your KoinApplication configuration.", 0);
        }
    }

    public static final void j(View view) {
        l.e(view, "<this>");
        ab.c cVar = new ab.c(26);
        WeakHashMap weakHashMap = i0.f23177a;
        z.j(view, cVar);
    }

    public static final void m(Context context, View view) {
        l.e(context, "<this>");
        InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public static final Object n(Object obj, rr.d dVar) {
        x xVarY;
        Class clsT;
        return (((dVar instanceof rr.m0) && ts.h.d((u0) dVar)) || (xVarY = y(dVar)) == null || (clsT = T(xVarY)) == null) ? obj : A(clsT, dVar).invoke(obj, null);
    }

    public static boolean o(String str, List list) {
        if (list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (str.contains(str2)) {
                return true;
            }
            if (str.matches(str2)) {
                return true;
            }
        }
        return false;
    }

    public static final mr.g p(mr.g gVar, rr.d dVar, boolean z10) {
        x xVarI;
        x xVarY;
        l.e(dVar, "descriptor");
        if (!ts.h.a(dVar)) {
            List listY = dVar.Y();
            l.d(listY, "descriptor.valueParameters");
            if (!listY.isEmpty()) {
                Iterator it = listY.iterator();
                while (it.hasNext()) {
                    x type = ((q0) it.next()).getType();
                    l.d(type, "it.type");
                    if (ts.h.c(type)) {
                        break;
                    }
                }
                xVarI = dVar.i();
                return xVarI != null ? gVar : gVar;
            }
            xVarI = dVar.i();
            if ((xVarI != null || !ts.h.c(xVarI)) && ((gVar instanceof mr.f) || (xVarY = y(dVar)) == null || !ts.h.c(xVarY))) {
            }
        }
        return new w(gVar, dVar, z10);
    }

    public static void q(String str, String str2, Object obj) {
        if (Log.isLoggable(z(str), 3)) {
            String.format(str2, obj);
        }
    }

    public static boolean r() {
        Context context;
        SharedPreferences sharedPreferences;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            se.f.c();
            se.f fVarC = se.f.c();
            fVarC.a();
            context = fVarC.f22007a;
            sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
        } catch (PackageManager.NameNotFoundException | IllegalStateException unused) {
        }
        if (sharedPreferences.contains("export_to_big_query")) {
            return sharedPreferences.getBoolean("export_to_big_query", false);
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
            return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
    
        if (r5 > 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
    
        if (r11 > 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
    
        if (r11 < 0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long s(long r11) {
        /*
            java.math.RoundingMode r0 = java.math.RoundingMode.CEILING
            r0.getClass()
            r1 = 1000(0x3e8, double:4.94E-321)
            long r3 = r11 / r1
            long r5 = r1 * r3
            long r5 = r11 - r5
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L14
            goto L4c
        L14:
            long r11 = r11 ^ r1
            r10 = 63
            long r11 = r11 >> r10
            int r11 = (int) r11
            r11 = r11 | 1
            int[] r12 = pe.c.f20465a
            int r0 = r0.ordinal()
            r12 = r12[r0]
            switch(r12) {
                case 1: goto L4a;
                case 2: goto L4c;
                case 3: goto L45;
                case 4: goto L47;
                case 5: goto L42;
                case 6: goto L2c;
                case 7: goto L2c;
                case 8: goto L2c;
                default: goto L26;
            }
        L26:
            java.lang.AssertionError r11 = new java.lang.AssertionError
            r11.<init>()
            throw r11
        L2c:
            long r5 = java.lang.Math.abs(r5)
            long r0 = java.lang.Math.abs(r1)
            long r0 = r0 - r5
            long r5 = r5 - r0
            int r12 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r12 != 0) goto L3f
            java.math.RoundingMode r11 = java.math.RoundingMode.HALF_UP
            java.math.RoundingMode r11 = java.math.RoundingMode.HALF_EVEN
            return r3
        L3f:
            if (r12 <= 0) goto L4c
            goto L47
        L42:
            if (r11 <= 0) goto L4c
            goto L47
        L45:
            if (r11 >= 0) goto L4c
        L47:
            long r11 = (long) r11
            long r3 = r3 + r11
            return r3
        L4a:
            if (r9 != 0) goto L4d
        L4c:
            return r3
        L4d:
            java.lang.ArithmeticException r11 = new java.lang.ArithmeticException
            java.lang.String r12 = "mode was UNNECESSARY, but rounding was necessary"
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kc.f.s(long):long");
    }

    public static void t(String str, String str2, Exception exc) {
        String strZ = z(str);
        if (Log.isLoggable(strZ, 6)) {
            e0.c(strZ, str2, exc);
        }
    }

    public static int u(int i10, float f10, int i11) {
        if (i10 == i11 || f10 <= 0.0f) {
            return i10;
        }
        if (f10 >= 1.0f) {
            return i11;
        }
        float f11 = ((i10 >> 24) & 255) / 255.0f;
        float f12 = ((i11 >> 24) & 255) / 255.0f;
        float fE = e(((i10 >> 16) & 255) / 255.0f);
        float fE2 = e(((i10 >> 8) & 255) / 255.0f);
        float fE3 = e((i10 & 255) / 255.0f);
        float fE4 = e(((i11 >> 16) & 255) / 255.0f);
        float fE5 = e(((i11 >> 8) & 255) / 255.0f);
        float fE6 = e((i11 & 255) / 255.0f);
        float fA = c7.a.a(f12, f11, f10, f11);
        float fA2 = c7.a.a(fE4, fE, f10, fE);
        float fA3 = c7.a.a(fE5, fE2, f10, fE2);
        float fA4 = c7.a.a(fE6, fE3, f10, fE3);
        float f13 = f(fA2) * 255.0f;
        float f14 = f(fA3) * 255.0f;
        return Math.round(f(fA4) * 255.0f) | (Math.round(f13) << 16) | (Math.round(fA * 255.0f) << 24) | (Math.round(f14) << 8);
    }

    public static final int v(int i10, r rVar) {
        boolean z10 = rVar.compareTo(r.f14001r) >= 0;
        boolean z11 = i10 == 1;
        if (z11 && z10) {
            return 3;
        }
        if (z10) {
            return 1;
        }
        return z11 ? 2 : 0;
    }

    public static q0 w(qs.g gVar, rr.f fVar) {
        if (gVar == null) {
            d(19);
            throw null;
        }
        if (fVar == null) {
            d(20);
            throw null;
        }
        Collection collectionZ = fVar.z();
        if (collectionZ.size() != 1) {
            return null;
        }
        for (q0 q0Var : ((ur.j) collectionZ.iterator().next()).Y()) {
            if (q0Var.getName().equals(gVar)) {
                return q0Var;
            }
        }
        return null;
    }

    public static boolean x(String str, JSONObject jSONObject) throws JSONException {
        Object obj = jSONObject.get(str);
        if (obj instanceof Integer) {
            return obj.equals(0);
        }
        l.c(obj, "null cannot be cast to non-null type kotlin.Boolean");
        return ((Boolean) obj).booleanValue();
    }

    public static final x y(rr.d dVar) {
        v vVarJ0 = dVar.j0();
        v vVarF0 = dVar.f0();
        if (vVarJ0 != null) {
            return vVarJ0.getType();
        }
        if (vVarF0 != null) {
            if (dVar instanceof rr.k) {
                return vVarF0.getType();
            }
            rr.l lVarO = dVar.o();
            rr.f fVar = lVarO instanceof rr.f ? (rr.f) lVarO : null;
            if (fVar != null) {
                return fVar.q();
            }
        }
        return null;
    }

    public static String z(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            return "TRuntime.".concat(str);
        }
        String strConcat = "TRuntime.".concat(str);
        return strConcat.length() > 23 ? strConcat.substring(0, 23) : strConcat;
    }

    public int B(View view) {
        return 0;
    }

    public int C() {
        return 0;
    }

    public abstract void J(Throwable th2);

    public abstract void K(kg.r rVar);

    public abstract void M(int i10);

    public abstract void N(View view, int i10, int i11);

    public abstract void O(View view, float f10, float f11);

    public abstract boolean W(View view, int i10);

    public abstract int k(View view, int i10);

    public abstract int l(View view, int i10);

    @Override // u3.m0
    public void a() {
    }

    @Override // u3.m0
    public void b() {
    }

    public void L(View view, int i10) {
    }
}
