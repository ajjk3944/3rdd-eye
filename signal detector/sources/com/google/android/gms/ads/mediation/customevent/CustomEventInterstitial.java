package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import w2.f;
import x2.InterfaceC2988a;
import x2.InterfaceC2990c;

@Deprecated
/* loaded from: classes.dex */
public interface CustomEventInterstitial extends InterfaceC2988a {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestInterstitialAd(Context context, InterfaceC2990c interfaceC2990c, String str, f fVar, Bundle bundle);

    void showInterstitial();
}
