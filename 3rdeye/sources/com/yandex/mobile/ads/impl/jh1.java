package com.yandex.mobile.ads.impl;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class jh1 implements b92 {
    @Override // com.yandex.mobile.ads.impl.b92
    public final String a(String key, JSONObject jsonObject) throws k61, JSONException {
        kotlin.jvm.internal.l.f(jsonObject, "jsonObject");
        kotlin.jvm.internal.l.f(key, "key");
        String strA = y81.a(jsonObject, "jsonAsset", key, "jsonAttribute", key);
        if (strA == null || strA.length() == 0 || strA.equals("null")) {
            throw new k61("Native Ad json has not required attributes");
        }
        return strA;
    }
}
