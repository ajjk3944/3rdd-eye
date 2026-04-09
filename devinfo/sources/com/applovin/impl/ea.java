package com.applovin.impl;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdViewAdListener;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class ea implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4088a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f4089b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MaxAdViewAdListener f4090c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ MaxAd f4091d;

    public /* synthetic */ ea(boolean z3, MaxAdViewAdListener maxAdViewAdListener, MaxAd maxAd, int i4) {
        this.f4088a = i4;
        this.f4089b = z3;
        this.f4090c = maxAdViewAdListener;
        this.f4091d = maxAd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4088a) {
            case 0:
                t2.b(this.f4089b, this.f4090c, this.f4091d);
                break;
            default:
                t2.d(this.f4089b, this.f4090c, this.f4091d);
                break;
        }
    }
}
