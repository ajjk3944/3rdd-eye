package com.google.android.exoplayer2;

/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f4213a;

    public k0(long j) {
        this.f4213a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k0) && this.f4213a == ((k0) obj).f4213a;
    }

    public final int hashCode() {
        long j = this.f4213a;
        return ((((int) 0) * 31) + ((int) (j ^ (j >>> 32)))) * 29791;
    }
}
