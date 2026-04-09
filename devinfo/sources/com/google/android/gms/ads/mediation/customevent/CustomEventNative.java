package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import bb.z;
import cb.a;
import cb.d;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
@Deprecated
/* loaded from: classes3.dex */
public interface CustomEventNative extends a {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestNativeAd(Context context, d dVar, String str, z zVar, Bundle bundle);
}
