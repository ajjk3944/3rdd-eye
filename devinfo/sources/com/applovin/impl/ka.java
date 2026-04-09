package com.applovin.impl;

import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdRewardListener;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class ka implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4381a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppLovinAdRewardListener f4382b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AppLovinAd f4383c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Map f4384d;

    public /* synthetic */ ka(AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAd appLovinAd, Map map, int i4) {
        this.f4381a = i4;
        this.f4382b = appLovinAdRewardListener;
        this.f4383c = appLovinAd;
        this.f4384d = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4381a) {
            case 0:
                t2.d(this.f4382b, this.f4383c, this.f4384d);
                break;
            case 1:
                t2.e(this.f4382b, this.f4383c, this.f4384d);
                break;
            default:
                t2.f(this.f4382b, this.f4383c, this.f4384d);
                break;
        }
    }
}
