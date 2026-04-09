package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import bb.f;
import bb.g;
import bb.s;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
@Deprecated
/* loaded from: classes3.dex */
public interface MediationInterstitialAdapter extends g {
    @Override // bb.g
    /* synthetic */ void onDestroy();

    @Override // bb.g
    /* synthetic */ void onPause();

    @Override // bb.g
    /* synthetic */ void onResume();

    void requestInterstitialAd(Context context, s sVar, Bundle bundle, f fVar, Bundle bundle2);

    void showInterstitial();
}
