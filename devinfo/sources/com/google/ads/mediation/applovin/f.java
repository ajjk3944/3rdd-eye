package com.google.ads.mediation.applovin;

import android.content.Context;
import com.applovin.mediation.BuildConfig;
import com.applovin.sdk.AppLovinMediationProvider;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkInitializationConfiguration;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: b, reason: collision with root package name */
    public static f f8979b;

    /* renamed from: a, reason: collision with root package name */
    public final m f8980a = new m();

    public final void a(Context context, String str, e eVar) {
        AppLovinSdk.getInstance(context).initialize(AppLovinSdkInitializationConfiguration.builder(str).setMediationProvider(AppLovinMediationProvider.ADMOB).setPluginVersion(BuildConfig.ADAPTER_VERSION).build(), new d(eVar));
    }

    public final AppLovinSdk b(Context context) {
        this.f8980a.getClass();
        return AppLovinSdk.getInstance(context);
    }
}
