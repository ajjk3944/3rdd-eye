package com.applovin.impl;

import com.applovin.impl.b1;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinPostbackListener;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class u8 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5835a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5836b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5837c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f5838d;

    public /* synthetic */ u8(Object obj, Object obj2, int i4, int i10) {
        this.f5835a = i10;
        this.f5837c = obj;
        this.f5838d = obj2;
        this.f5836b = i4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5835a) {
            case 0:
                ((b1) this.f5837c).b((b1.c) this.f5838d, this.f5836b);
                break;
            case 1:
                t2.b((AppLovinAdRewardListener) this.f5837c, (AppLovinAd) this.f5838d, this.f5836b);
                break;
            default:
                t2.b((AppLovinPostbackListener) this.f5837c, (String) this.f5838d, this.f5836b);
                break;
        }
    }
}
