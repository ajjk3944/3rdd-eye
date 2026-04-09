package l7;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

/* loaded from: classes3.dex */
public class f extends l7.b {

    /* renamed from: b, reason: collision with root package name */
    public final e f23196b;

    /* renamed from: c, reason: collision with root package name */
    public final com.unity3d.scar.adapter.common.g f23197c;

    /* renamed from: d, reason: collision with root package name */
    public final InterstitialAdLoadCallback f23198d = new a();

    /* renamed from: e, reason: collision with root package name */
    public final FullScreenContentCallback f23199e = new b();

    public class a extends InterstitialAdLoadCallback {
        public a() {
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onAdLoaded(InterstitialAd interstitialAd) {
            super.onAdLoaded(interstitialAd);
            f.this.f23197c.onAdLoaded();
            interstitialAd.setFullScreenContentCallback(f.this.f23199e);
            f.this.f23196b.c(interstitialAd);
            d7.b bVar = f.this.f23187a;
            if (bVar != null) {
                bVar.onAdLoaded();
            }
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdFailedToLoad(LoadAdError loadAdError) {
            super.onAdFailedToLoad(loadAdError);
            f.this.f23197c.onAdFailedToLoad(loadAdError.getCode(), loadAdError.toString());
        }
    }

    public class b extends FullScreenContentCallback {
        public b() {
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdClicked() {
            super.onAdClicked();
            f.this.f23197c.onAdClicked();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdDismissedFullScreenContent() {
            super.onAdDismissedFullScreenContent();
            f.this.f23197c.onAdClosed();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdFailedToShowFullScreenContent(AdError adError) {
            super.onAdFailedToShowFullScreenContent(adError);
            f.this.f23197c.onAdFailedToShow(adError.getCode(), adError.toString());
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdImpression() {
            super.onAdImpression();
            f.this.f23197c.onAdImpression();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdShowedFullScreenContent() {
            super.onAdShowedFullScreenContent();
            f.this.f23197c.onAdOpened();
        }
    }

    public f(com.unity3d.scar.adapter.common.g gVar, e eVar) {
        this.f23197c = gVar;
        this.f23196b = eVar;
    }

    public InterstitialAdLoadCallback e() {
        return this.f23198d;
    }
}
