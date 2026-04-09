package j2;

import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;
import q2.C2852x0;
import q2.f1;

/* renamed from: j2.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2554j {

    /* renamed from: a, reason: collision with root package name */
    public final f1 f21348a;

    /* renamed from: b, reason: collision with root package name */
    public final C2545a f21349b;

    public C2554j(f1 f1Var) {
        this.f21348a = f1Var;
        C2852x0 c2852x0 = f1Var.f23211c;
        this.f21349b = c2852x0 == null ? null : c2852x0.a();
    }

    public final JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        f1 f1Var = this.f21348a;
        jSONObject.put("Adapter", f1Var.f23209a);
        jSONObject.put("Latency", f1Var.f23210b);
        String str = f1Var.f23213e;
        if (str == null) {
            jSONObject.put("Ad Source Name", "null");
        } else {
            jSONObject.put("Ad Source Name", str);
        }
        String str2 = f1Var.f23214f;
        if (str2 == null) {
            jSONObject.put("Ad Source ID", "null");
        } else {
            jSONObject.put("Ad Source ID", str2);
        }
        String str3 = f1Var.f23215g;
        if (str3 == null) {
            jSONObject.put("Ad Source Instance Name", "null");
        } else {
            jSONObject.put("Ad Source Instance Name", str3);
        }
        String str4 = f1Var.f23216h;
        if (str4 == null) {
            jSONObject.put("Ad Source Instance ID", "null");
        } else {
            jSONObject.put("Ad Source Instance ID", str4);
        }
        JSONObject jSONObject2 = new JSONObject();
        Bundle bundle = f1Var.f23212d;
        for (String str5 : bundle.keySet()) {
            jSONObject2.put(str5, bundle.get(str5));
        }
        jSONObject.put("Credentials", jSONObject2);
        C2545a c2545a = this.f21349b;
        if (c2545a == null) {
            jSONObject.put("Ad Error", "null");
            return jSONObject;
        }
        jSONObject.put("Ad Error", c2545a.c());
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
