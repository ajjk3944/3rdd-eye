package com.bytedance.adsdk.ouw;

import android.text.TextUtils;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ko implements bly {
    @Override // com.bytedance.adsdk.ouw.bly
    public final Object ouw(JSONObject jSONObject, Object[] objArr) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        if (objArr == null || objArr.length != 0) {
            return null;
        }
        String strValueOf = String.valueOf(objArr[2]);
        String strValueOf2 = String.valueOf(objArr[1]);
        String strValueOf3 = String.valueOf(objArr[0]);
        if (!TextUtils.isEmpty(strValueOf3) && jSONObject != null && (jSONObjectOptJSONObject = jSONObject.optJSONObject("i18n")) != null && (jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(strValueOf2)) != null) {
            String strOptString = jSONObjectOptJSONObject2.optString(strValueOf3);
            if (!TextUtils.isEmpty(strOptString)) {
                return strOptString;
            }
        }
        return strValueOf;
    }
}
