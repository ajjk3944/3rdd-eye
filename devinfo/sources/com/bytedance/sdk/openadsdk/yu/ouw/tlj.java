package com.bytedance.sdk.openadsdk.yu.ouw;

import android.text.TextUtils;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class tlj implements com.bytedance.sdk.openadsdk.rn.vt {
    private final com.bytedance.sdk.component.le.ouw.le.yu ouw;
    private final boolean vt;

    public tlj(boolean z3, com.bytedance.sdk.component.le.ouw.le.yu yuVar) {
        this.ouw = yuVar;
        this.vt = z3;
    }

    @Override // com.bytedance.sdk.openadsdk.rn.vt
    public final com.bytedance.sdk.openadsdk.rn.ouw.lh ouw() throws Exception {
        int i4;
        if (this.ouw == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("success", this.vt);
        jSONObject.put("url", this.ouw.vt);
        int i10 = this.ouw.yu;
        if (i10 <= 0) {
            i10 = 0;
        }
        jSONObject.put("retry_times", i10);
        jSONObject.put("ad_id", this.ouw.f7529le);
        jSONObject.put("track_type", this.ouw.fkw);
        if (this.vt) {
            com.bytedance.sdk.component.le.ouw.le.yu yuVar = this.ouw;
            i4 = yuVar.f7528cf ? 3 : yuVar.yu <= 0 ? 1 : 2;
        } else {
            i4 = 4;
        }
        jSONObject.put("upload_scene", i4);
        String str = this.ouw.ra;
        if (!TextUtils.isEmpty(str)) {
            JSONArray jSONArray = new JSONArray();
            for (String str2 : str.split(",")) {
                jSONArray.put(str2);
            }
            jSONObject.put("error_code", jSONArray);
        }
        String str3 = this.ouw.pno;
        if (!TextUtils.isEmpty(str3)) {
            JSONArray jSONArray2 = new JSONArray();
            for (String str4 : str3.split(",")) {
                jSONArray2.put(str4);
            }
            jSONObject.put("error_msg", jSONArray2);
        }
        com.bytedance.sdk.openadsdk.rn.ouw.yu yuVar2 = new com.bytedance.sdk.openadsdk.rn.ouw.yu();
        yuVar2.ouw = "track_link_result";
        yuVar2.bly = jSONObject.toString();
        return yuVar2;
    }
}
