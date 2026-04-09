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
import androidx.fragment.app.C1752e;
import com.amazon.device.ads.AdError;
import com.amazon.device.ads.DTBAdResponse;
import com.applovin.impl.C2129l;
import com.applovin.impl.C2149v;
import com.applovin.impl.k2;
import com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton;
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
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import java.util.List;

/* renamed from: com.applovin.impl.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC2127k extends d3 implements AdControlButton.a, MaxRewardedAdListener, MaxAdViewAdListener, MaxAdRevenueListener, C2149v.a {

    /* renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.k f19616a;

    /* renamed from: b, reason: collision with root package name */
    private C2131m f19617b;

    /* renamed from: c, reason: collision with root package name */
    private v7 f19618c;

    /* renamed from: d, reason: collision with root package name */
    private C2129l f19619d;

    /* renamed from: e, reason: collision with root package name */
    private MaxAdView f19620e;

    /* renamed from: f, reason: collision with root package name */
    private MaxInterstitialAd f19621f;

    /* renamed from: g, reason: collision with root package name */
    private MaxAppOpenAd f19622g;

    /* renamed from: h, reason: collision with root package name */
    private MaxRewardedAd f19623h;
    private MaxNativeAdView i;

    /* renamed from: j, reason: collision with root package name */
    private MaxNativeAdLoader f19624j;

    /* renamed from: k, reason: collision with root package name */
    private MaxAd f19625k;

    /* renamed from: l, reason: collision with root package name */
    private DialogC2140q f19626l;

    /* renamed from: m, reason: collision with root package name */
    private List f19627m;

    /* renamed from: n, reason: collision with root package name */
    private ListView f19628n;

    /* renamed from: o, reason: collision with root package name */
    private View f19629o;

    /* renamed from: p, reason: collision with root package name */
    private AdControlButton f19630p;

    /* renamed from: q, reason: collision with root package name */
    private TextView f19631q;

    /* renamed from: r, reason: collision with root package name */
    private C2149v f19632r;

    /* renamed from: com.applovin.impl.k$a */
    public class a extends MaxNativeAdListener {
        public a() {
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdClicked(MaxAd maxAd) {
            AbstractActivityC2127k.this.onAdClicked(maxAd);
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdLoadFailed(String str, MaxError maxError) {
            AbstractActivityC2127k.this.onAdLoadFailed(str, maxError);
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdLoaded(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
            if (AbstractActivityC2127k.this.f19625k != null) {
                AbstractActivityC2127k.this.f19624j.destroy(AbstractActivityC2127k.this.f19625k);
            }
            AbstractActivityC2127k.this.f19625k = maxAd;
            if (maxNativeAdView != null) {
                AbstractActivityC2127k.this.i = maxNativeAdView;
            } else {
                AbstractActivityC2127k abstractActivityC2127k = AbstractActivityC2127k.this;
                com.applovin.impl.sdk.k unused = AbstractActivityC2127k.this.f19616a;
                abstractActivityC2127k.i = new MaxNativeAdView(MaxNativeAdView.MEDIUM_TEMPLATE_1, com.applovin.impl.sdk.k.o());
                AbstractActivityC2127k.this.f19624j.render(AbstractActivityC2127k.this.i, maxAd);
            }
            AbstractActivityC2127k.this.onAdLoaded(maxAd);
        }
    }

    @Override // com.applovin.impl.d3
    public com.applovin.impl.sdk.k getSdk() {
        return this.f19616a;
    }

    public void initialize(final C2131m c2131m, final C2134n c2134n, v7 v7Var, final com.applovin.impl.sdk.k kVar) {
        List listA;
        this.f19616a = kVar;
        this.f19617b = c2131m;
        this.f19618c = v7Var;
        this.f19627m = kVar.s0().b();
        C2129l c2129l = new C2129l(c2131m, c2134n, v7Var, this);
        this.f19619d = c2129l;
        c2129l.a(new k2.a() { // from class: com.applovin.impl.M
            @Override // com.applovin.impl.k2.a
            public final void a(d2 d2Var, j2 j2Var) {
                this.f18828b.a(kVar, c2131m, c2134n, d2Var, j2Var);
            }
        });
        b();
        if (c2131m.f().f()) {
            if ((v7Var != null && !v7Var.b().d().D()) || (listA = kVar.U().a(c2131m.c())) == null || listA.isEmpty()) {
                return;
            }
            this.f19632r = new C2149v(listA, c2131m.a(), getApplicationContext(), this);
        }
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
        this.f19630p.setControlState(AdControlButton.b.LOAD);
        this.f19631q.setText("");
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
        this.f19630p.setControlState(AdControlButton.b.LOAD);
        this.f19631q.setText("");
        if (204 == maxError.getCode()) {
            a7.a("No Fill", "No fills often happen in live environments. Please make sure to use the Mediation Debugger test mode before you go live.", this);
            return;
        }
        a7.a("", "Failed to load with error code: " + maxError.getCode(), this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoaded(MaxAd maxAd) {
        this.f19631q.setText(maxAd.getNetworkName() + " ad loaded");
        this.f19630p.setControlState(AdControlButton.b.SHOW);
        if (maxAd.getFormat().isAdViewAd()) {
            a(this.f19620e, maxAd.getFormat().getSize());
        } else if (MaxAdFormat.NATIVE == this.f19617b.a()) {
            a(this.i, MaxAdFormat.MREC.getSize());
        }
    }

    @Override // com.applovin.impl.C2149v.a
    public void onAdResponseLoaded(DTBAdResponse dTBAdResponse, MaxAdFormat maxAdFormat) {
        if (maxAdFormat.isAdViewAd()) {
            this.f19620e.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f19621f.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f19622g.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f19623h.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.f19624j.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        }
        a(maxAdFormat);
    }

    @Override // com.applovin.mediation.MaxAdRevenueListener
    public void onAdRevenuePaid(MaxAd maxAd) {
        a7.a("onAdRevenuePaid", maxAd, this);
    }

    @Override // com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton.a
    public void onClick(AdControlButton adControlButton) {
        if (this.f19616a.s0().c()) {
            a7.a("Not Supported", "Ad loads are not supported while Test Mode is enabled. Please restart the app.", this);
            return;
        }
        if (this.f19619d.j() != this.f19617b.f()) {
            a7.a("Not Supported", "You cannot load an ad from this waterfall because it does not target the current device. To load an ad, please select the targeted waterfall.", this);
            return;
        }
        MaxAdFormat maxAdFormatA = this.f19617b.a();
        AdControlButton.b bVar = AdControlButton.b.LOAD;
        if (bVar == adControlButton.getControlState()) {
            adControlButton.setControlState(AdControlButton.b.LOADING);
            C2149v c2149v = this.f19632r;
            if (c2149v != null) {
                c2149v.a();
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

    @Override // com.applovin.impl.d3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_ad_unit_detail_activity);
        setTitle(this.f19619d.k());
        this.f19628n = (ListView) findViewById(R.id.listView);
        this.f19629o = findViewById(R.id.ad_presenter_view);
        this.f19630p = (AdControlButton) findViewById(R.id.ad_control_button);
        this.f19631q = (TextView) findViewById(R.id.status_textview);
        this.f19628n.setAdapter((ListAdapter) this.f19619d);
        this.f19631q.setText(a());
        this.f19631q.setTypeface(Typeface.DEFAULT_BOLD);
        this.f19630p.setOnClickListener(this);
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setPadding(0, 10, 0, 0);
        shapeDrawable.getPaint().setColor(-1);
        shapeDrawable.getPaint().setShadowLayer(10, 0.0f, -10, 855638016);
        shapeDrawable.setShape(new RectShape());
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable});
        layerDrawable.setLayerInset(0, 0, 10, 0, 0);
        this.f19629o.setBackground(layerDrawable);
    }

    @Override // com.applovin.impl.d3, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (this.f19618c != null) {
            this.f19616a.s0().a(this.f19627m);
        }
        MaxAdView maxAdView = this.f19620e;
        if (maxAdView != null) {
            maxAdView.destroy();
        }
        MaxInterstitialAd maxInterstitialAd = this.f19621f;
        if (maxInterstitialAd != null) {
            maxInterstitialAd.destroy();
        }
        MaxAppOpenAd maxAppOpenAd = this.f19622g;
        if (maxAppOpenAd != null) {
            maxAppOpenAd.destroy();
        }
        MaxRewardedAd maxRewardedAd = this.f19623h;
        if (maxRewardedAd != null) {
            maxRewardedAd.destroy();
        }
        MaxNativeAdLoader maxNativeAdLoader = this.f19624j;
        if (maxNativeAdLoader != null) {
            MaxAd maxAd = this.f19625k;
            if (maxAd != null) {
                maxNativeAdLoader.destroy(maxAd);
            }
            this.f19624j.destroy();
        }
    }

    @Override // com.applovin.mediation.MaxRewardedAdListener
    public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
        a7.a("onUserRewarded", maxAd, this);
    }

    private void b() {
        String strC = this.f19617b.c();
        if (this.f19617b.a().isAdViewAd()) {
            MaxAdView maxAdView = new MaxAdView(strC, this.f19617b.a(), this.f19616a.y0(), this);
            this.f19620e = maxAdView;
            maxAdView.setExtraParameter("adaptive_banner", "false");
            this.f19620e.setExtraParameter("disable_auto_retries", "true");
            this.f19620e.setExtraParameter("disable_precache", "true");
            this.f19620e.setExtraParameter("allow_pause_auto_refresh_immediately", "true");
            this.f19620e.stopAutoRefresh();
            this.f19620e.setListener(this);
            return;
        }
        if (MaxAdFormat.INTERSTITIAL == this.f19617b.a()) {
            MaxInterstitialAd maxInterstitialAd = new MaxInterstitialAd(strC, this.f19616a.y0(), this);
            this.f19621f = maxInterstitialAd;
            maxInterstitialAd.setExtraParameter("disable_auto_retries", "true");
            this.f19621f.setListener(this);
            return;
        }
        if (MaxAdFormat.APP_OPEN == this.f19617b.a()) {
            MaxAppOpenAd maxAppOpenAd = new MaxAppOpenAd(strC, this.f19616a.y0());
            this.f19622g = maxAppOpenAd;
            maxAppOpenAd.setExtraParameter("disable_auto_retries", "true");
            this.f19622g.setListener(this);
            return;
        }
        if (MaxAdFormat.REWARDED == this.f19617b.a()) {
            MaxRewardedAd maxRewardedAd = MaxRewardedAd.getInstance(strC, this.f19616a.y0(), this);
            this.f19623h = maxRewardedAd;
            maxRewardedAd.setExtraParameter("disable_auto_retries", "true");
            this.f19623h.setListener(this);
            return;
        }
        if (MaxAdFormat.NATIVE == this.f19617b.a()) {
            MaxNativeAdLoader maxNativeAdLoader = new MaxNativeAdLoader(strC, this.f19616a.y0(), this);
            this.f19624j = maxNativeAdLoader;
            maxNativeAdLoader.setExtraParameter("disable_auto_retries", "true");
            this.f19624j.setNativeAdListener(new a());
            this.f19624j.setRevenueListener(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.sdk.k kVar, C2131m c2131m, C2134n c2134n, d2 d2Var, j2 j2Var) {
        if (j2Var instanceof C2129l.b) {
            AbstractC2113d.a(this, MaxDebuggerAdUnitDetailActivity.class, kVar.e(), new C1752e(j2Var, c2131m, c2134n, kVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(j2 j2Var, C2131m c2131m, C2134n c2134n, com.applovin.impl.sdk.k kVar, MaxDebuggerAdUnitDetailActivity maxDebuggerAdUnitDetailActivity) {
        maxDebuggerAdUnitDetailActivity.initialize(c2131m, c2134n, ((C2129l.b) j2Var).v(), kVar);
    }

    @Override // com.applovin.impl.C2149v.a
    public void onAdLoadFailed(AdError adError, MaxAdFormat maxAdFormat) {
        if (maxAdFormat.isAdViewAd()) {
            this.f19620e.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f19621f.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f19622g.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f19623h.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.f19624j.setLocalExtraParameter("amazon_ad_error", adError);
        }
        a(maxAdFormat);
    }

    private void a(MaxAdFormat maxAdFormat) {
        StringBuilder sb = new StringBuilder("Loading live ");
        sb.append(maxAdFormat.getDisplayName());
        sb.append(" Ad from ");
        v7 v7Var = this.f19618c;
        sb.append(v7Var != null ? v7Var.b().a() : this.f19619d.j().c());
        com.applovin.impl.sdk.o.g("MaxDebuggerAdUnitDetailActivity", sb.toString());
        if (this.f19618c != null) {
            this.f19616a.s0().a(this.f19618c.b().b());
        }
        if (maxAdFormat.isAdViewAd()) {
            this.f19620e.setPlacement("[Mediation Debugger Live Ad]");
            this.f19620e.loadAd();
            return;
        }
        if (MaxAdFormat.INTERSTITIAL == this.f19617b.a()) {
            this.f19621f.loadAd();
            return;
        }
        if (MaxAdFormat.APP_OPEN == this.f19617b.a()) {
            this.f19622g.loadAd();
            return;
        }
        if (MaxAdFormat.REWARDED == this.f19617b.a()) {
            this.f19623h.loadAd();
        } else if (MaxAdFormat.NATIVE == this.f19617b.a()) {
            this.f19624j.setPlacement("[Mediation Debugger Live Ad]");
            this.f19624j.loadAd();
        } else {
            a7.a("Live ads currently unavailable for ad format", this);
        }
    }

    private void a(ViewGroup viewGroup, AppLovinSdkUtils.Size size) {
        if (this.f19626l != null) {
            return;
        }
        DialogC2140q dialogC2140q = new DialogC2140q(viewGroup, size, this);
        this.f19626l = dialogC2140q;
        dialogC2140q.setOnDismissListener(new N(this, 0));
        this.f19626l.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(DialogInterface dialogInterface) {
        this.f19626l = null;
    }

    private String a() {
        if (this.f19616a.s0().c()) {
            return "Not supported while Test Mode is enabled";
        }
        if (this.f19619d.j() != this.f19617b.f()) {
            return "This waterfall is not targeted for the current device";
        }
        return "Tap to load an ad";
    }

    private void b(MaxAdFormat maxAdFormat) {
        StringBuilder sb = new StringBuilder("Showing live ");
        sb.append(maxAdFormat.getDisplayName());
        sb.append(" Ad from ");
        v7 v7Var = this.f19618c;
        sb.append(v7Var != null ? v7Var.b().a() : this.f19619d.j().c());
        com.applovin.impl.sdk.o.g("MaxDebuggerAdUnitDetailActivity", sb.toString());
        if (maxAdFormat.isAdViewAd()) {
            a(this.f19620e, maxAdFormat.getSize());
            return;
        }
        if (MaxAdFormat.INTERSTITIAL == this.f19617b.a()) {
            this.f19621f.showAd("[Mediation Debugger Live Ad]");
            return;
        }
        if (MaxAdFormat.APP_OPEN == this.f19617b.a()) {
            this.f19622g.showAd("[Mediation Debugger Live Ad]");
        } else if (MaxAdFormat.REWARDED == this.f19617b.a()) {
            this.f19623h.showAd("[Mediation Debugger Live Ad]");
        } else if (MaxAdFormat.NATIVE == this.f19617b.a()) {
            a(this.i, MaxAdFormat.MREC.getSize());
        }
    }
}
