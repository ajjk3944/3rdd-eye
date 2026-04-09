package com.bytedance.sdk.component.adexpress.dynamic.bw;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.dynamic.bw.bw;
import com.bytedance.sdk.component.adexpress.ypw.sz;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import x.AbstractC2984e;

/* loaded from: classes.dex */
public class ycc {
    private static HashMap<String, String> uym;
    private xq bw;
    private emc dg;
    private JSONObject emc;
    private com.bytedance.sdk.component.adexpress.dynamic.dg.xq xq;
    private com.bytedance.sdk.component.adexpress.dynamic.dg.dg ycc;
    private JSONObject ypw;

    public static class emc {
        float emc;
        boolean xq;
        float ypw;

        public static emc emc(JSONObject jSONObject) {
            emc emcVar = new emc();
            if (jSONObject != null) {
                emcVar.emc = (float) jSONObject.optDouble("width");
                emcVar.ypw = (float) jSONObject.optDouble("height");
                emcVar.xq = jSONObject.optBoolean("isLandscape");
            }
            return emcVar;
        }
    }

    static {
        HashMap<String, String> map = new HashMap<>();
        uym = map;
        map.put("subtitle", "description");
        uym.put("source", "source|app.app_name");
        uym.put("screenshot", "dynamic_creative.screenshot");
    }

    public ycc(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4) {
        this.emc = jSONObject;
        this.ypw = jSONObject2;
        this.xq = new com.bytedance.sdk.component.adexpress.dynamic.dg.xq(jSONObject2);
        this.dg = emc.emc(jSONObject3);
        this.ycc = com.bytedance.sdk.component.adexpress.dynamic.dg.dg.emc(jSONObject4);
    }

    private void ypw(com.bytedance.sdk.component.adexpress.dynamic.dg.msw mswVar) {
        com.bytedance.sdk.component.adexpress.dynamic.dg.xq xqVar;
        Object objEmc;
        Object objEmc2;
        Object objEmc3;
        Object objEmc4;
        if (mswVar == null || (xqVar = this.xq) == null || (objEmc = xqVar.emc("image.0.url")) == null) {
            return;
        }
        String strValueOf = String.valueOf(objEmc);
        if (TextUtils.isEmpty(strValueOf) || (objEmc2 = this.xq.emc("title")) == null) {
            return;
        }
        String strValueOf2 = String.valueOf(objEmc2);
        if (TextUtils.isEmpty(strValueOf2) || (objEmc3 = this.xq.emc("description")) == null) {
            return;
        }
        String strValueOf3 = String.valueOf(objEmc3);
        if (TextUtils.isEmpty(strValueOf3) || (objEmc4 = this.xq.emc("icon")) == null) {
            return;
        }
        String strValueOf4 = String.valueOf(objEmc4);
        if (TextUtils.isEmpty(strValueOf4)) {
            return;
        }
        Object objEmc5 = this.xq.emc("app.app_name");
        Object objEmc6 = this.xq.emc("source");
        if (objEmc5 == null && objEmc6 == null) {
            return;
        }
        if (objEmc5 == null) {
            objEmc5 = objEmc6;
        }
        String strValueOf5 = String.valueOf(objEmc5);
        if (TextUtils.isEmpty(strValueOf5)) {
            return;
        }
        mswVar.emc("imageUrl", strValueOf);
        mswVar.emc("title", strValueOf2);
        mswVar.emc("description", strValueOf3);
        mswVar.emc("icon", strValueOf4);
        mswVar.emc("app_name", strValueOf5);
        mswVar.emc(true);
    }

    public com.bytedance.sdk.component.adexpress.dynamic.dg.msw emc(double d6, int i, double d7, String str, sz szVar) throws JSONException {
        JSONObject jSONObject;
        this.xq.emc();
        try {
            jSONObject = new JSONObject(this.ycc.ypw);
        } catch (JSONException unused) {
            jSONObject = null;
        }
        com.bytedance.sdk.component.adexpress.dynamic.dg.msw mswVarEmc = emc(dg.emc(this.emc, jSONObject), (com.bytedance.sdk.component.adexpress.dynamic.dg.msw) null);
        emc(mswVarEmc);
        bw bwVar = new bw(d6, i, d7, str, szVar);
        bw.emc emcVar = new bw.emc();
        emc emcVar2 = this.dg;
        emcVar.emc = emcVar2.emc;
        emcVar.ypw = emcVar2.ypw;
        emcVar.xq = 0.0f;
        bwVar.emc(emcVar);
        bwVar.emc(mswVarEmc, 0.0f, 0.0f);
        bwVar.emc();
        com.bytedance.sdk.component.adexpress.dynamic.dg.ypw ypwVar = bwVar.emc;
        if (ypwVar.dg == 65536.0f) {
            return null;
        }
        return ypwVar.ycc;
    }

