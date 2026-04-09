package com.applovin.impl;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class ja implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4346a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f4347b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MaxNativeAdListener f4348c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ MaxAd f4349d;

    public /* synthetic */ ja(boolean z3, MaxNativeAdListener maxNativeAdListener, MaxAd maxAd, int i4) {
        this.f4346a = i4;
        this.f4347b = z3;
        this.f4348c = maxNativeAdListener;
        this.f4349d = maxAd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4346a) {
            case 0:
                t2.a(this.f4347b, this.f4348c, this.f4349d);
                break;
            default:
                t2.b(this.f4347b, this.f4348c, this.f4349d);
                break;
        }
    }
}
