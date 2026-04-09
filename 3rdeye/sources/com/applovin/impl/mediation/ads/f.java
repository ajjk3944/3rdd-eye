package com.applovin.impl.mediation.ads;

import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl;
import com.applovin.impl.s2;
import com.applovin.mediation.MaxAd;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f20312b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f20313c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f20314d;

    public /* synthetic */ f(int i, Object obj, Object obj2) {
        this.f20312b = i;
        this.f20313c = obj;
        this.f20314d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20312b) {
            case 0:
                ((MaxNativeAdLoaderImpl.c) this.f20313c).a((MaxAd) this.f20314d);
                break;
            case 1:
                ((MaxAdViewImpl) this.f20313c).a((s2) this.f20314d);
                break;
            case 2:
                ((MaxFullscreenAdImpl) this.f20313c).a((String) this.f20314d);
                break;
            default:
                ((MaxFullscreenAdImpl.b) this.f20313c).b((MaxAd) this.f20314d);
                break;
        }
    }
}
