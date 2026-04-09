package com.bytedance.adsdk.ugeno.emc.emc;

import android.animation.PropertyValuesHolder;
import android.graphics.Canvas;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class emc {
    protected JSONObject emc;
    private String xq;
    protected com.bytedance.adsdk.ugeno.ypw.xq ypw;

    /* renamed from: com.bytedance.adsdk.ugeno.emc.emc.emc$emc, reason: collision with other inner class name */
    public static class C0010emc {
        public static emc emc(com.bytedance.adsdk.ugeno.ypw.xq xqVar, JSONObject jSONObject) {
            if (xqVar == null || jSONObject == null) {
                return null;
            }
            String strOptString = jSONObject.optString("type");
            strOptString.getClass();
            switch (strOptString) {
                case "stretch":
                    return new bw(xqVar, jSONObject);
                case "ripple":
                    return new ypw(xqVar, jSONObject);
                case "rub_in":
                    return new xq(xqVar, jSONObject);
                case "shine":
                    return new dg(xqVar, jSONObject);
                default:
                    return null;
            }
        }
    }

    public emc(com.bytedance.adsdk.ugeno.ypw.xq xqVar, JSONObject jSONObject) {
        this.emc = jSONObject;
        this.ypw = xqVar;
        emc();
    }

    public String dg() {
        return this.xq;
    }

    public void emc() {
        this.xq = this.emc.optString("type");
        ypw();
    }

    public abstract void emc(int i, int i3);

    public abstract void emc(Canvas canvas);

    public abstract List<PropertyValuesHolder> xq();

    public abstract void ypw();

    public abstract void ypw(Canvas canvas);
}
