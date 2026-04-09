package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.internal.measurement.d5;
import j$.util.DesugarTimeZone;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kf.c;
import kf.d;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class ConfigFetchHttpClient {

    /* renamed from: h, reason: collision with root package name */
    public static final Pattern f20719h = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* renamed from: a, reason: collision with root package name */
    public final Context f20720a;

    /* renamed from: b, reason: collision with root package name */
    public final String f20721b;

    /* renamed from: c, reason: collision with root package name */
    public final String f20722c;

    /* renamed from: d, reason: collision with root package name */
    public final String f20723d;

    /* renamed from: e, reason: collision with root package name */
    public final String f20724e;

    /* renamed from: f, reason: collision with root package name */
    public final long f20725f;
    public final long g;

    public ConfigFetchHttpClient(Context context, String str, String str2, long j, long j8) {
        this.f20720a = context;
        this.f20721b = str;
        this.f20722c = str2;
        Matcher matcher = f20719h.matcher(str);
        this.f20723d = matcher.matches() ? matcher.group(1) : null;
        this.f20724e = "firebase";
        this.f20725f = j;
        this.g = j8;
    }

    public static JSONObject c(HttpURLConnection httpURLConnection) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "utf-8"));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            int i4 = bufferedReader.read();
            if (i4 == -1) {
                return new JSONObject(sb2.toString());
            }
            sb2.append((char) i4);
        }
    }

    public static void d(HttpURLConnection httpURLConnection, byte[] bArr) throws IOException {
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bArr);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    public final JSONObject a(String str, String str2, Map map, Long l10, Map map2) throws c, PackageManager.NameNotFoundException {
        HashMap map3 = new HashMap();
        if (str == null) {
            throw new c("Fetch failed: Firebase installation id is null.");
        }
        map3.put("appInstanceId", str);
        map3.put("appInstanceIdToken", str2);
        map3.put("appId", this.f20721b);
        Context context = this.f20720a;
        Locale locale = context.getResources().getConfiguration().locale;
        map3.put("countryCode", locale.getCountry());
        int i4 = Build.VERSION.SDK_INT;
        map3.put("languageCode", locale.toLanguageTag());
        map3.put("platformVersion", Integer.toString(i4));
        map3.put("timeZone", TimeZone.getDefault().getID());
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            if (packageInfo != null) {
                map3.put("appVersion", packageInfo.versionName);
                map3.put("appBuild", Long.toString(d5.j(packageInfo)));
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        map3.put("packageName", context.getPackageName());
        map3.put("sdkVersion", "23.0.1");
        map3.put("analyticsUserProperties", new JSONObject(map));
        if (!map2.isEmpty()) {
            map3.put("customSignals", new JSONObject(map2));
            Log.d("FirebaseRemoteConfig", "Keys of custom signals during fetch: " + map2.keySet());
        }
        if (l10 != null) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
            map3.put("firstOpenTime", simpleDateFormat.format(l10));
        }
        return new JSONObject(map3);
    }

    public final HttpURLConnection b() {
        try {
            return (HttpURLConnection) new URL("https://firebaseremoteconfig.googleapis.com/v1/projects/" + this.f20723d + "/namespaces/" + this.f20724e + ":fetch").openConnection();
        } catch (IOException e2) {
            throw new d(e2.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x009d A[LOOP:0: B:13:0x0097->B:15:0x009d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d7 A[Catch: all -> 0x0189, JSONException -> 0x018b, IOException | JSONException -> 0x018d, TRY_LEAVE, TryCatch #1 {all -> 0x0189, blocks: (B:17:0x00bb, B:19:0x00d7, B:69:0x018f, B:70:0x0198, B:71:0x0199, B:72:0x01a0), top: B:84:0x00bb }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x018f A[Catch: all -> 0x0189, JSONException -> 0x018b, IOException | JSONException -> 0x018d, TRY_ENTER, TryCatch #1 {all -> 0x0189, blocks: (B:17:0x00bb, B:19:0x00d7, B:69:0x018f, B:70:0x0198, B:71:0x0199, B:72:0x01a0), top: B:84:0x00bb }] */
    @androidx.annotation.Keep
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public lf.f fetch(java.net.HttpURLConnection r10, java.lang.String r11, java.lang.String r12, java.util.Map<java.lang.String, java.lang.String> r13, java.lang.String r14, java.util.Map<java.lang.String, java.lang.String> r15, java.lang.Long r16, java.util.Date r17, java.util.Map<java.lang.String, java.lang.String> r18) throws kf.d {
        /*
            Method dump skipped, instructions count: 428
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient.fetch(java.net.HttpURLConnection, java.lang.String, java.lang.String, java.util.Map, java.lang.String, java.util.Map, java.lang.Long, java.util.Date, java.util.Map):lf.f");
    }
}
