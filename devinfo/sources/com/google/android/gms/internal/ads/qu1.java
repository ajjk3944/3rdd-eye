package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class qu1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f15447a;

    /* renamed from: b, reason: collision with root package name */
    public final uh f15448b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15449c;

    /* renamed from: d, reason: collision with root package name */
    public final jy1 f15450d;

    /* renamed from: e, reason: collision with root package name */
    public final long f15451e;

    /* renamed from: f, reason: collision with root package name */
    public final uh f15452f;
    public final int g;

    /* renamed from: h, reason: collision with root package name */
    public final jy1 f15453h;

    /* renamed from: i, reason: collision with root package name */
    public final long f15454i;
    public final long j;

    public qu1(long j, uh uhVar, int i4, jy1 jy1Var, long j8, uh uhVar2, int i10, jy1 jy1Var2, long j9, long j10) {
        this.f15447a = j;
        this.f15448b = uhVar;
        this.f15449c = i4;
        this.f15450d = jy1Var;
        this.f15451e = j8;
        this.f15452f = uhVar2;
        this.g = i10;
        this.f15453h = jy1Var2;
        this.f15454i = j9;
        this.j = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && qu1.class == obj.getClass()) {
            qu1 qu1Var = (qu1) obj;
            if (this.f15447a == qu1Var.f15447a && this.f15449c == qu1Var.f15449c && this.f15451e == qu1Var.f15451e && this.g == qu1Var.g && this.f15454i == qu1Var.f15454i && this.j == qu1Var.j && Objects.equals(this.f15448b, qu1Var.f15448b) && Objects.equals(this.f15450d, qu1Var.f15450d) && Objects.equals(this.f15452f, qu1Var.f15452f) && Objects.equals(this.f15453h, qu1Var.f15453h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f15447a), this.f15448b, Integer.valueOf(this.f15449c), this.f15450d, Long.valueOf(this.f15451e), this.f15452f, Integer.valueOf(this.g), this.f15453h, Long.valueOf(this.f15454i), Long.valueOf(this.j));
    }
}
