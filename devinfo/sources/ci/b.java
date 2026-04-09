package ci;

import a0.x0;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.util.LongSparseArray;
import androidx.lifecycle.f1;
import cl.r;
import com.applovin.sdk.AppLovinEventTypes;
import com.applovin.sdk.AppLovinMediationProvider;
import com.applovin.shadow.okio.Segment;
import com.bumptech.glide.c;
import com.google.android.gms.internal.measurement.f;
import com.google.android.gms.internal.measurement.g;
import com.google.android.gms.internal.measurement.h;
import com.google.android.gms.internal.measurement.m;
import com.google.android.gms.internal.measurement.n;
import com.google.android.gms.internal.measurement.t;
import com.liuzh.deviceinfo.DeviceInfoApp;
import com.liuzh.deviceinfo.utilities.l;
import com.liuzh.deviceinfo.widget.OverViewWidget4x2;
import ed.y;
import j6.i;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import mk.e;
import nk.k;
import nk.x;
import org.json.JSONException;
import org.json.JSONObject;
import rl.j;
import rl.z;
import sk.d;
import va.o;
import xk.c0;
import xk.o1;
import xk.p;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static Field f2880a;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f2881b;

    /* renamed from: c, reason: collision with root package name */
    public static Class f2882c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f2883d;

    /* renamed from: e, reason: collision with root package name */
    public static Field f2884e;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f2885f;
    public static Field g;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f2886h;

    /* renamed from: i, reason: collision with root package name */
    public static boolean f2887i;
    public static i j;

    public static final Object B(r rVar, boolean z3, r rVar2, e eVar) {
        Object pVar;
        Object objU;
        try {
            if (eVar instanceof ek.a) {
                x.d(2, eVar);
                pVar = eVar.invoke(rVar2, rVar);
            } else {
                pVar = a.a.w(eVar, rVar2, rVar);
            }
        } catch (c0 e2) {
            Throwable th2 = e2.f37174a;
            rVar.T(new p(th2, false));
            throw th2;
        } catch (Throwable th3) {
            pVar = new p(th3, false);
        }
        dk.a aVar = dk.a.f22275a;
        if (pVar == aVar || (objU = rVar.U(pVar)) == xk.x.f37254e) {
            return aVar;
        }
        rVar.j0();
        if (!(objU instanceof p)) {
            return xk.x.C(objU);
        }
        if (!z3) {
            Throwable th4 = ((p) objU).f37219a;
            if ((th4 instanceof o1) && ((o1) th4).f37217a == rVar) {
                if (pVar instanceof p) {
                    throw ((p) pVar).f37219a;
                }
                return pVar;
            }
        }
        throw ((p) objU).f37219a;
    }

    public static sk.b C(d dVar, int i4) {
        k.e(dVar, "<this>");
        boolean z3 = i4 > 0;
        Integer numValueOf = Integer.valueOf(i4);
        if (!z3) {
            throw new IllegalArgumentException("Step must be positive, was: " + numValueOf + '.');
        }
        int i10 = dVar.f33817a;
        int i11 = dVar.f33818b;
        if (dVar.f33819c <= 0) {
            i4 = -i4;
        }
        return new sk.b(i10, i11, i4);
    }

    public static final void D(Object obj) {
        if (obj instanceof yj.k) {
            throw ((yj.k) obj).f37640a;
        }
    }

    public static d E(int i4, int i10) {
        if (i10 > Integer.MIN_VALUE) {
            return new d(i4, i10 - 1, 1);
        }
        d dVar = d.f33824d;
        return d.f33824d;
    }

    public static n F(com.google.android.gms.internal.measurement.d dVar, x0 x0Var, ArrayList arrayList, boolean z3) {
        n nVarB;
        c.w(1, arrayList, "reduce");
        c.x("reduce", 2, arrayList);
        n nVarC = ((t) x0Var.f145b).c(x0Var, (n) arrayList.get(0));
        if (!(nVarC instanceof h)) {
            throw new IllegalArgumentException("Callback should be a method");
        }
        if (arrayList.size() == 2) {
            nVarB = ((t) x0Var.f145b).c(x0Var, (n) arrayList.get(1));
            if (nVarB instanceof f) {
                throw new IllegalArgumentException("Failed to parse initial value");
            }
        } else {
            if (dVar.m() == 0) {
                throw new IllegalStateException("Empty array with no initial value error");
            }
            nVarB = null;
        }
        h hVar = (h) nVarC;
        int iM = dVar.m();
        int i4 = z3 ? 0 : iM - 1;
        int i10 = z3 ? iM - 1 : 0;
        int i11 = true == z3 ? 1 : -1;
        if (nVarB == null) {
            nVarB = dVar.o(i4);
            i4 += i11;
        }
        while ((i10 - i4) * i11 >= 0) {
            if (dVar.q(i4)) {
                nVarB = hVar.b(x0Var, Arrays.asList(nVarB, dVar.o(i4), new g(Double.valueOf(i4)), dVar));
                if (nVarB instanceof f) {
                    throw new IllegalStateException("Reduce operation failed");
                }
                i4 += i11;
            } else {
                i4 += i11;
            }
        }
        return nVarB;
    }

    public static com.google.android.gms.internal.measurement.d G(com.google.android.gms.internal.measurement.d dVar, x0 x0Var, m mVar, Boolean bool, Boolean bool2) {
        com.google.android.gms.internal.measurement.d dVar2 = new com.google.android.gms.internal.measurement.d();
        Iterator itL = dVar.l();
        while (itL.hasNext()) {
            int iIntValue = ((Integer) itL.next()).intValue();
            if (dVar.q(iIntValue)) {
                n nVarB = mVar.b(x0Var, Arrays.asList(dVar.o(iIntValue), new g(Double.valueOf(iIntValue)), dVar));
                if (nVarB.c().equals(bool)) {
                    break;
                }
                if (bool2 == null || nVarB.c().equals(bool2)) {
                    dVar2.p(iIntValue, nVarB);
                }
            }
        }
        return dVar2;
    }

    public static boolean H(byte b10) {
        return b10 > -65;
    }

    public static final long a(int i4) {
        long j8 = (i4 << 32) | (0 & 4294967295L);
        int i10 = a2.a.f182p;
        return j8;
    }

    public static Object b(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static double c(double d10, double d11, double d12) {
        if (d11 <= d12) {
            return d10 < d11 ? d11 : d10 > d12 ? d12 : d10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d12 + " is less than minimum " + d11 + '.');
    }

    public static float d(float f10, float f11, float f12) {
        if (f11 <= f12) {
            return f10 < f11 ? f11 : f10 > f12 ? f12 : f10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f12 + " is less than minimum " + f11 + '.');
    }

    public static int e(int i4, int i10, int i11) {
        if (i10 <= i11) {
            return i4 < i10 ? i10 : i4 > i11 ? i11 : i4;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i11 + " is less than minimum " + i10 + '.');
    }

    public static long f(long j8, long j9, long j10) {
        if (j9 <= j10) {
            return j8 < j9 ? j9 : j8 > j10 ? j10 : j8;
        }
        StringBuilder sbY = d.h.y(j10, "Cannot coerce value to an empty range: maximum ", " is less than minimum ");
        sbY.append(j9);
        sbY.append('.');
        throw new IllegalArgumentException(sbY.toString());
    }

    public static final void g(int i4, int i10) {
        if (i4 > i10) {
            throw new IndexOutOfBoundsException(r5.c.i(i4, "toIndex (", ") is greater than size (", i10, ")."));
        }
    }

    public static final yj.k h(Throwable th2) {
        k.e(th2, "exception");
        return new yj.k(th2);
    }

    public static void j(JSONObject jSONObject) throws JSONException, UnsupportedEncodingException {
        boolean zHasSystemFeature;
        String strOptString = jSONObject.optString("name");
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        try {
            strOptString = URLDecoder.decode(strOptString, "utf-8");
        } catch (UnsupportedEncodingException unused) {
        }
        String str = Build.MODEL;
        String strTrim = str == null ? "" : str.trim();
        String str2 = Build.DEVICE;
        String strTrim2 = str2 != null ? str2.trim() : "";
        try {
            if ("Xiaomi 12T Pro".equalsIgnoreCase(strOptString) && "22081212C".equalsIgnoreCase(strTrim) && a.a.s() && wi.h.f36759d) {
                try {
                    zHasSystemFeature = DeviceInfoApp.f21145f.a().hasSystemFeature("android.hardware.telephony.euicc");
                } catch (Exception unused2) {
                    zHasSystemFeature = false;
                }
                if (zHasSystemFeature) {
                } else {
                    jSONObject.put("name", "K50 至尊版");
                }
            } else if ("OnePlus 10T".equalsIgnoreCase(strOptString) && a.a.s()) {
                jSONObject.put("name", "Ace Pro");
            } else {
                if (!"MNA-AL00".equalsIgnoreCase(strTrim) || !"HWMNA".equalsIgnoreCase(strTrim2)) {
                    return;
                }
                double dI = l.i();
                if (dI > 5000.0d) {
                    jSONObject.put("name", "P60 Art");
                } else if (dI == -1.0d) {
                } else {
                    jSONObject.put("name", "P60 Pro");
                }
            }
        } catch (JSONException unused3) {
        }
    }

    public static void k(Object obj) throws NoSuchFieldException, SecurityException {
        LongSparseArray longSparseArray;
        if (!f2883d) {
            try {
                f2882c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e2) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e2);
            }
            f2883d = true;
        }
        Class cls = f2882c;
        if (cls == null) {
            return;
        }
        if (!f2885f) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f2884e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e10);
            }
            f2885f = true;
        }
        Field field = f2884e;
        if (field == null) {
            return;
        }
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e11) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e11);
            longSparseArray = null;
        }
        if (longSparseArray != null) {
            longSparseArray.clear();
        }
    }

    public static String l(String str) {
        String str2 = Build.PRODUCT;
        if (str2 == null) {
            str2 = "";
        }
        String strTrim = str2.trim();
        if (TextUtils.equals(str, strTrim)) {
            strTrim = "";
        }
        if (!"honor".equalsIgnoreCase(Build.MANUFACTURER) || !TextUtils.isEmpty(strTrim)) {
            return strTrim;
        }
        String strN = l.N("ro.product.hn_model");
        return (strN == null || str.equalsIgnoreCase(strN)) ? "" : strN;
    }

    public static synchronized String m() {
        boolean z3;
        com.liuzh.deviceinfo.utilities.f fVar = com.liuzh.deviceinfo.utilities.f.f21256b;
        String string = com.liuzh.deviceinfo.utilities.f.f21257c.getString("cached_device_name_json", null);
        if (TextUtils.isEmpty(string)) {
            String strH = l.H();
            if (!TextUtils.isEmpty(strH)) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("device", Build.DEVICE);
                    jSONObject.put("model", Build.MODEL);
                    jSONObject.put("name", strH.replace("+", "%2B"));
                    string = jSONObject.toString();
                    x(strH);
                } catch (JSONException unused) {
                }
            }
        }
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
            JSONObject jSONObject2 = new JSONObject(string);
            j(jSONObject2);
            string = jSONObject2.toString();
            com.liuzh.deviceinfo.utilities.f fVar2 = com.liuzh.deviceinfo.utilities.f.f21256b;
            com.liuzh.deviceinfo.utilities.f.m("cached_device_name_json", string);
            if (z3) {
                OverViewWidget4x2.c();
            }
            return URLDecoder.decode(jSONObject2.optString("name", Build.MODEL), "utf-8");
        } catch (UnsupportedEncodingException e2) {
            e = e2;
            wd.b.B(new RuntimeException("bad json for: " + string, e));
            return Build.MODEL;
        } catch (JSONException e10) {
            e = e10;
            wd.b.B(new RuntimeException("bad json for: " + string, e));
            return Build.MODEL;
        }
    }

    public static String n() {
        com.liuzh.deviceinfo.utilities.f fVar = com.liuzh.deviceinfo.utilities.f.f21256b;
        String string = com.liuzh.deviceinfo.utilities.f.f21257c.getString("cached_device_name_json", null);
        if (!TextUtils.isEmpty(string)) {
            try {
                return URLDecoder.decode(new JSONObject(string).optString("name", Build.MODEL), "utf-8");
            } catch (UnsupportedEncodingException | JSONException unused) {
            }
        }
        return Build.MODEL;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String o() throws java.io.UnsupportedEncodingException {
        /*
            java.lang.String r0 = "utf-8"
            com.liuzh.deviceinfo.utilities.f r1 = com.liuzh.deviceinfo.utilities.f.f21256b
            r1 = 0
            android.content.SharedPreferences r2 = com.liuzh.deviceinfo.utilities.f.f21257c
            java.lang.String r3 = "device_name_not_found"
            boolean r1 = r2.getBoolean(r3, r1)
            r2 = 0
            if (r1 == 0) goto L12
            goto Lbd
        L12:
            java.lang.String r1 = android.os.Build.MODEL
            if (r1 == 0) goto Lbd
            java.lang.String r4 = android.os.Build.DEVICE
            if (r4 == 0) goto Lbd
            java.lang.String r5 = android.os.Build.BRAND
            if (r5 != 0) goto L20
            goto Lbd
        L20:
            java.lang.String r1 = r1.trim()
            java.lang.String r4 = r4.trim()
            java.lang.String r5 = r5.trim()
            boolean r6 = t(r1, r4, r5)
            if (r6 == 0) goto L34
            goto Lbd
        L34:
            java.util.Locale r6 = java.util.Locale.US     // Catch: org.json.JSONException -> L4f java.io.IOException -> L51
            java.lang.String r7 = r1.toLowerCase(r6)     // Catch: org.json.JSONException -> L4f java.io.IOException -> L51
            java.lang.String r7 = java.net.URLEncoder.encode(r7, r0)     // Catch: org.json.JSONException -> L4f java.io.IOException -> L51
            java.lang.String r6 = r4.toLowerCase(r6)     // Catch: org.json.JSONException -> L4f java.io.IOException -> L51
            java.lang.String r0 = java.net.URLEncoder.encode(r6, r0)     // Catch: org.json.JSONException -> L4f java.io.IOException -> L51
            boolean r6 = a.a.s()     // Catch: org.json.JSONException -> L4f java.io.IOException -> L51
            if (r6 == 0) goto L53
            java.lang.String r6 = "https://gitlab.com/liuzho/ADN/raw/master/names/%1$s/%2$s.json"
            goto L55
        L4f:
            r0 = move-exception
            goto La9
        L51:
            r0 = move-exception
            goto La9
        L53:
            java.lang.String r6 = "https://raw.githubusercontent.com/liuzho/ADN/master/names/%1$s/%2$s.json"
        L55:
            rl.z r0 = y(r6, r0, r7)     // Catch: org.json.JSONException -> L4f java.io.IOException -> L51
            rl.c0 r6 = r0.g     // Catch: org.json.JSONException -> L4f java.io.IOException -> L51
            boolean r0 = r0.f33217p     // Catch: org.json.JSONException -> L4f java.io.IOException -> L51
            if (r0 == 0) goto L67
            if (r6 != 0) goto L62
            goto Lbd
        L62:
            java.lang.String r0 = r6.p()     // Catch: org.json.JSONException -> L4f java.io.IOException -> L51
            return r0
        L67:
            java.lang.String r0 = ""
            rl.z r0 = z(r4, r1, r5, r0)     // Catch: org.json.JSONException -> L4f java.io.IOException -> L51
            boolean r5 = r0.f33217p     // Catch: java.lang.Throwable -> L93
            if (r5 == 0) goto L95
            rl.c0 r3 = r0.g     // Catch: java.lang.Throwable -> L93
            if (r3 != 0) goto L79
        L75:
            r0.close()     // Catch: org.json.JSONException -> L4f java.io.IOException -> L51
            return r2
        L79:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L93
            java.lang.String r3 = r3.p()     // Catch: java.lang.Throwable -> L93
            r5.<init>(r3)     // Catch: java.lang.Throwable -> L93
            java.lang.String r3 = "data"
            org.json.JSONObject r3 = r5.optJSONObject(r3)     // Catch: java.lang.Throwable -> L93
            if (r3 != 0) goto L8b
            goto L75
        L8b:
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L93
            r0.close()     // Catch: org.json.JSONException -> L4f java.io.IOException -> L51
            return r3
        L93:
            r3 = move-exception
            goto La0
        L95:
            int r5 = r0.f33207d     // Catch: java.lang.Throwable -> L93
            r6 = 404(0x194, float:5.66E-43)
            if (r5 != r6) goto L75
            r5 = 1
            com.liuzh.deviceinfo.utilities.f.k(r3, r5)     // Catch: java.lang.Throwable -> L93
            goto L75
        La0:
            r0.close()     // Catch: java.lang.Throwable -> La4
            goto La8
        La4:
            r0 = move-exception
            r3.addSuppressed(r0)     // Catch: org.json.JSONException -> L4f java.io.IOException -> L51
        La8:
            throw r3     // Catch: org.json.JSONException -> L4f java.io.IOException -> L51
        La9:
            boolean r3 = r0 instanceof org.json.JSONException
            if (r3 == 0) goto Lbd
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.String r5 = "bad json for: "
            java.lang.String r6 = " - "
            java.lang.String r1 = je.u.u(r5, r4, r6, r1)
            r3.<init>(r1, r0)
            wd.b.B(r3)
        Lbd:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ci.b.o():java.lang.String");
    }

    public static final void r(Context context, String str) {
        k.e(context, "context");
        String strT = d.h.t("&referrer=utm_source=", context.getPackageName(), TextUtils.isEmpty("") ? "" : "&utm_medium=".concat(""));
        Intent intentAddFlags = new Intent("android.intent.action.VIEW").setData(Uri.parse("market://details?id=" + str + strT)).addFlags(268435456);
        k.d(intentAddFlags, "addFlags(...)");
        try {
            try {
                context.startActivity(intentAddFlags);
            } catch (ActivityNotFoundException unused) {
                context.startActivity(intentAddFlags.setData(Uri.parse("https://play.google.com/store/apps/details?id=" + str + strT)));
            }
        } catch (ActivityNotFoundException unused2) {
        }
    }

    public static boolean s(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    public static boolean t(String str, String str2, String str3) {
        boolean z3 = com.liuzh.deviceinfo.utilities.d.f21252a;
        String lowerCase = Build.MODEL.toLowerCase();
        String lowerCase2 = Build.DEVICE.toLowerCase();
        if (lowerCase.contains("google_sdk") || lowerCase2.contains("google_sdk") || lowerCase.contains("emulator") || lowerCase2.contains("emulator") || lowerCase.contains("sdk_gphone_x86") || lowerCase2.contains("sdk_gphone_x86") || lowerCase.contains("emu64a") || lowerCase2.contains("emu64a") || lowerCase.contains("gphone64") || lowerCase2.contains("gphone64") || lowerCase.contains("for arm64") || lowerCase2.contains("for arm64") || lowerCase.contains("for x86") || lowerCase2.contains("for x86") || lowerCase.contains("on intel platform") || lowerCase2.contains("on intel platform") || str2.toLowerCase().contains("aosp on ") || str.toLowerCase().contains("aosp on ") || "vmos".equalsIgnoreCase(str) || "phone".equalsIgnoreCase(str) || AppLovinMediationProvider.UNKNOWN.equalsIgnoreCase(str3) || AppLovinMediationProvider.UNKNOWN.equalsIgnoreCase(str) || AppLovinMediationProvider.UNKNOWN.equalsIgnoreCase(str2) || "null".equalsIgnoreCase(str3) || "null".equalsIgnoreCase(str) || "null".equalsIgnoreCase(str2) || str.equalsIgnoreCase("Subsystem for Android(TM)") || str2.equalsIgnoreCase("aosp") || str.equalsIgnoreCase("aosp") || str2.equalsIgnoreCase("x86_64") || str.equalsIgnoreCase("tablePC") || str2.equalsIgnoreCase("FydeOS Android") || str.equalsIgnoreCase("FydeOS Android") || str.equalsIgnoreCase("5G") || str.equalsIgnoreCase("4G") || (str2.equalsIgnoreCase("Android") && str.equalsIgnoreCase("Android"))) {
            return true;
        }
        if ((!"SPRD".equalsIgnoreCase(str3) && !"alps".equalsIgnoreCase(str3)) || (str2.length() <= 20 && str.length() <= 20)) {
            return str2.equalsIgnoreCase(str) && str2.equalsIgnoreCase(str3);
        }
        return true;
    }

    public static boolean u() {
        List list = mg.c.f29370b;
        String country = Locale.getDefault().getCountry();
        k.d(country, "getCountry(...)");
        String upperCase = country.toUpperCase(Locale.ROOT);
        k.d(upperCase, "toUpperCase(...)");
        return list.contains(upperCase);
    }

    public static final byte[] w(FileInputStream fileInputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(Segment.SIZE, fileInputStream.available()));
        byte[] bArr = new byte[Segment.SIZE];
        int i4 = fileInputStream.read(bArr);
        while (i4 >= 0) {
            byteArrayOutputStream.write(bArr, 0, i4);
            i4 = fileInputStream.read(bArr);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        k.d(byteArray, "toByteArray(...)");
        return byteArray;
    }

    public static void x(String str) {
        String strTrim = Build.DEVICE.trim();
        String strTrim2 = Build.MODEL.trim();
        String strTrim3 = Build.BRAND.trim();
        if (t(strTrim2, strTrim, strTrim3)) {
            return;
        }
        bi.d.c(new a((Object) strTrim, (Object) strTrim2, (Object) strTrim3, (Object) str, 0));
    }

    public static z y(String str, String str2, String str3) {
        f1 f1Var = new f1(24);
        f1Var.L(String.format(str, str2, str3));
        f1Var.G("GET", null);
        rl.t tVar = hi.b.f25152a;
        o oVar = new o(f1Var);
        tVar.getClass();
        return new vl.m(tVar, oVar).e();
    }

    public static z z(String str, String str2, String str3, String str4) {
        km.n nVar = new km.n(0);
        nVar.g("device", str);
        nVar.g("model", str2);
        nVar.g("brand", str3);
        nVar.g(AppLovinEventTypes.USER_VIEWED_PRODUCT, l(str2));
        nVar.g("vcode", "327");
        nVar.g("vflavor", "google");
        nVar.g("marketname", str4);
        nVar.g("rv", "1");
        j jVar = new j((ArrayList) nVar.f28442b, (ArrayList) nVar.f28443c);
        f1 f1Var = new f1(24);
        f1Var.L("https://liuzhosoft.com/server/devinfo/api/devicemodel");
        f1Var.G("POST", jVar);
        rl.t tVar = hi.b.f25152a;
        o oVar = new o(f1Var);
        tVar.getClass();
        return new vl.m(tVar, oVar).e();
    }

    public abstract void A(y yVar, float f10);

    public abstract Intent i(Context context, Object obj);

    public jf.c p(Context context, Object obj) {
        return null;
    }

    public abstract float q(y yVar);

    public abstract Object v(Intent intent, int i4);
}
