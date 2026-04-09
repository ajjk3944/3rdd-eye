package r3;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.ads.mediation.vungle.a;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.vungle.ads.BaseAd;
import com.vungle.ads.VungleBannerView;
import com.vungle.ads.VungleError;
import com.vungle.ads.a0;
import com.vungle.ads.f;
import com.vungle.mediation.VungleInterstitialAdapter;

/* loaded from: classes.dex */
public abstract class b implements MediationBannerAd, f {

    /* renamed from: a, reason: collision with root package name */
    public final MediationAdLoadCallback f24150a;

    /* renamed from: b, reason: collision with root package name */
    public MediationBannerAdCallback f24151b;

    /* renamed from: c, reason: collision with root package name */
    public VungleBannerView f24152c;

    /* renamed from: d, reason: collision with root package name */
    public final q3.b f24153d;

    public class a implements a.InterfaceC0194a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f24154a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f24155b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a0 f24156c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ MediationBannerAdConfiguration f24157d;

        public a(Context context, String str, a0 a0Var, MediationBannerAdConfiguration mediationBannerAdConfiguration) {
            this.f24154a = context;
            this.f24155b = str;
            this.f24156c = a0Var;
            this.f24157d = mediationBannerAdConfiguration;
        }

        @Override // com.google.ads.mediation.vungle.a.InterfaceC0194a
        public void a(AdError adError) {
            Log.w(VungleMediationAdapter.TAG, adError.toString());
            b.this.f24150a.onFailure(adError);
        }

        @Override // com.google.ads.mediation.vungle.a.InterfaceC0194a
        public void onInitializeSuccess() {
            b.this.c(this.f24154a, this.f24155b, this.f24156c, this.f24157d);
        }
    }

    public b(MediationAdLoadCallback mediationAdLoadCallback, q3.b bVar) {
        this.f24150a = mediationAdLoadCallback;
        this.f24153d = bVar;
    }

    public final void c(Context context, String str, a0 a0Var, MediationBannerAdConfiguration mediationBannerAdConfiguration) {
        VungleBannerView vungleBannerViewB = this.f24153d.b(context, str, a0Var);
        this.f24152c = vungleBannerViewB;
        vungleBannerViewB.setAdListener(this);
        d(this.f24152c, mediationBannerAdConfiguration);
    }

    public abstract void d(VungleBannerView vungleBannerView, MediationBannerAdConfiguration mediationBannerAdConfiguration);

    public void e(MediationBannerAdConfiguration mediationBannerAdConfiguration) {
        Bundle serverParameters = mediationBannerAdConfiguration.getServerParameters();
        String string = serverParameters.getString("appid");
        if (TextUtils.isEmpty(string)) {
            AdError adError = new AdError(101, "Failed to load bidding banner ad from Liftoff Monetize. Missing or invalid App ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.e(VungleMediationAdapter.TAG, adError.getMessage());
            this.f24150a.onFailure(adError);
            return;
        }
        String string2 = serverParameters.getString("placementID");
        if (TextUtils.isEmpty(string2)) {
            AdError adError2 = new AdError(101, "Failed to load bidding banner ad from Liftoff Monetize. Missing or Invalid Placement ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.e(VungleMediationAdapter.TAG, adError2.getMessage());
            this.f24150a.onFailure(adError2);
        } else {
            Context context = mediationBannerAdConfiguration.getContext();
            com.google.ads.mediation.vungle.a.a().b(string, context, new a(context, string2, VungleInterstitialAdapter.getVungleBannerAdSizeFromGoogleAdSize(mediationBannerAdConfiguration.getAdSize(), string2), mediationBannerAdConfiguration));
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAd
    public View getView() {
        return this.f24152c;
    }

    @Override // com.vungle.ads.f, com.vungle.ads.g
    public void onAdClicked(BaseAd baseAd) {
        MediationBannerAdCallback mediationBannerAdCallback = this.f24151b;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdClicked();
            this.f24151b.onAdOpened();
        }
    }

    @Override // com.vungle.ads.f, com.vungle.ads.g
    public void onAdFailedToLoad(BaseAd baseAd, VungleError vungleError) {
        AdError adError = VungleMediationAdapter.getAdError(vungleError);
        Log.w(VungleMediationAdapter.TAG, adError.toString());
        this.f24150a.onFailure(adError);
    }

    @Override // com.vungle.ads.f, com.vungle.ads.g
    public void onAdFailedToPlay(BaseAd baseAd, VungleError vungleError) {
        Log.w(VungleMediationAdapter.TAG, VungleMediationAdapter.getAdError(vungleError).toString());
    }

    @Override // com.vungle.ads.f, com.vungle.ads.g
    public void onAdImpression(BaseAd baseAd) {
        MediationBannerAdCallback mediationBannerAdCallback = this.f24151b;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdImpression();
        }
    }

    @Override // com.vungle.ads.f, com.vungle.ads.g
    public void onAdLeftApplication(BaseAd baseAd) {
        MediationBannerAdCallback mediationBannerAdCallback = this.f24151b;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdLeftApplication();
        }
    }

    @Override // com.vungle.ads.f, com.vungle.ads.g
    public void onAdLoaded(BaseAd baseAd) {
        this.f24151b = (MediationBannerAdCallback) this.f24150a.onSuccess(this);
    }

    @Override // com.vungle.ads.f, com.vungle.ads.g
    public void onAdEnd(BaseAd baseAd) {
    }

    @Override // com.vungle.ads.f, com.vungle.ads.g
    public void onAdStart(BaseAd baseAd) {
    }
}
