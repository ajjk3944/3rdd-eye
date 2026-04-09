package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class emc {
    private rie bw;
    private String emc;
    private String gbl;
    private sra ru;
    private rie sup;
    private String xq;
    private ee ycc;
    private int ypw;
    private int zz;
    private List<rie> dg = new ArrayList();
    private JSONObject uym = new JSONObject();
    private volatile boolean msw = false;

    public boolean bw() {
        List<rie> list = this.dg;
        return list != null && list.size() > 0;
    }

    public rie cf() {
        return this.bw;
    }

    public List<rie> dg() {
        return this.dg;
    }

    public JSONObject emc() {
        return this.uym;
    }

    public rie gbl() {
        return this.sup;
    }

    public boolean msw() {
        return this.msw;
    }

    public String qh() {
        return this.gbl;
    }

    public boolean ru() {
        return this.zz == 1;
    }

    public ee sup() {
        return this.ycc;
    }

    @Nullable
    public JSONObject sz() {
        try {
            JSONObject jSONObject = new JSONObject();
            sra sraVarUym = uym();
            if (sraVarUym != null) {
                jSONObject.put("loop_config", sraVarUym.gbl());
            }
            ee eeVarSup = sup();
            if (eeVarSup != null) {
                jSONObject.put("multi_ad_config", eeVarSup.sba());
            }
            List<rie> list = this.dg;
            if (list != null && list.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                for (int i10 = 0; i10 < this.dg.size(); i10++) {
                    jSONArray.put(this.dg.get(i10).uie());
                }
                jSONObject.put("creatives", jSONArray);
            }
            jSONObject.put("multi_ad_style", this.zz);
            jSONObject.put("request_id", this.emc);
            return jSONObject;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.ul.emc("AdInfo", "toJsonObj: ", th);
            return null;
        }
    }

    public sra uym() {
        return this.ru;
    }

    public int xq() {
        return this.ypw;
    }

    public rie ycc() {
        if (this.dg.size() > 0) {
            return this.dg.get(0);
        }
        return null;
    }

    public String ypw() {
        rie rieVarYcc = ycc();
        return rieVarYcc != null ? rieVarYcc.lvs() : "";
    }

    public void zz() {
        this.msw = false;
    }

    public void emc(JSONObject jSONObject) {
        this.uym = jSONObject;
    }

    public void xq(String str) {
        this.gbl = str;
    }

    public void emc(String str) {
        this.emc = str;
    }

    public void emc(int i10) {
        this.ypw = i10;
    }

    public void ypw(String str) {
        this.xq = str;
    }

    public void emc(rie rieVar) {
        this.dg.add(rieVar);
        if (this.sup == null) {
            this.sup = rieVar;
        }
    }

    public void ypw(int i10) {
        this.zz = i10;
    }

    public static emc ypw(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            emc emcVar = new emc();
            emcVar.emc(sra.emc(jSONObject.optJSONObject("loop_config")));
            emcVar.ypw(jSONObject.optInt("multi_ad_style", 0));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("creatives");
            if (jSONArrayOptJSONArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    rie rieVarEmc = com.bytedance.sdk.openadsdk.core.ypw.emc(jSONArrayOptJSONArray.optJSONObject(i10), null, null, emcVar, i10);
                    if (rieVarEmc != null) {
                        arrayList.add(rieVarEmc);
                    }
                }
                emcVar.emc(arrayList);
            }
            emcVar.emc(jSONObject.optString("request_id", ""));
            String strOptString = jSONObject.optString("multi_ad_config");
            if (!TextUtils.isEmpty(strOptString)) {
                emcVar.emc(ee.emc(strOptString));
            }
            return emcVar;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.ul.emc("AdInfo", "fromJson: ", th);
            return null;
        }
    }

    public void emc(List<rie> list) {
        this.dg = list;
        if (list.isEmpty()) {
            return;
        }
        this.sup = list.get(0);
    }

    public static Map<String, rie> emc(emc emcVar) {
        if (emcVar == null) {
            return null;
        }
        HashMap map = new HashMap();
        for (rie rieVar : emcVar.dg()) {
            if (!TextUtils.isEmpty(rieVar.qlw())) {
                map.put(rieVar.qlw(), rieVar);
            }
        }
        if (map.size() != 0) {
            return map;
        }
        return null;
    }

    public void emc(sra sraVar) {
        this.ru = sraVar;
    }

    public void emc(ee eeVar) {
        this.ycc = eeVar;
    }

    public void ypw(rie rieVar) {
        this.bw = rieVar;
    }
}