    private void emc(com.bytedance.sdk.component.adexpress.dynamic.dg.msw mswVar) {
        int iEmc;
        if (mswVar == null) {
            return;
        }
        if (com.bytedance.sdk.component.adexpress.emc.emc.emc.emc().xq() != null) {
            iEmc = com.bytedance.sdk.component.adexpress.emc.emc.emc.emc().xq().cf();
        } else {
            iEmc = com.bytedance.sdk.component.adexpress.dg.uym.emc(com.bytedance.sdk.component.adexpress.dg.emc());
        }
        int iYpw = com.bytedance.sdk.component.adexpress.dg.uym.ypw(com.bytedance.sdk.component.adexpress.dg.emc(), iEmc);
        emc emcVar = this.dg;
        float fMin = emcVar.xq ? emcVar.emc : Math.min(emcVar.emc, iYpw);
        if (this.dg.ypw == 0.0f) {
            mswVar.bw(fMin);
            mswVar.ru().bw().ru("auto");
            mswVar.ycc(0.0f);
        } else {
            mswVar.bw(fMin);
            int iYpw2 = com.bytedance.sdk.component.adexpress.dg.uym.ypw(com.bytedance.sdk.component.adexpress.dg.emc(), com.bytedance.sdk.component.adexpress.dg.uym.ypw(com.bytedance.sdk.component.adexpress.dg.emc()));
            emc emcVar2 = this.dg;
            mswVar.ycc(emcVar2.xq ? emcVar2.ypw : Math.min(emcVar2.ypw, iYpw2));
            mswVar.ru().bw().ru("fixed");
        }
    }

    public com.bytedance.sdk.component.adexpress.dynamic.dg.msw emc(JSONObject jSONObject, com.bytedance.sdk.component.adexpress.dynamic.dg.msw mswVar) throws JSONException {
        int length;
        if (jSONObject == null) {
            return null;
        }
        String strOptString = jSONObject.optString("type");
        if (TextUtils.equals(strOptString, "custom-component-vessel")) {
            int iOptInt = jSONObject.optInt("componentId");
            if (this.ycc != null) {
                xq xqVar = new xq();
                this.bw = xqVar;
                JSONObject jSONObjectEmc = xqVar.emc(this.ycc.emc, iOptInt, jSONObject);
                if (jSONObjectEmc != null) {
                    jSONObject = jSONObjectEmc;
                }
            }
        }
        com.bytedance.sdk.component.adexpress.dynamic.dg.msw mswVarEmc = emc(jSONObject);
        mswVarEmc.emc(mswVar);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("children");
        if (jSONArrayOptJSONArray == null) {
            mswVarEmc.emc((List<com.bytedance.sdk.component.adexpress.dynamic.dg.msw>) null);
            return mswVarEmc;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            JSONArray jSONArrayOptJSONArray2 = jSONArrayOptJSONArray.optJSONArray(i);
            if (jSONArrayOptJSONArray2 != null) {
                ArrayList arrayList3 = new ArrayList();
                if (TextUtils.equals(strOptString, "tag-group")) {
                    length = mswVarEmc.ru().bw().rig();
                } else {
                    length = jSONArrayOptJSONArray2.length();
                }
                for (int i3 = 0; i3 < length; i3++) {
                    com.bytedance.sdk.component.adexpress.dynamic.dg.msw mswVarEmc2 = emc(jSONArrayOptJSONArray2.optJSONObject(i3), mswVarEmc);
                    if (com.bytedance.sdk.component.adexpress.dg.ypw() && "skip-with-time".equals(mswVarEmc.ru().ypw()) && !"transparent".equals(mswVarEmc.rie()) && !TextUtils.isEmpty(mswVarEmc.rie())) {
                        mswVarEmc2.xq(mswVarEmc.rie());
                    }
                    arrayList.add(mswVarEmc2);
                    arrayList3.add(mswVarEmc2);
                }
                arrayList2.add(arrayList3);
            }
        }
        if (arrayList.size() > 0) {
            mswVarEmc.emc(arrayList);
        }
        if (arrayList2.size() > 0) {
            mswVarEmc.ypw(arrayList2);
        }
        return mswVarEmc;
    }

