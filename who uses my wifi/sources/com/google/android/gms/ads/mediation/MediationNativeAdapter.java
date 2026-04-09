package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import defpackage.cd0;
import defpackage.jd0;
import defpackage.lg0;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
@Deprecated
/* loaded from: classes.dex */
public interface MediationNativeAdapter extends cd0 {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestNativeAd(Context context, jd0 jd0Var, Bundle bundle, lg0 lg0Var, Bundle bundle2);
}
