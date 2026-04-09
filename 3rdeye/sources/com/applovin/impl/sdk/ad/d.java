package com.applovin.impl.sdk.ad;

import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.applovin.impl.v4;
import r.InterfaceC5503a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements InterfaceC5503a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21073a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f21074b;

    public /* synthetic */ d(Object obj, int i) {
        this.f21073a = i;
        this.f21074b = obj;
    }

    @Override // r.InterfaceC5503a
    public final Object apply(Object obj) {
        switch (this.f21073a) {
            case 0:
                return ((b) this.f21074b).p((v4) obj);
            case 1:
                return ((b) this.f21074b).e((v4) obj);
            case 2:
                return ((b) this.f21074b).f((v4) obj);
            default:
                return AppLovinNativeAdImpl.lambda$getOpenMeasurementVerificationScriptResources$3((V.d) this.f21074b, (v4) obj);
        }
    }
}
