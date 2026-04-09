package com.applovin.impl;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import io.appmetrica.analytics.impl.C4766lc;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class Q implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18850b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f18851c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f18852d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f18853e;

    public /* synthetic */ Q(C4766lc c4766lc, LocationControllerObserver locationControllerObserver, boolean z10) {
        this.f18850b = 2;
        this.f18853e = c4766lc;
        this.f18852d = locationControllerObserver;
        this.f18851c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18850b) {
            case 0:
                l2.a(this.f18851c, (MaxAdRevenueListener) this.f18853e, (MaxAd) this.f18852d);
                break;
            case 1:
                l2.a(this.f18851c, (MaxNativeAdListener) this.f18853e, (MaxAd) this.f18852d);
                break;
            default:
                C4766lc.a((C4766lc) this.f18853e, (LocationControllerObserver) this.f18852d, this.f18851c);
                break;
        }
    }

    public /* synthetic */ Q(boolean z10, Object obj, MaxAd maxAd, int i) {
        this.f18850b = i;
        this.f18851c = z10;
        this.f18853e = obj;
        this.f18852d = maxAd;
    }
}
