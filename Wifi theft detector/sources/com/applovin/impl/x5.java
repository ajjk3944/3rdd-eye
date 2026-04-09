package com.applovin.impl;

import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class x5 extends z5 {

    /* renamed from: j, reason: collision with root package name */
    private final k f8636j;

    public x5(k kVar, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, com.applovin.impl.sdk.k kVar2) {
        super(u.a("adtoken_zone"), "TaskFetchNativeTokenAd", appLovinNativeAdLoadListener, kVar2);
        this.f8636j = kVar;
    }

    @Override // com.applovin.impl.r5
    public Map h() {
        HashMap map = new HashMap(2);
        map.put("adtoken", this.f8636j.b());
        map.put("adtoken_prefix", this.f8636j.d());
        return map;
    }
}
