package com.yandex.mobile.ads.impl;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class wa0 implements mg<ua0> {

    /* renamed from: a, reason: collision with root package name */
    private final mj0 f34869a;

    public wa0(mj0 imageValueParser) {
        kotlin.jvm.internal.l.f(imageValueParser, "imageValueParser");
        this.f34869a = imageValueParser;
    }

    @Override // com.yandex.mobile.ads.impl.mg
    public final ua0 a(JSONObject jsonAsset) throws k61 {
        kotlin.jvm.internal.l.f(jsonAsset, "jsonAsset");
        if (jsonAsset.has(AppMeasurementSdk.ConditionalUserProperty.VALUE)) {
            return new ua0(!jsonAsset.isNull(AppMeasurementSdk.ConditionalUserProperty.VALUE) ? this.f34869a.a(jsonAsset) : null);
        }
        fp0.b(new Object[0]);
        throw new k61("Native Ad json has not required attributes");
    }
}
