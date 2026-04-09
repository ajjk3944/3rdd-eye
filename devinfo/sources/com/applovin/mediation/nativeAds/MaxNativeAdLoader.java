package com.applovin.mediation.nativeAds;

import a0.g;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl;
import com.applovin.impl.sdk.k;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.sdk.AppLovinSdk;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class MaxNativeAdLoader {

    /* renamed from: a, reason: collision with root package name */
    private final MaxNativeAdLoaderImpl f6380a;

    public MaxNativeAdLoader(String str) {
        this(str, k.o());
    }

    public void a(List<View> list, ViewGroup viewGroup, MaxAd maxAd) {
        this.f6380a.logApiCall("a()");
        this.f6380a.registerClickableViews(list, viewGroup, maxAd);
    }

    public void b(MaxAd maxAd) {
        this.f6380a.logApiCall("b()");
        this.f6380a.handleNativeAdViewRendered(maxAd);
    }

    public void destroy() {
        this.f6380a.logApiCall("destroy()");
        this.f6380a.destroy();
    }

    public String getAdUnitId() {
        return this.f6380a.getAdUnitId();
    }

    public String getPlacement() {
        this.f6380a.logApiCall("getPlacement()");
        return this.f6380a.getPlacement();
    }

    public void loadAd() {
        loadAd(null);
    }

    public boolean render(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        this.f6380a.logApiCall("render(adView=" + maxNativeAdView + ", ad=" + maxAd + ")");
        return this.f6380a.render(maxNativeAdView, maxAd);
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        this.f6380a.logApiCall("setAdReviewListener(listener=" + maxAdReviewListener + ")");
        this.f6380a.setAdReviewListener(maxAdReviewListener);
    }

    public void setCustomData(String str) {
        this.f6380a.logApiCall("setCustomData(value=" + str + ")");
        this.f6380a.setCustomData(str);
    }

    public void setExtraParameter(String str, String str2) {
        this.f6380a.logApiCall(g.n("setExtraParameter(key=", str, ", value=", str2, ")"));
        this.f6380a.setExtraParameter(str, str2);
    }

    public void setLocalExtraParameter(String str, Object obj) {
        this.f6380a.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.f6380a.setLocalExtraParameter(str, obj);
    }

    public void setNativeAdListener(MaxNativeAdListener maxNativeAdListener) {
        this.f6380a.logApiCall("setNativeAdListener(listener=" + maxNativeAdListener + ")");
        this.f6380a.setNativeAdListener(maxNativeAdListener);
    }

    public void setPlacement(String str) {
        this.f6380a.logApiCall("setPlacement(placement=" + str + ")");
        this.f6380a.setPlacement(str);
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        this.f6380a.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.f6380a.setRevenueListener(maxAdRevenueListener);
    }

    @Deprecated
    public MaxNativeAdLoader(String str, Context context) {
        this(str, AppLovinSdk.getInstance(context), context);
    }

    public void loadAd(MaxNativeAdView maxNativeAdView) {
        this.f6380a.logApiCall("loadAd(adView=" + maxNativeAdView + ")");
        this.f6380a.loadAd(maxNativeAdView);
    }

    @Deprecated
    public MaxNativeAdLoader(String str, AppLovinSdk appLovinSdk, Context context) {
        com.applovin.impl.mediation.ads.a.logApiCall("MaxNativeAdLoader", "MaxNativeAdLoader(adUnitId=" + str + ", sdk=" + appLovinSdk + ")");
        if (str != null) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Empty ad unit ID specified");
            }
            if (appLovinSdk == null) {
                throw new IllegalArgumentException("No sdk specified");
            }
            if (context != null) {
                this.f6380a = new MaxNativeAdLoaderImpl(str, appLovinSdk.a());
                return;
            }
            throw new IllegalArgumentException("No context specified");
        }
        throw new IllegalArgumentException("No ad unit ID specified");
    }

    public void destroy(MaxAd maxAd) {
        this.f6380a.logApiCall("destroy(nativeAd=" + maxAd + ")");
        this.f6380a.destroy(maxAd);
    }
}
