package com.yandex.mobile.ads.impl;

import N7.C1094a9;
import c9.C2092m;
import com.applovin.sdk.AppLovinMediationProvider;
import io.appmetrica.analytics.impl.Oo;
import java.util.List;

/* loaded from: classes3.dex */
public final class az0 {

    /* renamed from: d, reason: collision with root package name */
    private static final String f25026d = "com.yandex.mobile.ads.mediation";

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f25027e = 0;

    /* renamed from: a, reason: collision with root package name */
    private final String f25028a;

    /* renamed from: b, reason: collision with root package name */
    private final String f25029b;

    /* renamed from: c, reason: collision with root package name */
    private final List<b> f25030c;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f25031a;

        /* renamed from: b, reason: collision with root package name */
        private final String f25032b;

        public b(String format, String className) {
            kotlin.jvm.internal.l.f(format, "format");
            kotlin.jvm.internal.l.f(className, "className");
            this.f25031a = format;
            this.f25032b = className;
        }

        public final String a() {
            return this.f25032b;
        }

        public final String b() {
            return this.f25031a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return kotlin.jvm.internal.l.b(this.f25031a, bVar.f25031a) && kotlin.jvm.internal.l.b(this.f25032b, bVar.f25032b);
        }

        public final int hashCode() {
            return this.f25032b.hashCode() + (this.f25031a.hashCode() * 31);
        }

