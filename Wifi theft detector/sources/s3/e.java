package s3;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.ads.mediation.vungle.a;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.vungle.ads.AdConfig;
import com.vungle.ads.BaseAd;
import com.vungle.ads.VungleError;
import com.vungle.ads.w;
import com.vungle.ads.x;

/* loaded from: classes.dex */
public class e implements MediationRewardedAd, x {

    /* renamed from: a, reason: collision with root package name */
    public final MediationAdLoadCallback f24276a;

    /* renamed from: b, reason: collision with root package name */
    public MediationRewardedAdCallback f24277b;

    /* renamed from: c, reason: collision with root package name */
    public w f24278c;

    /* renamed from: d, reason: collision with root package name */
    public final q3.b f24279d;

    public class a implements a.InterfaceC0194a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f24280a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f24281b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ AdConfig f24282c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f24283d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f24284e;

        public a(Context context, String str, AdConfig adConfig, String str2, String str3) {
            this.f24280a = context;
            this.f24281b = str;
            this.f24282c = adConfig;
            this.f24283d = str2;
            this.f24284e = str3;
        }

        @Override // com.google.ads.mediation.vungle.a.InterfaceC0194a
        public void a(AdError adError) {
            Log.w(VungleMediationAdapter.TAG, adError.toString());
            e.this.f24276a.onFailure(adError);
        }

        @Override // com.google.ads.mediation.vungle.a.InterfaceC0194a
        public void onInitializeSuccess() {
            e eVar = e.this;
            eVar.f24278c = eVar.f24279d.e(this.f24280a, this.f24281b, this.f24282c);
            e.this.f24278c.setAdListener(e.this);
            if (!TextUtils.isEmpty(this.f24283d)) {
                e.this.f24278c.setUserId(this.f24283d);
            }
            e.this.f24278c.load(this.f24284e);
        }
    }

    public e(MediationAdLoadCallback mediationAdLoadCallback, q3.b bVar) {
        this.f24276a = mediationAdLoadCallback;
        this.f24279d = bVar;
    }

    public void e(MediationRewardedAdConfiguration mediationRewardedAdConfiguration) {
        Bundle mediationExtras = mediationRewardedAdConfiguration.getMediationExtras();
        Bundle serverParameters = mediationRewardedAdConfiguration.getServerParameters();
        String string = mediationExtras.getString("userId");
        String string2 = serverParameters.getString("appid");
        if (TextUtils.isEmpty(string2)) {
            AdError adError = new AdError(101, "Failed to load bidding rewarded ad from Liftoff Monetize. Missing or invalid App ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.w(VungleMediationAdapter.TAG, adError.toString());
            this.f24276a.onFailure(adError);
            return;
        }
        String string3 = serverParameters.getString("placementID");
        if (TextUtils.isEmpty(string3)) {
            AdError adError2 = new AdError(101, "Failed to load bidding rewarded ad from Liftoff Monetize. Missing or invalid Placement ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.w(VungleMediationAdapter.TAG, adError2.toString());
            this.f24276a.onFailure(adError2);
            return;
        }
        String bidResponse = mediationRewardedAdConfiguration.getBidResponse();
        AdConfig adConfigA = this.f24279d.a();
        if (mediationExtras.containsKey("adOrientation")) {
            adConfigA.setAdOrientation(mediationExtras.getInt("adOrientation", 2));
        }
        String watermark = mediationRewardedAdConfiguration.getWatermark();
        if (!TextUtils.isEmpty(watermark)) {
            adConfigA.setWatermark(watermark);
        }
        Context context = mediationRewardedAdConfiguration.getContext();
        com.google.ads.mediation.vungle.a.a().b(string2, context, new a(context, string3, adConfigA, string, bidResponse));
    }

    @Override // com.vungle.ads.x, com.vungle.ads.k, com.vungle.ads.g
    public void onAdClicked(BaseAd baseAd) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f24277b;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.reportAdClicked();
        }
    }

    @Override // com.vungle.ads.x, com.vungle.ads.k, com.vungle.ads.g
    public void onAdEnd(BaseAd baseAd) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f24277b;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdClosed();
        }
    }

    @Override // com.vungle.ads.x, com.vungle.ads.k, com.vungle.ads.g
    public void onAdFailedToLoad(BaseAd baseAd, VungleError vungleError) {
        AdError adError = VungleMediationAdapter.getAdError(vungleError);
        Log.w(VungleMediationAdapter.TAG, adError.toString());
        this.f24276a.onFailure(adError);
    }

    @Override // com.vungle.ads.x, com.vungle.ads.k, com.vungle.ads.g
    public void onAdFailedToPlay(BaseAd baseAd, VungleError vungleError) {
        AdError adError = VungleMediationAdapter.getAdError(vungleError);
        Log.w(VungleMediationAdapter.TAG, adError.toString());
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f24277b;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdFailedToShow(adError);
        }
    }

    @Override // com.vungle.ads.x, com.vungle.ads.k, com.vungle.ads.g
    public void onAdImpression(BaseAd baseAd) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f24277b;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onVideoStart();
            this.f24277b.reportAdImpression();
        }
    }

    @Override // com.vungle.ads.x, com.vungle.ads.k, com.vungle.ads.g
    public void onAdLoaded(BaseAd baseAd) {
        this.f24277b = (MediationRewardedAdCallback) this.f24276a.onSuccess(this);
    }

    @Override // com.vungle.ads.x
    public void onAdRewarded(BaseAd baseAd) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f24277b;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onVideoComplete();
            this.f24277b.onUserEarnedReward();
        }
    }

    @Override // com.vungle.ads.x, com.vungle.ads.k, com.vungle.ads.g
    public void onAdStart(BaseAd baseAd) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f24277b;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdOpened();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public void showAd(Context context) {
        w wVar = this.f24278c;
        if (wVar != null) {
            wVar.play(context);
        } else if (this.f24277b != null) {
            AdError adError = new AdError(107, "Failed to show bidding rewardedad from Liftoff Monetize.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.w(VungleMediationAdapter.TAG, adError.toString());
            this.f24277b.onAdFailedToShow(adError);
        }
    }

    @Override // com.vungle.ads.x, com.vungle.ads.k, com.vungle.ads.g
    public void onAdLeftApplication(BaseAd baseAd) {
    }
}
