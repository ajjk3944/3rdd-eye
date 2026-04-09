package com.bytedance.adsdk.emc.ypw.ypw.emc;

import A.f;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ul implements com.bytedance.adsdk.emc.ypw.ypw.emc {
    private final String emc;

    public ul(String str) {
        this.emc = str;
    }

    @Override // com.bytedance.adsdk.emc.ypw.ypw.emc
    public Object emc(Map<String, JSONObject> map) {
        return this.emc;
    }

    public String toString() {
        return ypw();
    }

    @Override // com.bytedance.adsdk.emc.ypw.ypw.emc
    public String ypw() {
        return f.p(new StringBuilder("'"), this.emc, "'");
    }

    @Override // com.bytedance.adsdk.emc.ypw.ypw.emc
    public com.bytedance.adsdk.emc.ypw.dg.bw emc() {
        return com.bytedance.adsdk.emc.ypw.dg.ycc.STRING;
    }
}
