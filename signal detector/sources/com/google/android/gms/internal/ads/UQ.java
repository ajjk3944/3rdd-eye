package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class UQ {

    /* renamed from: a, reason: collision with root package name */
    public final long f11697a;

    /* renamed from: b, reason: collision with root package name */
    public final long f11698b;

    public UQ(long j6, long j7) {
        this.f11697a = j6;
        this.f11698b = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UQ)) {
            return false;
        }
        UQ uq = (UQ) obj;
        return this.f11697a == uq.f11697a && this.f11698b == uq.f11698b;
    }

    public final int hashCode() {
        return (((int) this.f11697a) * 31) + ((int) this.f11698b);
    }
}
