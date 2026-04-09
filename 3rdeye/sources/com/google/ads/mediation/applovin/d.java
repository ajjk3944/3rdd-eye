package com.google.ads.mediation.applovin;

import android.content.Context;
import com.applovin.mediation.BuildConfig;
import com.applovin.sdk.AppLovinMediationProvider;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinSdkInitializationConfiguration;

/* compiled from: AppLovinInitializer.java */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public static d f22401b;

    /* renamed from: a, reason: collision with root package name */
    public final h f22402a = new h();

    /* compiled from: AppLovinInitializer.java */
    public class a implements AppLovinSdk.SdkInitializationListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b f22403a;

        public a(b bVar) {
            this.f22403a = bVar;
        }

        @Override // com.applovin.sdk.AppLovinSdk.SdkInitializationListener
        public final void onSdkInitialized(AppLovinSdkConfiguration appLovinSdkConfiguration) {
            this.f22403a.onInitializeSuccess();
        }
    }

    /* compiled from: AppLovinInitializer.java */
    public interface b {
        void onInitializeSuccess();
    }

    public static d a() {
        if (f22401b == null) {
            f22401b = new d();
        }
        return f22401b;
    }

    public final void b(Context context, String str, b bVar) {
        AppLovinSdk.getInstance(context).initialize(AppLovinSdkInitializationConfiguration.builder(str).setMediationProvider(AppLovinMediationProvider.ADMOB).setPluginVersion(BuildConfig.ADAPTER_VERSION).build(), new a(bVar));
    }

    public final AppLovinSdk c(Context context) {
        this.f22402a.getClass();
        return AppLovinSdk.getInstance(context);
    }
}
