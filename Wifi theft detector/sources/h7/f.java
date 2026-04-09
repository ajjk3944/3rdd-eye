package h7;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

/* loaded from: classes3.dex */
public class f extends h7.b {

    /* renamed from: b, reason: collision with root package name */
    public final e f21430b;

    /* renamed from: c, reason: collision with root package name */
    public final com.unity3d.scar.adapter.common.g f21431c;

    /* renamed from: d, reason: collision with root package name */
    public final InterstitialAdLoadCallback f21432d = new a();

    /* renamed from: e, reason: collision with root package name */
    public final FullScreenContentCallback f21433e = new b();

    public class a extends InterstitialAdLoadCallback {
        public a() {
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onAdLoaded(InterstitialAd interstitialAd) {
            super.onAdLoaded(interstitialAd);
            f.this.f21431c.onAdLoaded();
            interstitialAd.setFullScreenContentCallback(f.this.f21433e);
            f.this.f21430b.c(interstitialAd);
            d7.b bVar = f.this.f21421a;
            if (bVar != null) {
                bVar.onAdLoaded();
            }
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdFailedToLoad(LoadAdError loadAdError) {
            super.onAdFailedToLoad(loadAdError);
            f.this.f21431c.onAdFailedToLoad(loadAdError.getCode(), loadAdError.toString());
        }
    }

    public class b extends FullScreenContentCallback {
        public b() {
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdClicked() {
            super.onAdClicked();
            f.this.f21431c.onAdClicked();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdDismissedFullScreenContent() {
            super.onAdDismissedFullScreenContent();
            f.this.f21431c.onAdClosed();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdFailedToShowFullScreenContent(AdError adError) {
            super.onAdFailedToShowFullScreenContent(adError);
            f.this.f21431c.onAdFailedToShow(adError.getCode(), adError.toString());
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdImpression() {
            super.onAdImpression();
            f.this.f21431c.onAdImpression();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdShowedFullScreenContent() {
            super.onAdShowedFullScreenContent();
            f.this.f21431c.onAdOpened();
        }
    }

    public f(com.unity3d.scar.adapter.common.g gVar, e eVar) {
        this.f21431c = gVar;
        this.f21430b = eVar;
    }

    public InterstitialAdLoadCallback e() {
        return this.f21432d;
    }
}
