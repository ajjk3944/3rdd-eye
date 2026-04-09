package com.bytedance.sdk.openadsdk.sup.emc;

import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.core.mkp;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.rtt;
import com.bytedance.sdk.openadsdk.utils.iyl;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class yzg extends com.bytedance.sdk.component.emc.dg<JSONObject, JSONObject> {
    private String dg;
    private com.bytedance.sdk.component.zz.ycc emc;
    private rie xq;
    private rtt ypw;

    public yzg(com.bytedance.sdk.component.zz.ycc yccVar, String str, rtt rttVar, rie rieVar) {
        this.emc = yccVar;
        this.dg = str;
        this.ypw = rttVar;
        this.xq = rieVar;
    }

    public static void emc(com.bytedance.sdk.component.emc.cf cfVar, com.bytedance.sdk.component.zz.ycc yccVar, rtt rttVar, rie rieVar) {
        cfVar.emc("closeWebview", new yzg(yccVar, "closeWebview", rttVar, rieVar));
        cfVar.emc("makeVisible", new yzg(yccVar, "makeVisible", rttVar, rieVar));
        cfVar.emc("getCurrentVisibleState", new yzg(yccVar, "getCurrentVisibleState", rttVar, rieVar));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.bytedance.sdk.component.emc.dg
    public JSONObject emc(String str, JSONObject jSONObject, com.bytedance.sdk.component.emc.bw bwVar) throws Exception {
        JSONObject jSONObject2;
        jSONObject2 = new JSONObject();
        String str2 = this.dg;
        str2.getClass();
        switch (str2) {
            case "getCurrentVisibleState":
                rie rieVar = this.xq;
                if (rieVar != null) {
                    jSONObject2.put("visibleState", !mkp.emc(this.emc, 20, rieVar.blf(), false) ? 1 : 0);
                }
                return jSONObject2;
            case "closeWebview":
                iyl.emc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.sup.emc.yzg.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (yzg.this.emc != null) {
                            yzg.this.emc.setVisibility(8);
                            ViewGroup viewGroup = (ViewGroup) yzg.this.emc.getParent();
                            if (viewGroup != null) {
                                viewGroup.removeView(yzg.this.emc);
                            }
                        }
                    }
                });
                jSONObject2.put("success", true);
                return jSONObject2;
            case "makeVisible":
                if (this.emc != null) {
                    jSONObject2.put("success", true);
                    iyl.emc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.sup.emc.yzg.2
                        @Override // java.lang.Runnable
                        public void run() {
                            if (yzg.this.emc != null) {
                                yzg.this.emc.setVisibility(0);
                            }
                        }
                    });
                    return jSONObject2;
                }
                jSONObject2.put("success", false);
                return jSONObject2;
            default:
                return jSONObject2;
        }
    }
}
