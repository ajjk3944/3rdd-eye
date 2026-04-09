package com.bytedance.sdk.openadsdk.sup.emc;

import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.core.mkp;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.rtt;
import com.bytedance.sdk.openadsdk.utils.iyl;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ul extends com.bytedance.sdk.component.emc.sba<JSONObject, JSONObject> {
    public static final HashSet<String> emc = new HashSet<>(Arrays.asList("closeWebview", "makeVisible", "getCurrentVisibleState"));
    private rie dg;
    private rtt xq;
    private com.bytedance.sdk.component.zz.ycc ypw;

    public ul(com.bytedance.sdk.component.zz.ycc yccVar, rtt rttVar, rie rieVar) {
        this.ypw = yccVar;
        this.xq = rttVar;
        this.dg = rieVar;
    }

    public static void emc(com.bytedance.sdk.component.emc.cf cfVar, com.bytedance.sdk.component.zz.ycc yccVar, rtt rttVar, rie rieVar) {
        cfVar.emc(emc, new ul(yccVar, rttVar, rieVar));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.bytedance.sdk.component.emc.dg
    public JSONObject emc(String str, JSONObject jSONObject, com.bytedance.sdk.component.emc.bw bwVar) throws Exception {
        JSONObject jSONObject2;
        jSONObject2 = new JSONObject();
        str.getClass();
        switch (str) {
            case "getCurrentVisibleState":
                rie rieVar = this.dg;
                if (rieVar != null) {
                    jSONObject2.put("visibleState", !mkp.emc(this.ypw, 20, rieVar.blf(), false) ? 1 : 0);
                }
                return jSONObject2;
            case "closeWebview":
                iyl.emc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.sup.emc.ul.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (ul.this.ypw != null) {
                            ul.this.ypw.setVisibility(8);
                            ViewGroup viewGroup = (ViewGroup) ul.this.ypw.getParent();
                            if (viewGroup != null) {
                                viewGroup.removeView(ul.this.ypw);
                            }
                        }
                    }
                });
                jSONObject2.put("success", true);
                return jSONObject2;
            case "makeVisible":
                if (this.ypw != null) {
                    jSONObject2.put("success", true);
                    iyl.emc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.sup.emc.ul.2
                        @Override // java.lang.Runnable
                        public void run() {
                            if (ul.this.ypw != null) {
                                ul.this.ypw.setVisibility(0);
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
