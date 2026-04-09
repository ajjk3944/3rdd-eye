package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class az1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f9503a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f9504b;

    public az1(int i4, boolean z3) {
        this.f9503a = i4;
        this.f9504b = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || az1.class != obj.getClass()) {
            return false;
        }
        az1 az1Var = (az1) obj;
        return this.f9503a == az1Var.f9503a && this.f9504b == az1Var.f9504b;
    }

    public final int hashCode() {
        return (this.f9503a * 31) + (this.f9504b ? 1 : 0);
    }
}
