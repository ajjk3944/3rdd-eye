package com.yandex.mobile.ads.impl;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class d82 {
    public static String a(String key, JSONObject jsonObject) throws k61, JSONException {
        kotlin.jvm.internal.l.f(jsonObject, "jsonObject");
        kotlin.jvm.internal.l.f(key, "key");
        String strA = y81.a(jsonObject, "jsonAsset", key, "jsonAttribute", key);
        if (strA == null || strA.length() == 0 || strA.equals("null")) {
            throw new k61("Native Ad json has not required attributes");
        }
        if (strA.length() != 0) {
            return strA;
        }
        throw new k61("Native Ad json has not required attributes");
    }
}
