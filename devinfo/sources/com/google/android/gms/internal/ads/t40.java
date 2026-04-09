package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class t40 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16699a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r7 f16700b;

    public /* synthetic */ t40(r7 r7Var, int i4) {
        this.f16699a = i4;
        this.f16700b = r7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16699a) {
            case 0:
                this.f16700b.n(new uf0(3));
                break;
            default:
                ((uk0) ((pq0) ((ai) this.f16700b.f15561f).f9332c).f15074c).e();
                break;
        }
    }
}
