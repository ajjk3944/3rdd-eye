package com.google.ads.mediation.facebook;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.widget.FrameLayout;
import com.facebook.ads.AdSettings;
import com.facebook.ads.AdView;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.BidderTokenProvider;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAdBase;
import com.google.ads.mediation.facebook.a;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.VersionInfo;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;
import com.google.android.gms.ads.mediation.MediationAdConfiguration;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbSignalData;
import com.google.android.gms.ads.mediation.rtb.SignalCallbacks;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o3.C5419a;
import o3.C5420b;
import p3.C5448a;
import p3.C5449b;
import p3.C5450c;
import p3.C5450c.b;

/* loaded from: classes.dex */
public class FacebookMediationAdapter extends RtbAdapter {
    public static final int ERROR_ADVIEW_CONSTRUCTOR_EXCEPTION = 111;
    public static final int ERROR_BANNER_SIZE_MISMATCH = 102;
    public static final int ERROR_CREATE_NATIVE_AD_FROM_BID_PAYLOAD = 109;
    public static final String ERROR_DOMAIN = "com.google.ads.mediation.facebook";
    public static final int ERROR_FACEBOOK_INITIALIZATION = 104;
    public static final int ERROR_FAILED_TO_PRESENT_AD = 110;
    public static final int ERROR_INVALID_SERVER_PARAMETERS = 101;
    public static final int ERROR_MAPPING_NATIVE_ASSETS = 108;
    public static final int ERROR_NULL_CONTEXT = 107;
    public static final int ERROR_REQUIRES_ACTIVITY_CONTEXT = 103;
    public static final int ERROR_REQUIRES_UNIFIED_NATIVE_ADS = 105;
    public static final int ERROR_WRONG_NATIVE_TYPE = 106;
    public static final String FACEBOOK_SDK_ERROR_DOMAIN = "com.facebook.ads";
    public static final String KEY_ID = "id";
    public static final String KEY_SOCIAL_CONTEXT_ASSET = "social_context";
    public static final String PLACEMENT_PARAMETER = "pubid";
    public static final String RTB_PLACEMENT_PARAMETER = "placement_id";
    public static final String TAG = "FacebookMediationAdapter";

    public class a implements a.InterfaceC0331a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InitializationCompleteCallback f22427a;

        public a(InitializationCompleteCallback initializationCompleteCallback) {
            this.f22427a = initializationCompleteCallback;
        }

        @Override // com.google.ads.mediation.facebook.a.InterfaceC0331a
        public final void a(AdError adError) {
            this.f22427a.onInitializationFailed(adError.getMessage());
        }

