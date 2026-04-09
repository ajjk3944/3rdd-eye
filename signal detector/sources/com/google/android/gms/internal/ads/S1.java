package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes.dex */
public final class S1 implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final long f11105a;

    /* renamed from: b, reason: collision with root package name */
    public final long f11106b;

    /* renamed from: c, reason: collision with root package name */
    public final long f11107c;

    public /* synthetic */ S1(long j6, long j7, long j8) {
        this.f11105a = j6;
        this.f11106b = j7;
        this.f11107c = j8;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Long.compare(this.f11105a, ((S1) obj).f11105a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S1)) {
            return false;
        }
        S1 s12 = (S1) obj;
        return this.f11105a == s12.f11105a && this.f11106b == s12.f11106b && this.f11107c == s12.f11107c;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f11105a), Long.valueOf(this.f11106b), Long.valueOf(this.f11107c));
    }
}
