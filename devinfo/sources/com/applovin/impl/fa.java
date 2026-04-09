package com.applovin.impl;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdListener;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class fa implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4134a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f4135b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MaxAdListener f4136c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ MaxAd f4137d;

    public /* synthetic */ fa(boolean z3, MaxAdListener maxAdListener, MaxAd maxAd, int i4) {
        this.f4134a = i4;
        this.f4135b = z3;
        this.f4136c = maxAdListener;
        this.f4137d = maxAd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4134a) {
            case 0:
                t2.a(this.f4135b, this.f4136c, this.f4137d);
                break;
            case 1:
                t2.e(this.f4135b, this.f4136c, this.f4137d);
                break;
            case 2:
                t2.c(this.f4135b, this.f4136c, this.f4137d);
                break;
            default:
                t2.f(this.f4135b, this.f4136c, this.f4137d);
                break;
        }
    }
}
