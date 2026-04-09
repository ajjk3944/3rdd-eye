package com.applovin.impl.sdk;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class y implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5751a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f5752b;

    public /* synthetic */ y(l lVar, int i4) {
        this.f5751a = i4;
        this.f5752b = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5751a) {
            case 0:
                this.f5752b.W();
                break;
            default:
                this.f5752b.V();
                break;
        }
    }
}
