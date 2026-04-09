package com.applovin.impl.sdk;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class x implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5749a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f5750b;

    public /* synthetic */ x(int i4, k kVar) {
        this.f5749a = i4;
        this.f5750b = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5749a) {
            case 0:
                this.f5750b.I0();
                break;
            case 1:
                this.f5750b.J0();
                break;
            case 2:
                this.f5750b.K0();
                break;
            default:
                this.f5750b.L0();
                break;
        }
    }
}
