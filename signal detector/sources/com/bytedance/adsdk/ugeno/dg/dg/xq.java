package com.bytedance.adsdk.ugeno.dg.dg;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.dg.ycc;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class xq {
    protected Map<String, String> bw;
    protected ycc.emc dg;
    protected com.bytedance.adsdk.ugeno.dg.gbl emc;
    protected String msw;
    protected Context ru;
    protected String uym;
    protected com.bytedance.adsdk.ugeno.dg.ycc xq;
    protected String ycc;
    protected com.bytedance.adsdk.ugeno.ypw.xq ypw;
    protected String zz;

    public static class emc {
        public static xq emc(Context context, com.bytedance.adsdk.ugeno.ypw.xq xqVar, JSONObject jSONObject, JSONObject jSONObject2) {
            com.bytedance.adsdk.ugeno.dg.ycc yccVarEmc;
            ycc.emc emcVarEmc;
            if (xqVar == null || jSONObject == null || (yccVarEmc = com.bytedance.adsdk.ugeno.dg.ycc.emc(jSONObject, jSONObject2)) == null || (emcVarEmc = yccVarEmc.emc()) == null) {
                return null;
            }
            String strEmc = emcVarEmc.emc();
            if (TextUtils.equals(strEmc, "custom")) {
                dg dgVar = new dg(context);
                dgVar.emc(xqVar);
                dgVar.emc(yccVarEmc);
                dgVar.xq();
                return dgVar;
            }
            com.bytedance.adsdk.ugeno.dg.uym uymVarEmc = (TextUtils.isEmpty(strEmc) || TextUtils.equals(strEmc, "global")) ? com.bytedance.adsdk.ugeno.dg.ru.emc(emcVarEmc.ypw()) : com.bytedance.adsdk.ugeno.dg.ru.emc(emcVarEmc.bw());
            if (uymVarEmc == null) {
                return null;
            }
            xq xqVarEmc = uymVarEmc.emc(context);
            xqVarEmc.emc(xqVar);
            xqVarEmc.emc(yccVarEmc);
            xqVarEmc.xq();
            return xqVarEmc;
        }
    }

    public xq(Context context) {
        this.ru = context;
    }

    public String bw() {
        return this.msw;
    }

    public String dg() {
        return this.ycc;
    }

    public void emc(com.bytedance.adsdk.ugeno.ypw.xq xqVar) {
        this.ypw = xqVar;
    }

    public abstract boolean emc(Object... objArr);

    public void xq() {
        this.dg = this.xq.emc();
        com.bytedance.adsdk.ugeno.dg.ycc yccVar = this.xq;
        if (yccVar == null) {
            return;
        }
        ycc.emc emcVarEmc = yccVar.emc();
        this.dg = emcVarEmc;
        if (emcVarEmc == null) {
            return;
        }
        this.bw = emcVarEmc.xq();
        this.ycc = this.dg.ypw();
        this.uym = this.dg.emc();
        this.msw = this.dg.dg();
        this.zz = this.dg.bw();
    }

    public com.bytedance.adsdk.ugeno.dg.ycc ycc() {
        return this.xq;
    }

    public void emc(com.bytedance.adsdk.ugeno.dg.ycc yccVar) {
        this.xq = yccVar;
    }

    public void emc(com.bytedance.adsdk.ugeno.dg.gbl gblVar) {
        this.emc = gblVar;
    }
}
