package com.bytedance.adsdk.ouw.vt.vt.ouw;

import android.text.TextUtils;
import d.h;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class vpp implements com.bytedance.adsdk.ouw.vt.vt.ouw {
    private final String ouw;

    public vpp(String str) {
        this.ouw = str;
    }

    @Override // com.bytedance.adsdk.ouw.vt.vt.ouw
    public final Object ouw(Map<String, JSONObject> map) {
        if (map == null || map.size() <= 0) {
            return null;
        }
        String str = this.ouw;
        Object objOuw = TextUtils.isEmpty(str) ? null : ouw(str.split("\\."), 0, map.get("default_key"));
        if (objOuw == JSONObject.NULL) {
            return null;
        }
        return objOuw;
    }

    public final String toString() {
        return h.w(new StringBuilder("VariableNode [literals="), this.ouw, "]");
    }

    @Override // com.bytedance.adsdk.ouw.vt.vt.ouw
    public final String vt() {
        return this.ouw;
    }

    @Override // com.bytedance.adsdk.ouw.vt.vt.ouw
    public final com.bytedance.adsdk.ouw.vt.yu.fkw ouw() {
        return com.bytedance.adsdk.ouw.vt.yu.le.VARIABLE;
    }

    private Object ouw(String[] strArr, int i4, JSONObject jSONObject) throws NumberFormatException {
        Object objOpt;
        while (strArr != null && strArr.length > 0 && i4 < strArr.length && jSONObject != null) {
            String str = strArr[i4];
            int iIndexOf = str.indexOf("[");
            int iIndexOf2 = str.indexOf("]");
            if (iIndexOf >= 0 && iIndexOf2 >= 0 && iIndexOf <= iIndexOf2) {
                String strSubstring = str.substring(0, iIndexOf);
                try {
                    int i10 = Integer.parseInt(str.substring(iIndexOf + 1, iIndexOf2));
                    Object objOpt2 = jSONObject.opt(strSubstring);
                    objOpt = objOpt2 instanceof JSONArray ? ((JSONArray) objOpt2).opt(i10) : null;
                } catch (NumberFormatException e2) {
                    e2.printStackTrace();
                    return null;
                }
            } else {
                objOpt = jSONObject.opt(str);
            }
            if (i4 != strArr.length - 1) {
                if (objOpt instanceof String) {
                    try {
                        return ouw(strArr, i4 + 1, new JSONObject((String) objOpt));
                    } catch (JSONException e10) {
                        e10.printStackTrace();
                        return objOpt;
                    }
                }
                if (!(objOpt instanceof JSONObject)) {
                    break;
                }
                i4++;
                jSONObject = (JSONObject) objOpt;
            } else {
                return objOpt;
            }
        }
        return null;
    }
}
