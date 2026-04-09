package com.applovin.impl.mediation.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4637a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MaxAdViewImpl f4638b;

    public /* synthetic */ c(MaxAdViewImpl maxAdViewImpl, int i4) {
        this.f4637a = i4;
        this.f4638b = maxAdViewImpl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4637a) {
            case 0:
                this.f4638b.g();
                break;
            default:
                this.f4638b.c();
                break;
        }
    }
}
