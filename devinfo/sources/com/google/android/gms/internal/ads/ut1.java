package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ut1 {

    /* renamed from: a, reason: collision with root package name */
    public final jy1 f17335a;

    /* renamed from: b, reason: collision with root package name */
    public final long f17336b;

    /* renamed from: c, reason: collision with root package name */
    public final long f17337c;

    /* renamed from: d, reason: collision with root package name */
    public final long f17338d;

    /* renamed from: e, reason: collision with root package name */
    public final long f17339e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f17340f;
    public final boolean g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f17341h;

    public ut1(jy1 jy1Var, long j, long j8, long j9, long j10, boolean z3, boolean z10, boolean z11) {
        mq0.m(!z11 || z3);
        mq0.m(!z10 || z3);
        this.f17335a = jy1Var;
        this.f17336b = j;
        this.f17337c = j8;
        this.f17338d = j9;
        this.f17339e = j10;
        this.f17340f = z3;
        this.g = z10;
        this.f17341h = z11;
    }

    public final ut1 a(long j) {
        return j == this.f17336b ? this : new ut1(this.f17335a, j, this.f17337c, this.f17338d, this.f17339e, this.f17340f, this.g, this.f17341h);
    }

    public final ut1 b(long j) {
        return j == this.f17337c ? this : new ut1(this.f17335a, this.f17336b, j, this.f17338d, this.f17339e, this.f17340f, this.g, this.f17341h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ut1.class == obj.getClass()) {
            ut1 ut1Var = (ut1) obj;
            if (this.f17336b == ut1Var.f17336b && this.f17337c == ut1Var.f17337c && this.f17338d == ut1Var.f17338d && this.f17339e == ut1Var.f17339e && this.f17340f == ut1Var.f17340f && this.g == ut1Var.g && this.f17341h == ut1Var.f17341h && Objects.equals(this.f17335a, ut1Var.f17335a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((this.f17335a.hashCode() + 527) * 31) + ((int) this.f17336b)) * 31) + ((int) this.f17337c)) * 31) + ((int) this.f17338d)) * 31) + ((int) this.f17339e)) * 29791) + (this.f17340f ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.f17341h ? 1 : 0);
    }
}
