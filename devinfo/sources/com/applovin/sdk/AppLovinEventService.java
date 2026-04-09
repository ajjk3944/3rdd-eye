package com.applovin.sdk;

import android.content.Intent;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public interface AppLovinEventService {
    void trackCheckout(String str, Map<String, String> map);

    void trackEvent(String str);

    void trackEvent(String str, Map<String, ?> map);

    void trackEvent(String str, Map<String, ?> map, Map<String, Object> map2);

    void trackInAppPurchase(Intent intent, Map<String, String> map);
}
