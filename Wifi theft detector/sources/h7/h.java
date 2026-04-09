package h7;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;

/* loaded from: classes3.dex */
public class h extends h7.b {

    /* renamed from: b, reason: collision with root package name */
    public final g f21436b;

    /* renamed from: c, reason: collision with root package name */
    public final com.unity3d.scar.adapter.common.h f21437c;

    /* renamed from: d, reason: collision with root package name */
    public final RewardedAdLoadCallback f21438d = new a();

    /* renamed from: e, reason: collision with root package name */
    public final OnUserEarnedRewardListener f21439e = new b();

    /* renamed from: f, reason: collision with root package name */
    public final FullScreenContentCallback f21440f = new c();

    public class a extends RewardedAdLoadCallback {
        public a() {
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onAdLoaded(RewardedAd rewardedAd) {
            super.onAdLoaded(rewardedAd);
            h.this.f21437c.onAdLoaded();
            rewardedAd.setFullScreenContentCallback(h.this.f21440f);
            h.this.f21436b.c(rewardedAd);
            d7.b bVar = h.this.f21421a;
            if (bVar != null) {
                bVar.onAdLoaded();
            }
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdFailedToLoad(LoadAdError loadAdError) {
            super.onAdFailedToLoad(loadAdError);
            h.this.f21437c.onAdFailedToLoad(loadAdError.getCode(), loadAdError.toString());
        }
    }

    public class b implements OnUserEarnedRewardListener {
        public b() {
        }

        @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
        public void onUserEarnedReward(RewardItem rewardItem) {
            h.this.f21437c.onUserEarnedReward();
        }
    }

    public class c extends FullScreenContentCallback {
        public c() {
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdClicked() {
            super.onAdClicked();
            h.this.f21437c.onAdClicked();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdDismissedFullScreenContent() {
            super.onAdDismissedFullScreenContent();
            h.this.f21437c.onAdClosed();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdFailedToShowFullScreenContent(AdError adError) {
            super.onAdFailedToShowFullScreenContent(adError);
            h.this.f21437c.onAdFailedToShow(adError.getCode(), adError.toString());
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdImpression() {
            super.onAdImpression();
            h.this.f21437c.onAdImpression();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdShowedFullScreenContent() {
            super.onAdShowedFullScreenContent();
            h.this.f21437c.onAdOpened();
        }
    }

    public h(com.unity3d.scar.adapter.common.h hVar, g gVar) {
        this.f21437c = hVar;
        this.f21436b = gVar;
    }

    public RewardedAdLoadCallback e() {
        return this.f21438d;
    }

    public OnUserEarnedRewardListener f() {
        return this.f21439e;
    }
}
