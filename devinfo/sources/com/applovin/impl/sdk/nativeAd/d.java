package com.applovin.impl.sdk.nativeAd;

import com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5641a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5642b;

    public /* synthetic */ d(int i4, Object obj) {
        this.f5641a = i4;
        this.f5642b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5641a) {
            case 0:
                ((AppLovinVastMediaView.e) this.f5642b).a();
                break;
            case 1:
                ((AppLovinVastMediaView.f) this.f5642b).a();
                break;
            default:
                ((AppLovinNativeAdImpl) this.f5642b).lambda$unregisterViewsForInteraction$0();
                break;
        }
    }
}
