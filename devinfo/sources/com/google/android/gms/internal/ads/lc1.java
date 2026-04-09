package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class lc1 extends kc1 {

    /* renamed from: d, reason: collision with root package name */
    public final long[] f13459d;

    /* JADX WARN: Illegal instructions before constructor call */
    public lc1(l90 l90Var) {
        long[] jArr = new long[10];
        long[] jArr2 = new long[10];
        long[] jArr3 = new long[10];
        long[] jArr4 = new long[10];
        super(jArr, jArr2, jArr4);
        this.f13459d = jArr3;
        av0 av0Var = (av0) l90Var.f13426b;
        ls.i(jArr, (long[]) av0Var.f9423c, (long[]) av0Var.f9422b);
        ls.o(jArr2, (long[]) av0Var.f9423c, (long[]) av0Var.f9422b);
        System.arraycopy((long[]) av0Var.f9424d, 0, jArr3, 0, 10);
        ls.E(jArr4, (long[]) l90Var.f13427c, mc1.f13865b);
    }

    @Override // com.google.android.gms.internal.ads.kc1
    public final void a(long[] jArr, long[] jArr2) {
        ls.E(jArr, jArr2, this.f13459d);
    }
}
