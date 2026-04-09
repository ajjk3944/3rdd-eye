package com.applovin.impl;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class z9 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6347a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3 f6348b;

    public /* synthetic */ z9(p3 p3Var, int i4) {
        this.f6347a = i4;
        this.f6348b = p3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6347a) {
            case 0:
                this.f6348b.h();
                break;
            default:
                this.f6348b.d();
                break;
        }
    }
}
