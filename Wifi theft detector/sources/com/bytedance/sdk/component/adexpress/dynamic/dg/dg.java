package com.bytedance.sdk.component.adexpress.dynamic.dg;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class dg {
    public String dg;
    public List<emc> emc;
    public String xq;
    public String ypw;

    public static class emc {
        public int emc;
        public JSONObject ypw;
    }

    public static dg emc(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        dg dgVar = new dg();
        String strOptString = jSONObject.optString("custom_components");
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(strOptString);
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                if (jSONObjectOptJSONObject != null) {
                    emc emcVar = new emc();
                    emcVar.emc = jSONObjectOptJSONObject.optInt("id");
                    emcVar.ypw = new JSONObject(jSONObjectOptJSONObject.optString("componentLayout"));
                    arrayList.add(emcVar);
                }
            }
        } catch (JSONException unused) {
        }
        dgVar.emc = arrayList;
        dgVar.ypw = jSONObject.optString("diff_data");
        dgVar.xq = jSONObject.optString("style_diff");
        dgVar.dg = jSONObject.optString("tag_diff");
        return dgVar;
    }
}
