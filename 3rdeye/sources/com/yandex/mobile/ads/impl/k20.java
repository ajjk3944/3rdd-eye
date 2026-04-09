package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class k20 implements InterfaceC4228x<InterfaceC4200t> {

    /* renamed from: a, reason: collision with root package name */
    private final a10 f29478a;

    /* renamed from: b, reason: collision with root package name */
    private final b30 f29479b;

    /* renamed from: c, reason: collision with root package name */
    private final n62 f29480c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f29481d;

    public k20(a10 designJsonParser, b30 divKitDesignParser, n62 trackingUrlsParser, boolean z10) {
        kotlin.jvm.internal.l.f(designJsonParser, "designJsonParser");
        kotlin.jvm.internal.l.f(divKitDesignParser, "divKitDesignParser");
        kotlin.jvm.internal.l.f(trackingUrlsParser, "trackingUrlsParser");
        this.f29478a = designJsonParser;
        this.f29479b = divKitDesignParser;
        this.f29480c = trackingUrlsParser;
        this.f29481d = z10;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4228x
    public final InterfaceC4200t a(JSONObject jsonObject) throws k61, JSONException {
        kotlin.jvm.internal.l.f(jsonObject, "jsonObject");
        String strA = y81.a(jsonObject, "jsonAsset", "type", "jsonAttribute", "type");
        if (strA == null || strA.length() == 0 || strA.equals("null")) {
            throw new k61("Native Ad json has not required attributes");
        }
        this.f29480c.getClass();
        JSONArray jSONArray = jsonObject.getJSONArray("trackingUrls");
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            String string = jSONArray.getString(i);
            kotlin.jvm.internal.l.c(string);
            arrayList.add(string);
        }
        JSONObject jSONObjectOptJSONObject = jsonObject.optJSONObject("design");
        v00 v00VarA = jSONObjectOptJSONObject != null ? this.f29478a.a(jSONObjectOptJSONObject) : null;
        w20 w20VarA = v00VarA != null ? this.f29479b.a(v00VarA, this.f29481d) : null;
        if (w20VarA != null) {
            return new i20(strA, w20VarA, arrayList);
        }
        throw new k61("Native Ad json has not required attributes");
    }
}
