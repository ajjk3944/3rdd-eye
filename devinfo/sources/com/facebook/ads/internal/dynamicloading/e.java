package com.facebook.ads.internal.dynamicloading;

import com.facebook.ads.AudienceNetworkAds;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AudienceNetworkAds.InitListener f8920a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Throwable f8921b;

    public e(AudienceNetworkAds.InitListener initListener, Throwable th2) {
        this.f8920a = initListener;
        this.f8921b = th2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8920a.onInitialized(DynamicLoaderFactory.createErrorInitResult(this.f8921b));
    }
}
