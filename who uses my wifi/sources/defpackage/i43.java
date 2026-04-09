package defpackage;

import android.os.Bundle;
import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class i43 implements n53 {
    public final JSONObject a;
    public final JSONObject b;

    public i43(JSONObject jSONObject, JSONObject jSONObject2) {
        this.a = jSONObject;
        this.b = jSONObject2;
    }

    @Override // defpackage.n53
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        Bundle bundle = ((jm2) obj).a;
        JSONObject jSONObject = this.a;
        if (jSONObject != null) {
            bundle.putString("fwd_cld", jSONObject.toString());
        }
        JSONObject jSONObject2 = this.b;
        if (jSONObject2 != null) {
            bundle.putString("fwd_common_cld", jSONObject2.toString());
        }
    }

    @Override // defpackage.n53
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        jm2 jm2Var = (jm2) obj;
        JSONObject jSONObject = this.b;
        if (jSONObject != null) {
            jm2Var.b.putString("fwd_common_cld", jSONObject.toString());
        }
    }
}