    public com.bytedance.sdk.component.adexpress.dynamic.dg.msw emc(JSONObject jSONObject) throws JSONException {
        String strEmc;
        JSONObject jSONObject2;
        String strOptString = jSONObject.optString("type");
        String strOptString2 = jSONObject.optString("id");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("values");
        zz.emc(strOptString, jSONObjectOptJSONObject);
        JSONObject jSONObjectEmc = zz.emc(strOptString, zz.emc(jSONObject.optJSONArray("sceneValues")), jSONObjectOptJSONObject);
        com.bytedance.sdk.component.adexpress.dynamic.dg.msw mswVar = new com.bytedance.sdk.component.adexpress.dynamic.dg.msw();
        if (TextUtils.isEmpty(strOptString2)) {
            mswVar.ypw(String.valueOf(mswVar.hashCode()));
        } else {
            mswVar.ypw(strOptString2);
        }
        if (jSONObjectOptJSONObject != null) {
            ypw(mswVar);
            mswVar.xq((float) jSONObjectOptJSONObject.optDouble("x"));
            mswVar.dg((float) jSONObjectOptJSONObject.optDouble("y"));
            mswVar.bw((float) jSONObjectOptJSONObject.optDouble("width"));
            mswVar.ycc((float) jSONObjectOptJSONObject.optDouble("height"));
            mswVar.uym(jSONObjectOptJSONObject.optInt("remainWidth"));
            com.bytedance.sdk.component.adexpress.dynamic.dg.bw bwVar = new com.bytedance.sdk.component.adexpress.dynamic.dg.bw();
            bwVar.emc(strOptString);
            bwVar.ypw(jSONObjectOptJSONObject.optString("data"));
            bwVar.xq(jSONObjectOptJSONObject.optString("dataExtraInfo"));
            com.bytedance.sdk.component.adexpress.dynamic.dg.ycc yccVarEmc = com.bytedance.sdk.component.adexpress.dynamic.dg.ycc.emc(jSONObjectOptJSONObject);
            bwVar.emc(yccVarEmc);
            com.bytedance.sdk.component.adexpress.dynamic.dg.ycc yccVarEmc2 = com.bytedance.sdk.component.adexpress.dynamic.dg.ycc.emc(jSONObjectEmc);
            if (yccVarEmc2 == null) {
                bwVar.ypw(yccVarEmc);
            } else {
                bwVar.ypw(yccVarEmc2);
            }
            emc(yccVarEmc);
            emc(yccVarEmc2);
            if (TextUtils.equals(strOptString, "video-image-budget") && (jSONObject2 = this.ypw) != null) {
                emc(bwVar, jSONObject2.optInt("image_mode"));
            }
            String strYpw = bwVar.ypw();
            com.bytedance.sdk.component.adexpress.dynamic.dg.ycc yccVarBw = bwVar.bw();
            if (uym.containsKey(strYpw) && !yccVarBw.wd()) {
                yccVarBw.ul(uym.get(strYpw));
            }
            if (yccVarBw.wd()) {
                strEmc = bwVar.xq();
            } else {
                strEmc = emc(bwVar.xq());
            }
            if (com.bytedance.sdk.component.adexpress.dg.ypw()) {
                if (TextUtils.equals(strYpw, "star") || TextUtils.equals(strYpw, "text_star")) {
                    strEmc = emc("dynamic_creative.score_exact_i18n|");
                }
                if (TextUtils.equals(strYpw, "score-count") || TextUtils.equals(strYpw, "score-count-type-1") || TextUtils.equals(strYpw, "score-count-type-2")) {
                    strEmc = emc("dynamic_creative.comment_num_i18n|");
                }
                if ("root".equals(strYpw) && yccVarEmc.etw()) {
                    strEmc = emc("image.0.url");
                }
            }
            if (!TextUtils.isEmpty(emc()) && (TextUtils.equals("logo-union", strOptString) || TextUtils.equals("logo", strOptString))) {
                StringBuilder sbB = AbstractC2984e.b(strEmc, "adx:");
                sbB.append(emc());
                bwVar.ypw(sbB.toString());
            } else {
                bwVar.ypw(strEmc);
            }
            mswVar.emc(bwVar);
        }
        return mswVar;
    }

