package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class sn0 extends IllegalStateException {

    /* renamed from: a, reason: collision with root package name */
    public final int f16486a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16487b;

    public sn0(int i4, int i10) {
        super(i4 != 0 ? i4 != 1 ? i4 != 2 ? i4 != 3 ? je.u.v(new StringBuilder(String.valueOf(i10).length() + 31), "Player stuck suppressed for ", i10, " ms") : je.u.v(new StringBuilder(String.valueOf(i10).length() + 43), "Player stuck playing without ending for ", i10, " ms") : je.u.v(new StringBuilder(String.valueOf(i10).length() + 45), "Player stuck playing with no progress for ", i10, " ms") : je.u.v(new StringBuilder(String.valueOf(i10).length() + 47), "Player stuck buffering with no progress for ", i10, " ms") : je.u.v(new StringBuilder(String.valueOf(i10).length() + 46), "Player stuck buffering and not loading for ", i10, " ms"));
        this.f16486a = i4;
        this.f16487b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || sn0.class != obj.getClass()) {
            return false;
        }
        sn0 sn0Var = (sn0) obj;
        return this.f16486a == sn0Var.f16486a && this.f16487b == sn0Var.f16487b;
    }

    public final int hashCode() {
        return ((this.f16486a + 527) * 31) + this.f16487b;
    }
}
