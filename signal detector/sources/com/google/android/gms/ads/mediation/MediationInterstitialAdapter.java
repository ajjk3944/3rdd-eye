package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import w2.f;
import w2.g;
import w2.p;

@Deprecated
/* loaded from: classes.dex */
public interface MediationInterstitialAdapter extends g {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestInterstitialAd(Context context, p pVar, Bundle bundle, f fVar, Bundle bundle2);

    void showInterstitial();
}
