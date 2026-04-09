package com.yandex.mobile.ads.impl;

import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.StartupParamsItem;
import java.util.Map;

/* renamed from: com.yandex.mobile.ads.impl.if, reason: invalid class name */
/* loaded from: classes3.dex */
public final class Cif implements StartupParamsCallback {

    /* renamed from: a, reason: collision with root package name */
    private final ef f28655a;

    public Cif(ef appMetricaStartupParamsCallback) {
        kotlin.jvm.internal.l.f(appMetricaStartupParamsCallback, "appMetricaStartupParamsCallback");
        this.f28655a = appMetricaStartupParamsCallback;
    }

    @Override // io.appmetrica.analytics.StartupParamsCallback
    public final void onReceive(StartupParamsCallback.Result result) {
        Map<String, StartupParamsItem> map;
        StartupParamsItem startupParamsItem;
        Map<String, StartupParamsItem> map2;
        StartupParamsItem startupParamsItem2;
        Map<String, StartupParamsItem> map3;
        StartupParamsItem startupParamsItem3;
        ef efVar = this.f28655a;
        String id = null;
        String id2 = (result == null || (map3 = result.parameters) == null || (startupParamsItem3 = map3.get(StartupParamsCallback.APPMETRICA_UUID)) == null) ? null : startupParamsItem3.getId();
        String id3 = (result == null || (map2 = result.parameters) == null || (startupParamsItem2 = map2.get(StartupParamsCallback.APPMETRICA_DEVICE_ID)) == null) ? null : startupParamsItem2.getId();
        if (result != null && (map = result.parameters) != null && (startupParamsItem = map.get("appmetrica_get_ad_url")) != null) {
            id = startupParamsItem.getId();
        }
        efVar.a(new cf(id2, id3, id));
    }

    @Override // io.appmetrica.analytics.StartupParamsCallback
    public final void onRequestError(StartupParamsCallback.Reason reason, StartupParamsCallback.Result result) {
        kotlin.jvm.internal.l.f(reason, "reason");
        this.f28655a.a(reason.equals(StartupParamsCallback.Reason.NETWORK) ? df.f26154c : reason.equals(StartupParamsCallback.Reason.INVALID_RESPONSE) ? df.f26155d : df.f26153b);
    }
}
