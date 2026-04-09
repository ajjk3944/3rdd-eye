package com.bytedance.adsdk.ugeno.dg;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ycc {
    private emc emc;
    private List<emc> ypw;

    public static class emc {
        private Map<String, String> bw;
        private String dg;
        private String emc;
        private String xq = "global";
        private Map<String, Object> ycc;
        private String ypw;

        public String bw() {
            return this.ypw;
        }

        public String dg() {
            return this.emc;
        }

        public String emc() {
            return this.xq;
        }

        public String toString() {
            return "Action{scheme='" + this.xq + "', name='" + this.dg + "', params=" + this.bw + ", host='" + this.ypw + "', origin='" + this.emc + "', extra=" + this.ycc + '}';
        }

        public Map<String, String> xq() {
            return this.bw;
        }

        public String ypw() {
            return this.dg;
        }

        public void dg(String str) {
            this.ypw = str;
        }

        public void emc(String str) {
            this.xq = str;
        }

        public void xq(String str) {
            this.emc = str;
        }

        public void ypw(String str) {
            this.dg = str;
        }

        public void emc(Map<String, String> map) {
            this.bw = map;
        }

        public void ypw(Map<String, Object> map) {
            this.ycc = map;
        }
    }

    public emc emc() {
        return this.emc;
    }

    public List<emc> ypw() {
        return this.ypw;
    }

    public static ycc emc(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null) {
            return null;
        }
        ycc yccVar = new ycc();
        String strOptString = jSONObject.optString("on");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("handlers");
        yccVar.emc = sup.emc(strOptString, jSONObject2);
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
            emc emcVarEmc = sup.emc(jSONArrayOptJSONArray.optString(i10), jSONObject2);
            if (emcVarEmc != null) {
                arrayList.add(emcVarEmc);
            }
        }
        yccVar.ypw = arrayList;
        return yccVar;
    }
}
