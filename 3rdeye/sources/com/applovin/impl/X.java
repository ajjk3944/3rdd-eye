package com.applovin.impl;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdExpirationListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class X implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18890b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f18891c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f18892d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f18893e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f18894f;

    public /* synthetic */ X(boolean z10, Object obj, Object obj2, Object obj3, int i) {
        this.f18890b = i;
        this.f18891c = z10;
        this.f18892d = obj;
        this.f18893e = obj2;
        this.f18894f = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18890b) {
            case 0:
                String str = (String) this.f18893e;
                l2.a(this.f18891c, (MaxNativeAdListener) this.f18892d, str, (MaxError) this.f18894f);
                break;
            default:
                MaxAd maxAd = (MaxAd) this.f18893e;
                MaxAd maxAd2 = (MaxAd) this.f18894f;
                l2.a(this.f18891c, (MaxAdExpirationListener) this.f18892d, maxAd, maxAd2);
                break;
        }
    }
}
