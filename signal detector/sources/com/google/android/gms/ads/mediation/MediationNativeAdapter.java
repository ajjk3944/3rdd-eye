package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import w2.g;
import w2.s;
import w2.v;

@Deprecated
/* loaded from: classes.dex */
public interface MediationNativeAdapter extends g {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestNativeAd(Context context, s sVar, Bundle bundle, v vVar, Bundle bundle2);
}
