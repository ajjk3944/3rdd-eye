package com.applovin.mediation.ads;

import a0.g;
import android.content.Context;
import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.n7;
import com.applovin.impl.sdk.k;
import com.applovin.mediation.MaxAdExpirationListener;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.sdk.AppLovinSdk;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class MaxAppOpenAd {

    /* renamed from: a, reason: collision with root package name */
    private final MaxFullscreenAdImpl f6361a;

    public MaxAppOpenAd(String str) {
        this(str, k.o());
    }

    public void destroy() {
        this.f6361a.logApiCall("destroy()");
        this.f6361a.destroy();
    }

    public String getAdUnitId() {
        return this.f6361a.getAdUnitId();
    }

    public boolean isReady() {
        boolean zIsReady = this.f6361a.isReady();
        this.f6361a.logApiCall("isReady() " + zIsReady + " for ad unit id " + this.f6361a.getAdUnitId());
        return zIsReady;
    }

    public void loadAd() {
        this.f6361a.logApiCall("loadAd()");
        this.f6361a.loadAd();
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        this.f6361a.logApiCall("setAdReviewListener(listener=" + maxAdReviewListener + ")");
        this.f6361a.setAdReviewListener(maxAdReviewListener);
    }

    public void setExpirationListener(MaxAdExpirationListener maxAdExpirationListener) {
        this.f6361a.logApiCall("setExpirationListener(listener=" + maxAdExpirationListener + ")");
        this.f6361a.setExpirationListener(maxAdExpirationListener);
    }

    public void setExtraParameter(String str, String str2) {
        this.f6361a.logApiCall(g.n("setExtraParameter(key=", str, ", value=", str2, ")"));
        this.f6361a.setExtraParameter(str, str2);
    }

    public void setListener(MaxAdListener maxAdListener) {
        this.f6361a.logApiCall("setListener(listener=" + maxAdListener + ")");
        this.f6361a.setListener(maxAdListener);
    }

    public void setLocalExtraParameter(String str, Object obj) {
        this.f6361a.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.f6361a.setLocalExtraParameter(str, obj);
    }

    public void setRequestListener(MaxAdRequestListener maxAdRequestListener) {
        this.f6361a.logApiCall("setRequestListener(listener=" + maxAdRequestListener + ")");
        this.f6361a.setRequestListener(maxAdRequestListener);
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        this.f6361a.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.f6361a.setRevenueListener(maxAdRevenueListener);
    }

    public void showAd() {
        showAd(null);
    }

    public String toString() {
        return "" + this.f6361a;
    }

    @Deprecated
    public MaxAppOpenAd(String str, Context context) {
        this(str, AppLovinSdk.getInstance(context), context);
    }

    public void showAd(String str) {
        showAd(str, null);
    }

    @Deprecated
    public MaxAppOpenAd(String str, AppLovinSdk appLovinSdk) {
        this(str, appLovinSdk, k.o());
    }

    public void showAd(String str, String str2) {
        this.f6361a.logApiCall(g.n("showAd(placement=", str, ", customData=", str2, ")"));
        n7.b(str2, "MaxAppOpenAd");
        this.f6361a.showAd(str, str2, null);
    }

    private MaxAppOpenAd(String str, AppLovinSdk appLovinSdk, Context context) {
        a.logApiCall("MaxAppOpenAd", "MaxAppOpenAd(adUnitId=" + str + ", sdk=" + appLovinSdk + ", context=" + context + ")");
        this.f6361a = new MaxFullscreenAdImpl(str.trim(), MaxAdFormat.APP_OPEN, null, "MaxAppOpenAd", appLovinSdk.a(), context);
    }
}
