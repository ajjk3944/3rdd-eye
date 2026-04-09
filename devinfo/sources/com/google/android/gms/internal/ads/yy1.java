package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class yy1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18932a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bz1 f18933b;

    public /* synthetic */ yy1(bz1 bz1Var, int i4) {
        this.f18932a = i4;
        this.f18933b = bz1Var;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f18932a) {
            case 0:
                bz1 bz1Var = this.f18933b;
                if (!bz1Var.N) {
                    hy1 hy1Var = bz1Var.f9874p;
                    hy1Var.getClass();
                    hy1Var.d(bz1Var);
                    break;
                }
                break;
            case 1:
                this.f18933b.H = true;
                break;
            default:
                this.f18933b.s();
                break;
        }
    }
}
