package j2;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: j2.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2556l extends C2545a {

    /* renamed from: f, reason: collision with root package name */
    public final q f21351f;

    public C2556l(int i, String str, String str2, C2545a c2545a, q qVar) {
        super(i, str, str2, c2545a);
        this.f21351f = qVar;
    }

    @Override // j2.C2545a
    public final JSONObject c() throws JSONException {
        JSONObject jSONObjectC = super.c();
        q qVar = this.f21351f;
        if (qVar == null) {
            jSONObjectC.put("Response Info", "null");
            return jSONObjectC;
        }
        jSONObjectC.put("Response Info", qVar.a());
        return jSONObjectC;
    }

    @Override // j2.C2545a
    public final String toString() {
        try {
            return c().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
