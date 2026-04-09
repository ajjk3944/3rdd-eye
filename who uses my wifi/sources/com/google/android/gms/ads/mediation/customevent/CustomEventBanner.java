package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import defpackage.bd0;
import defpackage.d3;
import defpackage.el;
import defpackage.fl;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
@Deprecated
/* loaded from: classes.dex */
public interface CustomEventBanner extends el {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestBannerAd(Context context, fl flVar, String str, d3 d3Var, bd0 bd0Var, Bundle bundle);
}
