package com.applovin.impl;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdViewAdListener;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class W implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18884b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f18885c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ MaxAd f18886d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ MaxAdListener f18887e;

    public /* synthetic */ W(boolean z10, MaxAdListener maxAdListener, MaxAd maxAd, int i) {
        this.f18884b = i;
        this.f18885c = z10;
        this.f18887e = maxAdListener;
        this.f18886d = maxAd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18884b) {
            case 0:
                l2.b(this.f18885c, (MaxAdViewAdListener) this.f18887e, this.f18886d);
                break;
            default:
                l2.f(this.f18885c, this.f18887e, this.f18886d);
                break;
        }
    }
}
