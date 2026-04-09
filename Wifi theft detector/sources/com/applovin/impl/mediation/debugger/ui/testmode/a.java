package com.applovin.impl.mediation.debugger.ui.testmode;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Switch;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.amazon.device.ads.AdError;
import com.amazon.device.ads.AdRegistration;
import com.amazon.device.ads.DTBAdResponse;
import com.applovin.impl.e3;
import com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton;
import com.applovin.impl.n3;
import com.applovin.impl.n7;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.w;
import com.applovin.impl.x;
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
import com.applovin.mediation.nativeAds.MaxNativeAdViewBinder;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class a extends n3 implements MaxRewardedAdListener, MaxAdViewAdListener, AdControlButton.a, MaxAdRevenueListener, w.a {

    /* renamed from: a, reason: collision with root package name */
    private e3 f6753a;

    /* renamed from: b, reason: collision with root package name */
    private k f6754b;

    /* renamed from: c, reason: collision with root package name */
    private MaxAdView f6755c;

    /* renamed from: d, reason: collision with root package name */
    private MaxAdView f6756d;

    /* renamed from: e, reason: collision with root package name */
    private MaxInterstitialAd f6757e;

    /* renamed from: f, reason: collision with root package name */
    private MaxAppOpenAd f6758f;

    /* renamed from: g, reason: collision with root package name */
    private MaxRewardedAd f6759g;

    /* renamed from: h, reason: collision with root package name */
    private MaxAd f6760h;

    /* renamed from: i, reason: collision with root package name */
    private MaxNativeAdLoader f6761i;

    /* renamed from: j, reason: collision with root package name */
    private List f6762j;

    /* renamed from: k, reason: collision with root package name */
    private String f6763k;

    /* renamed from: l, reason: collision with root package name */
    private AdControlButton f6764l;

    /* renamed from: m, reason: collision with root package name */
    private AdControlButton f6765m;

    /* renamed from: n, reason: collision with root package name */
    private AdControlButton f6766n;

    /* renamed from: o, reason: collision with root package name */
    private AdControlButton f6767o;

    /* renamed from: p, reason: collision with root package name */
    private AdControlButton f6768p;

    /* renamed from: q, reason: collision with root package name */
    private AdControlButton f6769q;

    /* renamed from: r, reason: collision with root package name */
    private Button f6770r;

    /* renamed from: s, reason: collision with root package name */
    private Button f6771s;

    /* renamed from: t, reason: collision with root package name */
    private FrameLayout f6772t;

    /* renamed from: u, reason: collision with root package name */
    private FrameLayout f6773u;

    /* renamed from: v, reason: collision with root package name */
    private Switch f6774v;

    /* renamed from: w, reason: collision with root package name */
    private Switch f6775w;

    /* renamed from: x, reason: collision with root package name */
    private Map f6776x;

    /* renamed from: com.applovin.impl.mediation.debugger.ui.testmode.a$a, reason: collision with other inner class name */
    public class C0079a extends MaxNativeAdListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MaxNativeAdView f6777a;

        public C0079a(MaxNativeAdView maxNativeAdView) {
            this.f6777a = maxNativeAdView;
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
            if (a.this.f6760h != null) {
                a.this.f6761i.destroy(a.this.f6760h);
            }
            a.this.f6760h = maxAd;
            a.this.f6761i.render(this.f6777a, maxAd);
            a.this.f6773u.removeAllViews();
            a.this.f6773u.addView(this.f6777a);
            a.this.onAdLoaded(maxAd);
        }
    }

    private void e() {
        List listR = this.f6753a.r();
        MaxAdFormat maxAdFormat = MaxAdFormat.REWARDED;
        if (!listR.contains(maxAdFormat)) {
            findViewById(R.id.rewarded_control_view).setVisibility(8);
            return;
        }
        String str = "test_mode_rewarded_" + this.f6753a.m();
        this.f6763k = str;
        MaxRewardedAd maxRewardedAd = MaxRewardedAd.getInstance(str, this.f6754b.y0(), this);
        this.f6759g = maxRewardedAd;
        maxRewardedAd.setExtraParameter("disable_auto_retries", "true");
        this.f6759g.setListener(this);
        AdControlButton adControlButton = (AdControlButton) findViewById(R.id.rewarded_control_button);
        this.f6768p = adControlButton;
        adControlButton.setOnClickListener(this);
        this.f6768p.setFormat(maxAdFormat);
    }

    @Override // com.applovin.impl.n3
    public k getSdk() {
        return this.f6754b;
    }

    public String getTestModeNetwork(MaxAdFormat maxAdFormat) {
        return (this.f6753a.x() == null || !this.f6753a.x().containsKey(maxAdFormat)) ? this.f6753a.m() : (String) this.f6753a.x().get(maxAdFormat);
    }

    public void initialize(e3 e3Var) {
        this.f6753a = e3Var;
        this.f6754b = e3Var.o();
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdClicked(@NonNull MaxAd maxAd) {
        n7.a("onAdClicked", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public void onAdCollapsed(@NonNull MaxAd maxAd) {
        n7.a("onAdCollapsed", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayFailed(@NonNull MaxAd maxAd, @NonNull MaxError maxError) {
        a(maxAd.getAdUnitId()).setControlState(AdControlButton.b.LOAD);
        n7.a("Failed to display " + maxAd.getFormat().getDisplayName(), "MAX Error\nCode: " + maxError.getCode() + "\nMessage: " + maxError.getMessage() + "\n\n" + maxAd.getNetworkName() + " Display Error\nCode: " + maxError.getMediatedNetworkErrorCode() + "\nMessage: " + maxError.getMediatedNetworkErrorMessage(), this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayed(@NonNull MaxAd maxAd) {
        n7.a("onAdDisplayed", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public void onAdExpanded(@NonNull MaxAd maxAd) {
        n7.a("onAdExpanded", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdHidden(@NonNull MaxAd maxAd) {
        n7.a("onAdHidden", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoadFailed(@NonNull String str, @NonNull MaxError maxError) {
        AdControlButton adControlButtonA = a(str);
        adControlButtonA.setControlState(AdControlButton.b.LOAD);
        n7.a(maxError, adControlButtonA.getFormat().getLabel(), this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoaded(@NonNull MaxAd maxAd) {
        AdControlButton adControlButtonA = a(maxAd.getAdUnitId());
        if (maxAd.getFormat().isAdViewAd() || maxAd.getFormat().equals(MaxAdFormat.NATIVE)) {
            adControlButtonA.setControlState(AdControlButton.b.LOAD);
        } else {
            adControlButtonA.setControlState(AdControlButton.b.SHOW);
        }
    }

    @Override // com.applovin.impl.w.a
    public void onAdResponseLoaded(DTBAdResponse dTBAdResponse, MaxAdFormat maxAdFormat) {
        if (MaxAdFormat.BANNER == maxAdFormat || MaxAdFormat.LEADER == maxAdFormat) {
            this.f6755c.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.MREC == maxAdFormat) {
            this.f6756d.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f6757e.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f6758f.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f6759g.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.f6761i.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        }
        a(maxAdFormat);
    }

    @Override // com.applovin.mediation.MaxAdRevenueListener
    public void onAdRevenuePaid(@NonNull MaxAd maxAd) {
        n7.a("onAdRevenuePaid", maxAd, this);
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
        Map map = this.f6776x;
        if (map == null || map.get(format) == null) {
            a(format);
        } else {
            ((w) this.f6776x.get(format)).a();
        }
    }

    @Override // com.applovin.impl.n3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.f6753a == null) {
            o.h("MaxDebuggerMultiAdActivity", "Failed to initialize activity with a network model.");
            return;
        }
        setContentView(R.layout.mediation_debugger_multi_ad_activity);
        setTitle(this.f6753a.g() + " Test Ads");
        this.f6762j = this.f6754b.s0().b();
        a();
        c();
        b();
        e();
        d();
        findViewById(R.id.app_open_ad_control_view).setVisibility(8);
        this.f6770r = (Button) findViewById(R.id.show_mrec_button);
        this.f6771s = (Button) findViewById(R.id.show_native_button);
        if (this.f6753a.I() && this.f6753a.r().contains(MaxAdFormat.MREC)) {
            this.f6773u.setVisibility(8);
            this.f6770r.setBackgroundColor(-1);
            this.f6771s.setBackgroundColor(-3355444);
            this.f6770r.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.mediation.debugger.ui.testmode.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f6779a.a(view);
                }
            });
            this.f6771s.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.mediation.debugger.ui.testmode.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f6780a.b(view);
                }
            });
        } else {
            this.f6770r.setVisibility(8);
            this.f6771s.setVisibility(8);
        }
        this.f6774v = (Switch) findViewById(R.id.native_banner_switch);
        this.f6775w = (Switch) findViewById(R.id.native_mrec_switch);
        if (this.f6753a.J()) {
            this.f6774v.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.mediation.debugger.ui.testmode.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f6781a.c(view);
                }
            });
            this.f6775w.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.mediation.debugger.ui.testmode.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f6782a.d(view);
                }
            });
        } else {
            this.f6774v.setVisibility(8);
            this.f6775w.setVisibility(8);
        }
        if (!StringUtils.isValidString(this.f6753a.e()) || this.f6753a.d() == null || this.f6753a.d().size() <= 0) {
            return;
        }
        AdRegistration.getInstance(this.f6753a.e(), this);
        AdRegistration.enableTesting(true);
        AdRegistration.enableLogging(true);
        HashMap map = new HashMap(this.f6753a.d().size());
        for (MaxAdFormat maxAdFormat : this.f6753a.d().keySet()) {
            map.put(maxAdFormat, new w((x) this.f6753a.d().get(maxAdFormat), maxAdFormat, getApplicationContext(), this));
        }
        this.f6776x = map;
    }

    @Override // com.applovin.impl.n3, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f6754b.s0().a(this.f6762j);
        MaxAdView maxAdView = this.f6755c;
        if (maxAdView != null) {
            maxAdView.destroy();
        }
        MaxAdView maxAdView2 = this.f6756d;
        if (maxAdView2 != null) {
            maxAdView2.destroy();
        }
        MaxInterstitialAd maxInterstitialAd = this.f6757e;
        if (maxInterstitialAd != null) {
            maxInterstitialAd.destroy();
        }
        MaxRewardedAd maxRewardedAd = this.f6759g;
        if (maxRewardedAd != null) {
            maxRewardedAd.destroy();
        }
        MaxNativeAdLoader maxNativeAdLoader = this.f6761i;
        if (maxNativeAdLoader != null) {
            MaxAd maxAd = this.f6760h;
            if (maxAd != null) {
                maxNativeAdLoader.destroy(maxAd);
            }
            this.f6761i.destroy();
        }
    }

    @Override // com.applovin.mediation.MaxRewardedAdListener
    public void onUserRewarded(@NonNull MaxAd maxAd, @NonNull MaxReward maxReward) {
        n7.a("onUserRewarded", maxAd, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(View view) {
        this.f6756d.removeAllViews();
        this.f6765m.setControlState(AdControlButton.b.LOAD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        this.f6773u.setVisibility(0);
        this.f6772t.setVisibility(8);
        this.f6771s.setBackgroundColor(-1);
        this.f6770r.setBackgroundColor(-3355444);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        this.f6755c.removeAllViews();
        this.f6764l.setControlState(AdControlButton.b.LOAD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        this.f6772t.setVisibility(0);
        this.f6773u.setVisibility(8);
        this.f6770r.setBackgroundColor(-1);
        this.f6771s.setBackgroundColor(-3355444);
    }

    private void d() {
        this.f6773u = (FrameLayout) findViewById(R.id.native_ad_view_container);
        if (this.f6753a.I()) {
            MaxNativeAdView maxNativeAdView = new MaxNativeAdView(new MaxNativeAdViewBinder.Builder(R.layout.max_native_ad_template_1).setTitleTextViewId(R.id.applovin_native_title_text_view).setAdvertiserTextViewId(R.id.applovin_native_advertiser_text_view).setBodyTextViewId(R.id.applovin_native_body_text_view).setCallToActionButtonId(R.id.applovin_native_cta_button).setIconImageViewId(R.id.applovin_native_icon_image_view).setOptionsContentViewGroupId(R.id.applovin_native_options_view).setStarRatingContentViewGroupId(R.id.applovin_native_star_rating_view).setMediaContentViewGroupId(R.id.applovin_native_media_content_view).build(), this);
            MaxNativeAdLoader maxNativeAdLoader = new MaxNativeAdLoader("test_mode_native");
            this.f6761i = maxNativeAdLoader;
            maxNativeAdLoader.setExtraParameter("disable_auto_retries", "true");
            this.f6761i.setNativeAdListener(new C0079a(maxNativeAdView));
            this.f6761i.setRevenueListener(this);
            AdControlButton adControlButton = (AdControlButton) findViewById(R.id.native_control_button);
            this.f6769q = adControlButton;
            adControlButton.setOnClickListener(this);
            this.f6769q.setFormat(MaxAdFormat.NATIVE);
            return;
        }
        findViewById(R.id.native_control_view).setVisibility(8);
        this.f6773u.setVisibility(8);
    }

    @Override // com.applovin.impl.w.a
    public void onAdLoadFailed(AdError adError, MaxAdFormat maxAdFormat) {
        if (MaxAdFormat.BANNER != maxAdFormat && MaxAdFormat.LEADER != maxAdFormat) {
            if (MaxAdFormat.MREC == maxAdFormat) {
                this.f6756d.setLocalExtraParameter("amazon_ad_error", adError);
            } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
                this.f6757e.setLocalExtraParameter("amazon_ad_error", adError);
            } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
                this.f6758f.setLocalExtraParameter("amazon_ad_error", adError);
            } else if (MaxAdFormat.REWARDED == maxAdFormat) {
                this.f6759g.setLocalExtraParameter("amazon_ad_error", adError);
            } else if (MaxAdFormat.NATIVE == maxAdFormat) {
                this.f6761i.setLocalExtraParameter("amazon_ad_error", adError);
            }
        } else {
            this.f6755c.setLocalExtraParameter("amazon_ad_error", adError);
        }
        a(maxAdFormat);
    }

    private void c() {
        this.f6772t = (FrameLayout) findViewById(R.id.mrec_ad_view_container);
        List listR = this.f6753a.r();
        MaxAdFormat maxAdFormat = MaxAdFormat.MREC;
        if (listR.contains(maxAdFormat)) {
            MaxAdView maxAdView = new MaxAdView("test_mode_mrec", maxAdFormat, this.f6754b.y0(), this);
            this.f6756d = maxAdView;
            maxAdView.setExtraParameter("disable_auto_retries", "true");
            this.f6756d.setExtraParameter("disable_precache", "true");
            this.f6756d.setExtraParameter("allow_pause_auto_refresh_immediately", "true");
            this.f6756d.stopAutoRefresh();
            this.f6756d.setListener(this);
            this.f6772t.addView(this.f6756d, new FrameLayout.LayoutParams(-1, -1));
            AdControlButton adControlButton = (AdControlButton) findViewById(R.id.mrec_control_button);
            this.f6765m = adControlButton;
            adControlButton.setOnClickListener(this);
            this.f6765m.setFormat(maxAdFormat);
            return;
        }
        findViewById(R.id.mrec_control_view).setVisibility(8);
        this.f6772t.setVisibility(8);
    }

    private void b() {
        List listR = this.f6753a.r();
        MaxAdFormat maxAdFormat = MaxAdFormat.INTERSTITIAL;
        if (listR.contains(maxAdFormat)) {
            MaxInterstitialAd maxInterstitialAd = new MaxInterstitialAd("test_mode_interstitial", this.f6754b.y0(), this);
            this.f6757e = maxInterstitialAd;
            maxInterstitialAd.setExtraParameter("disable_auto_retries", "true");
            this.f6757e.setListener(this);
            AdControlButton adControlButton = (AdControlButton) findViewById(R.id.interstitial_control_button);
            this.f6766n = adControlButton;
            adControlButton.setOnClickListener(this);
            this.f6766n.setFormat(maxAdFormat);
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
        if (this.f6753a.r().contains(maxAdFormat)) {
            MaxAdView maxAdView = new MaxAdView(str, maxAdFormat, this.f6754b.y0(), this);
            this.f6755c = maxAdView;
            maxAdView.setExtraParameter("adaptive_banner", "false");
            this.f6755c.setExtraParameter("disable_auto_retries", "true");
            this.f6755c.setExtraParameter("disable_precache", "true");
            this.f6755c.setExtraParameter("allow_pause_auto_refresh_immediately", "true");
            this.f6755c.stopAutoRefresh();
            this.f6755c.setListener(this);
            frameLayout.addView(this.f6755c, new FrameLayout.LayoutParams(AppLovinSdkUtils.dpToPx(this, maxAdFormat.getSize().getWidth()), AppLovinSdkUtils.dpToPx(this, maxAdFormat.getSize().getHeight())));
            AdControlButton adControlButton = (AdControlButton) findViewById(R.id.banner_control_button);
            this.f6764l = adControlButton;
            adControlButton.setOnClickListener(this);
            this.f6764l.setFormat(maxAdFormat);
            return;
        }
        findViewById(R.id.banner_control_view).setVisibility(8);
        frameLayout.setVisibility(8);
    }

    private void b(MaxAdFormat maxAdFormat) {
        o.g("MaxDebuggerMultiAdActivity", "Showing test " + maxAdFormat.getDisplayName() + " Ad from " + this.f6753a.g());
        if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f6757e.showAd();
        } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f6758f.showAd();
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f6759g.showAd();
        }
    }

    private void a(MaxAdFormat maxAdFormat) {
        o.g("MaxDebuggerMultiAdActivity", "Loading test " + maxAdFormat.getDisplayName() + " Ad from " + this.f6753a.g());
        MaxAdFormat maxAdFormat2 = MaxAdFormat.BANNER;
        boolean z10 = false;
        boolean z11 = (maxAdFormat2 == maxAdFormat || MaxAdFormat.LEADER == maxAdFormat) && this.f6774v.isChecked();
        MaxAdFormat maxAdFormat3 = MaxAdFormat.MREC;
        if (maxAdFormat3 == maxAdFormat && this.f6775w.isChecked()) {
            z10 = true;
        }
        if (!z11 && !z10) {
            this.f6754b.s0().a(getTestModeNetwork(maxAdFormat));
        } else {
            this.f6754b.s0().a(this.f6753a.w());
        }
        if (maxAdFormat2 == maxAdFormat || MaxAdFormat.LEADER == maxAdFormat) {
            this.f6755c.loadAd();
            return;
        }
        if (maxAdFormat3 == maxAdFormat) {
            this.f6756d.loadAd();
            this.f6770r.callOnClick();
            return;
        }
        if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f6757e.loadAd();
            return;
        }
        if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f6758f.loadAd();
            return;
        }
        if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f6759g.loadAd();
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.f6761i.loadAd();
            this.f6771s.callOnClick();
        }
    }

    private AdControlButton a(String str) {
        if (!str.equals("test_mode_banner") && !str.equals("test_mode_leader")) {
            if (str.equals("test_mode_mrec")) {
                return this.f6765m;
            }
            if (str.equals("test_mode_interstitial")) {
                return this.f6766n;
            }
            if (str.equals("test_mode_app_open")) {
                return this.f6767o;
            }
            if (str.equals(this.f6763k)) {
                return this.f6768p;
            }
            if (str.equals("test_mode_native")) {
                return this.f6769q;
            }
            throw new IllegalArgumentException("Invalid test mode ad unit identifier provided " + str);
        }
        return this.f6764l;
    }
}
