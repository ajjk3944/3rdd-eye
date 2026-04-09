package com.bytedance.adsdk.emc;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ycc implements zz {
    @Override // com.bytedance.adsdk.emc.zz
    /* renamed from: ypw, reason: merged with bridge method [inline-methods] */
    public String emc(JSONObject jSONObject, Object[] objArr) {
        if (objArr == null || objArr.length < 2) {
            return null;
        }
        String strValueOf = String.valueOf(objArr[0]);
        if (TextUtils.isEmpty(strValueOf)) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject(strValueOf);
            String strValueOf2 = String.valueOf(objArr[1]);
            if (TextUtils.isEmpty(strValueOf2)) {
                return null;
            }
            Object objEmc = com.bytedance.adsdk.emc.ypw.emc.emc(strValueOf2).emc(jSONObject2);
            if (!TextUtils.isEmpty(String.valueOf(objEmc))) {
                return String.valueOf(objEmc);
            }
            if (objArr.length >= 3) {
                return String.valueOf(objArr[2]);
            }
            return null;
        } catch (JSONException unused) {
            return null;
        }
    }
}
