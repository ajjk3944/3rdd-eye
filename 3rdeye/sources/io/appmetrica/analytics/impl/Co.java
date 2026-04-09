package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import java.util.Map;

/* loaded from: classes3.dex */
public final class Co implements InterfaceC4934s {
    @Override // io.appmetrica.analytics.impl.InterfaceC4934s
    public final Map<String, String> a(Map<String, String> map) {
        map.put(AdRevenueConstants.SOURCE_KEY, "yandex");
        return map;
    }
}
