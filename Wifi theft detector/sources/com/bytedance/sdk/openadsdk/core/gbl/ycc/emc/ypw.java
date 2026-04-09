package com.bytedance.sdk.openadsdk.core.gbl.ycc.emc;

import com.bytedance.sdk.openadsdk.core.model.rie;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class ypw {
    protected rie emc;

    public static class emc {
        public static ypw emc(rie rieVar, com.bytedance.sdk.openadsdk.core.gbl.ycc.emc emcVar) {
            if (rieVar == null) {
                return null;
            }
            int iBlf = rieVar.blf();
            if (iBlf == 1) {
                return new com.bytedance.sdk.openadsdk.core.gbl.ycc.emc.emc(rieVar, emcVar);
            }
            if (iBlf == 7 || iBlf == 8) {
                return new xq(rieVar, emcVar);
            }
            return null;
        }
    }

    public ypw(rie rieVar) {
        this.emc = rieVar;
    }

    public abstract String emc();

    public void emc(JSONObject jSONObject) {
    }

    public abstract JSONObject ypw();
}
