package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class uz1 implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f17392a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f17393b;

    public uz1(mx1 mx1Var, int i4) {
        this.f17392a = 1 == (mx1Var.f14046e & 1);
        this.f17393b = d7.B(i4, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        uz1 uz1Var = (uz1) obj;
        return q41.f15203a.d(this.f17393b, uz1Var.f17393b).d(this.f17392a, uz1Var.f17392a).e();
    }
}
