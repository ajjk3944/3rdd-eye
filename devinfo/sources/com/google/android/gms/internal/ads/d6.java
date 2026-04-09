package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class d6 {

    /* renamed from: a, reason: collision with root package name */
    public final a6 f10337a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10338b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f10339c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f10340d;

    /* renamed from: e, reason: collision with root package name */
    public final int f10341e;

    /* renamed from: f, reason: collision with root package name */
    public final long[] f10342f;
    public final int[] g;

    /* renamed from: h, reason: collision with root package name */
    public final int[] f10343h;

    /* renamed from: i, reason: collision with root package name */
    public final long f10344i;
    public final boolean j;

    public d6(a6 a6Var, long[] jArr, int[] iArr, int i4, long[] jArr2, int[] iArr2, int[] iArr3, boolean z3, long j, int i10) {
        int length = iArr.length;
        int length2 = jArr2.length;
        mq0.m(length == length2);
        mq0.m(jArr.length == length2);
        int length3 = iArr2.length;
        mq0.m(length3 == length2);
        this.f10337a = a6Var;
        this.f10339c = jArr;
        this.f10340d = iArr;
        this.f10341e = i4;
        this.f10342f = jArr2;
        this.g = iArr2;
        this.f10343h = iArr3;
        this.j = z3;
        this.f10344i = j;
        this.f10338b = i10;
        if (length3 > 0) {
            int i11 = length3 - 1;
            iArr2[i11] = iArr2[i11] | 536870912;
        }
    }

    public final int a(long j) {
        boolean z3 = this.j;
        int i4 = 0;
        long[] jArr = this.f10342f;
        if (z3) {
            return bq0.q(jArr, j, false);
        }
        int[] iArr = this.f10343h;
        int length = iArr.length - 1;
        int i10 = -1;
        while (i4 <= length) {
            int i11 = ((length - i4) / 2) + i4;
            if (jArr[iArr[i11]] <= j) {
                i4 = i11 + 1;
                i10 = i11;
            } else {
                length = i11 - 1;
            }
        }
        if (i10 == -1) {
            return -1;
        }
        long j8 = jArr[iArr[i10]];
        if (j8 == j) {
            while (i10 > 0) {
                int i12 = i10 - 1;
                if (jArr[iArr[i12]] != j8) {
                    break;
                }
                i10 = i12;
            }
        }
        return iArr[i10];
    }

    public final int b(long j) {
        boolean z3 = this.j;
        long[] jArr = this.f10342f;
        if (z3) {
            String str = bq0.f9768a;
            int iBinarySearch = Arrays.binarySearch(jArr, j);
            if (iBinarySearch < 0) {
                return ~iBinarySearch;
            }
            while (true) {
                int i4 = iBinarySearch + 1;
                if (i4 >= jArr.length || jArr[i4] != j) {
                    break;
                }
                iBinarySearch = i4;
            }
            return iBinarySearch;
        }
        int[] iArr = this.f10343h;
        int length = iArr.length - 1;
        int i10 = 0;
        int i11 = -1;
        while (i10 <= length) {
            int i12 = ((length - i10) / 2) + i10;
            if (jArr[iArr[i12]] >= j) {
                length = i12 - 1;
                i11 = i12;
            } else {
                i10 = i12 + 1;
            }
        }
        if (i11 == -1) {
            return -1;
        }
        long j8 = jArr[iArr[i11]];
        if (j8 == j) {
            while (i11 < iArr.length - 1) {
                int i13 = i11 + 1;
                if (jArr[iArr[i13]] != j8) {
                    break;
                }
                i11 = i13;
            }
        }
        return iArr[i11];
    }
}
