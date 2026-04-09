package com.yandex.mobile.ads.impl;

import org.json.JSONException;
import org.json.JSONObject;
import p9.InterfaceC5480a;

/* loaded from: classes3.dex */
public final class sa {

    /* renamed from: a, reason: collision with root package name */
    private final mp1 f32917a;

    public static final class a extends kotlin.jvm.internal.m implements InterfaceC5480a<String> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ JSONObject f32918b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(JSONObject jSONObject) {
            super(0);
            this.f32918b = jSONObject;
        }

        @Override // p9.InterfaceC5480a
        public final String invoke() {
            JSONObject additionalInfoJson = this.f32918b;
            kotlin.jvm.internal.l.e(additionalInfoJson, "$additionalInfoJson");
            return jq0.a("skuId", additionalInfoJson);
        }
    }

    public sa(mp1 reporter) {
        kotlin.jvm.internal.l.f(reporter, "reporter");
        this.f32917a = reporter;
    }

    public final ra a(JSONObject jsonNativeAd, ar1 currentAdType) throws k61, JSONException {
        kotlin.jvm.internal.l.f(jsonNativeAd, "jsonNativeAd");
        kotlin.jvm.internal.l.f(currentAdType, "currentAdType");
        try {
            JSONObject jSONObject = jsonNativeAd.getJSONObject("additionalInfo");
            ar1 ar1Var = ar1.f24801e;
            Object objInvoke = new a(jSONObject).invoke();
            if (currentAdType == ar1Var && objInvoke == null) {
                throw new k61("Native Ad json has not required attributes");
            }
            return new ra((String) objInvoke);
        } catch (k61 e4) {
            this.f32917a.reportError("Failed to create AdInfo", e4);
            return null;
        }
    }
}
