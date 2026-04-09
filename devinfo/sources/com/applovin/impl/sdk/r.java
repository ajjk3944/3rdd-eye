package com.applovin.impl.sdk;

import com.applovin.impl.sdk.c;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class r implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5725a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5726b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5727c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f5728d;

    public /* synthetic */ r(AppLovinAdServiceImpl appLovinAdServiceImpl, AppLovinError appLovinError, AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f5725a = 1;
        this.f5726b = appLovinAdServiceImpl;
        this.f5728d = appLovinError;
        this.f5727c = appLovinAdLoadListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5725a) {
            case 0:
                ((AppLovinAdServiceImpl) this.f5726b).a((AppLovinAdLoadListener) this.f5727c, (AppLovinAd) this.f5728d);
                break;
            case 1:
                ((AppLovinAdServiceImpl) this.f5726b).a((AppLovinError) this.f5728d, (AppLovinAdLoadListener) this.f5727c);
                break;
            case 2:
                ((c) this.f5726b).a((com.applovin.impl.sdk.ad.b) this.f5727c, (c.b) this.f5728d);
                break;
            default:
                ((n) this.f5726b).a((Long) this.f5727c, this.f5728d);
                break;
        }
    }

    public /* synthetic */ r(Object obj, Object obj2, Object obj3, int i4) {
        this.f5725a = i4;
        this.f5726b = obj;
        this.f5727c = obj2;
        this.f5728d = obj3;
    }
}
