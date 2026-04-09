package k3;

import android.util.Log;
import com.google.ads.mediation.mintegral.MintegralConstants;
import com.google.ads.mediation.mintegral.MintegralMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.RewardInfo;
import com.mbridge.msdk.out.RewardVideoWithCodeListener;
import j3.h;
import j3.j;

/* loaded from: classes.dex */
public abstract class f extends RewardVideoWithCodeListener implements MediationRewardedAd {

    /* renamed from: a, reason: collision with root package name */
    public final MediationAdLoadCallback f21829a;

    /* renamed from: b, reason: collision with root package name */
    public h f21830b;

    /* renamed from: c, reason: collision with root package name */
    public MediationRewardedAdCallback f21831c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f21832d;

    /* renamed from: e, reason: collision with root package name */
    public final j3.a f21833e;

    public f(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback mediationAdLoadCallback, j3.a aVar) {
        this.f21832d = j.f(mediationRewardedAdConfiguration.getMediationExtras());
        this.f21829a = mediationAdLoadCallback;
        this.f21833e = aVar;
    }

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
    public void onAdClose(MBridgeIds mBridgeIds, RewardInfo rewardInfo) {
        if (this.f21831c == null) {
            return;
        }
        if (rewardInfo == null || !rewardInfo.isCompleteView()) {
            Log.w(MintegralMediationAdapter.TAG, "Mintegral SDK failed to reward user due to missing rewarded settings or rewarded ad playback not completed.");
        } else {
            this.f21831c.onUserEarnedReward();
        }
        this.f21831c.onAdClosed();
    }

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
    public void onAdShow(MBridgeIds mBridgeIds) {
        h hVar;
        if (this.f21833e.a() && (hVar = this.f21830b) != null) {
            MintegralMediationAdapter.loadedSlotIdentifiers.remove(hVar);
        }
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f21831c;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdOpened();
            this.f21831c.reportAdImpression();
        }
    }

    @Override // com.mbridge.msdk.out.RewardVideoWithCodeListener
    public void onShowFailWithCode(MBridgeIds mBridgeIds, int i10, String str) {
        h hVar;
        if (this.f21833e.a() && (hVar = this.f21830b) != null) {
            MintegralMediationAdapter.loadedSlotIdentifiers.remove(hVar);
        }
        AdError adErrorB = MintegralConstants.b(i10, str);
        Log.w(MintegralMediationAdapter.TAG, adErrorB.toString());
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f21831c;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdFailedToShow(adErrorB);
        }
    }

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
    public void onVideoAdClicked(MBridgeIds mBridgeIds) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f21831c;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.reportAdClicked();
        }
    }

    @Override // com.mbridge.msdk.out.RewardVideoWithCodeListener
    public void onVideoLoadFailWithCode(MBridgeIds mBridgeIds, int i10, String str) {
        h hVar;
        if (this.f21833e.a() && (hVar = this.f21830b) != null) {
            MintegralMediationAdapter.loadedSlotIdentifiers.remove(hVar);
        }
        AdError adErrorB = MintegralConstants.b(i10, str);
        Log.w(MintegralMediationAdapter.TAG, adErrorB.toString());
        this.f21829a.onFailure(adErrorB);
    }

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
    public void onVideoLoadSuccess(MBridgeIds mBridgeIds) {
        this.f21831c = (MediationRewardedAdCallback) this.f21829a.onSuccess(this);
    }

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
    public void onEndcardShow(MBridgeIds mBridgeIds) {
    }

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
    public void onLoadSuccess(MBridgeIds mBridgeIds) {
    }

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
    public void onVideoComplete(MBridgeIds mBridgeIds) {
    }
}
