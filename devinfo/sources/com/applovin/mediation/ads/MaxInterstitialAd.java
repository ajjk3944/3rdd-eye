package com.applovin.mediation.ads;

import a0.g;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.lifecycle.t;
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
import java.lang.ref.WeakReference;
import r5.c;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class MaxInterstitialAd implements MaxFullscreenAdImpl.a {

    /* renamed from: b, reason: collision with root package name */
    private static WeakReference f6362b = new WeakReference(null);

    /* renamed from: a, reason: collision with root package name */
    private final MaxFullscreenAdImpl f6363a;

    public MaxInterstitialAd(String str) {
        this(str, k.o());
    }

    public void destroy() {
        this.f6363a.logApiCall("destroy()");
        this.f6363a.destroy();
    }

    @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.a
    public Activity getActivity() {
        this.f6363a.logApiCall("getActivity()");
        return (Activity) f6362b.get();
    }

    public String getAdUnitId() {
        return this.f6363a.getAdUnitId();
    }

    public boolean isReady() {
        boolean zIsReady = this.f6363a.isReady();
        this.f6363a.logApiCall("isReady() " + zIsReady + " for ad unit id " + this.f6363a.getAdUnitId());
        return zIsReady;
    }

    public void loadAd() {
        this.f6363a.logApiCall("loadAd()");
        this.f6363a.loadAd();
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        this.f6363a.logApiCall("setAdReviewListener(listener=" + maxAdReviewListener + ")");
        this.f6363a.setAdReviewListener(maxAdReviewListener);
    }

    public void setExpirationListener(MaxAdExpirationListener maxAdExpirationListener) {
        this.f6363a.logApiCall("setExpirationListener(listener=" + maxAdExpirationListener + ")");
        this.f6363a.setExpirationListener(maxAdExpirationListener);
    }

    public void setExtraParameter(String str, String str2) {
        this.f6363a.logApiCall(g.n("setExtraParameter(key=", str, ", value=", str2, ")"));
        this.f6363a.setExtraParameter(str, str2);
    }

    public void setListener(MaxAdListener maxAdListener) {
        this.f6363a.logApiCall("setListener(listener=" + maxAdListener + ")");
        this.f6363a.setListener(maxAdListener);
    }

    public void setLocalExtraParameter(String str, Object obj) {
        this.f6363a.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.f6363a.setLocalExtraParameter(str, obj);
    }

    public void setRequestListener(MaxAdRequestListener maxAdRequestListener) {
        this.f6363a.logApiCall("setRequestListener(listener=" + maxAdRequestListener + ")");
        this.f6363a.setRequestListener(maxAdRequestListener);
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        this.f6363a.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.f6363a.setRevenueListener(maxAdRevenueListener);
    }

    public void showAd(Activity activity) {
        showAd((String) null, activity);
    }

    public String toString() {
        return "" + this.f6363a;
    }

    @Deprecated
    public MaxInterstitialAd(String str, Context context) {
        this(str, AppLovinSdk.getInstance(context), context);
    }

    public void showAd(String str, Activity activity) {
        showAd(str, (String) null, activity);
    }

    @Deprecated
    public MaxInterstitialAd(String str, AppLovinSdk appLovinSdk, Context context) {
        a.logApiCall("MaxInterstitialAd", "MaxInterstitialAd(adUnitId=" + str + ", sdk=" + appLovinSdk + ", context=" + context + ")");
        if (str != null) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Empty ad unit ID specified");
            }
            if (context == null) {
                throw new IllegalArgumentException("No context specified");
            }
            if (appLovinSdk != null) {
                if (context instanceof Activity) {
                    f6362b = new WeakReference((Activity) context);
                }
                this.f6363a = new MaxFullscreenAdImpl(str.trim(), MaxAdFormat.INTERSTITIAL, this, "MaxInterstitialAd", appLovinSdk.a(), context);
                return;
            }
            throw new IllegalArgumentException("No sdk specified");
        }
        throw new IllegalArgumentException("No ad unit ID specified");
    }

    public void showAd(String str, String str2, Activity activity) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f6363a;
        StringBuilder sbO = c.o("showAd(placement=", str, ", customData=", str2, ", activity=");
        sbO.append(activity);
        sbO.append(")");
        maxFullscreenAdImpl.logApiCall(sbO.toString());
        n7.b(str2, "MaxInterstitialAd");
        this.f6363a.showAd(str, str2, activity);
    }

    public void showAd(ViewGroup viewGroup, t tVar, Activity activity) {
        showAd((String) null, viewGroup, tVar, activity);
    }

    public void showAd(String str, ViewGroup viewGroup, t tVar, Activity activity) {
        showAd(str, null, viewGroup, tVar, activity);
    }

    public void showAd(String str, String str2, ViewGroup viewGroup, t tVar, Activity activity) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f6363a;
        StringBuilder sbO = c.o("showAd(placement=", str, ", customData=", str2, ", containerView=");
        sbO.append(viewGroup);
        sbO.append(", lifecycle=");
        sbO.append(tVar);
        sbO.append(", activity=");
        sbO.append(activity);
        sbO.append(")");
        maxFullscreenAdImpl.logApiCall(sbO.toString());
        this.f6363a.showAd(str, str2, viewGroup, tVar, activity);
    }

    @Deprecated
    public void showAd() {
        showAd((String) null);
    }

    @Deprecated
    public void showAd(String str) {
        showAd(str, (String) null);
    }

    @Deprecated
    public void showAd(String str, String str2) {
        this.f6363a.logApiCall(g.n("showAd(placement=", str, ", customData=", str2, ")"));
        n7.b(str2, "MaxInterstitialAd");
        this.f6363a.showAd(str, str2, getActivity());
    }

    @Deprecated
    public void showAd(ViewGroup viewGroup, t tVar) {
        showAd((String) null, viewGroup, tVar);
    }

    @Deprecated
    public void showAd(String str, ViewGroup viewGroup, t tVar) {
        showAd(str, (String) null, viewGroup, tVar);
    }

    @Deprecated
    public void showAd(String str, String str2, ViewGroup viewGroup, t tVar) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f6363a;
        StringBuilder sbO = c.o("showAd(placement=", str, ", customData=", str2, ", containerView=");
        sbO.append(viewGroup);
        sbO.append(", lifecycle=");
        sbO.append(tVar);
        sbO.append(")");
        maxFullscreenAdImpl.logApiCall(sbO.toString());
        this.f6363a.showAd(str, str2, viewGroup, tVar, getActivity());
    }
}
