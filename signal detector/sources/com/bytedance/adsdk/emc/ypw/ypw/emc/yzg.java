package com.bytedance.adsdk.emc.ypw.ypw.emc;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class yzg implements com.bytedance.adsdk.emc.ypw.ypw.ypw {
    private com.bytedance.adsdk.emc.ypw.ypw.emc emc;
    private com.bytedance.adsdk.emc.ypw.ypw.emc xq;
    private com.bytedance.adsdk.emc.ypw.ypw.emc ypw;

    @Override // com.bytedance.adsdk.emc.ypw.ypw.emc
    public Object emc(Map<String, JSONObject> map) {
        Object objEmc = this.emc.emc(map);
        if (objEmc == null) {
            return null;
        }
        return ((Boolean) objEmc).booleanValue() ? this.ypw.emc(map) : this.xq.emc(map);
    }

    public String toString() {
        return ypw();
    }

    @Override // com.bytedance.adsdk.emc.ypw.ypw.ypw
    public void xq(com.bytedance.adsdk.emc.ypw.ypw.emc emcVar) {
        this.xq = emcVar;
    }

    @Override // com.bytedance.adsdk.emc.ypw.ypw.ypw
    public void ypw(com.bytedance.adsdk.emc.ypw.ypw.emc emcVar) {
        this.ypw = emcVar;
    }

    @Override // com.bytedance.adsdk.emc.ypw.ypw.emc
    public String ypw() {
        return this.emc.ypw() + "?" + this.ypw.ypw() + ":" + this.xq.ypw();
    }

    @Override // com.bytedance.adsdk.emc.ypw.ypw.emc
    public com.bytedance.adsdk.emc.ypw.dg.bw emc() {
        return com.bytedance.adsdk.emc.ypw.dg.ycc.OPERATOR_RESULT;
    }

    @Override // com.bytedance.adsdk.emc.ypw.ypw.ypw
    public void emc(com.bytedance.adsdk.emc.ypw.ypw.emc emcVar) {
        this.emc = emcVar;
    }
}
