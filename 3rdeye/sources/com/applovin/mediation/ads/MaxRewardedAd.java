package com.applovin.mediation.ads;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1781n;
import com.applovin.impl.a7;
import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.impl.mediation.ads.MaxRewardedAdImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.sdk.k;
import com.applovin.mediation.MaxAdExpirationListener;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.sdk.AppLovinSdk;
import io.appmetrica.analytics.impl.Oo;
import j6.l;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class MaxRewardedAd implements MaxFullscreenAdImpl.a {

    /* renamed from: b, reason: collision with root package name */
    private static final Map f21934b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private static final Object f21935c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static WeakReference f21936d = new WeakReference(null);

    /* renamed from: a, reason: collision with root package name */
    private final MaxRewardedAdImpl f21937a;

    private MaxRewardedAd(String str, AppLovinSdk appLovinSdk, Context context) {
        this.f21937a = new MaxRewardedAdImpl(str.trim(), MaxAdFormat.REWARDED, this, "MaxRewardedAd", appLovinSdk.a(), context);
    }

    public static MaxRewardedAd getInstance(String str) {
        return getInstance(str, k.o());
    }

    public void destroy() {
        this.f21937a.logApiCall("destroy()");
        synchronized (f21935c) {
            f21934b.remove(this.f21937a.getAdUnitId());
        }
        this.f21937a.destroy();
    }

    @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.a
    public Activity getActivity() {
        this.f21937a.logApiCall("getActivity()");
        return (Activity) f21936d.get();
    }

    public String getAdUnitId() {
        return this.f21937a.getAdUnitId();
    }

    public boolean isReady() {
        boolean zIsReady = this.f21937a.isReady();
        this.f21937a.logApiCall("isReady() " + zIsReady + " for ad unit id " + this.f21937a.getAdUnitId());
        return zIsReady;
    }

    public void loadAd() {
        this.f21937a.logApiCall("loadAd()");
        this.f21937a.loadAd();
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        this.f21937a.logApiCall("setAdReviewListener(listener=" + maxAdReviewListener + ")");
        this.f21937a.setAdReviewListener(maxAdReviewListener);
    }

    public void setExpirationListener(MaxAdExpirationListener maxAdExpirationListener) {
        this.f21937a.logApiCall("setExpirationListener(listener=" + maxAdExpirationListener + ")");
        this.f21937a.setExpirationListener(maxAdExpirationListener);
    }

    public void setExtraParameter(String str, String str2) {
        this.f21937a.logApiCall(Oo.h("setExtraParameter(key=", str, ", value=", str2, ")"));
        this.f21937a.setExtraParameter(str, str2);
    }

    public void setListener(MaxRewardedAdListener maxRewardedAdListener) {
        this.f21937a.logApiCall("setListener(listener=" + maxRewardedAdListener + ")");
        this.f21937a.setListener(maxRewardedAdListener);
    }

    public void setLocalExtraParameter(String str, Object obj) {
        this.f21937a.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.f21937a.setLocalExtraParameter(str, obj);
    }

    public void setRequestListener(MaxAdRequestListener maxAdRequestListener) {
        this.f21937a.logApiCall("setRequestListener(listener=" + maxAdRequestListener + ")");
        this.f21937a.setRequestListener(maxAdRequestListener);
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        this.f21937a.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.f21937a.setRevenueListener(maxAdRevenueListener);
    }

    public void showAd(Activity activity) {
        showAd((String) null, activity);
    }

    public String toString() {
        return "" + this.f21937a;
    }

    @Deprecated
    public static MaxRewardedAd getInstance(String str, Context context) {
        return getInstance(str, AppLovinSdk.getInstance(context), context);
    }

    public void showAd(String str, Activity activity) {
        showAd(str, (String) null, activity);
    }

    @Deprecated
    public static MaxRewardedAd getInstance(String str, AppLovinSdk appLovinSdk, Context context) {
        a.logApiCall("MaxRewardedAd", "getInstance(adUnitId=" + str + ", sdk=" + appLovinSdk + ", context=" + context + ")");
        if (str != null) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Empty ad unit ID specified");
            }
            if (context == null) {
                throw new IllegalArgumentException("No context specified");
            }
            if (appLovinSdk != null) {
                if (context instanceof Activity) {
                    f21936d = new WeakReference((Activity) context);
                }
                synchronized (f21935c) {
                    try {
                        Map map = f21934b;
                        MaxRewardedAd maxRewardedAd = (MaxRewardedAd) map.get(str);
                        if (maxRewardedAd != null) {
                            return maxRewardedAd;
                        }
                        MaxRewardedAd maxRewardedAd2 = new MaxRewardedAd(str, appLovinSdk, context);
                        map.put(str, maxRewardedAd2);
                        return maxRewardedAd2;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            throw new IllegalArgumentException("No sdk specified");
        }
        throw new IllegalArgumentException("No ad unit ID specified");
    }

    public void showAd(String str, String str2, Activity activity) {
        MaxRewardedAdImpl maxRewardedAdImpl = this.f21937a;
        StringBuilder sbD = l.d("showAd(placement=", str, ", customData=", str2, ", activity=");
        sbD.append(activity);
        sbD.append(")");
        maxRewardedAdImpl.logApiCall(sbD.toString());
        a7.b(str2, "MaxRewardedAd");
        this.f21937a.showAd(str, str2, activity);
    }

    public void showAd(ViewGroup viewGroup, AbstractC1781n abstractC1781n, Activity activity) {
        showAd((String) null, viewGroup, abstractC1781n, activity);
    }

    public void showAd(String str, ViewGroup viewGroup, AbstractC1781n abstractC1781n, Activity activity) {
        showAd(str, null, viewGroup, abstractC1781n, activity);
    }

    public void showAd(String str, String str2, ViewGroup viewGroup, AbstractC1781n abstractC1781n, Activity activity) {
        MaxRewardedAdImpl maxRewardedAdImpl = this.f21937a;
        StringBuilder sbD = l.d("showAd(placement=", str, ", customData=", str2, ", containerView=");
        sbD.append(viewGroup);
        sbD.append(", lifecycle=");
        sbD.append(abstractC1781n);
        sbD.append(", activity=");
        sbD.append(activity);
        sbD.append(")");
        maxRewardedAdImpl.logApiCall(sbD.toString());
        this.f21937a.showAd(str, str2, viewGroup, abstractC1781n, activity);
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
        this.f21937a.logApiCall(Oo.h("showAd(placement=", str, ", customData=", str2, ")"));
        a7.b(str2, "MaxRewardedAd");
        this.f21937a.showAd(str, str2, getActivity());
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
        MaxRewardedAdImpl maxRewardedAdImpl = this.f21937a;
        StringBuilder sbD = l.d("showAd(placement=", str, ", customData=", str2, ", containerView=");
        sbD.append(viewGroup);
        sbD.append(", lifecycle=");
        sbD.append(abstractC1781n);
        sbD.append(")");
        maxRewardedAdImpl.logApiCall(sbD.toString());
        this.f21937a.showAd(str, str2, viewGroup, abstractC1781n, getActivity());
    }
}
