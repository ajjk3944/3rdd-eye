package y9;

import android.content.Context;
import android.util.Log;
import bb.p;
import bb.q;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdExtendedListener;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import j6.i;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b implements p, InterstitialAdExtendedListener {

    /* renamed from: a, reason: collision with root package name */
    public final bb.e f37368a;

    /* renamed from: b, reason: collision with root package name */
    public InterstitialAd f37369b;

    /* renamed from: c, reason: collision with root package name */
    public q f37370c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f37371d = new AtomicBoolean();

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f37372e = new AtomicBoolean();

    /* renamed from: f, reason: collision with root package name */
    public final i f37373f;

    public b(bb.e eVar, i iVar) {
        this.f37368a = eVar;
        this.f37373f = iVar;
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdClicked(Ad ad2) {
        q qVar = this.f37370c;
        if (qVar != null) {
            qVar.h();
            this.f37370c.a();
        }
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdLoaded(Ad ad2) {
        this.f37370c = (q) this.f37368a.onSuccess(this);
    }

    @Override // com.facebook.ads.AdListener
    public final void onError(Ad ad2, AdError adError) {
        pa.a adError2 = FacebookMediationAdapter.getAdError(adError);
        Log.w(FacebookMediationAdapter.TAG, adError2.f31512b);
        if (!this.f37371d.get()) {
            this.f37368a.i(adError2);
            return;
        }
        q qVar = this.f37370c;
        if (qVar != null) {
            qVar.b(adError2);
        }
    }

    @Override // com.facebook.ads.InterstitialAdExtendedListener
    public final void onInterstitialActivityDestroyed() {
        q qVar;
        if (this.f37372e.getAndSet(true) || (qVar = this.f37370c) == null) {
            return;
        }
        qVar.onAdClosed();
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public final void onInterstitialDismissed(Ad ad2) {
        q qVar;
        if (this.f37372e.getAndSet(true) || (qVar = this.f37370c) == null) {
            return;
        }
        qVar.onAdClosed();
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public final void onInterstitialDisplayed(Ad ad2) {
        q qVar = this.f37370c;
        if (qVar != null) {
            qVar.e();
        }
    }

    @Override // com.facebook.ads.AdListener
    public final void onLoggingImpression(Ad ad2) {
        q qVar = this.f37370c;
        if (qVar != null) {
            qVar.g();
        }
    }

    @Override // bb.p
    public final void showAd(Context context) {
        this.f37371d.set(true);
        if (this.f37369b.show()) {
            return;
        }
        pa.a aVar = new pa.a(110, "Failed to present interstitial ad.", FacebookMediationAdapter.ERROR_DOMAIN, null);
        Log.w(FacebookMediationAdapter.TAG, aVar.toString());
        q qVar = this.f37370c;
        if (qVar != null) {
            qVar.b(aVar);
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
