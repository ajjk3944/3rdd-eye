package com.yandex.mobile.ads.impl;

import com.github.appintro.AppIntroBaseFragmentKt;
import com.google.android.gms.common.internal.ImagesContract;
import com.yandex.mobile.ads.impl.ja0;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class la0 implements InterfaceC4228x<ja0> {

    /* renamed from: a, reason: collision with root package name */
    private final d82 f29958a;

    public la0(d82 urlJsonParser) {
        kotlin.jvm.internal.l.f(urlJsonParser, "urlJsonParser");
        this.f29958a = urlJsonParser;
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
            kotlin.jvm.internal.l.c(jSONObject);
            String strOptString = jSONObject.optString(AppIntroBaseFragmentKt.ARG_TITLE);
            if (strOptString == null || strOptString.length() == 0 || strOptString.equals("null")) {
                throw new k61("Native Ad json has not required attributes");
            }
            this.f29958a.getClass();
            arrayList.add(new ja0.a(strOptString, d82.a(ImagesContract.URL, jSONObject)));
        }
        if (arrayList.isEmpty()) {
            throw new k61("Native Ad json has not required attributes");
        }
        return new ja0(strA, arrayList);
    }
}
