package com.bytedance.adsdk.emc;

import org.json.JSONObject;

/* loaded from: classes.dex */
public class msw implements zz {
    @Override // com.bytedance.adsdk.emc.zz
    /* renamed from: ypw, reason: merged with bridge method [inline-methods] */
    public Boolean emc(JSONObject jSONObject, Object[] objArr) throws NumberFormatException {
        if (objArr == null || objArr.length <= 0) {
            return Boolean.FALSE;
        }
        try {
            Double.parseDouble(String.valueOf(objArr[0]));
            return Boolean.TRUE;
        } catch (NumberFormatException unused) {
            return Boolean.FALSE;
        }
    }
}
