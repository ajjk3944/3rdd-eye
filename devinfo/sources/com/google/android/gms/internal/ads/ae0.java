package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ae0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f9312a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9313b;

    public ae0(int i4, long j) {
        this.f9312a = j;
        this.f9313b = i4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ae0) {
            ae0 ae0Var = (ae0) obj;
            if (this.f9312a == ae0Var.f9312a && this.f9313b == ae0Var.f9313b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f9312a;
        return ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f9313b;
    }

    public final String toString() {
        long j = this.f9312a;
        int length = String.valueOf(j).length();
        int i4 = this.f9313b;
        StringBuilder sb2 = new StringBuilder(length + 34 + String.valueOf(i4).length() + 1);
        a0.g.A(sb2, "OnDeviceStorageKey{id=", j, ", eventType=");
        return r5.c.j(i4, "}", sb2);
    }
}
