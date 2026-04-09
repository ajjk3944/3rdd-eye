package y9;

import android.content.Context;
import android.util.Log;
import bb.h;
import bb.i;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdExtendedListener;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.concurrent.atomic.AtomicBoolean;
import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class f implements h, InterstitialAdExtendedListener {

    /* renamed from: a, reason: collision with root package name */
    public final bb.e f37384a;

    /* renamed from: b, reason: collision with root package name */
    public InterstitialAd f37385b;

    /* renamed from: c, reason: collision with root package name */
    public i f37386c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f37387d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f37388e;

    public f(bb.e eVar, j6.i iVar) {
        k.e(eVar, "loadCallback");
        k.e(iVar, "metaFactory");
        this.f37384a = eVar;
        this.f37387d = new AtomicBoolean();
        this.f37388e = new AtomicBoolean();
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdClicked(Ad ad2) {
        k.e(ad2, "ad");
        i iVar = this.f37386c;
        if (iVar != null) {
            iVar.h();
        }
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdLoaded(Ad ad2) {
        k.e(ad2, "ad");
        this.f37386c = (i) this.f37384a.onSuccess(this);
    }

    @Override // com.facebook.ads.AdListener
    public final void onError(Ad ad2, AdError adError) {
        k.e(ad2, "ad");
        k.e(adError, "adError");
        pa.a adError2 = FacebookMediationAdapter.getAdError(adError);
        k.d(adError2, "getAdError(...)");
        Log.w(FacebookMediationAdapter.TAG, adError2.f31512b);
        if (!this.f37387d.get()) {
            this.f37384a.i(adError2);
            return;
        }
        i iVar = this.f37386c;
        if (iVar != null) {
            iVar.b(adError2);
        }
    }

    @Override // com.facebook.ads.InterstitialAdExtendedListener
    public final void onInterstitialActivityDestroyed() {
        i iVar;
        if (this.f37388e.getAndSet(true) || (iVar = this.f37386c) == null) {
            return;
        }
        iVar.onAdClosed();
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public final void onInterstitialDismissed(Ad ad2) {
        i iVar;
        k.e(ad2, "ad");
        if (this.f37388e.getAndSet(true) || (iVar = this.f37386c) == null) {
            return;
        }
        iVar.onAdClosed();
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public final void onInterstitialDisplayed(Ad ad2) {
        k.e(ad2, "ad");
        i iVar = this.f37386c;
        if (iVar != null) {
            iVar.e();
        }
    }

    @Override // com.facebook.ads.AdListener
    public final void onLoggingImpression(Ad ad2) {
        k.e(ad2, "ad");
        i iVar = this.f37386c;
        if (iVar != null) {
            iVar.g();
        }
    }

    @Override // bb.h
    public final void showAd(Context context) {
        k.e(context, "context");
        this.f37387d.set(true);
        InterstitialAd interstitialAd = this.f37385b;
        if (interstitialAd == null || interstitialAd.show()) {
            return;
        }
        pa.a aVar = new pa.a(110, "Failed to present app open ad.", FacebookMediationAdapter.ERROR_DOMAIN, null);
        Log.w(FacebookMediationAdapter.TAG, aVar.toString());
        i iVar = this.f37386c;
        if (iVar != null) {
            iVar.b(aVar);
        }
    }

    @Override // com.facebook.ads.RewardedAdListener
    public final void onRewardedAdCompleted() {
    }

    @Override // com.facebook.ads.RewardedAdListener
    public final void onRewardedAdServerFailed() {
    }

    @Override // com.facebook.ads.RewardedAdListener
    public final void onRewardedAdServerSucceeded() {
    }
}
