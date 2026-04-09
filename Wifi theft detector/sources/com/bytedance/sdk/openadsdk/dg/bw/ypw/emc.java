package com.bytedance.sdk.openadsdk.dg.bw.ypw;

import com.bytedance.sdk.openadsdk.core.model.rie;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class emc {
    private xq bw;
    private JSONObject dg;
    private rie emc;
    private JSONObject xq;
    private boolean ycc = false;
    private String ypw;

    public emc(rie rieVar, String str, JSONObject jSONObject, JSONObject jSONObject2) {
        this.emc = rieVar;
        this.ypw = str;
        this.xq = jSONObject;
        this.dg = jSONObject2;
    }

    public xq bw() {
        return this.bw;
    }

    public JSONObject dg() {
        if (this.dg == null) {
            this.dg = new JSONObject();
        }
        return this.dg;
    }

    public rie emc() {
        return this.emc;
    }

    public void uym() {
        xq xqVar = this.bw;
        if (xqVar != null) {
            xqVar.emc(this);
        }
    }

    public JSONObject xq() {
        if (this.xq == null) {
            this.xq = new JSONObject();
        }
        return this.xq;
    }

    public boolean ycc() {
        return this.ycc;
    }

    public String ypw() {
        return this.ypw;
    }

    public void emc(xq xqVar) {
        this.bw = xqVar;
    }

    public void emc(boolean z10) {
        this.ycc = z10;
    }
}
