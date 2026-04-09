package com.bytedance.sdk.openadsdk.core.sup;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class emc {
    private String bw;
    private String dg;
    final com.bytedance.sdk.openadsdk.core.model.dg emc = new com.bytedance.sdk.openadsdk.core.model.dg();
    private String gbl = "VAST_ACTION_BUTTON";
    private double msw;
    private int ru;
    private String sup;
    private String uym;
    xq xq;
    private String ycc;
    ypw ypw;
    private int zz;

    private JSONArray cf() {
        Set<ru> setYpw = this.emc.ypw();
        if (setYpw == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (ru ruVar : setYpw) {
            if (ruVar != null) {
                jSONArray.put(ruVar.dg());
            }
        }
        return jSONArray;
    }

    public String bw() {
        return this.bw;
    }

    public String dg() {
        return this.dg;
    }

    public dg emc() {
        return this.emc.emc();
    }

    public int gbl() {
        return this.zz;
    }

    public double msw() {
        return this.msw;
    }

    public com.bytedance.sdk.openadsdk.core.model.dg qh() {
        return this.emc;
    }

    public JSONObject ru() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        dg dgVarEmc = this.emc.emc();
        if (dgVarEmc != null) {
            jSONObject.put("videoTrackers", dgVarEmc.emc());
        }
        ypw ypwVar = this.ypw;
        if (ypwVar != null) {
            jSONObject.put("vastIcon", ypwVar.emc());
        }
        xq xqVar = this.xq;
        if (xqVar != null) {
            jSONObject.put("endCard", xqVar.emc());
        }
        jSONObject.put(CampaignEx.JSON_KEY_TITLE, this.dg);
        jSONObject.put("description", this.bw);
        jSONObject.put("clickThroughUrl", this.ycc);
        jSONObject.put("videoUrl", this.uym);
        jSONObject.put("videDuration", this.msw);
        jSONObject.put("videoWidth", this.zz);
        jSONObject.put("videoHeight", this.ru);
        jSONObject.put("viewabilityVendor", cf());
        return jSONObject;
    }

    public int sup() {
        return this.ru;
    }

    public Set<ru> sz() {
        return this.emc.ypw();
    }

    public String uym() {
        return this.uym;
    }

    public xq xq() {
        return this.xq;
    }

    public String ycc() {
        return this.ycc;
    }

    public ypw ypw() {
        return this.ypw;
    }

    public String zz() {
        xq xqVar;
        String str = this.ycc;
        if (!TextUtils.isEmpty(this.sup)) {
            String str2 = this.sup;
            this.sup = null;
            return str2;
        }
        String str3 = this.gbl;
        str3.getClass();
        if (str3.equals("VAST_ICON")) {
            ypw ypwVar = this.ypw;
            if (ypwVar != null && !TextUtils.isEmpty(ypwVar.msw)) {
                str = this.ypw.msw;
            }
        } else if (str3.equals("VAST_END_CARD") && (xqVar = this.xq) != null && !TextUtils.isEmpty(xqVar.msw)) {
            str = this.xq.msw;
        }
        this.gbl = "VAST_ACTION_BUTTON";
        return str;
    }

    public void bw(String str) {
        this.gbl = str;
    }

    public void dg(String str) {
        this.uym = str;
    }

    public void emc(ypw ypwVar) {
        if (ypwVar != null) {
            ypwVar.emc(this.uym);
        }
        this.ypw = ypwVar;
    }

    public void xq(String str) {
        this.ycc = str;
    }

    public void ycc(String str) {
        this.sup = str;
    }

    public void ypw(String str) {
        this.bw = str;
    }

    public void ypw(int i10) {
        this.ru = i10;
    }

    public void emc(xq xqVar) {
        if (xqVar != null) {
            xqVar.emc(this.uym);
        }
        this.xq = xqVar;
    }

    public void emc(String str) {
        this.dg = str;
    }

    public void emc(double d10) {
        this.msw = d10;
    }

    public static emc emc(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        emc emcVar = new emc();
        dg dgVarEmc = emcVar.emc.emc();
        if (dgVarEmc == null) {
            dgVarEmc = new dg();
            emcVar.emc.emc(dgVarEmc);
        }
        dgVarEmc.emc(jSONObject.optJSONObject("videoTrackers"));
        emcVar.ypw = ypw.emc(jSONObject.optJSONObject("vastIcon"));
        emcVar.xq = xq.ypw(jSONObject.optJSONObject("endCard"));
        emcVar.dg = jSONObject.optString(CampaignEx.JSON_KEY_TITLE);
        emcVar.bw = jSONObject.optString("description");
        emcVar.ycc = jSONObject.optString("clickThroughUrl");
        emcVar.uym = jSONObject.optString("videoUrl");
        emcVar.msw = jSONObject.optDouble("videDuration");
        emcVar.zz = jSONObject.optInt("videoWidth");
        emcVar.zz = jSONObject.optInt("videoHeight");
        Set<ru> setYpw = emcVar.emc.ypw();
        if (setYpw == null) {
            setYpw = new HashSet<>();
            emcVar.emc.emc(setYpw);
        }
        setYpw.addAll(ru.emc(jSONObject.optJSONArray("viewabilityVendor")));
        return emcVar;
    }

    public void emc(rie rieVar) {
        this.emc.emc(rieVar);
        ypw ypwVar = this.ypw;
        if (ypwVar != null) {
            ypwVar.emc(rieVar);
        }
        xq xqVar = this.xq;
        if (xqVar != null) {
            xqVar.emc(rieVar);
        }
    }

    public void emc(int i10) {
        this.zz = i10;
    }

    public void emc(Set<ru> set) {
        this.emc.ypw(set);
    }
}
