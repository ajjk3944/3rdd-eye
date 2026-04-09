package com.bytedance.sdk.openadsdk.sup.emc;

import com.bytedance.sdk.openadsdk.core.rtt;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ru extends com.bytedance.sdk.component.emc.sba<JSONObject, JSONObject> {
    public static final HashSet<String> emc = new HashSet<>(Arrays.asList("endcardDynamicCreatives", "multiOpenCovert", "speedVideoOrTimer", "openPlayable", "skipToNextAd"));
    private final rtt ypw;

    public ru(rtt rttVar) {
        this.ypw = rttVar;
    }

    public static void emc(com.bytedance.sdk.component.emc.cf cfVar, rtt rttVar) {
        cfVar.emc(emc, new ru(rttVar));
    }

    @Override // com.bytedance.sdk.component.emc.dg
    public JSONObject emc(String str, JSONObject jSONObject, com.bytedance.sdk.component.emc.bw bwVar) throws Exception {
        if ("endcardDynamicCreatives".equals(str)) {
            return this.ypw.zz(jSONObject);
        }
        if ("multiOpenCovert".equals(str)) {
            this.ypw.ru(jSONObject);
            return null;
        }
        if ("skipToNextAd".equals(str)) {
            this.ypw.emc(jSONObject, str);
            return null;
        }
        if ("speedVideoOrTimer".equals(str)) {
            return this.ypw.msw(jSONObject);
        }
        if ("openPlayable".equals(str)) {
            return this.ypw.uym(jSONObject);
        }
        return null;
    }
}
