package defpackage;

import android.util.JsonReader;
import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class e83 {
    public final String a;
    public final String b;
    public final JSONObject c;
    public final JSONObject d;

    public e83(JsonReader jsonReader) {
        JSONObject jSONObjectN = bd2.N(jsonReader);
        this.d = jSONObjectN;
        this.a = jSONObjectN.optString("ad_html", null);
        this.b = jSONObjectN.optString("ad_base_url", null);
        this.c = jSONObjectN.optJSONObject("ad_json");
    }
}
