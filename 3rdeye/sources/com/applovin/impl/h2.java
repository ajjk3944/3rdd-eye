package com.applovin.impl;

import C.RunnableC0615b;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1781n;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.adview.AppLovinFullscreenAdViewObserver;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.impl.r1;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class h2 implements AppLovinInterstitialAdDialog {

    /* renamed from: a, reason: collision with root package name */
    protected final com.applovin.impl.sdk.k f19482a;

    /* renamed from: b, reason: collision with root package name */
    private final WeakReference f19483b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f19484c = Collections.synchronizedMap(new HashMap());

    /* renamed from: d, reason: collision with root package name */
    private volatile AppLovinAdLoadListener f19485d;

    /* renamed from: e, reason: collision with root package name */
    private volatile AppLovinAdDisplayListener f19486e;

    /* renamed from: f, reason: collision with root package name */
    private volatile AppLovinAdVideoPlaybackListener f19487f;

    /* renamed from: g, reason: collision with root package name */
    private volatile AppLovinAdClickListener f19488g;

    /* renamed from: h, reason: collision with root package name */
    private volatile com.applovin.impl.sdk.ad.b f19489h;

    public class a implements AppLovinAdLoadListener {
        public a() {
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void adReceived(AppLovinAd appLovinAd) {
            h2.this.b(appLovinAd);
            h2.this.showAndRender(appLovinAd);
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void failedToReceiveAd(int i) {
            h2.this.b(i);
        }
    }

    public h2(AppLovinSdk appLovinSdk, Context context) {
        if (appLovinSdk == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        if (context == null) {
            throw new IllegalArgumentException("No context specified");
        }
        this.f19482a = appLovinSdk.a();
        this.f19483b = new WeakReference(context);
    }

    private long g() {
        String str = this.f19482a.n0().getExtraParameters().get("fullscreen_ad_display_delay_enabled");
        if (str == null || Boolean.parseBoolean(str)) {
            return Math.max(0L, ((Long) this.f19482a.a(l4.f19834T1)).longValue());
        }
        return 0L;
    }

    public Map h() {
        return this.f19484c;
    }

    public boolean i() {
        com.applovin.impl.sdk.ad.b bVar = this.f19489h;
        if (bVar == null) {
            return false;
        }
        bVar.B0();
        AppLovinSdkUtils.runOnUiThread(true, new C.T(19, this, bVar));
        return true;
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void setAdClickListener(AppLovinAdClickListener appLovinAdClickListener) {
        this.f19488g = appLovinAdClickListener;
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void setAdDisplayListener(AppLovinAdDisplayListener appLovinAdDisplayListener) {
        this.f19486e = appLovinAdDisplayListener;
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void setAdLoadListener(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f19485d = appLovinAdLoadListener;
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void setAdVideoPlaybackListener(AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        this.f19487f = appLovinAdVideoPlaybackListener;
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void setExtraInfo(String str, Object obj) {
        if (str == null) {
            throw new IllegalArgumentException("No key specified");
        }
        this.f19484c.put(str, obj);
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void show() {
        a(new a());
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void showAndRender(AppLovinAd appLovinAd) {
        if (appLovinAd.getType() != AppLovinAdType.INCENTIVIZED) {
            Map mapA = a2.a((AppLovinAdImpl) appLovinAd);
            CollectionUtils.putStringIfValid(AdRevenueConstants.SOURCE_KEY, "showInterstitialAd", mapA);
            this.f19482a.g().d(y1.f21811p, mapA);
        }
        AppLovinAd appLovinAdA = a7.a(appLovinAd, this.f19482a);
        Context contextE = e();
        String strA = a(appLovinAdA, appLovinAd, contextE);
        if (StringUtils.isValidString(strA)) {
            a(appLovinAd, strA);
        } else {
            a((com.applovin.impl.sdk.ad.b) appLovinAdA, contextE);
        }
    }

    public String toString() {
        return "AppLovinInterstitialAdDialog{}";
    }

    private Context e() {
        return (Context) this.f19483b.get();
    }

    public AppLovinAdDisplayListener c() {
        return this.f19486e;
    }

    public AppLovinAdVideoPlaybackListener d() {
        return this.f19487f;
    }

    public com.applovin.impl.sdk.ad.b f() {
        return this.f19489h;
    }

    public AppLovinAdClickListener b() {
        return this.f19488g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(com.applovin.impl.sdk.ad.b bVar, AppLovinAdDisplayListener appLovinAdDisplayListener, String str, Throwable th, AppLovinFullscreenAdViewObserver appLovinFullscreenAdViewObserver) {
        appLovinFullscreenAdViewObserver.onDestroy();
        a(bVar, appLovinAdDisplayListener, str, th, (AppLovinFullscreenActivity) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AbstractC1781n abstractC1781n, AppLovinAd appLovinAd, ViewGroup viewGroup, Activity activity) {
        a((com.applovin.impl.sdk.ad.b) appLovinAd, viewGroup, new AppLovinFullscreenAdViewObserver(abstractC1781n, this), activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(Context context) {
        Intent intent = new Intent(context, (Class<?>) AppLovinFullscreenActivity.class);
        intent.putExtra("com.applovin.interstitial.sdk_key", this.f19482a.i0());
        AppLovinFullscreenActivity.parentInterstitialWrapper = this;
        if (this.f19482a.e().a() == null && ((Boolean) this.f19482a.a(l4.f20021s2)).booleanValue()) {
            intent.addFlags(8388608);
        }
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        if (context instanceof Activity) {
            context.startActivity(intent);
            ((Activity) context).overridePendingTransition(0, 0);
        } else {
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
    }

    public static void a(com.applovin.impl.sdk.ad.b bVar, AppLovinAdDisplayListener appLovinAdDisplayListener, String str, Throwable th, AppLovinFullscreenActivity appLovinFullscreenActivity) {
        com.applovin.impl.sdk.o.c("InterstitialAdDialogWrapper", str, th);
        if (appLovinAdDisplayListener instanceof f2) {
            l2.a(appLovinAdDisplayListener, str);
        } else {
            l2.b(appLovinAdDisplayListener, bVar);
        }
        if (appLovinFullscreenActivity != null) {
            appLovinFullscreenActivity.dismiss("failed_to_display_ad");
        }
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void showAndRender(AppLovinAd appLovinAd, final ViewGroup viewGroup, final AbstractC1781n abstractC1781n) {
        if (appLovinAd.getType() != AppLovinAdType.INCENTIVIZED) {
            Map mapA = a2.a((AppLovinAdImpl) appLovinAd);
            CollectionUtils.putStringIfValid(AdRevenueConstants.SOURCE_KEY, "showInterstitialAdView", mapA);
            this.f19482a.g().d(y1.f21811p, mapA);
        }
        if (viewGroup != null && abstractC1781n != null) {
            final AppLovinAd appLovinAdA = a7.a(appLovinAd, this.f19482a);
            final Activity activityU0 = this.f19482a.u0();
            String strA = a(appLovinAdA, appLovinAd, activityU0);
            if (StringUtils.isValidString(strA)) {
                a(appLovinAd, strA);
                return;
            } else {
                AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.L
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f18821b.a(abstractC1781n, appLovinAdA, viewGroup, activityU0);
                    }
                });
                return;
            }
        }
        com.applovin.impl.sdk.o.h("InterstitialAdDialogWrapper", "Failed to show interstitial: attempting to show ad with null container view or lifecycle object");
        a(appLovinAd, "Failed to show interstitial: attempting to show ad with null container view or lifecycle object");
    }

    public void a() {
        this.f19488g = null;
        this.f19485d = null;
        this.f19487f = null;
        this.f19486e = null;
    }

    public class b implements r1.f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Activity f19491a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AppLovinFullscreenAdViewObserver f19492b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ViewGroup f19493c;

        public b(Activity activity, AppLovinFullscreenAdViewObserver appLovinFullscreenAdViewObserver, ViewGroup viewGroup) {
            this.f19491a = activity;
            this.f19492b = appLovinFullscreenAdViewObserver;
            this.f19493c = viewGroup;
        }

        @Override // com.applovin.impl.r1.f
        public void a(r1 r1Var) {
            if (AbstractC2113d.a(this.f19491a)) {
                com.applovin.impl.sdk.o.h("InterstitialAdDialogWrapper", "Failed to show interstitial: attempting to show ad when parent activity is finishing");
                h2.b(h2.this.f19489h, h2.this.f19486e, "Failed to show interstitial: attempting to show ad when parent activity is finishing", (Throwable) null, this.f19492b);
                HashMap<String, String> mapHashMap = CollectionUtils.hashMap(AdRevenueConstants.SOURCE_KEY, "invalidActivity");
                CollectionUtils.putStringIfValid("error_message", "Failed to show interstitial: attempting to show ad when parent activity is finishing", mapHashMap);
                h2.this.f19482a.g().a(y1.f21817s, h2.this.f19489h, mapHashMap);
                return;
            }
            this.f19492b.setPresenter(r1Var);
            try {
                r1Var.a(this.f19493c);
            } catch (Throwable th) {
                String str = "Failed to show interstitial: presenter threw exception " + th;
                com.applovin.impl.sdk.o.h("InterstitialAdDialogWrapper", str);
                h2.b(h2.this.f19489h, h2.this.f19486e, str, th, this.f19492b);
                HashMap<String, String> mapHashMap2 = CollectionUtils.hashMap(AdRevenueConstants.SOURCE_KEY, "presentContainerView");
                CollectionUtils.putStringIfValid("error_message", str, mapHashMap2);
                CollectionUtils.putStringIfValid("top_main_method", th.toString(), mapHashMap2);
                h2.this.f19482a.g().a(y1.f21817s, h2.this.f19489h, mapHashMap2);
            }
        }

        @Override // com.applovin.impl.r1.f
        public void a(String str, Throwable th) {
            h2.b(h2.this.f19489h, h2.this.f19486e, str, th, this.f19492b);
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap(AdRevenueConstants.SOURCE_KEY, "renderInterstitialAdView");
            CollectionUtils.putStringIfValid("error_message", str, mapHashMap);
            CollectionUtils.putStringIfValid("top_main_method", th.toString(), mapHashMap);
            h2.this.f19482a.g().a(y1.f21817s, h2.this.f19489h, mapHashMap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.sdk.ad.b bVar) {
        this.f19482a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f19482a.O().a("InterstitialAdDialogWrapper", "Re-showing the current ad after app launch.");
        }
        showAndRender(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(AppLovinAd appLovinAd) {
        AppLovinSdkUtils.runOnUiThread(new RunnableC0615b(14, this, appLovinAd));
    }

    private void a(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f19482a.k().loadNextAd(AppLovinAdSize.INTERSTITIAL, appLovinAdLoadListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i) {
        AppLovinSdkUtils.runOnUiThread(new K(i, 0, this));
    }

    private String a(AppLovinAd appLovinAd, AppLovinAd appLovinAd2, Context context) {
        if (context == null) {
            com.applovin.impl.sdk.o.h("InterstitialAdDialogWrapper", "Failed to show interstitial: stale activity reference provided");
            return "Failed to show interstitial: stale activity reference provided";
        }
        if (appLovinAd == null) {
            com.applovin.impl.sdk.o.h("InterstitialAdDialogWrapper", "Unable to retrieve the loaded ad: " + appLovinAd2);
            return "Unable to retrieve the loaded ad";
        }
        if (!((AppLovinAdImpl) appLovinAd).hasShown() || !((Boolean) this.f19482a.a(l4.f19742G1)).booleanValue()) {
            return null;
        }
        com.applovin.impl.sdk.o.h("InterstitialAdDialogWrapper", "Attempting to show ad again: " + appLovinAd);
        return "Attempting to show ad again";
    }

    private void a(com.applovin.impl.sdk.ad.b bVar, Context context) {
        this.f19482a.f().a(bVar);
        this.f19489h = bVar;
        long jG = g();
        this.f19482a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f19482a.O().a("InterstitialAdDialogWrapper", "Presenting ad with delay " + jG + "ms...");
        }
        if (((Boolean) this.f19482a.a(l4.f19833T0)).booleanValue()) {
            this.f19482a.h().a(this.f19489h);
        }
        new Handler(Looper.getMainLooper()).postDelayed(new B.c(13, this, context), jG);
    }

    private void a(com.applovin.impl.sdk.ad.b bVar, ViewGroup viewGroup, AppLovinFullscreenAdViewObserver appLovinFullscreenAdViewObserver, Activity activity) {
        this.f19482a.f().a(bVar);
        this.f19489h = bVar;
        long jG = g();
        this.f19482a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f19482a.O().a("InterstitialAdDialogWrapper", "Presenting ad with delay " + jG + "ms...");
        }
        if (((Boolean) this.f19482a.a(l4.f19833T0)).booleanValue()) {
            this.f19482a.h().a(this.f19489h);
        }
        new Handler(Looper.getMainLooper()).postDelayed(new T1.p(this, viewGroup, activity, appLovinFullscreenAdViewObserver, 2), jG);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(ViewGroup viewGroup, Activity activity, AppLovinFullscreenAdViewObserver appLovinFullscreenAdViewObserver) {
        this.f19482a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f19482a.O().a("InterstitialAdDialogWrapper", "Presenting ad in a containerView(" + viewGroup + ")");
        }
        viewGroup.setBackgroundColor(-16777216);
        r1.a(this.f19489h, this.f19488g, this.f19486e, this.f19487f, this.f19484c, this.f19482a, activity, new b(activity, appLovinFullscreenAdViewObserver, viewGroup));
    }

    private void a(AppLovinAd appLovinAd, String str) {
        if (this.f19486e != null) {
            if (this.f19486e instanceof f2) {
                ((f2) this.f19486e).onAdDisplayFailed(str);
            } else {
                this.f19486e.adHidden(appLovinAd);
            }
        }
        Map mapA = a2.a((AppLovinAdImpl) appLovinAd);
        CollectionUtils.putStringIfValid(AdRevenueConstants.SOURCE_KEY, "interstitialAdShowFailed", mapA);
        CollectionUtils.putStringIfValid("error_message", str, mapA);
        this.f19482a.g().d(y1.f21817s, mapA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AppLovinAd appLovinAd) {
        if (this.f19485d != null) {
            this.f19485d.adReceived(appLovinAd);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(int i) {
        if (this.f19485d != null) {
            this.f19485d.failedToReceiveAd(i);
        }
    }
}
