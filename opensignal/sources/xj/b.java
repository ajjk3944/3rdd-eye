package xj;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class b implements i {
    public static a b(JSONObject jSONObject) throws JSONException {
        br.l.e(jSONObject, "input");
        long j = jSONObject.getLong("id");
        long j7 = jSONObject.getLong("task_id");
        String string = jSONObject.getString("task_name");
        String strOptString = jSONObject.optString("data_endpoint", "");
        long jOptLong = jSONObject.optLong("time_of_result");
        String strOptString2 = jSONObject.optString("job_type", "");
        br.l.b(string);
        br.l.b(strOptString2);
        br.l.b(strOptString);
        return new a(j, j7, jOptLong, string, strOptString2, strOptString);
    }

    @Override // xj.h
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public JSONObject a(vj.c cVar) throws JSONException {
        br.l.e(cVar, "input");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", cVar.b());
        jSONObject.put("task_id", cVar.d());
        jSONObject.put("task_name", cVar.e());
        jSONObject.put("data_endpoint", cVar.a());
        jSONObject.put("time_of_result", cVar.f());
        jSONObject.put("job_type", cVar.c());
        return jSONObject;
    }
}
