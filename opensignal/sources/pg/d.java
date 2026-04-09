package pg;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: h, reason: collision with root package name */
    public static final Date f20497h = new Date(0);

    /* renamed from: a, reason: collision with root package name */
    public final JSONObject f20498a;

    /* renamed from: b, reason: collision with root package name */
    public final JSONObject f20499b;

    /* renamed from: c, reason: collision with root package name */
    public final Date f20500c;

    /* renamed from: d, reason: collision with root package name */
    public final JSONArray f20501d;

    /* renamed from: e, reason: collision with root package name */
    public final JSONObject f20502e;

    /* renamed from: f, reason: collision with root package name */
    public final long f20503f;

    /* renamed from: g, reason: collision with root package name */
    public final JSONArray f20504g;

    public d(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2, long j, JSONArray jSONArray2) throws JSONException {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("configs_key", jSONObject);
        jSONObject3.put("fetch_time_key", date.getTime());
        jSONObject3.put("abt_experiments_key", jSONArray);
        jSONObject3.put("personalization_metadata_key", jSONObject2);
        jSONObject3.put("template_version_number_key", j);
        jSONObject3.put("rollout_metadata_key", jSONArray2);
        this.f20499b = jSONObject;
        this.f20500c = date;
        this.f20501d = jSONArray;
        this.f20502e = jSONObject2;
        this.f20503f = j;
        this.f20504g = jSONArray2;
        this.f20498a = jSONObject3;
    }

    public static d a(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("personalization_metadata_key");
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
        }
        JSONObject jSONObject2 = jSONObjectOptJSONObject;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("rollout_metadata_key");
        if (jSONArrayOptJSONArray == null) {
            jSONArrayOptJSONArray = new JSONArray();
        }
        return new d(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")), jSONObject.getJSONArray("abt_experiments_key"), jSONObject2, jSONObject.optLong("template_version_number_key"), jSONArrayOptJSONArray);
    }

    public static io.sentry.instrumentation.file.b c() {
        io.sentry.instrumentation.file.b bVar = new io.sentry.instrumentation.file.b();
        bVar.f12331b = new JSONObject();
        bVar.f12332c = f20497h;
        bVar.f12333d = new JSONArray();
        bVar.f12334e = new JSONObject();
        bVar.f12330a = 0L;
        bVar.f12335f = new JSONArray();
        return bVar;
    }

    public final HashMap b() throws JSONException {
        HashMap map = new HashMap();
        int i10 = 0;
        while (true) {
            JSONArray jSONArray = this.f20504g;
            if (i10 >= jSONArray.length()) {
                return map;
            }
            JSONObject jSONObject = jSONArray.getJSONObject(i10);
            String string = jSONObject.getString("rolloutId");
            String string2 = jSONObject.getString("variantId");
            JSONArray jSONArray2 = jSONObject.getJSONArray("affectedParameterKeys");
            for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
                String string3 = jSONArray2.getString(i11);
                if (!map.containsKey(string3)) {
                    map.put(string3, new HashMap());
                }
                Map map2 = (Map) map.get(string3);
                if (map2 != null) {
                    map2.put(string, string2);
                }
            }
            i10++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            return this.f20498a.toString().equals(((d) obj).f20498a.toString());
        }
        return false;
    }

    public final int hashCode() {
        return this.f20498a.hashCode();
    }

    public final String toString() {
        return this.f20498a.toString();
    }
}
