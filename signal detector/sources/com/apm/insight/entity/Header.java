package com.apm.insight.entity;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import androidx.annotation.Keep;
import com.apm.insight.e;
import com.apm.insight.l.k;
import com.apm.insight.l.l;
import com.apm.insight.runtime.o;
import java.util.Iterator;
import java.util.Map;
import java.util.TimeZone;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class Header {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f6112a = {"version_code", "manifest_version_code", "aid", "update_version_code"};

    /* renamed from: d, reason: collision with root package name */
    private static String f6113d = null;

    /* renamed from: e, reason: collision with root package name */
    private static int f6114e = -1;

    /* renamed from: f, reason: collision with root package name */
    private static int f6115f = -1;

    /* renamed from: b, reason: collision with root package name */
    private Context f6116b;

    /* renamed from: c, reason: collision with root package name */
    private JSONObject f6117c = new JSONObject();

    public Header(Context context) {
        this.f6116b = context;
    }

    public static Header a(Context context) throws JSONException {
        Header header = new Header(context);
        JSONObject jSONObject = header.f6117c;
        try {
            jSONObject.put("sdk_version", 20089);
            jSONObject.put("sdk_version_name", "2008-20250701130429");
        } catch (Exception unused) {
        }
        return header;
    }

    @Keep
    public static void addOtherHeader(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        try {
            if (com.apm.insight.l.d.b()) {
                sb.append("MIUI-");
            } else if (com.apm.insight.l.d.c()) {
                sb.append("FLYME-");
            } else {
                String strA = com.apm.insight.l.d.a();
                if (com.apm.insight.l.d.a(strA)) {
                    sb.append("EMUI-");
                }
                if (!TextUtils.isEmpty(strA)) {
                    sb.append(strA);
                    sb.append("-");
                }
            }
            sb.append(Build.VERSION.INCREMENTAL);
            if (sb.length() > 0) {
                jSONObject.put("rom", sb.toString());
            }
            jSONObject.put("rom_version", l.a());
        } catch (Throwable unused) {
        }
        try {
            DisplayMetrics displayMetrics = e.g().getResources().getDisplayMetrics();
            int i = displayMetrics.densityDpi;
            String str = i != 120 ? i != 240 ? i != 320 ? "mdpi" : "xhdpi" : "hdpi" : "ldpi";
            jSONObject.put("density_dpi", i);
            jSONObject.put("display_density", str);
            jSONObject.put("resolution", displayMetrics.heightPixels + "x" + displayMetrics.widthPixels);
        } catch (Exception unused2) {
        }
        try {
            String language = e.g().getResources().getConfiguration().locale.getLanguage();
            if (!TextUtils.isEmpty(language)) {
                jSONObject.put("language", language);
            }
            int rawOffset = TimeZone.getDefault().getRawOffset() / 3600000;
            if (rawOffset < -12) {
                rawOffset = -12;
            }
            if (rawOffset > 12) {
                rawOffset = 12;
            }
            jSONObject.put("timezone", rawOffset);
        } catch (Exception unused3) {
        }
        try {
            jSONObject.put("os", "Android");
            jSONObject.put("device_id", e.c().a());
            String strConcat = Build.VERSION.RELEASE;
            if (!strConcat.contains(".")) {
                strConcat = strConcat.concat(".0");
            }
            jSONObject.put("os_version", strConcat);
            jSONObject.put("os_api", Build.VERSION.SDK_INT);
            String str2 = Build.MODEL;
            String str3 = Build.BRAND;
            if (str2 == null) {
                str2 = str3;
            } else if (str3 != null && !str2.contains(str3)) {
                str2 = str3 + ' ' + str2;
            }
            jSONObject.put("device_model", str2);
            jSONObject.put("device_brand", str3);
            jSONObject.put("device_manufacturer", Build.MANUFACTURER);
            jSONObject.put("cpu_abi", g());
            Context contextG = e.g();
            String packageName = contextG.getPackageName();
            jSONObject.put("package", packageName);
            PackageInfo packageInfo = contextG.getPackageManager().getPackageInfo(packageName, 0);
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            if (applicationInfo != null) {
                int i3 = applicationInfo.labelRes;
                if (i3 > 0) {
                    jSONObject.put("display_name", contextG.getString(i3));
                } else {
                    jSONObject.put("display_name", contextG.getPackageManager().getApplicationLabel(packageInfo.applicationInfo));
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        d.a(jSONObject);
    }

    public static void addRuntimeHeader(JSONObject jSONObject) throws JSONException {
        try {
            jSONObject.put("access", k.a(e.g()));
        } catch (JSONException e6) {
            e6.printStackTrace();
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) e.g().getSystemService("phone");
            if (telephonyManager != null) {
                String networkOperatorName = telephonyManager.getNetworkOperatorName();
                if (!TextUtils.isEmpty(networkOperatorName)) {
                    jSONObject.put("carrier", networkOperatorName);
                }
                String networkOperator = telephonyManager.getNetworkOperator();
                if (TextUtils.isEmpty(networkOperator)) {
                    return;
                }
                jSONObject.put("mcc_mnc", networkOperator);
            }
        } catch (Exception e7) {
            e7.printStackTrace();
        }
    }

    public static Header b(Context context) throws JSONException {
        Header headerA = a(context);
        a(headerA);
        b(headerA);
        headerA.c();
        headerA.d();
        headerA.e();
        return headerA;
    }

    private static String g() {
        if (f6113d == null) {
            try {
                StringBuilder sb = new StringBuilder();
                if (Build.SUPPORTED_ABIS.length > 0) {
                    int i = 0;
                    while (true) {
                        String[] strArr = Build.SUPPORTED_ABIS;
                        if (i >= strArr.length) {
                            break;
                        }
                        sb.append(strArr[i]);
                        if (i != strArr.length - 1) {
                            sb.append(", ");
                        }
                        i++;
                    }
                } else {
                    sb = new StringBuilder(Build.CPU_ABI);
                }
                if (TextUtils.isEmpty(sb.toString())) {
                    f6113d = "unknown";
                }
                f6113d = sb.toString();
            } catch (Exception e6) {
                com.apm.insight.a.b((Throwable) e6);
                f6113d = "unknown";
            }
        }
        return f6113d;
    }

    public final JSONObject c() {
        return a(e.a().a());
    }

    public final JSONObject d() throws JSONException {
        try {
            this.f6117c.put("device_id", e.c().a());
        } catch (JSONException e6) {
            e6.printStackTrace();
        }
        return this.f6117c;
    }

    public final JSONObject e() throws JSONException {
        try {
            long jF = e.a().f();
            if (jF > 0) {
                this.f6117c.put("user_id", jF);
            }
        } catch (JSONException e6) {
            e6.printStackTrace();
        }
        return this.f6117c;
    }

    public final JSONObject f() {
        return this.f6117c;
    }

    public static boolean c(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return true;
        }
        return (jSONObject.opt("app_version") == null && jSONObject.opt("version_name") == null) || jSONObject.opt("version_code") == null || jSONObject.opt("update_version_code") == null;
    }

    public static boolean d(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.length() != 0) {
            String strOptString = jSONObject.optString("aid");
            if (TextUtils.isEmpty(strOptString)) {
                return true;
            }
            try {
                return Integer.parseInt(strOptString) <= 0;
            } catch (Throwable unused) {
            }
        }
        return true;
    }

    public static Header a(long j6) throws JSONException {
        Header headerA;
        o oVarA = o.a();
        if (j6 == 0) {
            j6 = System.currentTimeMillis();
        }
        JSONObject jSONObjectA = oVarA.a(j6);
        if (jSONObjectA != null && jSONObjectA.length() != 0) {
            try {
                if (!jSONObjectA.has("aid")) {
                    jSONObjectA.put("aid", 4444);
                }
            } catch (Exception unused) {
            }
            headerA = new Header(e.g());
        } else {
            headerA = a(e.g());
            headerA.c();
            try {
                headerA.f6117c.put("errHeader", 1);
            } catch (Throwable unused2) {
            }
        }
        b(headerA);
        headerA.a(jSONObjectA);
        return headerA;
    }

    public static boolean b() {
        if (f6115f == -1) {
            f6115f = g().contains("86") ? 1 : 0;
        }
        return f6115f == 1;
    }

    public static boolean b(JSONObject jSONObject) {
        return jSONObject.optInt("unauthentic_version", 0) == 1;
    }

    public static void b(Header header) throws JSONException {
        if (header == null) {
            return;
        }
        addOtherHeader(header.f6117c);
    }

    public static boolean a() {
        if (f6114e == -1) {
            f6114e = g().contains("64") ? 1 : 0;
        }
        return f6114e == 1;
    }

    public final JSONObject a(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return this.f6117c;
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                this.f6117c.put(next, jSONObject.opt(next));
            } catch (JSONException e6) {
                e6.printStackTrace();
            }
        }
        return this.f6117c;
    }

    public final JSONObject a(Map<String, Object> map) {
        if (map == null) {
            return this.f6117c;
        }
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            if (!this.f6117c.has(entry.getKey())) {
                this.f6117c.put(entry.getKey(), entry.getValue());
            }
        }
        String[] strArr = f6112a;
        for (int i = 0; i < 4; i++) {
            String str = strArr[i];
            if (map.containsKey(str)) {
                try {
                    this.f6117c.put(str, Integer.parseInt(String.valueOf(map.get(str))));
                } catch (Throwable unused) {
                    this.f6117c.put(str, map.get(str));
                }
            }
        }
        if (map.containsKey("version_code") && !map.containsKey("manifest_version_code")) {
            try {
                this.f6117c.put("manifest_version_code", Integer.parseInt(String.valueOf(map.get("version_code"))));
            } catch (Throwable unused2) {
            }
        }
        if (map.containsKey("iid")) {
            this.f6117c.put("udid", map.get("iid"));
            this.f6117c.remove("iid");
        }
        if (map.containsKey("version_name")) {
            this.f6117c.put("app_version", map.get("version_name"));
            this.f6117c.remove("version_name");
        }
        return this.f6117c;
    }

    public static Header a(Header header) throws JSONException {
        addRuntimeHeader(header.f6117c);
        return header;
    }
}
