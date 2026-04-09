package com.google.ads.mediation.applovin;

import android.content.Context;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.ads.MaxAppOpenAd;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class n implements bb.h, MaxAdListener {

    /* renamed from: a, reason: collision with root package name */
    public final bb.e f8985a;

    /* renamed from: b, reason: collision with root package name */
    public final a f8986b;

    /* renamed from: c, reason: collision with root package name */
    public MaxAppOpenAd f8987c;

    /* renamed from: d, reason: collision with root package name */
    public bb.i f8988d;

    public n(bb.e eVar, f fVar, a aVar) {
        nk.k.e(eVar, "loadCallback");
        nk.k.e(fVar, "appLovinInitializer");
        nk.k.e(aVar, "appLovinAdFactory");
        this.f8985a = eVar;
        this.f8986b = aVar;
    }

    @Override // com.applovin.mediation.MaxAdListener
    public final void onAdClicked(MaxAd maxAd) {
        nk.k.e(maxAd, "ad");
        bb.i iVar = this.f8988d;
        if (iVar != null) {
            iVar.h();
        }
    }

    @Override // com.applovin.mediation.MaxAdListener
    public final void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        nk.k.e(maxAd, "ad");
        nk.k.e(maxError, "appLovinError");
        bb.i iVar = this.f8988d;
        if (iVar != null) {
            iVar.b(new pa.a(maxError.getCode(), maxError.getMessage(), AppLovinMediationAdapter.APPLOVIN_SDK_ERROR_DOMAIN, null));
        }
    }

    @Override // com.applovin.mediation.MaxAdListener
    public final void onAdDisplayed(MaxAd maxAd) {
        nk.k.e(maxAd, "ad");
        bb.i iVar = this.f8988d;
        if (iVar != null) {
            iVar.e();
        }
        bb.i iVar2 = this.f8988d;
        if (iVar2 != null) {
            iVar2.g();
        }
    }

    @Override // com.applovin.mediation.MaxAdListener
    public final void onAdHidden(MaxAd maxAd) {
        nk.k.e(maxAd, "ad");
        bb.i iVar = this.f8988d;
        if (iVar != null) {
            iVar.onAdClosed();
        }
    }

    @Override // com.applovin.mediation.MaxAdListener
    public final void onAdLoadFailed(String str, MaxError maxError) {
        nk.k.e(str, "p0");
        nk.k.e(maxError, "appLovinError");
        this.f8985a.i(new pa.a(maxError.getCode(), maxError.getMessage(), AppLovinMediationAdapter.APPLOVIN_SDK_ERROR_DOMAIN, null));
    }

    @Override // com.applovin.mediation.MaxAdListener
    public final void onAdLoaded(MaxAd maxAd) {
        nk.k.e(maxAd, "ad");
        this.f8988d = (bb.i) this.f8985a.onSuccess(this);
    }

    @Override // bb.h
    public final void showAd(Context context) {
        nk.k.e(context, "context");
        MaxAppOpenAd maxAppOpenAd = this.f8987c;
        if (maxAppOpenAd != null) {
            if (maxAppOpenAd == null || !maxAppOpenAd.isReady()) {
                bb.i iVar = this.f8988d;
                if (iVar != null) {
                    iVar.b(new pa.a(106, "Ad is not ready to be displayed", AppLovinMediationAdapter.ERROR_DOMAIN, null));
                    return;
                }
                return;
            }
            MaxAppOpenAd maxAppOpenAd2 = this.f8987c;
            if (maxAppOpenAd2 != null) {
                maxAppOpenAd2.showAd();
            }
        }
    }
}
