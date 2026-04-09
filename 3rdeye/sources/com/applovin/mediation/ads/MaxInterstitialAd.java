package com.applovin.mediation.ads;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1781n;
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
import j6.l;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class MaxInterstitialAd implements MaxFullscreenAdImpl.a {

    /* renamed from: b, reason: collision with root package name */
    private static WeakReference f21932b = new WeakReference(null);

    /* renamed from: a, reason: collision with root package name */
    private final MaxFullscreenAdImpl f21933a;

    public MaxInterstitialAd(String str) {
        this(str, k.o());
    }

    public void destroy() {
        this.f21933a.logApiCall("destroy()");
        this.f21933a.destroy();
    }

    @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.a
    public Activity getActivity() {
        this.f21933a.logApiCall("getActivity()");
        return (Activity) f21932b.get();
    }

    public String getAdUnitId() {
        return this.f21933a.getAdUnitId();
    }

    public boolean isReady() {
        boolean zIsReady = this.f21933a.isReady();
        this.f21933a.logApiCall("isReady() " + zIsReady + " for ad unit id " + this.f21933a.getAdUnitId());
        return zIsReady;
    }

    public void loadAd() {
        this.f21933a.logApiCall("loadAd()");
        this.f21933a.loadAd();
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        this.f21933a.logApiCall("setAdReviewListener(listener=" + maxAdReviewListener + ")");
        this.f21933a.setAdReviewListener(maxAdReviewListener);
    }

    public void setExpirationListener(MaxAdExpirationListener maxAdExpirationListener) {
        this.f21933a.logApiCall("setExpirationListener(listener=" + maxAdExpirationListener + ")");
        this.f21933a.setExpirationListener(maxAdExpirationListener);
    }

    public void setExtraParameter(String str, String str2) {
        this.f21933a.logApiCall(Oo.h("setExtraParameter(key=", str, ", value=", str2, ")"));
        this.f21933a.setExtraParameter(str, str2);
    }

    public void setListener(MaxAdListener maxAdListener) {
        this.f21933a.logApiCall("setListener(listener=" + maxAdListener + ")");
        this.f21933a.setListener(maxAdListener);
    }

    public void setLocalExtraParameter(String str, Object obj) {
        this.f21933a.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.f21933a.setLocalExtraParameter(str, obj);
    }

    public void setRequestListener(MaxAdRequestListener maxAdRequestListener) {
        this.f21933a.logApiCall("setRequestListener(listener=" + maxAdRequestListener + ")");
        this.f21933a.setRequestListener(maxAdRequestListener);
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        this.f21933a.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.f21933a.setRevenueListener(maxAdRevenueListener);
    }

    public void showAd(Activity activity) {
        showAd((String) null, activity);
    }

    public String toString() {
        return "" + this.f21933a;
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
                    f21932b = new WeakReference((Activity) context);
                }
                this.f21933a = new MaxFullscreenAdImpl(str.trim(), MaxAdFormat.INTERSTITIAL, this, "MaxInterstitialAd", appLovinSdk.a(), context);
                return;
            }
            throw new IllegalArgumentException("No sdk specified");
        }
        throw new IllegalArgumentException("No ad unit ID specified");
    }

    public void showAd(String str, String str2, Activity activity) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f21933a;
        StringBuilder sbD = l.d("showAd(placement=", str, ", customData=", str2, ", activity=");
        sbD.append(activity);
        sbD.append(")");
        maxFullscreenAdImpl.logApiCall(sbD.toString());
        a7.b(str2, "MaxInterstitialAd");
        this.f21933a.showAd(str, str2, activity);
    }

    public void showAd(ViewGroup viewGroup, AbstractC1781n abstractC1781n, Activity activity) {
        showAd((String) null, viewGroup, abstractC1781n, activity);
    }

    public void showAd(String str, ViewGroup viewGroup, AbstractC1781n abstractC1781n, Activity activity) {
        showAd(str, null, viewGroup, abstractC1781n, activity);
    }

    public void showAd(String str, String str2, ViewGroup viewGroup, AbstractC1781n abstractC1781n, Activity activity) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f21933a;
        StringBuilder sbD = l.d("showAd(placement=", str, ", customData=", str2, ", containerView=");
        sbD.append(viewGroup);
        sbD.append(", lifecycle=");
        sbD.append(abstractC1781n);
        sbD.append(", activity=");
        sbD.append(activity);
        sbD.append(")");
        maxFullscreenAdImpl.logApiCall(sbD.toString());
        this.f21933a.showAd(str, str2, viewGroup, abstractC1781n, activity);
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
        this.f21933a.logApiCall(Oo.h("showAd(placement=", str, ", customData=", str2, ")"));
        a7.b(str2, "MaxInterstitialAd");
        this.f21933a.showAd(str, str2, getActivity());
    }

    @Deprecated
    public void showAd(ViewGroup viewGroup, AbstractC1781n abstractC1781n) {
        showAd((String) null, viewGroup, abstractC1781n);
    }

    @Deprecated
    public void showAd(String str, ViewGroup viewGroup, AbstractC1781n abstractC1781n) {
        showAd(str, (String) null, viewGroup, abstractC1781n);
    }

    @Deprecated
    public void showAd(String str, String str2, ViewGroup viewGroup, AbstractC1781n abstractC1781n) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f21933a;
        StringBuilder sbD = l.d("showAd(placement=", str, ", customData=", str2, ", containerView=");
        sbD.append(viewGroup);
        sbD.append(", lifecycle=");
        sbD.append(abstractC1781n);
        sbD.append(")");
        maxFullscreenAdImpl.logApiCall(sbD.toString());
        this.f21933a.showAd(str, str2, viewGroup, abstractC1781n, getActivity());
    }
}
