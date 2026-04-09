package com.applovin.impl;

import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdDisplayListener;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class ha implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4235a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppLovinAdDisplayListener f4236b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AppLovinAd f4237c;

    public /* synthetic */ ha(AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAd appLovinAd, int i4) {
        this.f4235a = i4;
        this.f4236b = appLovinAdDisplayListener;
        this.f4237c = appLovinAd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4235a) {
            case 0:
                t2.c(this.f4236b, this.f4237c);
                break;
            default:
                t2.d(this.f4236b, this.f4237c);
                break;
        }
    }
}
