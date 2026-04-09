package com.google.android.gms.ads.mediation.rtb;

import android.os.RemoteException;
import bb.a;
import bb.e;
import bb.j;
import bb.m;
import bb.r;
import bb.u;
import bb.y;
import db.b;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class RtbAdapter extends a {
    public abstract void collectSignals(db.a aVar, b bVar);

    public void loadRtbAppOpenAd(j jVar, e eVar) {
        loadAppOpenAd(jVar, eVar);
    }

    public void loadRtbBannerAd(m mVar, e eVar) {
        loadBannerAd(mVar, eVar);
    }

    public void loadRtbInterstitialAd(r rVar, e eVar) {
        loadInterstitialAd(rVar, eVar);
    }

    @Deprecated
    public void loadRtbNativeAd(u uVar, e eVar) {
        loadNativeAd(uVar, eVar);
    }

    public void loadRtbNativeAdMapper(u uVar, e eVar) throws RemoteException {
        loadNativeAdMapper(uVar, eVar);
    }

    public void loadRtbRewardedAd(y yVar, e eVar) {
        loadRewardedAd(yVar, eVar);
    }

    public void loadRtbRewardedInterstitialAd(y yVar, e eVar) {
        loadRewardedInterstitialAd(yVar, eVar);
    }
}
