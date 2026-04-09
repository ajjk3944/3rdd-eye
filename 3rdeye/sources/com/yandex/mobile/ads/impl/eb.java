package com.yandex.mobile.ads.impl;

import com.google.android.gms.common.internal.ImagesContract;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class eb implements InterfaceC4228x<InterfaceC4200t> {

    /* renamed from: a, reason: collision with root package name */
    private final d82 f26769a;

    /* renamed from: b, reason: collision with root package name */
    private final n62 f26770b;

    public eb(d82 urlJsonParser, n62 trackingUrlsParser) {
        kotlin.jvm.internal.l.f(urlJsonParser, "urlJsonParser");
        kotlin.jvm.internal.l.f(trackingUrlsParser, "trackingUrlsParser");
        this.f26769a = urlJsonParser;
        this.f26770b = trackingUrlsParser;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4228x
    public final InterfaceC4200t a(JSONObject jsonObject) throws k61, JSONException {
        kotlin.jvm.internal.l.f(jsonObject, "jsonObject");
        String strA = y81.a(jsonObject, "jsonAsset", "type", "jsonAttribute", "type");
        if (strA == null || strA.length() == 0 || strA.equals("null")) {
            throw new k61("Native Ad json has not required attributes");
        }
        this.f26769a.getClass();
        String strA2 = d82.a(ImagesContract.URL, jsonObject);
        String strA3 = jq0.a("optOutUrl", jsonObject);
        if (strA3 == null) {
            strA3 = "";
        }
        this.f26770b.getClass();
        JSONArray jSONArray = jsonObject.getJSONArray("trackingUrls");
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            String string = jSONArray.getString(i);
            kotlin.jvm.internal.l.c(string);
            arrayList.add(string);
        }
        return new cb(strA, strA2, strA3, arrayList);
    }
}
