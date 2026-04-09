package kg;

import android.text.TextUtils;
import io.sentry.android.core.e0;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: d, reason: collision with root package name */
    public static final long f14399d = TimeUnit.DAYS.toMillis(7);

    /* renamed from: a, reason: collision with root package name */
    public final String f14400a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14401b;

    /* renamed from: c, reason: collision with root package name */
    public final long f14402c;

    public s(long j, String str, String str2) {
        this.f14400a = str;
        this.f14401b = str2;
        this.f14402c = j;
    }

    public static String a(long j, String str, String str2) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str);
            jSONObject.put("appVersion", str2);
            jSONObject.put("timestamp", j);
            return jSONObject.toString();
        } catch (JSONException e4) {
            e0.p("FirebaseMessaging", "Failed to encode token: " + e4);
            return null;
        }
    }

    public static s b(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new s(0L, str, null);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new s(jSONObject.getLong("timestamp"), jSONObject.getString("token"), jSONObject.getString("appVersion"));
        } catch (JSONException e4) {
            e0.p("FirebaseMessaging", "Failed to parse token: " + e4);
            return null;
        }
    }
}
