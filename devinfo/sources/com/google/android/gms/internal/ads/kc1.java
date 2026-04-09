package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class kc1 {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f13127a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f13128b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f13129c;

    public kc1(long[] jArr, long[] jArr2, long[] jArr3) {
        this.f13127a = jArr;
        this.f13128b = jArr2;
        this.f13129c = jArr3;
    }

    public void a(long[] jArr, long[] jArr2) {
        System.arraycopy(jArr2, 0, jArr, 0, 10);
    }

    public final void b(kc1 kc1Var, int i4) {
        mq0.n(this.f13127a, kc1Var.f13127a, i4);
        mq0.n(this.f13128b, kc1Var.f13128b, i4);
        mq0.n(this.f13129c, kc1Var.f13129c, i4);
    }

    public kc1() {
        kc1 kc1Var = nn1.A;
        this.f13127a = Arrays.copyOf(kc1Var.f13127a, 10);
        this.f13128b = Arrays.copyOf(kc1Var.f13128b, 10);
        this.f13129c = Arrays.copyOf(kc1Var.f13129c, 10);
    }
}
