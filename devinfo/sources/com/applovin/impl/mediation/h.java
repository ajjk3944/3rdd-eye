package com.applovin.impl.mediation;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.applovin.impl.c3;
import com.applovin.impl.d5;
import com.applovin.impl.d6;
import com.applovin.impl.i5;
import com.applovin.impl.k3;
import com.applovin.impl.mediation.MediationServiceImpl;
import com.applovin.impl.r3;
import com.applovin.impl.r6;
import com.applovin.impl.s4;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.x4;
import com.applovin.impl.y2;
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
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class h {

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f4769b;

    /* renamed from: c, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f4770c;

    /* renamed from: d, reason: collision with root package name */
    private final String f4771d;

    /* renamed from: e, reason: collision with root package name */
    private final k3 f4772e;

    /* renamed from: f, reason: collision with root package name */
    private final String f4773f;
    private MaxAdapter g;

    /* renamed from: h, reason: collision with root package name */
    private String f4774h;

    /* renamed from: i, reason: collision with root package name */
    private y2 f4775i;
    private View j;

    /* renamed from: k, reason: collision with root package name */
    private MaxNativeAd f4776k;

    /* renamed from: l, reason: collision with root package name */
    private MaxNativeAdView f4777l;

    /* renamed from: m, reason: collision with root package name */
    private ViewGroup f4778m;

    /* renamed from: o, reason: collision with root package name */
    private MaxAdapterResponseParameters f4780o;

    /* renamed from: s, reason: collision with root package name */
    private final boolean f4784s;

    /* renamed from: a, reason: collision with root package name */
    private final Handler f4768a = new Handler(Looper.getMainLooper());

    /* renamed from: n, reason: collision with root package name */
    private final b f4779n = new b(this, null);

    /* renamed from: p, reason: collision with root package name */
    private final AtomicBoolean f4781p = new AtomicBoolean(true);

    /* renamed from: q, reason: collision with root package name */
    private final AtomicBoolean f4782q = new AtomicBoolean(false);

    /* renamed from: r, reason: collision with root package name */
    private final AtomicBoolean f4783r = new AtomicBoolean(false);

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class a implements MaxSignalCollectionListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ d5 f4785a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ s4 f4786b;

        public a(d5 d5Var, s4 s4Var) {
            this.f4785a = d5Var;
            this.f4786b = s4Var;
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener
        public void onSignalCollected(String str) {
            if (this.f4785a.y() && TextUtils.isEmpty(str)) {
                this.f4786b.a(new MaxErrorImpl("Signal is not a valid string"));
            } else {
                this.f4786b.b(str);
            }
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener
        public void onSignalCollectionFailed(String str) {
            this.f4786b.a(new MaxErrorImpl(str));
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class b implements MaxInterstitialAdapterListener, MaxAppOpenAdapterListener, MaxRewardedAdapterListener, MaxAdViewAdapterListener, MaxNativeAdAdapterListener {

        /* renamed from: a, reason: collision with root package name */
        private MediationServiceImpl.b f4788a;

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
            com.applovin.impl.sdk.o unused = h.this.f4770c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f4770c.k("MediationAdapterWrapper", h.this.f4773f + ": adview ad ad failed to load with error: " + maxAdapterError);
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
            com.applovin.impl.sdk.o unused = h.this.f4770c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f4770c.k("MediationAdapterWrapper", h.this.f4773f + ": app open ad failed to load with error: " + maxAdapterError);
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
            com.applovin.impl.sdk.o unused = h.this.f4770c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f4770c.k("MediationAdapterWrapper", h.this.f4773f + ": interstitial ad failed to load with error " + maxAdapterError);
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
            com.applovin.impl.sdk.o unused = h.this.f4770c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f4770c.d("MediationAdapterWrapper", h.this.f4773f + ": native ad displayed with extra info: " + bundle);
            }
            a("onNativeAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdLoadFailed(MaxAdapterError maxAdapterError) {
            com.applovin.impl.sdk.o unused = h.this.f4770c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f4770c.k("MediationAdapterWrapper", h.this.f4773f + ": native ad ad failed to load with error: " + maxAdapterError);
            }
            a("onNativeAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdLoaded(MaxNativeAd maxNativeAd, Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f4770c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f4770c.d("MediationAdapterWrapper", h.this.f4773f + ": native ad loaded with extra info: " + bundle);
            }
            h.this.f4776k = maxNativeAd;
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
            com.applovin.impl.sdk.o unused = h.this.f4770c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f4770c.k("MediationAdapterWrapper", h.this.f4773f + ": rewarded ad failed to load with error: " + maxAdapterError);
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
            if (h.this.f4775i.w().compareAndSet(false, true)) {
                a(str, this.f4788a, new s(this, bundle, 2));
            }
        }

        private void c(String str, Bundle bundle) {
            if (!h.this.f4775i.w().get()) {
                h.this.f4783r.set(true);
                a(str, this.f4788a, new s(this, bundle, 0));
                return;
            }
            com.applovin.impl.sdk.o unused = h.this.f4770c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f4770c.b("MediationAdapterWrapper", h.this.f4773f + ": blocking ad loaded callback for " + h.this.f4775i + " since onAdHidden() has been called");
            }
            h.this.f4769b.t().a(h.this.f4775i, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(Bundle bundle) {
            this.f4788a.a(h.this.f4775i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void e(Bundle bundle) {
            this.f4788a.a(h.this.f4775i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f(Bundle bundle) {
            this.f4788a.a(h.this.f4775i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void g(Bundle bundle) {
            this.f4788a.c(h.this.f4775i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void h(Bundle bundle) {
            this.f4788a.c(h.this.f4775i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void i(Bundle bundle) {
            this.f4788a.e(h.this.f4775i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void j(Bundle bundle) {
            if (h.this.f4782q.compareAndSet(false, true)) {
                this.f4788a.f(h.this.f4775i, bundle);
            }
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdClicked(Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f4770c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f4770c.d("MediationAdapterWrapper", h.this.f4773f + ": adview ad clicked with extra info: " + bundle);
            }
            a("onAdViewAdClicked", this.f4788a, new s(this, bundle, 3));
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdCollapsed(Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f4770c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f4770c.d("MediationAdapterWrapper", h.this.f4773f + ": adview ad collapsed");
            }
            a("onAdViewAdCollapsed", this.f4788a, new u(0, this));
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdDisplayFailed(MaxAdapterError maxAdapterError, Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f4770c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f4770c.k("MediationAdapterWrapper", h.this.f4773f + ": adview ad failed to display with error: " + maxAdapterError);
            }
            a("onAdViewAdDisplayFailed", maxAdapterError, bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdDisplayed(Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f4770c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f4770c.d("MediationAdapterWrapper", h.this.f4773f + ": adview ad displayed with extra info: " + bundle);
            }
            a("onAdViewAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdExpanded(Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f4770c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f4770c.d("MediationAdapterWrapper", h.this.f4773f + ": adview ad expanded");
            }
            a("onAdViewAdExpanded", this.f4788a, new s(this, bundle, 9));
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdHidden(Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f4770c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f4770c.d("MediationAdapterWrapper", h.this.f4773f + ": adview ad hidden with extra info: " + bundle);
            }
            b("onAdViewAdHidden", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdLoaded(View view, Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f4770c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f4770c.d("MediationAdapterWrapper", h.this.f4773f + ": adview ad loaded with extra info: " + bundle);
            }
            h.this.j = view;
            c("onAdViewAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdClicked(Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f4770c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f4770c.d("MediationAdapterWrapper", h.this.f4773f + ": app open ad clicked with extra info: " + bundle);
            }
            a("onAppOpenAdClicked", this.f4788a, new s(this, bundle, 8));
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdDisplayFailed(MaxAdapterError maxAdapterError, Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f4770c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f4770c.k("MediationAdapterWrapper", h.this.f4773f + ": app open ad display failed with error: " + maxAdapterError);
            }
            a("onAppOpenAdDisplayFailed", maxAdapterError, bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdDisplayed(Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f4770c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f4770c.d("MediationAdapterWrapper", h.this.f4773f + ": app open ad displayed with extra info: " + bundle);
            }
            a("onAppOpenAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdHidden(Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f4770c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f4770c.d("MediationAdapterWrapper", h.this.f4773f + ": app open ad hidden with extra info: " + bundle);
            }
            b("onAppOpenAdHidden", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdLoaded(Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f4770c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f4770c.d("MediationAdapterWrapper", h.this.f4773f + ": app open ad loaded with extra info: " + bundle);
            }
            c("onAppOpenAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdClicked(Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f4770c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f4770c.d("MediationAdapterWrapper", h.this.f4773f + ": interstitial ad clicked with extra info: " + bundle);
            }
            a("onInterstitialAdClicked", this.f4788a, new s(this, bundle, 7));
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdDisplayFailed(MaxAdapterError maxAdapterError, Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f4770c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f4770c.k("MediationAdapterWrapper", h.this.f4773f + ": interstitial ad failed to display with error " + maxAdapterError);
            }
            a("onInterstitialAdDisplayFailed", maxAdapterError, bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdDisplayed(Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f4770c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f4770c.d("MediationAdapterWrapper", h.this.f4773f + ": interstitial ad displayed with extra info: " + bundle);
            }
            a("onInterstitialAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdHidden(Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f4770c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f4770c.d("MediationAdapterWrapper", h.this.f4773f + ": interstitial ad hidden with extra info " + bundle);
            }
            b("onInterstitialAdHidden", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdLoaded(Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f4770c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f4770c.d("MediationAdapterWrapper", h.this.f4773f + ": interstitial ad loaded with extra info: " + bundle);
            }
            c("onInterstitialAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdClicked(Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f4770c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f4770c.d("MediationAdapterWrapper", h.this.f4773f + ": native ad clicked");
            }
            a("onNativeAdClicked", this.f4788a, new s(this, bundle, 1));
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdClicked(Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f4770c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f4770c.d("MediationAdapterWrapper", h.this.f4773f + ": rewarded ad clicked with extra info: " + bundle);
            }
            a("onRewardedAdClicked", this.f4788a, new s(this, bundle, 4));
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdDisplayFailed(MaxAdapterError maxAdapterError, Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f4770c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f4770c.k("MediationAdapterWrapper", h.this.f4773f + ": rewarded ad display failed with error: " + maxAdapterError);
            }
            a("onRewardedAdDisplayFailed", maxAdapterError, bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdDisplayed(Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f4770c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f4770c.d("MediationAdapterWrapper", h.this.f4773f + ": rewarded ad displayed with extra info: " + bundle);
            }
            a("onRewardedAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdHidden(Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f4770c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f4770c.d("MediationAdapterWrapper", h.this.f4773f + ": rewarded ad hidden with extra info: " + bundle);
            }
            b("onRewardedAdHidden", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdLoaded(Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f4770c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f4770c.d("MediationAdapterWrapper", h.this.f4773f + ": rewarded ad loaded with extra info: " + bundle);
            }
            c("onRewardedAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onUserRewarded(MaxReward maxReward, Bundle bundle) {
            if (h.this.f4775i instanceof c3) {
                c3 c3Var = (c3) h.this.f4775i;
                if (c3Var.t0().compareAndSet(false, true)) {
                    com.applovin.impl.sdk.o unused = h.this.f4770c;
                    if (com.applovin.impl.sdk.o.a()) {
                        h.this.f4770c.d("MediationAdapterWrapper", h.this.f4773f + ": user was rewarded: " + maxReward);
                    }
                    a("onUserRewarded", this.f4788a, new v(this, c3Var, maxReward, bundle, 0));
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(Bundle bundle) {
            this.f4788a.d(h.this.f4775i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(MediationServiceImpl.b bVar) {
            if (bVar != null) {
                this.f4788a = bVar;
                return;
            }
            throw new IllegalArgumentException("No listener specified");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(Bundle bundle) {
            this.f4788a.a(h.this.f4775i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(String str, MaxError maxError) {
            if (h.this.f4775i.w().get()) {
                com.applovin.impl.sdk.o unused = h.this.f4770c;
                if (com.applovin.impl.sdk.o.a()) {
                    h.this.f4770c.b("MediationAdapterWrapper", h.this.f4773f + ": blocking ad load failed callback for " + h.this.f4775i + " since onAdHidden() has been called");
                }
                h.this.f4769b.t().a(h.this.f4775i, str);
                return;
            }
            a(str, this.f4788a, new r(0, this, maxError));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(MaxError maxError) {
            if (h.this.f4782q.compareAndSet(false, true)) {
                this.f4788a.onAdLoadFailed(h.this.f4774h, maxError);
            }
        }

        private void a(String str, Bundle bundle) {
            if (h.this.f4775i.w().get()) {
                com.applovin.impl.sdk.o unused = h.this.f4770c;
                if (com.applovin.impl.sdk.o.a()) {
                    h.this.f4770c.b("MediationAdapterWrapper", h.this.f4773f + ": blocking ad displayed callback for " + h.this.f4775i + " since onAdHidden() has been called");
                }
                h.this.f4769b.t().a(h.this.f4775i, str);
                return;
            }
            if (!((Boolean) h.this.f4769b.a(r3.f5246w8)).booleanValue()) {
                if (h.this.f4775i.u().compareAndSet(false, true)) {
                    a(str, this.f4788a, new s(this, bundle, 6));
                    return;
                }
                return;
            }
            a(str, this.f4788a, new s(this, bundle, 5));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(String str, MaxError maxError, Bundle bundle) {
            if (h.this.f4775i.w().get()) {
                com.applovin.impl.sdk.o unused = h.this.f4770c;
                if (com.applovin.impl.sdk.o.a()) {
                    h.this.f4770c.b("MediationAdapterWrapper", h.this.f4773f + ": blocking ad display failed callback for " + h.this.f4775i + " since onAdHidden() has been called");
                }
                h.this.f4769b.t().a(h.this.f4775i, str);
                return;
            }
            a(str, this.f4788a, new t(this, maxError, bundle, 0));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(MaxError maxError, Bundle bundle) {
            this.f4788a.a(h.this.f4775i, maxError, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(c3 c3Var, MaxReward maxReward, Bundle bundle) {
            this.f4788a.a(c3Var, maxReward, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(Bundle bundle) {
            this.f4788a.a(h.this.f4775i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a() {
            this.f4788a.onAdCollapsed(h.this.f4775i);
        }

        private void a(String str, MaxAdListener maxAdListener, Runnable runnable) {
            h.this.f4768a.post(new v(this, runnable, maxAdListener, str, 1));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(Runnable runnable, MaxAdListener maxAdListener, String str) {
            try {
                runnable.run();
            } catch (Throwable th2) {
                com.applovin.impl.sdk.o.c("MediationAdapterWrapper", je.u.u("Failed to forward call (", str, ") to ", maxAdListener != null ? maxAdListener.getClass().getName() : null), th2);
                h.this.f4769b.D().a("MediationAdapterWrapper", str, th2, CollectionUtils.hashMap("adapter_class", h.this.f4772e.b()));
            }
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class c implements MaxAdapter.OnCompletionListener {

        /* renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.sdk.k f4790a;

        /* renamed from: b, reason: collision with root package name */
        private final k3 f4791b;

        /* renamed from: c, reason: collision with root package name */
        private final long f4792c;

        /* renamed from: d, reason: collision with root package name */
        private final MaxAdapter.OnCompletionListener f4793d;

        public c(com.applovin.impl.sdk.k kVar, k3 k3Var, long j, MaxAdapter.OnCompletionListener onCompletionListener) {
            this.f4790a = kVar;
            this.f4791b = k3Var;
            this.f4792c = j;
            this.f4793d = onCompletionListener;
        }

        @Override // com.applovin.mediation.adapter.MaxAdapter.OnCompletionListener
        public void onCompletion(MaxAdapter.InitializationStatus initializationStatus, String str) {
            AppLovinSdkUtils.runOnUiThreadDelayed(new t(this, initializationStatus, str, 1), this.f4791b.h());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(MaxAdapter.InitializationStatus initializationStatus, String str) {
            this.f4790a.S().a(this.f4791b, SystemClock.elapsedRealtime() - this.f4792c, initializationStatus, str);
            MaxAdapter.OnCompletionListener onCompletionListener = this.f4793d;
            if (onCompletionListener != null) {
                onCompletionListener.onCompletion(initializationStatus, str);
            }
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class d extends i5 {
        private final WeakReference g;

        public /* synthetic */ d(h hVar, a aVar) {
            this();
        }

        private void b(y2 y2Var) {
            if (y2Var != null) {
                this.f4287a.Z().a(y2Var);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (h.this.f4782q.get()) {
                return;
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.f4289c.b(this.f4288b, h.this.f4773f + " is timing out " + h.this.f4775i + "...");
            }
            b(h.this.f4775i);
            MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-5101, "Adapter timed out");
            b bVar = (b) this.g.get();
            if (bVar != null) {
                bVar.a(this.f4288b, maxErrorImpl);
            }
        }

        private d() {
            super("TaskTimeoutMediatedAd", h.this.f4769b);
            this.g = new WeakReference(h.this.f4779n);
        }
    }

    public h(k3 k3Var, MaxAdapter maxAdapter, boolean z3, com.applovin.impl.sdk.k kVar) {
        if (k3Var == null) {
            throw new IllegalArgumentException("No adapter name specified");
        }
        if (maxAdapter == null) {
            throw new IllegalArgumentException("No adapter specified");
        }
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.f4771d = k3Var.c();
        this.g = maxAdapter;
        this.f4769b = kVar;
        this.f4770c = kVar.O();
        this.f4772e = k3Var;
        this.f4773f = maxAdapter.getClass().getSimpleName();
        this.f4784s = z3;
    }

    public String toString() {
        return d.h.w(new StringBuilder("MediationAdapterWrapper{adapterTag='"), this.f4773f, "'}");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l() {
        a("destroy");
        MaxAdapter maxAdapter = this.g;
        if (maxAdapter != null) {
            this.g = null;
            maxAdapter.onDestroy();
        } else if (com.applovin.impl.sdk.o.a()) {
            this.f4770c.k("MediationAdapterWrapper", "Mediation adapter '" + this.f4773f + "' is already destroyed");
        }
        this.j = null;
        this.f4776k = null;
        this.f4777l = null;
        this.f4778m = null;
    }

    public boolean j() {
        return this.f4782q.get() && this.f4783r.get();
    }

    public boolean k() {
        return this.f4781p.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity) {
        ((MaxAppOpenAdapter) this.g).loadAppOpenAd(maxAdapterResponseParameters, activity, this.f4779n);
    }

    public MediationServiceImpl.b c() {
        return this.f4779n.f4788a;
    }

    public View d() {
        return this.j;
    }

    public MaxNativeAd e() {
        return this.f4776k;
    }

    public MaxNativeAdView f() {
        return this.f4777l;
    }

    public String g() {
        return this.f4771d;
    }

    public ViewGroup h() {
        return this.f4778m;
    }

    public String i() {
        MaxAdapter maxAdapter = this.g;
        if (maxAdapter == null) {
            return null;
        }
        try {
            return maxAdapter.getSdkVersion();
        } catch (Throwable th2) {
            com.applovin.impl.sdk.o.c("MediationAdapterWrapper", "Failed to get adapter's SDK version for " + this.f4771d, th2);
            this.f4769b.D().a("MediationAdapterWrapper", "sdk_version", th2, CollectionUtils.hashMap("adapter_class", this.f4772e.b()));
            a("sdk_version");
            this.f4769b.T().a(this.f4772e.b(), "sdk_version", this.f4775i);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity) {
        ((MaxRewardedAdapter) this.g).loadRewardedAd(maxAdapterResponseParameters, activity, this.f4779n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity) {
        ((MediationAdapterBase) this.g).loadNativeAd(maxAdapterResponseParameters, activity, this.f4779n);
    }

    public void a(MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity, MaxAdapter.OnCompletionListener onCompletionListener) {
        b("initialize", new v(this, onCompletionListener, maxAdapterInitializationParameters, activity, 3));
    }

    public void b(y2 y2Var, final Activity activity) {
        Runnable runnable;
        if (a(y2Var, activity)) {
            if (y2Var.getFormat() == MaxAdFormat.INTERSTITIAL) {
                final int i4 = 0;
                runnable = new Runnable(this) { // from class: com.applovin.impl.mediation.p

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ h f4829b;

                    {
                        this.f4829b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i4) {
                            case 0:
                                this.f4829b.a(activity);
                                break;
                            case 1:
                                this.f4829b.b(activity);
                                break;
                            default:
                                this.f4829b.c(activity);
                                break;
                        }
                    }
                };
            } else if (y2Var.getFormat() == MaxAdFormat.APP_OPEN) {
                final int i10 = 1;
                runnable = new Runnable(this) { // from class: com.applovin.impl.mediation.p

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ h f4829b;

                    {
                        this.f4829b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                this.f4829b.a(activity);
                                break;
                            case 1:
                                this.f4829b.b(activity);
                                break;
                            default:
                                this.f4829b.c(activity);
                                break;
                        }
                    }
                };
            } else if (y2Var.getFormat() == MaxAdFormat.REWARDED) {
                final int i11 = 2;
                runnable = new Runnable(this) { // from class: com.applovin.impl.mediation.p

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ h f4829b;

                    {
                        this.f4829b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                this.f4829b.a(activity);
                                break;
                            case 1:
                                this.f4829b.b(activity);
                                break;
                            default:
                                this.f4829b.c(activity);
                                break;
                        }
                    }
                };
            } else {
                throw new IllegalStateException("Failed to show " + y2Var + ": " + y2Var.getFormat() + " is not a supported ad format");
            }
            a(runnable, y2Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(MaxAdapter.OnCompletionListener onCompletionListener, MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (com.applovin.impl.sdk.o.a()) {
            this.f4770c.a("MediationAdapterWrapper", "Initializing " + this.f4773f + " on thread: " + Thread.currentThread() + " with 'run_on_ui_thread' value: " + this.f4772e.r());
        }
        this.g.initialize(maxAdapterInitializationParameters, activity, new c(this.f4769b, this.f4772e, jElapsedRealtime, onCompletionListener));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(Activity activity) {
        ((MaxRewardedAdapter) this.g).showRewardedAd(this.f4780o, activity, this.f4779n);
    }

    public void a(String str, y2 y2Var) {
        this.f4774h = str;
        this.f4775i = y2Var;
    }

    public void a(MaxNativeAdView maxNativeAdView) {
        this.f4777l = maxNativeAdView;
    }

    public void a(ViewGroup viewGroup) {
        this.f4778m = viewGroup;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Activity activity) {
        ((MaxAppOpenAdapter) this.g).showAppOpenAd(this.f4780o, activity, this.f4779n);
    }

    public void a(String str, final MaxAdapterResponseParameters maxAdapterResponseParameters, y2 y2Var, final Activity activity, MediationServiceImpl.b bVar) {
        Runnable vVar;
        if (y2Var != null) {
            if (!this.f4781p.get()) {
                String str2 = "Mediation adapter '" + this.f4773f + "' was disabled due to earlier failures. Loading ads with this adapter is disabled.";
                com.applovin.impl.sdk.o.h("MediationAdapterWrapper", str2);
                bVar.onAdLoadFailed(str, new MaxErrorImpl(-1, str2));
                return;
            }
            this.f4780o = maxAdapterResponseParameters;
            this.f4779n.a(bVar);
            MaxAdFormat format = y2Var.getFormat();
            if (format == MaxAdFormat.INTERSTITIAL) {
                final int i4 = 0;
                vVar = new Runnable(this) { // from class: com.applovin.impl.mediation.q

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ h f4832b;

                    {
                        this.f4832b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i4) {
                            case 0:
                                this.f4832b.a(maxAdapterResponseParameters, activity);
                                break;
                            case 1:
                                this.f4832b.b(maxAdapterResponseParameters, activity);
                                break;
                            case 2:
                                this.f4832b.c(maxAdapterResponseParameters, activity);
                                break;
                            default:
                                this.f4832b.d(maxAdapterResponseParameters, activity);
                                break;
                        }
                    }
                };
            } else if (format == MaxAdFormat.APP_OPEN) {
                final int i10 = 1;
                vVar = new Runnable(this) { // from class: com.applovin.impl.mediation.q

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ h f4832b;

                    {
                        this.f4832b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                this.f4832b.a(maxAdapterResponseParameters, activity);
                                break;
                            case 1:
                                this.f4832b.b(maxAdapterResponseParameters, activity);
                                break;
                            case 2:
                                this.f4832b.c(maxAdapterResponseParameters, activity);
                                break;
                            default:
                                this.f4832b.d(maxAdapterResponseParameters, activity);
                                break;
                        }
                    }
                };
            } else if (format == MaxAdFormat.REWARDED) {
                final int i11 = 2;
                vVar = new Runnable(this) { // from class: com.applovin.impl.mediation.q

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ h f4832b;

                    {
                        this.f4832b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                this.f4832b.a(maxAdapterResponseParameters, activity);
                                break;
                            case 1:
                                this.f4832b.b(maxAdapterResponseParameters, activity);
                                break;
                            case 2:
                                this.f4832b.c(maxAdapterResponseParameters, activity);
                                break;
                            default:
                                this.f4832b.d(maxAdapterResponseParameters, activity);
                                break;
                        }
                    }
                };
            } else if (format == MaxAdFormat.NATIVE) {
                final int i12 = 3;
                vVar = new Runnable(this) { // from class: com.applovin.impl.mediation.q

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ h f4832b;

                    {
                        this.f4832b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                this.f4832b.a(maxAdapterResponseParameters, activity);
                                break;
                            case 1:
                                this.f4832b.b(maxAdapterResponseParameters, activity);
                                break;
                            case 2:
                                this.f4832b.c(maxAdapterResponseParameters, activity);
                                break;
                            default:
                                this.f4832b.d(maxAdapterResponseParameters, activity);
                                break;
                        }
                    }
                };
            } else {
                if (format.isAdViewAd()) {
                    vVar = new v(this, maxAdapterResponseParameters, format, activity, 4);
                    a("load_ad", format, new t(this, y2Var, vVar, 3));
                    return;
                }
                throw new IllegalStateException("Failed to load " + y2Var + ": " + y2Var.getFormat() + " is not a supported ad format");
            }
            a("load_ad", format, new t(this, y2Var, vVar, 3));
            return;
        }
        throw new IllegalArgumentException("No mediated ad specified");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(ViewGroup viewGroup, androidx.lifecycle.t tVar, Activity activity) {
        ((MaxRewardedAdViewAdapter) this.g).showRewardedAd(this.f4780o, viewGroup, tVar, activity, this.f4779n);
    }

    public String b() {
        MaxAdapter maxAdapter = this.g;
        if (maxAdapter == null) {
            return null;
        }
        try {
            return maxAdapter.getAdapterVersion();
        } catch (Throwable th2) {
            com.applovin.impl.sdk.o.c("MediationAdapterWrapper", "Failed to get adapter version for " + this.f4771d, th2);
            this.f4769b.D().a("MediationAdapterWrapper", "adapter_version", th2, CollectionUtils.hashMap("adapter_class", this.f4772e.b()));
            a("adapter_version");
            this.f4769b.T().a(this.f4772e.b(), "adapter_version", this.f4775i);
            return null;
        }
    }

    private void b(String str, Runnable runnable) {
        a(str, (MaxAdFormat) null, runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity) {
        ((MaxInterstitialAdapter) this.g).loadInterstitialAd(maxAdapterResponseParameters, activity, this.f4779n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, Activity activity) {
        ((MaxAdViewAdapter) this.g).loadAdViewAd(maxAdapterResponseParameters, maxAdFormat, activity, this.f4779n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(y2 y2Var, Runnable runnable) {
        a(this.f4772e, y2Var);
        try {
            runnable.run();
        } catch (Throwable th2) {
            String str = "Failed to start loading ad for " + this.f4771d + " due to: " + th2;
            com.applovin.impl.sdk.o.h("MediationAdapterWrapper", str);
            this.f4779n.a("load_ad", new MaxErrorImpl(-1, str));
            this.f4769b.D().a("MediationAdapterWrapper", "load_ad", th2, CollectionUtils.hashMap("adapter_class", this.f4772e.b()));
            a("load_ad");
            this.f4769b.T().a(this.f4772e.b(), "load_ad", this.f4775i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Activity activity) {
        ((MaxInterstitialAdapter) this.g).showInterstitialAd(this.f4780o, activity, this.f4779n);
    }

    public void a(y2 y2Var, final ViewGroup viewGroup, final androidx.lifecycle.t tVar, final Activity activity) {
        Runnable runnable;
        if (a(y2Var, activity)) {
            if (y2Var.getFormat() == MaxAdFormat.INTERSTITIAL) {
                final int i4 = 0;
                runnable = new Runnable(this) { // from class: com.applovin.impl.mediation.o

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ h f4824b;

                    {
                        this.f4824b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i4) {
                            case 0:
                                this.f4824b.a(viewGroup, tVar, activity);
                                break;
                            default:
                                this.f4824b.b(viewGroup, tVar, activity);
                                break;
                        }
                    }
                };
            } else if (y2Var.getFormat() == MaxAdFormat.REWARDED) {
                final int i10 = 1;
                runnable = new Runnable(this) { // from class: com.applovin.impl.mediation.o

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ h f4824b;

                    {
                        this.f4824b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                this.f4824b.a(viewGroup, tVar, activity);
                                break;
                            default:
                                this.f4824b.b(viewGroup, tVar, activity);
                                break;
                        }
                    }
                };
            } else {
                throw new IllegalStateException("Failed to show " + y2Var + ": " + y2Var.getFormat() + " is not a supported ad format");
            }
            a(runnable, y2Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(ViewGroup viewGroup, androidx.lifecycle.t tVar, Activity activity) {
        ((MaxInterstitialAdViewAdapter) this.g).showInterstitialAd(this.f4780o, viewGroup, tVar, activity, this.f4779n);
    }

    private boolean a(y2 y2Var, Activity activity) {
        if (y2Var != null) {
            if (y2Var.A() == null) {
                com.applovin.impl.sdk.o.h("MediationAdapterWrapper", "Adapter has been garbage collected");
                this.f4779n.a("ad_show", new MaxErrorImpl(-1, "Adapter has been garbage collected"), (Bundle) null);
                return false;
            }
            if (y2Var.A() == this) {
                if (activity == null && MaxAdFormat.APP_OPEN != y2Var.getFormat()) {
                    throw new IllegalArgumentException("No activity specified");
                }
                if (!this.f4781p.get()) {
                    String str = "Mediation adapter '" + this.f4773f + "' is disabled. Showing ads with this adapter is disabled.";
                    com.applovin.impl.sdk.o.h("MediationAdapterWrapper", str);
                    this.f4779n.a("ad_show", new MaxErrorImpl(-1, str), (Bundle) null);
                    return false;
                }
                if (j()) {
                    return true;
                }
                throw new IllegalStateException(d.h.w(new StringBuilder("Mediation adapter '"), this.f4773f, "' does not have an ad loaded. Please load an ad first"));
            }
            throw new IllegalArgumentException("Mediated ad belongs to a different adapter");
        }
        throw new IllegalArgumentException("No mediated ad specified");
    }

    private void a(Runnable runnable, y2 y2Var) {
        y2Var.d0();
        a("show_ad", y2Var.getFormat(), new r(4, this, runnable));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Runnable runnable) {
        try {
            runnable.run();
        } catch (Throwable th2) {
            String str = "Failed to start displaying ad for " + this.f4771d + " due to: " + th2;
            com.applovin.impl.sdk.o.h("MediationAdapterWrapper", str);
            this.f4779n.a("show_ad", new MaxErrorImpl(-1, str), (Bundle) null);
            this.f4769b.D().a("MediationAdapterWrapper", "show_ad", th2, CollectionUtils.hashMap("adapter_class", this.f4772e.b()));
            a("show_ad");
            this.f4769b.T().a(this.f4772e.b(), "show_ad", this.f4775i);
        }
    }

    public void a(MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, d5 d5Var, Activity activity, s4 s4Var) {
        if (s4Var != null) {
            if (!this.f4781p.get()) {
                com.applovin.impl.sdk.o.h("MediationAdapterWrapper", "Mediation adapter '" + this.f4773f + "' is disabled. Signal collection ads with this adapter is disabled.");
                s4Var.a(new MaxErrorImpl(d.h.w(new StringBuilder("The adapter ("), this.f4773f, ") is disabled")));
                return;
            }
            MaxAdapter maxAdapter = this.g;
            if (maxAdapter instanceof MaxSignalProvider) {
                b("collect_signal", new j(this, (MaxSignalProvider) maxAdapter, maxAdapterSignalCollectionParameters, activity, d5Var, s4Var));
                return;
            } else {
                s4Var.a(new MaxErrorImpl(MaxAdapterError.ERROR_CODE_SIGNAL_COLLECTION_NOT_SUPPORTED, d.h.w(new StringBuilder("The adapter ("), this.f4773f, ") does not support signal collection")));
                return;
            }
        }
        throw new IllegalArgumentException("No callback specified");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(MaxSignalProvider maxSignalProvider, MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, Activity activity, d5 d5Var, s4 s4Var) {
        try {
            maxSignalProvider.collectSignal(maxAdapterSignalCollectionParameters, activity, new a(d5Var, s4Var));
        } catch (Throwable th2) {
            MaxErrorImpl maxErrorImpl = new MaxErrorImpl("Failed signal collection for " + this.f4771d + " due to: " + th2);
            com.applovin.impl.sdk.o.h("MediationAdapterWrapper", maxErrorImpl.getMessage());
            s4Var.a(maxErrorImpl);
            this.f4769b.D().a("MediationAdapterWrapper", "collect_signal", th2, CollectionUtils.hashMap("adapter_class", this.f4772e.b()));
            a("collect_signal");
            this.f4769b.T().a(this.f4772e.b(), "collect_signal", this.f4775i);
        }
        if (!s4Var.d() && d5Var.m() == 0) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f4770c.a("MediationAdapterWrapper", "Failing signal collection " + d5Var + " since it has 0 timeout");
            }
            s4Var.a(new MaxErrorImpl(MaxAdapterError.ERROR_CODE_SIGNAL_COLLECTION_TIMEOUT, d.h.w(new StringBuilder("The adapter ("), this.f4773f, ") has 0 timeout")));
        }
    }

    public void a() {
        if (this.f4784s) {
            return;
        }
        b("destroy", new u(1, this));
    }

    private void a(k3 k3Var, y2 y2Var) {
        a(new d(this, null), k3Var, y2Var);
    }

    private void a(i5 i5Var, k3 k3Var, y2 y2Var) {
        long jM = k3Var.m();
        if (jM <= 0) {
            if (com.applovin.impl.sdk.o.a()) {
                com.applovin.impl.sdk.o oVar = this.f4770c;
                StringBuilder sb2 = new StringBuilder("Non-positive timeout set for ");
                if (y2Var != null) {
                    k3Var = y2Var;
                }
                sb2.append(k3Var);
                sb2.append(", not scheduling a timeout");
                oVar.a("MediationAdapterWrapper", sb2.toString());
                return;
            }
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            com.applovin.impl.sdk.o oVar2 = this.f4770c;
            StringBuilder sbY = d.h.y(jM, "Setting timeout ", "ms for ");
            if (y2Var != null) {
                k3Var = y2Var;
            }
            sbY.append(k3Var);
            oVar2.a("MediationAdapterWrapper", sbY.toString());
        }
        this.f4769b.q0().a(i5Var, d6.b.TIMEOUT, jM);
    }

    private void a(String str) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f4770c.d("MediationAdapterWrapper", r5.c.m(new StringBuilder("Marking "), this.f4773f, " as disabled due to: ", str));
        }
        this.f4781p.set(false);
    }

    private void a(String str, MaxAdFormat maxAdFormat, Runnable runnable) {
        t tVar = new t(this, str, runnable, 2);
        if (a(str, maxAdFormat)) {
            this.f4768a.post(tVar);
            return;
        }
        StringBuilder sbB = i3.e.b(str, ":");
        sbB.append(this.f4772e.c());
        r6 r6Var = new r6(this.f4769b, sbB.toString(), tVar);
        if (((Boolean) this.f4769b.a(x4.Z)).booleanValue()) {
            this.f4769b.q0().a(r6Var, this.f4772e);
        } else {
            this.f4769b.q0().a(r6Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, Runnable runnable) {
        try {
            if (com.applovin.impl.sdk.o.a()) {
                this.f4770c.a("MediationAdapterWrapper", this.f4773f + ": running " + str + "...");
            }
            runnable.run();
            if (com.applovin.impl.sdk.o.a()) {
                this.f4770c.a("MediationAdapterWrapper", this.f4773f + ": finished " + str + "");
            }
        } catch (Throwable th2) {
            StringBuilder sbA = d.h.A("Failed operation ", str, " for ");
            sbA.append(this.f4771d);
            com.applovin.impl.sdk.o.c("MediationAdapterWrapper", sbA.toString(), th2);
            a("fail_" + str);
            if (!str.equals("destroy")) {
                this.f4769b.T().a(this.f4772e.b(), str, this.f4775i);
            }
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("is_wrapper", "true");
            CollectionUtils.putStringIfValid("adapter_class", this.f4772e.b(), mapHashMap);
            this.f4769b.D().a("MediationAdapterWrapper", str, th2, mapHashMap);
        }
    }

    private boolean a(String str, MaxAdFormat maxAdFormat) {
        Boolean boolG0;
        Boolean boolI0;
        Boolean boolH0;
        MaxAdapter maxAdapter = this.g;
        if (maxAdapter == null) {
            return this.f4772e.r();
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
            y2 y2Var = this.f4775i;
            if (y2Var != null && (boolH0 = y2Var.h0()) != null) {
                return boolH0.booleanValue();
            }
            Boolean boolShouldLoadAdsOnUiThread = maxAdapter.shouldLoadAdsOnUiThread(maxAdFormat);
            if (boolShouldLoadAdsOnUiThread != null) {
                return boolShouldLoadAdsOnUiThread.booleanValue();
            }
        } else if ("show_ad".equals(str) && maxAdFormat != null) {
            y2 y2Var2 = this.f4775i;
            if (y2Var2 != null && (boolI0 = y2Var2.i0()) != null) {
                return boolI0.booleanValue();
            }
            Boolean boolShouldShowAdsOnUiThread = maxAdapter.shouldShowAdsOnUiThread(maxAdFormat);
            if (boolShouldShowAdsOnUiThread != null) {
                return boolShouldShowAdsOnUiThread.booleanValue();
            }
        } else if ("destroy".equals(str)) {
            y2 y2Var3 = this.f4775i;
            if (y2Var3 != null && (boolG0 = y2Var3.g0()) != null) {
                return boolG0.booleanValue();
            }
            Boolean boolShouldDestroyOnUiThread = maxAdapter.shouldDestroyOnUiThread();
            if (boolShouldDestroyOnUiThread != null) {
                return boolShouldDestroyOnUiThread.booleanValue();
            }
            return true;
        }
        return this.f4772e.r();
    }
}
