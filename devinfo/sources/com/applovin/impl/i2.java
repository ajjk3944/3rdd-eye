package com.applovin.impl;

import android.content.Context;
import android.view.ViewGroup;
import com.applovin.adview.AppLovinInterstitialAd;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.impl.d6;
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
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class i2 {

    /* renamed from: b, reason: collision with root package name */
    protected final com.applovin.impl.sdk.k f4270b;

    /* renamed from: c, reason: collision with root package name */
    protected final AppLovinAdServiceImpl f4271c;

    /* renamed from: d, reason: collision with root package name */
    private AppLovinAd f4272d;

    /* renamed from: e, reason: collision with root package name */
    private String f4273e;

    /* renamed from: f, reason: collision with root package name */
    private SoftReference f4274f;

    /* renamed from: h, reason: collision with root package name */
    private volatile String f4275h;
    private volatile double j;

    /* renamed from: a, reason: collision with root package name */
    public final Map f4269a = a0.g.r();
    private final Object g = new Object();

    /* renamed from: i, reason: collision with root package name */
    private volatile boolean f4276i = false;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class a implements AppLovinAdRewardListener {
        public a() {
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userOverQuota(AppLovinAd appLovinAd, Map map) {
            i2.this.f4270b.O();
            if (com.applovin.impl.sdk.o.a()) {
                i2.this.f4270b.O().b("IncentivizedAdController", "User over quota: " + map);
            }
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userRewardRejected(AppLovinAd appLovinAd, Map map) {
            i2.this.f4270b.O();
            if (com.applovin.impl.sdk.o.a()) {
                i2.this.f4270b.O().b("IncentivizedAdController", "Reward rejected: " + map);
            }
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userRewardVerified(AppLovinAd appLovinAd, Map map) {
            i2.this.f4270b.O();
            if (com.applovin.impl.sdk.o.a()) {
                i2.this.f4270b.O().a("IncentivizedAdController", "Reward validated: " + map);
            }
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void validationRequestFailed(AppLovinAd appLovinAd, int i4) {
            i2.this.f4270b.O();
            if (com.applovin.impl.sdk.o.a()) {
                i2.this.f4270b.O().b("IncentivizedAdController", "Reward validation failed: " + i4);
            }
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class b implements AppLovinAdLoadListener {

        /* renamed from: a, reason: collision with root package name */
        private final AppLovinAdLoadListener f4278a;

        public b(AppLovinAdLoadListener appLovinAdLoadListener) {
            this.f4278a = appLovinAdLoadListener;
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void adReceived(AppLovinAd appLovinAd) {
            i2.this.f4272d = appLovinAd;
            if (this.f4278a != null) {
                AppLovinSdkUtils.runOnUiThread(new w8(2, this, appLovinAd));
            }
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void failedToReceiveAd(int i4) {
            if (this.f4278a != null) {
                AppLovinSdkUtils.runOnUiThread(new m9(this, i4, 0));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(AppLovinAd appLovinAd) {
            try {
                this.f4278a.adReceived(appLovinAd);
            } catch (Throwable th2) {
                com.applovin.impl.sdk.o.c("AppLovinIncentivizedInterstitial", "Unable to notify ad listener about a newly loaded ad", th2);
                i2.this.f4270b.D().a("IncentivizedAdController", "adLoaded", th2);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(int i4) {
            try {
                this.f4278a.failedToReceiveAd(i4);
            } catch (Throwable th2) {
                com.applovin.impl.sdk.o.c("AppLovinIncentivizedInterstitial", "Unable to notify listener about ad load failure", th2);
                i2.this.f4270b.D().a("IncentivizedAdController", "adLoadFailed", th2);
            }
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class c implements l2, AppLovinAdVideoPlaybackListener, AppLovinAdRewardListener, AppLovinAdClickListener {

        /* renamed from: a, reason: collision with root package name */
        private final AppLovinAd f4280a;

        /* renamed from: b, reason: collision with root package name */
        private final AppLovinAdDisplayListener f4281b;

        /* renamed from: c, reason: collision with root package name */
        private final AppLovinAdClickListener f4282c;

        /* renamed from: d, reason: collision with root package name */
        private final AppLovinAdVideoPlaybackListener f4283d;

        /* renamed from: e, reason: collision with root package name */
        private final AppLovinAdRewardListener f4284e;

        public /* synthetic */ c(i2 i2Var, AppLovinAd appLovinAd, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener, a aVar) {
            this(appLovinAd, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
        }

        private void a(com.applovin.impl.sdk.ad.b bVar, String str) {
            int i4;
            i2.this.f4270b.O();
            if (com.applovin.impl.sdk.o.a()) {
                i2.this.f4270b.O().a("IncentivizedAdController", "Finishing direct ad...");
            }
            String strB = i2.this.b();
            if (!StringUtils.isValidString(strB) || !i2.this.f4276i) {
                i2.this.f4270b.O();
                if (com.applovin.impl.sdk.o.a()) {
                    com.applovin.impl.sdk.o oVarO = i2.this.f4270b.O();
                    StringBuilder sbA = d.h.A("Invalid reward state - result: ", strB, " and wasFullyEngaged: ");
                    sbA.append(i2.this.f4276i);
                    oVarO.b("IncentivizedAdController", sbA.toString());
                }
                i2.this.f4270b.O();
                if (com.applovin.impl.sdk.o.a()) {
                    i2.this.f4270b.O().a("IncentivizedAdController", "Cancelling any incoming reward requests for this ad");
                }
                bVar.d();
                if (i2.this.f4276i) {
                    i2.this.f4270b.O();
                    if (com.applovin.impl.sdk.o.a()) {
                        i2.this.f4270b.O().b("IncentivizedAdController", "User closed the ad after fully watching but reward validation task did not return on time");
                    }
                    str = "network_timeout";
                    i4 = AppLovinErrorCodes.INCENTIVIZED_SERVER_TIMEOUT;
                } else {
                    if (str == null) {
                        str = "unknown_early_dismissal_source";
                    }
                    i2.this.f4270b.O();
                    if (com.applovin.impl.sdk.o.a()) {
                        i2.this.f4270b.O().b("IncentivizedAdController", "Ad closed prematurely from source: ".concat(str));
                    }
                    i4 = AppLovinErrorCodes.INCENTIVIZED_USER_CLOSED_VIDEO;
                }
                bVar.a(o4.a(str));
                i2.this.f4270b.O();
                if (com.applovin.impl.sdk.o.a()) {
                    i2.this.f4270b.O().a("IncentivizedAdController", "Notifying listener of reward validation failure");
                }
                t2.a(this.f4284e, bVar, i4);
                HashMap<String, String> mapHashMap = CollectionUtils.hashMap("details", String.valueOf(i2.this.j));
                CollectionUtils.putStringIfValid("source", str, mapHashMap);
                i2.this.f4270b.g().a(d2.J, bVar, mapHashMap);
            }
            if (bVar.z0().getAndSet(true)) {
                return;
            }
            i2.this.f4270b.O();
            if (com.applovin.impl.sdk.o.a()) {
                i2.this.f4270b.O().a("IncentivizedAdController", "Scheduling report rewarded ad...");
            }
            i2.this.f4270b.q0().a((i5) new m6(bVar, i2.this.f4270b), d6.b.OTHER);
        }

        @Override // com.applovin.sdk.AppLovinAdClickListener
        public void adClicked(AppLovinAd appLovinAd) {
            t2.a(this.f4282c, appLovinAd);
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adDisplayed(AppLovinAd appLovinAd) {
            t2.a(this.f4281b, appLovinAd);
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adHidden(AppLovinAd appLovinAd) {
            String str;
            AppLovinAd appLovinAdF = appLovinAd instanceof com.applovin.impl.sdk.ad.c ? ((com.applovin.impl.sdk.ad.c) appLovinAd).f() : appLovinAd;
            if (appLovinAdF instanceof com.applovin.impl.sdk.ad.b) {
                com.applovin.impl.sdk.ad.b bVar = (com.applovin.impl.sdk.ad.b) appLovinAdF;
                a(bVar, a(bVar, false));
            } else {
                if (appLovinAdF == null) {
                    str = "null/expired ad";
                } else {
                    str = "invalid ad of type: " + appLovinAdF;
                }
                i2.this.f4270b.O();
                if (com.applovin.impl.sdk.o.a()) {
                    i2.this.f4270b.O().b("IncentivizedAdController", "Received `adHidden` callback for " + str);
                }
            }
            i2.this.a(appLovinAdF);
            i2.this.f4270b.O();
            if (com.applovin.impl.sdk.o.a()) {
                i2.this.f4270b.O().a("IncentivizedAdController", "Notifying listener of rewarded ad dismissal");
            }
            t2.b(this.f4281b, appLovinAd);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [com.applovin.sdk.AppLovinAd] */
        /* JADX WARN: Type inference failed for: r0v5, types: [com.applovin.sdk.AppLovinAd] */
        @Override // com.applovin.impl.l2
        public void onAdDisplayFailed(String str) {
            String str2;
            ?? r02 = this.f4280a;
            boolean z3 = r02 instanceof com.applovin.impl.sdk.ad.c;
            com.applovin.impl.sdk.ad.b bVarF = r02;
            if (z3) {
                bVarF = ((com.applovin.impl.sdk.ad.c) r02).f();
            }
            boolean z10 = this.f4281b instanceof l2;
            if (bVarF instanceof com.applovin.impl.sdk.ad.b) {
                com.applovin.impl.sdk.ad.b bVar = bVarF;
                a(bVar, a(bVar, StringUtils.isValidString(str)));
            } else {
                if (bVarF == null) {
                    str2 = "null/expired ad";
                } else {
                    str2 = "invalid ad of type: " + bVarF;
                }
                i2.this.f4270b.O();
                if (com.applovin.impl.sdk.o.a()) {
                    i2.this.f4270b.O().b("IncentivizedAdController", r5.c.m(new StringBuilder("Received `"), z10 ? "adDisplayFailed" : "adHidden", "` callback for ", str2));
                }
            }
            i2.this.a(bVarF);
            if (z10) {
                t2.a(this.f4281b, str);
            } else {
                t2.b(this.f4281b, this.f4280a);
            }
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userOverQuota(AppLovinAd appLovinAd, Map map) {
            i2.this.a("quota_exceeded");
            t2.b(this.f4284e, appLovinAd, map);
            i2.this.f4270b.g().a(d2.I, (com.applovin.impl.sdk.ad.b) appLovinAd, CollectionUtils.hashMap("error_message", "quota_exceeded"));
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userRewardRejected(AppLovinAd appLovinAd, Map map) {
            i2.this.a("rejected");
            t2.a(this.f4284e, appLovinAd, map);
            i2.this.f4270b.g().a(d2.I, (com.applovin.impl.sdk.ad.b) appLovinAd, CollectionUtils.hashMap("error_message", "rejected"));
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userRewardVerified(AppLovinAd appLovinAd, Map map) {
            i2.this.a("accepted");
            t2.c(this.f4284e, appLovinAd, map);
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void validationRequestFailed(AppLovinAd appLovinAd, int i4) {
            i2.this.a("network_timeout");
            t2.a(this.f4284e, appLovinAd, i4);
            i2.this.f4270b.g().a(d2.I, (com.applovin.impl.sdk.ad.b) appLovinAd, CollectionUtils.hashMap("error_message", "network_timeout"));
        }

        @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
        public void videoPlaybackBegan(AppLovinAd appLovinAd) {
            t2.a(this.f4283d, appLovinAd);
        }

        @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
        public void videoPlaybackEnded(AppLovinAd appLovinAd, double d10, boolean z3) {
            AppLovinAd appLovinAdF = appLovinAd instanceof com.applovin.impl.sdk.ad.c ? ((com.applovin.impl.sdk.ad.c) appLovinAd).f() : appLovinAd;
            boolean z10 = (appLovinAdF instanceof com.applovin.impl.sdk.ad.b) && ((com.applovin.impl.sdk.ad.b) appLovinAdF).G0();
            i2 i2Var = i2.this;
            if (z10) {
                d10 = 100.0d;
            }
            i2Var.j = d10;
            i2.this.f4276i = z3 || z10;
            t2.a(this.f4283d, appLovinAd, i2.this.j, i2.this.f4276i);
        }

        private c(AppLovinAd appLovinAd, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
            this.f4280a = appLovinAd;
            this.f4281b = appLovinAdDisplayListener;
            this.f4282c = appLovinAdClickListener;
            this.f4283d = appLovinAdVideoPlaybackListener;
            this.f4284e = appLovinAdRewardListener;
        }

        private String a(com.applovin.impl.sdk.ad.b bVar, boolean z3) {
            if (StringUtils.isValidString(bVar.v())) {
                return bVar.v();
            }
            if (z3) {
                return "ad_display_failure";
            }
            return null;
        }
    }

    public i2(String str, AppLovinSdk appLovinSdk) {
        this.f4270b = appLovinSdk.a();
        this.f4271c = (AppLovinAdServiceImpl) appLovinSdk.getAdService();
        this.f4273e = str;
    }

    private void e() {
        AppLovinAdLoadListener appLovinAdLoadListener;
        SoftReference softReference = this.f4274f;
        if (softReference == null || (appLovinAdLoadListener = (AppLovinAdLoadListener) softReference.get()) == null) {
            return;
        }
        appLovinAdLoadListener.failedToReceiveAd(AppLovinErrorCodes.INCENTIVIZED_NO_AD_PRELOADED);
    }

    public boolean d() {
        return this.f4272d != null;
    }

    public String c() {
        return this.f4273e;
    }

    public void b(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f4270b.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f4270b.O().a("IncentivizedAdController", "User requested preload of incentivized ad...");
        }
        this.f4274f = new SoftReference(appLovinAdLoadListener);
        if (d()) {
            com.applovin.impl.sdk.o.h("IncentivizedAdController", "Attempted to call preloadAndNotify: while an ad was already loaded or currently being played. Do not call preloadAndNotify: again until the last ad has been closed (adHidden).");
            if (appLovinAdLoadListener != null) {
                appLovinAdLoadListener.adReceived(this.f4272d);
                return;
            }
            return;
        }
        a(new b(appLovinAdLoadListener));
    }

    private void a(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f4271c.loadNextIncentivizedAd(this.f4273e, appLovinAdLoadListener);
    }

    private void a(AppLovinAd appLovinAd, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        AppLovinAdImpl appLovinAdImpl;
        if (appLovinAd != null) {
            appLovinAdImpl = (AppLovinAdImpl) appLovinAd;
        } else {
            appLovinAdImpl = (AppLovinAdImpl) this.f4272d;
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

    public void b(AppLovinAd appLovinAd, ViewGroup viewGroup, androidx.lifecycle.t tVar, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        if (appLovinAdRewardListener == null) {
            appLovinAdRewardListener = a();
        }
        a(appLovinAd, viewGroup, tVar, context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
    }

    private void a(AppLovinAd appLovinAd, ViewGroup viewGroup, androidx.lifecycle.t tVar, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        AppLovinAdImpl appLovinAdImpl;
        if (appLovinAd != null) {
            appLovinAdImpl = (AppLovinAdImpl) appLovinAd;
        } else {
            appLovinAdImpl = (AppLovinAdImpl) this.f4272d;
        }
        AppLovinAdImpl appLovinAdImpl2 = appLovinAdImpl;
        if (appLovinAdImpl2 != null) {
            a(appLovinAdImpl2, viewGroup, tVar, context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
        } else {
            com.applovin.impl.sdk.o.h("IncentivizedAdController", "Skipping incentivized video playback: user attempted to play an incentivized video before one was preloaded.");
            e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b() {
        String str;
        synchronized (this.g) {
            str = this.f4275h;
        }
        return str;
    }

    private void a(com.applovin.impl.sdk.ad.b bVar, AppLovinAdRewardListener appLovinAdRewardListener) {
        this.f4270b.q0().a((i5) new t6(bVar, appLovinAdRewardListener, this.f4270b), d6.b.OTHER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        synchronized (this.g) {
            this.f4275h = str;
        }
    }

    public void a(String str, Object obj) {
        this.f4269a.put(str, obj);
    }

    private void a(AppLovinAdImpl appLovinAdImpl, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        Map mapA = f2.a(appLovinAdImpl);
        CollectionUtils.putStringIfValid("source", "showRewardedAd", mapA);
        this.f4270b.g().d(d2.C, mapA);
        c cVar = new c(this, appLovinAdImpl, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener, null);
        AppLovinAd appLovinAdA = n7.a(appLovinAdImpl, this.f4270b);
        String strA = a(appLovinAdA, appLovinAdImpl);
        if (StringUtils.isValidString(strA)) {
            a(appLovinAdImpl, strA, cVar, cVar);
            return;
        }
        AppLovinInterstitialAdDialog appLovinInterstitialAdDialogCreate = AppLovinInterstitialAd.create(this.f4270b.y0(), context);
        for (String str : this.f4269a.keySet()) {
            appLovinInterstitialAdDialogCreate.setExtraInfo(str, this.f4269a.get(str));
        }
        appLovinInterstitialAdDialogCreate.setAdDisplayListener(cVar);
        appLovinInterstitialAdDialogCreate.setAdVideoPlaybackListener(cVar);
        appLovinInterstitialAdDialogCreate.setAdClickListener(cVar);
        appLovinInterstitialAdDialogCreate.showAndRender(appLovinAdA);
        a((com.applovin.impl.sdk.ad.b) appLovinAdA, cVar);
    }

    private void a(AppLovinAdImpl appLovinAdImpl, ViewGroup viewGroup, androidx.lifecycle.t tVar, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        Map mapA = f2.a(appLovinAdImpl);
        CollectionUtils.putStringIfValid("source", "showRewardedAdView", mapA);
        this.f4270b.g().d(d2.C, mapA);
        c cVar = new c(this, appLovinAdImpl, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener, null);
        AppLovinAd appLovinAdA = n7.a(appLovinAdImpl, this.f4270b);
        String strA = a(appLovinAdA, appLovinAdImpl);
        if (StringUtils.isValidString(strA)) {
            a(appLovinAdImpl, strA, cVar, cVar);
            return;
        }
        AppLovinInterstitialAdDialog appLovinInterstitialAdDialogCreate = AppLovinInterstitialAd.create(this.f4270b.y0(), context);
        for (String str : this.f4269a.keySet()) {
            appLovinInterstitialAdDialogCreate.setExtraInfo(str, this.f4269a.get(str));
        }
        appLovinInterstitialAdDialogCreate.setAdDisplayListener(cVar);
        appLovinInterstitialAdDialogCreate.setAdVideoPlaybackListener(cVar);
        appLovinInterstitialAdDialogCreate.setAdClickListener(cVar);
        appLovinInterstitialAdDialogCreate.showAndRender(appLovinAdA, viewGroup, tVar);
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

    private void a(AppLovinAd appLovinAd, String str, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, l2 l2Var) {
        t2.a(appLovinAdVideoPlaybackListener, appLovinAd, 0.0d, false);
        t2.a(l2Var, str);
        Map mapA = f2.a((AppLovinAdImpl) appLovinAd);
        CollectionUtils.putStringIfValid("source", "rewardedAdShowFailed", mapA);
        CollectionUtils.putStringIfValid("error_message", str, mapA);
        this.f4270b.g().d(d2.F, mapA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(AppLovinAd appLovinAd) {
        AppLovinAd appLovinAd2 = this.f4272d;
        if (appLovinAd2 == null) {
            return;
        }
        if (!(appLovinAd2 instanceof com.applovin.impl.sdk.ad.c)) {
            if (appLovinAd == appLovinAd2) {
                this.f4272d = null;
            }
        } else {
            com.applovin.impl.sdk.ad.c cVar = (com.applovin.impl.sdk.ad.c) appLovinAd2;
            if (cVar.f() == null || appLovinAd == cVar.f()) {
                this.f4272d = null;
            }
        }
    }

    private AppLovinAdRewardListener a() {
        return new a();
    }
}
