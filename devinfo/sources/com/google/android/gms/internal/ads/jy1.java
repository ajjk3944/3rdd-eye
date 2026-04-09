package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class jy1 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f12875a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12876b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12877c;

    /* renamed from: d, reason: collision with root package name */
    public final long f12878d;

    /* renamed from: e, reason: collision with root package name */
    public final int f12879e;

    public jy1(Object obj, int i4, int i10, long j, int i11) {
        this.f12875a = obj;
        this.f12876b = i4;
        this.f12877c = i10;
        this.f12878d = j;
        this.f12879e = i11;
    }

    public final jy1 a(Object obj) {
        return this.f12875a.equals(obj) ? this : new jy1(obj, this.f12876b, this.f12877c, this.f12878d, this.f12879e);
    }

    public final boolean b() {
        return this.f12876b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jy1)) {
            return false;
        }
        jy1 jy1Var = (jy1) obj;
        return this.f12875a.equals(jy1Var.f12875a) && this.f12876b == jy1Var.f12876b && this.f12877c == jy1Var.f12877c && this.f12878d == jy1Var.f12878d && this.f12879e == jy1Var.f12879e;
    }

    public final int hashCode() {
        return ((((((((this.f12875a.hashCode() + 527) * 31) + this.f12876b) * 31) + this.f12877c) * 31) + ((int) this.f12878d)) * 31) + this.f12879e;
    }

    public jy1(Object obj, long j) {
        this(obj, -1, -1, j, -1);
    }

    public jy1(Object obj, long j, int i4) {
        this(obj, -1, -1, j, i4);
    }
}
