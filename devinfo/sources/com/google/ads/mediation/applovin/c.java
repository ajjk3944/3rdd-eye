package com.google.ads.mediation.applovin;

import android.util.Log;
import android.widget.FrameLayout;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinAdViewDisplayErrorCode;
import com.applovin.adview.AppLovinAdViewEventListener;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinSdk;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c implements bb.k, AppLovinAdLoadListener, AppLovinAdDisplayListener, AppLovinAdClickListener, AppLovinAdViewEventListener {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f8971h = 0;

    /* renamed from: a, reason: collision with root package name */
    public b f8972a;

    /* renamed from: b, reason: collision with root package name */
    public AppLovinSdk f8973b;

    /* renamed from: c, reason: collision with root package name */
    public String f8974c;

    /* renamed from: d, reason: collision with root package name */
    public final f f8975d;

    /* renamed from: e, reason: collision with root package name */
    public final a f8976e;

    /* renamed from: f, reason: collision with root package name */
    public final bb.e f8977f;
    public bb.l g;

    public c(bb.e eVar, f fVar, a aVar) {
        this.f8977f = eVar;
        this.f8975d = fVar;
        this.f8976e = aVar;
    }

    @Override // com.applovin.sdk.AppLovinAdClickListener
    public final void adClicked(AppLovinAd appLovinAd) {
        Log.d("c", "Banner clicked.");
        bb.l lVar = this.g;
        if (lVar != null) {
            lVar.h();
        }
    }

    @Override // com.applovin.adview.AppLovinAdViewEventListener
    public final void adClosedFullscreen(AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
        Log.d("c", "Banner closed fullscreen.");
        bb.l lVar = this.g;
        if (lVar != null) {
            lVar.onAdClosed();
        }
    }

    @Override // com.applovin.sdk.AppLovinAdDisplayListener
    public final void adDisplayed(AppLovinAd appLovinAd) {
        Log.d("c", "Banner displayed.");
        bb.l lVar = this.g;
        if (lVar != null) {
            lVar.e();
        }
    }

    @Override // com.applovin.adview.AppLovinAdViewEventListener
    public final void adFailedToDisplay(AppLovinAd appLovinAd, AppLovinAdView appLovinAdView, AppLovinAdViewDisplayErrorCode appLovinAdViewDisplayErrorCode) {
        Log.w("c", "Banner failed to display: " + appLovinAdViewDisplayErrorCode);
    }

    @Override // com.applovin.sdk.AppLovinAdDisplayListener
    public final void adHidden(AppLovinAd appLovinAd) {
        Log.d("c", "Banner dismissed.");
    }

    @Override // com.applovin.adview.AppLovinAdViewEventListener
    public final void adLeftApplication(AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
        Log.d("c", "Banner left application.");
        bb.l lVar = this.g;
        if (lVar != null) {
            lVar.a();
        }
    }

    @Override // com.applovin.adview.AppLovinAdViewEventListener
    public final void adOpenedFullscreen(AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
        Log.d("c", "Banner opened fullscreen.");
        bb.l lVar = this.g;
        if (lVar != null) {
            lVar.e();
        }
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public final void adReceived(AppLovinAd appLovinAd) {
        Log.d("c", "Banner did load ad for zone: " + this.f8974c);
        this.f8972a.f8969a.renderAd(appLovinAd);
        this.g = (bb.l) this.f8977f.onSuccess(this);
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public final void failedToReceiveAd(int i4) {
        pa.a adError = AppLovinUtils.getAdError(i4);
        Log.w("c", "Failed to load banner ad with error: " + i4);
        this.f8977f.i(adError);
    }

    @Override // bb.k
    public final FrameLayout getView() {
        return this.f8972a.f8970b;
    }
}
