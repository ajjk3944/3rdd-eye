package k3;

import android.util.Log;
import com.google.ads.mediation.mintegral.MintegralConstants;
import com.google.ads.mediation.mintegral.MintegralMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.mbridge.msdk.newinterstitial.out.NewInterstitialWithCodeListener;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.RewardInfo;
import j3.h;
import j3.j;

/* loaded from: classes.dex */
public abstract class c extends NewInterstitialWithCodeListener implements MediationInterstitialAd {

    /* renamed from: a, reason: collision with root package name */
    public final MediationAdLoadCallback f21813a;

    /* renamed from: b, reason: collision with root package name */
    public h f21814b;

    /* renamed from: c, reason: collision with root package name */
    public MediationInterstitialAdCallback f21815c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f21816d;

    /* renamed from: e, reason: collision with root package name */
    public final j3.a f21817e;

    public c(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, MediationAdLoadCallback mediationAdLoadCallback, j3.a aVar) {
        this.f21816d = j.f(mediationInterstitialAdConfiguration.getMediationExtras());
        this.f21813a = mediationAdLoadCallback;
        this.f21817e = aVar;
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public void onAdClicked(MBridgeIds mBridgeIds) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f21815c;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.reportAdClicked();
        }
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public void onAdClose(MBridgeIds mBridgeIds, RewardInfo rewardInfo) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f21815c;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdClosed();
        }
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public void onAdShow(MBridgeIds mBridgeIds) {
        h hVar;
        if (this.f21817e.a() && (hVar = this.f21814b) != null) {
            MintegralMediationAdapter.loadedSlotIdentifiers.remove(hVar);
        }
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f21815c;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdOpened();
            this.f21815c.reportAdImpression();
        }
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialWithCodeListener
    public void onResourceLoadFailWithCode(MBridgeIds mBridgeIds, int i10, String str) {
        h hVar;
        if (this.f21817e.a() && (hVar = this.f21814b) != null) {
            MintegralMediationAdapter.loadedSlotIdentifiers.remove(hVar);
        }
        AdError adErrorB = MintegralConstants.b(i10, str);
        Log.w(MintegralMediationAdapter.TAG, adErrorB.toString());
        this.f21813a.onFailure(adErrorB);
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public void onResourceLoadSuccess(MBridgeIds mBridgeIds) {
        this.f21815c = (MediationInterstitialAdCallback) this.f21813a.onSuccess(this);
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialWithCodeListener
    public void onShowFailWithCode(MBridgeIds mBridgeIds, int i10, String str) {
        h hVar;
        if (this.f21817e.a() && (hVar = this.f21814b) != null) {
            MintegralMediationAdapter.loadedSlotIdentifiers.remove(hVar);
        }
        AdError adErrorB = MintegralConstants.b(i10, str);
        Log.w(MintegralMediationAdapter.TAG, adErrorB.toString());
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f21815c;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdFailedToShow(adErrorB);
        }
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public void onEndcardShow(MBridgeIds mBridgeIds) {
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public void onLoadCampaignSuccess(MBridgeIds mBridgeIds) {
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public void onVideoComplete(MBridgeIds mBridgeIds) {
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public void onAdCloseWithNIReward(MBridgeIds mBridgeIds, RewardInfo rewardInfo) {
    }
}
