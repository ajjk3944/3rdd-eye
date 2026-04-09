package pa;

import org.json.JSONException;
import org.json.JSONObject;
import va.w1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f31511a;

    /* renamed from: b, reason: collision with root package name */
    public final String f31512b;

    /* renamed from: c, reason: collision with root package name */
    public final String f31513c;

    /* renamed from: d, reason: collision with root package name */
    public final a f31514d;

    public a(int i4, String str, String str2, a aVar) {
        this.f31511a = i4;
        this.f31512b = str;
        this.f31513c = str2;
        this.f31514d = aVar;
    }

    public final w1 a() {
        w1 w1Var;
        a aVar = this.f31514d;
        if (aVar == null) {
            w1Var = null;
        } else {
            w1Var = new w1(aVar.f31511a, aVar.f31512b, aVar.f31513c, null, null);
        }
        return new w1(this.f31511a, this.f31512b, this.f31513c, w1Var, null);
    }

    public JSONObject b() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Code", this.f31511a);
        jSONObject.put("Message", this.f31512b);
        jSONObject.put("Domain", this.f31513c);
        a aVar = this.f31514d;
        if (aVar == null) {
            jSONObject.put("Cause", "null");
            return jSONObject;
        }
        jSONObject.put("Cause", aVar.b());
        return jSONObject;
    }

    public String toString() {
        try {
            return b().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
