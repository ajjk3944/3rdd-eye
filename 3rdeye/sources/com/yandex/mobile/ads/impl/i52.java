package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class i52 {

    /* renamed from: a, reason: collision with root package name */
    public final int f28497a;

    /* renamed from: b, reason: collision with root package name */
    public final int f28498b;

    /* renamed from: c, reason: collision with root package name */
    public final long f28499c;

    /* renamed from: d, reason: collision with root package name */
    public final long f28500d;

    /* renamed from: e, reason: collision with root package name */
    public final long f28501e;

    /* renamed from: f, reason: collision with root package name */
    public final dc0 f28502f;

    /* renamed from: g, reason: collision with root package name */
    public final int f28503g;

    /* renamed from: h, reason: collision with root package name */
    public final long[] f28504h;
    public final long[] i;

    /* renamed from: j, reason: collision with root package name */
    public final int f28505j;

    /* renamed from: k, reason: collision with root package name */
    private final j52[] f28506k;

    public i52(int i, int i10, long j4, long j10, long j11, dc0 dc0Var, int i11, j52[] j52VarArr, int i12, long[] jArr, long[] jArr2) {
        this.f28497a = i;
        this.f28498b = i10;
        this.f28499c = j4;
        this.f28500d = j10;
        this.f28501e = j11;
        this.f28502f = dc0Var;
        this.f28503g = i11;
        this.f28506k = j52VarArr;
        this.f28505j = i12;
        this.f28504h = jArr;
        this.i = jArr2;
    }

    public final j52 a(int i) {
        j52[] j52VarArr = this.f28506k;
        if (j52VarArr == null) {
            return null;
        }
        return j52VarArr[i];
    }
}
