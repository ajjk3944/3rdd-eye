package com.yandex.mobile.ads.impl;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class cw0 {

    /* renamed from: a, reason: collision with root package name */
    private final b92 f25781a;

    public cw0(b92 valueReader) {
        kotlin.jvm.internal.l.f(valueReader, "valueReader");
        this.f25781a = valueReader;
    }

    public final Object a(JSONObject jsonValue) {
        kotlin.jvm.internal.l.f(jsonValue, "jsonValue");
        String strA = this.f25781a.a("html", jsonValue);
        float f10 = (float) jsonValue.getDouble("aspectRatio");
        if (f10 == 0.0f) {
            f10 = 1.7777778f;
        }
        return new ku0(strA, f10);
    }
}
