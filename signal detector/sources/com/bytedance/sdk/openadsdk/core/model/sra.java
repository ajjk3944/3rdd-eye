package com.bytedance.sdk.openadsdk.core.model;

import com.bytedance.sdk.openadsdk.api.PAGErrorCode;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class sra {
    private String emc = "horizontal";
    private int ypw = 1;
    private int xq = 1;
    private int dg = 0;
    private int bw = 0;
    private int ycc = 0;
    private int uym = 0;
    private int msw = PAGErrorCode.LOAD_FACTORY_NULL_CODE;
    private int zz = 500;
    private int ru = 0;

    public int bw() {
        return this.bw;
    }

    public int dg() {
        return this.dg;
    }

    public String emc() {
        return this.emc;
    }

    public JSONObject gbl() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("direction", this.emc);
            jSONObject.put("auto_loop", this.ypw);
            jSONObject.put("allow_manual_loop", this.xq);
            jSONObject.put("unlimited_loop", this.dg);
            jSONObject.put("left_margin", this.bw);
            jSONObject.put("right_margin", this.ycc);
            jSONObject.put("ad_margin", this.uym);
            jSONObject.put("loop_interval_time", this.msw);
            jSONObject.put("flip_speed", this.zz);
            jSONObject.put("stop_auto_loop", this.ru);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public int msw() {
        return this.msw;
    }

    public int ru() {
        return this.ru;
    }

    public int uym() {
        return this.uym;
    }

    public int xq() {
        return this.xq;
    }

    public int ycc() {
        return this.ycc;
    }

    public int ypw() {
        return this.ypw;
    }

    public int zz() {
        return this.zz;
    }

    public static sra emc(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new sra();
        }
        sra sraVar = new sra();
        sraVar.emc = jSONObject.optString("direction", "horizontal");
        sraVar.ypw = jSONObject.optInt("auto_loop", 1);
        sraVar.xq = jSONObject.optInt("allow_manual_loop", 1);
        sraVar.dg = jSONObject.optInt("unlimited_loop", 0);
        sraVar.bw = jSONObject.optInt("left_margin", 0);
        sraVar.ycc = jSONObject.optInt("right_margin", 0);
        sraVar.uym = jSONObject.optInt("ad_margin", 0);
        sraVar.msw = jSONObject.optInt("loop_interval_time", PAGErrorCode.LOAD_FACTORY_NULL_CODE);
        sraVar.zz = jSONObject.optInt("flip_speed", 500);
        sraVar.ru = jSONObject.optInt("stop_auto_loop", 0);
        return sraVar;
    }
}
