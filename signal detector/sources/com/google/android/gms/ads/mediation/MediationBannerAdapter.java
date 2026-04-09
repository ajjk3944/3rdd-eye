package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import j2.C2552h;
import w2.f;
import w2.g;
import w2.l;

@Deprecated
/* loaded from: classes.dex */
public interface MediationBannerAdapter extends g {
    View getBannerView();

    @Override // w2.g, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    /* synthetic */ void onDestroy();

    @Override // w2.g, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    /* synthetic */ void onPause();

    @Override // w2.g, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    /* synthetic */ void onResume();

    void requestBannerAd(Context context, l lVar, Bundle bundle, C2552h c2552h, f fVar, Bundle bundle2);
}
