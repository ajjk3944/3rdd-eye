package com.bytedance.adsdk.ugeno.dg.ypw;

import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.dg.ycc;
import java.util.Map;
import org.json.JSONException;

/* loaded from: classes.dex */
public class bw extends emc {
    public bw(com.bytedance.adsdk.ugeno.ypw.xq xqVar, String str, ycc.emc emcVar) {
        super(xqVar, str, emcVar);
    }

    @Override // com.bytedance.adsdk.ugeno.dg.ypw.emc
    public void emc() throws JSONException {
        Map<String, String> map = this.ycc;
        if (map == null || map.size() <= 0) {
            return;
        }
        String str = this.ycc.get("id");
        if (TextUtils.isEmpty(str)) {
            emc(this.xq);
            return;
        }
        com.bytedance.adsdk.ugeno.ypw.xq xqVar = this.xq;
        com.bytedance.adsdk.ugeno.ypw.xq xqVarYpw = xqVar.ypw(xqVar);
        if (xqVarYpw == null) {
            return;
        }
        emc(xqVarYpw.bw(str));
    }

    private void emc(com.bytedance.adsdk.ugeno.ypw.xq xqVar) throws JSONException {
        if (xqVar == null) {
            return;
        }
        for (String str : this.ycc.keySet()) {
            if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, "id")) {
                xqVar.emc(str, this.ycc.get(str));
            }
        }
        xqVar.emc(this.ycc.containsKey("width"), this.ycc.containsKey("height"));
        xqVar.ypw();
    }
}
