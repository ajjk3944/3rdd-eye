package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class hv1 {

    /* renamed from: d, reason: collision with root package name */
    public static final hv1 f11989d = new j5().b();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f11990a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f11991b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f11992c;

    public /* synthetic */ hv1(j5 j5Var) {
        this.f11990a = j5Var.f12633a;
        this.f11991b = j5Var.f12634b;
        this.f11992c = j5Var.f12635c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || hv1.class != obj.getClass()) {
            return false;
        }
        hv1 hv1Var = (hv1) obj;
        return this.f11990a == hv1Var.f11990a && this.f11991b == hv1Var.f11991b && this.f11992c == hv1Var.f11992c;
    }

    public final int hashCode() {
        int i4 = (this.f11990a ? 1 : 0) << 2;
        boolean z3 = this.f11991b;
        return (z3 ? 1 : 0) + (z3 ? 1 : 0) + i4 + (this.f11992c ? 1 : 0);
    }
}
