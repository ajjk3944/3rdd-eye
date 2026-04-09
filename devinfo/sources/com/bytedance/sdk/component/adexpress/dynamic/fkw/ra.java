package com.bytedance.sdk.component.adexpress.dynamic.fkw;

import com.bytedance.sdk.component.adexpress.vt.mwh;
import com.bytedance.sdk.component.utils.ko;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ra implements pno {
    private com.bytedance.sdk.component.adexpress.dynamic.le.vt ouw;

    @Override // com.bytedance.sdk.component.adexpress.dynamic.fkw.pno
    public final void ouw(com.bytedance.sdk.component.adexpress.dynamic.le.vt vtVar) {
        this.ouw = vtVar;
    }

    public final void vt(mwh mwhVar) {
        try {
            JSONObject jSONObjectOuw = mwhVar.ouw();
            JSONObject jSONObject = new JSONObject(jSONObjectOuw.optString("template_Plugin"));
            JSONObject jSONObjectOptJSONObject = jSONObjectOuw.optJSONObject("creative");
            com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVarOuw = new le(jSONObject, jSONObjectOptJSONObject, jSONObjectOuw.optJSONObject("AdSize"), new JSONObject(jSONObjectOuw.optString("diff_template_Plugin"))).ouw(mwhVar.rn, mwhVar.f7398le, jSONObjectOptJSONObject.optDouble("score_exact_i18n"), jSONObjectOptJSONObject.optString("comment_num_i18n"), mwhVar);
            try {
                JSONObject jSONObject2 = new JSONObject(jSONObjectOptJSONObject.optString("dynamic_creative"));
                pnoVarOuw.mwh = jSONObject2.optString("color");
                pnoVarOuw.ouw(jSONObject2.optJSONArray("material_center"));
            } catch (Throwable unused) {
            }
            this.ouw.ouw(pnoVarOuw);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.fkw.pno
    public final void ouw(final mwh mwhVar) {
        if (mwhVar.pno != 1) {
            com.bytedance.sdk.component.adexpress.yu.yu.ouw(new com.bytedance.sdk.component.pno.pno("dynamicparse") { // from class: com.bytedance.sdk.component.adexpress.dynamic.fkw.ra.1
                @Override // java.lang.Runnable
                public final void run() {
                    ko.vt("DynamicNativeParser", "parse on non ui thread");
                    ra.this.vt(mwhVar);
                }
            }, 5);
        } else {
            ko.vt("DynamicNativeParser", "parse on ui thread");
            vt(mwhVar);
        }
    }
}
