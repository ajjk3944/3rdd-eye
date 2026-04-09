package lf;

import com.google.android.gms.internal.ads.fz1;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: h, reason: collision with root package name */
    public static final Date f28745h = new Date(0);

    /* renamed from: a, reason: collision with root package name */
    public final JSONObject f28746a;

    /* renamed from: b, reason: collision with root package name */
    public final JSONObject f28747b;

    /* renamed from: c, reason: collision with root package name */
    public final Date f28748c;

    /* renamed from: d, reason: collision with root package name */
    public final JSONArray f28749d;

    /* renamed from: e, reason: collision with root package name */
    public final JSONObject f28750e;

    /* renamed from: f, reason: collision with root package name */
    public final long f28751f;
    public final JSONArray g;

    public c(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2, long j, JSONArray jSONArray2) throws JSONException {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("configs_key", jSONObject);
        jSONObject3.put("fetch_time_key", date.getTime());
        jSONObject3.put("abt_experiments_key", jSONArray);
        jSONObject3.put("personalization_metadata_key", jSONObject2);
        jSONObject3.put("template_version_number_key", j);
        jSONObject3.put("rollout_metadata_key", jSONArray2);
        this.f28747b = jSONObject;
        this.f28748c = date;
        this.f28749d = jSONArray;
        this.f28750e = jSONObject2;
        this.f28751f = j;
        this.g = jSONArray2;
        this.f28746a = jSONObject3;
    }

    public static c a(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("personalization_metadata_key");
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
        }
        JSONObject jSONObject2 = jSONObjectOptJSONObject;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("rollout_metadata_key");
        if (jSONArrayOptJSONArray == null) {
            jSONArrayOptJSONArray = new JSONArray();
        }
        return new c(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")), jSONObject.getJSONArray("abt_experiments_key"), jSONObject2, jSONObject.optLong("template_version_number_key"), jSONArrayOptJSONArray);
    }

    public static fz1 c() {
        fz1 fz1Var = new fz1();
        fz1Var.f11319b = new JSONObject();
        fz1Var.f11320c = f28745h;
        fz1Var.f11321d = new JSONArray();
        fz1Var.f11322e = new JSONObject();
        fz1Var.f11318a = 0L;
        fz1Var.f11323f = new JSONArray();
        return fz1Var;
    }

    public final HashMap b() throws JSONException {
        HashMap map = new HashMap();
        int i4 = 0;
        while (true) {
            JSONArray jSONArray = this.g;
            if (i4 >= jSONArray.length()) {
                return map;
            }
            JSONObject jSONObject = jSONArray.getJSONObject(i4);
            String string = jSONObject.getString("rolloutId");
            String string2 = jSONObject.getString("variantId");
            JSONArray jSONArray2 = jSONObject.getJSONArray("affectedParameterKeys");
            for (int i10 = 0; i10 < jSONArray2.length(); i10++) {
                String string3 = jSONArray2.getString(i10);
                if (!map.containsKey(string3)) {
                    map.put(string3, new HashMap());
                }
                Map map2 = (Map) map.get(string3);
                if (map2 != null) {
                    map2.put(string, string2);
                }
            }
            i4++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return this.f28746a.toString().equals(((c) obj).f28746a.toString());
        }
        return false;
    }

    public final int hashCode() {
        return this.f28746a.hashCode();
    }

    public final String toString() {
        return this.f28746a.toString();
    }
}
