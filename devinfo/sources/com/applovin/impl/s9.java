package com.applovin.impl;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class s9 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5319a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l4 f5320b;

    public /* synthetic */ s9(l4 l4Var, int i4) {
        this.f5319a = i4;
        this.f5320b = l4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5319a) {
            case 0:
                this.f5320b.k();
                break;
            case 1:
                this.f5320b.n();
                break;
            case 2:
                this.f5320b.u();
                break;
            case 3:
                this.f5320b.o();
                break;
            case 4:
                this.f5320b.s();
                break;
            case 5:
                this.f5320b.p();
                break;
            case 6:
                this.f5320b.r();
                break;
            case 7:
                this.f5320b.l();
                break;
            case 8:
                this.f5320b.t();
                break;
            case 9:
                this.f5320b.q();
                break;
            default:
                this.f5320b.m();
                break;
        }
    }
}
