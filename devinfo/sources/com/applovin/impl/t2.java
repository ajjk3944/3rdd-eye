package com.applovin.impl;

import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinAdViewDisplayErrorCode;
import com.applovin.adview.AppLovinAdViewEventListener;
import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAd;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdEventListener;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdExpirationListener;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinBidTokenCollectionListener;
import com.applovin.sdk.AppLovinPostbackListener;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class t2 {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f5762a = true;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f5763b = true;

    public static void a(boolean z3) {
        f5763b = z3;
    }

    public static void b(boolean z3) {
        f5762a = z3;
    }

    public static void a(AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener, String str) {
        if (appLovinBidTokenCollectionListener != null) {
            AppLovinSdkUtils.runOnUiThread(new ga(appLovinBidTokenCollectionListener, str, 0));
        }
    }

    public static void b(AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener, String str) {
        if (appLovinBidTokenCollectionListener != null) {
            AppLovinSdkUtils.runOnUiThread(new ga(appLovinBidTokenCollectionListener, str, 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener, String str) {
        try {
            appLovinBidTokenCollectionListener.onBidTokenCollected(str);
        } catch (Throwable th2) {
            com.applovin.impl.sdk.o.c("ListenerCallbackInvoker", "Unable to notify bid token listener about successful bid token collection", th2);
            c("onBidTokenCollected", th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener, String str) {
        try {
            appLovinBidTokenCollectionListener.onBidTokenCollectionFailed(str);
        } catch (Throwable th2) {
            com.applovin.impl.sdk.o.c("ListenerCallbackInvoker", "Unable to notify bid token listener about bid token collection failure", th2);
            c("onBidTokenCollectionFailed", th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(AppLovinAdViewEventListener appLovinAdViewEventListener, AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
        try {
            appLovinAdViewEventListener.adLeftApplication(a(appLovinAd), appLovinAdView);
        } catch (Throwable th2) {
            com.applovin.impl.sdk.o.c("ListenerCallbackInvoker", "Unable to notify ad event listener about application leave event", th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void f(AppLovinAdViewEventListener appLovinAdViewEventListener, AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
        try {
            appLovinAdViewEventListener.adOpenedFullscreen(a(appLovinAd), appLovinAdView);
        } catch (Throwable th2) {
            com.applovin.impl.sdk.o.c("ListenerCallbackInvoker", "Unable to notify ad event listener about fullscreen opened event", th2);
        }
    }

    public static void a(AppLovinAdDisplayListener appLovinAdDisplayListener, String str) {
        if (appLovinAdDisplayListener instanceof l2) {
            AppLovinSdkUtils.runOnUiThread(new w8(21, (l2) appLovinAdDisplayListener, str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(AppLovinAdDisplayListener appLovinAdDisplayListener, String str) {
        ((l2) appLovinAdDisplayListener).onAdDisplayFailed(str);
    }

    public static void b(AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAd appLovinAd) {
        if (appLovinAd == null || appLovinAdDisplayListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new ha(appLovinAdDisplayListener, appLovinAd, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAd appLovinAd, Map map) {
        try {
            appLovinAdRewardListener.userOverQuota(a(appLovinAd), map);
        } catch (Throwable th2) {
            com.applovin.impl.sdk.o.c("ListenerCallbackInvoker", "Unable to notify ad reward listener about exceeding quota", th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void f(AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAd appLovinAd, Map map) {
        try {
            appLovinAdRewardListener.userRewardVerified(a(appLovinAd), map);
        } catch (Throwable th2) {
            com.applovin.impl.sdk.o.c("ListenerCallbackInvoker", "Unable to notify ad reward listener about successful reward validation request", th2);
        }
    }

    public static void a(AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAd appLovinAd) {
        if (appLovinAd == null || appLovinAdDisplayListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new ha(appLovinAdDisplayListener, appLovinAd, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(AppLovinAdClickListener appLovinAdClickListener, AppLovinAd appLovinAd) {
        try {
            appLovinAdClickListener.adClicked(a(appLovinAd));
        } catch (Throwable th2) {
            com.applovin.impl.sdk.o.c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad being clicked", th2);
            c("adClicked", th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAd appLovinAd) {
        try {
            appLovinAdDisplayListener.adDisplayed(a(appLovinAd));
        } catch (Throwable th2) {
            com.applovin.impl.sdk.o.c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad being displayed", th2);
            c("adDisplayed", th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAd appLovinAd) {
        try {
            appLovinAdDisplayListener.adHidden(a(appLovinAd));
        } catch (Throwable th2) {
            com.applovin.impl.sdk.o.c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad being hidden", th2);
            c("adHidden", th2);
        }
    }

    public static void a(AppLovinAdClickListener appLovinAdClickListener, AppLovinAd appLovinAd) {
        if (appLovinAd == null || appLovinAdClickListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new w8(22, appLovinAdClickListener, appLovinAd));
    }

    public static void e(MaxAdListener maxAdListener, MaxAd maxAd) {
        e(maxAdListener, maxAd, false);
    }

    public static void f(MaxAdListener maxAdListener, MaxAd maxAd) {
        f(maxAdListener, maxAd, false);
    }

    public static void a(AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAd appLovinAd) {
        if (appLovinAd == null || appLovinAdVideoPlaybackListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new w8(23, appLovinAdVideoPlaybackListener, appLovinAd));
    }

    public static void e(MaxAdListener maxAdListener, MaxAd maxAd, boolean z3) {
        if (maxAd == null || maxAdListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z3, new fa(z3, maxAdListener, maxAd, 1));
    }

    public static void f(MaxAdListener maxAdListener, MaxAd maxAd, boolean z3) {
        if (maxAd == null || maxAdListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z3, new fa(z3, maxAdListener, maxAd, 3));
    }

    public static void a(final AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, final AppLovinAd appLovinAd, final double d10, final boolean z3) {
        if (appLovinAd == null || appLovinAdVideoPlaybackListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.la
            @Override // java.lang.Runnable
            public final void run() {
                t2.b(appLovinAdVideoPlaybackListener, appLovinAd, d10, z3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAd appLovinAd) {
        try {
            appLovinAdVideoPlaybackListener.videoPlaybackBegan(a(appLovinAd));
        } catch (Throwable th2) {
            com.applovin.impl.sdk.o.c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad playback began", th2);
        }
    }

    public static void c(AppLovinAdViewEventListener appLovinAdViewEventListener, AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
        if (appLovinAd == null || appLovinAdViewEventListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new ia(appLovinAdViewEventListener, appLovinAd, appLovinAdView, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(AppLovinAdViewEventListener appLovinAdViewEventListener, AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
        try {
            appLovinAdViewEventListener.adClosedFullscreen(a(appLovinAd), appLovinAdView);
        } catch (Throwable th2) {
            com.applovin.impl.sdk.o.c("ListenerCallbackInvoker", "Unable to notify ad event listener about fullscreen closed event", th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(boolean z3, MaxAdListener maxAdListener, MaxAd maxAd) {
        if (c(z3)) {
            try {
                maxAdListener.onAdHidden(maxAd);
                return;
            } catch (Throwable th2) {
                a("onAdHidden", th2, z3);
                b("maxAdHidden", th2, z3);
                return;
            }
        }
        maxAdListener.onAdHidden(maxAd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void f(boolean z3, MaxAdListener maxAdListener, MaxAd maxAd) {
        if (c(z3)) {
            try {
                maxAdListener.onAdLoaded(maxAd);
                return;
            } catch (Throwable th2) {
                a("onAdLoaded", th2, z3);
                b("maxAdLoaded", th2, z3);
                return;
            }
        }
        maxAdListener.onAdLoaded(maxAd);
    }

    public static void a(AppLovinAdViewEventListener appLovinAdViewEventListener, AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
        if (appLovinAd == null || appLovinAdViewEventListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new ia(appLovinAdViewEventListener, appLovinAd, appLovinAdView, 0));
    }

    public static void c(AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAd appLovinAd, Map map) {
        if (appLovinAd == null || appLovinAdRewardListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new ka(appLovinAdRewardListener, appLovinAd, map, 2));
    }

    public static void a(AppLovinAdViewEventListener appLovinAdViewEventListener, AppLovinAd appLovinAd, AppLovinAdView appLovinAdView, AppLovinAdViewDisplayErrorCode appLovinAdViewDisplayErrorCode) {
        if (appLovinAd == null || appLovinAdViewEventListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new ci.a(appLovinAdViewEventListener, appLovinAd, appLovinAdView, appLovinAdViewDisplayErrorCode, 13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAd appLovinAd, double d10, boolean z3) {
        try {
            appLovinAdVideoPlaybackListener.videoPlaybackEnded(a(appLovinAd), d10, z3);
        } catch (Throwable th2) {
            com.applovin.impl.sdk.o.c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad playback ended", th2);
        }
    }

    public static void c(MaxAdListener maxAdListener, MaxAd maxAd) {
        c(maxAdListener, maxAd, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAd appLovinAd, Map map) {
        try {
            appLovinAdRewardListener.userRewardRejected(a(appLovinAd), map);
        } catch (Throwable th2) {
            com.applovin.impl.sdk.o.c("ListenerCallbackInvoker", "Unable to notify ad reward listener about reward validation request being rejected", th2);
        }
    }

    public static void a(AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAd appLovinAd, Map map) {
        if (appLovinAd == null || appLovinAdRewardListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new ka(appLovinAdRewardListener, appLovinAd, map, 0));
    }

    public static void c(MaxAdListener maxAdListener, MaxAd maxAd, boolean z3) {
        if (maxAd == null || maxAdListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z3, new fa(z3, maxAdListener, maxAd, 2));
    }

    public static void a(AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAd appLovinAd, int i4) {
        if (appLovinAd == null || appLovinAdRewardListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new u8(appLovinAdRewardListener, appLovinAd, i4, 1));
    }

    public static void b(AppLovinAdViewEventListener appLovinAdViewEventListener, AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
        if (appLovinAd == null || appLovinAdViewEventListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new ia(appLovinAdViewEventListener, appLovinAd, appLovinAdView, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(boolean z3, MaxAdListener maxAdListener, MaxAd maxAd) {
        if (c(z3)) {
            try {
                maxAdListener.onAdDisplayed(maxAd);
                return;
            } catch (Throwable th2) {
                a("onAdDisplayed", th2, z3);
                b("maxAdDisplayed", th2, z3);
                return;
            }
        }
        maxAdListener.onAdDisplayed(maxAd);
    }

    public static void d(MaxAdListener maxAdListener, MaxAd maxAd) {
        d(maxAdListener, maxAd, false);
    }

    public static void a(MaxAdListener maxAdListener, String str, MaxError maxError) {
        a(maxAdListener, str, maxError, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(AppLovinAdViewEventListener appLovinAdViewEventListener, AppLovinAd appLovinAd, AppLovinAdView appLovinAdView, AppLovinAdViewDisplayErrorCode appLovinAdViewDisplayErrorCode) {
        try {
            appLovinAdViewEventListener.adFailedToDisplay(a(appLovinAd), appLovinAdView, appLovinAdViewDisplayErrorCode);
        } catch (Throwable th2) {
            com.applovin.impl.sdk.o.c("ListenerCallbackInvoker", "Unable to notify ad event listener about display failed event", th2);
        }
    }

    public static void d(MaxAdListener maxAdListener, MaxAd maxAd, boolean z3) {
        if (maxAd == null || !(maxAdListener instanceof MaxAdViewAdListener)) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z3, new ea(z3, (MaxAdViewAdListener) maxAdListener, maxAd, 1));
    }

    public static void a(MaxAdListener maxAdListener, String str, MaxError maxError, boolean z3) {
        if (str == null || maxAdListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z3, new com.applovin.impl.sdk.u(z3, maxAdListener, str, maxError, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(boolean z3, MaxAdListener maxAdListener, String str, MaxError maxError) {
        if (c(z3)) {
            try {
                maxAdListener.onAdLoadFailed(str, maxError);
                return;
            } catch (Throwable th2) {
                a("onAdLoadFailed", th2, z3);
                b("maxAdLoadFailed", th2, z3);
                return;
            }
        }
        maxAdListener.onAdLoadFailed(str, maxError);
    }

    public static void b(AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAd appLovinAd, Map map) {
        if (appLovinAd == null || appLovinAdRewardListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new ka(appLovinAdRewardListener, appLovinAd, map, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(boolean z3, MaxAdListener maxAdListener, MaxAd maxAd) {
        if (c(z3)) {
            try {
                ((MaxAdViewAdListener) maxAdListener).onAdExpanded(maxAd);
                return;
            } catch (Throwable th2) {
                a("onAdExpanded", th2, z3);
                b("maxAdExpanded", th2, z3);
                return;
            }
        }
        ((MaxAdViewAdListener) maxAdListener).onAdExpanded(maxAd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAd appLovinAd, int i4) {
        try {
            appLovinAdRewardListener.validationRequestFailed(a(appLovinAd), i4);
        } catch (Throwable th2) {
            com.applovin.impl.sdk.o.c("ListenerCallbackInvoker", "Unable to notify ad reward listener about reward validation request failing", th2);
        }
    }

    private static boolean c(boolean z3) {
        return z3 ? f5762a : f5763b;
    }

    public static void b(MaxAdListener maxAdListener, MaxAd maxAd) {
        b(maxAdListener, maxAd, false);
    }

    private static void c(String str, Throwable th2) {
        com.applovin.impl.sdk.k kVar = com.applovin.impl.sdk.k.C0;
        if (kVar != null) {
            kVar.D().a("ListenerCallbackInvoker", str, th2);
        }
    }

    public static void b(MaxAdListener maxAdListener, MaxAd maxAd, boolean z3) {
        if (maxAd == null || !(maxAdListener instanceof MaxAdViewAdListener)) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z3, new ea(z3, (MaxAdViewAdListener) maxAdListener, maxAd, 0));
    }

    public static void a(MaxAdListener maxAdListener, MaxAd maxAd) {
        a(maxAdListener, maxAd, false);
    }

    public static void a(MaxAdListener maxAdListener, MaxAd maxAd, boolean z3) {
        if (maxAd == null || maxAdListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z3, new fa(z3, maxAdListener, maxAd, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(boolean z3, MaxAdListener maxAdListener, MaxAd maxAd) {
        if (c(z3)) {
            try {
                ((MaxAdViewAdListener) maxAdListener).onAdCollapsed(maxAd);
                return;
            } catch (Throwable th2) {
                a("onAdCollapsed", th2, z3);
                b("maxAdCollapsed", th2, z3);
                return;
            }
        }
        ((MaxAdViewAdListener) maxAdListener).onAdCollapsed(maxAd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(boolean z3, MaxAdListener maxAdListener, MaxAd maxAd) {
        if (c(z3)) {
            try {
                maxAdListener.onAdClicked(maxAd);
                return;
            } catch (Throwable th2) {
                a("onAdClicked", th2, z3);
                b("maxAdClicked", th2, z3);
                return;
            }
        }
        maxAdListener.onAdClicked(maxAd);
    }

    public static void b(MaxNativeAdListener maxNativeAdListener, MaxAd maxAd, boolean z3) {
        if (maxAd == null || maxNativeAdListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z3, new ja(z3, maxNativeAdListener, maxAd, 1));
    }

    public static void a(MaxAdListener maxAdListener, MaxAd maxAd, MaxError maxError) {
        a(maxAdListener, maxAd, maxError, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(boolean z3, MaxNativeAdListener maxNativeAdListener, MaxAd maxAd) {
        if (c(z3)) {
            try {
                maxNativeAdListener.onNativeAdExpired(maxAd);
                return;
            } catch (Throwable th2) {
                a("onNativeAdExpired", th2, z3);
                b("maxNativeAdExpired", th2, z3);
                return;
            }
        }
        maxNativeAdListener.onNativeAdExpired(maxAd);
    }

    public static void a(MaxAdListener maxAdListener, MaxAd maxAd, MaxError maxError, boolean z3) {
        if (maxAd == null || maxAdListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z3, new com.applovin.impl.sdk.u(z3, maxAdListener, maxAd, maxError, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(boolean z3, MaxAdListener maxAdListener, MaxAd maxAd, MaxError maxError) {
        if (c(z3)) {
            try {
                maxAdListener.onAdDisplayFailed(maxAd, maxError);
                return;
            } catch (Throwable th2) {
                a("onAdDisplayFailed", th2, z3);
                b("maxAdDisplayFailed", th2, z3);
                return;
            }
        }
        maxAdListener.onAdDisplayFailed(maxAd, maxError);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(AppLovinPostbackListener appLovinPostbackListener, String str) {
        try {
            appLovinPostbackListener.onPostbackSuccess(str);
        } catch (Throwable th2) {
            com.applovin.impl.sdk.o.c("ListenerCallbackInvoker", "Unable to notify AppLovinPostbackListener about postback URL (" + str + ") executed", th2);
        }
    }

    public static void a(MaxAdRevenueListener maxAdRevenueListener, MaxAd maxAd) {
        a(maxAdRevenueListener, maxAd, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(AppLovinPostbackListener appLovinPostbackListener, String str, int i4) {
        try {
            appLovinPostbackListener.onPostbackFailure(str, i4);
        } catch (Throwable th2) {
            com.applovin.impl.sdk.o.c("ListenerCallbackInvoker", "Unable to notify AppLovinPostbackListener about postback URL (" + str + ") failing to execute with error code (" + i4 + "):", th2);
        }
    }

    public static void a(MaxAdRevenueListener maxAdRevenueListener, MaxAd maxAd, boolean z3) {
        if (maxAd == null || maxAdRevenueListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z3, new j9(z3, maxAdRevenueListener, maxAd, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(boolean z3, MaxAdRevenueListener maxAdRevenueListener, MaxAd maxAd) {
        if (c(z3)) {
            try {
                maxAdRevenueListener.onAdRevenuePaid(maxAd);
                return;
            } catch (Throwable th2) {
                a("onAdRevenuePaid", th2, z3);
                b("maxAdPaidRevenue", th2, z3);
                return;
            }
        }
        maxAdRevenueListener.onAdRevenuePaid(maxAd);
    }

    public static void b(AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, AppLovinError appLovinError) {
        if (appLovinNativeAdLoadListener != null) {
            AppLovinSdkUtils.runOnUiThread(new w8(19, appLovinNativeAdLoadListener, appLovinError));
        }
    }

    public static void b(AppLovinNativeAdEventListener appLovinNativeAdEventListener, AppLovinNativeAd appLovinNativeAd) {
        if (appLovinNativeAdEventListener != null) {
            AppLovinSdkUtils.runOnUiThread(new w8(20, appLovinNativeAdEventListener, appLovinNativeAd));
        }
    }

    public static void b(MaxAdReviewListener maxAdReviewListener, String str, MaxAd maxAd) {
        a(maxAdReviewListener, str, maxAd, false);
    }

    private static void b(String str, Throwable th2) {
        com.applovin.impl.sdk.o.c("ListenerCallbackInvoker", "Error in publisher callback '" + str + "'", th2);
    }

    private static void b(String str, Throwable th2, boolean z3) {
        if (com.applovin.impl.sdk.k.C0 != null) {
            com.applovin.impl.sdk.k.C0.D().a("ListenerCallbackInvoker", str, th2, CollectionUtils.hashMap("details", "isPublisherCallback=" + z3));
        }
    }

    public static void a(MaxAdRequestListener maxAdRequestListener, String str) {
        a(maxAdRequestListener, str, false);
    }

    public static void a(MaxAdRequestListener maxAdRequestListener, String str, boolean z3) {
        if (str == null || maxAdRequestListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z3, new j9(z3, maxAdRequestListener, str, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(boolean z3, MaxAdRequestListener maxAdRequestListener, String str) {
        if (c(z3)) {
            try {
                maxAdRequestListener.onAdRequestStarted(str);
                return;
            } catch (Throwable th2) {
                a("onAdRequestStarted", th2, z3);
                b("maxAdRequestStarted", th2, z3);
                return;
            }
        }
        maxAdRequestListener.onAdRequestStarted(str);
    }

    public static void a(MaxAdExpirationListener maxAdExpirationListener, MaxAd maxAd, MaxAd maxAd2, boolean z3) {
        if (maxAd == null || maxAd2 == null || maxAdExpirationListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z3, new com.applovin.impl.sdk.u(z3, maxAdExpirationListener, maxAd, maxAd2, 5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(boolean z3, MaxAdExpirationListener maxAdExpirationListener, MaxAd maxAd, MaxAd maxAd2) {
        if (c(z3)) {
            try {
                maxAdExpirationListener.onExpiredAdReloaded(maxAd, maxAd2);
                return;
            } catch (Throwable th2) {
                a("onExpiredAdReloaded", th2, z3);
                b("maxExpiredAdReloaded", th2, z3);
                return;
            }
        }
        maxAdExpirationListener.onExpiredAdReloaded(maxAd, maxAd2);
    }

    public static void a(MaxAdListener maxAdListener, MaxAd maxAd, MaxReward maxReward) {
        a(maxAdListener, maxAd, maxReward, false);
    }

    public static void a(MaxAdListener maxAdListener, MaxAd maxAd, MaxReward maxReward, boolean z3) {
        if (maxAd == null || !(maxAdListener instanceof MaxRewardedAdListener)) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z3, new com.applovin.impl.sdk.u(z3, (MaxRewardedAdListener) maxAdListener, maxAd, maxReward, 6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(boolean z3, MaxAdListener maxAdListener, MaxAd maxAd, MaxReward maxReward) {
        if (c(z3)) {
            try {
                ((MaxRewardedAdListener) maxAdListener).onUserRewarded(maxAd, maxReward);
                return;
            } catch (Throwable th2) {
                a("onUserRewarded", th2, z3);
                b("maxRewardedUser", th2, z3);
                return;
            }
        }
        ((MaxRewardedAdListener) maxAdListener).onUserRewarded(maxAd, maxReward);
    }

    public static void a(MaxNativeAdListener maxNativeAdListener, MaxNativeAdView maxNativeAdView, MaxAd maxAd, boolean z3) {
        if (maxAd == null || maxNativeAdListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z3, new com.applovin.impl.sdk.u(z3, maxNativeAdListener, maxNativeAdView, maxAd, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(boolean z3, MaxNativeAdListener maxNativeAdListener, MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        if (c(z3)) {
            try {
                maxNativeAdListener.onNativeAdLoaded(maxNativeAdView, maxAd);
                return;
            } catch (Throwable th2) {
                a("onNativeAdLoaded", th2, z3);
                b("maxNativeAdLoaded", th2, z3);
                return;
            }
        }
        maxNativeAdListener.onNativeAdLoaded(maxNativeAdView, maxAd);
    }

    public static void a(MaxNativeAdListener maxNativeAdListener, String str, MaxError maxError, boolean z3) {
        if (str == null || maxNativeAdListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z3, new com.applovin.impl.sdk.u(z3, maxNativeAdListener, str, maxError, 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(boolean z3, MaxNativeAdListener maxNativeAdListener, String str, MaxError maxError) {
        if (c(z3)) {
            try {
                maxNativeAdListener.onNativeAdLoadFailed(str, maxError);
                return;
            } catch (Throwable th2) {
                a("onNativeAdLoadFailed", th2, z3);
                b("maxNativeAdLoadFailed", th2, z3);
                return;
            }
        }
        maxNativeAdListener.onNativeAdLoadFailed(str, maxError);
    }

    public static void a(MaxNativeAdListener maxNativeAdListener, MaxAd maxAd, boolean z3) {
        if (maxAd == null || maxNativeAdListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z3, new ja(z3, maxNativeAdListener, maxAd, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(boolean z3, MaxNativeAdListener maxNativeAdListener, MaxAd maxAd) {
        if (c(z3)) {
            try {
                maxNativeAdListener.onNativeAdClicked(maxAd);
                return;
            } catch (Throwable th2) {
                a("onNativeAdClicked", th2, z3);
                b("maxNativeAdClicked", th2, z3);
                return;
            }
        }
        maxNativeAdListener.onNativeAdClicked(maxAd);
    }

    public static void a(AppLovinPostbackListener appLovinPostbackListener, String str) {
        if (appLovinPostbackListener != null) {
            AppLovinSdkUtils.runOnUiThread(new w8(18, appLovinPostbackListener, str));
        }
    }

    public static void a(AppLovinPostbackListener appLovinPostbackListener, String str, int i4) {
        if (appLovinPostbackListener != null) {
            AppLovinSdkUtils.runOnUiThread(new u8(appLovinPostbackListener, str, i4, 2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, AppLovinError appLovinError) {
        try {
            appLovinNativeAdLoadListener.onNativeAdLoadFailed(appLovinError);
        } catch (Throwable th2) {
            com.applovin.impl.sdk.o.c("ListenerCallbackInvoker", "Unable to notify native ad event listener about ad failing to load", th2);
            c("nativeAdLoadFailed", th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(AppLovinNativeAdEventListener appLovinNativeAdEventListener, AppLovinNativeAd appLovinNativeAd) {
        try {
            appLovinNativeAdEventListener.onNativeAdClicked(appLovinNativeAd);
        } catch (Throwable th2) {
            com.applovin.impl.sdk.o.c("ListenerCallbackInvoker", "Unable to notify native ad event listener about ad click", th2);
            c("nativeAdClicked", th2);
        }
    }

    public static void a(MaxAdReviewListener maxAdReviewListener, String str, MaxAd maxAd, boolean z3) {
        if (maxAdReviewListener != null) {
            AppLovinSdkUtils.runOnUiThread(z3, new b5.e(maxAdReviewListener, str, maxAd, 18));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(MaxAdReviewListener maxAdReviewListener, String str, MaxAd maxAd) {
        try {
            maxAdReviewListener.onCreativeIdGenerated(str, maxAd);
        } catch (Throwable th2) {
            com.applovin.impl.sdk.o.c("ListenerCallbackInvoker", "Unable to notify Ad Review creative id generated", th2);
            c("adReviewCreativeIdGenerated", th2);
        }
    }

    private static AppLovinAd a(AppLovinAd appLovinAd) {
        AppLovinAdImpl appLovinAdImpl = (AppLovinAdImpl) appLovinAd;
        return appLovinAdImpl.getDummyAd() != null ? appLovinAdImpl.getDummyAd() : appLovinAd;
    }

    private static void a(String str, Throwable th2, boolean z3) {
        if (z3) {
            b(str, th2);
        } else {
            a(str, th2);
        }
    }

    private static void a(String str, Throwable th2) {
        com.applovin.impl.sdk.o.b("ListenerCallbackInvoker", "Error in internal callback '" + str + "'", th2);
    }
}
