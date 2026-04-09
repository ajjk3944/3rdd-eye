package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class pj0 {

    /* renamed from: a, reason: collision with root package name */
    private final bj0 f31775a;

    public /* synthetic */ pj0() {
        this(new bj0());
    }

    public final ArrayList a(JSONArray jsonArray) throws JSONException {
        kotlin.jvm.internal.l.f(jsonArray, "jsonArray");
        ArrayList arrayList = new ArrayList();
        int length = jsonArray.length();
        for (int i = 0; i < length; i++) {
            bj0 bj0Var = this.f31775a;
            JSONObject jSONObject = jsonArray.getJSONObject(i);
            kotlin.jvm.internal.l.e(jSONObject, "getJSONObject(...)");
            arrayList.add(bj0Var.b(jSONObject));
        }
        return arrayList;
    }

    public pj0(bj0 imageParser) {
        kotlin.jvm.internal.l.f(imageParser, "imageParser");
        this.f31775a = imageParser;
    }
}
