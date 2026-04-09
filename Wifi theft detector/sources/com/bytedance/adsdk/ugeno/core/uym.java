package com.bytedance.adsdk.ugeno.core;

import android.text.TextUtils;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class uym {
    private String bw;
    private JSONObject dg;
    private JSONObject emc;
    private float msw;
    private boolean uym;
    private String xq;
    private JSONObject ycc;
    private JSONObject ypw;
    private float zz;

    public static class emc {
        private LinkedList<emc> bw;
        private JSONObject dg;
        private String emc;
        private String msw;
        private boolean ru;
        private String uym;
        private JSONObject xq;
        private emc ycc;
        private String ypw;
        private boolean zz;

        public List<emc> bw() {
            return this.bw;
        }

        public String toString() {
            return "UGNode{id='" + this.emc + "', name='" + this.ypw + "'}";
        }

        public JSONObject ycc() {
            return this.dg;
        }

        public JSONObject dg() {
            return this.xq;
        }

        public String xq() {
            return this.ypw;
        }

        public String ypw() {
            return this.uym;
        }

        public String emc() {
            return this.emc;
        }

        public void ypw(boolean z10) {
            this.ru = z10;
        }

        public void emc(String str) {
            this.ypw = str;
        }

        public void ypw(emc emcVar) {
            if (this.bw == null) {
                this.bw = new LinkedList<>();
            }
            this.bw.addLast(emcVar);
        }

        public void emc(boolean z10) {
            this.zz = z10;
        }

        public void emc(emc emcVar) {
            if (this.bw == null) {
                this.bw = new LinkedList<>();
            }
            this.bw.add(emcVar);
        }

        public void emc(int i10, emc emcVar) {
            if (this.bw == null) {
                this.bw = new LinkedList<>();
            }
            this.bw.add(i10, emcVar);
        }
    }

    public uym(JSONObject jSONObject, JSONObject jSONObject2) {
        this(jSONObject, jSONObject2, null);
    }

    private emc bw() throws JSONException {
        if (!dg()) {
            return emc(this.emc, (emc) null);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("flexDirection", "row");
            jSONObject.put("justifyContent", "flex_start");
            jSONObject.put("alignItems", "flex_start");
            jSONObject.put("clickable", false);
            jSONObject.put("width", "match_parent");
            jSONObject.put("height", "wrap_content");
            float f10 = this.msw;
            if (f10 > 0.0f) {
                jSONObject.put("width", f10);
            }
            float f11 = this.zz;
            if (f11 > 0.0f) {
                jSONObject.put("height", f11);
            }
            JSONObject jSONObject2 = this.dg;
            if (jSONObject2 != null) {
                String strOptString = jSONObject2.optString("xSize");
                if (!TextUtils.isEmpty(strOptString)) {
                    JSONObject jSONObject3 = new JSONObject(strOptString);
                    if (jSONObject3.optInt("width") > 0) {
                        jSONObject.put("width", jSONObject3.optInt("width"));
                    }
                    if (jSONObject3.optInt("height") > 0) {
                        jSONObject.put("height", jSONObject3.optInt("height"));
                    }
                }
            }
        } catch (JSONException unused) {
        }
        emc emcVar = new emc();
        emcVar.ypw = "View";
        emcVar.emc = "virtualNode";
        emcVar.xq = jSONObject;
        emcVar.ycc = null;
        emcVar.uym = this.xq;
        emcVar.msw = this.bw;
        emcVar.emc(emc(this.emc, emcVar));
        return emcVar;
    }

    public boolean dg() {
        return this.uym;
    }

    public emc emc() {
        return bw();
    }

    public List<emc> xq() throws JSONException {
        if (this.ypw == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> itKeys = this.ypw.keys();
        while (itKeys.hasNext()) {
            emc emcVarEmc = emc(this.ypw.optJSONObject(itKeys.next()), (emc) null);
            if (emcVarEmc != null) {
                arrayList.add(emcVarEmc);
            }
        }
        return arrayList;
    }

    public String ypw() {
        return this.xq;
    }

    public uym(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        if (jSONObject != null) {
            if (jSONObject.has(TtmlNode.TAG_BODY)) {
                this.emc = jSONObject.optJSONObject(TtmlNode.TAG_BODY);
            } else {
                this.emc = jSONObject.optJSONObject("main_template");
            }
            this.ypw = jSONObject.optJSONObject("sub_templates");
            JSONObject jSONObjectOptJSONObject = jSONObject.has("meta") ? jSONObject.optJSONObject("meta") : jSONObject.optJSONObject("template_info");
            if (jSONObjectOptJSONObject != null) {
                if (jSONObject.has(TtmlNode.TAG_BODY)) {
                    this.uym = true;
                    String strOptString = jSONObjectOptJSONObject.optString("version");
                    this.xq = strOptString;
                    if (TextUtils.isEmpty(strOptString)) {
                        this.xq = "3.0";
                    }
                } else {
                    this.xq = jSONObjectOptJSONObject.optString("sdk_version");
                }
                if (jSONObjectOptJSONObject.has("adType")) {
                    this.bw = jSONObjectOptJSONObject.optString("adType");
                }
            } else if (jSONObject.has(TtmlNode.TAG_BODY)) {
                this.xq = "3.0";
                this.uym = true;
            }
            this.dg = jSONObject2;
            this.ycc = jSONObject3;
        }
    }

    public static boolean dg(emc emcVar) {
        return (emcVar == null || emcVar.xq == null) ? false : true;
    }

    public void emc(float f10, float f11) {
        this.msw = f10;
        this.zz = f11;
    }

    public boolean ypw(emc emcVar) {
        JSONObject jSONObjectDg;
        if (emcVar == null || (jSONObjectDg = emcVar.dg()) == null) {
            return false;
        }
        return TextUtils.equals(jSONObjectDg.optString("height"), "match_parent");
    }

    private emc emc(JSONObject jSONObject, emc emcVar) throws JSONException {
        String strOptString;
        String strOptString2;
        emc emcVarEmc;
        if (jSONObject == null) {
            return null;
        }
        if (jSONObject.has(HandleInvocationsFromAdViewer.KEY_AD_TYPE)) {
            strOptString = jSONObject.optString(HandleInvocationsFromAdViewer.KEY_AD_TYPE);
        } else {
            strOptString = jSONObject.optString("name");
        }
        String strOptString3 = jSONObject.optString("id");
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!TextUtils.equals(next, "children")) {
                try {
                    jSONObject2.put(next, jSONObject.opt(next));
                } catch (JSONException unused) {
                }
            }
        }
        emc emcVar2 = new emc();
        emcVar2.emc = strOptString3;
        if (!this.uym || !TextUtils.equals("Video", strOptString)) {
            emcVar2.ypw = strOptString;
        } else {
            emcVar2.ypw = strOptString + "V3";
        }
        emcVar2.xq = jSONObject2;
        emcVar2.ycc = emcVar;
        emcVar2.uym = this.xq;
        emcVar2.msw = this.bw;
        if (jSONObject2.has("i18n")) {
            emcVar2.dg = jSONObject2.optJSONObject("i18n");
        }
        if (TextUtils.equals(strOptString, "CustomComponent")) {
            emc(jSONObject, emcVar2.xq);
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("children");
        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
            int i10 = 0;
            for (int i11 = 0; i11 < jSONArrayOptJSONArray.length(); i11++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i11);
                if (jSONObject.has(HandleInvocationsFromAdViewer.KEY_AD_TYPE)) {
                    strOptString2 = jSONObject.optString(HandleInvocationsFromAdViewer.KEY_AD_TYPE);
                } else {
                    strOptString2 = jSONObject.optString("name");
                }
                String strEmc = com.bytedance.adsdk.ugeno.xq.ypw.emc(jSONObjectOptJSONObject.optString("id"), this.dg);
                if (TextUtils.equals(strOptString2, "Template")) {
                    JSONObject jSONObject3 = this.ypw;
                    if (jSONObject3 != null) {
                        jSONObjectOptJSONObject = jSONObject3.optJSONObject(strEmc);
                        emcVarEmc = emc(jSONObjectOptJSONObject, emcVar2);
                    } else {
                        emcVarEmc = null;
                    }
                } else {
                    emcVarEmc = emc(jSONObjectOptJSONObject, emcVar2);
                }
                if (emcVarEmc != null) {
                    emcVarEmc.ypw(ypw(emcVarEmc));
                    emcVarEmc.emc(emc(emcVarEmc));
                }
                if (xq(emcVarEmc)) {
                    i10++;
                    emcVar2.ypw(emcVarEmc);
                } else if (emcVarEmc != null) {
                    emcVar2.emc(i11 - i10, emcVarEmc);
                }
            }
        }
        return emcVar2;
    }

    public boolean xq(emc emcVar) {
        JSONObject jSONObjectDg;
        if (emcVar == null || (jSONObjectDg = emcVar.dg()) == null) {
            return false;
        }
        return TextUtils.equals(jSONObjectDg.optString("position"), "absolute");
    }

    public boolean emc(emc emcVar) {
        JSONObject jSONObjectDg;
        if (emcVar == null || (jSONObjectDg = emcVar.dg()) == null) {
            return false;
        }
        return TextUtils.equals(jSONObjectDg.optString("width"), "match_parent");
    }

    private void emc(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        if (this.ycc == null || jSONObject2 == null) {
            return;
        }
        try {
            String strOptString = this.ycc.optString(jSONObject2.optString("targetId"));
            if (TextUtils.isEmpty(strOptString)) {
                return;
            }
            JSONObject jSONObject3 = new JSONObject(strOptString);
            JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("targetProps");
            if (jSONObjectOptJSONObject != null) {
                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    Object objOpt = jSONObjectOptJSONObject.opt(next);
                    if (TextUtils.equals(next, "events") && jSONObject3.has("events")) {
                        if (objOpt instanceof JSONArray) {
                            com.bytedance.adsdk.ugeno.uym.ypw.emc(jSONObject3.optJSONArray("events"), (JSONArray) objOpt);
                        }
                    } else {
                        jSONObject3.put(next, objOpt);
                    }
                }
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("children");
                if (jSONArrayOptJSONArray == null) {
                    jSONArrayOptJSONArray = new JSONArray();
                }
                jSONArrayOptJSONArray.put(jSONObject3);
                if (jSONObject.has("children")) {
                    return;
                }
                jSONObject.put("children", jSONArrayOptJSONArray);
            }
        } catch (JSONException unused) {
        }
    }
}
