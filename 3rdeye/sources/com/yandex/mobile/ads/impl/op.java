package com.yandex.mobile.ads.impl;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.yandex.mobile.ads.impl.np;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class op implements mg<np> {
    @Override // com.yandex.mobile.ads.impl.mg
    public final np a(JSONObject jsonAsset) throws k61 {
        kotlin.jvm.internal.l.f(jsonAsset, "jsonAsset");
        if (jsonAsset.has(AppMeasurementSdk.ConditionalUserProperty.VALUE) && jsonAsset.isNull(AppMeasurementSdk.ConditionalUserProperty.VALUE)) {
            return new np(np.a.f30965c, null);
        }
        np.a aVar = np.a.f30964b;
        String strA = y81.a(jsonAsset, "jsonAsset", AppMeasurementSdk.ConditionalUserProperty.VALUE, "jsonAttribute", AppMeasurementSdk.ConditionalUserProperty.VALUE);
        if (strA == null || strA.length() == 0 || strA.equals("null")) {
            throw new k61("Native Ad json has not required attributes");
        }
        return new np(aVar, strA);
    }
}
