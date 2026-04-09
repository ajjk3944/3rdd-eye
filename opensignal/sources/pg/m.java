package pg;

import android.content.SharedPreferences;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: e, reason: collision with root package name */
    public static final Date f20548e = new Date(-1);

    /* renamed from: f, reason: collision with root package name */
    public static final Date f20549f = new Date(-1);

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f20550a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f20551b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Object f20552c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final Object f20553d = new Object();

    public m(SharedPreferences sharedPreferences) {
        this.f20550a = sharedPreferences;
    }

    public final l a() {
        l lVar;
        synchronized (this.f20552c) {
            int i10 = this.f20550a.getInt("num_failed_fetches", 0);
            Date date = new Date(this.f20550a.getLong("backoff_end_time_in_millis", -1L));
            lVar = new l();
            lVar.f20546a = i10;
            lVar.f20547b = date;
        }
        return lVar;
    }

    public final HashMap b() {
        try {
            JSONObject jSONObject = new JSONObject(this.f20550a.getString("customSignals", "{}"));
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

    public final l c() {
        l lVar;
        synchronized (this.f20553d) {
            int i10 = this.f20550a.getInt("num_failed_realtime_streams", 0);
            Date date = new Date(this.f20550a.getLong("realtime_backoff_end_time_in_millis", -1L));
            lVar = new l();
            lVar.f20546a = i10;
            lVar.f20547b = date;
        }
        return lVar;
    }

    public final void d(int i10, Date date) {
        synchronized (this.f20552c) {
            this.f20550a.edit().putInt("num_failed_fetches", i10).putLong("backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    public final void e(int i10, Date date) {
        synchronized (this.f20553d) {
            this.f20550a.edit().putInt("num_failed_realtime_streams", i10).putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }
}
