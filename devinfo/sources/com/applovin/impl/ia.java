package com.applovin.impl;

import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinAdViewEventListener;
import com.applovin.sdk.AppLovinAd;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class ia implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4314a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppLovinAdViewEventListener f4315b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AppLovinAd f4316c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AppLovinAdView f4317d;

    public /* synthetic */ ia(AppLovinAdViewEventListener appLovinAdViewEventListener, AppLovinAd appLovinAd, AppLovinAdView appLovinAdView, int i4) {
        this.f4314a = i4;
        this.f4315b = appLovinAdViewEventListener;
        this.f4316c = appLovinAd;
        this.f4317d = appLovinAdView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4314a) {
            case 0:
                t2.d(this.f4315b, this.f4316c, this.f4317d);
                break;
            case 1:
                t2.f(this.f4315b, this.f4316c, this.f4317d);
                break;
            default:
                t2.e(this.f4315b, this.f4316c, this.f4317d);
                break;
        }
    }
}
