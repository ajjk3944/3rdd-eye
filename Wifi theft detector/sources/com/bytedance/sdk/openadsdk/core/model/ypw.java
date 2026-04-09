package com.bytedance.sdk.openadsdk.core.model;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ypw {
    private boolean bw;
    private String dg;
    private String emc;
    private String xq;
    private String ypw;

    public boolean bw() {
        return this.bw;
    }

    public String dg() {
        return this.dg;
    }

    public void emc(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.emc = jSONObject.optString(RewardPlus.ICON);
        this.ypw = jSONObject.optString(MimeTypes.BASE_TYPE_TEXT);
        this.xq = jSONObject.optString(CampaignEx.JSON_KEY_PRIVACY_URL);
        this.dg = jSONObject.optString("privacy_title");
    }

    public String xq() {
        return this.xq;
    }

    public JSONObject ycc() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(CampaignEx.JSON_KEY_PRIVACY_URL, this.xq);
            jSONObject.put("privacy_title", this.dg);
            jSONObject.put(MimeTypes.BASE_TYPE_TEXT, this.ypw);
            jSONObject.put(RewardPlus.ICON, this.emc);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public String ypw() {
        return this.ypw;
    }

    public String emc() {
        return this.emc;
    }

    public void emc(boolean z10) {
        this.bw = z10;
    }
}
