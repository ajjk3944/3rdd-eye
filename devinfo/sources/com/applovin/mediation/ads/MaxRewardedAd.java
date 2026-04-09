package com.applovin.mediation.ads;

import a0.g;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.lifecycle.t;
import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.impl.mediation.ads.MaxRewardedAdImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.n7;
import com.applovin.impl.sdk.k;
import com.applovin.mediation.MaxAdExpirationListener;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.sdk.AppLovinSdk;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import r5.c;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class MaxRewardedAd implements MaxFullscreenAdImpl.a {

    /* renamed from: b, reason: collision with root package name */
    private static final Map f6364b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private static final Object f6365c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static WeakReference f6366d = new WeakReference(null);

    /* renamed from: a, reason: collision with root package name */
    private final MaxRewardedAdImpl f6367a;

    private MaxRewardedAd(String str, AppLovinSdk appLovinSdk, Context context) {
        this.f6367a = new MaxRewardedAdImpl(str.trim(), MaxAdFormat.REWARDED, this, "MaxRewardedAd", appLovinSdk.a(), context);
    }

    public static MaxRewardedAd getInstance(String str) {
        return getInstance(str, k.o());
    }

    public void destroy() {
        this.f6367a.logApiCall("destroy()");
        synchronized (f6365c) {
            f6364b.remove(this.f6367a.getAdUnitId());
        }
        this.f6367a.destroy();
    }

    @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.a
    public Activity getActivity() {
        this.f6367a.logApiCall("getActivity()");
        return (Activity) f6366d.get();
    }

    public String getAdUnitId() {
        return this.f6367a.getAdUnitId();
    }

    public boolean isReady() {
        boolean zIsReady = this.f6367a.isReady();
        this.f6367a.logApiCall("isReady() " + zIsReady + " for ad unit id " + this.f6367a.getAdUnitId());
        return zIsReady;
    }

    public void loadAd() {
        this.f6367a.logApiCall("loadAd()");
        this.f6367a.loadAd();
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        this.f6367a.logApiCall("setAdReviewListener(listener=" + maxAdReviewListener + ")");
        this.f6367a.setAdReviewListener(maxAdReviewListener);
    }

    public void setExpirationListener(MaxAdExpirationListener maxAdExpirationListener) {
        this.f6367a.logApiCall("setExpirationListener(listener=" + maxAdExpirationListener + ")");
        this.f6367a.setExpirationListener(maxAdExpirationListener);
    }

    public void setExtraParameter(String str, String str2) {
        this.f6367a.logApiCall(g.n("setExtraParameter(key=", str, ", value=", str2, ")"));
        this.f6367a.setExtraParameter(str, str2);
    }

    public void setListener(MaxRewardedAdListener maxRewardedAdListener) {
        this.f6367a.logApiCall("setListener(listener=" + maxRewardedAdListener + ")");
        this.f6367a.setListener(maxRewardedAdListener);
    }

    public void setLocalExtraParameter(String str, Object obj) {
        this.f6367a.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.f6367a.setLocalExtraParameter(str, obj);
    }

    public void setRequestListener(MaxAdRequestListener maxAdRequestListener) {
        this.f6367a.logApiCall("setRequestListener(listener=" + maxAdRequestListener + ")");
        this.f6367a.setRequestListener(maxAdRequestListener);
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        this.f6367a.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.f6367a.setRevenueListener(maxAdRevenueListener);
    }

    public void showAd(Activity activity) {
        showAd((String) null, activity);
    }

    public String toString() {
        return "" + this.f6367a;
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
                    f6366d = new WeakReference((Activity) context);
                }
                synchronized (f6365c) {
                    try {
                        Map map = f6364b;
                        MaxRewardedAd maxRewardedAd = (MaxRewardedAd) map.get(str);
                        if (maxRewardedAd != null) {
                            return maxRewardedAd;
                        }
                        MaxRewardedAd maxRewardedAd2 = new MaxRewardedAd(str, appLovinSdk, context);
                        map.put(str, maxRewardedAd2);
                        return maxRewardedAd2;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            throw new IllegalArgumentException("No sdk specified");
        }
        throw new IllegalArgumentException("No ad unit ID specified");
    }

    public void showAd(String str, String str2, Activity activity) {
        MaxRewardedAdImpl maxRewardedAdImpl = this.f6367a;
        StringBuilder sbO = c.o("showAd(placement=", str, ", customData=", str2, ", activity=");
        sbO.append(activity);
        sbO.append(")");
        maxRewardedAdImpl.logApiCall(sbO.toString());
        n7.b(str2, "MaxRewardedAd");
        this.f6367a.showAd(str, str2, activity);
    }

    public void showAd(ViewGroup viewGroup, t tVar, Activity activity) {
        showAd((String) null, viewGroup, tVar, activity);
    }

    public void showAd(String str, ViewGroup viewGroup, t tVar, Activity activity) {
        showAd(str, null, viewGroup, tVar, activity);
    }

    public void showAd(String str, String str2, ViewGroup viewGroup, t tVar, Activity activity) {
        MaxRewardedAdImpl maxRewardedAdImpl = this.f6367a;
        StringBuilder sbO = c.o("showAd(placement=", str, ", customData=", str2, ", containerView=");
        sbO.append(viewGroup);
        sbO.append(", lifecycle=");
        sbO.append(tVar);
        sbO.append(", activity=");
        sbO.append(activity);
        sbO.append(")");
        maxRewardedAdImpl.logApiCall(sbO.toString());
        this.f6367a.showAd(str, str2, viewGroup, tVar, activity);
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
        this.f6367a.logApiCall(g.n("showAd(placement=", str, ", customData=", str2, ")"));
        n7.b(str2, "MaxRewardedAd");
        this.f6367a.showAd(str, str2, getActivity());
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
        MaxRewardedAdImpl maxRewardedAdImpl = this.f6367a;
        StringBuilder sbO = c.o("showAd(placement=", str, ", customData=", str2, ", containerView=");
        sbO.append(viewGroup);
        sbO.append(", lifecycle=");
        sbO.append(tVar);
        sbO.append(")");
        maxRewardedAdImpl.logApiCall(sbO.toString());
        this.f6367a.showAd(str, str2, viewGroup, tVar, getActivity());
    }
}
