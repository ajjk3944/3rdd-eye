package com.applovin.impl;

import android.content.DialogInterface;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.amazon.device.ads.AdError;
import com.amazon.device.ads.DTBAdResponse;
import com.applovin.impl.m;
import com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton;
import com.applovin.impl.w;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxDebuggerAdUnitDetailActivity;
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
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class l extends n3 implements AdControlButton.a, MaxRewardedAdListener, MaxAdViewAdListener, MaxAdRevenueListener, w.a {

    /* renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.k f4385a;

    /* renamed from: b, reason: collision with root package name */
    private n f4386b;

    /* renamed from: c, reason: collision with root package name */
    private i8 f4387c;

    /* renamed from: d, reason: collision with root package name */
    private m f4388d;

    /* renamed from: e, reason: collision with root package name */
    private MaxAdView f4389e;

    /* renamed from: f, reason: collision with root package name */
    private MaxInterstitialAd f4390f;
    private MaxAppOpenAd g;

    /* renamed from: h, reason: collision with root package name */
    private MaxRewardedAd f4391h;

    /* renamed from: i, reason: collision with root package name */
    private MaxNativeAdView f4392i;
    private MaxNativeAdLoader j;

    /* renamed from: k, reason: collision with root package name */
    private MaxAd f4393k;

    /* renamed from: l, reason: collision with root package name */
    private r f4394l;

    /* renamed from: m, reason: collision with root package name */
    private List f4395m;

    /* renamed from: n, reason: collision with root package name */
    private ListView f4396n;

    /* renamed from: o, reason: collision with root package name */
    private View f4397o;

    /* renamed from: p, reason: collision with root package name */
    private AdControlButton f4398p;

    /* renamed from: q, reason: collision with root package name */
    private TextView f4399q;

    /* renamed from: r, reason: collision with root package name */
    private w f4400r;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class a extends MaxNativeAdListener {
        public a() {
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdClicked(MaxAd maxAd) {
            l.this.onAdClicked(maxAd);
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdLoadFailed(String str, MaxError maxError) {
            l.this.onAdLoadFailed(str, maxError);
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdLoaded(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
            if (l.this.f4393k != null) {
                l.this.j.destroy(l.this.f4393k);
            }
            l.this.f4393k = maxAd;
            l.this.j.render(l.this.f4392i, maxAd);
            l.this.onAdLoaded(maxAd);
        }
    }

    @Override // com.applovin.impl.n3
    public com.applovin.impl.sdk.k getSdk() {
        return this.f4385a;
    }

    public void initialize(n nVar, o oVar, i8 i8Var, com.applovin.impl.sdk.k kVar) {
        List listA;
        this.f4385a = kVar;
        this.f4386b = nVar;
        this.f4387c = i8Var;
        this.f4395m = kVar.s0().b();
        m mVar = new m(nVar, oVar, i8Var, this);
        this.f4388d = mVar;
        mVar.a(new r9(this, kVar, nVar, oVar));
        b();
        if (nVar.f().f()) {
            if ((i8Var != null && !i8Var.b().d().C()) || (listA = kVar.U().a(nVar.c())) == null || listA.isEmpty()) {
                return;
            }
            this.f4400r = new w(listA, nVar.a(), getApplicationContext(), this);
        }
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
        this.f4398p.setControlState(AdControlButton.b.LOAD);
        this.f4399q.setText("");
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
        this.f4398p.setControlState(AdControlButton.b.LOAD);
        this.f4399q.setText("");
        if (204 == maxError.getCode()) {
            n7.a("No Fill", "No fills often happen in live environments. Please make sure to use the Mediation Debugger test mode before you go live.", this);
            return;
        }
        n7.a("", "Failed to load with error code: " + maxError.getCode(), this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoaded(MaxAd maxAd) {
        this.f4399q.setText(maxAd.getNetworkName() + " ad loaded");
        this.f4398p.setControlState(AdControlButton.b.SHOW);
        if (maxAd.getFormat().isAdViewAd()) {
            a(this.f4389e, maxAd.getFormat().getSize());
        } else if (MaxAdFormat.NATIVE == this.f4386b.a()) {
            a(this.f4392i, MaxAdFormat.MREC.getSize());
        }
    }

    @Override // com.applovin.impl.w.a
    public void onAdResponseLoaded(DTBAdResponse dTBAdResponse, MaxAdFormat maxAdFormat) {
        if (maxAdFormat.isAdViewAd()) {
            this.f4389e.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f4390f.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.g.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f4391h.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.j.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        }
        a(maxAdFormat);
    }

    @Override // com.applovin.mediation.MaxAdRevenueListener
    public void onAdRevenuePaid(MaxAd maxAd) {
        n7.a("onAdRevenuePaid", maxAd, this);
    }

    @Override // com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton.a
    public void onClick(AdControlButton adControlButton) {
        if (this.f4385a.s0().c()) {
            n7.a("Not Supported", "Ad loads are not supported while Test Mode is enabled. Please restart the app.", this);
            return;
        }
        if (this.f4388d.j() != this.f4386b.f()) {
            n7.a("Not Supported", "You cannot load an ad from this waterfall because it does not target the current device. To load an ad, please select the targeted waterfall.", this);
            return;
        }
        MaxAdFormat maxAdFormatA = this.f4386b.a();
        AdControlButton.b bVar = AdControlButton.b.LOAD;
        if (bVar == adControlButton.getControlState()) {
            adControlButton.setControlState(AdControlButton.b.LOADING);
            w wVar = this.f4400r;
            if (wVar != null) {
                wVar.a();
                return;
            } else {
                a(maxAdFormatA);
                return;
            }
        }
        if (AdControlButton.b.SHOW == adControlButton.getControlState()) {
            if (!maxAdFormatA.isAdViewAd() && maxAdFormatA != MaxAdFormat.NATIVE) {
                adControlButton.setControlState(bVar);
            }
            b(maxAdFormatA);
        }
    }

    @Override // com.applovin.impl.n3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_ad_unit_detail_activity);
        setTitle(this.f4388d.k());
        this.f4396n = (ListView) findViewById(R.id.listView);
        this.f4397o = findViewById(R.id.ad_presenter_view);
        this.f4398p = (AdControlButton) findViewById(R.id.ad_control_button);
        this.f4399q = (TextView) findViewById(R.id.status_textview);
        this.f4396n.setAdapter((ListAdapter) this.f4388d);
        this.f4399q.setText(a());
        this.f4399q.setTypeface(Typeface.DEFAULT_BOLD);
        this.f4398p.setOnClickListener(this);
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setPadding(0, 10, 0, 0);
        shapeDrawable.getPaint().setColor(-1);
        shapeDrawable.getPaint().setShadowLayer(10, 0.0f, -10, 855638016);
        shapeDrawable.setShape(new RectShape());
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable});
        layerDrawable.setLayerInset(0, 0, 10, 0, 0);
        this.f4397o.setBackground(layerDrawable);
    }

    @Override // com.applovin.impl.n3, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (this.f4387c != null) {
            this.f4385a.s0().a(this.f4395m);
        }
        MaxAdView maxAdView = this.f4389e;
        if (maxAdView != null) {
            maxAdView.destroy();
        }
        MaxInterstitialAd maxInterstitialAd = this.f4390f;
        if (maxInterstitialAd != null) {
            maxInterstitialAd.destroy();
        }
        MaxAppOpenAd maxAppOpenAd = this.g;
        if (maxAppOpenAd != null) {
            maxAppOpenAd.destroy();
        }
        MaxRewardedAd maxRewardedAd = this.f4391h;
        if (maxRewardedAd != null) {
            maxRewardedAd.destroy();
        }
        MaxNativeAdLoader maxNativeAdLoader = this.j;
        if (maxNativeAdLoader != null) {
            MaxAd maxAd = this.f4393k;
            if (maxAd != null) {
                maxNativeAdLoader.destroy(maxAd);
            }
            this.j.destroy();
        }
    }

    @Override // com.applovin.mediation.MaxRewardedAdListener
    public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
        n7.a("onUserRewarded", maxAd, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.sdk.k kVar, n nVar, o oVar, j2 j2Var, r2 r2Var) {
        if (r2Var instanceof m.b) {
            d.a(this, MaxDebuggerAdUnitDetailActivity.class, kVar.e(), new r9(r2Var, nVar, oVar, kVar));
        }
    }

    private void b() {
        String strC = this.f4386b.c();
        if (this.f4386b.a().isAdViewAd()) {
            MaxAdView maxAdView = new MaxAdView(strC, this.f4386b.a());
            this.f4389e = maxAdView;
            maxAdView.setExtraParameter("adaptive_banner", "false");
            this.f4389e.setExtraParameter("disable_auto_retries", "true");
            this.f4389e.setExtraParameter("disable_precache", "true");
            this.f4389e.setExtraParameter("allow_pause_auto_refresh_immediately", "true");
            this.f4389e.stopAutoRefresh();
            this.f4389e.setListener(this);
            return;
        }
        if (MaxAdFormat.INTERSTITIAL == this.f4386b.a()) {
            MaxInterstitialAd maxInterstitialAd = new MaxInterstitialAd(strC);
            this.f4390f = maxInterstitialAd;
            maxInterstitialAd.setExtraParameter("disable_auto_retries", "true");
            this.f4390f.setListener(this);
            return;
        }
        if (MaxAdFormat.APP_OPEN == this.f4386b.a()) {
            MaxAppOpenAd maxAppOpenAd = new MaxAppOpenAd(strC);
            this.g = maxAppOpenAd;
            maxAppOpenAd.setExtraParameter("disable_auto_retries", "true");
            this.g.setListener(this);
            return;
        }
        if (MaxAdFormat.REWARDED == this.f4386b.a()) {
            MaxRewardedAd maxRewardedAd = MaxRewardedAd.getInstance(strC);
            this.f4391h = maxRewardedAd;
            maxRewardedAd.setExtraParameter("disable_auto_retries", "true");
            this.f4391h.setListener(this);
            return;
        }
        if (MaxAdFormat.NATIVE == this.f4386b.a()) {
            this.f4392i = new MaxNativeAdView(new MaxNativeAdViewBinder.Builder(R.layout.max_native_ad_template_1).setTitleTextViewId(R.id.applovin_native_title_text_view).setAdvertiserTextViewId(R.id.applovin_native_advertiser_text_view).setBodyTextViewId(R.id.applovin_native_body_text_view).setCallToActionButtonId(R.id.applovin_native_cta_button).setIconImageViewId(R.id.applovin_native_icon_image_view).setOptionsContentViewGroupId(R.id.applovin_native_options_view).setStarRatingContentViewGroupId(R.id.applovin_native_star_rating_view).setMediaContentViewGroupId(R.id.applovin_native_media_content_view).build(), com.applovin.impl.sdk.k.o());
            MaxNativeAdLoader maxNativeAdLoader = new MaxNativeAdLoader(strC);
            this.j = maxNativeAdLoader;
            maxNativeAdLoader.setExtraParameter("disable_auto_retries", "true");
            this.j.setNativeAdListener(new a());
            this.j.setRevenueListener(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(r2 r2Var, n nVar, o oVar, com.applovin.impl.sdk.k kVar, MaxDebuggerAdUnitDetailActivity maxDebuggerAdUnitDetailActivity) {
        maxDebuggerAdUnitDetailActivity.initialize(nVar, oVar, ((m.b) r2Var).v(), kVar);
    }

    @Override // com.applovin.impl.w.a
    public void onAdLoadFailed(AdError adError, MaxAdFormat maxAdFormat) {
        if (maxAdFormat.isAdViewAd()) {
            this.f4389e.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f4390f.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.g.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f4391h.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.j.setLocalExtraParameter("amazon_ad_error", adError);
        }
        a(maxAdFormat);
    }

    private void a(MaxAdFormat maxAdFormat) {
        StringBuilder sb2 = new StringBuilder("Loading live ");
        sb2.append(maxAdFormat.getDisplayName());
        sb2.append(" Ad from ");
        i8 i8Var = this.f4387c;
        sb2.append(i8Var != null ? i8Var.b().a() : this.f4388d.j().c());
        com.applovin.impl.sdk.o.g("MaxDebuggerAdUnitDetailActivity", sb2.toString());
        if (this.f4387c != null) {
            this.f4385a.s0().a(this.f4387c.b().b());
        }
        if (maxAdFormat.isAdViewAd()) {
            this.f4389e.setPlacement("[Mediation Debugger Live Ad]");
            this.f4389e.loadAd();
            return;
        }
        if (MaxAdFormat.INTERSTITIAL == this.f4386b.a()) {
            this.f4390f.loadAd();
            return;
        }
        if (MaxAdFormat.APP_OPEN == this.f4386b.a()) {
            this.g.loadAd();
            return;
        }
        if (MaxAdFormat.REWARDED == this.f4386b.a()) {
            this.f4391h.loadAd();
        } else if (MaxAdFormat.NATIVE == this.f4386b.a()) {
            this.j.setPlacement("[Mediation Debugger Live Ad]");
            this.j.loadAd();
        } else {
            n7.a("Live ads currently unavailable for ad format", this);
        }
    }

    private void a(ViewGroup viewGroup, AppLovinSdkUtils.Size size) {
        if (this.f4394l != null) {
            return;
        }
        r rVar = new r(viewGroup, size, this);
        this.f4394l = rVar;
        rVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.applovin.impl.q9
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f5176a.a(dialogInterface);
            }
        });
        this.f4394l.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(DialogInterface dialogInterface) {
        this.f4394l = null;
    }

    private String a() {
        if (this.f4385a.s0().c()) {
            return "Not supported while Test Mode is enabled";
        }
        if (this.f4388d.j() != this.f4386b.f()) {
            return "This waterfall is not targeted for the current device";
        }
        return "Tap to load an ad";
    }

    private void b(MaxAdFormat maxAdFormat) {
        StringBuilder sb2 = new StringBuilder("Showing live ");
        sb2.append(maxAdFormat.getDisplayName());
        sb2.append(" Ad from ");
        i8 i8Var = this.f4387c;
        sb2.append(i8Var != null ? i8Var.b().a() : this.f4388d.j().c());
        com.applovin.impl.sdk.o.g("MaxDebuggerAdUnitDetailActivity", sb2.toString());
        if (maxAdFormat.isAdViewAd()) {
            a(this.f4389e, maxAdFormat.getSize());
            return;
        }
        if (MaxAdFormat.INTERSTITIAL == this.f4386b.a()) {
            this.f4390f.showAd("[Mediation Debugger Live Ad]");
            return;
        }
        if (MaxAdFormat.APP_OPEN == this.f4386b.a()) {
            this.g.showAd("[Mediation Debugger Live Ad]");
        } else if (MaxAdFormat.REWARDED == this.f4386b.a()) {
            this.f4391h.showAd("[Mediation Debugger Live Ad]");
        } else if (MaxAdFormat.NATIVE == this.f4386b.a()) {
            a(this.f4392i, MaxAdFormat.MREC.getSize());
        }
    }
}
