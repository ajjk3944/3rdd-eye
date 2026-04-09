package com.bytedance.sdk.openadsdk.dg.emc;

import android.text.TextUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ru implements com.bytedance.sdk.openadsdk.vk.ypw {
    private final com.bytedance.sdk.component.ycc.emc.ycc.dg emc;
    private final boolean ypw;

    public ru(boolean z6, com.bytedance.sdk.component.ycc.emc.ycc.dg dgVar) {
        this.emc = dgVar;
        this.ypw = z6;
    }

    @Override // com.bytedance.sdk.openadsdk.vk.ypw
    public com.bytedance.sdk.openadsdk.vk.emc.xq emc() throws JSONException {
        if (this.emc == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("success", this.ypw);
        jSONObject.put("url", this.emc.ypw());
        int iDg = this.emc.dg();
        if (iDg <= 0) {
            iDg = 0;
        }
        jSONObject.put("retry_times", iDg);
        jSONObject.put("ad_id", this.emc.ycc());
        jSONObject.put("track_type", this.emc.bw());
        jSONObject.put("upload_scene", this.ypw ? this.emc.ru() ? 3 : this.emc.dg() <= 0 ? 1 : 2 : 4);
        String strUym = this.emc.uym();
        if (!TextUtils.isEmpty(strUym)) {
            JSONArray jSONArray = new JSONArray();
            for (String str : strUym.split(",")) {
                jSONArray.put(str);
            }
            jSONObject.put("error_code", jSONArray);
        }
        String strZz = this.emc.zz();
        if (!TextUtils.isEmpty(strZz)) {
            JSONArray jSONArray2 = new JSONArray();
            for (String str2 : strZz.split(",")) {
                jSONArray2.put(str2);
            }
            jSONObject.put("error_msg", jSONArray2);
        }
        return com.bytedance.sdk.openadsdk.vk.emc.dg.ypw().emc("track_link_result").ypw(jSONObject.toString());
    }
}
