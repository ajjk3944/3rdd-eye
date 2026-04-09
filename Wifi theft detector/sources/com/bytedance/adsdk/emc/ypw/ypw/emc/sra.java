package com.bytedance.adsdk.emc.ypw.ypw.emc;

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
        return "VariableNode [literals=" + this.emc + "]";
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

    private Object emc(String[] strArr, int i10, JSONObject jSONObject) throws NumberFormatException {
        Object objOpt;
        if (strArr != null && strArr.length > 0 && i10 < strArr.length && jSONObject != null) {
            String str = strArr[i10];
            int iIndexOf = str.indexOf("[");
            int iIndexOf2 = str.indexOf("]");
            if (iIndexOf >= 0 && iIndexOf2 >= 0 && iIndexOf <= iIndexOf2) {
                String strSubstring = str.substring(0, iIndexOf);
                try {
                    int i11 = Integer.parseInt(str.substring(iIndexOf + 1, iIndexOf2));
                    Object objOpt2 = jSONObject.opt(strSubstring);
                    objOpt = objOpt2 instanceof JSONArray ? ((JSONArray) objOpt2).opt(i11) : null;
                } catch (NumberFormatException unused) {
                    return null;
                }
            } else {
                objOpt = jSONObject.opt(str);
            }
            if (i10 == strArr.length - 1) {
                return objOpt;
            }
            if (objOpt instanceof String) {
                try {
                    return emc(strArr, i10 + 1, new JSONObject((String) objOpt));
                } catch (JSONException unused2) {
                    return objOpt;
                }
            }
            if (objOpt instanceof JSONObject) {
                return emc(strArr, i10 + 1, (JSONObject) objOpt);
            }
        }
        return null;
    }
}
