package com.applovin.impl.mediation;

import C.V;
import N7.B8;
import N7.G8;
import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1781n;
import com.applovin.impl.a3;
import com.applovin.impl.f6;
import com.applovin.impl.g3;
import com.applovin.impl.g4;
import com.applovin.impl.l4;
import com.applovin.impl.mediation.MediationServiceImpl;
import com.applovin.impl.q2;
import com.applovin.impl.r4;
import com.applovin.impl.r5;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.t2;
import com.applovin.impl.w4;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.adapter.MaxAdViewAdapter;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.MaxAppOpenAdapter;
import com.applovin.mediation.adapter.MaxInterstitialAdViewAdapter;
import com.applovin.mediation.adapter.MaxInterstitialAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdViewAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdapter;
import com.applovin.mediation.adapter.MaxSignalProvider;
import com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import com.applovin.mediation.adapters.MediationAdapterBase;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinSdkUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.impl.Oo;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class h {

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f20439b;

    /* renamed from: c, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f20440c;

    /* renamed from: d, reason: collision with root package name */
    private final String f20441d;

    /* renamed from: e, reason: collision with root package name */
    private final a3 f20442e;

    /* renamed from: f, reason: collision with root package name */
    private final String f20443f;

    /* renamed from: g, reason: collision with root package name */
    private MaxAdapter f20444g;

    /* renamed from: h, reason: collision with root package name */
    private String f20445h;
    private q2 i;

    /* renamed from: j, reason: collision with root package name */
    private View f20446j;

    /* renamed from: k, reason: collision with root package name */
    private MaxNativeAd f20447k;

    /* renamed from: l, reason: collision with root package name */
    private MaxNativeAdView f20448l;

    /* renamed from: m, reason: collision with root package name */
    private ViewGroup f20449m;

    /* renamed from: o, reason: collision with root package name */
    private MaxAdapterResponseParameters f20451o;

    /* renamed from: s, reason: collision with root package name */
    private final boolean f20455s;

    /* renamed from: a, reason: collision with root package name */
    private final Handler f20438a = new Handler(Looper.getMainLooper());

    /* renamed from: n, reason: collision with root package name */
    private final b f20450n = new b(this, null);

    /* renamed from: p, reason: collision with root package name */
    private final AtomicBoolean f20452p = new AtomicBoolean(true);

    /* renamed from: q, reason: collision with root package name */
    private final AtomicBoolean f20453q = new AtomicBoolean(false);

    /* renamed from: r, reason: collision with root package name */
    private final AtomicBoolean f20454r = new AtomicBoolean(false);

    public class a implements MaxSignalCollectionListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ r4 f20456a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ g4 f20457b;

        public a(r4 r4Var, g4 g4Var) {
            this.f20456a = r4Var;
            this.f20457b = g4Var;
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener
        public void onSignalCollected(String str) {
            if (this.f20456a.x() && TextUtils.isEmpty(str)) {
                this.f20457b.a(new MaxErrorImpl("Signal is not a valid string"));
            } else {
                this.f20457b.b(str);
            }
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener
        public void onSignalCollectionFailed(String str) {
            this.f20457b.a(new MaxErrorImpl(str));
        }
    }

    public class b implements MaxInterstitialAdapterListener, MaxAppOpenAdapterListener, MaxRewardedAdapterListener, MaxAdViewAdapterListener, MaxNativeAdAdapterListener {

        /* renamed from: a, reason: collision with root package name */
        private MediationServiceImpl.b f20459a;

        private b() {
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdClicked() {
            onAdViewAdClicked(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdCollapsed() {
            onAdViewAdCollapsed(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdDisplayFailed(MaxAdapterError maxAdapterError) {
            onAdViewAdDisplayFailed(maxAdapterError, null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdDisplayed() {
            onAdViewAdDisplayed(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdExpanded() {
            onAdViewAdExpanded(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdHidden() {
            onAdViewAdHidden(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdLoadFailed(MaxAdapterError maxAdapterError) {
            com.applovin.impl.sdk.o unused = h.this.f20440c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f20440c.k("MediationAdapterWrapper", h.this.f20443f + ": adview ad ad failed to load with error: " + maxAdapterError);
            }
            a("onAdViewAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdLoaded(View view) {
            onAdViewAdLoaded(view, null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdClicked() {
            onAppOpenAdClicked(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdDisplayFailed(MaxAdapterError maxAdapterError) {
            onAppOpenAdDisplayFailed(maxAdapterError, null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdDisplayed() {
            onAppOpenAdDisplayed(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdHidden() {
            onAppOpenAdHidden(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdLoadFailed(MaxAdapterError maxAdapterError) {
            com.applovin.impl.sdk.o unused = h.this.f20440c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f20440c.k("MediationAdapterWrapper", h.this.f20443f + ": app open ad failed to load with error: " + maxAdapterError);
            }
            a("onAppOpenAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdLoaded() {
            onAppOpenAdLoaded(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdClicked() {
            onInterstitialAdClicked(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdDisplayFailed(MaxAdapterError maxAdapterError) {
            onInterstitialAdDisplayFailed(maxAdapterError, null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdDisplayed() {
            onInterstitialAdDisplayed(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdHidden() {
            onInterstitialAdHidden(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdLoadFailed(MaxAdapterError maxAdapterError) {
            com.applovin.impl.sdk.o unused = h.this.f20440c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f20440c.k("MediationAdapterWrapper", h.this.f20443f + ": interstitial ad failed to load with error " + maxAdapterError);
            }
            a("onInterstitialAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdLoaded() {
            onInterstitialAdLoaded(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdClicked() {
            onNativeAdClicked(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdDisplayed(Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f20440c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f20440c.d("MediationAdapterWrapper", h.this.f20443f + ": native ad displayed with extra info: " + bundle);
            }
            a("onNativeAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdLoadFailed(MaxAdapterError maxAdapterError) {
            com.applovin.impl.sdk.o unused = h.this.f20440c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f20440c.k("MediationAdapterWrapper", h.this.f20443f + ": native ad ad failed to load with error: " + maxAdapterError);
            }
            a("onNativeAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdLoaded(MaxNativeAd maxNativeAd, Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f20440c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f20440c.d("MediationAdapterWrapper", h.this.f20443f + ": native ad loaded with extra info: " + bundle);
            }
            h.this.f20447k = maxNativeAd;
            c("onNativeAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdClicked() {
            onRewardedAdClicked(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdDisplayFailed(MaxAdapterError maxAdapterError) {
            onRewardedAdDisplayFailed(maxAdapterError, null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdDisplayed() {
            onRewardedAdDisplayed(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdHidden() {
            onRewardedAdHidden(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdLoadFailed(MaxAdapterError maxAdapterError) {
            com.applovin.impl.sdk.o unused = h.this.f20440c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f20440c.k("MediationAdapterWrapper", h.this.f20443f + ": rewarded ad failed to load with error: " + maxAdapterError);
            }
            a("onRewardedAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdLoaded() {
            onRewardedAdLoaded(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onUserRewarded(MaxReward maxReward) {
            onUserRewarded(maxReward, null);
        }

        public /* synthetic */ b(h hVar, a aVar) {
            this();
        }

        private void b(String str, Bundle bundle) {
            if (h.this.i.w().compareAndSet(false, true)) {
                a(str, this.f20459a, new x(this, bundle, 0));
            }
        }

        private void c(String str, Bundle bundle) {
            if (!h.this.i.w().get()) {
                h.this.f20454r.set(true);
                a(str, this.f20459a, new t(0, this, bundle));
                return;
            }
            com.applovin.impl.sdk.o unused = h.this.f20440c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f20440c.b("MediationAdapterWrapper", h.this.f20443f + ": blocking ad loaded callback for " + h.this.i + " since onAdHidden() has been called");
            }
            h.this.f20439b.u().a(h.this.i, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(Bundle bundle) {
            this.f20459a.a(h.this.i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void e(Bundle bundle) {
            this.f20459a.a(h.this.i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f(Bundle bundle) {
            this.f20459a.a(h.this.i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void g(Bundle bundle) {
            this.f20459a.c(h.this.i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void h(Bundle bundle) {
            this.f20459a.c(h.this.i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void i(Bundle bundle) {
            this.f20459a.e(h.this.i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void j(Bundle bundle) {
            if (h.this.f20453q.compareAndSet(false, true)) {
                this.f20459a.f(h.this.i, bundle);
            }
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdClicked(Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f20440c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f20440c.d("MediationAdapterWrapper", h.this.f20443f + ": adview ad clicked with extra info: " + bundle);
            }
            a("onAdViewAdClicked", this.f20459a, new t(1, this, bundle));
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdCollapsed(Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f20440c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f20440c.d("MediationAdapterWrapper", h.this.f20443f + ": adview ad collapsed");
            }
            a("onAdViewAdCollapsed", this.f20459a, new Runnable() { // from class: com.applovin.impl.mediation.v
                @Override // java.lang.Runnable
                public final void run() {
                    this.f20525b.a();
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdDisplayFailed(MaxAdapterError maxAdapterError, Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f20440c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f20440c.k("MediationAdapterWrapper", h.this.f20443f + ": adview ad failed to display with error: " + maxAdapterError);
            }
            a("onAdViewAdDisplayFailed", maxAdapterError, bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdDisplayed(Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f20440c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f20440c.d("MediationAdapterWrapper", h.this.f20443f + ": adview ad displayed with extra info: " + bundle);
            }
            a("onAdViewAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdExpanded(Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f20440c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f20440c.d("MediationAdapterWrapper", h.this.f20443f + ": adview ad expanded");
            }
            a("onAdViewAdExpanded", this.f20459a, new w(2, this, bundle));
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdHidden(Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f20440c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f20440c.d("MediationAdapterWrapper", h.this.f20443f + ": adview ad hidden with extra info: " + bundle);
            }
            b("onAdViewAdHidden", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdLoaded(View view, Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f20440c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f20440c.d("MediationAdapterWrapper", h.this.f20443f + ": adview ad loaded with extra info: " + bundle);
            }
            h.this.f20446j = view;
            c("onAdViewAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdClicked(Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f20440c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f20440c.d("MediationAdapterWrapper", h.this.f20443f + ": app open ad clicked with extra info: " + bundle);
            }
            a("onAppOpenAdClicked", this.f20459a, new z(this, bundle, 1));
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdDisplayFailed(MaxAdapterError maxAdapterError, Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f20440c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f20440c.k("MediationAdapterWrapper", h.this.f20443f + ": app open ad display failed with error: " + maxAdapterError);
            }
            a("onAppOpenAdDisplayFailed", maxAdapterError, bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdDisplayed(Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f20440c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f20440c.d("MediationAdapterWrapper", h.this.f20443f + ": app open ad displayed with extra info: " + bundle);
            }
            a("onAppOpenAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdHidden(Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f20440c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f20440c.d("MediationAdapterWrapper", h.this.f20443f + ": app open ad hidden with extra info: " + bundle);
            }
            b("onAppOpenAdHidden", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdLoaded(Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f20440c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f20440c.d("MediationAdapterWrapper", h.this.f20443f + ": app open ad loaded with extra info: " + bundle);
            }
            c("onAppOpenAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdClicked(Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f20440c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f20440c.d("MediationAdapterWrapper", h.this.f20443f + ": interstitial ad clicked with extra info: " + bundle);
            }
            a("onInterstitialAdClicked", this.f20459a, new t(2, this, bundle));
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdDisplayFailed(MaxAdapterError maxAdapterError, Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f20440c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f20440c.k("MediationAdapterWrapper", h.this.f20443f + ": interstitial ad failed to display with error " + maxAdapterError);
            }
            a("onInterstitialAdDisplayFailed", maxAdapterError, bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdDisplayed(Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f20440c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f20440c.d("MediationAdapterWrapper", h.this.f20443f + ": interstitial ad displayed with extra info: " + bundle);
            }
            a("onInterstitialAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdHidden(Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f20440c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f20440c.d("MediationAdapterWrapper", h.this.f20443f + ": interstitial ad hidden with extra info " + bundle);
            }
            b("onInterstitialAdHidden", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdLoaded(Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f20440c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f20440c.d("MediationAdapterWrapper", h.this.f20443f + ": interstitial ad loaded with extra info: " + bundle);
            }
            c("onInterstitialAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdClicked(Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f20440c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f20440c.d("MediationAdapterWrapper", h.this.f20443f + ": native ad clicked");
            }
            a("onNativeAdClicked", this.f20459a, new w(0, this, bundle));
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdClicked(Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f20440c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f20440c.d("MediationAdapterWrapper", h.this.f20443f + ": rewarded ad clicked with extra info: " + bundle);
            }
            a("onRewardedAdClicked", this.f20459a, new z(this, bundle, 0));
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdDisplayFailed(MaxAdapterError maxAdapterError, Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f20440c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f20440c.k("MediationAdapterWrapper", h.this.f20443f + ": rewarded ad display failed with error: " + maxAdapterError);
            }
            a("onRewardedAdDisplayFailed", maxAdapterError, bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdDisplayed(Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f20440c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f20440c.d("MediationAdapterWrapper", h.this.f20443f + ": rewarded ad displayed with extra info: " + bundle);
            }
            a("onRewardedAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdHidden(Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f20440c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f20440c.d("MediationAdapterWrapper", h.this.f20443f + ": rewarded ad hidden with extra info: " + bundle);
            }
            b("onRewardedAdHidden", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdLoaded(Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f20440c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f20440c.d("MediationAdapterWrapper", h.this.f20443f + ": rewarded ad loaded with extra info: " + bundle);
            }
            c("onRewardedAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onUserRewarded(MaxReward maxReward, Bundle bundle) {
            if (h.this.i instanceof t2) {
                t2 t2Var = (t2) h.this.i;
                if (t2Var.m0().compareAndSet(false, true)) {
                    com.applovin.impl.sdk.o unused = h.this.f20440c;
                    if (com.applovin.impl.sdk.o.a()) {
                        h.this.f20440c.d("MediationAdapterWrapper", h.this.f20443f + ": user was rewarded: " + maxReward);
                    }
                    a("onUserRewarded", this.f20459a, new y(this, t2Var, maxReward, bundle, 0));
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(Bundle bundle) {
            this.f20459a.d(h.this.i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(MediationServiceImpl.b bVar) {
            if (bVar != null) {
                this.f20459a = bVar;
                return;
            }
            throw new IllegalArgumentException("No listener specified");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(Bundle bundle) {
            this.f20459a.a(h.this.i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(String str, MaxError maxError) {
            if (h.this.i.w().get()) {
                com.applovin.impl.sdk.o unused = h.this.f20440c;
                if (com.applovin.impl.sdk.o.a()) {
                    h.this.f20440c.b("MediationAdapterWrapper", h.this.f20443f + ": blocking ad load failed callback for " + h.this.i + " since onAdHidden() has been called");
                }
                h.this.f20439b.u().a(h.this.i, str);
                return;
            }
            a(str, this.f20459a, new s(0, this, maxError));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(MaxError maxError) {
            if (h.this.f20453q.compareAndSet(false, true)) {
                this.f20459a.onAdLoadFailed(h.this.f20445h, maxError);
            }
        }

        private void a(String str, Bundle bundle) {
            if (h.this.i.w().get()) {
                com.applovin.impl.sdk.o unused = h.this.f20440c;
                if (com.applovin.impl.sdk.o.a()) {
                    h.this.f20440c.b("MediationAdapterWrapper", h.this.f20443f + ": blocking ad displayed callback for " + h.this.i + " since onAdHidden() has been called");
                }
                h.this.f20439b.u().a(h.this.i, str);
                return;
            }
            if (!((Boolean) h.this.f20439b.a(g3.f19383P7)).booleanValue()) {
                if (h.this.i.u().compareAndSet(false, true)) {
                    a(str, this.f20459a, new x(this, bundle, 1));
                    return;
                }
                return;
            }
            a(str, this.f20459a, new w(1, this, bundle));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(String str, MaxError maxError, Bundle bundle) {
            if (h.this.i.w().get()) {
                com.applovin.impl.sdk.o unused = h.this.f20440c;
                if (com.applovin.impl.sdk.o.a()) {
                    h.this.f20440c.b("MediationAdapterWrapper", h.this.f20443f + ": blocking ad display failed callback for " + h.this.i + " since onAdHidden() has been called");
                }
                h.this.f20439b.u().a(h.this.i, str);
                return;
            }
            a(str, this.f20459a, new u(this, maxError, bundle, 0));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(MaxError maxError, Bundle bundle) {
            this.f20459a.a(h.this.i, maxError, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(t2 t2Var, MaxReward maxReward, Bundle bundle) {
            this.f20459a.a(t2Var, maxReward, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(Bundle bundle) {
            this.f20459a.a(h.this.i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a() {
            this.f20459a.onAdCollapsed(h.this.i);
        }

        private void a(String str, MaxAdListener maxAdListener, Runnable runnable) {
            h.this.f20438a.post(new y(this, runnable, maxAdListener, str, 1));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(Runnable runnable, MaxAdListener maxAdListener, String str) {
            try {
                runnable.run();
            } catch (Throwable th) {
                com.applovin.impl.sdk.o.c("MediationAdapterWrapper", Oo.f("Failed to forward call (", str, ") to ", maxAdListener != null ? maxAdListener.getClass().getName() : null), th);
                h.this.f20439b.E().a("MediationAdapterWrapper", str, th, CollectionUtils.hashMap("adapter_class", h.this.f20442e.b()));
            }
        }
    }

    public static class c implements MaxAdapter.OnCompletionListener {

        /* renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.sdk.k f20461a;

        /* renamed from: b, reason: collision with root package name */
        private final a3 f20462b;

        /* renamed from: c, reason: collision with root package name */
        private final long f20463c;

        /* renamed from: d, reason: collision with root package name */
        private final MaxAdapter.OnCompletionListener f20464d;

        public c(com.applovin.impl.sdk.k kVar, a3 a3Var, long j4, MaxAdapter.OnCompletionListener onCompletionListener) {
            this.f20461a = kVar;
            this.f20462b = a3Var;
            this.f20463c = j4;
            this.f20464d = onCompletionListener;
        }

        @Override // com.applovin.mediation.adapter.MaxAdapter.OnCompletionListener
        public void onCompletion(MaxAdapter.InitializationStatus initializationStatus, String str) {
            AppLovinSdkUtils.runOnUiThreadDelayed(new A(this, initializationStatus, str, 0), this.f20462b.h());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(MaxAdapter.InitializationStatus initializationStatus, String str) {
            this.f20461a.S().a(this.f20462b, SystemClock.elapsedRealtime() - this.f20463c, initializationStatus, str);
            MaxAdapter.OnCompletionListener onCompletionListener = this.f20464d;
            if (onCompletionListener != null) {
                onCompletionListener.onCompletion(initializationStatus, str);
            }
        }
    }

    public class d extends w4 {

        /* renamed from: g, reason: collision with root package name */
        private final WeakReference f20465g;

        public /* synthetic */ d(h hVar, a aVar) {
            this();
        }

        private void b(q2 q2Var) {
            if (q2Var != null) {
                this.f21692a.Z().a(q2Var);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (h.this.f20453q.get()) {
                return;
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.f21694c.b(this.f21693b, h.this.f20443f + " is timing out " + h.this.i + "...");
            }
            b(h.this.i);
            MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-5101, "Adapter timed out");
            b bVar = (b) this.f20465g.get();
            if (bVar != null) {
                bVar.a(this.f21693b, maxErrorImpl);
            }
        }

        private d() {
            super("TaskTimeoutMediatedAd", h.this.f20439b);
            this.f20465g = new WeakReference(h.this.f20450n);
        }
    }

    public h(a3 a3Var, MaxAdapter maxAdapter, boolean z10, com.applovin.impl.sdk.k kVar) {
        if (a3Var == null) {
            throw new IllegalArgumentException("No adapter name specified");
        }
        if (maxAdapter == null) {
            throw new IllegalArgumentException("No adapter specified");
        }
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.f20441d = a3Var.c();
        this.f20444g = maxAdapter;
        this.f20439b = kVar;
        this.f20440c = kVar.O();
        this.f20442e = a3Var;
        this.f20443f = maxAdapter.getClass().getSimpleName();
        this.f20455s = z10;
    }

    public String toString() {
        return B4.f.c(new StringBuilder("MediationAdapterWrapper{adapterTag='"), this.f20443f, "'}");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l() {
        a("destroy");
        MaxAdapter maxAdapter = this.f20444g;
        if (maxAdapter != null) {
            this.f20444g = null;
            maxAdapter.onDestroy();
        } else if (com.applovin.impl.sdk.o.a()) {
            this.f20440c.k("MediationAdapterWrapper", "Mediation adapter '" + this.f20443f + "' is already destroyed");
        }
        this.f20446j = null;
        this.f20447k = null;
        this.f20448l = null;
        this.f20449m = null;
    }

    public ViewGroup h() {
        return this.f20449m;
    }

    public String i() {
        MaxAdapter maxAdapter = this.f20444g;
        if (maxAdapter == null) {
            return null;
        }
        try {
            return maxAdapter.getSdkVersion();
        } catch (Throwable th) {
            com.applovin.impl.sdk.o.c("MediationAdapterWrapper", "Failed to get adapter's SDK version for " + this.f20441d, th);
            this.f20439b.E().a("MediationAdapterWrapper", "sdk_version", th, CollectionUtils.hashMap("adapter_class", this.f20442e.b()));
            a("sdk_version");
            this.f20439b.T().a(this.f20442e.b(), "sdk_version", this.i);
            return null;
        }
    }

    public boolean j() {
        return this.f20453q.get() && this.f20454r.get();
    }

    public boolean k() {
        return this.f20452p.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity) {
        ((MaxAppOpenAdapter) this.f20444g).loadAppOpenAd(maxAdapterResponseParameters, activity, this.f20450n);
    }

    public MediationServiceImpl.b c() {
        return this.f20450n.f20459a;
    }

    public View d() {
        return this.f20446j;
    }

    public MaxNativeAd e() {
        return this.f20447k;
    }

    public MaxNativeAdView f() {
        return this.f20448l;
    }

    public String g() {
        return this.f20441d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity) {
        ((MaxRewardedAdapter) this.f20444g).loadRewardedAd(maxAdapterResponseParameters, activity, this.f20450n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity) {
        ((MediationAdapterBase) this.f20444g).loadNativeAd(maxAdapterResponseParameters, activity, this.f20450n);
    }

    public void a(MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity, MaxAdapter.OnCompletionListener onCompletionListener) {
        b("initialize", new D3.a(this, onCompletionListener, maxAdapterInitializationParameters, activity, 3));
    }

    public void b(q2 q2Var, Activity activity) {
        Runnable sVar;
        if (a(q2Var, activity)) {
            if (q2Var.getFormat() == MaxAdFormat.INTERSTITIAL) {
                sVar = new o(1, this, activity);
            } else if (q2Var.getFormat() == MaxAdFormat.APP_OPEN) {
                sVar = new w(3, this, activity);
            } else if (q2Var.getFormat() == MaxAdFormat.REWARDED) {
                sVar = new s(3, this, activity);
            } else {
                throw new IllegalStateException("Failed to show " + q2Var + ": " + q2Var.getFormat() + " is not a supported ad format");
            }
            a(sVar, q2Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(MaxAdapter.OnCompletionListener onCompletionListener, MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (com.applovin.impl.sdk.o.a()) {
            this.f20440c.a("MediationAdapterWrapper", "Initializing " + this.f20443f + " on thread: " + Thread.currentThread() + " with 'run_on_ui_thread' value: " + this.f20442e.r());
        }
        this.f20444g.initialize(maxAdapterInitializationParameters, activity, new c(this.f20439b, this.f20442e, jElapsedRealtime, onCompletionListener));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(Activity activity) {
        ((MaxRewardedAdapter) this.f20444g).showRewardedAd(this.f20451o, activity, this.f20450n);
    }

    public void a(String str, q2 q2Var) {
        this.f20445h = str;
        this.i = q2Var;
    }

    public void a(MaxNativeAdView maxNativeAdView) {
        this.f20448l = maxNativeAdView;
    }

    public void a(ViewGroup viewGroup) {
        this.f20449m = viewGroup;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Activity activity) {
        ((MaxAppOpenAdapter) this.f20444g).showAppOpenAd(this.f20451o, activity, this.f20450n);
    }

    public void a(String str, MaxAdapterResponseParameters maxAdapterResponseParameters, q2 q2Var, Activity activity, MediationServiceImpl.b bVar) {
        Object eVar;
        if (q2Var != null) {
            if (!this.f20452p.get()) {
                String str2 = "Mediation adapter '" + this.f20443f + "' was disabled due to earlier failures. Loading ads with this adapter is disabled.";
                com.applovin.impl.sdk.o.h("MediationAdapterWrapper", str2);
                bVar.onAdLoadFailed(str, new MaxErrorImpl(-1, str2));
                return;
            }
            this.f20451o = maxAdapterResponseParameters;
            this.f20450n.a(bVar);
            MaxAdFormat format = q2Var.getFormat();
            if (format == MaxAdFormat.INTERSTITIAL) {
                eVar = new J4.h(this, maxAdapterResponseParameters, activity, 10);
            } else if (format == MaxAdFormat.APP_OPEN) {
                eVar = new J4.e(this, maxAdapterResponseParameters, activity, 7);
            } else if (format == MaxAdFormat.REWARDED) {
                eVar = new u(this, maxAdapterResponseParameters, activity, 1);
            } else if (format == MaxAdFormat.NATIVE) {
                eVar = new Z.e(this, maxAdapterResponseParameters, activity, 3);
            } else {
                if (format.isAdViewAd()) {
                    eVar = new O.e(this, maxAdapterResponseParameters, format, activity, 1);
                    a("load_ad", format, new A(this, q2Var, eVar, 1));
                    return;
                }
                throw new IllegalStateException("Failed to load " + q2Var + ": " + q2Var.getFormat() + " is not a supported ad format");
            }
            a("load_ad", format, new A(this, q2Var, eVar, 1));
            return;
        }
        throw new IllegalArgumentException("No mediated ad specified");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(ViewGroup viewGroup, AbstractC1781n abstractC1781n, Activity activity) {
        ((MaxRewardedAdViewAdapter) this.f20444g).showRewardedAd(this.f20451o, viewGroup, abstractC1781n, activity, this.f20450n);
    }

    public String b() {
        MaxAdapter maxAdapter = this.f20444g;
        if (maxAdapter == null) {
            return null;
        }
        try {
            return maxAdapter.getAdapterVersion();
        } catch (Throwable th) {
            com.applovin.impl.sdk.o.c("MediationAdapterWrapper", "Failed to get adapter version for " + this.f20441d, th);
            this.f20439b.E().a("MediationAdapterWrapper", "adapter_version", th, CollectionUtils.hashMap("adapter_class", this.f20442e.b()));
            a("adapter_version");
            this.f20439b.T().a(this.f20442e.b(), "adapter_version", this.i);
            return null;
        }
    }

    private void b(String str, Runnable runnable) {
        a(str, (MaxAdFormat) null, runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity) {
        ((MaxInterstitialAdapter) this.f20444g).loadInterstitialAd(maxAdapterResponseParameters, activity, this.f20450n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, Activity activity) {
        ((MaxAdViewAdapter) this.f20444g).loadAdViewAd(maxAdapterResponseParameters, maxAdFormat, activity, this.f20450n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(q2 q2Var, Runnable runnable) {
        a(this.f20442e, q2Var);
        try {
            runnable.run();
        } catch (Throwable th) {
            String str = "Failed to start loading ad for " + this.f20441d + " due to: " + th;
            com.applovin.impl.sdk.o.h("MediationAdapterWrapper", str);
            this.f20450n.a("load_ad", new MaxErrorImpl(-1, str));
            this.f20439b.E().a("MediationAdapterWrapper", "load_ad", th, CollectionUtils.hashMap("adapter_class", this.f20442e.b()));
            a("load_ad");
            this.f20439b.T().a(this.f20442e.b(), "load_ad", this.i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Activity activity) {
        ((MaxInterstitialAdapter) this.f20444g).showInterstitialAd(this.f20451o, activity, this.f20450n);
    }

    public void a(q2 q2Var, ViewGroup viewGroup, AbstractC1781n abstractC1781n, Activity activity) {
        Runnable eVar;
        if (a(q2Var, activity)) {
            if (q2Var.getFormat() == MaxAdFormat.INTERSTITIAL) {
                eVar = new r(this, viewGroup, abstractC1781n, activity, 0);
            } else if (q2Var.getFormat() == MaxAdFormat.REWARDED) {
                eVar = new O.e(this, viewGroup, abstractC1781n, activity, 2);
            } else {
                throw new IllegalStateException("Failed to show " + q2Var + ": " + q2Var.getFormat() + " is not a supported ad format");
            }
            a(eVar, q2Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(ViewGroup viewGroup, AbstractC1781n abstractC1781n, Activity activity) {
        ((MaxInterstitialAdViewAdapter) this.f20444g).showInterstitialAd(this.f20451o, viewGroup, abstractC1781n, activity, this.f20450n);
    }

    private boolean a(q2 q2Var, Activity activity) {
        if (q2Var != null) {
            if (q2Var.A() == null) {
                com.applovin.impl.sdk.o.h("MediationAdapterWrapper", "Adapter has been garbage collected");
                this.f20450n.a("ad_show", new MaxErrorImpl(-1, "Adapter has been garbage collected"), (Bundle) null);
                return false;
            }
            if (q2Var.A() == this) {
                if (activity == null && MaxAdFormat.APP_OPEN != q2Var.getFormat()) {
                    throw new IllegalArgumentException("No activity specified");
                }
                if (!this.f20452p.get()) {
                    String str = "Mediation adapter '" + this.f20443f + "' is disabled. Showing ads with this adapter is disabled.";
                    com.applovin.impl.sdk.o.h("MediationAdapterWrapper", str);
                    this.f20450n.a("ad_show", new MaxErrorImpl(-1, str), (Bundle) null);
                    return false;
                }
                if (j()) {
                    return true;
                }
                throw new IllegalStateException(B4.f.c(new StringBuilder("Mediation adapter '"), this.f20443f, "' does not have an ad loaded. Please load an ad first"));
            }
            throw new IllegalArgumentException("Mediated ad belongs to a different adapter");
        }
        throw new IllegalArgumentException("No mediated ad specified");
    }

    private void a(Runnable runnable, q2 q2Var) {
        a("show_ad", q2Var.getFormat(), new s(2, this, runnable));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Runnable runnable) {
        try {
            runnable.run();
        } catch (Throwable th) {
            String str = "Failed to start displaying ad for " + this.f20441d + " due to: " + th;
            com.applovin.impl.sdk.o.h("MediationAdapterWrapper", str);
            this.f20450n.a("show_ad", new MaxErrorImpl(-1, str), (Bundle) null);
            this.f20439b.E().a("MediationAdapterWrapper", "show_ad", th, CollectionUtils.hashMap("adapter_class", this.f20442e.b()));
            a("show_ad");
            this.f20439b.T().a(this.f20442e.b(), "show_ad", this.i);
        }
    }

    public void a(MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, r4 r4Var, Activity activity, g4 g4Var) {
        if (g4Var != null) {
            if (!this.f20452p.get()) {
                com.applovin.impl.sdk.o.h("MediationAdapterWrapper", "Mediation adapter '" + this.f20443f + "' is disabled. Signal collection ads with this adapter is disabled.");
                g4Var.a(new MaxErrorImpl(B4.f.c(new StringBuilder("The adapter ("), this.f20443f, ") is disabled")));
                return;
            }
            MaxAdapter maxAdapter = this.f20444g;
            if (maxAdapter instanceof MaxSignalProvider) {
                b("collect_signal", new com.applovin.impl.mediation.ads.d(this, (MaxSignalProvider) maxAdapter, maxAdapterSignalCollectionParameters, activity, r4Var, g4Var, 1));
                return;
            } else {
                g4Var.a(new MaxErrorImpl(MaxAdapterError.ERROR_CODE_SIGNAL_COLLECTION_NOT_SUPPORTED, B4.f.c(new StringBuilder("The adapter ("), this.f20443f, ") does not support signal collection")));
                return;
            }
        }
        throw new IllegalArgumentException("No callback specified");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(MaxSignalProvider maxSignalProvider, MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, Activity activity, r4 r4Var, g4 g4Var) {
        try {
            maxSignalProvider.collectSignal(maxAdapterSignalCollectionParameters, activity, new a(r4Var, g4Var));
        } catch (Throwable th) {
            MaxErrorImpl maxErrorImpl = new MaxErrorImpl("Failed signal collection for " + this.f20441d + " due to: " + th);
            com.applovin.impl.sdk.o.h("MediationAdapterWrapper", maxErrorImpl.getMessage());
            g4Var.a(maxErrorImpl);
            this.f20439b.E().a("MediationAdapterWrapper", "collect_signal", th, CollectionUtils.hashMap("adapter_class", this.f20442e.b()));
            a("collect_signal");
            this.f20439b.T().a(this.f20442e.b(), "collect_signal", this.i);
        }
        if (!g4Var.c() && r4Var.m() == 0) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f20440c.a("MediationAdapterWrapper", "Failing signal collection " + r4Var + " since it has 0 timeout");
            }
            g4Var.a(new MaxErrorImpl(MaxAdapterError.ERROR_CODE_SIGNAL_COLLECTION_TIMEOUT, B4.f.c(new StringBuilder("The adapter ("), this.f20443f, ") has 0 timeout")));
        }
    }

    public void a() {
        if (this.f20455s) {
            return;
        }
        b("destroy", new V(this, 13));
    }

    private void a(a3 a3Var, q2 q2Var) {
        a(new d(this, null), a3Var, q2Var);
    }

    private void a(w4 w4Var, a3 a3Var, q2 q2Var) {
        long jM = a3Var.m();
        if (jM <= 0) {
            if (com.applovin.impl.sdk.o.a()) {
                com.applovin.impl.sdk.o oVar = this.f20440c;
                StringBuilder sb = new StringBuilder("Non-positive timeout set for ");
                if (q2Var != null) {
                    a3Var = q2Var;
                }
                sb.append(a3Var);
                sb.append(", not scheduling a timeout");
                oVar.a("MediationAdapterWrapper", sb.toString());
                return;
            }
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            com.applovin.impl.sdk.o oVar2 = this.f20440c;
            StringBuilder sbJ = androidx.work.s.j("Setting timeout ", "ms for ", jM);
            if (q2Var != null) {
                a3Var = q2Var;
            }
            sbJ.append(a3Var);
            oVar2.a("MediationAdapterWrapper", sbJ.toString());
        }
        this.f20439b.q0().a(w4Var, r5.b.TIMEOUT, jM);
    }

    private void a(String str) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f20440c.d("MediationAdapterWrapper", "Marking " + this.f20443f + " as disabled due to: " + str);
        }
        this.f20452p.set(false);
    }

    private void a(String str, MaxAdFormat maxAdFormat, Runnable runnable) {
        u uVar = new u(this, str, runnable, 2);
        if (a(str, maxAdFormat)) {
            this.f20438a.post(uVar);
            return;
        }
        StringBuilder sbV = G8.v(str, StringUtils.PROCESS_POSTFIX_DELIMITER);
        sbV.append(this.f20442e.c());
        f6 f6Var = new f6(this.f20439b, sbV.toString(), uVar);
        if (((Boolean) this.f20439b.a(l4.f19860X)).booleanValue()) {
            this.f20439b.q0().a(f6Var, this.f20442e);
        } else {
            this.f20439b.q0().a(f6Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, Runnable runnable) {
        try {
            if (com.applovin.impl.sdk.o.a()) {
                this.f20440c.a("MediationAdapterWrapper", this.f20443f + ": running " + str + "...");
            }
            runnable.run();
            if (com.applovin.impl.sdk.o.a()) {
                this.f20440c.a("MediationAdapterWrapper", this.f20443f + ": finished " + str + "");
            }
        } catch (Throwable th) {
            StringBuilder sbK = B8.k("Failed operation ", str, " for ");
            sbK.append(this.f20441d);
            com.applovin.impl.sdk.o.c("MediationAdapterWrapper", sbK.toString(), th);
            a("fail_" + str);
            if (!str.equals("destroy")) {
                this.f20439b.T().a(this.f20442e.b(), str, this.i);
            }
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("is_wrapper", "true");
            CollectionUtils.putStringIfValid("adapter_class", this.f20442e.b(), mapHashMap);
            this.f20439b.E().a("MediationAdapterWrapper", str, th, mapHashMap);
        }
    }

    private boolean a(String str, MaxAdFormat maxAdFormat) {
        Boolean boolZ;
        Boolean boolB0;
        Boolean boolA0;
        MaxAdapter maxAdapter = this.f20444g;
        if (maxAdapter == null) {
            return this.f20442e.r();
        }
        if ("initialize".equals(str)) {
            Boolean boolShouldInitializeOnUiThread = maxAdapter.shouldInitializeOnUiThread();
            if (boolShouldInitializeOnUiThread != null) {
                return boolShouldInitializeOnUiThread.booleanValue();
            }
        } else if ("collect_signal".equals(str)) {
            Boolean boolShouldCollectSignalsOnUiThread = maxAdapter.shouldCollectSignalsOnUiThread();
            if (boolShouldCollectSignalsOnUiThread != null) {
                return boolShouldCollectSignalsOnUiThread.booleanValue();
            }
        } else if ("load_ad".equals(str) && maxAdFormat != null) {
            q2 q2Var = this.i;
            if (q2Var != null && (boolA0 = q2Var.a0()) != null) {
                return boolA0.booleanValue();
            }
            Boolean boolShouldLoadAdsOnUiThread = maxAdapter.shouldLoadAdsOnUiThread(maxAdFormat);
            if (boolShouldLoadAdsOnUiThread != null) {
                return boolShouldLoadAdsOnUiThread.booleanValue();
            }
        } else if ("show_ad".equals(str) && maxAdFormat != null) {
            q2 q2Var2 = this.i;
            if (q2Var2 != null && (boolB0 = q2Var2.b0()) != null) {
                return boolB0.booleanValue();
            }
            Boolean boolShouldShowAdsOnUiThread = maxAdapter.shouldShowAdsOnUiThread(maxAdFormat);
            if (boolShouldShowAdsOnUiThread != null) {
                return boolShouldShowAdsOnUiThread.booleanValue();
            }
        } else if ("destroy".equals(str)) {
            q2 q2Var3 = this.i;
            if (q2Var3 != null && (boolZ = q2Var3.Z()) != null) {
                return boolZ.booleanValue();
            }
            Boolean boolShouldDestroyOnUiThread = maxAdapter.shouldDestroyOnUiThread();
            if (boolShouldDestroyOnUiThread != null) {
                return boolShouldDestroyOnUiThread.booleanValue();
            }
            return true;
        }
        return this.f20442e.r();
    }
}