    private void emc(com.bytedance.sdk.component.adexpress.dynamic.dg.bw bwVar, int i) throws JSONException {
        int iLastIndexOf;
        if (i != 5 && i != 15 && i != 50 && i != 154) {
            bwVar.emc("image");
            String strEmc = zz.emc("image");
            com.bytedance.sdk.component.adexpress.dynamic.dg.ycc yccVarBw = bwVar.bw();
            yccVarBw.ul(strEmc);
            bwVar.uym().ul(strEmc);
            String strEmc2 = zz.emc("image", "clickArea");
            if (!TextUtils.isEmpty(strEmc2)) {
                yccVarBw.cf(strEmc2);
                bwVar.uym().cf(strEmc2);
            }
            JSONObject jSONObjectSx = yccVarBw.sx();
            if (jSONObjectSx != null) {
                yccVarBw.rie(jSONObjectSx.optString("imageLottieTosPath"));
                yccVarBw.sup(jSONObjectSx.optBoolean("animationsLoop"));
                yccVarBw.db(jSONObjectSx.optInt("lottieAppNameMaxLength"));
                yccVarBw.sf(jSONObjectSx.optInt("lottieAdDescMaxLength"));
                yccVarBw.sb(jSONObjectSx.optInt("lottieAdTitleMaxLength"));
            }
            bwVar.ypw(strEmc);
            if (strEmc != null && (iLastIndexOf = strEmc.lastIndexOf(".")) > 0) {
                String strSubstring = strEmc.substring(0, iLastIndexOf);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("width", emc(strSubstring + ".width"));
                    jSONObject.put("height", emc(strSubstring + ".height"));
                } catch (JSONException unused) {
                }
                bwVar.xq(jSONObject.toString());
            }
            yccVarBw.oug();
            return;
        }
        bwVar.emc("video");
        String strEmc3 = zz.emc("video");
        bwVar.bw().ul(strEmc3);
        String strEmc4 = zz.emc("video", "clickArea");
        if (!TextUtils.isEmpty(strEmc4)) {
            bwVar.bw().cf(strEmc4);
            bwVar.uym().cf(strEmc4);
        }
        bwVar.uym().ul(strEmc3);
        bwVar.ypw(strEmc3);
        bwVar.bw().av();
    }

    private String emc(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        for (String str2 : str.split("\\|")) {
            if (this.xq.ypw(str2)) {
                String strValueOf = String.valueOf(this.xq.emc(str2));
                if (!TextUtils.isEmpty(strValueOf)) {
                    return strValueOf;
                }
            }
        }
        return "";
    }

    private String emc() {
        Object objEmc;
        com.bytedance.sdk.component.adexpress.dynamic.dg.xq xqVar = this.xq;
        return (xqVar == null || (objEmc = xqVar.emc("adx_name")) == null) ? "" : String.valueOf(objEmc);
    }

    private void emc(com.bytedance.sdk.component.adexpress.dynamic.dg.ycc yccVar) {
        if (yccVar == null) {
            return;
        }
        String strDr = yccVar.dr();
        if (com.bytedance.sdk.component.adexpress.dg.ypw()) {
            String strXq = com.bytedance.sdk.component.adexpress.dg.uym.xq(com.bytedance.sdk.component.adexpress.dg.emc());
            if ("zh".equals(strXq)) {
                strXq = "cn";
            }
            if (!TextUtils.isEmpty(strXq) && yccVar.ycc() != null) {
                String strOptString = yccVar.ycc().optString(strXq);
                if (!TextUtils.isEmpty(strOptString)) {
                    strDr = strOptString;
                }
            }
        }
        if (TextUtils.isEmpty(strDr)) {
            return;
        }
        int iIndexOf = strDr.indexOf("{{");
        int iIndexOf2 = strDr.indexOf("}}");
        if (iIndexOf >= 0 && iIndexOf2 >= 0 && iIndexOf2 >= iIndexOf) {
            String strEmc = emc(strDr.substring(iIndexOf + 2, iIndexOf2));
            StringBuilder sb = new StringBuilder(strDr.substring(0, iIndexOf));
            if (!TextUtils.isEmpty(strEmc)) {
                sb.append(strEmc);
            }
            sb.append(strDr.substring(iIndexOf2 + 2));
            yccVar.sup(sb.toString());
            return;
        }
        yccVar.sup(strDr);
    }
}
