package com.google.ads.mediation.pangle;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.api.PAGConstant;
import com.bytedance.sdk.openadsdk.api.bidding.PAGBiddingRequest;
import com.bytedance.sdk.openadsdk.api.init.BiddingTokenCallback;
import com.bytedance.sdk.openadsdk.api.init.PAGConfig;
import com.google.ads.mediation.pangle.a;
import com.google.android.gms.ads.AdError;
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
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import n3.c;
import o3.d;
import o3.f;

/* loaded from: classes.dex */
public class PangleMediationAdapter extends RtbAdapter {
    public static final String TAG = "PangleMediationAdapter";

    /* renamed from: i, reason: collision with root package name */
    public static int f9545i = -1;

    /* renamed from: a, reason: collision with root package name */
    public final com.google.ads.mediation.pangle.a f9546a = com.google.ads.mediation.pangle.a.a();

    /* renamed from: b, reason: collision with root package name */
    public final c f9547b = new c();

    /* renamed from: c, reason: collision with root package name */
    public final n3.a f9548c = new n3.a();

    /* renamed from: d, reason: collision with root package name */
    public o3.a f9549d;

    /* renamed from: e, reason: collision with root package name */
    public o3.b f9550e;

    /* renamed from: f, reason: collision with root package name */
    public o3.c f9551f;

    /* renamed from: g, reason: collision with root package name */
    public d f9552g;

    /* renamed from: h, reason: collision with root package name */
    public f f9553h;

    public class a implements BiddingTokenCallback {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ SignalCallbacks f9554a;

        public a(SignalCallbacks signalCallbacks) {
            this.f9554a = signalCallbacks;
        }

        @Override // com.bytedance.sdk.openadsdk.api.init.BiddingTokenCallback
        public void onBiddingTokenCollected(String str) {
            this.f9554a.onSuccess(str);
        }
    }

    public class b implements a.InterfaceC0193a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InitializationCompleteCallback f9556a;

        public b(InitializationCompleteCallback initializationCompleteCallback) {
            this.f9556a = initializationCompleteCallback;
        }

        @Override // com.google.ads.mediation.pangle.a.InterfaceC0193a
        public void a(AdError adError) {
            Log.w(PangleMediationAdapter.TAG, adError.toString());
            this.f9556a.onInitializationFailed(adError.getMessage());
        }

