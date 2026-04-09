package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class aa {
    private emc emc;
    private emc ypw;

    public aa(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("easy_playable");
        if (jSONObjectOptJSONObject != null) {
            this.emc = new emc(jSONObjectOptJSONObject.optJSONObject("components"));
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("popup");
        if (jSONObjectOptJSONObject2 != null) {
            this.ypw = new emc(jSONObjectOptJSONObject2.optJSONObject("components"));
        }
    }

    public static boolean emc(rie rieVar) {
        return emc(rieVar, false);
    }

    public static emc xq(rie rieVar) {
        aa aaVarHm;
        if (rieVar == null || (aaVarHm = rieVar.hm()) == null) {
            return null;
        }
        return aaVarHm.emc;
    }

    public static emc ypw(rie rieVar) {
        aa aaVarHm;
        if (rieVar == null || (aaVarHm = rieVar.hm()) == null) {
            return null;
        }
        return aaVarHm.ypw;
    }

    public static class emc {
        C0066emc emc;
        C0066emc ypw;

        /* renamed from: com.bytedance.sdk.openadsdk.core.model.aa$emc$emc, reason: collision with other inner class name */
        public static class C0066emc {
            String emc;

            public C0066emc(JSONObject jSONObject) {
                if (jSONObject == null) {
                    return;
                }
                this.emc = jSONObject.optString("entry");
            }

            public boolean emc() {
                return !TextUtils.isEmpty(this.emc);
            }
        }

        public emc(JSONObject jSONObject) {
            if (jSONObject == null) {
                return;
            }
            if (jSONObject.has("vertical")) {
                this.emc = new C0066emc(jSONObject.optJSONObject("vertical"));
            }
            if (jSONObject.has("horizontal")) {
                this.ypw = new C0066emc(jSONObject.optJSONObject("horizontal"));
            }
        }

        public boolean emc() {
            C0066emc c0066emc = this.ypw;
            if (c0066emc != null && c0066emc.emc()) {
                return true;
            }
            C0066emc c0066emc2 = this.emc;
            return c0066emc2 != null && c0066emc2.emc();
        }

        public String emc(boolean z6) {
            if (z6) {
                C0066emc c0066emc = this.emc;
                if (c0066emc != null) {
                    return c0066emc.emc;
                }
                return "";
            }
            C0066emc c0066emc2 = this.ypw;
            if (c0066emc2 != null) {
                return c0066emc2.emc;
            }
            return "";
        }
    }

    public static boolean emc(rie rieVar, boolean z6) {
        aa aaVarHm;
        if (rieVar == null || (aaVarHm = rieVar.hm()) == null) {
            return false;
        }
        if (z6) {
            emc emcVar = aaVarHm.ypw;
            return emcVar != null && emcVar.emc();
        }
        emc emcVar2 = aaVarHm.emc;
        return emcVar2 != null && emcVar2.emc();
    }
}
