package com.bytedance.sdk.component.adexpress.dynamic.bw;

import com.bytedance.sdk.component.adexpress.ypw.sz;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class uym implements msw {
    private com.bytedance.sdk.component.adexpress.dynamic.ycc.ypw emc;

    /* JADX INFO: Access modifiers changed from: private */
    public void ypw(sz szVar) {
        try {
            JSONObject jSONObjectXq = szVar.xq();
            JSONObject jSONObject = new JSONObject(jSONObjectXq.optString("template_Plugin"));
            JSONObject jSONObjectOptJSONObject = jSONObjectXq.optJSONObject("creative");
            com.bytedance.sdk.component.adexpress.dynamic.dg.msw mswVarEmc = new ycc(jSONObject, jSONObjectOptJSONObject, jSONObjectXq.optJSONObject("AdSize"), new JSONObject(jSONObjectXq.optString("diff_template_Plugin"))).emc(szVar.ypw(), szVar.ru(), jSONObjectOptJSONObject.optDouble("score_exact_i18n"), jSONObjectOptJSONObject.optString("comment_num_i18n"), szVar);
            try {
                JSONObject jSONObject2 = new JSONObject(jSONObjectOptJSONObject.optString("dynamic_creative"));
                mswVarEmc.emc(jSONObject2.optString(TtmlNode.ATTR_TTS_COLOR));
                mswVarEmc.emc(jSONObject2.optJSONArray("material_center"));
            } catch (Throwable unused) {
            }
            this.emc.emc(mswVarEmc);
        } catch (Exception unused2) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.bw.msw
    public void emc(com.bytedance.sdk.component.adexpress.dynamic.ycc.ypw ypwVar) {
        this.emc = ypwVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.bw.msw
    public void emc(final sz szVar) {
        if (szVar.sup() == 1) {
            ypw(szVar);
        } else {
            com.bytedance.sdk.component.adexpress.dg.dg.emc(new com.bytedance.sdk.component.msw.msw("dynamicparse") { // from class: com.bytedance.sdk.component.adexpress.dynamic.bw.uym.1
                @Override // java.lang.Runnable
                public void run() {
                    uym.this.ypw(szVar);
                }
            }, 5);
        }
    }
}
