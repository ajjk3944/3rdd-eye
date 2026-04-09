package com.yandex.mobile.ads.impl;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class mj0 implements mg<jj0> {

    /* renamed from: a, reason: collision with root package name */
    private final bj0 f30400a;

    public /* synthetic */ mj0() {
        this(new bj0());
    }

    @Override // com.yandex.mobile.ads.impl.mg
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final jj0 a(JSONObject jsonAsset) throws k61, JSONException {
        kotlin.jvm.internal.l.f(jsonAsset, "jsonAsset");
        if (!jsonAsset.has(AppMeasurementSdk.ConditionalUserProperty.VALUE) || jsonAsset.isNull(AppMeasurementSdk.ConditionalUserProperty.VALUE)) {
            fp0.b(new Object[0]);
            throw new k61("Native Ad json has not required attributes");
        }
        JSONObject jSONObject = jsonAsset.getJSONObject(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        bj0 bj0Var = this.f30400a;
        kotlin.jvm.internal.l.c(jSONObject);
        return bj0Var.b(jSONObject);
    }

    public mj0(bj0 imageParser) {
        kotlin.jvm.internal.l.f(imageParser, "imageParser");
        this.f30400a = imageParser;
    }
}
