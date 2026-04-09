package com.applovin.impl;

import android.app.Activity;
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
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.device.ads.AdError;
import com.amazon.device.ads.DTBAdResponse;
import com.applovin.impl.d;
import com.applovin.impl.m;
import com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton;
import com.applovin.impl.s2;
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

/* loaded from: classes.dex */
public abstract class l extends n3 implements AdControlButton.a, MaxRewardedAdListener, MaxAdViewAdListener, MaxAdRevenueListener, w.a {

    /* renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.k f6350a;

    /* renamed from: b, reason: collision with root package name */
    private n f6351b;

    /* renamed from: c, reason: collision with root package name */
    private i8 f6352c;

    /* renamed from: d, reason: collision with root package name */
    private m f6353d;

    /* renamed from: e, reason: collision with root package name */
    private MaxAdView f6354e;

    /* renamed from: f, reason: collision with root package name */
    private MaxInterstitialAd f6355f;

    /* renamed from: g, reason: collision with root package name */
    private MaxAppOpenAd f6356g;

    /* renamed from: h, reason: collision with root package name */
    private MaxRewardedAd f6357h;

    /* renamed from: i, reason: collision with root package name */
    private MaxNativeAdView f6358i;

    /* renamed from: j, reason: collision with root package name */
    private MaxNativeAdLoader f6359j;

    /* renamed from: k, reason: collision with root package name */
    private MaxAd f6360k;

    /* renamed from: l, reason: collision with root package name */
    private r f6361l;

    /* renamed from: m, reason: collision with root package name */
    private List f6362m;

    /* renamed from: n, reason: collision with root package name */
    private ListView f6363n;

    /* renamed from: o, reason: collision with root package name */
    private View f6364o;

    /* renamed from: p, reason: collision with root package name */
    private AdControlButton f6365p;

    /* renamed from: q, reason: collision with root package name */
    private TextView f6366q;

