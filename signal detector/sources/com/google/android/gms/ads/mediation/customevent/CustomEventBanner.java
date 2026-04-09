package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import j2.C2552h;
import w2.f;
import x2.InterfaceC2988a;
import x2.InterfaceC2989b;

@Deprecated
/* loaded from: classes.dex */
public interface CustomEventBanner extends InterfaceC2988a {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestBannerAd(Context context, InterfaceC2989b interfaceC2989b, String str, C2552h c2552h, f fVar, Bundle bundle);
}
