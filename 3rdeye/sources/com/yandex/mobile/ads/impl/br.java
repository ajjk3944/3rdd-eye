package com.yandex.mobile.ads.impl;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class br {

    /* renamed from: a, reason: collision with root package name */
    private final el0 f25368a;

    public /* synthetic */ br() {
        this(new el0());
    }

    public final cb0 a(String conditionKey, JSONObject jsonNativeAd) throws k61, JSONException {
        kotlin.jvm.internal.l.f(jsonNativeAd, "jsonNativeAd");
        kotlin.jvm.internal.l.f(conditionKey, "conditionKey");
        JSONObject jSONObject = jsonNativeAd.getJSONObject(conditionKey);
        el0 el0Var = this.f25368a;
        kotlin.jvm.internal.l.c(jSONObject);
        return new cb0(el0Var.a(jSONObject));
    }

    public br(el0 installedPackagesJsonParser) {
        kotlin.jvm.internal.l.f(installedPackagesJsonParser, "installedPackagesJsonParser");
        this.f25368a = installedPackagesJsonParser;
    }
}
