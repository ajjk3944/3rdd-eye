package com.google.android.gms.internal.ads;

import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class tq implements z21 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16919a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16920b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f16921c;

    public /* synthetic */ tq(int i4, Object obj, Object obj2) {
        this.f16919a = i4;
        this.f16920b = obj;
        this.f16921c = obj2;
    }

    @Override // com.google.android.gms.internal.ads.z21
    public final /* synthetic */ Object apply(Object obj) {
        switch (this.f16919a) {
            case 0:
                jq jqVar = (jq) obj;
                jqVar.b((String) this.f16920b, (oo) this.f16921c);
                return jqVar;
            default:
                nb0 nb0Var = (nb0) this.f16920b;
                JSONObject jSONObject = (JSONObject) this.f16921c;
                List list = (List) obj;
                nb0Var.getClass();
                if (list == null || list.isEmpty()) {
                    return null;
                }
                String strOptString = jSONObject.optString("text");
                Integer numC = nb0.c("bg_color", jSONObject);
                Integer numC2 = nb0.c("text_color", jSONObject);
                int iOptInt = jSONObject.optInt("text_size", -1);
                jSONObject.optBoolean("allow_pub_rendering");
                int iOptInt2 = jSONObject.optInt("animation_ms", 1000);
                return new mm(strOptString, list, numC, numC2, iOptInt > 0 ? Integer.valueOf(iOptInt) : null, jSONObject.optInt("presentation_ms", 4000) + iOptInt2, nb0Var.f14226h.f15369e);
        }
    }
}
