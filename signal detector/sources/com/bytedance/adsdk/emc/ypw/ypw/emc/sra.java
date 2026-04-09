package com.bytedance.adsdk.emc.ypw.ypw.emc;

import A.f;
import android.text.TextUtils;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class sra implements com.bytedance.adsdk.emc.ypw.ypw.emc {
    private final String emc;

    public sra(String str) {
        this.emc = str;
    }

    @Override // com.bytedance.adsdk.emc.ypw.ypw.emc
    public Object emc(Map<String, JSONObject> map) {
        Object objEmc;
        if (map == null || map.size() <= 0 || (objEmc = emc(this.emc, map.get("default_key"))) == JSONObject.NULL) {
            return null;
        }
        return objEmc;
    }

    public String toString() {
        return f.p(new StringBuilder("VariableNode [literals="), this.emc, "]");
    }

    @Override // com.bytedance.adsdk.emc.ypw.ypw.emc
    public String ypw() {
        return this.emc;
    }

    @Override // com.bytedance.adsdk.emc.ypw.ypw.emc
    public com.bytedance.adsdk.emc.ypw.dg.bw emc() {
        return com.bytedance.adsdk.emc.ypw.dg.ycc.VARIABLE;
    }

    public Object emc(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return emc(str.split("\\."), 0, jSONObject);
    }

    private Object emc(String[] strArr, int i, JSONObject jSONObject) throws NumberFormatException {
        Object objOpt;
        if (strArr != null && strArr.length > 0 && i < strArr.length && jSONObject != null) {
            String str = strArr[i];
            int iIndexOf = str.indexOf("[");
            int iIndexOf2 = str.indexOf("]");
            if (iIndexOf >= 0 && iIndexOf2 >= 0 && iIndexOf <= iIndexOf2) {
                String strSubstring = str.substring(0, iIndexOf);
                try {
                    int i3 = Integer.parseInt(str.substring(iIndexOf + 1, iIndexOf2));
                    Object objOpt2 = jSONObject.opt(strSubstring);
                    objOpt = objOpt2 instanceof JSONArray ? ((JSONArray) objOpt2).opt(i3) : null;
                } catch (NumberFormatException unused) {
                    return null;
                }
            } else {
                objOpt = jSONObject.opt(str);
            }
            if (i == strArr.length - 1) {
                return objOpt;
            }
            if (objOpt instanceof String) {
                try {
                    return emc(strArr, i + 1, new JSONObject((String) objOpt));
                } catch (JSONException unused2) {
                    return objOpt;
                }
            }
            if (objOpt instanceof JSONObject) {
                return emc(strArr, i + 1, (JSONObject) objOpt);
            }
        }
        return null;
    }
}
