package com.google.ads.mediation.vungle;

import N7.C1154e9;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.ads.mediation.vungle.a;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.VersionInfo;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
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
import com.google.android.gms.ads.rewarded.RewardItem;
import com.vungle.ads.AbstractC4059q;
import com.vungle.ads.C4045c;
import com.vungle.ads.VungleAds;
import com.vungle.ads.Z;
import com.vungle.ads.b0;
import com.vungle.ads.k0;
import com.vungle.mediation.VungleInterstitialAdapter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.l;
import q3.C5490a;
import s3.C5566a;
import s3.C5567b;
import s3.C5568c;
import s3.C5569d;
import s3.C5570e;
import s3.C5571f;
import s3.C5572g;
import t3.C5602a;

/* loaded from: classes.dex */
public class VungleMediationAdapter extends RtbAdapter implements MediationRewardedAd, b0 {
    public static final int ERROR_CANNOT_GET_BID_TOKEN = 108;
    public static final int ERROR_CANNOT_PLAY_AD = 107;
    public static final String ERROR_DOMAIN = "com.google.ads.mediation.vungle";
    public static final int ERROR_INITIALIZATION_FAILURE = 105;
    public static final int ERROR_INVALID_SERVER_PARAMETERS = 101;
    public static final int ERROR_REQUIRES_ACTIVITY_CONTEXT = 103;
    public static final String TAG = "VungleMediationAdapter";
    public static final String VUNGLE_SDK_ERROR_DOMAIN = "com.vungle.ads";
    private C4045c adConfig;
    private MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback;
    private MediationRewardedAdCallback mediationRewardedAdCallback;
    private Z rewardedAd;
    private C5566a rtbAppOpenAd;
    private C5568c rtbBannerAd;
    private C5570e rtbInterstitialAd;
    private C5571f rtbNativeAd;
    private C5572g rtbRewardedAd;
    private C5572g rtbRewardedInterstitialAd;
    private String userId;
    private final C5490a vungleFactory;
    private C5602a waterfallAppOpenAd;

    public class a implements a.InterfaceC0332a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InitializationCompleteCallback f22432a;

        public a(InitializationCompleteCallback initializationCompleteCallback) {
            this.f22432a = initializationCompleteCallback;
        }

        @Override // com.google.ads.mediation.vungle.a.InterfaceC0332a
        public final void a(AdError adError) {
            Log.w(VungleMediationAdapter.TAG, adError.toString());
            this.f22432a.onInitializationFailed(adError.toString());
        }

