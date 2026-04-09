package com.bytedance.sdk.openadsdk.sup.emc;

import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class sz extends com.bytedance.sdk.component.emc.dg<JSONObject, JSONObject> {
    private WeakReference<com.bytedance.sdk.component.zz.ycc> emc;

    public sz(com.bytedance.sdk.component.zz.ycc yccVar) {
        this.emc = new WeakReference<>(yccVar);
    }

    public static void emc(com.bytedance.sdk.component.emc.cf cfVar, com.bytedance.sdk.component.zz.ycc yccVar) {
        cfVar.emc("preventTouchEvent", new sz(yccVar));
    }

    @Override // com.bytedance.sdk.component.emc.dg
    public JSONObject emc(String str, JSONObject jSONObject, com.bytedance.sdk.component.emc.bw bwVar) throws Exception {
        JSONObject jSONObject2 = new JSONObject();
        try {
            boolean zOptBoolean = jSONObject.optBoolean("isPrevent", false);
            com.bytedance.sdk.component.zz.ycc yccVar = this.emc.get();
            if (yccVar != null) {
                yccVar.setIsPreventTouchEvent(zOptBoolean);
                jSONObject2.put("success", true);
                return jSONObject2;
            }
            jSONObject2.put("success", false);
            return jSONObject2;
        } catch (Throwable unused) {
            jSONObject2.put("success", false);
            return jSONObject2;
        }
    }
}
