package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import w2.v;
import x2.InterfaceC2988a;
import x2.InterfaceC2991d;

@Deprecated
/* loaded from: classes.dex */
public interface CustomEventNative extends InterfaceC2988a {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestNativeAd(Context context, InterfaceC2991d interfaceC2991d, String str, v vVar, Bundle bundle);
}
