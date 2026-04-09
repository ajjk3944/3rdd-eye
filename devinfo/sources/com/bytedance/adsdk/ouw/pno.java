package com.bytedance.adsdk.ouw;

import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class pno implements bly {
    @Override // com.bytedance.adsdk.ouw.bly
    public final /* bridge */ /* synthetic */ Object ouw(JSONObject jSONObject, Object[] objArr) {
        return ouw(objArr);
    }

    private static Boolean ouw(Object[] objArr) throws NumberFormatException {
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
