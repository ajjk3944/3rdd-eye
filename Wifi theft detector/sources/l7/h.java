package l7;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;

/* loaded from: classes3.dex */
public class h extends l7.b {

    /* renamed from: b, reason: collision with root package name */
    public final g f23202b;

    /* renamed from: c, reason: collision with root package name */
    public final com.unity3d.scar.adapter.common.h f23203c;

    /* renamed from: d, reason: collision with root package name */
    public final RewardedAdLoadCallback f23204d = new a();

    /* renamed from: e, reason: collision with root package name */
    public final OnUserEarnedRewardListener f23205e = new b();

    /* renamed from: f, reason: collision with root package name */
    public final FullScreenContentCallback f23206f = new c();

    public class a extends RewardedAdLoadCallback {
        public a() {
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onAdLoaded(RewardedAd rewardedAd) {
            super.onAdLoaded(rewardedAd);
            h.this.f23203c.onAdLoaded();
            rewardedAd.setFullScreenContentCallback(h.this.f23206f);
            h.this.f23202b.c(rewardedAd);
            d7.b bVar = h.this.f23187a;
            if (bVar != null) {
                bVar.onAdLoaded();
            }
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdFailedToLoad(LoadAdError loadAdError) {
            super.onAdFailedToLoad(loadAdError);
            h.this.f23203c.onAdFailedToLoad(loadAdError.getCode(), loadAdError.toString());
        }
    }

    public class b implements OnUserEarnedRewardListener {
        public b() {
        }

        @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
        public void onUserEarnedReward(RewardItem rewardItem) {
            h.this.f23203c.onUserEarnedReward();
        }
    }

    public class c extends FullScreenContentCallback {
        public c() {
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdClicked() {
            super.onAdClicked();
            h.this.f23203c.onAdClicked();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdDismissedFullScreenContent() {
            super.onAdDismissedFullScreenContent();
            h.this.f23203c.onAdClosed();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdFailedToShowFullScreenContent(AdError adError) {
            super.onAdFailedToShowFullScreenContent(adError);
            h.this.f23203c.onAdFailedToShow(adError.getCode(), adError.toString());
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdImpression() {
            super.onAdImpression();
            h.this.f23203c.onAdImpression();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdShowedFullScreenContent() {
            super.onAdShowedFullScreenContent();
            h.this.f23203c.onAdOpened();
        }
    }

    public h(com.unity3d.scar.adapter.common.h hVar, g gVar) {
        this.f23203c = hVar;
        this.f23202b = gVar;
    }

    public RewardedAdLoadCallback e() {
        return this.f23204d;
    }

    public OnUserEarnedRewardListener f() {
        return this.f23205e;
    }
}
