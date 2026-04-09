package com.applovin.impl;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class a9 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3601a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e1 f3602b;

    public /* synthetic */ a9(e1 e1Var, int i4) {
        this.f3601a = i4;
        this.f3602b = e1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3601a) {
            case 0:
                this.f3602b.j();
                break;
            case 1:
                this.f3602b.e();
                break;
            default:
                this.f3602b.i();
                break;
        }
    }
}
