package pa;

import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;
import va.e3;
import va.w1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final e3 f31537a;

    /* renamed from: b, reason: collision with root package name */
    public final a f31538b;

    public j(e3 e3Var) {
        this.f31537a = e3Var;
        w1 w1Var = e3Var.f36085c;
        this.f31538b = w1Var == null ? null : w1Var.a();
    }

    public final JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        e3 e3Var = this.f31537a;
        jSONObject.put("Adapter", e3Var.f36083a);
        jSONObject.put("Latency", e3Var.f36084b);
        String str = e3Var.f36087e;
        if (str == null) {
            jSONObject.put("Ad Source Name", "null");
        } else {
            jSONObject.put("Ad Source Name", str);
        }
        String str2 = e3Var.f36088f;
        if (str2 == null) {
            jSONObject.put("Ad Source ID", "null");
        } else {
            jSONObject.put("Ad Source ID", str2);
        }
        String str3 = e3Var.g;
        if (str3 == null) {
            jSONObject.put("Ad Source Instance Name", "null");
        } else {
            jSONObject.put("Ad Source Instance Name", str3);
        }
        String str4 = e3Var.f36089h;
        if (str4 == null) {
            jSONObject.put("Ad Source Instance ID", "null");
        } else {
            jSONObject.put("Ad Source Instance ID", str4);
        }
        JSONObject jSONObject2 = new JSONObject();
        Bundle bundle = e3Var.f36086d;
        for (String str5 : bundle.keySet()) {
            jSONObject2.put(str5, bundle.get(str5));
        }
        jSONObject.put("Credentials", jSONObject2);
        a aVar = this.f31538b;
        if (aVar == null) {
            jSONObject.put("Ad Error", "null");
            return jSONObject;
        }
        jSONObject.put("Ad Error", aVar.b());
        return jSONObject;
    }

    public final String toString() {
        try {
            return a().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
