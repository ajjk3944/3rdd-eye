package com.applovin.impl;

import com.applovin.sdk.AppLovinBidTokenCollectionListener;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class ga implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4182a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppLovinBidTokenCollectionListener f4183b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f4184c;

    public /* synthetic */ ga(AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener, String str, int i4) {
        this.f4182a = i4;
        this.f4183b = appLovinBidTokenCollectionListener;
        this.f4184c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4182a) {
            case 0:
                t2.c(this.f4183b, this.f4184c);
                break;
            default:
                t2.d(this.f4183b, this.f4184c);
                break;
        }
    }
}