        @Override // com.google.ads.mediation.pangle.a.InterfaceC0193a
        public void onInitializeSuccess() {
            this.f9556a.onInitializationSucceeded();
        }
    }

    public static void a(int i10, c cVar) {
        if (i10 != 1 && i10 != 0 && i10 != -1) {
            Log.w(TAG, "Invalid GDPR value. Pangle SDK only accepts -1, 0 or 1.");
            return;
        }
        if (cVar.d() && !PangleConstants.d()) {
            cVar.j(i10);
        }
        f9545i = i10;
    }

    public static void b(int i10, c cVar) {
        if (i10 == 1 || i10 == 0) {
            cVar.k(i10);
        } else {
            Log.w(TAG, "Invalid PA value. Pangle SDK only accepts 0 or 1.");
        }
    }

    public static int getGDPRConsent() {
        return f9545i;
    }

    public static int getPAConsent() {
        return PAGConfig.getPAConsent();
    }

    public static void setGDPRConsent(@PAGConstant.PAGGDPRConsentType int i10) {
        a(i10, new c());
    }

    public static void setPAConsent(@PAGConstant.PAGPAConsentType int i10) {
        b(i10, new c());
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void collectSignals(@NonNull RtbSignalData rtbSignalData, @NonNull SignalCallbacks signalCallbacks) {
        if (PangleConstants.d()) {
            signalCallbacks.onFailure(PangleConstants.b());
            return;
        }
        Bundle networkExtras = rtbSignalData.getNetworkExtras();
        if (networkExtras != null && networkExtras.containsKey("user_data")) {
            this.f9547b.l(networkExtras.getString("user_data", ""));
        }
        PAGBiddingRequest pAGBiddingRequest = new PAGBiddingRequest();
        pAGBiddingRequest.setAdxId("207");
        this.f9547b.a(rtbSignalData.getContext(), pAGBiddingRequest, new a(signalCallbacks));
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    @NonNull
    public VersionInfo getSDKVersionInfo() throws NumberFormatException {
        String strB = this.f9547b.b();
        String[] strArrSplit = strB.split("\\.");
        if (strArrSplit.length < 3) {
            Log.w(TAG, String.format("Unexpected SDK version format: %s. Returning 0.0.0 for SDK version.", strB));
            return new VersionInfo(0, 0, 0);
        }
        int i10 = Integer.parseInt(strArrSplit[0]);
        int i11 = Integer.parseInt(strArrSplit[1]);
        int i12 = Integer.parseInt(strArrSplit[2]);
        if (strArrSplit.length >= 4) {
            i12 = (i12 * 100) + Integer.parseInt(strArrSplit[3]);
        }
        return new VersionInfo(i10, i11, i12);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    @NonNull
    public VersionInfo getVersionInfo() {
        return getVersionInfo("7.8.5.2.0");
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void initialize(@NonNull Context context, @NonNull InitializationCompleteCallback initializationCompleteCallback, @NonNull List<MediationConfiguration> list) {
        if (PangleConstants.d()) {
            initializationCompleteCallback.onInitializationFailed("MobileAds.getRequestConfiguration() indicates the user is a child. Pangle SDK V71 or higher does not support child users.");
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
        if (size <= 0) {
            AdError adErrorA = PangleConstants.a(101, "Missing or invalid App ID.");
            Log.w(TAG, adErrorA.toString());
            initializationCompleteCallback.onInitializationFailed(adErrorA.toString());
        } else {
            String str = (String) hashSet.iterator().next();
            if (size > 1) {
                Log.w(TAG, String.format("Found multiple app IDs in %s. Using %s to initialize Pangle SDK.", hashSet, str));
            }
            this.f9546a.b(context, str, new b(initializationCompleteCallback));
        }
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadAppOpenAd(@NonNull MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration, @NonNull MediationAdLoadCallback<MediationAppOpenAd, MediationAppOpenAdCallback> mediationAdLoadCallback) {
        if (PangleConstants.d()) {
            mediationAdLoadCallback.onFailure(PangleConstants.b());
            return;
        }
        o3.a aVarG = this.f9548c.g(mediationAdLoadCallback, this.f9546a, this.f9547b);
        this.f9549d = aVarG;
        aVarG.g(mediationAppOpenAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadBannerAd(@NonNull MediationBannerAdConfiguration mediationBannerAdConfiguration, @NonNull MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        if (PangleConstants.d()) {
            mediationAdLoadCallback.onFailure(PangleConstants.b());
            return;
        }
        o3.b bVarH = this.f9548c.h(mediationAdLoadCallback, this.f9546a, this.f9547b);
        this.f9550e = bVarH;
        bVarH.f(mediationBannerAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadInterstitialAd(@NonNull MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, @NonNull MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        if (PangleConstants.d()) {
            mediationAdLoadCallback.onFailure(PangleConstants.b());
            return;
        }
        o3.c cVarI = this.f9548c.i(mediationAdLoadCallback, this.f9546a, this.f9547b);
        this.f9551f = cVarI;
        cVarI.g(mediationInterstitialAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadNativeAd(@NonNull MediationNativeAdConfiguration mediationNativeAdConfiguration, @NonNull MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback) {
        if (PangleConstants.d()) {
            mediationAdLoadCallback.onFailure(PangleConstants.b());
            return;
        }
        d dVarJ = this.f9548c.j(mediationAdLoadCallback, this.f9546a, this.f9547b);
        this.f9552g = dVarJ;
        dVarJ.i(mediationNativeAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadRewardedAd(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration, @NonNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        if (PangleConstants.d()) {
            mediationAdLoadCallback.onFailure(PangleConstants.b());
            return;
        }
        f fVarK = this.f9548c.k(mediationAdLoadCallback, this.f9546a, this.f9547b);
        this.f9553h = fVarK;
        fVarK.g(mediationRewardedAdConfiguration);
    }

    public VersionInfo getVersionInfo(String str) throws NumberFormatException {
        String[] strArrSplit = str.split("\\.");
        if (strArrSplit.length < 4) {
            Log.w(TAG, String.format("Unexpected adapter version format: %s. Returning 0.0.0 for adapter version.", str));
            return new VersionInfo(0, 0, 0);
        }
        int i10 = Integer.parseInt(strArrSplit[0]);
        int i11 = Integer.parseInt(strArrSplit[1]);
        int i12 = (Integer.parseInt(strArrSplit[2]) * 100) + Integer.parseInt(strArrSplit[3]);
        if (strArrSplit.length >= 5) {
            i12 = (i12 * 100) + Integer.parseInt(strArrSplit[4]);
        }
        return new VersionInfo(i10, i11, i12);
    }
}
