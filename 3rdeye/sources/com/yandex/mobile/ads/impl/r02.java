package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class r02 implements InterfaceC4228x<k02> {

    /* renamed from: a, reason: collision with root package name */
    private final qj f32398a;

    /* renamed from: b, reason: collision with root package name */
    private final o02 f32399b;

    public r02(mp1 reporter, qj base64EncodingParameters, o02 itemParser) {
        kotlin.jvm.internal.l.f(reporter, "reporter");
        kotlin.jvm.internal.l.f(base64EncodingParameters, "base64EncodingParameters");
        kotlin.jvm.internal.l.f(itemParser, "itemParser");
        this.f32398a = base64EncodingParameters;
        this.f32399b = itemParser;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4228x
    public final InterfaceC4200t a(JSONObject jsonObject) throws k61, JSONException {
        kotlin.jvm.internal.l.f(jsonObject, "jsonObject");
        String strA = y81.a(jsonObject, "jsonAsset", "type", "jsonAttribute", "type");
        if (strA == null || strA.length() == 0 || strA.equals("null")) {
            throw new k61("Native Ad json has not required attributes");
        }
        JSONArray jSONArray = jsonObject.getJSONArray("items");
        kotlin.jvm.internal.l.c(jSONArray);
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            o02 o02Var = this.f32399b;
            kotlin.jvm.internal.l.c(jSONObject);
            arrayList.add(o02Var.a(jSONObject, this.f32398a));
        }
        if (arrayList.isEmpty()) {
            throw new k61("Native Ad json has not required attributes");
        }
        return new k02(strA, arrayList);
    }
}
