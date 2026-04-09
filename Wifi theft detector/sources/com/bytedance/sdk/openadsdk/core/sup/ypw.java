package com.bytedance.sdk.openadsdk.core.sup;

import com.bytedance.sdk.openadsdk.core.sup.xq.emc;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ypw extends xq {
    private long gbl;
    private long ru;

    public ypw(int i10, int i11, long j10, long j11, emc.EnumC0157emc enumC0157emc, emc.ypw ypwVar, String str, List<com.bytedance.sdk.openadsdk.core.sup.ypw.xq> list, List<com.bytedance.sdk.openadsdk.core.sup.ypw.xq> list2, String str2) {
        super(i10, i11, enumC0157emc, ypwVar, str, list, list2, str2);
        this.ru = j10;
        this.gbl = j11;
        this.zz = "icon_click";
    }

    @Override // com.bytedance.sdk.openadsdk.core.sup.xq
    public JSONObject emc() throws JSONException {
        JSONObject jSONObjectEmc = super.emc();
        if (jSONObjectEmc != null) {
            jSONObjectEmc.put("offset", this.ru);
            jSONObjectEmc.put("duration", this.gbl);
        }
        return jSONObjectEmc;
    }

    public static ypw emc(JSONObject jSONObject) {
        xq xqVarYpw = xq.ypw(jSONObject);
        if (xqVarYpw == null) {
            return null;
        }
        return new ypw(xqVarYpw.emc, xqVarYpw.ypw, jSONObject.optLong("offset", -1L), jSONObject.optLong("duration", -1L), xqVarYpw.xq, xqVarYpw.dg, xqVarYpw.bw, xqVarYpw.ycc, xqVarYpw.uym, xqVarYpw.msw);
    }
}
