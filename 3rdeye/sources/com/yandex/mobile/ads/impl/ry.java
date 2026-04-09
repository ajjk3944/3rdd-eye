package com.yandex.mobile.ads.impl;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ry implements InterfaceC4228x<py> {

    /* renamed from: a, reason: collision with root package name */
    private final d82 f32795a;

    /* renamed from: b, reason: collision with root package name */
    private final wj1 f32796b;

    public ry(d82 urlJsonParser, wj1 preferredPackagesParser) {
        kotlin.jvm.internal.l.f(urlJsonParser, "urlJsonParser");
        kotlin.jvm.internal.l.f(preferredPackagesParser, "preferredPackagesParser");
        this.f32795a = urlJsonParser;
        this.f32796b = preferredPackagesParser;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4228x
    public final InterfaceC4200t a(JSONObject jsonObject) throws k61, JSONException {
        kotlin.jvm.internal.l.f(jsonObject, "jsonObject");
        String strA = y81.a(jsonObject, "jsonAsset", "type", "jsonAttribute", "type");
        if (strA == null || strA.length() == 0 || strA.equals("null")) {
            throw new k61("Native Ad json has not required attributes");
        }
        this.f32795a.getClass();
        return new py(strA, d82.a("fallbackUrl", jsonObject), this.f32796b.a(jsonObject.optJSONArray("preferredPackages")));
    }
}
