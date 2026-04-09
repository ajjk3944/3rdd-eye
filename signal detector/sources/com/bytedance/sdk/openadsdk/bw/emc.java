package com.bytedance.sdk.openadsdk.bw;

import android.text.TextUtils;
import com.bytedance.sdk.component.msw.msw;
import com.bytedance.sdk.component.utils.ul;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdLoadListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerRequest;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;
import com.bytedance.sdk.openadsdk.api.factory.IADLoader;
import com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialRequest;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdLoadListener;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeRequest;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdLoadListener;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenRequest;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedRequest;
import com.bytedance.sdk.openadsdk.component.reward.vk;
import com.bytedance.sdk.openadsdk.component.reward.ycc;
import com.bytedance.sdk.openadsdk.component.reward.zz;
import com.bytedance.sdk.openadsdk.core.aa;
import com.bytedance.sdk.openadsdk.core.zz.uym;
import com.bytedance.sdk.openadsdk.emc.ypw.bw;
import com.bytedance.sdk.openadsdk.utils.tp;
import com.bytedance.sdk.openadsdk.utils.vw;
import com.bytedance.sdk.openadsdk.utils.ypw;

/* loaded from: classes.dex */
public class emc implements IADTypeLoaderFactory {
    @Override // com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory
    public IADLoader<PAGBannerRequest, PAGBannerAdLoadListener> createBannerAdLoader() {
        return new IADLoader<PAGBannerRequest, PAGBannerAdLoadListener>() { // from class: com.bytedance.sdk.openadsdk.bw.emc.2
            @Override // com.bytedance.sdk.openadsdk.api.factory.IADLoader
            /* renamed from: emc, reason: merged with bridge method [inline-methods] */
            public void loadAd(String str, final PAGBannerRequest pAGBannerRequest, PAGBannerAdLoadListener pAGBannerAdLoadListener) {
                if (com.bytedance.sdk.openadsdk.emc.emc.emc(str, pAGBannerRequest, pAGBannerAdLoadListener)) {
                    return;
                }
                AdSlot.Builder codeId = new AdSlot.Builder().setCodeId(str);
                com.bytedance.sdk.openadsdk.emc.emc.emc(codeId, pAGBannerRequest);
                if (!TextUtils.isEmpty(pAGBannerRequest.getAdString())) {
                    codeId.withBid(pAGBannerRequest.getAdString());
                }
                final PAGBannerSize adSize = pAGBannerRequest.getAdSize();
                if (adSize != null) {
                    if (adSize.getType() == 3) {
                        codeId.setExpressViewAcceptedSize(adSize.getWidth(), adSize.getMaxHeight());
                    } else {
                        codeId.setExpressViewAcceptedSize(adSize.getWidth(), adSize.getHeight());
                    }
                    codeId.setBannerType(adSize.getType());
                }
                final AdSlot adSlotBuild = codeId.setRequestExtraMap(pAGBannerRequest.getExtraInfo()).build();
                final com.bytedance.sdk.openadsdk.emc.emc.emc emcVar = new com.bytedance.sdk.openadsdk.emc.emc.emc(pAGBannerAdLoadListener);
                com.bytedance.sdk.openadsdk.emc.emc.emc(new msw("loadBannerExpressAd") { // from class: com.bytedance.sdk.openadsdk.bw.emc.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!aa.dg().aa() && tp.sb()) {
                            emcVar.onError(-18, "Blind mode does not allow requesting ads");
                            return;
                        }
                        if (com.bytedance.sdk.openadsdk.emc.emc.emc(emcVar)) {
                            return;
                        }
                        PAGBannerSize pAGBannerSize = adSize;
                        if (pAGBannerSize != null && ((pAGBannerSize.getType() == 2 || adSize.getType() == 3) && TextUtils.isEmpty(pAGBannerRequest.getAdString()))) {
                            int iDg = vw.dg(aa.emc());
                            int iUym = vw.uym(aa.emc());
                            int height = adSize.getType() == 2 ? adSize.getHeight() : adSize.getMaxHeight();
                            if (adSize.getWidth() > iDg || adSize.getWidth() <= 0 || height > iUym || height < 0) {
                                emcVar.onError(-19, "The banner size invalid width=" + adSize.getWidth() + ",height=" + height);
                                return;
                            }
                        }
                        AdSlot adSlot = adSlotBuild;
                        if (adSlot == null) {
                            emcVar.onError(-4, "adslot is null");
                        } else {
                            adSlot.setDurationSlotType(1);
                            uym.emc(aa.emc()).emc(adSlotBuild, 1, emcVar);
                        }
                    }
                }, emcVar, adSlotBuild);
            }
        };
    }

    @Override // com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory
    public IADLoader<PAGInterstitialRequest, PAGInterstitialAdLoadListener> createInterstitialAdLoader() {
        return new IADLoader<PAGInterstitialRequest, PAGInterstitialAdLoadListener>() { // from class: com.bytedance.sdk.openadsdk.bw.emc.5
            @Override // com.bytedance.sdk.openadsdk.api.factory.IADLoader
            /* renamed from: emc, reason: merged with bridge method [inline-methods] */
            public void loadAd(String str, PAGInterstitialRequest pAGInterstitialRequest, PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
                if (com.bytedance.sdk.openadsdk.emc.emc.emc(str, pAGInterstitialRequest, pAGInterstitialAdLoadListener)) {
                    return;
                }
                AdSlot.Builder codeId = new AdSlot.Builder().setRequestExtraMap(pAGInterstitialRequest.getExtraInfo()).setCodeId(str);
                com.bytedance.sdk.openadsdk.emc.emc.emc(codeId, pAGInterstitialRequest);
                if (!TextUtils.isEmpty(pAGInterstitialRequest.getAdString())) {
                    codeId.withBid(pAGInterstitialRequest.getAdString());
                }
                final AdSlot adSlotBuild = codeId.build();
                final com.bytedance.sdk.openadsdk.emc.xq.emc emcVar = new com.bytedance.sdk.openadsdk.emc.xq.emc(pAGInterstitialAdLoadListener);
                com.bytedance.sdk.openadsdk.emc.emc.emc(new msw("loadInterstitialAd") { // from class: com.bytedance.sdk.openadsdk.bw.emc.5.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!aa.dg().aa() && tp.sb()) {
                            emcVar.onError(-18, "Blind mode does not allow requesting ads");
                            return;
                        }
                        if (com.bytedance.sdk.openadsdk.emc.emc.emc(emcVar)) {
                            return;
                        }
                        AdSlot adSlot = adSlotBuild;
                        if (adSlot == null) {
                            emcVar.onError(-4, "adslot is null");
                            return;
                        }
                        try {
                            adSlot.setDurationSlotType(8);
                            if (ypw.ypw()) {
                                com.bytedance.sdk.openadsdk.component.reward.uym.emc(aa.emc()).emc(adSlotBuild, (AdSlot) new com.bytedance.sdk.openadsdk.component.xq.ypw(emcVar));
                            } else {
                                ycc.emc(aa.emc()).emc(adSlotBuild, new com.bytedance.sdk.openadsdk.component.xq.ypw(emcVar));
                            }
                        } catch (Throwable unused) {
                        }
                    }
                }, emcVar, adSlotBuild);
            }
        };
    }

    @Override // com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory
    public IADLoader<PAGNativeRequest, PAGNativeAdLoadListener> createNativeAdLoader() {
        return new IADLoader<PAGNativeRequest, PAGNativeAdLoadListener>() { // from class: com.bytedance.sdk.openadsdk.bw.emc.3
            @Override // com.bytedance.sdk.openadsdk.api.factory.IADLoader
            /* renamed from: emc, reason: merged with bridge method [inline-methods] */
            public void loadAd(String str, PAGNativeRequest pAGNativeRequest, PAGNativeAdLoadListener pAGNativeAdLoadListener) {
                if (com.bytedance.sdk.openadsdk.emc.emc.emc(str, pAGNativeRequest, pAGNativeAdLoadListener)) {
                    return;
                }
                final bw bwVar = new bw(pAGNativeAdLoadListener);
                AdSlot.Builder builderWithBid = new AdSlot.Builder().setCodeId(str).withBid(pAGNativeRequest != null ? pAGNativeRequest.getAdString() : null);
                com.bytedance.sdk.openadsdk.emc.emc.emc(builderWithBid, pAGNativeRequest);
                final AdSlot adSlotBuild = builderWithBid.setRequestExtraMap(pAGNativeRequest.getExtraInfo()).build();
                com.bytedance.sdk.openadsdk.emc.emc.emc(new msw("loadFeedAd") { // from class: com.bytedance.sdk.openadsdk.bw.emc.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!aa.dg().aa() && tp.sb()) {
                            bwVar.onError(-18, "Blind mode does not allow requesting ads");
                            return;
                        }
                        if (com.bytedance.sdk.openadsdk.emc.emc.emc(bwVar)) {
                            return;
                        }
                        AdSlot adSlot = adSlotBuild;
                        if (adSlot == null) {
                            bwVar.onError(-4, "adslot is null");
                            return;
                        }
                        try {
                            adSlot.setDurationSlotType(5);
                            com.bytedance.sdk.openadsdk.component.ypw.emc.emc().emc(aa.emc(), adSlotBuild, bwVar);
                        } catch (Throwable unused) {
                        }
                    }
                }, bwVar, adSlotBuild);
            }
        };
    }

    @Override // com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory
    public IADLoader<PAGAppOpenRequest, PAGAppOpenAdLoadListener> createOpenAdLoader() {
        return new IADLoader<PAGAppOpenRequest, PAGAppOpenAdLoadListener>() { // from class: com.bytedance.sdk.openadsdk.bw.emc.1
            private int ypw;

            @Override // com.bytedance.sdk.openadsdk.api.factory.IADLoader
            /* renamed from: emc, reason: merged with bridge method [inline-methods] */
            public void loadAd(String str, PAGAppOpenRequest pAGAppOpenRequest, PAGAppOpenAdLoadListener pAGAppOpenAdLoadListener) {
                if (com.bytedance.sdk.openadsdk.emc.emc.emc(str, pAGAppOpenRequest, pAGAppOpenAdLoadListener)) {
                    return;
                }
                AdSlot.Builder builder = new AdSlot.Builder();
                com.bytedance.sdk.openadsdk.emc.emc.emc(builder, pAGAppOpenRequest);
                if (!TextUtils.isEmpty(pAGAppOpenRequest.getAdString())) {
                    builder.withBid(pAGAppOpenRequest.getAdString());
                }
                final AdSlot adSlotBuild = builder.setCodeId(str).setRequestExtraMap(pAGAppOpenRequest.getExtraInfo()).build();
                this.ypw = pAGAppOpenRequest.getTimeout();
                final com.bytedance.sdk.openadsdk.emc.dg.emc emcVar = new com.bytedance.sdk.openadsdk.emc.dg.emc(pAGAppOpenAdLoadListener);
                com.bytedance.sdk.openadsdk.emc.emc.emc(new msw("loadSplashAd") { // from class: com.bytedance.sdk.openadsdk.bw.emc.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            if (!aa.dg().aa() && tp.sb()) {
                                emcVar.onError(-18, "Blind mode does not allow requesting ads");
                                return;
                            }
                            if (com.bytedance.sdk.openadsdk.emc.emc.emc(emcVar)) {
                                return;
                            }
                            AdSlot adSlot = adSlotBuild;
                            if (adSlot == null) {
                                emcVar.onError(-4, "adslot is null");
                            } else {
                                adSlot.setDurationSlotType(3);
                                com.bytedance.sdk.openadsdk.component.uym.emc(aa.emc()).emc(adSlotBuild, emcVar, AnonymousClass1.this.ypw);
                            }
                        } catch (Throwable th) {
                            ul.emc("ADNFactory", "open component maybe not exist, please check", th);
                        }
                    }
                }, emcVar, adSlotBuild);
            }
        };
    }

    @Override // com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory
    public IADLoader<PAGRewardedRequest, PAGRewardedAdLoadListener> createRewardAdLoader() {
        return new IADLoader<PAGRewardedRequest, PAGRewardedAdLoadListener>() { // from class: com.bytedance.sdk.openadsdk.bw.emc.4
            @Override // com.bytedance.sdk.openadsdk.api.factory.IADLoader
            /* renamed from: emc, reason: merged with bridge method [inline-methods] */
            public void loadAd(String str, PAGRewardedRequest pAGRewardedRequest, PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
                if (com.bytedance.sdk.openadsdk.emc.emc.emc(str, pAGRewardedRequest, pAGRewardedAdLoadListener)) {
                    return;
                }
                AdSlot.Builder codeId = new AdSlot.Builder().setCodeId(str);
                if (!TextUtils.isEmpty(pAGRewardedRequest.getAdString())) {
                    codeId.withBid(pAGRewardedRequest.getAdString());
                }
                com.bytedance.sdk.openadsdk.emc.emc.emc(codeId, pAGRewardedRequest);
                final AdSlot adSlotBuild = codeId.setRequestExtraMap(pAGRewardedRequest.getExtraInfo()).build();
                final com.bytedance.sdk.openadsdk.emc.bw.ypw ypwVar = new com.bytedance.sdk.openadsdk.emc.bw.ypw(pAGRewardedAdLoadListener);
                com.bytedance.sdk.openadsdk.emc.emc.emc(new msw("loadRewardVideoAd") { // from class: com.bytedance.sdk.openadsdk.bw.emc.4.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!aa.dg().aa() && tp.sb()) {
                            ypwVar.onError(-18, "Blind mode does not allow requesting ads");
                            return;
                        }
                        if (com.bytedance.sdk.openadsdk.emc.emc.emc(ypwVar)) {
                            return;
                        }
                        AdSlot adSlot = adSlotBuild;
                        if (adSlot == null) {
                            ypwVar.onError(-4, "adslot is null");
                            return;
                        }
                        try {
                            adSlot.setDurationSlotType(7);
                            if (ypw.ypw()) {
                                com.bytedance.sdk.openadsdk.component.reward.aa.emc(aa.emc()).emc(adSlotBuild, (AdSlot) new zz(ypwVar));
                            } else {
                                vk.emc(aa.emc()).emc(adSlotBuild, new zz(ypwVar));
                            }
                        } catch (Throwable unused) {
                        }
                    }
                }, ypwVar, adSlotBuild);
            }
        };
    }
}