        @Override // com.google.ads.mediation.facebook.a.InterfaceC0331a
        public final void onInitializeSuccess() {
            this.f22427a.onInitializationSucceeded();
        }
    }

    public static AdError getAdError(com.facebook.ads.AdError adError) {
        return new AdError(adError.getErrorCode(), adError.getErrorMessage(), "com.facebook.ads");
    }

    public static String getPlacementID(Bundle bundle) {
        String string = bundle.getString(RTB_PLACEMENT_PARAMETER);
        return string == null ? bundle.getString("pubid") : string;
    }

    public static void setMixedAudience(MediationAdConfiguration mediationAdConfiguration) {
        if (mediationAdConfiguration.taggedForChildDirectedTreatment() == 1) {
            AdSettings.setMixedAudience(true);
        } else if (mediationAdConfiguration.taggedForChildDirectedTreatment() == 0) {
            AdSettings.setMixedAudience(false);
        }
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void collectSignals(RtbSignalData rtbSignalData, SignalCallbacks signalCallbacks) {
        signalCallbacks.onSuccess(BidderTokenProvider.getBidderToken(rtbSignalData.getContext()));
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public VersionInfo getSDKVersionInfo() {
        String[] strArrSplit = "6.15.0".split("\\.");
        if (strArrSplit.length >= 3) {
            return new VersionInfo(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2]));
        }
        Log.w(TAG, "Unexpected SDK version format: 6.15.0.Returning 0.0.0 for SDK version.");
        return new VersionInfo(0, 0, 0);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public VersionInfo getVersionInfo() throws NumberFormatException {
        String[] strArrSplit = "6.15.0.0".split("\\.");
        if (strArrSplit.length < 4) {
            Log.w(TAG, "Unexpected adapter version format: 6.15.0.0.Returning 0.0.0 for adapter version.");
            return new VersionInfo(0, 0, 0);
        }
        return new VersionInfo(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[3]) + (Integer.parseInt(strArrSplit[2]) * 100));
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void initialize(Context context, InitializationCompleteCallback initializationCompleteCallback, List<MediationConfiguration> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<MediationConfiguration> it = list.iterator();
        while (it.hasNext()) {
            String placementID = getPlacementID(it.next().getServerParameters());
            if (!TextUtils.isEmpty(placementID)) {
                arrayList.add(placementID);
            }
        }
        if (arrayList.isEmpty()) {
            initializationCompleteCallback.onInitializationFailed("Initialization failed. No placement IDs found.");
            return;
        }
        if (com.google.ads.mediation.facebook.a.f22428d == null) {
            com.google.ads.mediation.facebook.a.f22428d = new com.google.ads.mediation.facebook.a();
        }
        com.google.ads.mediation.facebook.a aVar = com.google.ads.mediation.facebook.a.f22428d;
        a aVar2 = new a(initializationCompleteCallback);
        if (aVar.f22429a) {
            aVar.f22431c.add(aVar2);
            return;
        }
        if (aVar.f22430b) {
            aVar2.onInitializeSuccess();
            return;
        }
        aVar.f22429a = true;
        if (aVar == null) {
            com.google.ads.mediation.facebook.a.f22428d = new com.google.ads.mediation.facebook.a();
        }
        com.google.ads.mediation.facebook.a.f22428d.f22431c.add(aVar2);
        AudienceNetworkAds.buildInitSettings(context).withMediationService("GOOGLE:6.15.0.0").withPlacementIds(arrayList).withInitListener(aVar).initialize();
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbBannerAd(MediationBannerAdConfiguration mediationBannerAdConfiguration, MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        C5448a c5448a = new C5448a(mediationBannerAdConfiguration, mediationAdLoadCallback);
        String placementID = getPlacementID(mediationBannerAdConfiguration.getServerParameters());
        if (TextUtils.isEmpty(placementID)) {
            AdError adError = new AdError(101, "Failed to request ad. PlacementID is null or empty.", ERROR_DOMAIN);
            Log.e(TAG, adError.getMessage());
            mediationAdLoadCallback.onFailure(adError);
            return;
        }
        setMixedAudience(mediationBannerAdConfiguration);
        try {
            c5448a.f45102c = new AdView(mediationBannerAdConfiguration.getContext(), placementID, mediationBannerAdConfiguration.getBidResponse());
            if (!TextUtils.isEmpty(mediationBannerAdConfiguration.getWatermark())) {
                c5448a.f45102c.setExtraHints(new ExtraHints.Builder().mediationData(mediationBannerAdConfiguration.getWatermark()).build());
            }
            Context context = mediationBannerAdConfiguration.getContext();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(mediationBannerAdConfiguration.getAdSize().getWidthInPixels(context), -2);
            c5448a.f45103d = new FrameLayout(context);
            c5448a.f45102c.setLayoutParams(layoutParams);
            c5448a.f45103d.addView(c5448a.f45102c);
            AdView adView = c5448a.f45102c;
            adView.loadAd(adView.buildLoadAdConfig().withAdListener(c5448a).withBid(mediationBannerAdConfiguration.getBidResponse()).build());
        } catch (Exception e4) {
            AdError adError2 = new AdError(111, "Failed to create banner ad: " + e4.getMessage(), ERROR_DOMAIN);
            Log.e(TAG, adError2.getMessage());
            mediationAdLoadCallback.onFailure(adError2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbInterstitialAd(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        C5449b c5449b = new C5449b(mediationInterstitialAdConfiguration, mediationAdLoadCallback);
        MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration2 = c5449b.f45105b;
        String placementID = getPlacementID(mediationInterstitialAdConfiguration2.getServerParameters());
        if (TextUtils.isEmpty(placementID)) {
            AdError adError = new AdError(101, "Failed to request ad. PlacementID is null or empty. ", ERROR_DOMAIN);
            Log.e(TAG, adError.getMessage());
            c5449b.f45106c.onFailure(adError);
        } else {
            setMixedAudience(mediationInterstitialAdConfiguration2);
            c5449b.f45107d = new InterstitialAd(mediationInterstitialAdConfiguration2.getContext(), placementID);
            if (!TextUtils.isEmpty(mediationInterstitialAdConfiguration2.getWatermark())) {
                c5449b.f45107d.setExtraHints(new ExtraHints.Builder().mediationData(mediationInterstitialAdConfiguration2.getWatermark()).build());
            }
            InterstitialAd interstitialAd = c5449b.f45107d;
            interstitialAd.loadAd(interstitialAd.buildLoadAdConfig().withBid(mediationInterstitialAdConfiguration2.getBidResponse()).withAdListener(c5449b).build());
        }
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbNativeAd(MediationNativeAdConfiguration mediationNativeAdConfiguration, MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback) {
        C5450c c5450c = new C5450c(mediationNativeAdConfiguration, mediationAdLoadCallback);
        MediationNativeAdConfiguration mediationNativeAdConfiguration2 = c5450c.f45111b;
        String placementID = getPlacementID(mediationNativeAdConfiguration2.getServerParameters());
        boolean zIsEmpty = TextUtils.isEmpty(placementID);
        MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback2 = c5450c.f45112c;
        if (zIsEmpty) {
            AdError adError = new AdError(101, "Failed to request ad. PlacementID is null or empty.", ERROR_DOMAIN);
            Log.e(TAG, adError.getMessage());
            mediationAdLoadCallback2.onFailure(adError);
            return;
        }
        setMixedAudience(mediationNativeAdConfiguration2);
        c5450c.f45115f = new MediaView(mediationNativeAdConfiguration2.getContext());
        try {
            c5450c.f45113d = NativeAdBase.fromBidPayload(mediationNativeAdConfiguration2.getContext(), placementID, mediationNativeAdConfiguration2.getBidResponse());
            if (!TextUtils.isEmpty(mediationNativeAdConfiguration2.getWatermark())) {
                c5450c.f45113d.setExtraHints(new ExtraHints.Builder().mediationData(mediationNativeAdConfiguration2.getWatermark()).build());
            }
            NativeAdBase nativeAdBase = c5450c.f45113d;
            nativeAdBase.loadAd(nativeAdBase.buildLoadAdConfig().withAdListener(c5450c.new b(mediationNativeAdConfiguration2.getContext(), c5450c.f45113d)).withBid(mediationNativeAdConfiguration2.getBidResponse()).withMediaCacheFlag(NativeAdBase.MediaCacheFlag.ALL).withPreloadedIconView(-1, -1).build());
        } catch (Exception e4) {
            AdError adError2 = new AdError(109, "Failed to create native ad from bid payload: " + e4.getMessage(), ERROR_DOMAIN);
            Log.w(TAG, adError2.getMessage());
            mediationAdLoadCallback2.onFailure(adError2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbRewardedAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        new C5419a(mediationRewardedAdConfiguration, mediationAdLoadCallback).b();
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbRewardedInterstitialAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        new C5420b(mediationRewardedAdConfiguration, mediationAdLoadCallback).b();
    }
}
