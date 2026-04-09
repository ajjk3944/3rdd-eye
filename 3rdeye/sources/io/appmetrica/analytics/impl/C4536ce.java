package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.ce, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4536ce implements InterfaceC4934s {
    @Override // io.appmetrica.analytics.impl.InterfaceC4934s
    public final Map<String, String> a(Map<String, String> map) {
        map.put(AdRevenueConstants.LAYER_KEY, "native");
        return map;
    }
}
