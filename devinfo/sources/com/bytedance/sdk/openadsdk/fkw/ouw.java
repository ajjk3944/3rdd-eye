package com.bytedance.sdk.openadsdk.fkw;

import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.f1;
import com.bykv.vk.openvk.ouw.ouw.ouw.lh.a;
import com.bytedance.sdk.component.pno.pno;
import com.bytedance.sdk.component.utils.jae;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.api.PAGRequest;
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
import com.bytedance.sdk.openadsdk.common.ra;
import com.bytedance.sdk.openadsdk.component.reward.fkw;
import com.bytedance.sdk.openadsdk.component.reward.mwh;
import com.bytedance.sdk.openadsdk.component.reward.ryl;
import com.bytedance.sdk.openadsdk.component.reward.yu;
import com.bytedance.sdk.openadsdk.core.jg;
import com.bytedance.sdk.openadsdk.core.model.ksc;
import com.bytedance.sdk.openadsdk.core.model.lh;
import com.bytedance.sdk.openadsdk.core.model.od;
import com.bytedance.sdk.openadsdk.core.mwh.lh.ouw;
import com.bytedance.sdk.openadsdk.core.qbp;
import com.bytedance.sdk.openadsdk.core.settings.cf;
import com.bytedance.sdk.openadsdk.core.vpp;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.core.zin;
import com.bytedance.sdk.openadsdk.utils.bs;
import com.bytedance.sdk.openadsdk.utils.fak;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.bytedance.sdk.openadsdk.utils.uoy;
import com.bytedance.sdk.openadsdk.utils.vt;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import w8.c;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ouw implements IADTypeLoaderFactory {
    @Override // com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory
    public final IADLoader<PAGBannerRequest, PAGBannerAdLoadListener> createBannerAdLoader() {
        return new IADLoader<PAGBannerRequest, PAGBannerAdLoadListener>() { // from class: com.bytedance.sdk.openadsdk.fkw.ouw.2
            @Override // com.bytedance.sdk.openadsdk.api.factory.IADLoader
            public final /* synthetic */ void loadAd(String str, PAGRequest pAGRequest, ra raVar) {
                final PAGBannerRequest pAGBannerRequest = (PAGBannerRequest) pAGRequest;
                PAGBannerAdLoadListener pAGBannerAdLoadListener = (PAGBannerAdLoadListener) raVar;
                if (com.bytedance.sdk.openadsdk.ouw.ouw.ouw(str, pAGBannerRequest, pAGBannerAdLoadListener)) {
                    return;
                }
                AdSlot.Builder codeId = new AdSlot.Builder().setCodeId(str);
                com.bytedance.sdk.openadsdk.ouw.ouw.ouw(codeId, pAGBannerRequest);
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
                final com.bytedance.sdk.openadsdk.ouw.ouw.ouw ouwVar = new com.bytedance.sdk.openadsdk.ouw.ouw.ouw(pAGBannerAdLoadListener);
                com.bytedance.sdk.openadsdk.ouw.ouw.ouw(new pno("loadBannerExpressAd") { // from class: com.bytedance.sdk.openadsdk.fkw.ouw.2.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (!zih.yu().ra() && uoy.cd()) {
                            ouwVar.onError(-18, "Blind mode does not allow requesting ads");
                            return;
                        }
                        if (com.bytedance.sdk.openadsdk.ouw.ouw.ouw(ouwVar)) {
                            return;
                        }
                        PAGBannerSize pAGBannerSize = adSize;
                        if (pAGBannerSize != null && ((pAGBannerSize.getType() == 2 || adSize.getType() == 3) && TextUtils.isEmpty(pAGBannerRequest.getAdString()))) {
                            int iFkw = osn.fkw(zih.ouw());
                            int iPno = osn.pno(zih.ouw());
                            int height = adSize.getType() == 2 ? adSize.getHeight() : adSize.getMaxHeight();
                            if (adSize.getWidth() > iFkw || adSize.getWidth() <= 0 || height > iPno || height < 0) {
                                ouwVar.onError(-19, "The banner size invalid width=" + adSize.getWidth() + ",height=" + height);
                                return;
                            }
                        }
                        AdSlot adSlot = adSlotBuild;
                        if (adSlot == null) {
                            ouwVar.onError(-4, "adslot is null");
                            return;
                        }
                        adSlot.setDurationSlotType(1);
                        final com.bytedance.sdk.openadsdk.core.bly.ra raVar2 = new com.bytedance.sdk.openadsdk.core.bly.ra(zih.ouw());
                        final AdSlot adSlot2 = adSlotBuild;
                        com.bytedance.sdk.openadsdk.ouw.ouw.ouw ouwVar2 = ouwVar;
                        raVar2.ra.yu();
                        if (raVar2.fkw.get()) {
                            ko.fkw("ExpressAdLoadManager", "express ad is loading...");
                            return;
                        }
                        raVar2.f8085le = 1;
                        raVar2.fkw.set(true);
                        raVar2.ouw = adSlot2;
                        if (ouwVar2 != null) {
                            raVar2.yu = ouwVar2;
                        }
                        if (adSlot2 != null) {
                            ksc kscVar = new ksc();
                            kscVar.bly = 2;
                            if (vt.ouw()) {
                                raVar2.vt.ouw(adSlot2, kscVar, raVar2.f8085le, (qbp) new zin() { // from class: com.bytedance.sdk.openadsdk.core.bly.ra.1
                                    final /* synthetic */ AdSlot ouw;

                                    public AnonymousClass1(final AdSlot adSlot22) {
                                        adSlot = adSlot22;
                                    }

                                    @Override // com.bytedance.sdk.openadsdk.core.zin, com.bytedance.sdk.openadsdk.core.vpp.ouw
                                    public final void ouw(int i4, String str2) {
                                        ra.this.ouw(i4, str2);
                                    }

                                    @Override // com.bytedance.sdk.openadsdk.core.zin, com.bytedance.sdk.openadsdk.core.vpp.ouw
                                    public final void ouw(com.bytedance.sdk.openadsdk.core.model.ouw ouwVar3, com.bytedance.sdk.openadsdk.core.model.lh lhVar) {
                                        ra.ouw(ra.this, ouwVar3, lhVar, adSlot);
                                    }
                                });
                            } else {
                                raVar2.vt.ouw(adSlot22, kscVar, raVar2.f8085le, new vpp.ouw() { // from class: com.bytedance.sdk.openadsdk.core.bly.ra.2
                                    final /* synthetic */ AdSlot ouw;

                                    public AnonymousClass2(final AdSlot adSlot22) {
                                        adSlot = adSlot22;
                                    }

                                    @Override // com.bytedance.sdk.openadsdk.core.vpp.ouw
                                    public final void ouw(int i4, String str2) {
                                        ra.this.ouw(i4, str2);
                                    }

                                    @Override // com.bytedance.sdk.openadsdk.core.vpp.ouw
                                    public final void ouw(com.bytedance.sdk.openadsdk.core.model.ouw ouwVar3, com.bytedance.sdk.openadsdk.core.model.lh lhVar) {
                                        ra.ouw(ra.this, ouwVar3, lhVar, adSlot);
                                    }
                                });
                            }
                        }
                    }
                }, ouwVar, adSlotBuild);
            }
        };
    }

    @Override // com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory
    public final IADLoader<PAGInterstitialRequest, PAGInterstitialAdLoadListener> createInterstitialAdLoader() {
        return new IADLoader<PAGInterstitialRequest, PAGInterstitialAdLoadListener>() { // from class: com.bytedance.sdk.openadsdk.fkw.ouw.5
            @Override // com.bytedance.sdk.openadsdk.api.factory.IADLoader
            public final /* synthetic */ void loadAd(String str, PAGRequest pAGRequest, ra raVar) {
                PAGInterstitialRequest pAGInterstitialRequest = (PAGInterstitialRequest) pAGRequest;
                PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener = (PAGInterstitialAdLoadListener) raVar;
                if (com.bytedance.sdk.openadsdk.ouw.ouw.ouw(str, pAGInterstitialRequest, pAGInterstitialAdLoadListener)) {
                    return;
                }
                AdSlot.Builder codeId = new AdSlot.Builder().setRequestExtraMap(pAGInterstitialRequest.getExtraInfo()).setCodeId(str);
                com.bytedance.sdk.openadsdk.ouw.ouw.ouw(codeId, pAGInterstitialRequest);
                if (!TextUtils.isEmpty(pAGInterstitialRequest.getAdString())) {
                    codeId.withBid(pAGInterstitialRequest.getAdString());
                }
                final AdSlot adSlotBuild = codeId.build();
                final com.bytedance.sdk.openadsdk.ouw.lh.ouw ouwVar = new com.bytedance.sdk.openadsdk.ouw.lh.ouw(pAGInterstitialAdLoadListener);
                com.bytedance.sdk.openadsdk.ouw.ouw.ouw(new pno("loadInterstitialAd") { // from class: com.bytedance.sdk.openadsdk.fkw.ouw.5.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.bytedance.sdk.openadsdk.core.model.ouw ouwVarVt;
                        if (!zih.yu().ra() && uoy.cd()) {
                            ouwVar.onError(-18, "Blind mode does not allow requesting ads");
                            return;
                        }
                        if (com.bytedance.sdk.openadsdk.ouw.ouw.ouw(ouwVar)) {
                            return;
                        }
                        AdSlot adSlot = adSlotBuild;
                        if (adSlot == null) {
                            ouwVar.onError(-4, "adslot is null");
                            return;
                        }
                        try {
                            adSlot.setDurationSlotType(8);
                            final fkw fkwVarOuw = fkw.ouw(zih.ouw());
                            final AdSlot adSlot2 = adSlotBuild;
                            final com.bytedance.sdk.openadsdk.component.lh.vt vtVar = new com.bytedance.sdk.openadsdk.component.lh.vt(ouwVar);
                            if (vt.ouw()) {
                                final long jCurrentTimeMillis = System.currentTimeMillis();
                                ksc kscVar = new ksc();
                                kscVar.f8242lh = 1;
                                zih.yu();
                                if (cf.pno(adSlot2.getCodeId()) || adSlot2.getExpressViewAcceptedWidth() > 0.0f || adSlot2.isExpressAd()) {
                                    kscVar.bly = 2;
                                }
                                zih.lh().ouw(adSlot2, kscVar, 8, (qbp) new zin() { // from class: com.bytedance.sdk.openadsdk.component.reward.fkw.4

                                    /* renamed from: lh */
                                    final /* synthetic */ AdSlot f7919lh;
                                    boolean ouw = false;
                                    final /* synthetic */ PAGInterstitialAdLoadListener vt;
                                    final /* synthetic */ long yu;

                                    public AnonymousClass4(final PAGInterstitialAdLoadListener vtVar2, final AdSlot adSlot22, final long jCurrentTimeMillis2) {
                                        pAGInterstitialAdLoadListener = vtVar2;
                                        adSlot = adSlot22;
                                        j = jCurrentTimeMillis2;
                                    }

                                    @Override // com.bytedance.sdk.openadsdk.core.zin, com.bytedance.sdk.openadsdk.core.vpp.ouw
                                    public final void ouw(int i4, String str2) {
                                        PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener2 = pAGInterstitialAdLoadListener;
                                        if (pAGInterstitialAdLoadListener2 != null) {
                                            pAGInterstitialAdLoadListener2.onError(i4, str2);
                                        }
                                    }

                                    @Override // com.bytedance.sdk.openadsdk.core.zin, com.bytedance.sdk.openadsdk.core.qbp
                                    public final String ouw() {
                                        if (!TextUtils.isEmpty(adSlot.getBidAdm())) {
                                            return null;
                                        }
                                        yu.ouw(fkw.this.ouw);
                                        String strOuw = yu.ouw(adSlot.getCodeId(), true);
                                        if (TextUtils.isEmpty(strOuw)) {
                                            return null;
                                        }
                                        return strOuw;
                                    }

                                    @Override // com.bytedance.sdk.openadsdk.core.zin, com.bytedance.sdk.openadsdk.core.qbp
                                    public final boolean ouw(com.bytedance.sdk.openadsdk.core.model.ouw ouwVar2) {
                                        yu.ouw(fkw.this.ouw);
                                        boolean zOuw = yu.ouw(ouwVar2);
                                        this.ouw = zOuw;
                                        return zOuw;
                                    }

                                    @Override // com.bytedance.sdk.openadsdk.core.zin, com.bytedance.sdk.openadsdk.core.vpp.ouw
                                    public final void ouw(com.bytedance.sdk.openadsdk.core.model.ouw ouwVar2, com.bytedance.sdk.openadsdk.core.model.lh lhVar) {
                                        com.bytedance.sdk.openadsdk.core.model.ouw ouwVar3;
                                        List<com.bytedance.sdk.openadsdk.core.model.vpp> list = ouwVar2.yu;
                                        if (list != null && !list.isEmpty()) {
                                            mwh mwhVar = new mwh(fkw.this.ouw, ouwVar2);
                                            if (!TextUtils.isEmpty(adSlot.getBidAdm())) {
                                                com.bytedance.sdk.openadsdk.zin.ouw.yu.ouw().ouw(ouwVar2.yu.isEmpty() ? null : ouwVar2.yu.get(0));
                                                com.bytedance.sdk.openadsdk.rn.lh.ouw(ouwVar2.lh(), System.currentTimeMillis() - j);
                                            }
                                            if (pAGInterstitialAdLoadListener == null || zih.yu().ryl() != 0) {
                                                ouwVar3 = ouwVar2;
                                            } else {
                                                fkw.this.ouw(adSlot, ouwVar2, pAGInterstitialAdLoadListener, mwhVar.ouw, this.ouw);
                                                ouwVar3 = ouwVar2;
                                            }
                                            fkw.ouw(fkw.this, ouwVar3, mwhVar, adSlot, false, pAGInterstitialAdLoadListener);
                                            return;
                                        }
                                        PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener2 = pAGInterstitialAdLoadListener;
                                        if (pAGInterstitialAdLoadListener2 != null) {
                                            pAGInterstitialAdLoadListener2.onError(-3, com.bytedance.sdk.openadsdk.core.pno.ouw(-3));
                                            lhVar.vt = -3;
                                            lhVar.ra = 5;
                                            com.bytedance.sdk.openadsdk.core.model.lh.ouw(lhVar);
                                        }
                                    }
                                });
                                return;
                            }
                            if (!TextUtils.isEmpty(adSlot22.getBidAdm()) || (ouwVarVt = yu.ouw(fkwVarOuw.ouw).vt(adSlot22.getCodeId(), true)) == null || !ouwVarVt.vt()) {
                                final long jCurrentTimeMillis2 = System.currentTimeMillis();
                                ksc kscVar2 = new ksc();
                                kscVar2.f8242lh = 1;
                                zih.yu();
                                if (cf.pno(adSlot22.getCodeId()) || adSlot22.getExpressViewAcceptedWidth() > 0.0f || adSlot22.isExpressAd()) {
                                    kscVar2.bly = 2;
                                }
                                zih.lh().ouw(adSlot22, kscVar2, 8, new vpp.ouw() { // from class: com.bytedance.sdk.openadsdk.component.reward.fkw.8

                                    /* renamed from: lh */
                                    final /* synthetic */ long f7922lh;
                                    final /* synthetic */ PAGInterstitialAdLoadListener ouw;
                                    final /* synthetic */ AdSlot vt;

                                    public AnonymousClass8(final PAGInterstitialAdLoadListener vtVar2, final AdSlot adSlot22, final long jCurrentTimeMillis22) {
                                        pAGInterstitialAdLoadListener = vtVar2;
                                        adSlot = adSlot22;
                                        j = jCurrentTimeMillis22;
                                    }

                                    @Override // com.bytedance.sdk.openadsdk.core.vpp.ouw
                                    public final void ouw(int i4, String str2) {
                                        PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener2 = pAGInterstitialAdLoadListener;
                                        if (pAGInterstitialAdLoadListener2 != null) {
                                            pAGInterstitialAdLoadListener2.onError(i4, str2);
                                        }
                                    }

                                    @Override // com.bytedance.sdk.openadsdk.core.vpp.ouw
                                    public final void ouw(com.bytedance.sdk.openadsdk.core.model.ouw ouwVar2, com.bytedance.sdk.openadsdk.core.model.lh lhVar) {
                                        com.bytedance.sdk.openadsdk.core.model.ouw ouwVar3;
                                        List<com.bytedance.sdk.openadsdk.core.model.vpp> list = ouwVar2.yu;
                                        if (list != null && !list.isEmpty()) {
                                            mwh mwhVar = new mwh(fkw.this.ouw, ouwVar2);
                                            if (!TextUtils.isEmpty(adSlot.getBidAdm())) {
                                                com.bytedance.sdk.openadsdk.zin.ouw.yu.ouw().ouw(ouwVar2.yu.isEmpty() ? null : ouwVar2.yu.get(0));
                                                com.bytedance.sdk.openadsdk.rn.lh.ouw(ouwVar2.lh(), System.currentTimeMillis() - j);
                                            }
                                            if (pAGInterstitialAdLoadListener == null || zih.yu().ryl() != 0) {
                                                ouwVar3 = ouwVar2;
                                            } else {
                                                fkw.this.ouw(adSlot, ouwVar2, pAGInterstitialAdLoadListener, mwhVar.ouw, false);
                                                ouwVar3 = ouwVar2;
                                            }
                                            fkw.ouw(fkw.this, ouwVar3, mwhVar, adSlot, false, pAGInterstitialAdLoadListener);
                                            return;
                                        }
                                        PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener2 = pAGInterstitialAdLoadListener;
                                        if (pAGInterstitialAdLoadListener2 != null) {
                                            pAGInterstitialAdLoadListener2.onError(-3, com.bytedance.sdk.openadsdk.core.pno.ouw(-3));
                                            lhVar.vt = -3;
                                            lhVar.ra = 5;
                                            com.bytedance.sdk.openadsdk.core.model.lh.ouw(lhVar);
                                        }
                                    }
                                });
                                return;
                            }
                            com.bytedance.sdk.openadsdk.core.model.vpp vppVarLh = ouwVarVt.lh();
                            for (com.bytedance.sdk.openadsdk.core.model.vpp vppVar : ouwVarVt.yu) {
                                if (vppVar.yiz == null) {
                                    vppVar.yiz = adSlot22;
                                }
                            }
                            final mwh mwhVar = new mwh(fkwVarOuw.ouw, ouwVarVt);
                            if (!od.lh(vppVarLh)) {
                                mwhVar.ouw.ouw();
                            }
                            com.bytedance.sdk.openadsdk.core.ryl.lh.yu.ouw(ouwVarVt);
                            if (zih.yu().ryl() == 0) {
                                fkwVarOuw.ouw(adSlot22, ouwVarVt, vtVar2, mwhVar.ouw, true);
                                ouwVarVt = ouwVarVt;
                                vtVar2 = vtVar2;
                                adSlot22 = adSlot22;
                                fkwVarOuw = fkwVarOuw;
                            }
                            AdSlot adSlot3 = adSlot22;
                            fkw.ouw ouwVar2 = new fkw.ouw(fkwVarOuw.ouw, adSlot3, ouwVarVt, vtVar2, true);
                            com.bytedance.sdk.openadsdk.core.model.ouw ouwVar3 = ouwVarVt;
                            final fkw.vt vtVar2 = new fkw.vt(ouwVar2, ouwVar3, false ? 1 : 0);
                            for (int i4 = 0; i4 < ouwVar3.yu.size(); i4++) {
                                com.bytedance.sdk.openadsdk.core.model.vpp vppVar2 = ouwVar3.yu.get(i4);
                                boolean z3 = zih.yu().ryl() == 1;
                                boolean z10 = z3;
                                if (!od.lh(vppVar2)) {
                                    z10 = z3;
                                    if (com.bytedance.sdk.openadsdk.core.model.vpp.fkw(vppVar2)) {
                                        com.bytedance.sdk.openadsdk.core.mwh.ouw.vt vtVarOuw = com.bytedance.sdk.openadsdk.core.model.vpp.ouw(((f1) CacheDirFactory.getICacheDir(vppVar2.sm)).H(), vppVar2);
                                        vtVarOuw.ouw("material_meta", vppVar2);
                                        vtVarOuw.ouw("ad_slot", adSlot3);
                                        com.bytedance.sdk.openadsdk.core.mwh.fkw.ouw.ouw(vtVarOuw, new c() { // from class: com.bytedance.sdk.openadsdk.component.reward.fkw.7
                                            final /* synthetic */ vt ouw;
                                            final /* synthetic */ mwh vt;

                                            public AnonymousClass7(final vt vtVar22, final mwh mwhVar2) {
                                                vtVar = vtVar22;
                                                mwhVar = mwhVar2;
                                            }

                                            @Override // w8.a
                                            public final void ouw(a aVar, int i10) {
                                                if (vtVar == null || zih.yu().ryl() != 1) {
                                                    return;
                                                }
                                                vtVar.onAdLoaded(mwhVar.ouw);
                                            }

                                            @Override // w8.a
                                            public final void ouw(a aVar, int i10, String str2) {
                                                ko.lh("ScreenVideoLoadM", "FullScreenLog: Cached ad onVideoPreloadFail");
                                                if (vtVar == null || zih.yu().ryl() != 1) {
                                                    return;
                                                }
                                                vtVar.onError(i10, str2);
                                            }
                                        });
                                        z10 = false;
                                    }
                                }
                                if (z10) {
                                    vtVar22.onAdLoaded(mwhVar2.ouw);
                                }
                                if (ouwVar3.yu()) {
                                    break;
                                }
                            }
                            for (int i10 = 0; i10 < ouwVar3.yu.size(); i10++) {
                                com.bytedance.sdk.openadsdk.core.mwh.lh.ouw.ouw().ouw(ouwVar3.yu.get(i10), new ouw.InterfaceC0089ouw() { // from class: com.bytedance.sdk.openadsdk.component.reward.fkw.5
                                    public AnonymousClass5() {
                                    }

                                    @Override // com.bytedance.sdk.openadsdk.core.mwh.lh.ouw.InterfaceC0089ouw
                                    public final void ouw(boolean z11) {
                                    }
                                });
                            }
                            ko.vt("ScreenVideoLoadM", "get cache data success");
                            ko.vt("bidding", "full video get cache data success");
                        } catch (Throwable th2) {
                            ko.vt("ADNFactory", "reward component maybe not exist, pls check2", th2);
                        }
                    }
                }, ouwVar, adSlotBuild);
            }
        };
    }

    @Override // com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory
    public final IADLoader<PAGNativeRequest, PAGNativeAdLoadListener> createNativeAdLoader() {
        return new IADLoader<PAGNativeRequest, PAGNativeAdLoadListener>() { // from class: com.bytedance.sdk.openadsdk.fkw.ouw.3
            @Override // com.bytedance.sdk.openadsdk.api.factory.IADLoader
            public final /* synthetic */ void loadAd(String str, PAGRequest pAGRequest, ra raVar) {
                PAGNativeRequest pAGNativeRequest = (PAGNativeRequest) pAGRequest;
                PAGNativeAdLoadListener pAGNativeAdLoadListener = (PAGNativeAdLoadListener) raVar;
                if (com.bytedance.sdk.openadsdk.ouw.ouw.ouw(str, pAGNativeRequest, pAGNativeAdLoadListener)) {
                    return;
                }
                final com.bytedance.sdk.openadsdk.ouw.vt.fkw fkwVar = new com.bytedance.sdk.openadsdk.ouw.vt.fkw(pAGNativeAdLoadListener);
                AdSlot.Builder builderWithBid = new AdSlot.Builder().setCodeId(str).withBid(pAGNativeRequest != null ? pAGNativeRequest.getAdString() : null);
                com.bytedance.sdk.openadsdk.ouw.ouw.ouw(builderWithBid, pAGNativeRequest);
                final AdSlot adSlotBuild = builderWithBid.setRequestExtraMap(pAGNativeRequest.getExtraInfo()).build();
                com.bytedance.sdk.openadsdk.ouw.ouw.ouw(new pno("loadFeedAd") { // from class: com.bytedance.sdk.openadsdk.fkw.ouw.3.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (!zih.yu().ra() && uoy.cd()) {
                            fkwVar.onError(-18, "Blind mode does not allow requesting ads");
                            return;
                        }
                        if (com.bytedance.sdk.openadsdk.ouw.ouw.ouw(fkwVar)) {
                            return;
                        }
                        AdSlot adSlot = adSlotBuild;
                        if (adSlot == null) {
                            fkwVar.onError(-4, "adslot is null");
                            return;
                        }
                        try {
                            adSlot.setDurationSlotType(5);
                            final com.bytedance.sdk.openadsdk.component.vt.ouw ouwVarOuw = com.bytedance.sdk.openadsdk.component.vt.ouw.ouw();
                            final Context contextOuw = zih.ouw();
                            final AdSlot adSlot2 = adSlotBuild;
                            final com.bytedance.sdk.openadsdk.ouw.vt.fkw fkwVar2 = fkwVar;
                            final fak fakVarOuw = fak.ouw();
                            if (vt.ouw()) {
                                ouwVarOuw.ouw.ouw(adSlot2, new ksc(), 5, (qbp) new zin() { // from class: com.bytedance.sdk.openadsdk.component.vt.ouw.1

                                    /* renamed from: lh */
                                    final /* synthetic */ AdSlot f8044lh;
                                    final /* synthetic */ ra ouw;
                                    final /* synthetic */ Context vt;
                                    final /* synthetic */ fak yu;

                                    public AnonymousClass1(final ra fkwVar22, final Context contextOuw2, final AdSlot adSlot22, final fak fakVarOuw2) {
                                        raVar = fkwVar22;
                                        context = contextOuw2;
                                        adSlot = adSlot22;
                                        fakVar = fakVarOuw2;
                                    }

                                    @Override // com.bytedance.sdk.openadsdk.core.zin, com.bytedance.sdk.openadsdk.core.vpp.ouw
                                    public final void ouw(int i4, String str2) {
                                        raVar.onError(i4, str2);
                                    }

                                    @Override // com.bytedance.sdk.openadsdk.core.zin, com.bytedance.sdk.openadsdk.core.vpp.ouw
                                    public final void ouw(com.bytedance.sdk.openadsdk.core.model.ouw ouwVar, lh lhVar) {
                                        ouw.ouw(ouwVar, lhVar, context, adSlot, raVar, fakVar);
                                    }
                                });
                            } else {
                                ouwVarOuw.ouw.ouw(adSlot22, new ksc(), 5, new vpp.ouw() { // from class: com.bytedance.sdk.openadsdk.component.vt.ouw.2

                                    /* renamed from: lh */
                                    final /* synthetic */ AdSlot f8045lh;
                                    final /* synthetic */ ra ouw;
                                    final /* synthetic */ Context vt;
                                    final /* synthetic */ fak yu;

                                    public AnonymousClass2(final ra fkwVar22, final Context contextOuw2, final AdSlot adSlot22, final fak fakVarOuw2) {
                                        raVar = fkwVar22;
                                        context = contextOuw2;
                                        adSlot = adSlot22;
                                        fakVar = fakVarOuw2;
                                    }

                                    @Override // com.bytedance.sdk.openadsdk.core.vpp.ouw
                                    public final void ouw(int i4, String str2) {
                                        raVar.onError(i4, str2);
                                    }

                                    @Override // com.bytedance.sdk.openadsdk.core.vpp.ouw
                                    public final void ouw(com.bytedance.sdk.openadsdk.core.model.ouw ouwVar, lh lhVar) {
                                        ouw.ouw(ouwVar, lhVar, context, adSlot, raVar, fakVar);
                                    }
                                });
                            }
                        } catch (Throwable th2) {
                            ko.vt("ADNFactory", "feed component maybe not exist, pls check1", th2);
                        }
                    }
                }, fkwVar, adSlotBuild);
            }
        };
    }

    @Override // com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory
    public final IADLoader<PAGAppOpenRequest, PAGAppOpenAdLoadListener> createOpenAdLoader() {
        return new IADLoader<PAGAppOpenRequest, PAGAppOpenAdLoadListener>() { // from class: com.bytedance.sdk.openadsdk.fkw.ouw.1
            private int vt;

            @Override // com.bytedance.sdk.openadsdk.api.factory.IADLoader
            public final /* synthetic */ void loadAd(String str, PAGRequest pAGRequest, ra raVar) {
                PAGAppOpenRequest pAGAppOpenRequest = (PAGAppOpenRequest) pAGRequest;
                PAGAppOpenAdLoadListener pAGAppOpenAdLoadListener = (PAGAppOpenAdLoadListener) raVar;
                if (com.bytedance.sdk.openadsdk.ouw.ouw.ouw(str, pAGAppOpenRequest, pAGAppOpenAdLoadListener)) {
                    return;
                }
                AdSlot.Builder builder = new AdSlot.Builder();
                com.bytedance.sdk.openadsdk.ouw.ouw.ouw(builder, pAGAppOpenRequest);
                if (!TextUtils.isEmpty(pAGAppOpenRequest.getAdString())) {
                    builder.withBid(pAGAppOpenRequest.getAdString());
                }
                final AdSlot adSlotBuild = builder.setCodeId(str).setRequestExtraMap(pAGAppOpenRequest.getExtraInfo()).build();
                this.vt = pAGAppOpenRequest.getTimeout();
                final com.bytedance.sdk.openadsdk.ouw.yu.ouw ouwVar = new com.bytedance.sdk.openadsdk.ouw.yu.ouw(pAGAppOpenAdLoadListener);
                com.bytedance.sdk.openadsdk.ouw.ouw.ouw(new pno("loadSplashAd") { // from class: com.bytedance.sdk.openadsdk.fkw.ouw.1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            if (!zih.yu().ra() && uoy.cd()) {
                                ouwVar.onError(-18, "Blind mode does not allow requesting ads");
                                return;
                            }
                            if (com.bytedance.sdk.openadsdk.ouw.ouw.ouw(ouwVar)) {
                                return;
                            }
                            AdSlot adSlot = adSlotBuild;
                            if (adSlot == null) {
                                ouwVar.onError(-4, "adslot is null");
                                return;
                            }
                            adSlot.setDurationSlotType(3);
                            final com.bytedance.sdk.openadsdk.component.ra raVar2 = new com.bytedance.sdk.openadsdk.component.ra(zih.ouw());
                            AdSlot adSlot2 = adSlotBuild;
                            com.bytedance.sdk.openadsdk.ouw.yu.ouw ouwVar2 = ouwVar;
                            int i4 = AnonymousClass1.this.vt;
                            if (ouwVar2 != null) {
                                if (i4 <= 0) {
                                    ko.vt("TTAppOpenAdLoadManager", "Since the timeout value passed by loadAppOpenAd is <=0, now it is set to the default value of 3500ms");
                                    i4 = 3500;
                                }
                                raVar2.yu = adSlot2;
                                raVar2.pno.bly = !TextUtils.isEmpty(adSlot2.getBidAdm());
                                raVar2.fkw = ouwVar2;
                                raVar2.f7904lh = com.bytedance.sdk.openadsdk.component.ra.vt(raVar2.yu);
                                raVar2.f7903le = i4;
                                raVar2.pno.ouw = fak.ouw();
                                if (raVar2.pno.bly) {
                                    raVar2.ouw(raVar2.yu);
                                    return;
                                }
                                new jae(jg.vt().getLooper(), raVar2).sendEmptyMessageDelayed(1, i4);
                                final String str2 = "tryGetAppOpenAdFromCache";
                                bs.vt(new pno(str2) { // from class: com.bytedance.sdk.openadsdk.component.ra.4
                                    public AnonymousClass4(final String str22) {
                                        super(str22);
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() throws JSONException {
                                        if (com.bytedance.sdk.openadsdk.utils.vt.ouw()) {
                                            ra raVar3 = ra.this;
                                            fak fakVarOuw = fak.ouw();
                                            ksc kscVar = new ksc();
                                            kscVar.f8240cf = raVar3.pno;
                                            kscVar.yu = 1;
                                            kscVar.bly = 2;
                                            raVar3.ra = 1;
                                            raVar3.ouw.ouw(raVar3.yu, kscVar, 3, (qbp) new zin() { // from class: com.bytedance.sdk.openadsdk.component.ra.5
                                                boolean ouw = false;
                                                final /* synthetic */ fak vt;

                                                public AnonymousClass5(fak fakVarOuw2) {
                                                    fakVar = fakVarOuw2;
                                                }

                                                @Override // com.bytedance.sdk.openadsdk.core.zin, com.bytedance.sdk.openadsdk.core.qbp
                                                public final String ouw() {
                                                    ra raVar4 = ra.this;
                                                    le leVar = raVar4.vt;
                                                    int i10 = raVar4.f7904lh;
                                                    String strVt = com.bytedance.sdk.openadsdk.common.vt.ouw("tt_openad_materialMeta_new").vt(String.valueOf(i10));
                                                    long jOuw = com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw("tt_openad", "material_expiration_time".concat(String.valueOf(i10)), -1L);
                                                    if (System.currentTimeMillis() / 1000 < jOuw) {
                                                        return strVt;
                                                    }
                                                    if (jOuw == -1) {
                                                        return null;
                                                    }
                                                    le.yu(i10);
                                                    bs.ouw((pno) new pno("opencache") { // from class: com.bytedance.sdk.openadsdk.component.le.3
                                                        final /* synthetic */ String ouw;

                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        public AnonymousClass3(String str3, String strVt2) {
                                                            super(str3);
                                                            str = strVt2;
                                                        }

                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            com.bytedance.sdk.openadsdk.core.model.ouw ouwVarOuw;
                                                            try {
                                                                if (TextUtils.isEmpty(str)) {
                                                                    return;
                                                                }
                                                                JSONObject jSONObject = new JSONObject(str);
                                                                if (jSONObject.has("cypher")) {
                                                                    jSONObject = zih.lh().ouw(jSONObject);
                                                                }
                                                                if (jSONObject == null || !jSONObject.has("creatives") || (ouwVarOuw = com.bytedance.sdk.openadsdk.core.model.ouw.ouw(jSONObject)) == null || !ouwVarOuw.vt()) {
                                                                    return;
                                                                }
                                                                com.bytedance.sdk.openadsdk.yu.lh.lh(ouwVarOuw.lh(), "cache_expire", (JSONObject) null);
                                                            } catch (Throwable unused) {
                                                            }
                                                        }
                                                    });
                                                    return null;
                                                }

                                                @Override // com.bytedance.sdk.openadsdk.core.zin, com.bytedance.sdk.openadsdk.core.qbp
                                                public final boolean ouw(com.bytedance.sdk.openadsdk.core.model.ouw ouwVar3) throws JSONException {
                                                    com.bytedance.sdk.openadsdk.core.model.vpp vppVarLh;
                                                    if (ouwVar3 != null && ouwVar3.vt() && (vppVarLh = ouwVar3.lh()) != null) {
                                                        boolean zFkw = com.bytedance.sdk.openadsdk.core.model.vpp.fkw(vppVarLh);
                                                        if (!vppVarLh.ra() && zFkw && TextUtils.isEmpty(le.ouw(vppVarLh))) {
                                                            this.ouw = false;
                                                            com.bytedance.sdk.openadsdk.component.yu.ouw.ouw(ouwVar3.lh());
                                                        } else {
                                                            this.ouw = true;
                                                        }
                                                        com.bytedance.sdk.openadsdk.core.ryl.lh.yu.ouw(vppVarLh);
                                                    }
                                                    return this.ouw;
                                                }

                                                @Override // com.bytedance.sdk.openadsdk.core.zin, com.bytedance.sdk.openadsdk.core.vpp.ouw
                                                public final void ouw(int i10, String str3) throws JSONException {
                                                    ra.this.ra = 3;
                                                    ko.vt("TTAppOpenAdLoadManager", "try load app open ad from network fail, " + i10 + ", " + str3);
                                                    ra.this.ouw(new com.bytedance.sdk.openadsdk.component.fkw.vt(2, 100, i10, str3));
                                                }

                                                @Override // com.bytedance.sdk.openadsdk.core.zin, com.bytedance.sdk.openadsdk.core.vpp.ouw
                                                public final void ouw(com.bytedance.sdk.openadsdk.core.model.ouw ouwVar3, com.bytedance.sdk.openadsdk.core.model.lh lhVar) throws JSONException {
                                                    if (this.ouw) {
                                                        ra.this.ouw(new com.bytedance.sdk.openadsdk.component.fkw.vt(101, ouwVar3.lh(), null));
                                                    } else {
                                                        ra raVar4 = ra.this;
                                                        ra.ouw(raVar4, ouwVar3, lhVar, raVar4.yu, fakVar);
                                                    }
                                                }
                                            });
                                            return;
                                        }
                                        ra raVar4 = ra.this;
                                        int i10 = raVar4.f7904lh;
                                        com.bytedance.sdk.openadsdk.core.model.vpp vppVarLh = le.lh(i10);
                                        long jOuw = com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw("tt_openad", "material_expiration_time".concat(String.valueOf(i10)), -1L);
                                        if (System.currentTimeMillis() / 1000 >= jOuw || vppVarLh == null) {
                                            if (vppVarLh != null || jOuw != -1) {
                                                le.yu(i10);
                                                if (vppVarLh != null) {
                                                    com.bytedance.sdk.openadsdk.yu.lh.lh(vppVarLh, "cache_expire", (JSONObject) null);
                                                }
                                            }
                                            vppVarLh = null;
                                        }
                                        if (vppVarLh == null) {
                                            raVar4.ouw();
                                            return;
                                        }
                                        if (vppVarLh.yiz == null) {
                                            vppVarLh.yiz = raVar4.yu;
                                        }
                                        com.bytedance.sdk.openadsdk.core.ryl.lh.yu.ouw(vppVarLh);
                                        boolean zFkw = com.bytedance.sdk.openadsdk.core.model.vpp.fkw(vppVarLh);
                                        if (vppVarLh.ra() || !zFkw) {
                                            raVar4.ouw(new com.bytedance.sdk.openadsdk.component.fkw.vt(101, vppVarLh, null));
                                        } else {
                                            if (!TextUtils.isEmpty(le.ouw(vppVarLh))) {
                                                raVar4.ouw(new com.bytedance.sdk.openadsdk.component.fkw.vt(101, vppVarLh, null));
                                                return;
                                            }
                                            ko.vt("TTAppOpenAdLoadManager", "Video cache path not found");
                                            raVar4.ouw();
                                            com.bytedance.sdk.openadsdk.component.yu.ouw.ouw(vppVarLh);
                                        }
                                    }
                                });
                            }
                        } catch (Throwable th2) {
                            com.bytedance.sdk.component.utils.qbp.ouw("ADNFactory", "open component maybe not exist, please check", th2);
                        }
                    }
                }, ouwVar, adSlotBuild);
            }
        };
    }

    @Override // com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory
    public final IADLoader<PAGRewardedRequest, PAGRewardedAdLoadListener> createRewardAdLoader() {
        return new IADLoader<PAGRewardedRequest, PAGRewardedAdLoadListener>() { // from class: com.bytedance.sdk.openadsdk.fkw.ouw.4
            @Override // com.bytedance.sdk.openadsdk.api.factory.IADLoader
            public final /* synthetic */ void loadAd(String str, PAGRequest pAGRequest, ra raVar) {
                PAGRewardedRequest pAGRewardedRequest = (PAGRewardedRequest) pAGRequest;
                PAGRewardedAdLoadListener pAGRewardedAdLoadListener = (PAGRewardedAdLoadListener) raVar;
                if (com.bytedance.sdk.openadsdk.ouw.ouw.ouw(str, pAGRewardedRequest, pAGRewardedAdLoadListener)) {
                    return;
                }
                AdSlot.Builder codeId = new AdSlot.Builder().setCodeId(str);
                if (!TextUtils.isEmpty(pAGRewardedRequest.getAdString())) {
                    codeId.withBid(pAGRewardedRequest.getAdString());
                }
                com.bytedance.sdk.openadsdk.ouw.ouw.ouw(codeId, pAGRewardedRequest);
                final AdSlot adSlotBuild = codeId.setRequestExtraMap(pAGRewardedRequest.getExtraInfo()).build();
                final com.bytedance.sdk.openadsdk.ouw.fkw.vt vtVar = new com.bytedance.sdk.openadsdk.ouw.fkw.vt(pAGRewardedAdLoadListener);
                com.bytedance.sdk.openadsdk.ouw.ouw.ouw(new pno("loadRewardVideoAd") { // from class: com.bytedance.sdk.openadsdk.fkw.ouw.4.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.bytedance.sdk.openadsdk.core.model.ouw ouwVarVt;
                        if (!zih.yu().ra() && uoy.cd()) {
                            vtVar.onError(-18, "Blind mode does not allow requesting ads");
                            return;
                        }
                        if (com.bytedance.sdk.openadsdk.ouw.ouw.ouw(vtVar)) {
                            return;
                        }
                        AdSlot adSlot = adSlotBuild;
                        if (adSlot == null) {
                            vtVar.onError(-4, "adslot is null");
                            return;
                        }
                        try {
                            adSlot.setDurationSlotType(7);
                            final ryl rylVarOuw = ryl.ouw(zih.ouw());
                            final AdSlot adSlot2 = adSlotBuild;
                            final com.bytedance.sdk.openadsdk.component.reward.ra raVar2 = new com.bytedance.sdk.openadsdk.component.reward.ra(vtVar);
                            if (vt.ouw()) {
                                if (ko.yu()) {
                                    ko.vt("bidding", "reward video doNetwork , get new materials:BidAdm->MD5->" + z8.a.a(adSlot2.getBidAdm()));
                                }
                                final long jCurrentTimeMillis = System.currentTimeMillis();
                                ksc kscVar = new ksc();
                                kscVar.vt = 1;
                                zih.yu();
                                if (cf.pno(adSlot2.getCodeId()) || adSlot2.getExpressViewAcceptedWidth() > 0.0f || adSlot2.isExpressAd()) {
                                    kscVar.bly = 2;
                                }
                                zih.lh().ouw(adSlot2, kscVar, 7, (qbp) new zin() { // from class: com.bytedance.sdk.openadsdk.component.reward.ryl.4

                                    /* renamed from: lh */
                                    final /* synthetic */ AdSlot f8006lh;
                                    boolean ouw = false;
                                    final /* synthetic */ PAGRewardedAdLoadListener vt;
                                    final /* synthetic */ long yu;

                                    public AnonymousClass4(final PAGRewardedAdLoadListener raVar22, final AdSlot adSlot22, final long jCurrentTimeMillis2) {
                                        pAGRewardedAdLoadListener = raVar22;
                                        adSlot = adSlot22;
                                        j = jCurrentTimeMillis2;
                                    }

                                    @Override // com.bytedance.sdk.openadsdk.core.zin, com.bytedance.sdk.openadsdk.core.vpp.ouw
                                    public final void ouw(int i4, String str2) {
                                        PAGRewardedAdLoadListener pAGRewardedAdLoadListener2 = pAGRewardedAdLoadListener;
                                        if (pAGRewardedAdLoadListener2 != null) {
                                            pAGRewardedAdLoadListener2.onError(i4, str2);
                                        }
                                    }

                                    @Override // com.bytedance.sdk.openadsdk.core.zin, com.bytedance.sdk.openadsdk.core.qbp
                                    public final String ouw() {
                                        if (!TextUtils.isEmpty(adSlot.getBidAdm())) {
                                            return null;
                                        }
                                        cf.ouw(ryl.this.ouw);
                                        String strOuw = cf.ouw(adSlot.getCodeId(), true);
                                        if (TextUtils.isEmpty(strOuw)) {
                                            return null;
                                        }
                                        return strOuw;
                                    }

                                    @Override // com.bytedance.sdk.openadsdk.core.zin, com.bytedance.sdk.openadsdk.core.qbp
                                    public final boolean ouw(com.bytedance.sdk.openadsdk.core.model.ouw ouwVar) {
                                        cf.ouw(ryl.this.ouw);
                                        boolean zOuw = cf.ouw(ouwVar);
                                        this.ouw = zOuw;
                                        return zOuw;
                                    }

                                    @Override // com.bytedance.sdk.openadsdk.core.zin, com.bytedance.sdk.openadsdk.core.vpp.ouw
                                    public final void ouw(com.bytedance.sdk.openadsdk.core.model.ouw ouwVar, com.bytedance.sdk.openadsdk.core.model.lh lhVar) {
                                        com.bytedance.sdk.openadsdk.core.model.ouw ouwVar2;
                                        List<com.bytedance.sdk.openadsdk.core.model.vpp> list = ouwVar.yu;
                                        if (list != null && !list.isEmpty()) {
                                            jg jgVar = new jg(ryl.this.ouw, ouwVar, adSlot);
                                            if (!TextUtils.isEmpty(adSlot.getBidAdm())) {
                                                com.bytedance.sdk.openadsdk.zin.ouw.yu.ouw().ouw(ouwVar.yu.isEmpty() ? null : ouwVar.yu.get(0));
                                                com.bytedance.sdk.openadsdk.rn.lh.ouw(ouwVar.lh(), System.currentTimeMillis() - j);
                                            }
                                            if (pAGRewardedAdLoadListener == null || zih.yu().ryl() != 0) {
                                                ouwVar2 = ouwVar;
                                            } else {
                                                ryl.this.ouw(adSlot, ouwVar, pAGRewardedAdLoadListener, jgVar.ouw, this.ouw);
                                                ouwVar2 = ouwVar;
                                            }
                                            ryl.ouw(ryl.this, ouwVar2, jgVar, adSlot, false, pAGRewardedAdLoadListener);
                                            return;
                                        }
                                        PAGRewardedAdLoadListener pAGRewardedAdLoadListener2 = pAGRewardedAdLoadListener;
                                        if (pAGRewardedAdLoadListener2 != null) {
                                            pAGRewardedAdLoadListener2.onError(-3, com.bytedance.sdk.openadsdk.core.pno.ouw(-3));
                                            lhVar.vt = -3;
                                            lhVar.ra = 6;
                                            com.bytedance.sdk.openadsdk.core.model.lh.ouw(lhVar);
                                        }
                                    }
                                });
                                return;
                            }
                            if (TextUtils.isEmpty(adSlot22.getBidAdm()) && (ouwVarVt = com.bytedance.sdk.openadsdk.component.reward.cf.ouw(rylVarOuw.ouw).vt(adSlot22.getCodeId(), true)) != null && ouwVarVt.vt()) {
                                rylVarOuw.ouw(ouwVarVt, adSlot22, raVar22);
                                return;
                            }
                            if (ko.yu()) {
                                ko.vt("bidding", "reward video doNetwork , get new materials:BidAdm->MD5->" + z8.a.a(adSlot22.getBidAdm()));
                            }
                            final long jCurrentTimeMillis2 = System.currentTimeMillis();
                            ksc kscVar2 = new ksc();
                            kscVar2.vt = 1;
                            zih.yu();
                            if (cf.pno(adSlot22.getCodeId()) || adSlot22.getExpressViewAcceptedWidth() > 0.0f || adSlot22.isExpressAd()) {
                                kscVar2.bly = 2;
                            }
                            zih.lh().ouw(adSlot22, kscVar2, 7, new vpp.ouw() { // from class: com.bytedance.sdk.openadsdk.component.reward.ryl.7

                                /* renamed from: lh */
                                final /* synthetic */ long f8008lh;
                                final /* synthetic */ PAGRewardedAdLoadListener ouw;
                                final /* synthetic */ AdSlot vt;

                                public AnonymousClass7(final PAGRewardedAdLoadListener raVar22, final AdSlot adSlot22, final long jCurrentTimeMillis22) {
                                    pAGRewardedAdLoadListener = raVar22;
                                    adSlot = adSlot22;
                                    j = jCurrentTimeMillis22;
                                }

                                @Override // com.bytedance.sdk.openadsdk.core.vpp.ouw
                                public final void ouw(int i4, String str2) {
                                    PAGRewardedAdLoadListener pAGRewardedAdLoadListener2 = pAGRewardedAdLoadListener;
                                    if (pAGRewardedAdLoadListener2 != null) {
                                        pAGRewardedAdLoadListener2.onError(i4, str2);
                                    }
                                }

                                @Override // com.bytedance.sdk.openadsdk.core.vpp.ouw
                                public final void ouw(com.bytedance.sdk.openadsdk.core.model.ouw ouwVar, com.bytedance.sdk.openadsdk.core.model.lh lhVar) {
                                    com.bytedance.sdk.openadsdk.core.model.ouw ouwVar2;
                                    List<com.bytedance.sdk.openadsdk.core.model.vpp> list = ouwVar.yu;
                                    if (list != null && !list.isEmpty()) {
                                        jg jgVar = new jg(ryl.this.ouw, ouwVar, adSlot);
                                        if (!TextUtils.isEmpty(adSlot.getBidAdm())) {
                                            com.bytedance.sdk.openadsdk.zin.ouw.yu.ouw().ouw(ouwVar.yu.isEmpty() ? null : ouwVar.yu.get(0));
                                            com.bytedance.sdk.openadsdk.rn.lh.ouw(ouwVar.lh(), System.currentTimeMillis() - j);
                                        }
                                        if (pAGRewardedAdLoadListener == null || zih.yu().ryl() != 0) {
                                            ouwVar2 = ouwVar;
                                        } else {
                                            ryl.this.ouw(adSlot, ouwVar, pAGRewardedAdLoadListener, jgVar.ouw, false);
                                            ouwVar2 = ouwVar;
                                        }
                                        ryl.ouw(ryl.this, ouwVar2, jgVar, adSlot, false, pAGRewardedAdLoadListener);
                                        return;
                                    }
                                    PAGRewardedAdLoadListener pAGRewardedAdLoadListener2 = pAGRewardedAdLoadListener;
                                    if (pAGRewardedAdLoadListener2 != null) {
                                        pAGRewardedAdLoadListener2.onError(-3, com.bytedance.sdk.openadsdk.core.pno.ouw(-3));
                                        lhVar.vt = -3;
                                        lhVar.ra = 6;
                                        com.bytedance.sdk.openadsdk.core.model.lh.ouw(lhVar);
                                    }
                                }
                            });
                        } catch (Throwable th2) {
                            ko.vt("ADNFactory", "reward component maybe not exist, pls check1", th2);
                        }
                    }
                }, vtVar, adSlotBuild);
            }
        };
    }
}
