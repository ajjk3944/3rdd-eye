package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.InstreamAdRequestConfiguration;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes3.dex */
public final class xl2 implements bi2 {

    /* renamed from: a, reason: collision with root package name */
    private final InstreamAdRequestConfiguration f35349a;

    public xl2(InstreamAdRequestConfiguration adRequestConfiguration) {
        kotlin.jvm.internal.l.f(adRequestConfiguration, "adRequestConfiguration");
        this.f35349a = adRequestConfiguration;
    }

    @Override // com.yandex.mobile.ads.impl.bi2
    public final String a() {
        return this.f35349a.getPageId();
    }

    @Override // com.yandex.mobile.ads.impl.bi2
    public final String b() {
        return this.f35349a.getCategoryId();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xl2) && kotlin.jvm.internal.l.b(this.f35349a, ((xl2) obj).f35349a);
    }

    @Override // com.yandex.mobile.ads.impl.bi2
    public final Map<String, String> getParameters() {
        Map<String, String> parameters = this.f35349a.getParameters();
        if (parameters != null) {
            return parameters;
        }
        Map<String, String> map = Collections.EMPTY_MAP;
        kotlin.jvm.internal.l.e(map, "emptyMap(...)");
        return map;
    }

    public final int hashCode() {
        return this.f35349a.hashCode();
    }

    public final String toString() {
        return "YandexInstreamAdRequestConfigurationAdapter(adRequestConfiguration=" + this.f35349a + ")";
    }
}
