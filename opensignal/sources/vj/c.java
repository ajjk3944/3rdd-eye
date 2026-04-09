package vj;

import br.l;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class c {
    public abstract String a();

    public abstract long b();

    public abstract String c();

    public abstract long d();

    public abstract String e();

    public abstract long f();

    public abstract void g(JSONObject jSONObject);

    public final String h() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", b());
        jSONObject.put("task_id", d());
        jSONObject.put("task_name", e());
        jSONObject.put("job_type", c());
        jSONObject.put("data_endpoint", a());
        jSONObject.put("time_of_result", f());
        g(jSONObject);
        String string = jSONObject.toString();
        l.d(string, "toString(...)");
        return string;
    }
}
