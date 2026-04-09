package i3;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.ads.Ad;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdView;
import com.facebook.ads.ExtraHints;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import h3.e;

/* loaded from: classes.dex */
public class a implements MediationBannerAd, AdListener {

    /* renamed from: a, reason: collision with root package name */
    public final MediationAdLoadCallback f21568a;

    /* renamed from: b, reason: collision with root package name */
    public AdView f21569b;

    /* renamed from: c, reason: collision with root package name */
    public FrameLayout f21570c;

    /* renamed from: d, reason: collision with root package name */
    public MediationBannerAdCallback f21571d;

    /* renamed from: e, reason: collision with root package name */
    public final e f21572e;

    public a(MediationAdLoadCallback mediationAdLoadCallback, e eVar) {
        this.f21568a = mediationAdLoadCallback;
        this.f21572e = eVar;
    }

    public void a(MediationBannerAdConfiguration mediationBannerAdConfiguration) {
        String placementID = FacebookMediationAdapter.getPlacementID(mediationBannerAdConfiguration.getServerParameters());
        if (TextUtils.isEmpty(placementID)) {
            AdError adError = new AdError(101, "Failed to request ad. PlacementID is null or empty.", FacebookMediationAdapter.ERROR_DOMAIN);
            Log.e(FacebookMediationAdapter.TAG, adError.getMessage());
            this.f21568a.onFailure(adError);
            return;
        }
        FacebookMediationAdapter.setMixedAudience(mediationBannerAdConfiguration);
        try {
            this.f21569b = this.f21572e.d(mediationBannerAdConfiguration.getContext(), placementID, mediationBannerAdConfiguration.getBidResponse());
            if (!TextUtils.isEmpty(mediationBannerAdConfiguration.getWatermark())) {
                this.f21569b.setExtraHints(new ExtraHints.Builder().mediationData(mediationBannerAdConfiguration.getWatermark()).build());
            }
            Context context = mediationBannerAdConfiguration.getContext();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(mediationBannerAdConfiguration.getAdSize().getWidthInPixels(context), -2);
            this.f21570c = new FrameLayout(context);
            this.f21569b.setLayoutParams(layoutParams);
            this.f21570c.addView(this.f21569b);
            AdView adView = this.f21569b;
            adView.loadAd(adView.buildLoadAdConfig().withAdListener(this).withBid(mediationBannerAdConfiguration.getBidResponse()).build());
        } catch (Exception e10) {
            AdError adError2 = new AdError(111, "Failed to create banner ad: " + e10.getMessage(), FacebookMediationAdapter.ERROR_DOMAIN);
            Log.e(FacebookMediationAdapter.TAG, adError2.getMessage());
            this.f21568a.onFailure(adError2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAd
    public View getView() {
        return this.f21570c;
    }

    @Override // com.facebook.ads.AdListener
    public void onAdClicked(Ad ad) {
        MediationBannerAdCallback mediationBannerAdCallback = this.f21571d;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdClicked();
            this.f21571d.onAdOpened();
            this.f21571d.onAdLeftApplication();
        }
    }

    @Override // com.facebook.ads.AdListener
    public void onAdLoaded(Ad ad) {
        this.f21571d = (MediationBannerAdCallback) this.f21568a.onSuccess(this);
    }

    @Override // com.facebook.ads.AdListener
    public void onError(Ad ad, com.facebook.ads.AdError adError) {
        AdError adError2 = FacebookMediationAdapter.getAdError(adError);
        Log.w(FacebookMediationAdapter.TAG, adError2.getMessage());
        this.f21568a.onFailure(adError2);
    }

    @Override // com.facebook.ads.AdListener
    public void onLoggingImpression(Ad ad) {
        MediationBannerAdCallback mediationBannerAdCallback = this.f21571d;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdImpression();
        }
    }
}
