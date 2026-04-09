package com.yandex.mobile.ads.impl;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class o02 {

    /* renamed from: a, reason: collision with root package name */
    private final jr0 f31120a;

    /* renamed from: b, reason: collision with root package name */
    private final q02 f31121b;

    public /* synthetic */ o02(jr0 jr0Var) {
        this(jr0Var, new q02());
    }

    public final n02 a(JSONObject jsonObject, qj base64EncodingParameters) throws k61, JSONException {
        kotlin.jvm.internal.l.f(jsonObject, "jsonObject");
        kotlin.jvm.internal.l.f(base64EncodingParameters, "base64EncodingParameters");
        String strA = y81.a(jsonObject, "jsonAsset", AppMeasurementSdk.ConditionalUserProperty.NAME, "jsonAttribute", AppMeasurementSdk.ConditionalUserProperty.NAME);
        if (strA == null || strA.length() == 0 || strA.equals("null")) {
            throw new k61("Native Ad json has not required attributes");
        }
        JSONObject jSONObject = jsonObject.getJSONObject("link");
        jr0 jr0Var = this.f31120a;
        kotlin.jvm.internal.l.c(jSONObject);
        ir0 ir0VarA = jr0Var.a(jSONObject, base64EncodingParameters);
        JSONObject jSONObject2 = jsonObject.getJSONObject(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        q02 q02Var = this.f31121b;
        kotlin.jvm.internal.l.c(jSONObject2);
        return new n02(ir0VarA, strA, q02Var.a(jSONObject2));
    }

    public o02(jr0 linkJsonParser, q02 valueParser) {
        kotlin.jvm.internal.l.f(linkJsonParser, "linkJsonParser");
        kotlin.jvm.internal.l.f(valueParser, "valueParser");
        this.f31120a = linkJsonParser;
        this.f31121b = valueParser;
    }
}
