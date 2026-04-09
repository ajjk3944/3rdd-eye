package com.applovin.impl.mediation.debugger.ui.testmode;

import B2.r;
import B2.s;
import D8.e;
import D8.f;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Switch;
import android.widget.TextView;
import com.amazon.device.ads.AdError;
import com.amazon.device.ads.AdRegistration;
import com.amazon.device.ads.DTBAdResponse;
import com.applovin.impl.C2149v;
import com.applovin.impl.C2151w;
import com.applovin.impl.a7;
import com.applovin.impl.d3;
import com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.v2;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.mediation.ads.MaxAppOpenAd;
import com.applovin.mediation.ads.MaxInterstitialAd;
import com.applovin.mediation.ads.MaxRewardedAd;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdLoader;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class a extends d3 implements MaxRewardedAdListener, MaxAdViewAdListener, AdControlButton.a, MaxAdRevenueListener, C2149v.a {

    /* renamed from: a, reason: collision with root package name */
    private v2 f20361a;

    /* renamed from: b, reason: collision with root package name */
    private k f20362b;

    /* renamed from: c, reason: collision with root package name */
    private MaxAdView f20363c;

    /* renamed from: d, reason: collision with root package name */
    private MaxAdView f20364d;

    /* renamed from: e, reason: collision with root package name */
    private MaxInterstitialAd f20365e;

    /* renamed from: f, reason: collision with root package name */
    private MaxAppOpenAd f20366f;

    /* renamed from: g, reason: collision with root package name */
    private MaxRewardedAd f20367g;

    /* renamed from: h, reason: collision with root package name */
    private MaxAd f20368h;
    private MaxNativeAdLoader i;

    /* renamed from: j, reason: collision with root package name */
    private List f20369j;

    /* renamed from: k, reason: collision with root package name */
    private String f20370k;

    /* renamed from: l, reason: collision with root package name */
    private AdControlButton f20371l;

    /* renamed from: m, reason: collision with root package name */
    private AdControlButton f20372m;

    /* renamed from: n, reason: collision with root package name */
    private AdControlButton f20373n;

    /* renamed from: o, reason: collision with root package name */
    private AdControlButton f20374o;

    /* renamed from: p, reason: collision with root package name */
    private AdControlButton f20375p;

    /* renamed from: q, reason: collision with root package name */
    private AdControlButton f20376q;

    /* renamed from: r, reason: collision with root package name */
    private Button f20377r;

    /* renamed from: s, reason: collision with root package name */
    private Button f20378s;

    /* renamed from: t, reason: collision with root package name */
    private FrameLayout f20379t;

    /* renamed from: u, reason: collision with root package name */
    private FrameLayout f20380u;

    /* renamed from: v, reason: collision with root package name */
    private Switch f20381v;

    /* renamed from: w, reason: collision with root package name */
    private Switch f20382w;

    /* renamed from: x, reason: collision with root package name */
    private Map f20383x;

    /* renamed from: com.applovin.impl.mediation.debugger.ui.testmode.a$a, reason: collision with other inner class name */
    public class C0313a extends MaxNativeAdListener {
        public C0313a() {
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdClicked(MaxAd maxAd) {
            a.this.onAdClicked(maxAd);
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdLoadFailed(String str, MaxError maxError) {
            a.this.onAdLoadFailed(str, maxError);
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdLoaded(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
            if (a.this.f20368h != null) {
                a.this.i.destroy(a.this.f20368h);
            }
            a.this.f20368h = maxAd;
            a.this.f20380u.removeAllViews();
            a.this.f20380u.addView(maxNativeAdView);
            a.this.onAdLoaded(maxAd);
        }
    }

    private void e() {
        List listR = this.f20361a.r();
        MaxAdFormat maxAdFormat = MaxAdFormat.REWARDED;
        if (!listR.contains(maxAdFormat)) {
            findViewById(R.id.rewarded_control_view).setVisibility(8);
            return;
        }
        String str = "test_mode_rewarded_" + this.f20361a.m();
        this.f20370k = str;
        MaxRewardedAd maxRewardedAd = MaxRewardedAd.getInstance(str, this.f20362b.y0(), this);
        this.f20367g = maxRewardedAd;
        maxRewardedAd.setExtraParameter("disable_auto_retries", "true");
        this.f20367g.setListener(this);
        AdControlButton adControlButton = (AdControlButton) findViewById(R.id.rewarded_control_button);
        this.f20375p = adControlButton;
        adControlButton.setOnClickListener(this);
        this.f20375p.setFormat(maxAdFormat);
    }

    @Override // com.applovin.impl.d3
    public k getSdk() {
        return this.f20362b;
    }

    public String getTestModeNetwork(MaxAdFormat maxAdFormat) {
        return (this.f20361a.x() == null || !this.f20361a.x().containsKey(maxAdFormat)) ? this.f20361a.m() : (String) this.f20361a.x().get(maxAdFormat);
    }

    public void initialize(v2 v2Var) {
        this.f20361a = v2Var;
        this.f20362b = v2Var.o();
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdClicked(MaxAd maxAd) {
        a7.a("onAdClicked", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public void onAdCollapsed(MaxAd maxAd) {
        a7.a("onAdCollapsed", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        a(maxAd.getAdUnitId()).setControlState(AdControlButton.b.LOAD);
        a7.a("Failed to display " + maxAd.getFormat().getDisplayName(), "MAX Error\nCode: " + maxError.getCode() + "\nMessage: " + maxError.getMessage() + "\n\n" + maxAd.getNetworkName() + " Display Error\nCode: " + maxError.getMediatedNetworkErrorCode() + "\nMessage: " + maxError.getMediatedNetworkErrorMessage(), this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayed(MaxAd maxAd) {
        a7.a("onAdDisplayed", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public void onAdExpanded(MaxAd maxAd) {
        a7.a("onAdExpanded", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdHidden(MaxAd maxAd) {
        a7.a("onAdHidden", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoadFailed(String str, MaxError maxError) {
        AdControlButton adControlButtonA = a(str);
        adControlButtonA.setControlState(AdControlButton.b.LOAD);
        a7.a(maxError, adControlButtonA.getFormat().getLabel(), this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoaded(MaxAd maxAd) {
        AdControlButton adControlButtonA = a(maxAd.getAdUnitId());
        if (maxAd.getFormat().isAdViewAd() || maxAd.getFormat().equals(MaxAdFormat.NATIVE)) {
            adControlButtonA.setControlState(AdControlButton.b.LOAD);
        } else {
            adControlButtonA.setControlState(AdControlButton.b.SHOW);
        }
    }

    @Override // com.applovin.impl.C2149v.a
    public void onAdResponseLoaded(DTBAdResponse dTBAdResponse, MaxAdFormat maxAdFormat) {
        if (MaxAdFormat.BANNER == maxAdFormat || MaxAdFormat.LEADER == maxAdFormat) {
            this.f20363c.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.MREC == maxAdFormat) {
            this.f20364d.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f20365e.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f20366f.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f20367g.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.i.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        }
        a(maxAdFormat);
    }

    @Override // com.applovin.mediation.MaxAdRevenueListener
    public void onAdRevenuePaid(MaxAd maxAd) {
        a7.a("onAdRevenuePaid", maxAd, this);
    }

    @Override // com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton.a
    public void onClick(AdControlButton adControlButton) {
        MaxAdFormat format = adControlButton.getFormat();
        AdControlButton.b bVar = AdControlButton.b.LOAD;
        if (bVar != adControlButton.getControlState()) {
            if (AdControlButton.b.SHOW == adControlButton.getControlState()) {
                adControlButton.setControlState(bVar);
                b(format);
                return;
            }
            return;
        }
        adControlButton.setControlState(AdControlButton.b.LOADING);
        Map map = this.f20383x;
        if (map == null || map.get(format) == null) {
            a(format);
        } else {
            ((C2149v) this.f20383x.get(format)).a();
        }
    }

    @Override // com.applovin.impl.d3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.f20361a == null) {
            o.h("MaxDebuggerMultiAdActivity", "Failed to initialize activity with a network model.");
            return;
        }
        setContentView(R.layout.mediation_debugger_multi_ad_activity);
        setTitle(this.f20361a.g() + " Test Ads");
        this.f20369j = this.f20362b.s0().b();
        a();
        c();
        b();
        e();
        d();
        findViewById(R.id.app_open_ad_control_view).setVisibility(8);
        this.f20377r = (Button) findViewById(R.id.show_mrec_button);
        this.f20378s = (Button) findViewById(R.id.show_native_button);
        if (this.f20361a.J() && this.f20361a.r().contains(MaxAdFormat.MREC)) {
            this.f20380u.setVisibility(8);
            this.f20377r.setBackgroundColor(-1);
            this.f20378s.setBackgroundColor(-3355444);
            int i = 3;
            this.f20377r.setOnClickListener(new e(this, i));
            this.f20378s.setOnClickListener(new r(this, i));
        } else {
            this.f20377r.setVisibility(8);
            this.f20378s.setVisibility(8);
        }
        this.f20381v = (Switch) findViewById(R.id.native_banner_switch);
        this.f20382w = (Switch) findViewById(R.id.native_mrec_switch);
        if (this.f20361a.K()) {
            this.f20381v.setOnClickListener(new s(this, 2));
            this.f20382w.setOnClickListener(new f(this, 3));
        } else {
            this.f20381v.setVisibility(8);
            this.f20382w.setVisibility(8);
        }
        if (StringUtils.isValidString(this.f20361a.e()) && this.f20361a.d() != null && this.f20361a.d().size() > 0) {
            AdRegistration.getInstance(this.f20361a.e(), this);
            AdRegistration.enableTesting(true);
            AdRegistration.enableLogging(true);
            HashMap map = new HashMap(this.f20361a.d().size());
            for (MaxAdFormat maxAdFormat : this.f20361a.d().keySet()) {
                map.put(maxAdFormat, new C2149v((C2151w) this.f20361a.d().get(maxAdFormat), maxAdFormat, getApplicationContext(), this));
            }
            this.f20383x = map;
        }
        try {
            setRequestedOrientation(7);
        } catch (Throwable th) {
            o.c("AppLovinSdk", "Failed to set portrait orientation", th);
        }
    }

    @Override // com.applovin.impl.d3, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f20362b.s0().a(this.f20369j);
        MaxAdView maxAdView = this.f20363c;
        if (maxAdView != null) {
            maxAdView.destroy();
        }
        MaxAdView maxAdView2 = this.f20364d;
        if (maxAdView2 != null) {
            maxAdView2.destroy();
        }
        MaxInterstitialAd maxInterstitialAd = this.f20365e;
        if (maxInterstitialAd != null) {
            maxInterstitialAd.destroy();
        }
        MaxRewardedAd maxRewardedAd = this.f20367g;
        if (maxRewardedAd != null) {
            maxRewardedAd.destroy();
        }
        MaxNativeAdLoader maxNativeAdLoader = this.i;
        if (maxNativeAdLoader != null) {
            MaxAd maxAd = this.f20368h;
            if (maxAd != null) {
                maxNativeAdLoader.destroy(maxAd);
            }
            this.i.destroy();
        }
    }

    @Override // com.applovin.mediation.MaxRewardedAdListener
    public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
        a7.a("onUserRewarded", maxAd, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(View view) {
        this.f20364d.removeAllViews();
        this.f20372m.setControlState(AdControlButton.b.LOAD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        this.f20380u.setVisibility(0);
        this.f20379t.setVisibility(8);
        this.f20378s.setBackgroundColor(-1);
        this.f20377r.setBackgroundColor(-3355444);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        this.f20363c.removeAllViews();
        this.f20371l.setControlState(AdControlButton.b.LOAD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        this.f20379t.setVisibility(0);
        this.f20380u.setVisibility(8);
        this.f20377r.setBackgroundColor(-1);
        this.f20378s.setBackgroundColor(-3355444);
    }

    private void d() {
        this.f20380u = (FrameLayout) findViewById(R.id.native_ad_view_container);
        if (this.f20361a.J()) {
            MaxNativeAdLoader maxNativeAdLoader = new MaxNativeAdLoader("test_mode_native", this.f20362b.y0(), this);
            this.i = maxNativeAdLoader;
            maxNativeAdLoader.setExtraParameter("disable_auto_retries", "true");
            this.i.setNativeAdListener(new C0313a());
            this.i.setRevenueListener(this);
            AdControlButton adControlButton = (AdControlButton) findViewById(R.id.native_control_button);
            this.f20376q = adControlButton;
            adControlButton.setOnClickListener(this);
            this.f20376q.setFormat(MaxAdFormat.NATIVE);
            return;
        }
        findViewById(R.id.native_control_view).setVisibility(8);
        this.f20380u.setVisibility(8);
    }

    @Override // com.applovin.impl.C2149v.a
    public void onAdLoadFailed(AdError adError, MaxAdFormat maxAdFormat) {
        if (MaxAdFormat.BANNER != maxAdFormat && MaxAdFormat.LEADER != maxAdFormat) {
            if (MaxAdFormat.MREC == maxAdFormat) {
                this.f20364d.setLocalExtraParameter("amazon_ad_error", adError);
            } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
                this.f20365e.setLocalExtraParameter("amazon_ad_error", adError);
            } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
                this.f20366f.setLocalExtraParameter("amazon_ad_error", adError);
            } else if (MaxAdFormat.REWARDED == maxAdFormat) {
                this.f20367g.setLocalExtraParameter("amazon_ad_error", adError);
            } else if (MaxAdFormat.NATIVE == maxAdFormat) {
                this.i.setLocalExtraParameter("amazon_ad_error", adError);
            }
        } else {
            this.f20363c.setLocalExtraParameter("amazon_ad_error", adError);
        }
        a(maxAdFormat);
    }

    private void c() {
        this.f20379t = (FrameLayout) findViewById(R.id.mrec_ad_view_container);
        List listR = this.f20361a.r();
        MaxAdFormat maxAdFormat = MaxAdFormat.MREC;
        if (listR.contains(maxAdFormat)) {
            MaxAdView maxAdView = new MaxAdView("test_mode_mrec", maxAdFormat, this.f20362b.y0(), this);
            this.f20364d = maxAdView;
            maxAdView.setExtraParameter("disable_auto_retries", "true");
            this.f20364d.setExtraParameter("disable_precache", "true");
            this.f20364d.setExtraParameter("allow_pause_auto_refresh_immediately", "true");
            this.f20364d.stopAutoRefresh();
            this.f20364d.setListener(this);
            this.f20379t.addView(this.f20364d, new FrameLayout.LayoutParams(-1, -1));
            AdControlButton adControlButton = (AdControlButton) findViewById(R.id.mrec_control_button);
            this.f20372m = adControlButton;
            adControlButton.setOnClickListener(this);
            this.f20372m.setFormat(maxAdFormat);
            return;
        }
        findViewById(R.id.mrec_control_view).setVisibility(8);
        this.f20379t.setVisibility(8);
    }

    private void b() {
        List listR = this.f20361a.r();
        MaxAdFormat maxAdFormat = MaxAdFormat.INTERSTITIAL;
        if (listR.contains(maxAdFormat)) {
            MaxInterstitialAd maxInterstitialAd = new MaxInterstitialAd("test_mode_interstitial", this.f20362b.y0(), this);
            this.f20365e = maxInterstitialAd;
            maxInterstitialAd.setExtraParameter("disable_auto_retries", "true");
            this.f20365e.setListener(this);
            AdControlButton adControlButton = (AdControlButton) findViewById(R.id.interstitial_control_button);
            this.f20373n = adControlButton;
            adControlButton.setOnClickListener(this);
            this.f20373n.setFormat(maxAdFormat);
            return;
        }
        findViewById(R.id.interstitial_control_view).setVisibility(8);
    }

    private void a() {
        MaxAdFormat maxAdFormat;
        String str;
        boolean zIsTablet = AppLovinSdkUtils.isTablet(this);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.banner_ad_view_container);
        if (zIsTablet) {
            maxAdFormat = MaxAdFormat.LEADER;
            ((TextView) findViewById(R.id.banner_label)).setText("Leader");
            str = "test_mode_leader";
        } else {
            maxAdFormat = MaxAdFormat.BANNER;
            str = "test_mode_banner";
        }
        if (this.f20361a.r().contains(maxAdFormat)) {
            MaxAdView maxAdView = new MaxAdView(str, maxAdFormat, this.f20362b.y0(), this);
            this.f20363c = maxAdView;
            maxAdView.setExtraParameter("adaptive_banner", "false");
            this.f20363c.setExtraParameter("disable_auto_retries", "true");
            this.f20363c.setExtraParameter("disable_precache", "true");
            this.f20363c.setExtraParameter("allow_pause_auto_refresh_immediately", "true");
            this.f20363c.stopAutoRefresh();
            this.f20363c.setListener(this);
            frameLayout.addView(this.f20363c, new FrameLayout.LayoutParams(AppLovinSdkUtils.dpToPx(this, maxAdFormat.getSize().getWidth()), AppLovinSdkUtils.dpToPx(this, maxAdFormat.getSize().getHeight())));
            AdControlButton adControlButton = (AdControlButton) findViewById(R.id.banner_control_button);
            this.f20371l = adControlButton;
            adControlButton.setOnClickListener(this);
            this.f20371l.setFormat(maxAdFormat);
            return;
        }
        findViewById(R.id.banner_control_view).setVisibility(8);
        frameLayout.setVisibility(8);
    }

    private void b(MaxAdFormat maxAdFormat) {
        o.g("MaxDebuggerMultiAdActivity", "Showing test " + maxAdFormat.getDisplayName() + " Ad from " + this.f20361a.g());
        if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f20365e.showAd();
        } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f20366f.showAd();
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f20367g.showAd();
        }
    }

    private void a(MaxAdFormat maxAdFormat) {
        o.g("MaxDebuggerMultiAdActivity", "Loading test " + maxAdFormat.getDisplayName() + " Ad from " + this.f20361a.g());
        MaxAdFormat maxAdFormat2 = MaxAdFormat.BANNER;
        boolean z10 = false;
        boolean z11 = (maxAdFormat2 == maxAdFormat || MaxAdFormat.LEADER == maxAdFormat) && this.f20381v.isChecked();
        MaxAdFormat maxAdFormat3 = MaxAdFormat.MREC;
        if (maxAdFormat3 == maxAdFormat && this.f20382w.isChecked()) {
            z10 = true;
        }
        if (!z11 && !z10) {
            this.f20362b.s0().a(getTestModeNetwork(maxAdFormat));
        } else {
            this.f20362b.s0().a(this.f20361a.w());
        }
        if (maxAdFormat2 == maxAdFormat || MaxAdFormat.LEADER == maxAdFormat) {
            this.f20363c.loadAd();
            return;
        }
        if (maxAdFormat3 == maxAdFormat) {
            this.f20364d.loadAd();
            this.f20377r.callOnClick();
            return;
        }
        if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f20365e.loadAd();
            return;
        }
        if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f20366f.loadAd();
            return;
        }
        if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f20367g.loadAd();
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.i.loadAd();
            this.f20378s.callOnClick();
        }
    }

    private AdControlButton a(String str) {
        if (!str.equals("test_mode_banner") && !str.equals("test_mode_leader")) {
            if (str.equals("test_mode_mrec")) {
                return this.f20372m;
            }
            if (str.equals("test_mode_interstitial")) {
                return this.f20373n;
            }
            if (str.equals("test_mode_app_open")) {
                return this.f20374o;
            }
            if (str.equals(this.f20370k)) {
                return this.f20375p;
            }
            if (str.equals("test_mode_native")) {
                return this.f20376q;
            }
            throw new IllegalArgumentException("Invalid test mode ad unit identifier provided ".concat(str));
        }
        return this.f20371l;
    }
}
