package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class db {
    private String dg = "Next Ad";
    private int emc;
    private int xq;
    private int ypw;

    public JSONObject bw() {
        JSONObject jSONObject = new JSONObject();
        try {
            int i10 = this.emc;
            if (i10 != -1) {
                jSONObject.put("endcard_show_time", i10);
            }
            jSONObject.put("is_allow_pause", this.ypw);
            jSONObject.put(CampaignEx.JSON_KEY_LANDING_TYPE, this.xq);
            if (!TextUtils.isEmpty(this.dg)) {
                jSONObject.put("endcard_next_ad_text", this.dg);
            }
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    public int dg() {
        return this.emc;
    }

    public int emc() {
        return this.xq;
    }

    public String xq() {
        return this.dg;
    }

    public int ypw() {
        return this.ypw;
    }

    public void emc(int i10) {
        this.xq = i10;
    }

    public void xq(int i10) {
        this.emc = i10;
    }

    public void ypw(int i10) {
        this.ypw = i10;
    }

    public void emc(String str) {
        this.dg = str;
    }

    public static db emc(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        db dbVar = new db();
        try {
            int iMax = Math.max(jSONObject.optInt("endcard_show_time", 0), 0);
            int iOptInt = jSONObject.optInt("is_allow_pause", 0);
            int iOptInt2 = jSONObject.optInt(CampaignEx.JSON_KEY_LANDING_TYPE, 0);
            String strOptString = jSONObject.optString("endcard_next_ad_text", "Next Ad");
            dbVar.xq(iMax);
            dbVar.ypw(iOptInt);
            dbVar.emc(strOptString);
            dbVar.emc(iOptInt2);
        } catch (Throwable unused) {
        }
        return dbVar;
    }
}
