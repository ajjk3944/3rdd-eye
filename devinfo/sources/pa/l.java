package pa;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class l extends a {

    /* renamed from: e, reason: collision with root package name */
    public final q f31540e;

    public l(int i4, String str, String str2, a aVar, q qVar) {
        super(i4, str, str2, aVar);
        this.f31540e = qVar;
    }

    @Override // pa.a
    public final JSONObject b() throws JSONException {
        JSONObject jSONObjectB = super.b();
        q qVar = this.f31540e;
        if (qVar == null) {
            jSONObjectB.put("Response Info", "null");
            return jSONObjectB;
        }
        jSONObjectB.put("Response Info", qVar.a());
        return jSONObjectB;
    }

    @Override // pa.a
    public final String toString() {
        try {
            return b().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
