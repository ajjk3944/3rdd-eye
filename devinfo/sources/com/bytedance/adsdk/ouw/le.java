package com.bytedance.adsdk.ouw;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class le implements bly {
    @Override // com.bytedance.adsdk.ouw.bly
    public final /* bridge */ /* synthetic */ Object ouw(JSONObject jSONObject, Object[] objArr) {
        return ouw(objArr);
    }

    private static String ouw(Object[] objArr) {
        if (objArr != null && objArr.length >= 2) {
            String strValueOf = String.valueOf(objArr[0]);
            if (TextUtils.isEmpty(strValueOf)) {
                return null;
            }
            try {
                JSONObject jSONObject = new JSONObject(strValueOf);
                String strValueOf2 = String.valueOf(objArr[1]);
                if (TextUtils.isEmpty(strValueOf2)) {
                    return null;
                }
                Object objOuw = com.bytedance.adsdk.ouw.vt.ouw.ouw(strValueOf2).ouw(jSONObject);
                if (!TextUtils.isEmpty(String.valueOf(objOuw))) {
                    return String.valueOf(objOuw);
                }
                if (objArr.length >= 3) {
                    return String.valueOf(objArr[2]);
                }
                return null;
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        return null;
    }
}
