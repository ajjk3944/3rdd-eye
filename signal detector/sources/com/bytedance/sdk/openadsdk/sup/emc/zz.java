package com.bytedance.sdk.openadsdk.sup.emc;

import com.bytedance.sdk.openadsdk.core.rtt;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class zz extends com.bytedance.sdk.component.emc.dg<JSONObject, JSONObject> {
    private final rtt emc;
    private String ypw;

    public zz(rtt rttVar, String str) {
        this.emc = rttVar;
        this.ypw = str;
    }

    public static void emc(com.bytedance.sdk.component.emc.cf cfVar, rtt rttVar) {
        cfVar.emc("endcardDynamicCreatives", new zz(rttVar, "endcardDynamicCreatives"));
        cfVar.emc("multiOpenCovert", new zz(rttVar, "multiOpenCovert"));
        cfVar.emc("skipToNextAd", new zz(rttVar, "skipToNextAd"));
        cfVar.emc("speedVideoOrTimer", new zz(rttVar, "speedVideoOrTimer"));
        cfVar.emc("openPlayable", new zz(rttVar, "openPlayable"));
    }

    @Override // com.bytedance.sdk.component.emc.dg
    public JSONObject emc(String str, JSONObject jSONObject, com.bytedance.sdk.component.emc.bw bwVar) {
        if ("endcardDynamicCreatives".equals(this.ypw)) {
            return this.emc.zz(jSONObject);
        }
        if ("multiOpenCovert".equals(this.ypw)) {
            this.emc.ru(jSONObject);
            return null;
        }
        if ("skipToNextAd".equals(this.ypw)) {
            this.emc.emc(jSONObject, this.ypw);
            return null;
        }
        if ("speedVideoOrTimer".equals(this.ypw)) {
            return this.emc.msw(jSONObject);
        }
        if ("openPlayable".equals(this.ypw)) {
            return this.emc.uym(jSONObject);
        }
        return null;
    }
}
