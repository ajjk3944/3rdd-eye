package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class ro0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15721a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ so0 f15722b;

    public /* synthetic */ ro0(so0 so0Var, int i4) {
        this.f15721a = i4;
        this.f15722b = so0Var;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f15721a) {
            case 0:
                so0 so0Var = this.f15722b;
                so0Var.f16489a.b().execute(new ro0(so0Var, 1));
                break;
            default:
                this.f15722b.h4(5);
                break;
        }
    }
}
