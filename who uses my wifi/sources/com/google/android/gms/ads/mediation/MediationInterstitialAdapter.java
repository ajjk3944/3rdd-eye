package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import defpackage.bd0;
import defpackage.cd0;
import defpackage.hd0;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
@Deprecated
/* loaded from: classes.dex */
public interface MediationInterstitialAdapter extends cd0 {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestInterstitialAd(Context context, hd0 hd0Var, Bundle bundle, bd0 bd0Var, Bundle bundle2);

    void showInterstitial();
}
