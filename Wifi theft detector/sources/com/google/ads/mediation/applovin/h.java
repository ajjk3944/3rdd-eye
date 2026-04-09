package com.google.ads.mediation.applovin;

import android.content.Context;
import com.applovin.sdk.AppLovinSdk;

/* loaded from: classes.dex */
public class h {
    public AppLovinSdk a(Context context) {
        return AppLovinSdk.getInstance(context);
    }

    public String b() {
        return AppLovinSdk.VERSION;
    }
}