    /* renamed from: r, reason: collision with root package name */
    private w f6367r;

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
            if (l.this.f6360k != null) {
                l.this.f6359j.destroy(l.this.f6360k);
            }
            l.this.f6360k = maxAd;
            l.this.f6359j.render(l.this.f6358i, maxAd);
            l.this.onAdLoaded(maxAd);
        }
    }

    @Override // com.applovin.impl.n3
    public com.applovin.impl.sdk.k getSdk() {
        return this.f6350a;
    }

    public void initialize(final n nVar, @Nullable final o oVar, @Nullable i8 i8Var, final com.applovin.impl.sdk.k kVar) {
        List listA;
        this.f6350a = kVar;
        this.f6351b = nVar;
        this.f6352c = i8Var;
        this.f6362m = kVar.s0().b();
        m mVar = new m(nVar, oVar, i8Var, this);
        this.f6353d = mVar;
        mVar.a(new s2.a() { // from class: com.applovin.impl.pb
            @Override // com.applovin.impl.s2.a
            public final void a(j2 j2Var, r2 r2Var) {
                this.f7273a.a(kVar, nVar, oVar, j2Var, r2Var);
            }
        });
        b();
        if (nVar.f().f()) {
            if ((i8Var != null && !i8Var.b().d().C()) || (listA = kVar.U().a(nVar.c())) == null || listA.isEmpty()) {
                return;
            }
            this.f6367r = new w(listA, nVar.a(), getApplicationContext(), this);
        }
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
    public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        this.f6365p.setControlState(AdControlButton.b.LOAD);
        this.f6366q.setText("");
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
        this.f6365p.setControlState(AdControlButton.b.LOAD);
        this.f6366q.setText("");
        if (204 == maxError.getCode()) {
            n7.a("No Fill", "No fills often happen in live environments. Please make sure to use the Mediation Debugger test mode before you go live.", this);
            return;
        }
        n7.a("", "Failed to load with error code: " + maxError.getCode(), this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoaded(@NonNull MaxAd maxAd) {
        this.f6366q.setText(maxAd.getNetworkName() + " ad loaded");
        this.f6365p.setControlState(AdControlButton.b.SHOW);
        if (maxAd.getFormat().isAdViewAd()) {
            a(this.f6354e, maxAd.getFormat().getSize());
        } else if (MaxAdFormat.NATIVE == this.f6351b.a()) {
            a(this.f6358i, MaxAdFormat.MREC.getSize());
        }
    }

    @Override // com.applovin.impl.w.a
    public void onAdResponseLoaded(DTBAdResponse dTBAdResponse, MaxAdFormat maxAdFormat) {
        if (maxAdFormat.isAdViewAd()) {
            this.f6354e.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f6355f.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f6356g.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f6357h.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.f6359j.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        }
        a(maxAdFormat);
    }

    @Override // com.applovin.mediation.MaxAdRevenueListener
    public void onAdRevenuePaid(@NonNull MaxAd maxAd) {
        n7.a("onAdRevenuePaid", maxAd, this);
    }

    @Override // com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton.a
    public void onClick(AdControlButton adControlButton) {
        if (this.f6350a.s0().c()) {
            n7.a("Not Supported", "Ad loads are not supported while Test Mode is enabled. Please restart the app.", this);
            return;
        }
        if (this.f6353d.j() != this.f6351b.f()) {
            n7.a("Not Supported", "You cannot load an ad from this waterfall because it does not target the current device. To load an ad, please select the targeted waterfall.", this);
            return;
        }
        MaxAdFormat maxAdFormatA = this.f6351b.a();
        AdControlButton.b bVar = AdControlButton.b.LOAD;
        if (bVar == adControlButton.getControlState()) {
            adControlButton.setControlState(AdControlButton.b.LOADING);
            w wVar = this.f6367r;
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
        setTitle(this.f6353d.k());
        this.f6363n = (ListView) findViewById(R.id.listView);
        this.f6364o = findViewById(R.id.ad_presenter_view);
        this.f6365p = (AdControlButton) findViewById(R.id.ad_control_button);
        this.f6366q = (TextView) findViewById(R.id.status_textview);
        this.f6363n.setAdapter((ListAdapter) this.f6353d);
        this.f6366q.setText(a());
        this.f6366q.setTypeface(Typeface.DEFAULT_BOLD);
        this.f6365p.setOnClickListener(this);
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setPadding(0, 10, 0, 0);
        shapeDrawable.getPaint().setColor(-1);
        shapeDrawable.getPaint().setShadowLayer(10, 0.0f, -10, 855638016);
        shapeDrawable.setShape(new RectShape());
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable});
        layerDrawable.setLayerInset(0, 0, 10, 0, 0);
        this.f6364o.setBackground(layerDrawable);
    }

    @Override // com.applovin.impl.n3, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (this.f6352c != null) {
            this.f6350a.s0().a(this.f6362m);
        }
        MaxAdView maxAdView = this.f6354e;
        if (maxAdView != null) {
            maxAdView.destroy();
        }
        MaxInterstitialAd maxInterstitialAd = this.f6355f;
        if (maxInterstitialAd != null) {
            maxInterstitialAd.destroy();
        }
        MaxAppOpenAd maxAppOpenAd = this.f6356g;
        if (maxAppOpenAd != null) {
            maxAppOpenAd.destroy();
        }
        MaxRewardedAd maxRewardedAd = this.f6357h;
        if (maxRewardedAd != null) {
            maxRewardedAd.destroy();
        }
        MaxNativeAdLoader maxNativeAdLoader = this.f6359j;
        if (maxNativeAdLoader != null) {
            MaxAd maxAd = this.f6360k;
            if (maxAd != null) {
                maxNativeAdLoader.destroy(maxAd);
            }
            this.f6359j.destroy();
        }
    }

    @Override // com.applovin.mediation.MaxRewardedAdListener
    public void onUserRewarded(@NonNull MaxAd maxAd, @NonNull MaxReward maxReward) {
        n7.a("onUserRewarded", maxAd, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(final com.applovin.impl.sdk.k kVar, final n nVar, final o oVar, j2 j2Var, final r2 r2Var) {
        if (r2Var instanceof m.b) {
            d.a(this, MaxDebuggerAdUnitDetailActivity.class, kVar.e(), new d.b() { // from class: com.applovin.impl.qb
                @Override // com.applovin.impl.d.b
                public final void a(Activity activity) {
                    l.a(r2Var, nVar, oVar, kVar, (MaxDebuggerAdUnitDetailActivity) activity);
                }
            });
        }
    }

    private void b() {
        String strC = this.f6351b.c();
        if (this.f6351b.a().isAdViewAd()) {
            MaxAdView maxAdView = new MaxAdView(strC, this.f6351b.a());
            this.f6354e = maxAdView;
            maxAdView.setExtraParameter("adaptive_banner", "false");
            this.f6354e.setExtraParameter("disable_auto_retries", "true");
            this.f6354e.setExtraParameter("disable_precache", "true");
            this.f6354e.setExtraParameter("allow_pause_auto_refresh_immediately", "true");
            this.f6354e.stopAutoRefresh();
            this.f6354e.setListener(this);
            return;
        }
        if (MaxAdFormat.INTERSTITIAL == this.f6351b.a()) {
            MaxInterstitialAd maxInterstitialAd = new MaxInterstitialAd(strC);
            this.f6355f = maxInterstitialAd;
            maxInterstitialAd.setExtraParameter("disable_auto_retries", "true");
            this.f6355f.setListener(this);
            return;
        }
        if (MaxAdFormat.APP_OPEN == this.f6351b.a()) {
            MaxAppOpenAd maxAppOpenAd = new MaxAppOpenAd(strC);
            this.f6356g = maxAppOpenAd;
            maxAppOpenAd.setExtraParameter("disable_auto_retries", "true");
            this.f6356g.setListener(this);
            return;
        }
        if (MaxAdFormat.REWARDED == this.f6351b.a()) {
            MaxRewardedAd maxRewardedAd = MaxRewardedAd.getInstance(strC);
            this.f6357h = maxRewardedAd;
            maxRewardedAd.setExtraParameter("disable_auto_retries", "true");
            this.f6357h.setListener(this);
            return;
        }
        if (MaxAdFormat.NATIVE == this.f6351b.a()) {
            this.f6358i = new MaxNativeAdView(new MaxNativeAdViewBinder.Builder(R.layout.max_native_ad_template_1).setTitleTextViewId(R.id.applovin_native_title_text_view).setAdvertiserTextViewId(R.id.applovin_native_advertiser_text_view).setBodyTextViewId(R.id.applovin_native_body_text_view).setCallToActionButtonId(R.id.applovin_native_cta_button).setIconImageViewId(R.id.applovin_native_icon_image_view).setOptionsContentViewGroupId(R.id.applovin_native_options_view).setStarRatingContentViewGroupId(R.id.applovin_native_star_rating_view).setMediaContentViewGroupId(R.id.applovin_native_media_content_view).build(), com.applovin.impl.sdk.k.o());
            MaxNativeAdLoader maxNativeAdLoader = new MaxNativeAdLoader(strC);
            this.f6359j = maxNativeAdLoader;
            maxNativeAdLoader.setExtraParameter("disable_auto_retries", "true");
            this.f6359j.setNativeAdListener(new a());
            this.f6359j.setRevenueListener(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(r2 r2Var, n nVar, o oVar, com.applovin.impl.sdk.k kVar, MaxDebuggerAdUnitDetailActivity maxDebuggerAdUnitDetailActivity) {
        maxDebuggerAdUnitDetailActivity.initialize(nVar, oVar, ((m.b) r2Var).v(), kVar);
    }

    @Override // com.applovin.impl.w.a
    public void onAdLoadFailed(AdError adError, MaxAdFormat maxAdFormat) {
        if (maxAdFormat.isAdViewAd()) {
            this.f6354e.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f6355f.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f6356g.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f6357h.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.f6359j.setLocalExtraParameter("amazon_ad_error", adError);
        }
        a(maxAdFormat);
    }

    private void a(MaxAdFormat maxAdFormat) {
        StringBuilder sb = new StringBuilder();
        sb.append("Loading live ");
        sb.append(maxAdFormat.getDisplayName());
        sb.append(" Ad from ");
        i8 i8Var = this.f6352c;
        sb.append(i8Var != null ? i8Var.b().a() : this.f6353d.j().c());
        com.applovin.impl.sdk.o.g("MaxDebuggerAdUnitDetailActivity", sb.toString());
        if (this.f6352c != null) {
            this.f6350a.s0().a(this.f6352c.b().b());
        }
        if (maxAdFormat.isAdViewAd()) {
            this.f6354e.setPlacement("[Mediation Debugger Live Ad]");
            this.f6354e.loadAd();
            return;
        }
        if (MaxAdFormat.INTERSTITIAL == this.f6351b.a()) {
            this.f6355f.loadAd();
            return;
        }
        if (MaxAdFormat.APP_OPEN == this.f6351b.a()) {
            this.f6356g.loadAd();
            return;
        }
        if (MaxAdFormat.REWARDED == this.f6351b.a()) {
            this.f6357h.loadAd();
        } else if (MaxAdFormat.NATIVE == this.f6351b.a()) {
            this.f6359j.setPlacement("[Mediation Debugger Live Ad]");
            this.f6359j.loadAd();
        } else {
            n7.a("Live ads currently unavailable for ad format", this);
        }
    }

    private void a(ViewGroup viewGroup, AppLovinSdkUtils.Size size) {
        if (this.f6361l != null) {
            return;
        }
        r rVar = new r(viewGroup, size, this);
        this.f6361l = rVar;
        rVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.applovin.impl.ob
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f7191a.a(dialogInterface);
            }
        });
        this.f6361l.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(DialogInterface dialogInterface) {
        this.f6361l = null;
    }

    private String a() {
        if (this.f6350a.s0().c()) {
            return "Not supported while Test Mode is enabled";
        }
        if (this.f6353d.j() != this.f6351b.f()) {
            return "This waterfall is not targeted for the current device";
        }
        return "Tap to load an ad";
    }

    private void b(MaxAdFormat maxAdFormat) {
        StringBuilder sb = new StringBuilder();
        sb.append("Showing live ");
        sb.append(maxAdFormat.getDisplayName());
        sb.append(" Ad from ");
        i8 i8Var = this.f6352c;
        sb.append(i8Var != null ? i8Var.b().a() : this.f6353d.j().c());
        com.applovin.impl.sdk.o.g("MaxDebuggerAdUnitDetailActivity", sb.toString());
        if (maxAdFormat.isAdViewAd()) {
            a(this.f6354e, maxAdFormat.getSize());
            return;
        }
        if (MaxAdFormat.INTERSTITIAL == this.f6351b.a()) {
            this.f6355f.showAd("[Mediation Debugger Live Ad]");
            return;
        }
        if (MaxAdFormat.APP_OPEN == this.f6351b.a()) {
            this.f6356g.showAd("[Mediation Debugger Live Ad]");
        } else if (MaxAdFormat.REWARDED == this.f6351b.a()) {
            this.f6357h.showAd("[Mediation Debugger Live Ad]");
        } else if (MaxAdFormat.NATIVE == this.f6351b.a()) {
            a(this.f6358i, MaxAdFormat.MREC.getSize());
        }
    }
}
