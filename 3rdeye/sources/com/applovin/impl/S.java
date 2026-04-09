package com.applovin.impl;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdListener;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class S implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18856b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f18857c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ MaxAdListener f18858d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ MaxAd f18859e;

    public /* synthetic */ S(boolean z10, MaxAdListener maxAdListener, MaxAd maxAd, int i) {
        this.f18856b = i;
        this.f18857c = z10;
        this.f18858d = maxAdListener;
        this.f18859e = maxAd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18856b) {
            case 0:
                l2.c(this.f18857c, this.f18858d, this.f18859e);
                break;
            default:
                l2.e(this.f18857c, this.f18858d, this.f18859e);
                break;
        }
    }
}
