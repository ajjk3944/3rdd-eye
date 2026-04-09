package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
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
import org.json.JSONException;
import org.json.JSONObject;
import r5.f;
import r5.g;

/* loaded from: classes2.dex */
public class ConfigFetchHttpClient {

    /* renamed from: h, reason: collision with root package name */
    public static final Pattern f23279h = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* renamed from: a, reason: collision with root package name */
    public final Context f23280a;

    /* renamed from: b, reason: collision with root package name */
    public final String f23281b;

    /* renamed from: c, reason: collision with root package name */
    public final String f23282c;

    /* renamed from: d, reason: collision with root package name */
    public final String f23283d;

    /* renamed from: e, reason: collision with root package name */
    public final String f23284e;

    /* renamed from: f, reason: collision with root package name */
    public final long f23285f;

    /* renamed from: g, reason: collision with root package name */
    public final long f23286g;

    public ConfigFetchHttpClient(Context context, String str, String str2, long j4, long j10) {
        this.f23280a = context;
        this.f23281b = str;
        this.f23282c = str2;
        Matcher matcher = f23279h.matcher(str);
        this.f23283d = matcher.matches() ? matcher.group(1) : null;
        this.f23284e = "firebase";
        this.f23285f = j4;
        this.f23286g = j10;
    }

    public static JSONObject c(HttpURLConnection httpURLConnection) throws JSONException, IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "utf-8"));
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i = bufferedReader.read();
            if (i == -1) {
                return new JSONObject(sb.toString());
            }
            sb.append((char) i);
        }
    }

    public static void d(HttpURLConnection httpURLConnection, byte[] bArr) throws IOException {
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bArr);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    public final JSONObject a(String str, String str2, Map<String, String> map, Long l5) throws PackageManager.NameNotFoundException, f {
        HashMap map2 = new HashMap();
        if (str == null) {
            throw new f("Fetch failed: Firebase installation id is null.");
        }
        map2.put("appInstanceId", str);
        map2.put("appInstanceIdToken", str2);
        map2.put("appId", this.f23281b);
        Context context = this.f23280a;
        Locale locale = context.getResources().getConfiguration().locale;
        map2.put("countryCode", locale.getCountry());
        int i = Build.VERSION.SDK_INT;
        map2.put("languageCode", locale.toLanguageTag());
        map2.put("platformVersion", Integer.toString(i));
        map2.put("timeZone", TimeZone.getDefault().getID());
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            if (packageInfo != null) {
                map2.put("appVersion", packageInfo.versionName);
                map2.put("appBuild", Long.toString(i >= 28 ? A0.a.b(packageInfo) : packageInfo.versionCode));
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        map2.put("packageName", context.getPackageName());
        map2.put("sdkVersion", "22.0.0");
        map2.put("analyticsUserProperties", new JSONObject(map));
        if (l5 != null) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            map2.put("firstOpenTime", simpleDateFormat.format(l5));
        }
        return new JSONObject(map2);
    }

    public final HttpURLConnection b() throws g {
        try {
            return (HttpURLConnection) new URL("https://firebaseremoteconfig.googleapis.com/v1/projects/" + this.f23283d + "/namespaces/" + this.f23284e + ":fetch").openConnection();
        } catch (IOException e4) {
            throw new g(e4.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00a2 A[LOOP:0: B:13:0x009c->B:15:0x00a2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d9 A[Catch: all -> 0x01a4, IOException | JSONException -> 0x01a6, IOException -> 0x01a8, TRY_LEAVE, TryCatch #3 {all -> 0x01a4, blocks: (B:17:0x00bd, B:19:0x00d9, B:70:0x01aa, B:71:0x01b3, B:72:0x01b4, B:73:0x01bb), top: B:89:0x00bd }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01aa A[Catch: all -> 0x01a4, IOException | JSONException -> 0x01a6, IOException -> 0x01a8, TRY_ENTER, TryCatch #3 {all -> 0x01a4, blocks: (B:17:0x00bd, B:19:0x00d9, B:70:0x01aa, B:71:0x01b3, B:72:0x01b4, B:73:0x01bb), top: B:89:0x00bd }] */
    @androidx.annotation.Keep
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.firebase.remoteconfig.internal.c.a fetch(java.net.HttpURLConnection r14, java.lang.String r15, java.lang.String r16, java.util.Map<java.lang.String, java.lang.String> r17, java.lang.String r18, java.util.Map<java.lang.String, java.lang.String> r19, java.lang.Long r20, java.util.Date r21) throws r5.g {
        /*
            Method dump skipped, instructions count: 455
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient.fetch(java.net.HttpURLConnection, java.lang.String, java.lang.String, java.util.Map, java.lang.String, java.util.Map, java.lang.Long, java.util.Date):com.google.firebase.remoteconfig.internal.c$a");
    }
}
