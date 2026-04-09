package com.bytedance.adsdk.ouw;

import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ouw implements bly {
    @Override // com.bytedance.adsdk.ouw.bly
    public final Object ouw(JSONObject jSONObject, Object[] objArr) {
        if (objArr == null || objArr.length != 2) {
            return null;
        }
        String strValueOf = String.valueOf(objArr[0]);
        JSONArray jSONArray = new JSONArray();
        try {
            JSONArray jSONArray2 = new JSONArray(strValueOf);
            int i4 = Integer.parseInt(String.valueOf(objArr[1]));
            for (int i10 = 0; i10 < jSONArray2.length(); i10 += i4) {
                JSONObject jSONObject2 = new JSONObject();
                JSONArray jSONArray3 = new JSONArray();
                for (int i11 = 0; i11 < i4; i11++) {
                    int i12 = i10 + i11;
                    if (i12 >= jSONArray2.length()) {
                        break;
                    }
                    jSONArray3.put(jSONArray2.optJSONObject(i12));
                }
                jSONObject2.put("$chunk", jSONArray3);
                jSONArray.put(jSONObject2);
            }
        } catch (Throwable unused) {
        }
        return jSONArray;
    }
}
