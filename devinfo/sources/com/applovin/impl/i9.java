package com.applovin.impl;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class i9 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4312a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f4 f4313b;

    public /* synthetic */ i9(f4 f4Var, int i4) {
        this.f4312a = i4;
        this.f4313b = f4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4312a) {
            case 0:
                this.f4313b.d();
                break;
            case 1:
                this.f4313b.c();
                break;
            default:
                this.f4313b.b();
                break;
        }
    }
}
