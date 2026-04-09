package com.applovin.impl;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class pa implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5088a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w1 f5089b;

    public /* synthetic */ pa(w1 w1Var, int i4) {
        this.f5088a = i4;
        this.f5089b = w1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5088a) {
            case 0:
                this.f5089b.k();
                break;
            default:
                this.f5089b.j();
                break;
        }
    }
}
