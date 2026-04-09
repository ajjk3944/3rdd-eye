package com.applovin.impl;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class r8 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5264a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a2 f5265b;

    public /* synthetic */ r8(a2 a2Var, int i4) {
        this.f5264a = i4;
        this.f5265b = a2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5264a) {
            case 0:
                this.f5265b.H();
                break;
            case 1:
                this.f5265b.J();
                break;
            case 2:
                this.f5265b.L();
                break;
            case 3:
                this.f5265b.P();
                break;
            case 4:
                this.f5265b.N();
                break;
            case 5:
                this.f5265b.K();
                break;
            default:
                this.f5265b.I();
                break;
        }
    }
}
