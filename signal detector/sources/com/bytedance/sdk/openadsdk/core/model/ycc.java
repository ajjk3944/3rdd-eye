package com.bytedance.sdk.openadsdk.core.model;

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
            jSONObject.put("app_size", ycc());
            jSONObject.put("comment_num", bw());
            jSONObject.put("download_url", emc());
            jSONObject.put("package_name", xq());
            jSONObject.put("score", dg());
            jSONObject.put("app_category", uym());
            return jSONObject;
        } catch (Exception e6) {
            com.bytedance.sdk.component.utils.ul.xq(e6.toString(), new Object[0]);
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

    public void emc(double d6) {
        if (d6 >= 1.0d && d6 <= 5.0d) {
            this.bw = d6;
        } else {
            this.bw = -1.0d;
        }
    }

    public void ypw(int i) {
        this.uym = i;
    }

    public void emc(int i) {
        if (i <= 0) {
            this.ycc = -1;
        } else {
            this.ycc = i;
        }
    }
}
