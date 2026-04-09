package com.applovin.impl;

import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class l5 extends n5 {

    /* renamed from: j, reason: collision with root package name */
    private final C2125j f20084j;

    public l5(C2125j c2125j, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, com.applovin.impl.sdk.k kVar) {
        super(C2145t.a("adtoken_zone"), "TaskFetchNativeTokenAd", appLovinNativeAdLoadListener, kVar);
        this.f20084j = c2125j;
    }

    @Override // com.applovin.impl.f5
    public Map h() {
        HashMap map = new HashMap(2);
        map.put("adtoken", this.f20084j.b());
        map.put("adtoken_prefix", this.f20084j.d());
        return map;
    }
}
