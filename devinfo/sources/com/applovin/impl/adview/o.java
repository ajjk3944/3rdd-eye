package com.applovin.impl.adview;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3707a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f3708b;

    public /* synthetic */ o(a aVar, int i4) {
        this.f3707a = i4;
        this.f3708b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3707a) {
            case 0:
                this.f3708b.s();
                break;
            case 1:
                this.f3708b.p();
                break;
            case 2:
                this.f3708b.r();
                break;
            case 3:
                this.f3708b.q();
                break;
            case 4:
                this.f3708b.t();
                break;
            default:
                this.f3708b.o();
                break;
        }
    }
}
