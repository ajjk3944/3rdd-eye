package com.applovin.impl;

import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import r.InterfaceC5503a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class F0 implements InterfaceC5503a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18802a;

    public /* synthetic */ F0(int i) {
        this.f18802a = i;
    }

    @Override // r.InterfaceC5503a
    public final Object apply(Object obj) {
        switch (this.f18802a) {
            case 0:
                return q2.g((v4) obj);
            case 1:
                return com.applovin.impl.sdk.ad.b.r((v4) obj);
            case 2:
                return com.applovin.impl.sdk.ad.b.o((v4) obj);
            case 3:
                return AppLovinNativeAdImpl.lambda$getDirectDownloadParameters$4((v4) obj);
            default:
                return null;
        }
    }
}
