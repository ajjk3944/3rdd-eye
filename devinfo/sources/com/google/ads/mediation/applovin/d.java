package com.google.ads.mediation.applovin;

import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d implements AppLovinSdk.SdkInitializationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f8978a;

    public d(e eVar) {
        this.f8978a = eVar;
    }

    @Override // com.applovin.sdk.AppLovinSdk.SdkInitializationListener
    public final void onSdkInitialized(AppLovinSdkConfiguration appLovinSdkConfiguration) {
        this.f8978a.onInitializeSuccess();
    }
}
