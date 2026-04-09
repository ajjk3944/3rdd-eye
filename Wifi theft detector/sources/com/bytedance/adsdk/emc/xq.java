package com.bytedance.adsdk.emc;

import com.bytedance.adsdk.ugeno.xq.emc;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class xq implements com.bytedance.adsdk.ugeno.xq.emc {

    public static class emc implements emc.InterfaceC0098emc {
        private com.bytedance.adsdk.emc.ypw.emc emc;
        private String ypw;

        private emc(String str) {
            this.ypw = str;
            this.emc = com.bytedance.adsdk.emc.ypw.emc.emc(str);
        }

        public static emc emc(String str) {
            return new emc(str);
        }

        @Override // com.bytedance.adsdk.ugeno.xq.emc.InterfaceC0098emc
        public Object emc(JSONObject jSONObject) {
            com.bytedance.adsdk.emc.ypw.emc emcVar = this.emc;
            if (emcVar == null) {
                return this.ypw;
            }
            Object objEmc = emcVar.emc(jSONObject);
            if (objEmc instanceof String) {
                return objEmc;
            }
            if (objEmc instanceof com.bytedance.adsdk.emc.ypw.emc.emc) {
                return String.valueOf(vk.emc((com.bytedance.adsdk.emc.ypw.emc.emc) objEmc));
            }
            if (objEmc == null || !objEmc.getClass().isArray()) {
                return String.valueOf(objEmc);
            }
            try {
                return new JSONArray(objEmc).toString();
            } catch (JSONException unused) {
                return String.valueOf(objEmc);
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.xq.emc
    public emc.InterfaceC0098emc emc(String str) {
        return emc.emc(str);
    }
}
