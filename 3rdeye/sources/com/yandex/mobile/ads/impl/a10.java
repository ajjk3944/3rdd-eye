package com.yandex.mobile.ads.impl;

import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class a10 {

    /* renamed from: a, reason: collision with root package name */
    private final pj0 f24363a;

    public /* synthetic */ a10() {
        this(new pj0());
    }

    public final v00 a(JSONObject jsonObject) {
        kotlin.jvm.internal.l.f(jsonObject, "jsonObject");
        String strOptString = jsonObject.optString("type");
        String strOptString2 = jsonObject.optString("target");
        String strOptString3 = jsonObject.optString("layout");
        if (strOptString == null || strOptString.length() == 0 || strOptString2 == null || strOptString2.length() == 0 || strOptString3 == null || strOptString3.length() == 0) {
            return null;
        }
        JSONArray jSONArrayOptJSONArray = jsonObject.optJSONArray("images");
        return new v00(strOptString, strOptString2, strOptString3, jSONArrayOptJSONArray != null ? this.f24363a.a(jSONArrayOptJSONArray) : null);
    }

    public a10(pj0 imageValuesParser) {
        kotlin.jvm.internal.l.f(imageValuesParser, "imageValuesParser");
        this.f24363a = imageValuesParser;
    }
}
