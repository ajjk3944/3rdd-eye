package com.google.ads.mediation.applovin;

import android.content.Context;
import com.applovin.mediation.BuildConfig;
import com.applovin.sdk.AppLovinMediationProvider;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinSdkInitializationConfiguration;

/* loaded from: classes.dex */
public class d {

    /* renamed from: b, reason: collision with root package name */
    public static d f9483b;

    /* renamed from: a, reason: collision with root package name */
    public final h f9484a = new h();

    public class a implements AppLovinSdk.SdkInitializationListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b f9485a;

        public a(b bVar) {
            this.f9485a = bVar;
        }

        @Override // com.applovin.sdk.AppLovinSdk.SdkInitializationListener
        public void onSdkInitialized(AppLovinSdkConfiguration appLovinSdkConfiguration) {
            this.f9485a.onInitializeSuccess();
        }
    }

    public interface b {
        void onInitializeSuccess();
    }

    public static d a() {
        if (f9483b == null) {
            f9483b = new d();
        }
        return f9483b;
    }

    public void b(Context context, String str, b bVar) {
        this.f9484a.a(context).initialize(AppLovinSdkInitializationConfiguration.builder(str).setMediationProvider(AppLovinMediationProvider.ADMOB).setPluginVersion(BuildConfig.ADAPTER_VERSION).build(), new a(bVar));
    }

    public AppLovinSdk c(Context context) {
        return this.f9484a.a(context);
    }
}
