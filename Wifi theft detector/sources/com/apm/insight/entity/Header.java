package com.apm.insight.entity;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
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
    private static final String[] f4930a = {"version_code", "manifest_version_code", "aid", "update_version_code"};

    /* renamed from: d, reason: collision with root package name */
    private static String f4931d = null;

    /* renamed from: e, reason: collision with root package name */
    private static int f4932e = -1;

    /* renamed from: f, reason: collision with root package name */
    private static int f4933f = -1;

    /* renamed from: b, reason: collision with root package name */
    private Context f4934b;

    /* renamed from: c, reason: collision with root package name */
    private JSONObject f4935c = new JSONObject();

    public Header(Context context) {
        this.f4934b = context;
    }

    public static Header a(Context context) throws JSONException {
        Header header = new Header(context);
        JSONObject jSONObject = header.f4935c;
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
            int i10 = displayMetrics.densityDpi;
            String str = i10 != 120 ? i10 != 240 ? i10 != 320 ? "mdpi" : "xhdpi" : "hdpi" : "ldpi";
            jSONObject.put("density_dpi", i10);
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
            String str2 = Build.VERSION.RELEASE;
            if (!str2.contains(".")) {
                str2 = str2 + ".0";
            }
            jSONObject.put("os_version", str2);
            jSONObject.put("os_api", Build.VERSION.SDK_INT);
            String str3 = Build.MODEL;
            String str4 = Build.BRAND;
            if (str3 == null) {
                str3 = str4;
            } else if (str4 != null && !str3.contains(str4)) {
                str3 = str4 + ' ' + str3;
            }
            jSONObject.put("device_model", str3);
            jSONObject.put("device_brand", str4);
            jSONObject.put("device_manufacturer", Build.MANUFACTURER);
            jSONObject.put("cpu_abi", g());
            Context contextG = e.g();
            String packageName = contextG.getPackageName();
            jSONObject.put("package", packageName);
            PackageInfo packageInfo = contextG.getPackageManager().getPackageInfo(packageName, 0);
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            if (applicationInfo != null) {
                int i11 = applicationInfo.labelRes;
                if (i11 > 0) {
                    jSONObject.put("display_name", contextG.getString(i11));
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
        } catch (JSONException e10) {
            e10.printStackTrace();
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
        } catch (Exception e11) {
            e11.printStackTrace();
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
        if (f4931d == null) {
            try {
                StringBuilder sb = new StringBuilder();
                if (Build.SUPPORTED_ABIS.length > 0) {
                    int i10 = 0;
                    while (true) {
                        String[] strArr = Build.SUPPORTED_ABIS;
                        if (i10 >= strArr.length) {
                            break;
                        }
                        sb.append(strArr[i10]);
                        if (i10 != strArr.length - 1) {
                            sb.append(", ");
                        }
                        i10++;
                    }
                } else {
                    sb = new StringBuilder(Build.CPU_ABI);
                }
                if (TextUtils.isEmpty(sb.toString())) {
                    f4931d = "unknown";
                }
                f4931d = sb.toString();
            } catch (Exception e10) {
                com.apm.insight.a.b((Throwable) e10);
                f4931d = "unknown";
            }
        }
        return f4931d;
    }

    public final JSONObject c() {
        return a(e.a().a());
    }

    public final JSONObject d() throws JSONException {
        try {
            this.f4935c.put("device_id", e.c().a());
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        return this.f4935c;
    }

    public final JSONObject e() throws JSONException {
        try {
            long jF = e.a().f();
            if (jF > 0) {
                this.f4935c.put("user_id", jF);
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        return this.f4935c;
    }

    public final JSONObject f() {
        return this.f4935c;
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

    public static Header a(long j10) throws JSONException {
        Header headerA;
        o oVarA = o.a();
        if (j10 == 0) {
            j10 = System.currentTimeMillis();
        }
        JSONObject jSONObjectA = oVarA.a(j10);
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
                headerA.f4935c.put("errHeader", 1);
            } catch (Throwable unused2) {
            }
        }
        b(headerA);
        headerA.a(jSONObjectA);
        return headerA;
    }

    public static boolean b() {
        if (f4933f == -1) {
            f4933f = g().contains("86") ? 1 : 0;
        }
        return f4933f == 1;
    }

    public static boolean b(JSONObject jSONObject) {
        return jSONObject.optInt("unauthentic_version", 0) == 1;
    }

    public static void b(Header header) throws JSONException {
        if (header == null) {
            return;
        }
        addOtherHeader(header.f4935c);
    }

    public static boolean a() {
        if (f4932e == -1) {
            f4932e = g().contains("64") ? 1 : 0;
        }
        return f4932e == 1;
    }

    public final JSONObject a(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return this.f4935c;
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                this.f4935c.put(next, jSONObject.opt(next));
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
        return this.f4935c;
    }

    public final JSONObject a(@Nullable Map<String, Object> map) {
        if (map == null) {
            return this.f4935c;
        }
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            if (!this.f4935c.has(entry.getKey())) {
                this.f4935c.put(entry.getKey(), entry.getValue());
            }
        }
        String[] strArr = f4930a;
        for (int i10 = 0; i10 < 4; i10++) {
            String str = strArr[i10];
            if (map.containsKey(str)) {
                try {
                    this.f4935c.put(str, Integer.parseInt(String.valueOf(map.get(str))));
                } catch (Throwable unused) {
                    this.f4935c.put(str, map.get(str));
                }
            }
        }
        if (map.containsKey("version_code") && !map.containsKey("manifest_version_code")) {
            try {
                this.f4935c.put("manifest_version_code", Integer.parseInt(String.valueOf(map.get("version_code"))));
            } catch (Throwable unused2) {
            }
        }
        if (map.containsKey("iid")) {
            this.f4935c.put("udid", map.get("iid"));
            this.f4935c.remove("iid");
        }
        if (map.containsKey("version_name")) {
            this.f4935c.put("app_version", map.get("version_name"));
            this.f4935c.remove("version_name");
        }
        return this.f4935c;
    }

    public static Header a(Header header) throws JSONException {
        addRuntimeHeader(header.f4935c);
        return header;
    }
}
