package com.bytedance.sdk.openadsdk.core.model;

import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ycc {
    private int uym;
    private String emc = "";
    private String ypw = "";
    private String xq = "";
    private String dg = "";
    private double bw = -1.0d;
    private int ycc = -1;

    public int bw() {
        return this.ycc;
    }

    public double dg() {
        return this.bw;
    }

    public String emc() {
        return this.emc;
    }

    public JSONObject msw() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("app_name", ypw());
            jSONObject.put(CampaignEx.JSON_KEY_APP_SIZE, ycc());
            jSONObject.put("comment_num", bw());
            jSONObject.put(DownloadModel.DOWNLOAD_URL, emc());
            jSONObject.put(CampaignEx.JSON_KEY_PACKAGE_NAME, xq());
            jSONObject.put("score", dg());
            jSONObject.put("app_category", uym());
            return jSONObject;
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.ul.xq(e10.toString(), new Object[0]);
            return jSONObject;
        }
    }

    public String uym() {
        return this.dg;
    }

    public String xq() {
        return this.xq;
    }

    public int ycc() {
        return this.uym;
    }

    public String ypw() {
        return this.ypw;
    }

    public void dg(String str) {
        this.dg = str;
    }

    public void emc(String str) {
        this.emc = str;
    }

    public void xq(String str) {
        this.xq = str;
    }

    public void ypw(String str) {
        this.ypw = str;
    }

    public void emc(double d10) {
        if (d10 >= 1.0d && d10 <= 5.0d) {
            this.bw = d10;
        } else {
            this.bw = -1.0d;
        }
    }

    public void ypw(int i10) {
        this.uym = i10;
    }

    public void emc(int i10) {
        if (i10 <= 0) {
            this.ycc = -1;
        } else {
            this.ycc = i10;
        }
    }
}
