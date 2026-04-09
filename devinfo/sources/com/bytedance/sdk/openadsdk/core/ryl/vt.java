package com.bytedance.sdk.openadsdk.core.ryl;

import com.bytedance.sdk.openadsdk.core.ryl.lh.ouw;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class vt extends lh {
    private long mwh;
    private long ryl;

    public vt(int i4, int i10, long j, long j8, ouw.EnumC0095ouw enumC0095ouw, ouw.vt vtVar, String str, List<com.bytedance.sdk.openadsdk.core.ryl.vt.lh> list, List<com.bytedance.sdk.openadsdk.core.ryl.vt.lh> list2, String str2) {
        super(i4, i10, enumC0095ouw, vtVar, str, list, list2, str2);
        this.ryl = j;
        this.mwh = j8;
        this.tlj = "icon_click";
    }

    @Override // com.bytedance.sdk.openadsdk.core.ryl.lh
    public final JSONObject ouw() throws JSONException {
        JSONObject jSONObjectOuw = super.ouw();
        if (jSONObjectOuw != null) {
            jSONObjectOuw.put("offset", this.ryl);
            jSONObjectOuw.put("duration", this.mwh);
        }
        return jSONObjectOuw;
    }

    public static vt ouw(JSONObject jSONObject) {
        lh lhVarVt = lh.vt(jSONObject);
        if (lhVarVt == null) {
            return null;
        }
        return new vt(lhVarVt.ouw, lhVarVt.vt, jSONObject.optLong("offset", -1L), jSONObject.optLong("duration", -1L), lhVarVt.f8399lh, lhVarVt.yu, lhVarVt.fkw, lhVarVt.f8398le, lhVarVt.ra, lhVarVt.pno);
    }
}
