package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
final class o52 {

    /* renamed from: a, reason: collision with root package name */
    public final i52 f31196a;

    /* renamed from: b, reason: collision with root package name */
    public final int f31197b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f31198c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f31199d;

    /* renamed from: e, reason: collision with root package name */
    public final int f31200e;

    /* renamed from: f, reason: collision with root package name */
    public final long[] f31201f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f31202g;

    /* renamed from: h, reason: collision with root package name */
    public final long f31203h;

    public o52(i52 i52Var, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j4) {
        zf.a(iArr.length == jArr2.length);
        zf.a(jArr.length == jArr2.length);
        zf.a(iArr2.length == jArr2.length);
        this.f31196a = i52Var;
        this.f31198c = jArr;
        this.f31199d = iArr;
        this.f31200e = i;
        this.f31201f = jArr2;
        this.f31202g = iArr2;
        this.f31203h = j4;
        this.f31197b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public final int a(long j4) {
        for (int iA = s82.a(this.f31201f, j4, true); iA < this.f31201f.length; iA++) {
            if ((this.f31202g[iA] & 1) != 0) {
                return iA;
            }
        }
        return -1;
    }
}
