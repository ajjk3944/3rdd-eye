package com.applovin.impl;

import com.applovin.impl.sdk.AppLovinError;
import com.applovin.sdk.AppLovinAdLoadListener;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class y5 extends r5 {

    /* renamed from: i, reason: collision with root package name */
    private final AppLovinAdLoadListener f6227i;

    public y5(u uVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        this(uVar, appLovinAdLoadListener, "TaskFetchNextAd", kVar);
    }

    @Override // com.applovin.impl.r5
    public i5 a(JSONObject jSONObject) {
        return new e6(jSONObject, this.g, this.f6227i, this.f4287a);
    }

    @Override // com.applovin.impl.r5
    public String e() {
        return r0.a(this.f4287a);
    }

    @Override // com.applovin.impl.r5
    public String f() {
        return r0.b(this.f4287a);
    }

    public y5(u uVar, AppLovinAdLoadListener appLovinAdLoadListener, String str, com.applovin.impl.sdk.k kVar) {
        super(uVar, str, kVar);
        this.f6227i = appLovinAdLoadListener;
    }

    @Override // com.applovin.impl.r5
    public void a(int i4, String str) {
        super.a(i4, str);
        AppLovinAdLoadListener appLovinAdLoadListener = this.f6227i;
        if (!(appLovinAdLoadListener instanceof m2)) {
            appLovinAdLoadListener.failedToReceiveAd(i4);
        } else {
            ((m2) this.f6227i).failedToReceiveAdV2(new AppLovinError(i4, str));
        }
    }
}
