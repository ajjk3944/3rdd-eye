package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class s4 implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final long f15858a;

    /* renamed from: b, reason: collision with root package name */
    public final long f15859b;

    /* renamed from: c, reason: collision with root package name */
    public final long f15860c;

    public /* synthetic */ s4(long j, long j8, long j9) {
        this.f15858a = j;
        this.f15859b = j8;
        this.f15860c = j9;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Long.compare(this.f15858a, ((s4) obj).f15858a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s4)) {
            return false;
        }
        s4 s4Var = (s4) obj;
        return this.f15858a == s4Var.f15858a && this.f15859b == s4Var.f15859b && this.f15860c == s4Var.f15860c;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f15858a), Long.valueOf(this.f15859b), Long.valueOf(this.f15860c));
    }
}
