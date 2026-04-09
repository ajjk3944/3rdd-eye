package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class g63 implements n53 {
    public final String a;
    public final String b;

    public g63(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.n53
    public final /* bridge */ /* synthetic */ void c(Object obj) throws JSONException {
        try {
            JSONObject jSONObjectU = bd2.U("pii", (JSONObject) obj);
            jSONObjectU.put("doritos", this.a);
            jSONObjectU.put("doritos_v2", this.b);
        } catch (JSONException unused) {
            gi2.G("Failed putting doritos string.");
        }
    }
}
