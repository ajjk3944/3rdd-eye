package com.bytedance.adsdk.emc;

import org.json.JSONObject;

/* loaded from: classes.dex */
public class qh implements zz {
    @Override // com.bytedance.adsdk.emc.zz
    /* renamed from: ypw, reason: merged with bridge method [inline-methods] */
    public String emc(JSONObject jSONObject, Object[] objArr) {
        Object obj;
        if (objArr == null || objArr.length == 0 || (obj = objArr[0]) == null) {
            return null;
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof Number) {
            return obj.toString();
        }
        if (obj instanceof Boolean) {
            return obj.toString();
        }
        return null;
    }
}
