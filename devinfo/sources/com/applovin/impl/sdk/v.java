package com.applovin.impl.sdk;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class v implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5744a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f5745b;

    public /* synthetic */ v(d dVar, int i4) {
        this.f5744a = i4;
        this.f5745b = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5744a) {
            case 0:
                this.f5745b.c();
                break;
            default:
                this.f5745b.d();
                break;
        }
    }
}
