package com.bytedance.sdk.openadsdk.sup.emc;

import com.bytedance.sdk.openadsdk.core.rtt;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class sup extends com.bytedance.sdk.component.emc.sba<JSONObject, JSONObject> {
    private static final HashSet<String> emc = new HashSet<>(Arrays.asList("popupShow", "popupDismiss", "changeCountdownStatus", "getCurrentCountdownStatus", "popupRenderDidFinish"));
    private final rtt ypw;

    public sup(rtt rttVar) {
        this.ypw = rttVar;
    }

    public static void emc(com.bytedance.sdk.component.emc.cf cfVar, rtt rttVar) {
        cfVar.emc(emc, new sup(rttVar));
    }

    @Override // com.bytedance.sdk.component.emc.dg
    public JSONObject emc(String str, JSONObject jSONObject, com.bytedance.sdk.component.emc.bw bwVar) throws Exception {
        str.getClass();
        switch (str) {
            case "popupDismiss":
                this.ypw.vk();
                break;
            case "popupShow":
                this.ypw.cf();
                break;
            case "popupRenderDidFinish":
                this.ypw.sba();
                break;
            case "changeCountdownStatus":
                this.ypw.gbl(jSONObject);
                break;
        }
        return null;
    }
}
