package com.yandex.mobile.ads.impl;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class mj implements b92 {

    /* renamed from: a, reason: collision with root package name */
    private final lj f30399a;

    public mj(lj base64Decoder) {
        kotlin.jvm.internal.l.f(base64Decoder, "base64Decoder");
        this.f30399a = base64Decoder;
    }

    @Override // com.yandex.mobile.ads.impl.b92
    public final String a(String key, JSONObject jsonObject) throws k61, JSONException {
        kotlin.jvm.internal.l.f(jsonObject, "jsonObject");
        kotlin.jvm.internal.l.f(key, "key");
        String strA = y81.a(jsonObject, "jsonAsset", key, "jsonAttribute", key);
        if (strA == null || strA.length() == 0 || strA.equals("null")) {
            throw new k61("Native Ad json has not required attributes");
        }
        this.f30399a.getClass();
        String strB = lj.b(strA);
        if (strB == null || strB.length() == 0) {
            throw new k61("Native Ad json has attribute with broken base64 encoding");
        }
        return strB;
    }
}
