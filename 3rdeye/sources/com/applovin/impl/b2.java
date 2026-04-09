package com.applovin.impl;

import N7.B8;
import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1781n;
import com.applovin.adview.AppLovinInterstitialAd;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.impl.r5;
import com.applovin.impl.sdk.AppLovinAdServiceImpl;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinErrorCodes;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import java.lang.ref.SoftReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class b2 {

    /* renamed from: b, reason: collision with root package name */
    protected final com.applovin.impl.sdk.k f19085b;

    /* renamed from: c, reason: collision with root package name */
    protected final AppLovinAdServiceImpl f19086c;

    /* renamed from: d, reason: collision with root package name */
    private AppLovinAd f19087d;

    /* renamed from: e, reason: collision with root package name */
    private String f19088e;

    /* renamed from: f, reason: collision with root package name */
    private SoftReference f19089f;

    /* renamed from: h, reason: collision with root package name */
    private volatile String f19091h;

    /* renamed from: j, reason: collision with root package name */
    private volatile double f19092j;

    /* renamed from: a, reason: collision with root package name */
    public final Map f19084a = Collections.synchronizedMap(new HashMap());

    /* renamed from: g, reason: collision with root package name */
    private final Object f19090g = new Object();
    private volatile boolean i = false;

    public class a implements AppLovinAdRewardListener {
        public a() {
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userOverQuota(AppLovinAd appLovinAd, Map map) {
            b2.this.f19085b.O();
            if (com.applovin.impl.sdk.o.a()) {
                b2.this.f19085b.O().b("IncentivizedAdController", "User over quota: " + map);
            }
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userRewardRejected(AppLovinAd appLovinAd, Map map) {
            b2.this.f19085b.O();
            if (com.applovin.impl.sdk.o.a()) {
                b2.this.f19085b.O().b("IncentivizedAdController", "Reward rejected: " + map);
            }
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userRewardVerified(AppLovinAd appLovinAd, Map map) {
            b2.this.f19085b.O();
            if (com.applovin.impl.sdk.o.a()) {
                b2.this.f19085b.O().a("IncentivizedAdController", "Reward validated: " + map);
            }
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void validationRequestFailed(AppLovinAd appLovinAd, int i) {
            b2.this.f19085b.O();
            if (com.applovin.impl.sdk.o.a()) {
                b2.this.f19085b.O().b("IncentivizedAdController", "Reward validation failed: " + i);
            }
        }
    }

    public class b implements AppLovinAdLoadListener {

        /* renamed from: a, reason: collision with root package name */
        private final AppLovinAdLoadListener f19094a;

        public b(AppLovinAdLoadListener appLovinAdLoadListener) {
            this.f19094a = appLovinAdLoadListener;
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void adReceived(AppLovinAd appLovinAd) {
            b2.this.f19087d = appLovinAd;
            if (this.f19094a != null) {
                AppLovinSdkUtils.runOnUiThread(new D(0, this, appLovinAd));
            }
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void failedToReceiveAd(final int i) {
            if (this.f19094a != null) {
                AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.C
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f18788b.a(i);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(AppLovinAd appLovinAd) {
            try {
                this.f19094a.adReceived(appLovinAd);
            } catch (Throwable th) {
                com.applovin.impl.sdk.o.c("AppLovinIncentivizedInterstitial", "Unable to notify ad listener about a newly loaded ad", th);
                b2.this.f19085b.E().a("IncentivizedAdController", "adLoaded", th);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(int i) {
            try {
                this.f19094a.failedToReceiveAd(i);
            } catch (Throwable th) {
                com.applovin.impl.sdk.o.c("AppLovinIncentivizedInterstitial", "Unable to notify listener about ad load failure", th);
                b2.this.f19085b.E().a("IncentivizedAdController", "adLoadFailed", th);
            }
        }
    }

    public class c implements f2, AppLovinAdVideoPlaybackListener, AppLovinAdRewardListener, AppLovinAdClickListener {

        /* renamed from: a, reason: collision with root package name */
        private final AppLovinAd f19096a;

        /* renamed from: b, reason: collision with root package name */
        private final AppLovinAdDisplayListener f19097b;

        /* renamed from: c, reason: collision with root package name */
        private final AppLovinAdClickListener f19098c;

        /* renamed from: d, reason: collision with root package name */
        private final AppLovinAdVideoPlaybackListener f19099d;

        /* renamed from: e, reason: collision with root package name */
        private final AppLovinAdRewardListener f19100e;

        public /* synthetic */ c(b2 b2Var, AppLovinAd appLovinAd, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener, a aVar) {
            this(appLovinAd, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
        }

        private void a(com.applovin.impl.sdk.ad.b bVar) {
            String strF;
            int i;
            b2.this.f19085b.O();
            if (com.applovin.impl.sdk.o.a()) {
                b2.this.f19085b.O().a("IncentivizedAdController", "Finishing direct ad...");
            }
            String strB = b2.this.b();
            if (!StringUtils.isValidString(strB) || !b2.this.i) {
                b2.this.f19085b.O();
                if (com.applovin.impl.sdk.o.a()) {
                    com.applovin.impl.sdk.o oVarO = b2.this.f19085b.O();
                    StringBuilder sbK = B8.k("Invalid reward state - result: ", strB, " and wasFullyEngaged: ");
                    sbK.append(b2.this.i);
                    oVarO.b("IncentivizedAdController", sbK.toString());
                }
                b2.this.f19085b.O();
                if (com.applovin.impl.sdk.o.a()) {
                    b2.this.f19085b.O().a("IncentivizedAdController", "Cancelling any incoming reward requests for this ad");
                }
                bVar.d();
                if (b2.this.i) {
                    b2.this.f19085b.O();
                    if (com.applovin.impl.sdk.o.a()) {
                        b2.this.f19085b.O().b("IncentivizedAdController", "User closed the ad after fully watching but reward validation task did not return on time");
                    }
                    strF = "network_timeout";
                    i = AppLovinErrorCodes.INCENTIVIZED_SERVER_TIMEOUT;
                } else {
                    strF = bVar.F() != null ? bVar.F() : "unknown_early_dismissal_source";
                    b2.this.f19085b.O();
                    if (com.applovin.impl.sdk.o.a()) {
                        b2.this.f19085b.O().b("IncentivizedAdController", "Ad closed prematurely from source: " + strF);
                    }
                    i = AppLovinErrorCodes.INCENTIVIZED_USER_CLOSED_VIDEO;
                }
                bVar.a(b4.a(strF));
                b2.this.f19085b.O();
                if (com.applovin.impl.sdk.o.a()) {
                    b2.this.f19085b.O().a("IncentivizedAdController", "Notifying listener of reward validation failure");
                }
                l2.a(this.f19100e, bVar, i);
                HashMap<String, String> mapHashMap = CollectionUtils.hashMap("details", String.valueOf(b2.this.f19092j));
                CollectionUtils.putStringIfValid(AdRevenueConstants.SOURCE_KEY, strF, mapHashMap);
                b2.this.f19085b.g().a(y1.f21825w, bVar, mapHashMap);
            }
            if (bVar.N0().getAndSet(true)) {
                return;
            }
            b2.this.f19085b.O();
            if (com.applovin.impl.sdk.o.a()) {
                b2.this.f19085b.O().a("IncentivizedAdController", "Scheduling report rewarded ad...");
            }
            b2.this.f19085b.q0().a((w4) new a6(bVar, b2.this.f19085b), r5.b.OTHER);
        }

        @Override // com.applovin.sdk.AppLovinAdClickListener
        public void adClicked(AppLovinAd appLovinAd) {
            l2.a(this.f19098c, appLovinAd);
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adDisplayed(AppLovinAd appLovinAd) {
            l2.a(this.f19097b, appLovinAd);
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adHidden(AppLovinAd appLovinAd) {
            String str;
            AppLovinAd appLovinAdF = appLovinAd instanceof com.applovin.impl.sdk.ad.c ? ((com.applovin.impl.sdk.ad.c) appLovinAd).f() : appLovinAd;
            if (appLovinAdF instanceof com.applovin.impl.sdk.ad.b) {
                a((com.applovin.impl.sdk.ad.b) appLovinAdF);
            } else {
                if (appLovinAdF == null) {
                    str = "null/expired ad";
                } else {
                    str = "invalid ad of type: " + appLovinAdF;
                }
                b2.this.f19085b.O();
                if (com.applovin.impl.sdk.o.a()) {
                    b2.this.f19085b.O().b("IncentivizedAdController", "Received `adHidden` callback for " + str);
                }
            }
            b2.this.a(appLovinAdF);
            b2.this.f19085b.O();
            if (com.applovin.impl.sdk.o.a()) {
                b2.this.f19085b.O().a("IncentivizedAdController", "Notifying listener of rewarded ad dismissal");
            }
            l2.b(this.f19097b, appLovinAd);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [com.applovin.sdk.AppLovinAd] */
        /* JADX WARN: Type inference failed for: r0v5, types: [com.applovin.sdk.AppLovinAd] */
        @Override // com.applovin.impl.f2
        public void onAdDisplayFailed(String str) {
            String str2;
            ?? r02 = this.f19096a;
            boolean z10 = r02 instanceof com.applovin.impl.sdk.ad.c;
            com.applovin.impl.sdk.ad.b bVarF = r02;
            if (z10) {
                bVarF = ((com.applovin.impl.sdk.ad.c) r02).f();
            }
            boolean z11 = this.f19097b instanceof f2;
            if (bVarF instanceof com.applovin.impl.sdk.ad.b) {
                a(bVarF);
            } else {
                if (bVarF == null) {
                    str2 = "null/expired ad";
                } else {
                    str2 = "invalid ad of type: " + bVarF;
                }
                b2.this.f19085b.O();
                if (com.applovin.impl.sdk.o.a()) {
                    com.applovin.impl.sdk.o oVarO = b2.this.f19085b.O();
                    StringBuilder sb = new StringBuilder("Received `");
                    sb.append(z11 ? "adDisplayFailed" : "adHidden");
                    sb.append("` callback for ");
                    sb.append(str2);
                    oVarO.b("IncentivizedAdController", sb.toString());
                }
            }
            b2.this.a(bVarF);
            if (z11) {
                l2.a(this.f19097b, str);
            } else {
                l2.b(this.f19097b, this.f19096a);
            }
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userOverQuota(AppLovinAd appLovinAd, Map map) {
            b2.this.a("quota_exceeded");
            l2.b(this.f19100e, appLovinAd, map);
            b2.this.f19085b.g().a(y1.f21823v, (com.applovin.impl.sdk.ad.b) appLovinAd, CollectionUtils.hashMap("error_message", "quota_exceeded"));
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userRewardRejected(AppLovinAd appLovinAd, Map map) {
            b2.this.a("rejected");
            l2.a(this.f19100e, appLovinAd, map);
            b2.this.f19085b.g().a(y1.f21823v, (com.applovin.impl.sdk.ad.b) appLovinAd, CollectionUtils.hashMap("error_message", "rejected"));
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userRewardVerified(AppLovinAd appLovinAd, Map map) {
            b2.this.a("accepted");
            l2.c(this.f19100e, appLovinAd, map);
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void validationRequestFailed(AppLovinAd appLovinAd, int i) {
            b2.this.a("network_timeout");
            l2.a(this.f19100e, appLovinAd, i);
            b2.this.f19085b.g().a(y1.f21823v, (com.applovin.impl.sdk.ad.b) appLovinAd, CollectionUtils.hashMap("error_message", "network_timeout"));
        }

        @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
        public void videoPlaybackBegan(AppLovinAd appLovinAd) {
            l2.a(this.f19099d, appLovinAd);
        }

        @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
        public void videoPlaybackEnded(AppLovinAd appLovinAd, double d10, boolean z10) {
            l2.a(this.f19099d, appLovinAd, d10, z10);
            b2.this.f19092j = d10;
            b2.this.i = z10;
        }

        private c(AppLovinAd appLovinAd, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
            this.f19096a = appLovinAd;
            this.f19097b = appLovinAdDisplayListener;
            this.f19098c = appLovinAdClickListener;
            this.f19099d = appLovinAdVideoPlaybackListener;
            this.f19100e = appLovinAdRewardListener;
        }
    }

    public b2(String str, AppLovinSdk appLovinSdk) {
        this.f19085b = appLovinSdk.a();
        this.f19086c = (AppLovinAdServiceImpl) appLovinSdk.getAdService();
        this.f19088e = str;
    }

    private void e() {
        AppLovinAdLoadListener appLovinAdLoadListener;
        SoftReference softReference = this.f19089f;
        if (softReference == null || (appLovinAdLoadListener = (AppLovinAdLoadListener) softReference.get()) == null) {
            return;
        }
        appLovinAdLoadListener.failedToReceiveAd(AppLovinErrorCodes.INCENTIVIZED_NO_AD_PRELOADED);
    }

    public boolean d() {
        return this.f19087d != null;
    }

    public String c() {
        return this.f19088e;
    }

    public void b(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f19085b.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f19085b.O().a("IncentivizedAdController", "User requested preload of incentivized ad...");
        }
        this.f19089f = new SoftReference(appLovinAdLoadListener);
        if (d()) {
            com.applovin.impl.sdk.o.h("IncentivizedAdController", "Attempted to call preloadAndNotify: while an ad was already loaded or currently being played. Do not call preloadAndNotify: again until the last ad has been closed (adHidden).");
            if (appLovinAdLoadListener != null) {
                appLovinAdLoadListener.adReceived(this.f19087d);
                return;
            }
            return;
        }
        a(new b(appLovinAdLoadListener));
    }

    private void a(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f19086c.loadNextIncentivizedAd(this.f19088e, appLovinAdLoadListener);
    }

    private void a(AppLovinAd appLovinAd, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        AppLovinAdImpl appLovinAdImpl;
        if (appLovinAd != null) {
            appLovinAdImpl = (AppLovinAdImpl) appLovinAd;
        } else {
            appLovinAdImpl = (AppLovinAdImpl) this.f19087d;
        }
        AppLovinAdImpl appLovinAdImpl2 = appLovinAdImpl;
        if (appLovinAdImpl2 != null) {
            a(appLovinAdImpl2, context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
        } else {
            com.applovin.impl.sdk.o.h("IncentivizedAdController", "Skipping incentivized video playback: user attempted to play an incentivized video before one was preloaded.");
            e();
        }
    }

    public void b(AppLovinAd appLovinAd, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        if (appLovinAdRewardListener == null) {
            appLovinAdRewardListener = a();
        }
        a(appLovinAd, context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
    }

    public void b(AppLovinAd appLovinAd, ViewGroup viewGroup, AbstractC1781n abstractC1781n, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        if (appLovinAdRewardListener == null) {
            appLovinAdRewardListener = a();
        }
        a(appLovinAd, viewGroup, abstractC1781n, context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
    }

    private void a(AppLovinAd appLovinAd, ViewGroup viewGroup, AbstractC1781n abstractC1781n, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        AppLovinAdImpl appLovinAdImpl;
        if (appLovinAd != null) {
            appLovinAdImpl = (AppLovinAdImpl) appLovinAd;
        } else {
            appLovinAdImpl = (AppLovinAdImpl) this.f19087d;
        }
        AppLovinAdImpl appLovinAdImpl2 = appLovinAdImpl;
        if (appLovinAdImpl2 != null) {
            a(appLovinAdImpl2, viewGroup, abstractC1781n, context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
        } else {
            com.applovin.impl.sdk.o.h("IncentivizedAdController", "Skipping incentivized video playback: user attempted to play an incentivized video before one was preloaded.");
            e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b() {
        String str;
        synchronized (this.f19090g) {
            str = this.f19091h;
        }
        return str;
    }

    private void a(com.applovin.impl.sdk.ad.b bVar, AppLovinAdRewardListener appLovinAdRewardListener) {
        this.f19085b.q0().a((w4) new g6(bVar, appLovinAdRewardListener, this.f19085b), r5.b.OTHER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        synchronized (this.f19090g) {
            this.f19091h = str;
        }
    }

    public void a(String str, Object obj) {
        this.f19084a.put(str, obj);
    }

    private void a(AppLovinAdImpl appLovinAdImpl, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        Map mapA = a2.a(appLovinAdImpl);
        CollectionUtils.putStringIfValid(AdRevenueConstants.SOURCE_KEY, "showRewardedAd", mapA);
        this.f19085b.g().d(y1.f21811p, mapA);
        c cVar = new c(this, appLovinAdImpl, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener, null);
        AppLovinAd appLovinAdA = a7.a(appLovinAdImpl, this.f19085b);
        String strA = a(appLovinAdA, appLovinAdImpl);
        if (StringUtils.isValidString(strA)) {
            a(appLovinAdImpl, strA, cVar, cVar);
            return;
        }
        AppLovinInterstitialAdDialog appLovinInterstitialAdDialogCreate = AppLovinInterstitialAd.create(this.f19085b.y0(), context);
        for (String str : this.f19084a.keySet()) {
            appLovinInterstitialAdDialogCreate.setExtraInfo(str, this.f19084a.get(str));
        }
        appLovinInterstitialAdDialogCreate.setAdDisplayListener(cVar);
        appLovinInterstitialAdDialogCreate.setAdVideoPlaybackListener(cVar);
        appLovinInterstitialAdDialogCreate.setAdClickListener(cVar);
        appLovinInterstitialAdDialogCreate.showAndRender(appLovinAdA);
        a((com.applovin.impl.sdk.ad.b) appLovinAdA, cVar);
    }

    private void a(AppLovinAdImpl appLovinAdImpl, ViewGroup viewGroup, AbstractC1781n abstractC1781n, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        Map mapA = a2.a(appLovinAdImpl);
        CollectionUtils.putStringIfValid(AdRevenueConstants.SOURCE_KEY, "showRewardedAdView", mapA);
        this.f19085b.g().d(y1.f21811p, mapA);
        c cVar = new c(this, appLovinAdImpl, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener, null);
        AppLovinAd appLovinAdA = a7.a(appLovinAdImpl, this.f19085b);
        String strA = a(appLovinAdA, appLovinAdImpl);
        if (StringUtils.isValidString(strA)) {
            a(appLovinAdImpl, strA, cVar, cVar);
            return;
        }
        AppLovinInterstitialAdDialog appLovinInterstitialAdDialogCreate = AppLovinInterstitialAd.create(this.f19085b.y0(), context);
        for (String str : this.f19084a.keySet()) {
            appLovinInterstitialAdDialogCreate.setExtraInfo(str, this.f19084a.get(str));
        }
        appLovinInterstitialAdDialogCreate.setAdDisplayListener(cVar);
        appLovinInterstitialAdDialogCreate.setAdVideoPlaybackListener(cVar);
        appLovinInterstitialAdDialogCreate.setAdClickListener(cVar);
        appLovinInterstitialAdDialogCreate.showAndRender(appLovinAdA, viewGroup, abstractC1781n);
        a((com.applovin.impl.sdk.ad.b) appLovinAdA, cVar);
    }

    private String a(AppLovinAd appLovinAd, AppLovinAd appLovinAd2) {
        if (appLovinAd == null) {
            com.applovin.impl.sdk.o.h("IncentivizedAdController", "Unable to retrieve the loaded ad. This can occur when attempting to show an expired ad.: " + appLovinAd2);
            return "Unable to retrieve the loaded ad. This can occur when attempting to show an expired ad.";
        }
        if (appLovinAd2.getType() == AppLovinAdType.INCENTIVIZED) {
            return null;
        }
        com.applovin.impl.sdk.o.h("IncentivizedAdController", "Attempting to display ad with invalid ad type: " + appLovinAd2.getType());
        return "Attempting to display ad with invalid ad type";
    }

    private void a(AppLovinAd appLovinAd, String str, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, f2 f2Var) {
        l2.a(appLovinAdVideoPlaybackListener, appLovinAd, 0.0d, false);
        l2.a(f2Var, str);
        Map mapA = a2.a((AppLovinAdImpl) appLovinAd);
        CollectionUtils.putStringIfValid(AdRevenueConstants.SOURCE_KEY, "rewardedAdShowFailed", mapA);
        CollectionUtils.putStringIfValid("error_message", str, mapA);
        this.f19085b.g().d(y1.f21817s, mapA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(AppLovinAd appLovinAd) {
        AppLovinAd appLovinAd2 = this.f19087d;
        if (appLovinAd2 == null) {
            return;
        }
        if (!(appLovinAd2 instanceof com.applovin.impl.sdk.ad.c)) {
            if (appLovinAd == appLovinAd2) {
                this.f19087d = null;
            }
        } else {
            com.applovin.impl.sdk.ad.c cVar = (com.applovin.impl.sdk.ad.c) appLovinAd2;
            if (cVar.f() == null || appLovinAd == cVar.f()) {
                this.f19087d = null;
            }
        }
    }

    private AppLovinAdRewardListener a() {
        return new a();
    }
}