        @Override // com.google.ads.mediation.vungle.a.InterfaceC0332a
        public final void onInitializeSuccess() {
            this.f22432a.onInitializationSucceeded();
        }
    }

    public class b implements a.InterfaceC0332a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f22433a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f22434b;

        public b(Context context, String str) {
            this.f22433a = context;
            this.f22434b = str;
        }

        @Override // com.google.ads.mediation.vungle.a.InterfaceC0332a
        public final void a(AdError adError) {
            Log.w(VungleMediationAdapter.TAG, adError.toString());
            VungleMediationAdapter.this.mediationAdLoadCallback.onFailure(adError);
        }

        @Override // com.google.ads.mediation.vungle.a.InterfaceC0332a
        public final void onInitializeSuccess() {
            VungleMediationAdapter vungleMediationAdapter = VungleMediationAdapter.this;
            C5490a c5490a = vungleMediationAdapter.vungleFactory;
            C4045c adConfig = vungleMediationAdapter.adConfig;
            c5490a.getClass();
            Context context = this.f22433a;
            l.f(context, "context");
            String placementId = this.f22434b;
            l.f(placementId, "placementId");
            l.f(adConfig, "adConfig");
            vungleMediationAdapter.rewardedAd = new Z(context, placementId, adConfig);
            vungleMediationAdapter.rewardedAd.setAdListener(vungleMediationAdapter);
            if (!TextUtils.isEmpty(vungleMediationAdapter.userId)) {
                vungleMediationAdapter.rewardedAd.setUserId(vungleMediationAdapter.userId);
            }
            vungleMediationAdapter.rewardedAd.load(null);
        }
    }

    public static class c implements RewardItem {
        @Override // com.google.android.gms.ads.rewarded.RewardItem
        public final int getAmount() {
            return 1;
        }

        @Override // com.google.android.gms.ads.rewarded.RewardItem
        public final String getType() {
            return "vungle";
        }
    }

    public VungleMediationAdapter() {
        this.vungleFactory = new C5490a();
    }

    public static AdError getAdError(k0 k0Var) {
        return new AdError(k0Var.getCode(), k0Var.getErrorMessage(), VUNGLE_SDK_ERROR_DOMAIN);
    }

    public static String getAdapterVersion() {
        return "7.4.1.0";
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void collectSignals(RtbSignalData rtbSignalData, SignalCallbacks signalCallbacks) {
        Context context = rtbSignalData.getContext();
        l.f(context, "context");
        String biddingToken = VungleAds.Companion.getBiddingToken(context);
        if (TextUtils.isEmpty(biddingToken)) {
            AdError adError = new AdError(108, "Liftoff Monetize returned an empty bid token.", ERROR_DOMAIN);
            Log.w(TAG, adError.toString());
            signalCallbacks.onFailure(adError);
        } else {
            Log.d(TAG, "Liftoff Monetize bidding token=" + biddingToken);
            signalCallbacks.onSuccess(biddingToken);
        }
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public VersionInfo getSDKVersionInfo() {
        String sdkVersion = VungleAds.Companion.getSdkVersion();
        String[] strArrSplit = sdkVersion.split("\\.");
        if (strArrSplit.length >= 3) {
            return new VersionInfo(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2]));
        }
        Log.w(TAG, C1154e9.i("Unexpected SDK version format: ", sdkVersion, ". Returning 0.0.0 for SDK version."));
        return new VersionInfo(0, 0, 0);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public VersionInfo getVersionInfo() throws NumberFormatException {
        String adapterVersion = getAdapterVersion();
        String[] strArrSplit = adapterVersion.split("\\.");
        if (strArrSplit.length < 4) {
            Log.w(TAG, C1154e9.i("Unexpected adapter version format: ", adapterVersion, ". Returning 0.0.0 for adapter version."));
            return new VersionInfo(0, 0, 0);
        }
        return new VersionInfo(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[3]) + (Integer.parseInt(strArrSplit[2]) * 100));
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void initialize(Context context, InitializationCompleteCallback initializationCompleteCallback, List<MediationConfiguration> list) {
        if (VungleAds.Companion.isInitialized()) {
            initializationCompleteCallback.onInitializationSucceeded();
            return;
        }
        HashSet hashSet = new HashSet();
        Iterator<MediationConfiguration> it = list.iterator();
        while (it.hasNext()) {
            String string = it.next().getServerParameters().getString("appid");
            if (!TextUtils.isEmpty(string)) {
                hashSet.add(string);
            }
        }
        int size = hashSet.size();
        if (size > 0) {
            String str = (String) hashSet.iterator().next();
            if (size > 1) {
                Log.w(TAG, String.format("Multiple '%s' entries found: %s. Using '%s' to initialize the Vungle SDK.", "appid", hashSet, str));
            }
            com.google.ads.mediation.vungle.a.f22436c.a(str, context, new a(initializationCompleteCallback));
            return;
        }
        if (initializationCompleteCallback != null) {
            AdError adError = new AdError(101, "Missing or Invalid App ID.", ERROR_DOMAIN);
            Log.w(TAG, adError.toString());
            initializationCompleteCallback.onInitializationFailed(adError.toString());
        }
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadAppOpenAd(MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration, MediationAdLoadCallback<MediationAppOpenAd, MediationAppOpenAdCallback> mediationAdLoadCallback) {
        com.google.ads.mediation.vungle.a aVar = com.google.ads.mediation.vungle.a.f22436c;
        int iTaggedForChildDirectedTreatment = mediationAppOpenAdConfiguration.taggedForChildDirectedTreatment();
        aVar.getClass();
        com.google.ads.mediation.vungle.a.b(iTaggedForChildDirectedTreatment);
        C5490a vungleFactory = this.vungleFactory;
        l.f(mediationAdLoadCallback, "mediationAdLoadCallback");
        l.f(vungleFactory, "vungleFactory");
        C5602a c5602a = new C5602a(mediationAppOpenAdConfiguration, mediationAdLoadCallback, vungleFactory);
        this.waterfallAppOpenAd = c5602a;
        c5602a.c();
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadNativeAd(MediationNativeAdConfiguration mediationNativeAdConfiguration, MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback) {
        Log.d(TAG, "loadNativeAd()...");
        com.google.ads.mediation.vungle.a aVar = com.google.ads.mediation.vungle.a.f22436c;
        int iTaggedForChildDirectedTreatment = mediationNativeAdConfiguration.taggedForChildDirectedTreatment();
        aVar.getClass();
        com.google.ads.mediation.vungle.a.b(iTaggedForChildDirectedTreatment);
        C5571f c5571f = new C5571f(mediationNativeAdConfiguration, mediationAdLoadCallback, this.vungleFactory);
        this.rtbNativeAd = c5571f;
        c5571f.a();
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadRewardedAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        this.mediationAdLoadCallback = mediationAdLoadCallback;
        Bundle mediationExtras = mediationRewardedAdConfiguration.getMediationExtras();
        Bundle serverParameters = mediationRewardedAdConfiguration.getServerParameters();
        if (mediationExtras != null) {
            this.userId = mediationExtras.getString("userId");
        }
        String string = serverParameters.getString("appid");
        if (TextUtils.isEmpty(string)) {
            AdError adError = new AdError(101, "Failed to load waterfall rewarded ad from Liftoff Monetize. Missing or invalid App ID configured for this ad source instance in the AdMob or Ad Manager UI.", ERROR_DOMAIN);
            Log.w(TAG, adError.toString());
            mediationAdLoadCallback.onFailure(adError);
            return;
        }
        String string2 = serverParameters.getString("placementID");
        if (TextUtils.isEmpty(string2)) {
            AdError adError2 = new AdError(101, "Failed to load waterfall rewarded ad from Liftoff Monetize. Missing or Invalid Placement ID configured for this ad source instance in the AdMob or Ad Manager UI.", ERROR_DOMAIN);
            Log.w(TAG, adError2.toString());
            mediationAdLoadCallback.onFailure(adError2);
            return;
        }
        this.vungleFactory.getClass();
        this.adConfig = new C4045c();
        if (mediationExtras != null && mediationExtras.containsKey("adOrientation")) {
            this.adConfig.setAdOrientation(mediationExtras.getInt("adOrientation", 2));
        }
        com.google.ads.mediation.vungle.a aVar = com.google.ads.mediation.vungle.a.f22436c;
        int iTaggedForChildDirectedTreatment = mediationRewardedAdConfiguration.taggedForChildDirectedTreatment();
        aVar.getClass();
        com.google.ads.mediation.vungle.a.b(iTaggedForChildDirectedTreatment);
        Context context = mediationRewardedAdConfiguration.getContext();
        aVar.a(string, context, new b(context, string2));
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadRewardedInterstitialAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        String str = TAG;
        Log.d(str, "loadRewardedInterstitialAd()...");
        Log.d(str, "Liftoff Monetize adapter was asked to load a rewarded interstitial ad. Using the rewarded ad request flow to load the ad to attempt to load a rewarded interstitial ad from Liftoff Monetize.");
        loadRewardedAd(mediationRewardedAdConfiguration, mediationAdLoadCallback);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbAppOpenAd(MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration, MediationAdLoadCallback<MediationAppOpenAd, MediationAppOpenAdCallback> mediationAdLoadCallback) {
        com.google.ads.mediation.vungle.a aVar = com.google.ads.mediation.vungle.a.f22436c;
        int iTaggedForChildDirectedTreatment = mediationAppOpenAdConfiguration.taggedForChildDirectedTreatment();
        aVar.getClass();
        com.google.ads.mediation.vungle.a.b(iTaggedForChildDirectedTreatment);
        C5490a vungleFactory = this.vungleFactory;
        l.f(mediationAdLoadCallback, "mediationAdLoadCallback");
        l.f(vungleFactory, "vungleFactory");
        C5566a c5566a = new C5566a(mediationAppOpenAdConfiguration, mediationAdLoadCallback, vungleFactory);
        this.rtbAppOpenAd = c5566a;
        c5566a.c();
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbBannerAd(MediationBannerAdConfiguration mediationBannerAdConfiguration, MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        String str = TAG;
        Log.d(str, "loadRtbBannerAd()...");
        com.google.ads.mediation.vungle.a aVar = com.google.ads.mediation.vungle.a.f22436c;
        int iTaggedForChildDirectedTreatment = mediationBannerAdConfiguration.taggedForChildDirectedTreatment();
        aVar.getClass();
        com.google.ads.mediation.vungle.a.b(iTaggedForChildDirectedTreatment);
        C5568c c5568c = new C5568c(mediationBannerAdConfiguration, mediationAdLoadCallback, this.vungleFactory);
        this.rtbBannerAd = c5568c;
        Bundle serverParameters = mediationBannerAdConfiguration.getServerParameters();
        String string = serverParameters.getString("appid");
        if (TextUtils.isEmpty(string)) {
            AdError adError = new AdError(101, "Failed to load bidding banner ad from Liftoff Monetize. Missing or invalid App ID configured for this ad source instance in the AdMob or Ad Manager UI.", ERROR_DOMAIN);
            Log.e(str, adError.getMessage());
            mediationAdLoadCallback.onFailure(adError);
            return;
        }
        String string2 = serverParameters.getString("placementID");
        if (TextUtils.isEmpty(string2)) {
            AdError adError2 = new AdError(101, "Failed to load bidding banner ad from Liftoff Monetize. Missing or Invalid Placement ID configured for this ad source instance in the AdMob or Ad Manager UI.", ERROR_DOMAIN);
            Log.e(str, adError2.getMessage());
            mediationAdLoadCallback.onFailure(adError2);
        } else {
            Context context = mediationBannerAdConfiguration.getContext();
            AdSize adSize = mediationBannerAdConfiguration.getAdSize();
            aVar.a(string, context, new C5567b(c5568c, context, string2, adSize, VungleInterstitialAdapter.getVungleBannerAdSizeFromGoogleAdSize(adSize, string2), mediationBannerAdConfiguration.getBidResponse(), mediationBannerAdConfiguration.getWatermark()));
        }
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbInterstitialAd(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        String str = TAG;
        Log.d(str, "loadRtbInterstitialAd()...");
        com.google.ads.mediation.vungle.a aVar = com.google.ads.mediation.vungle.a.f22436c;
        int iTaggedForChildDirectedTreatment = mediationInterstitialAdConfiguration.taggedForChildDirectedTreatment();
        aVar.getClass();
        com.google.ads.mediation.vungle.a.b(iTaggedForChildDirectedTreatment);
        C5490a c5490a = this.vungleFactory;
        C5570e c5570e = new C5570e(mediationInterstitialAdConfiguration, mediationAdLoadCallback, c5490a);
        this.rtbInterstitialAd = c5570e;
        Bundle mediationExtras = mediationInterstitialAdConfiguration.getMediationExtras();
        Bundle serverParameters = mediationInterstitialAdConfiguration.getServerParameters();
        String string = serverParameters.getString("appid");
        if (TextUtils.isEmpty(string)) {
            AdError adError = new AdError(101, "Failed to load bidding interstitial ad from Liftoff Monetize. Missing or invalid App ID configured for this ad source instance in the AdMob or Ad Manager UI.", ERROR_DOMAIN);
            Log.w(str, adError.toString());
            mediationAdLoadCallback.onFailure(adError);
            return;
        }
        String string2 = serverParameters.getString("placementID");
        if (TextUtils.isEmpty(string2)) {
            AdError adError2 = new AdError(101, "Failed to load bidding interstitial ad from Liftoff Monetize. Missing or Invalid Placement ID configured for this ad source instance in the AdMob or Ad Manager UI.", ERROR_DOMAIN);
            Log.w(str, adError2.toString());
            mediationAdLoadCallback.onFailure(adError2);
            return;
        }
        String bidResponse = mediationInterstitialAdConfiguration.getBidResponse();
        c5490a.getClass();
        C4045c c4045c = new C4045c();
        if (mediationExtras.containsKey("adOrientation")) {
            c4045c.setAdOrientation(mediationExtras.getInt("adOrientation", 2));
        }
        String watermark = mediationInterstitialAdConfiguration.getWatermark();
        if (!TextUtils.isEmpty(watermark)) {
            c4045c.setWatermark(watermark);
        }
        Context context = mediationInterstitialAdConfiguration.getContext();
        aVar.a(string, context, new C5569d(c5570e, context, string2, c4045c, bidResponse));
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbNativeAd(MediationNativeAdConfiguration mediationNativeAdConfiguration, MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback) {
        Log.d(TAG, "loadRtbNativeAd()...");
        com.google.ads.mediation.vungle.a aVar = com.google.ads.mediation.vungle.a.f22436c;
        int iTaggedForChildDirectedTreatment = mediationNativeAdConfiguration.taggedForChildDirectedTreatment();
        aVar.getClass();
        com.google.ads.mediation.vungle.a.b(iTaggedForChildDirectedTreatment);
        C5571f c5571f = new C5571f(mediationNativeAdConfiguration, mediationAdLoadCallback, this.vungleFactory);
        this.rtbNativeAd = c5571f;
        c5571f.a();
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbRewardedAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        Log.d(TAG, "loadRtbRewardedAd()...");
        com.google.ads.mediation.vungle.a aVar = com.google.ads.mediation.vungle.a.f22436c;
        int iTaggedForChildDirectedTreatment = mediationRewardedAdConfiguration.taggedForChildDirectedTreatment();
        aVar.getClass();
        com.google.ads.mediation.vungle.a.b(iTaggedForChildDirectedTreatment);
        C5572g c5572g = new C5572g(mediationRewardedAdConfiguration, mediationAdLoadCallback, this.vungleFactory);
        this.rtbRewardedAd = c5572g;
        c5572g.a();
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbRewardedInterstitialAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        String str = TAG;
        Log.d(str, "loadRtbRewardedInterstitialAd()...");
        Log.d(str, "Liftoff Monetize adapter was asked to load a rewarded interstitial ad. Using the rewarded ad request flow to load the ad to attempt to load a rewarded interstitial ad from Liftoff Monetize.");
        com.google.ads.mediation.vungle.a aVar = com.google.ads.mediation.vungle.a.f22436c;
        int iTaggedForChildDirectedTreatment = mediationRewardedAdConfiguration.taggedForChildDirectedTreatment();
        aVar.getClass();
        com.google.ads.mediation.vungle.a.b(iTaggedForChildDirectedTreatment);
        C5572g c5572g = new C5572g(mediationRewardedAdConfiguration, mediationAdLoadCallback, this.vungleFactory);
        this.rtbRewardedInterstitialAd = c5572g;
        c5572g.a();
    }

    @Override // com.vungle.ads.b0, com.vungle.ads.A, com.vungle.ads.r
    public void onAdClicked(AbstractC4059q abstractC4059q) {
        Log.d(TAG, "Liftoff Monetize waterfall rewarded ad was clicked.");
        MediationRewardedAdCallback mediationRewardedAdCallback = this.mediationRewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.reportAdClicked();
        }
    }

    @Override // com.vungle.ads.b0, com.vungle.ads.A, com.vungle.ads.r
    public void onAdEnd(AbstractC4059q abstractC4059q) {
        Log.d(TAG, "Liftoff Monetize waterfall rewarded ad has ended.");
        MediationRewardedAdCallback mediationRewardedAdCallback = this.mediationRewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdClosed();
        }
    }

    @Override // com.vungle.ads.b0, com.vungle.ads.A, com.vungle.ads.r
    public void onAdFailedToLoad(AbstractC4059q abstractC4059q, k0 k0Var) {
        AdError adError = getAdError(k0Var);
        Log.w(TAG, "Failed to load waterfall rewarded ad from Liftoff Monetize with error: " + adError.toString());
        MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback = this.mediationAdLoadCallback;
        if (mediationAdLoadCallback != null) {
            mediationAdLoadCallback.onFailure(adError);
        }
    }

    @Override // com.vungle.ads.b0, com.vungle.ads.A, com.vungle.ads.r
    public void onAdFailedToPlay(AbstractC4059q abstractC4059q, k0 k0Var) {
        AdError adError = getAdError(k0Var);
        Log.w(TAG, "Failed to play waterfall rewarded ad from Liftoff Monetize with error: " + adError.toString());
        MediationRewardedAdCallback mediationRewardedAdCallback = this.mediationRewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdFailedToShow(adError);
        }
    }

    @Override // com.vungle.ads.b0, com.vungle.ads.A, com.vungle.ads.r
    public void onAdImpression(AbstractC4059q abstractC4059q) {
        this.mediationRewardedAdCallback.onVideoStart();
        this.mediationRewardedAdCallback.reportAdImpression();
    }

    @Override // com.vungle.ads.b0, com.vungle.ads.A, com.vungle.ads.r
    public void onAdLoaded(AbstractC4059q abstractC4059q) {
        Log.d(TAG, "Loaded waterfall rewarded ad from Liftoff Monetize.");
        MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback = this.mediationAdLoadCallback;
        if (mediationAdLoadCallback != null) {
            this.mediationRewardedAdCallback = mediationAdLoadCallback.onSuccess(this);
        }
    }

    @Override // com.vungle.ads.b0
    public void onAdRewarded(AbstractC4059q abstractC4059q) {
        Log.d(TAG, "Received reward from Liftoff Monetize waterfall rewarded ad.");
        MediationRewardedAdCallback mediationRewardedAdCallback = this.mediationRewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onVideoComplete();
            this.mediationRewardedAdCallback.onUserEarnedReward(new c());
        }
    }

    @Override // com.vungle.ads.b0, com.vungle.ads.A, com.vungle.ads.r
    public void onAdStart(AbstractC4059q abstractC4059q) {
        Log.d(TAG, "Liftoff Monetize waterfall rewarded ad has started.");
        MediationRewardedAdCallback mediationRewardedAdCallback = this.mediationRewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdOpened();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public void showAd(Context context) throws Throwable {
        Z z10 = this.rewardedAd;
        if (z10 != null) {
            z10.play(context);
        } else if (this.mediationRewardedAdCallback != null) {
            AdError adError = new AdError(107, "Failed to show waterfall rewarded ad from Liftoff Monetize.", ERROR_DOMAIN);
            Log.w(TAG, adError.toString());
            this.mediationRewardedAdCallback.onAdFailedToShow(adError);
        }
    }

    public VungleMediationAdapter(C5490a c5490a) {
        this.vungleFactory = c5490a;
    }

    @Override // com.vungle.ads.b0, com.vungle.ads.A, com.vungle.ads.r
    public void onAdLeftApplication(AbstractC4059q abstractC4059q) {
    }
}
