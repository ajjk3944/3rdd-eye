package com.applovin.mediation.ads;

import android.content.Context;
import com.applovin.impl.a7;
import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.sdk.k;
import com.applovin.mediation.MaxAdExpirationListener;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.sdk.AppLovinSdk;
import io.appmetrica.analytics.impl.Oo;

/* loaded from: classes.dex */
public class MaxAppOpenAd {

    /* renamed from: a, reason: collision with root package name */
    private final MaxFullscreenAdImpl f21931a;

    public MaxAppOpenAd(String str) {
        this(str, k.o());
    }

    public void destroy() {
        this.f21931a.logApiCall("destroy()");
        this.f21931a.destroy();
    }

    public String getAdUnitId() {
        return this.f21931a.getAdUnitId();
    }

    public boolean isReady() {
        boolean zIsReady = this.f21931a.isReady();
        this.f21931a.logApiCall("isReady() " + zIsReady + " for ad unit id " + this.f21931a.getAdUnitId());
        return zIsReady;
    }

    public void loadAd() {
        this.f21931a.logApiCall("loadAd()");
        this.f21931a.loadAd();
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        this.f21931a.logApiCall("setAdReviewListener(listener=" + maxAdReviewListener + ")");
        this.f21931a.setAdReviewListener(maxAdReviewListener);
    }

    public void setExpirationListener(MaxAdExpirationListener maxAdExpirationListener) {
        this.f21931a.logApiCall("setExpirationListener(listener=" + maxAdExpirationListener + ")");
        this.f21931a.setExpirationListener(maxAdExpirationListener);
    }

    public void setExtraParameter(String str, String str2) {
        this.f21931a.logApiCall(Oo.h("setExtraParameter(key=", str, ", value=", str2, ")"));
        this.f21931a.setExtraParameter(str, str2);
    }

    public void setListener(MaxAdListener maxAdListener) {
        this.f21931a.logApiCall("setListener(listener=" + maxAdListener + ")");
        this.f21931a.setListener(maxAdListener);
    }

    public void setLocalExtraParameter(String str, Object obj) {
        this.f21931a.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.f21931a.setLocalExtraParameter(str, obj);
    }

    public void setRequestListener(MaxAdRequestListener maxAdRequestListener) {
        this.f21931a.logApiCall("setRequestListener(listener=" + maxAdRequestListener + ")");
        this.f21931a.setRequestListener(maxAdRequestListener);
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        this.f21931a.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.f21931a.setRevenueListener(maxAdRevenueListener);
    }

    public void showAd() {
        showAd(null);
    }

    public String toString() {
        return "" + this.f21931a;
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
        this.f21931a.logApiCall(Oo.h("showAd(placement=", str, ", customData=", str2, ")"));
        a7.b(str2, "MaxAppOpenAd");
        this.f21931a.showAd(str, str2, null);
    }

    private MaxAppOpenAd(String str, AppLovinSdk appLovinSdk, Context context) {
        a.logApiCall("MaxAppOpenAd", "MaxAppOpenAd(adUnitId=" + str + ", sdk=" + appLovinSdk + ", context=" + context + ")");
        this.f21931a = new MaxFullscreenAdImpl(str.trim(), MaxAdFormat.APP_OPEN, null, "MaxAppOpenAd", appLovinSdk.a(), context);
    }
}
