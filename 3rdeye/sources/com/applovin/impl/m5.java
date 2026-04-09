package com.applovin.impl;

import com.applovin.impl.sdk.AppLovinError;
import com.applovin.sdk.AppLovinAdLoadListener;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class m5 extends f5 {
    private final AppLovinAdLoadListener i;

    public m5(C2145t c2145t, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        this(c2145t, appLovinAdLoadListener, "TaskFetchNextAd", kVar);
    }

    @Override // com.applovin.impl.f5
    public w4 a(JSONObject jSONObject) {
        return new s5(jSONObject, this.f19351g, this.i, this.f21692a);
    }

    @Override // com.applovin.impl.f5
    public String e() {
        return AbstractC2135n0.a(this.f21692a);
    }

    @Override // com.applovin.impl.f5
    public String f() {
        return AbstractC2135n0.b(this.f21692a);
    }

    public m5(C2145t c2145t, AppLovinAdLoadListener appLovinAdLoadListener, String str, com.applovin.impl.sdk.k kVar) {
        super(c2145t, str, kVar);
        this.i = appLovinAdLoadListener;
    }

    @Override // com.applovin.impl.f5
    public void a(int i, String str) {
        super.a(i, str);
        AppLovinAdLoadListener appLovinAdLoadListener = this.i;
        if (!(appLovinAdLoadListener instanceof g2)) {
            appLovinAdLoadListener.failedToReceiveAd(i);
        } else {
            ((g2) this.i).failedToReceiveAdV2(new AppLovinError(i, str));
        }
    }
}
