package com.bytedance.adsdk.emc.ypw.ypw.emc;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class uym implements com.bytedance.adsdk.emc.ypw.ypw.emc {
    private final Object emc;

    public uym(String str) {
        if (str.equalsIgnoreCase("true")) {
            this.emc = Boolean.TRUE;
        } else if (str.equalsIgnoreCase("false")) {
            this.emc = Boolean.FALSE;
        } else {
            if (!str.equalsIgnoreCase("null")) {
                throw new IllegalArgumentException();
            }
            this.emc = null;
        }
    }

    @Override // com.bytedance.adsdk.emc.ypw.ypw.emc
    public Object emc(Map<String, JSONObject> map) {
        return this.emc;
    }

    public String toString() {
        return "KeywordNode [keywordValue=" + this.emc + "]";
    }

    @Override // com.bytedance.adsdk.emc.ypw.ypw.emc
    public String ypw() {
        Object obj = this.emc;
        return obj != null ? obj.toString() : "NULL";
    }

    @Override // com.bytedance.adsdk.emc.ypw.ypw.emc
    public com.bytedance.adsdk.emc.ypw.dg.bw emc() {
        return com.bytedance.adsdk.emc.ypw.dg.ycc.CONSTANT;
    }
}
