package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class u70 extends r2 {
    public final hq0 k;

    public u70(int i, String str, String str2, r2 r2Var, hq0 hq0Var) {
        super(i, str, str2, r2Var);
        this.k = hq0Var;
    }

    @Override // defpackage.r2
    public final JSONObject g() throws JSONException {
        JSONObject jSONObjectG = super.g();
        hq0 hq0Var = this.k;
        if (hq0Var == null) {
            jSONObjectG.put("Response Info", "null");
            return jSONObjectG;
        }
        jSONObjectG.put("Response Info", hq0Var.a());
        return jSONObjectG;
    }

    @Override // defpackage.r2
    public final String toString() {
        try {
            return g().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
