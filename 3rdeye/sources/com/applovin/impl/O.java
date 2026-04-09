package com.applovin.impl;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxError;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class O implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18836b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f18837c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ MaxAdListener f18838d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ MaxError f18839e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f18840f;

    public /* synthetic */ O(boolean z10, MaxAdListener maxAdListener, Object obj, MaxError maxError, int i) {
        this.f18836b = i;
        this.f18837c = z10;
        this.f18838d = maxAdListener;
        this.f18840f = obj;
        this.f18839e = maxError;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18836b) {
            case 0:
                String str = (String) this.f18840f;
                l2.a(this.f18837c, this.f18838d, str, this.f18839e);
                break;
            default:
                MaxAd maxAd = (MaxAd) this.f18840f;
                l2.a(this.f18837c, this.f18838d, maxAd, this.f18839e);
                break;
        }
    }
}
