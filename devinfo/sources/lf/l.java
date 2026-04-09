package lf;

import android.content.SharedPreferences;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class l {

    /* renamed from: e, reason: collision with root package name */
    public static final Date f28795e = new Date(-1);

    /* renamed from: f, reason: collision with root package name */
    public static final Date f28796f = new Date(-1);

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f28797a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f28798b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Object f28799c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final Object f28800d = new Object();

    public l(SharedPreferences sharedPreferences) {
        this.f28797a = sharedPreferences;
    }

    public final k a() {
        k kVar;
        synchronized (this.f28799c) {
            int i4 = this.f28797a.getInt("num_failed_fetches", 0);
            Date date = new Date(this.f28797a.getLong("backoff_end_time_in_millis", -1L));
            kVar = new k();
            kVar.f28793a = i4;
            kVar.f28794b = date;
        }
        return kVar;
    }

    public final HashMap b() {
        try {
            JSONObject jSONObject = new JSONObject(this.f28797a.getString("customSignals", JsonUtils.EMPTY_JSON));
            HashMap map = new HashMap();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.optString(next));
            }
            return map;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }

    public final k c() {
        k kVar;
        synchronized (this.f28800d) {
            int i4 = this.f28797a.getInt("num_failed_realtime_streams", 0);
            Date date = new Date(this.f28797a.getLong("realtime_backoff_end_time_in_millis", -1L));
            kVar = new k();
            kVar.f28793a = i4;
            kVar.f28794b = date;
        }
        return kVar;
    }

    public final void d(int i4, Date date) {
        synchronized (this.f28799c) {
            this.f28797a.edit().putInt("num_failed_fetches", i4).putLong("backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    public final void e(String str) {
        synchronized (this.f28798b) {
            this.f28797a.edit().putString("last_fetch_etag", str).apply();
        }
    }

    public final void f(Date date) {
        synchronized (this.f28800d) {
            this.f28797a.edit().putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    public final void g(int i4, Date date) {
        synchronized (this.f28800d) {
            this.f28797a.edit().putInt("num_failed_realtime_streams", i4).putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    public final void h() {
        synchronized (this.f28798b) {
            this.f28797a.edit().putInt("last_fetch_status", 1).apply();
        }
    }

    public final void i() {
        synchronized (this.f28798b) {
            this.f28797a.edit().putInt("last_fetch_status", 2).apply();
        }
    }
}
