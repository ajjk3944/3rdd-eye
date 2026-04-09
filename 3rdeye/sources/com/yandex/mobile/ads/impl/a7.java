package com.yandex.mobile.ads.impl;

import com.monetization.ads.quality.base.model.configuration.AdQualityVerifiableNetwork;
import com.yandex.mobile.ads.impl.l6;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class a7 {
    public static p6 a(n6 sdkAdQualityConfiguration) {
        l6 next;
        kotlin.jvm.internal.l.f(sdkAdQualityConfiguration, "sdkAdQualityConfiguration");
        int iG = sdkAdQualityConfiguration.g();
        boolean zE = sdkAdQualityConfiguration.e();
        boolean zC = sdkAdQualityConfiguration.c();
        Map<String, o6> mapA = sdkAdQualityConfiguration.a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> it = mapA.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            l6.a aVar = l6.f29895c;
            String value = (String) entry.getKey();
            aVar.getClass();
            kotlin.jvm.internal.l.f(value, "value");
            Iterator<l6> it2 = l6.a().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (kotlin.jvm.internal.l.b(next.b(), value)) {
                    break;
                }
            }
            AdQualityVerifiableNetwork adQualityVerifiableNetworkA = l6.a.a(next);
            if (adQualityVerifiableNetworkA != null) {
                linkedHashMap.put(adQualityVerifiableNetworkA, new y6(((o6) entry.getValue()).a(), ((o6) entry.getValue()).b()));
            }
        }
        return new p6(iG, zE, zC, linkedHashMap, sdkAdQualityConfiguration.f());
    }
}