        public final String toString() {
            return Oo.h("MediationAdapterSignature(format=", this.f25031a, ", className=", this.f25032b, ")");
        }
    }

    public az0(String name, String id, List<b> adapters) {
        kotlin.jvm.internal.l.f(name, "name");
        kotlin.jvm.internal.l.f(id, "id");
        kotlin.jvm.internal.l.f(adapters, "adapters");
        this.f25028a = name;
        this.f25029b = id;
        this.f25030c = adapters;
    }

    public final List<b> b() {
        return this.f25030c;
    }

    public final String c() {
        return this.f25029b;
    }

    public final String d() {
        return this.f25028a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof az0)) {
            return false;
        }
        az0 az0Var = (az0) obj;
        return kotlin.jvm.internal.l.b(this.f25028a, az0Var.f25028a) && kotlin.jvm.internal.l.b(this.f25029b, az0Var.f25029b) && kotlin.jvm.internal.l.b(this.f25030c, az0Var.f25030c);
    }

    public final int hashCode() {
        return this.f25030c.hashCode() + C4121h3.a(this.f25029b, this.f25028a.hashCode() * 31, 31);
    }

    public final String toString() {
        String str = this.f25028a;
        String str2 = this.f25029b;
        return C1094a9.h(j6.l.d("MediationNetwork(name=", str, ", id=", str2, ", adapters="), this.f25030c, ")");
    }

    public static final class a {
        public static List a() {
            return C2092m.W(new az0("AppLovin", "applovin", C2092m.W(new b("Banner", a("banner", "AppLovinBannerAdapter")), new b("Interstitial", a(com.vungle.ads.internal.g.PLACEMENT_TYPE_INTERSTITIAL, "AppLovinInterstitialAdapter")), new b("Rewarded", a(com.vungle.ads.internal.g.PLACEMENT_TYPE_REWARDED, "AppLovinRewardedAdapter")))), new az0("AppLovinMax", "applovin_max", C2092m.W(new b("Banner", a("banner", "AppLovinMaxBannerAdapter")), new b("Interstitial", a(com.vungle.ads.internal.g.PLACEMENT_TYPE_INTERSTITIAL, "AppLovinMaxInterstitialAdapter")), new b("Rewarded", a(com.vungle.ads.internal.g.PLACEMENT_TYPE_REWARDED, "AppLovinMaxRewardedAdapter")))), new az0("Appnext", "appnext", C2092m.W(new b("Banner", a("banner", "AppNextBannerAdapter")), new b("Interstitial", a(com.vungle.ads.internal.g.PLACEMENT_TYPE_INTERSTITIAL, "AppNextInterstitialAdapter")), new b("Native", a("nativeads", "AppNextNativeAdapter")), new b("Rewarded", a(com.vungle.ads.internal.g.PLACEMENT_TYPE_REWARDED, "AppNextRewardedAdapter")))), new az0("BigoAds", "bigoads", C2092m.W(new b("Banner", a("banner", "BigoAdsBannerAdapter")), new b("Interstitial", a(com.vungle.ads.internal.g.PLACEMENT_TYPE_INTERSTITIAL, "BigoAdsInterstitialAdapter")), new b("Native", a("nativeads", "BigoAdsNativeAdapter")), new b("Rewarded", a(com.vungle.ads.internal.g.PLACEMENT_TYPE_REWARDED, "BigoAdsRewardedAdapter")))), new az0("Chartboost", "chartboost", C2092m.W(new b("Banner", a("banner", "ChartboostBannerAdapter")), new b("Interstitial", a(com.vungle.ads.internal.g.PLACEMENT_TYPE_INTERSTITIAL, "ChartboostInterstitialAdapter")), new b("Rewarded", a(com.vungle.ads.internal.g.PLACEMENT_TYPE_REWARDED, "ChartboostRewardedAdapter")))), new az0("AdMob", AppLovinMediationProvider.ADMOB, C2092m.W(new b("AppOpen", a(com.vungle.ads.internal.g.PLACEMENT_TYPE_APP_OPEN, "AdMobAppOpenAdAdapter")), new b("Banner", a("banner", "AdMobBannerAdapter")), new b("Interstitial", a(com.vungle.ads.internal.g.PLACEMENT_TYPE_INTERSTITIAL, "AdMobInterstitialAdapter")), new b("Native", a("nativeads", "AdMobNativeAdapter")), new b("Rewarded", a(com.vungle.ads.internal.g.PLACEMENT_TYPE_REWARDED, "AdMobRewardedAdapter")))), new az0("AdManager", "admanager", C2092m.W(new b("Banner", a("banner", "AdManagerBannerAdapter")), new b("Interstitial", a(com.vungle.ads.internal.g.PLACEMENT_TYPE_INTERSTITIAL, "AdManagerInterstitialAdapter")), new b("Native", a("nativeads", "AdManagerNativeAdapter")), new b("Rewarded", a(com.vungle.ads.internal.g.PLACEMENT_TYPE_REWARDED, "AdManagerRewardedAdapter")))), new az0("InMobi", "inmobi", C2092m.W(new b("Banner", a("banner", "InMobiBannerAdapter")), new b("Interstitial", a(com.vungle.ads.internal.g.PLACEMENT_TYPE_INTERSTITIAL, "InMobiInterstitialAdapter")), new b("Rewarded", a(com.vungle.ads.internal.g.PLACEMENT_TYPE_REWARDED, "InMobiRewardedAdapter")))), new az0("IronSource", AppLovinMediationProvider.IRONSOURCE, C2092m.W(new b("Banner", a("banner", "IronSourceBannerAdapter")), new b("Interstitial", a(com.vungle.ads.internal.g.PLACEMENT_TYPE_INTERSTITIAL, "IronSourceInterstitialAdapter")), new b("Rewarded", a(com.vungle.ads.internal.g.PLACEMENT_TYPE_REWARDED, "IronSourceRewardedAdapter")))), new az0("Mintegral", "mintegral", C2092m.W(new b("Banner", a("banner", "MintegralBannerAdapter")), new b("Interstitial", a(com.vungle.ads.internal.g.PLACEMENT_TYPE_INTERSTITIAL, "MintegralInterstitialAdapter")), new b("Native", a("nativeads", "MintegralNativeAdapter")), new b("Rewarded", a(com.vungle.ads.internal.g.PLACEMENT_TYPE_REWARDED, "MintegralRewardedAdapter")))), new az0("MyTarget", "mytarget", C2092m.W(new b("Banner", a("banner", "MyTargetBannerAdapter")), new b("Interstitial", a(com.vungle.ads.internal.g.PLACEMENT_TYPE_INTERSTITIAL, "MyTargetInterstitialAdapter")), new b("Native", a("nativeads", "MyTargetNativeAdapter")), new b("Rewarded", a(com.vungle.ads.internal.g.PLACEMENT_TYPE_REWARDED, "MyTargetRewardedAdapter")))), new az0("Pangle", "pangle", C2092m.W(new b("Interstitial", a(com.vungle.ads.internal.g.PLACEMENT_TYPE_INTERSTITIAL, "PangleInterstitialAdapter")), new b("Rewarded", a(com.vungle.ads.internal.g.PLACEMENT_TYPE_REWARDED, "PangleRewardedAdapter")))), new az0("StartApp", "startapp", C2092m.W(new b("Banner", a("banner", "StartAppBannerAdapter")), new b("Interstitial", a(com.vungle.ads.internal.g.PLACEMENT_TYPE_INTERSTITIAL, "StartAppInterstitialAdapter")), new b("Native", a("nativeads", "StartAppNativeAdapter")), new b("Rewarded", a(com.vungle.ads.internal.g.PLACEMENT_TYPE_REWARDED, "StartAppRewardedAdapter")))), new az0("TapJoy", "tapjoy", C2092m.W(new b("Interstitial", a(com.vungle.ads.internal.g.PLACEMENT_TYPE_INTERSTITIAL, "TapJoyInterstitialAdapter")), new b("Rewarded", a(com.vungle.ads.internal.g.PLACEMENT_TYPE_REWARDED, "TapJoyRewardedAdapter")))), new az0("UnityAds", "unityads", C2092m.W(new b("Banner", a("banner", "UnityAdsBannerAdapter")), new b("Interstitial", a(com.vungle.ads.internal.g.PLACEMENT_TYPE_INTERSTITIAL, "UnityAdsInterstitialAdapter")), new b("Rewarded", a(com.vungle.ads.internal.g.PLACEMENT_TYPE_REWARDED, "UnityAdsRewardedAdapter")))), new az0("Vungle", "vungle", C2092m.W(new b("Banner", a("banner", "VungleBannerAdapter")), new b("Interstitial", a(com.vungle.ads.internal.g.PLACEMENT_TYPE_INTERSTITIAL, "VungleInterstitialAdapter")), new b("Rewarded", a(com.vungle.ads.internal.g.PLACEMENT_TYPE_REWARDED, "VungleRewardedAdapter")))), new az0("zMaticoo", "zmaticoo", C2092m.W(new b("Banner", a("banner", "MaticooBannerAdapter")), new b("Interstitial", a(com.vungle.ads.internal.g.PLACEMENT_TYPE_INTERSTITIAL, "MaticooInterstitialAdapter")), new b("Rewarded", a(com.vungle.ads.internal.g.PLACEMENT_TYPE_REWARDED, "MaticooRewardedAdapter")))));
        }

        private static String a(String str, String str2) {
            return az0.f25026d + "." + str + "." + str2;
        }
    }
}
