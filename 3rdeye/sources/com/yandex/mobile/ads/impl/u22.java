package com.yandex.mobile.ads.impl;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class u22 implements mg<String> {
    @Override // com.yandex.mobile.ads.impl.mg
    public final String a(JSONObject jsonAsset) throws k61 {
        kotlin.jvm.internal.l.f(jsonAsset, "jsonAsset");
        String strA = y81.a(jsonAsset, "jsonAsset", AppMeasurementSdk.ConditionalUserProperty.VALUE, "jsonAttribute", AppMeasurementSdk.ConditionalUserProperty.VALUE);
        if (strA == null || strA.length() == 0 || strA.equals("null")) {
            throw new k61("Native Ad json has not required attributes");
        }
        return strA;
    }
}
