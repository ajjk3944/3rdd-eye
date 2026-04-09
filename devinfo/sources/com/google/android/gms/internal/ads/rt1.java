package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class rt1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f15762a;

    /* renamed from: b, reason: collision with root package name */
    public final float f15763b;

    /* renamed from: c, reason: collision with root package name */
    public final long f15764c;

    public /* synthetic */ rt1(qt1 qt1Var) {
        this.f15762a = qt1Var.f15443a;
        this.f15763b = qt1Var.f15444b;
        this.f15764c = qt1Var.f15445c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rt1)) {
            return false;
        }
        rt1 rt1Var = (rt1) obj;
        return this.f15762a == rt1Var.f15762a && this.f15763b == rt1Var.f15763b && this.f15764c == rt1Var.f15764c;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f15762a), Float.valueOf(this.f15763b), Long.valueOf(this.f15764c));
    }
}
