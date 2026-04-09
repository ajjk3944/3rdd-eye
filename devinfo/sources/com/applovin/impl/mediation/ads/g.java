package com.applovin.impl.mediation.ads;

import com.applovin.impl.c3;
import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl;
import com.applovin.mediation.MaxAd;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4650a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4651b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4652c;

    public /* synthetic */ g(int i4, Object obj, Object obj2) {
        this.f4650a = i4;
        this.f4651b = obj;
        this.f4652c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4650a) {
            case 0:
                ((MaxNativeAdLoaderImpl.c) this.f4651b).a((MaxAd) this.f4652c);
                break;
            case 1:
                ((MaxFullscreenAdImpl) this.f4651b).a((Long) this.f4652c);
                break;
            case 2:
                ((MaxFullscreenAdImpl.b) this.f4651b).a((MaxAd) this.f4652c);
                break;
            default:
                ((MaxFullscreenAdImpl.b) this.f4651b).a((c3) this.f4652c);
                break;
        }
    }
}
