package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class qz1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f15491a;

    /* renamed from: b, reason: collision with root package name */
    public final long f15492b;

    public qz1(long j, long j8) {
        this.f15491a = j;
        this.f15492b = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qz1)) {
            return false;
        }
        qz1 qz1Var = (qz1) obj;
        return this.f15491a == qz1Var.f15491a && this.f15492b == qz1Var.f15492b;
    }

    public final int hashCode() {
        return (((int) this.f15491a) * 31) + ((int) this.f15492b);
    }
}
