package com.applovin.impl;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class l9 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4453a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h0 f4454b;

    public /* synthetic */ l9(h0 h0Var, int i4) {
        this.f4453a = i4;
        this.f4454b = h0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4453a) {
            case 0:
                this.f4454b.e();
                break;
            case 1:
                this.f4454b.f();
                break;
            case 2:
                this.f4454b.a();
                break;
            default:
                this.f4454b.d();
                break;
        }
    }
}
