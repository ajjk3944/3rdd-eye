package com.bytedance.adsdk.emc;

import android.text.TextUtils;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class bw implements zz {
    @Override // com.bytedance.adsdk.emc.zz
    public Object emc(JSONObject jSONObject, Object[] objArr) {
        if (objArr != null && objArr.length > 0) {
            for (Object obj : objArr) {
                String strValueOf = String.valueOf(obj);
                if (!TextUtils.isEmpty(strValueOf) && !TextUtils.equals(strValueOf, "null")) {
                    return strValueOf;
                }
            }
        }
        return null;
    }
}
