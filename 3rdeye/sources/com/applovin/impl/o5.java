package com.applovin.impl;

import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class o5 extends m5 {

    /* renamed from: j, reason: collision with root package name */
    private final C2125j f20629j;

    public o5(C2125j c2125j, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        super(C2145t.a("adtoken_zone"), appLovinAdLoadListener, "TaskFetchTokenAd", kVar);
        this.f20629j = c2125j;
    }

    @Override // com.applovin.impl.f5
    public Map h() {
        HashMap map = new HashMap(2);
        map.put("adtoken", this.f20629j.b());
        map.put("adtoken_prefix", this.f20629j.d());
        return map;
    }
}
