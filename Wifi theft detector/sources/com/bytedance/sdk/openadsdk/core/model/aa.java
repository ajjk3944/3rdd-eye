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
        C0151emc emc;
        C0151emc ypw;

        /* renamed from: com.bytedance.sdk.openadsdk.core.model.aa$emc$emc, reason: collision with other inner class name */
        public static class C0151emc {
            String emc;

            public C0151emc(JSONObject jSONObject) {
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
                this.emc = new C0151emc(jSONObject.optJSONObject("vertical"));
            }
            if (jSONObject.has("horizontal")) {
                this.ypw = new C0151emc(jSONObject.optJSONObject("horizontal"));
            }
        }

        public boolean emc() {
            C0151emc c0151emc = this.ypw;
            if (c0151emc != null && c0151emc.emc()) {
                return true;
            }
            C0151emc c0151emc2 = this.emc;
            return c0151emc2 != null && c0151emc2.emc();
        }

        public String emc(boolean z10) {
            if (z10) {
                C0151emc c0151emc = this.emc;
                if (c0151emc != null) {
                    return c0151emc.emc;
                }
                return "";
            }
            C0151emc c0151emc2 = this.ypw;
            if (c0151emc2 != null) {
                return c0151emc2.emc;
            }
            return "";
        }
    }

    public static boolean emc(rie rieVar, boolean z10) {
        aa aaVarHm;
        if (rieVar == null || (aaVarHm = rieVar.hm()) == null) {
            return false;
        }
        if (z10) {
            emc emcVar = aaVarHm.ypw;
            return emcVar != null && emcVar.emc();
        }
        emc emcVar2 = aaVarHm.emc;
        return emcVar2 != null && emcVar2.emc();
    }
}
