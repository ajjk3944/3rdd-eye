package com.bytedance.adsdk.emc;

import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class emc implements zz {
    @Override // com.bytedance.adsdk.emc.zz
    public Object emc(JSONObject jSONObject, Object[] objArr) {
        if (objArr == null || objArr.length != 2) {
            return null;
        }
        String strValueOf = String.valueOf(objArr[0]);
        JSONArray jSONArray = new JSONArray();
        try {
            JSONArray jSONArray2 = new JSONArray(strValueOf);
            int i = Integer.parseInt(String.valueOf(objArr[1]));
            for (int i3 = 0; i3 < jSONArray2.length(); i3 += i) {
                JSONObject jSONObject2 = new JSONObject();
                JSONArray jSONArray3 = new JSONArray();
                for (int i6 = 0; i6 < i; i6++) {
                    int i7 = i3 + i6;
                    if (i7 >= jSONArray2.length()) {
                        break;
                    }
                    jSONArray3.put(jSONArray2.optJSONObject(i7));
                }
                jSONObject2.put("$chunk", jSONArray3);
                jSONArray.put(jSONObject2);
            }
        } catch (Throwable unused) {
        }
        return jSONArray;
    }
}
