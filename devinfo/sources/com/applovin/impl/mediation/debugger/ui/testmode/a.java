package com.applovin.impl.mediation.debugger.ui.testmode;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Switch;
import android.widget.TextView;
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

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class a extends n3 implements MaxRewardedAdListener, MaxAdViewAdListener, AdControlButton.a, MaxAdRevenueListener, w.a {

    /* renamed from: a, reason: collision with root package name */
    private e3 f4695a;

    /* renamed from: b, reason: collision with root package name */
    private k f4696b;

    /* renamed from: c, reason: collision with root package name */
    private MaxAdView f4697c;

    /* renamed from: d, reason: collision with root package name */
    private MaxAdView f4698d;

    /* renamed from: e, reason: collision with root package name */
    private MaxInterstitialAd f4699e;

    /* renamed from: f, reason: collision with root package name */
    private MaxAppOpenAd f4700f;
    private MaxRewardedAd g;

    /* renamed from: h, reason: collision with root package name */
    private MaxAd f4701h;

    /* renamed from: i, reason: collision with root package name */
    private MaxNativeAdLoader f4702i;
    private List j;

    /* renamed from: k, reason: collision with root package name */
    private String f4703k;

    /* renamed from: l, reason: collision with root package name */
    private AdControlButton f4704l;

    /* renamed from: m, reason: collision with root package name */
    private AdControlButton f4705m;

    /* renamed from: n, reason: collision with root package name */
    private AdControlButton f4706n;

    /* renamed from: o, reason: collision with root package name */
    private AdControlButton f4707o;

    /* renamed from: p, reason: collision with root package name */
    private AdControlButton f4708p;

    /* renamed from: q, reason: collision with root package name */
    private AdControlButton f4709q;

    /* renamed from: r, reason: collision with root package name */
    private Button f4710r;

    /* renamed from: s, reason: collision with root package name */
    private Button f4711s;

    /* renamed from: t, reason: collision with root package name */
    private FrameLayout f4712t;

    /* renamed from: u, reason: collision with root package name */
    private FrameLayout f4713u;

    /* renamed from: v, reason: collision with root package name */
    private Switch f4714v;

    /* renamed from: w, reason: collision with root package name */
    private Switch f4715w;

    /* renamed from: x, reason: collision with root package name */
    private Map f4716x;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    /* renamed from: com.applovin.impl.mediation.debugger.ui.testmode.a$a, reason: collision with other inner class name */
    public class C0015a extends MaxNativeAdListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MaxNativeAdView f4717a;

        public C0015a(MaxNativeAdView maxNativeAdView) {
            this.f4717a = maxNativeAdView;
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
            if (a.this.f4701h != null) {
                a.this.f4702i.destroy(a.this.f4701h);
            }
            a.this.f4701h = maxAd;
            a.this.f4702i.render(this.f4717a, maxAd);
            a.this.f4713u.removeAllViews();
            a.this.f4713u.addView(this.f4717a);
            a.this.onAdLoaded(maxAd);
        }
    }

    private void e() {
        List listR = this.f4695a.r();
        MaxAdFormat maxAdFormat = MaxAdFormat.REWARDED;
        if (!listR.contains(maxAdFormat)) {
            findViewById(R.id.rewarded_control_view).setVisibility(8);
            return;
        }
        String str = "test_mode_rewarded_" + this.f4695a.m();
        this.f4703k = str;
        MaxRewardedAd maxRewardedAd = MaxRewardedAd.getInstance(str, this.f4696b.y0(), this);
        this.g = maxRewardedAd;
        maxRewardedAd.setExtraParameter("disable_auto_retries", "true");
        this.g.setListener(this);
        AdControlButton adControlButton = (AdControlButton) findViewById(R.id.rewarded_control_button);
        this.f4708p = adControlButton;
        adControlButton.setOnClickListener(this);
        this.f4708p.setFormat(maxAdFormat);
    }

    @Override // com.applovin.impl.n3
    public k getSdk() {
        return this.f4696b;
    }

    public String getTestModeNetwork(MaxAdFormat maxAdFormat) {
        return (this.f4695a.x() == null || !this.f4695a.x().containsKey(maxAdFormat)) ? this.f4695a.m() : (String) this.f4695a.x().get(maxAdFormat);
    }

    public void initialize(e3 e3Var) {
        this.f4695a = e3Var;
        this.f4696b = e3Var.o();
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdClicked(MaxAd maxAd) {
        n7.a("onAdClicked", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public void onAdCollapsed(MaxAd maxAd) {
        n7.a("onAdCollapsed", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        a(maxAd.getAdUnitId()).setControlState(AdControlButton.b.LOAD);
        n7.a("Failed to display " + maxAd.getFormat().getDisplayName(), "MAX Error\nCode: " + maxError.getCode() + "\nMessage: " + maxError.getMessage() + "\n\n" + maxAd.getNetworkName() + " Display Error\nCode: " + maxError.getMediatedNetworkErrorCode() + "\nMessage: " + maxError.getMediatedNetworkErrorMessage(), this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayed(MaxAd maxAd) {
        n7.a("onAdDisplayed", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public void onAdExpanded(MaxAd maxAd) {
        n7.a("onAdExpanded", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdHidden(MaxAd maxAd) {
        n7.a("onAdHidden", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoadFailed(String str, MaxError maxError) {
        AdControlButton adControlButtonA = a(str);
        adControlButtonA.setControlState(AdControlButton.b.LOAD);
        n7.a(maxError, adControlButtonA.getFormat().getLabel(), this);
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

    @Override // com.applovin.impl.w.a
    public void onAdResponseLoaded(DTBAdResponse dTBAdResponse, MaxAdFormat maxAdFormat) {
        if (MaxAdFormat.BANNER == maxAdFormat || MaxAdFormat.LEADER == maxAdFormat) {
            this.f4697c.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.MREC == maxAdFormat) {
            this.f4698d.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f4699e.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f4700f.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.g.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.f4702i.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        }
        a(maxAdFormat);
    }

    @Override // com.applovin.mediation.MaxAdRevenueListener
    public void onAdRevenuePaid(MaxAd maxAd) {
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
        Map map = this.f4716x;
        if (map == null || map.get(format) == null) {
            a(format);
        } else {
            ((w) this.f4716x.get(format)).a();
        }
    }

    @Override // com.applovin.impl.n3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.f4695a == null) {
            o.h("MaxDebuggerMultiAdActivity", "Failed to initialize activity with a network model.");
            return;
        }
        setContentView(R.layout.mediation_debugger_multi_ad_activity);
        setTitle(this.f4695a.g() + " Test Ads");
        this.j = this.f4696b.s0().b();
        a();
        c();
        b();
        e();
        d();
        findViewById(R.id.app_open_ad_control_view).setVisibility(8);
        this.f4710r = (Button) findViewById(R.id.show_mrec_button);
        this.f4711s = (Button) findViewById(R.id.show_native_button);
        if (this.f4695a.I() && this.f4695a.r().contains(MaxAdFormat.MREC)) {
            this.f4713u.setVisibility(8);
            this.f4710r.setBackgroundColor(-1);
            this.f4711s.setBackgroundColor(-3355444);
            final int i4 = 0;
            this.f4710r.setOnClickListener(new View.OnClickListener(this) { // from class: com.applovin.impl.mediation.debugger.ui.testmode.b

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ a f4720b;

                {
                    this.f4720b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i4) {
                        case 0:
                            this.f4720b.a(view);
                            break;
                        case 1:
                            this.f4720b.b(view);
                            break;
                        case 2:
                            this.f4720b.c(view);
                            break;
                        default:
                            this.f4720b.d(view);
                            break;
                    }
                }
            });
            final int i10 = 1;
            this.f4711s.setOnClickListener(new View.OnClickListener(this) { // from class: com.applovin.impl.mediation.debugger.ui.testmode.b

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ a f4720b;

                {
                    this.f4720b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            this.f4720b.a(view);
                            break;
                        case 1:
                            this.f4720b.b(view);
                            break;
                        case 2:
                            this.f4720b.c(view);
                            break;
                        default:
                            this.f4720b.d(view);
                            break;
                    }
                }
            });
        } else {
            this.f4710r.setVisibility(8);
            this.f4711s.setVisibility(8);
        }
        this.f4714v = (Switch) findViewById(R.id.native_banner_switch);
        this.f4715w = (Switch) findViewById(R.id.native_mrec_switch);
        if (this.f4695a.J()) {
            final int i11 = 2;
            this.f4714v.setOnClickListener(new View.OnClickListener(this) { // from class: com.applovin.impl.mediation.debugger.ui.testmode.b

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ a f4720b;

                {
                    this.f4720b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i11) {
                        case 0:
                            this.f4720b.a(view);
                            break;
                        case 1:
                            this.f4720b.b(view);
                            break;
                        case 2:
                            this.f4720b.c(view);
                            break;
                        default:
                            this.f4720b.d(view);
                            break;
                    }
                }
            });
            final int i12 = 3;
            this.f4715w.setOnClickListener(new View.OnClickListener(this) { // from class: com.applovin.impl.mediation.debugger.ui.testmode.b

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ a f4720b;

                {
                    this.f4720b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i12) {
                        case 0:
                            this.f4720b.a(view);
                            break;
                        case 1:
                            this.f4720b.b(view);
                            break;
                        case 2:
                            this.f4720b.c(view);
                            break;
                        default:
                            this.f4720b.d(view);
                            break;
                    }
                }
            });
        } else {
            this.f4714v.setVisibility(8);
            this.f4715w.setVisibility(8);
        }
        if (!StringUtils.isValidString(this.f4695a.e()) || this.f4695a.d() == null || this.f4695a.d().size() <= 0) {
            return;
        }
        AdRegistration.getInstance(this.f4695a.e(), this);
        AdRegistration.enableTesting(true);
        AdRegistration.enableLogging(true);
        HashMap map = new HashMap(this.f4695a.d().size());
        for (MaxAdFormat maxAdFormat : this.f4695a.d().keySet()) {
            map.put(maxAdFormat, new w((x) this.f4695a.d().get(maxAdFormat), maxAdFormat, getApplicationContext(), this));
        }
        this.f4716x = map;
    }

    @Override // com.applovin.impl.n3, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f4696b.s0().a(this.j);
        MaxAdView maxAdView = this.f4697c;
        if (maxAdView != null) {
            maxAdView.destroy();
        }
        MaxAdView maxAdView2 = this.f4698d;
        if (maxAdView2 != null) {
            maxAdView2.destroy();
        }
        MaxInterstitialAd maxInterstitialAd = this.f4699e;
        if (maxInterstitialAd != null) {
            maxInterstitialAd.destroy();
        }
        MaxRewardedAd maxRewardedAd = this.g;
        if (maxRewardedAd != null) {
            maxRewardedAd.destroy();
        }
        MaxNativeAdLoader maxNativeAdLoader = this.f4702i;
        if (maxNativeAdLoader != null) {
            MaxAd maxAd = this.f4701h;
            if (maxAd != null) {
                maxNativeAdLoader.destroy(maxAd);
            }
            this.f4702i.destroy();
        }
    }

    @Override // com.applovin.mediation.MaxRewardedAdListener
    public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
        n7.a("onUserRewarded", maxAd, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(View view) {
        this.f4698d.removeAllViews();
        this.f4705m.setControlState(AdControlButton.b.LOAD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        this.f4713u.setVisibility(0);
        this.f4712t.setVisibility(8);
        this.f4711s.setBackgroundColor(-1);
        this.f4710r.setBackgroundColor(-3355444);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        this.f4697c.removeAllViews();
        this.f4704l.setControlState(AdControlButton.b.LOAD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        this.f4712t.setVisibility(0);
        this.f4713u.setVisibility(8);
        this.f4710r.setBackgroundColor(-1);
        this.f4711s.setBackgroundColor(-3355444);
    }

    private void d() {
        this.f4713u = (FrameLayout) findViewById(R.id.native_ad_view_container);
        if (this.f4695a.I()) {
            MaxNativeAdView maxNativeAdView = new MaxNativeAdView(new MaxNativeAdViewBinder.Builder(R.layout.max_native_ad_template_1).setTitleTextViewId(R.id.applovin_native_title_text_view).setAdvertiserTextViewId(R.id.applovin_native_advertiser_text_view).setBodyTextViewId(R.id.applovin_native_body_text_view).setCallToActionButtonId(R.id.applovin_native_cta_button).setIconImageViewId(R.id.applovin_native_icon_image_view).setOptionsContentViewGroupId(R.id.applovin_native_options_view).setStarRatingContentViewGroupId(R.id.applovin_native_star_rating_view).setMediaContentViewGroupId(R.id.applovin_native_media_content_view).build(), this);
            MaxNativeAdLoader maxNativeAdLoader = new MaxNativeAdLoader("test_mode_native");
            this.f4702i = maxNativeAdLoader;
            maxNativeAdLoader.setExtraParameter("disable_auto_retries", "true");
            this.f4702i.setNativeAdListener(new C0015a(maxNativeAdView));
            this.f4702i.setRevenueListener(this);
            AdControlButton adControlButton = (AdControlButton) findViewById(R.id.native_control_button);
            this.f4709q = adControlButton;
            adControlButton.setOnClickListener(this);
            this.f4709q.setFormat(MaxAdFormat.NATIVE);
            return;
        }
        findViewById(R.id.native_control_view).setVisibility(8);
        this.f4713u.setVisibility(8);
    }

    @Override // com.applovin.impl.w.a
    public void onAdLoadFailed(AdError adError, MaxAdFormat maxAdFormat) {
        if (MaxAdFormat.BANNER != maxAdFormat && MaxAdFormat.LEADER != maxAdFormat) {
            if (MaxAdFormat.MREC == maxAdFormat) {
                this.f4698d.setLocalExtraParameter("amazon_ad_error", adError);
            } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
                this.f4699e.setLocalExtraParameter("amazon_ad_error", adError);
            } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
                this.f4700f.setLocalExtraParameter("amazon_ad_error", adError);
            } else if (MaxAdFormat.REWARDED == maxAdFormat) {
                this.g.setLocalExtraParameter("amazon_ad_error", adError);
            } else if (MaxAdFormat.NATIVE == maxAdFormat) {
                this.f4702i.setLocalExtraParameter("amazon_ad_error", adError);
            }
        } else {
            this.f4697c.setLocalExtraParameter("amazon_ad_error", adError);
        }
        a(maxAdFormat);
    }

    private void c() {
        this.f4712t = (FrameLayout) findViewById(R.id.mrec_ad_view_container);
        List listR = this.f4695a.r();
        MaxAdFormat maxAdFormat = MaxAdFormat.MREC;
        if (listR.contains(maxAdFormat)) {
            MaxAdView maxAdView = new MaxAdView("test_mode_mrec", maxAdFormat, this.f4696b.y0(), this);
            this.f4698d = maxAdView;
            maxAdView.setExtraParameter("disable_auto_retries", "true");
            this.f4698d.setExtraParameter("disable_precache", "true");
            this.f4698d.setExtraParameter("allow_pause_auto_refresh_immediately", "true");
            this.f4698d.stopAutoRefresh();
            this.f4698d.setListener(this);
            this.f4712t.addView(this.f4698d, new FrameLayout.LayoutParams(-1, -1));
            AdControlButton adControlButton = (AdControlButton) findViewById(R.id.mrec_control_button);
            this.f4705m = adControlButton;
            adControlButton.setOnClickListener(this);
            this.f4705m.setFormat(maxAdFormat);
            return;
        }
        findViewById(R.id.mrec_control_view).setVisibility(8);
        this.f4712t.setVisibility(8);
    }

    private void b() {
        List listR = this.f4695a.r();
        MaxAdFormat maxAdFormat = MaxAdFormat.INTERSTITIAL;
        if (listR.contains(maxAdFormat)) {
            MaxInterstitialAd maxInterstitialAd = new MaxInterstitialAd("test_mode_interstitial", this.f4696b.y0(), this);
            this.f4699e = maxInterstitialAd;
            maxInterstitialAd.setExtraParameter("disable_auto_retries", "true");
            this.f4699e.setListener(this);
            AdControlButton adControlButton = (AdControlButton) findViewById(R.id.interstitial_control_button);
            this.f4706n = adControlButton;
            adControlButton.setOnClickListener(this);
            this.f4706n.setFormat(maxAdFormat);
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
        if (this.f4695a.r().contains(maxAdFormat)) {
            MaxAdView maxAdView = new MaxAdView(str, maxAdFormat, this.f4696b.y0(), this);
            this.f4697c = maxAdView;
            maxAdView.setExtraParameter("adaptive_banner", "false");
            this.f4697c.setExtraParameter("disable_auto_retries", "true");
            this.f4697c.setExtraParameter("disable_precache", "true");
            this.f4697c.setExtraParameter("allow_pause_auto_refresh_immediately", "true");
            this.f4697c.stopAutoRefresh();
            this.f4697c.setListener(this);
            frameLayout.addView(this.f4697c, new FrameLayout.LayoutParams(AppLovinSdkUtils.dpToPx(this, maxAdFormat.getSize().getWidth()), AppLovinSdkUtils.dpToPx(this, maxAdFormat.getSize().getHeight())));
            AdControlButton adControlButton = (AdControlButton) findViewById(R.id.banner_control_button);
            this.f4704l = adControlButton;
            adControlButton.setOnClickListener(this);
            this.f4704l.setFormat(maxAdFormat);
            return;
        }
        findViewById(R.id.banner_control_view).setVisibility(8);
        frameLayout.setVisibility(8);
    }

    private void b(MaxAdFormat maxAdFormat) {
        o.g("MaxDebuggerMultiAdActivity", "Showing test " + maxAdFormat.getDisplayName() + " Ad from " + this.f4695a.g());
        if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f4699e.showAd();
        } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f4700f.showAd();
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.g.showAd();
        }
    }

    private void a(MaxAdFormat maxAdFormat) {
        o.g("MaxDebuggerMultiAdActivity", "Loading test " + maxAdFormat.getDisplayName() + " Ad from " + this.f4695a.g());
        MaxAdFormat maxAdFormat2 = MaxAdFormat.BANNER;
        boolean z3 = false;
        boolean z10 = (maxAdFormat2 == maxAdFormat || MaxAdFormat.LEADER == maxAdFormat) && this.f4714v.isChecked();
        MaxAdFormat maxAdFormat3 = MaxAdFormat.MREC;
        if (maxAdFormat3 == maxAdFormat && this.f4715w.isChecked()) {
            z3 = true;
        }
        if (!z10 && !z3) {
            this.f4696b.s0().a(getTestModeNetwork(maxAdFormat));
        } else {
            this.f4696b.s0().a(this.f4695a.w());
        }
        if (maxAdFormat2 == maxAdFormat || MaxAdFormat.LEADER == maxAdFormat) {
            this.f4697c.loadAd();
            return;
        }
        if (maxAdFormat3 == maxAdFormat) {
            this.f4698d.loadAd();
            this.f4710r.callOnClick();
            return;
        }
        if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f4699e.loadAd();
            return;
        }
        if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f4700f.loadAd();
            return;
        }
        if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.g.loadAd();
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.f4702i.loadAd();
            this.f4711s.callOnClick();
        }
    }

    private AdControlButton a(String str) {
        if (!str.equals("test_mode_banner") && !str.equals("test_mode_leader")) {
            if (str.equals("test_mode_mrec")) {
                return this.f4705m;
            }
            if (str.equals("test_mode_interstitial")) {
                return this.f4706n;
            }
            if (str.equals("test_mode_app_open")) {
                return this.f4707o;
            }
            if (str.equals(this.f4703k)) {
                return this.f4708p;
            }
            if (str.equals("test_mode_native")) {
                return this.f4709q;
            }
            throw new IllegalArgumentException("Invalid test mode ad unit identifier provided ".concat(str));
        }
        return this.f4704l;
    }
}
