package com.bytedance.sdk.openadsdk.core.model;

import java.util.ArrayList;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class bw {
    private ArrayList<emc> emc;
    private dg ypw;

    public static class emc {
        private Set<com.bytedance.sdk.openadsdk.core.sup.ru> dg;
        private final String emc;
        private com.bytedance.sdk.openadsdk.core.sup.dg xq;
        private final String ypw;

        public emc(JSONObject jSONObject) {
            this.emc = jSONObject.optString("vast_url");
            this.ypw = jSONObject.optString("vast_content");
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("videoTrackers");
            if (jSONObjectOptJSONObject != null) {
                com.bytedance.sdk.openadsdk.core.sup.dg dgVar = new com.bytedance.sdk.openadsdk.core.sup.dg();
                this.xq = dgVar;
                dgVar.emc(jSONObjectOptJSONObject);
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("viewabilityVendor");
            if (jSONArrayOptJSONArray != null) {
                this.dg = com.bytedance.sdk.openadsdk.core.sup.ru.emc(jSONArrayOptJSONArray);
            }
        }

        public JSONObject bw() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("vast_url", this.emc);
            jSONObject.put("vast_content", this.ypw);
            com.bytedance.sdk.openadsdk.core.sup.dg dgVar = this.xq;
            if (dgVar != null) {
                jSONObject.put("videoTrackers", dgVar.emc());
            }
            if (this.dg != null) {
                JSONArray jSONArray = new JSONArray();
                for (com.bytedance.sdk.openadsdk.core.sup.ru ruVar : this.dg) {
                    if (ruVar != null) {
                        jSONArray.put(ruVar.dg());
                    }
                }
                jSONObject.put("viewabilityVendor", jSONArray);
            }
            return jSONObject;
        }

        public String dg() {
            return this.ypw;
        }

        public com.bytedance.sdk.openadsdk.core.sup.dg emc() {
            return this.xq;
        }

        public String xq() {
            return this.emc;
        }

        public Set<com.bytedance.sdk.openadsdk.core.sup.ru> ypw() {
            return this.dg;
        }

        public void emc(com.bytedance.sdk.openadsdk.core.sup.dg dgVar) {
            this.xq = dgVar;
        }

        public void emc(Set<com.bytedance.sdk.openadsdk.core.sup.ru> set) {
            this.dg = set;
        }
    }

    public bw(JSONArray jSONArray) {
        if (jSONArray == null) {
            return;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            emc emcVar = new emc(jSONArray.optJSONObject(i));
            if (this.emc == null) {
                this.emc = new ArrayList<>();
            }
            this.emc.add(emcVar);
        }
    }

    public static boolean emc(rie rieVar) {
        if (rieVar == null || rieVar.xmt()) {
            return false;
        }
        int iMfx = rieVar.mfx();
        int iIn = rieVar.in();
        return (iMfx == 3 || iMfx == 7 || iMfx == 8) && (iIn == 5 || iIn == 15 || iIn == 50);
    }

    public boolean dg() {
        ArrayList<emc> arrayList = this.emc;
        return (arrayList == null || arrayList.isEmpty()) ? false : true;
    }

    public dg xq() {
        if (this.ypw == null) {
            this.ypw = new dg();
            ArrayList<emc> arrayList = this.emc;
            if (arrayList != null) {
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    emc emcVar = arrayList.get(i);
                    i++;
                    emc emcVar2 = emcVar;
                    com.bytedance.sdk.openadsdk.core.sup.dg dgVarEmc = emcVar2.emc();
                    Set<com.bytedance.sdk.openadsdk.core.sup.ru> setYpw = emcVar2.ypw();
                    if (dgVarEmc != null) {
                        this.ypw.emc().emc(dgVarEmc);
                    }
                    if (setYpw != null) {
                        this.ypw.ypw().addAll(setYpw);
                    }
                }
            }
        }
        return this.ypw;
    }

    public JSONArray ypw() {
        JSONArray jSONArray = new JSONArray();
        ArrayList<emc> arrayList = this.emc;
        if (arrayList != null) {
            try {
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    emc emcVar = arrayList.get(i);
                    i++;
                    jSONArray.put(emcVar.bw());
                }
            } catch (Exception unused) {
            }
        }
        return jSONArray;
    }

    public ArrayList<emc> emc() {
        return this.emc;
    }
}
