package com.yandex.mobile.ads.impl;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class nd1 implements mg<String> {

    /* renamed from: a, reason: collision with root package name */
    private final lr1 f30846a;

    public nd1(lr1 reviewCountFormatter) {
        kotlin.jvm.internal.l.f(reviewCountFormatter, "reviewCountFormatter");
        this.f30846a = reviewCountFormatter;
    }

    @Override // com.yandex.mobile.ads.impl.mg
    public final String a(JSONObject jsonAsset) throws k61 {
        kotlin.jvm.internal.l.f(jsonAsset, "jsonAsset");
        String strA = y81.a(jsonAsset, "jsonAsset", AppMeasurementSdk.ConditionalUserProperty.NAME, "jsonAttribute", AppMeasurementSdk.ConditionalUserProperty.NAME);
        if (strA == null || strA.length() == 0 || strA.equals("null")) {
            throw new k61("Native Ad json has not required attributes");
        }
        String strOptString = jsonAsset.optString(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        if (strOptString == null || strOptString.length() == 0 || strOptString.equals("null")) {
            throw new k61("Native Ad json has not required attributes");
        }
        return "review_count".equals(strA) ? this.f30846a.a(strOptString) : strOptString;
    }
}
