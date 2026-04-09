package com.google.android.gms.ads.mediation.rtb;

import w2.AbstractC2969a;
import w2.InterfaceC2973e;
import w2.i;
import w2.k;
import w2.o;
import w2.r;
import w2.u;
import y2.C3011a;
import y2.InterfaceC3012b;

/* loaded from: classes.dex */
public abstract class RtbAdapter extends AbstractC2969a {
    public abstract void collectSignals(C3011a c3011a, InterfaceC3012b interfaceC3012b);

    public void loadRtbAppOpenAd(i iVar, InterfaceC2973e interfaceC2973e) {
        loadAppOpenAd(iVar, interfaceC2973e);
    }

    public void loadRtbBannerAd(k kVar, InterfaceC2973e interfaceC2973e) {
        loadBannerAd(kVar, interfaceC2973e);
    }

    public void loadRtbInterstitialAd(o oVar, InterfaceC2973e interfaceC2973e) {
        loadInterstitialAd(oVar, interfaceC2973e);
    }

    @Deprecated
    public void loadRtbNativeAd(r rVar, InterfaceC2973e interfaceC2973e) {
        loadNativeAd(rVar, interfaceC2973e);
    }

    public void loadRtbNativeAdMapper(r rVar, InterfaceC2973e interfaceC2973e) {
        loadNativeAdMapper(rVar, interfaceC2973e);
    }

    public void loadRtbRewardedAd(u uVar, InterfaceC2973e interfaceC2973e) {
        loadRewardedAd(uVar, interfaceC2973e);
    }

    public void loadRtbRewardedInterstitialAd(u uVar, InterfaceC2973e interfaceC2973e) {
        loadRewardedInterstitialAd(uVar, interfaceC2973e);
    }
}
