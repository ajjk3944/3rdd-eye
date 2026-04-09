package com.applovin.impl;

import android.os.Build;
import android.text.TextUtils;
import com.applovin.impl.sdk.SessionTracker;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.y1;
import com.applovin.sdk.AppLovinEventTypes;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.singular.sdk.internal.Constants;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.lang.Thread;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class z1 {

    /* renamed from: g, reason: collision with root package name */
    private static volatile ExecutorService f21884g;

    /* renamed from: a, reason: collision with root package name */
    protected final com.applovin.impl.sdk.k f21886a;

    /* renamed from: b, reason: collision with root package name */
    protected final com.applovin.impl.sdk.o f21887b;

    /* renamed from: c, reason: collision with root package name */
    private final y1.b f21888c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f21889d = Collections.synchronizedMap(new HashMap());

    /* renamed from: e, reason: collision with root package name */
    private final Set f21890e = Collections.synchronizedSet(new HashSet());

    /* renamed from: f, reason: collision with root package name */
    private static final int f21883f = (int) TimeUnit.SECONDS.toMillis(30);

    /* renamed from: h, reason: collision with root package name */
    private static final Object f21885h = new Object();

    public class a implements ThreadFactory {

        /* renamed from: com.applovin.impl.z1$a$a, reason: collision with other inner class name */
        public class C0325a implements Thread.UncaughtExceptionHandler {
            public C0325a() {
            }

            @Override // java.lang.Thread.UncaughtExceptionHandler
            public void uncaughtException(Thread thread, Throwable th) {
                z1.this.f21886a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    z1.this.f21886a.O().a("HealthEventsReporter", "Caught unhandled exception", th);
                }
            }
        }

        public a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "AppLovinSdk:health_events_reporter");
            thread.setDaemon(true);
            thread.setPriority(((Integer) z1.this.f21886a.a(l4.f19812Q)).intValue());
            thread.setUncaughtExceptionHandler(new C0325a());
            return thread;
        }
    }

    public z1(com.applovin.impl.sdk.k kVar, y1.b bVar) {
        this.f21886a = kVar;
        this.f21887b = kVar.O();
        this.f21888c = bVar;
        a();
    }

    private void c(y1 y1Var, List list) {
        HttpURLConnection httpURLConnection;
        Throwable th;
        if (y1Var.a() == y1.b.AD || y1Var.a() == y1.b.MEDIATED_AD || y1Var.a() == y1.b.USER_SESSION || !a7.a(((Integer) this.f21886a.a(l4.f20074z)).intValue())) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map map = (Map) it.next();
            try {
                httpURLConnection = (HttpURLConnection) a(y1Var, map).openConnection();
            } catch (Throwable th2) {
                httpURLConnection = null;
                th = th2;
            }
            try {
                int i = f21883f;
                httpURLConnection.setConnectTimeout(i);
                httpURLConnection.setReadTimeout(i);
                httpURLConnection.setDefaultUseCaches(false);
                httpURLConnection.setAllowUserInteraction(false);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setInstanceFollowRedirects(true);
                httpURLConnection.setDoOutput(false);
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setRequestProperty("AppLovin-Event-Type", y1Var.b());
                int responseCode = httpURLConnection.getResponseCode();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f21887b.a("HealthEventsReporter", y1Var.b() + " reported with code " + responseCode + " and extra parameters " + map);
                }
                this.f21889d.put(y1Var, Long.valueOf(System.currentTimeMillis()));
            } catch (Throwable th3) {
                th = th3;
                try {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f21887b.d("HealthEventsReporter", "Failed to report " + y1Var.b() + " with extra parameters " + map, th);
                    }
                    a7.a(httpURLConnection, this.f21886a);
                } finally {
                    a7.a(httpURLConnection, this.f21886a);
                }
            }
        }
    }

    public void d(y1 y1Var, Map map) {
        a(y1Var, map, 0L);
    }

    private void a() {
        if (f21884g != null) {
            return;
        }
        synchronized (f21885h) {
            try {
                if (f21884g != null) {
                    return;
                }
                f21884g = Executors.newFixedThreadPool(1, new a());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void d(y1 y1Var, List list) throws JSONException {
        String str = (String) this.f21886a.a(l4.f19693A);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        double dA = y1Var.a(this.f21886a);
        if (a7.a(dA)) {
            if (((Boolean) this.f21886a.a(l4.f19740G)).booleanValue()) {
                a(str, y1Var, a(y1Var, dA, list));
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                f21884g.execute(new N.i(this, str, y1Var, a(y1Var, dA, Collections.singletonList((Map) it.next())), 3));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(String str, y1 y1Var, JSONObject jSONObject) {
        HttpURLConnection httpURLConnection = null;
        try {
            URL url = new URL(str);
            byte[] bytes = jSONObject.toString().getBytes(Constants.ENCODING);
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) url.openConnection();
            try {
                int i = f21883f;
                httpURLConnection2.setConnectTimeout(i);
                httpURLConnection2.setReadTimeout(i);
                httpURLConnection2.setRequestProperty("Content-Type", "application/json; charset=utf-8");
                httpURLConnection2.setDefaultUseCaches(false);
                httpURLConnection2.setAllowUserInteraction(false);
                httpURLConnection2.setUseCaches(false);
                httpURLConnection2.setInstanceFollowRedirects(true);
                httpURLConnection2.setDoOutput(true);
                httpURLConnection2.setFixedLengthStreamingMode(bytes.length);
                httpURLConnection2.setRequestMethod("POST");
                httpURLConnection2.setRequestProperty("AppLovin-Event-Type", y1Var.b());
                OutputStream outputStream = httpURLConnection2.getOutputStream();
                outputStream.write(bytes);
                outputStream.close();
                int responseCode = httpURLConnection2.getResponseCode();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f21887b.a("HealthEventsReporter", y1Var.b() + " reported with code " + responseCode);
                }
                this.f21889d.put(y1Var, Long.valueOf(System.currentTimeMillis()));
                a7.a(httpURLConnection2, this.f21886a);
            } catch (Throwable th) {
                th = th;
                httpURLConnection = httpURLConnection2;
                try {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f21887b.d("HealthEventsReporter", "Failed to report " + y1Var.b(), th);
                    }
                } finally {
                    a7.a(httpURLConnection, this.f21886a);
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public void a(y1 y1Var, String str) {
        a(y1Var, str, new HashMap());
    }

    public void a(y1 y1Var, String str, Map map) {
        map.put(AdRevenueConstants.SOURCE_KEY, str);
        d(y1Var, map);
    }

    public void a(y1 y1Var, String str, Map map, String str2) {
        if (!StringUtils.isValidString(str2) || this.f21890e.add(str2)) {
            map.put(AdRevenueConstants.SOURCE_KEY, str);
            a(y1Var, str, map);
        }
    }

    public void a(y1 y1Var, Map map, long j4) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(map);
        a(y1Var, arrayList, j4);
    }

    public void a(y1 y1Var, List list, long j4) {
        if (a(y1Var, j4)) {
            return;
        }
        try {
            if (a7.h()) {
                f21884g.execute(new Z.e(this, y1Var, list, 7));
            } else {
                b(y1Var, list);
            }
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21887b.d("HealthEventsReporter", "Failed to report " + y1Var.b() + " with extra parameters collection " + list, th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(y1 y1Var, List list) throws JSONException {
        if (AppLovinSdkUtils.isEmulator()) {
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f21887b.a("HealthEventsReporter", "Reporting " + y1Var.b() + " with extra parameters collection " + list);
        }
        if (this.f21888c != y1Var.a()) {
            g1.a("Health event " + y1Var.b() + " category: " + y1Var.a() + " does not match the reporter category: " + this.f21888c, new Object[0]);
        }
        c(y1Var, list);
        d(y1Var, list);
    }

    private Map c(y1 y1Var, Map map) {
        HashMap map2 = new HashMap(map);
        if (y1Var == y1.f21822u0) {
            map2.remove("details");
        }
        return map2;
    }

    private Map b(y1 y1Var, Map map) {
        HashMap map2 = new HashMap();
        map2.put("type", y1Var.b());
        if (y1Var == y1.f21814q0 || y1Var == y1.F0 || y1Var == y1.f21760D0) {
            if (((Boolean) this.f21886a.a(l4.f19907d4)).booleanValue()) {
                CollectionUtils.putStringIfValid("wvvc", String.valueOf(a8.d()), map2);
                CollectionUtils.putStringIfValid("wvv", a8.c(), map2);
                CollectionUtils.putStringIfValid("wvpn", a8.b(), map2);
            }
            CollectionUtils.putStringIfValid("oglv", this.f21886a.B().I(), map2);
        }
        Map mapL = this.f21886a.B().L();
        map2.put("platform", String.valueOf(mapL.get("platform")));
        map2.put("country_code", String.valueOf(mapL.get("country_code")));
        map2.put("cc", this.f21886a.w().getCountryCode());
        map2.put("applovin_random_token", this.f21886a.h0());
        map2.put("compass_random_token", this.f21886a.v());
        map2.put(CommonUrlParts.MODEL, Build.MODEL);
        map2.put("brand", Build.MANUFACTURER);
        map2.put("brand_name", Build.BRAND);
        map2.put("hardware", Build.HARDWARE);
        map2.put("revision", Build.DEVICE);
        map2.put("os", Build.VERSION.RELEASE);
        map2.put("api_level", String.valueOf(Build.VERSION.SDK_INT));
        map2.put("sdk_version", String.valueOf(AppLovinSdk.VERSION));
        CollectionUtils.putStringIfValid("ad_review_sdk_version", C2123i.b(), map2);
        map2.put("md", (String) this.f21886a.a(l4.f20026t));
        b(map2);
        a(map2);
        if (map != null) {
            map2.putAll(c(y1Var, map));
        }
        return map2;
    }

    private URL a(y1 y1Var, Map map) throws UnsupportedEncodingException {
        StringBuilder sb = new StringBuilder("https://ms.applovin.com/1.0/sdk/error?");
        Iterator it = b(y1Var, map).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String strEncode = URLEncoder.encode((String) entry.getKey(), Constants.ENCODING);
            String strEncode2 = URLEncoder.encode((String) entry.getValue(), Constants.ENCODING);
            sb.append(strEncode);
            sb.append("=");
            sb.append(strEncode2);
            if (it.hasNext()) {
                sb.append("&");
            }
        }
        return new URL(sb.toString());
    }

    private JSONObject a(y1 y1Var, double d10, List list) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putLong(jSONObject, "ts_ms", System.currentTimeMillis());
        if (y1Var == y1.f21814q0 || y1Var == y1.F0 || y1Var == y1.f21760D0) {
            if (((Boolean) this.f21886a.a(l4.f19907d4)).booleanValue()) {
                JsonUtils.putStringIfValid(jSONObject, "wvvc", String.valueOf(a8.d()));
                JsonUtils.putStringIfValid(jSONObject, "wvv", a8.c());
                JsonUtils.putStringIfValid(jSONObject, "wvpn", a8.b());
            }
            JsonUtils.putStringIfValid(jSONObject, "oglv", this.f21886a.B().I());
        }
        JSONObject jSONObject2 = new JSONObject();
        Map mapL = this.f21886a.B().L();
        JsonUtils.putObject(jSONObject2, "platform", mapL.get("platform"));
        JsonUtils.putObject(jSONObject2, "os", mapL.get("os"));
        JsonUtils.putObject(jSONObject2, "brand", mapL.get("brand"));
        JsonUtils.putObject(jSONObject2, CommonUrlParts.MODEL, mapL.get(CommonUrlParts.MODEL));
        JsonUtils.putObject(jSONObject2, "revision", mapL.get("revision"));
        JsonUtils.putObject(jSONObject2, "country_code", mapL.get("country_code"));
        JsonUtils.putObject(jSONObject2, "cc", this.f21886a.w().getCountryCode());
        JsonUtils.putObject(jSONObject2, "applovin_random_token", this.f21886a.h0());
        JsonUtils.putObject(jSONObject2, "ad_review_sdk_version", StringUtils.emptyIfNull(C2123i.b()));
        Map mapD = this.f21886a.B().D();
        JsonUtils.putObject(jSONObject2, "sdk_version", mapD.get("sdk_version"));
        JsonUtils.putObject(jSONObject2, "plugin_version", this.f21886a.a(l4.f19705B3));
        JsonUtils.putObject(jSONObject2, "app_version", mapD.get("app_version"));
        JsonUtils.putObject(jSONObject2, "package_name", mapD.get("package_name"));
        JsonUtils.putObject(jSONObject2, "first_install", Boolean.toString(Boolean.TRUE.equals((Boolean) mapD.get("first_install_v2"))));
        JsonUtils.putObject(jSONObject2, "md", this.f21886a.a(l4.f20026t));
        JsonUtils.putObject(jSONObject2, "mediation_provider", this.f21886a.V());
        SessionTracker sessionTrackerM0 = this.f21886a.m0();
        JsonUtils.putObject(jSONObject2, "app_state", sessionTrackerM0.getCurrentApplicationState().b());
        JsonUtils.putObject(jSONObject2, "app_state_duration_ms", Long.valueOf(sessionTrackerM0.getCurrentApplicationStateDurationMillis()));
        JsonUtils.putObject(jSONObject2, "session_id", sessionTrackerM0.getSessionId());
        JsonUtils.putObject(jSONObject2, "session_duration_ms", Long.valueOf(System.currentTimeMillis() - com.applovin.impl.sdk.k.n()));
        JsonUtils.putObject(jSONObject, "shared_fields", jSONObject2);
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map map = (Map) it.next();
            JSONObject jSONObject3 = new JSONObject();
            JsonUtils.putDouble(jSONObject3, "ts_ms", System.currentTimeMillis());
            JsonUtils.putString(jSONObject3, "type", y1Var.b());
            JsonUtils.putDouble(jSONObject3, "weight", d10);
            JsonUtils.putString(jSONObject3, AppLovinEventTypes.USER_COMPLETED_LEVEL, "DEBUG");
            a(map);
            JsonUtils.putAll(jSONObject3, (Map<String, ?>) map);
            jSONArray.put(jSONObject3);
        }
        JsonUtils.putObject(jSONObject, "events", jSONArray);
        return jSONObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void b(java.util.Map r6) {
        /*
            r5 = this;
            java.lang.String r0 = ""
            r1 = 0
            android.content.Context r2 = com.applovin.impl.sdk.k.o()     // Catch: java.lang.Throwable -> L18
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch: java.lang.Throwable -> L18
            android.content.Context r3 = com.applovin.impl.sdk.k.o()     // Catch: java.lang.Throwable -> L18
            java.lang.String r3 = r3.getPackageName()     // Catch: java.lang.Throwable -> L18
            android.content.pm.PackageInfo r2 = r2.getPackageInfo(r3, r1)     // Catch: java.lang.Throwable -> L19
            goto L1a
        L18:
            r3 = r0
        L19:
            r2 = 0
        L1a:
            java.lang.String r4 = "package_name"
            r6.put(r4, r3)
            if (r2 == 0) goto L23
            java.lang.String r0 = r2.versionName
        L23:
            java.lang.String r3 = "app_version"
            r6.put(r3, r0)
            if (r2 == 0) goto L2c
            int r1 = r2.versionCode
        L2c:
            java.lang.String r0 = java.lang.String.valueOf(r1)
            java.lang.String r1 = "app_version_code"
            r6.put(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.z1.b(java.util.Map):void");
    }

    private void a(Map map) {
        if (map == null) {
            return;
        }
        Object objA = this.f21886a.I().a();
        if (objA instanceof com.applovin.impl.sdk.ad.b) {
            map.put("fs_ad_network", "AppLovin");
            map.put("fs_ad_creative_id", Long.toString(((com.applovin.impl.sdk.ad.b) objA).getAdIdNumber()));
        } else if (objA instanceof q2) {
            q2 q2Var = (q2) objA;
            map.put("fs_ad_network", q2Var.getNetworkName());
            map.put("fs_ad_creative_id", q2Var.getCreativeId());
        } else {
            map.put("fs_ad_network", "None");
            map.put("fs_ad_creative_id", "None");
        }
    }

    private boolean a(y1 y1Var, long j4) {
        Long l5 = (Long) this.f21889d.get(y1Var);
        return System.currentTimeMillis() - (l5 != null ? l5.longValue() : -1L) < j4;
    }
}
