package com.bytedance.adsdk.ugeno.core;

import android.content.Context;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class gbl {
    private Map<String, Object> dg;
    private Context emc;
    private JSONObject xq;
    private JSONObject ypw;

    public void emc(Context context) {
        this.emc = context;
    }

    public void ypw(JSONObject jSONObject) {
        this.xq = jSONObject;
    }

    public void emc(JSONObject jSONObject) {
        this.ypw = jSONObject;
    }

    public Map<String, Object> ypw() {
        return this.dg;
    }

    public JSONObject emc() {
        return this.xq;
    }

    public void emc(Map<String, Object> map) {
        this.dg = map;
    }
}
