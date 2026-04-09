package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class C2 {

    /* renamed from: a, reason: collision with root package name */
    public final C2210z2 f7493a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7494b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f7495c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f7496d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7497e;

    /* renamed from: f, reason: collision with root package name */
    public final long[] f7498f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f7499g;

    /* renamed from: h, reason: collision with root package name */
    public final int[] f7500h;
    public final long i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f7501j;

    public C2(C2210z2 c2210z2, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, int[] iArr3, boolean z6, long j6, int i3) {
        int length = iArr.length;
        int length2 = jArr2.length;
        AbstractC0582Jp.m(length == length2);
        AbstractC0582Jp.m(jArr.length == length2);
        int length3 = iArr2.length;
        AbstractC0582Jp.m(length3 == length2);
        this.f7493a = c2210z2;
        this.f7495c = jArr;
        this.f7496d = iArr;
        this.f7497e = i;
        this.f7498f = jArr2;
        this.f7499g = iArr2;
        this.f7500h = iArr3;
        this.f7501j = z6;
        this.i = j6;
        this.f7494b = i3;
        if (length3 > 0) {
            int i6 = length3 - 1;
            iArr2[i6] = iArr2[i6] | 536870912;
        }
    }

    public final int a(long j6) {
        boolean z6 = this.f7501j;
        int i = 0;
        long[] jArr = this.f7498f;
        if (z6) {
            return Vt.q(jArr, j6, false);
        }
        int[] iArr = this.f7500h;
        int length = iArr.length - 1;
        int i3 = -1;
        while (i <= length) {
            int i6 = ((length - i) / 2) + i;
            if (jArr[iArr[i6]] <= j6) {
                i = i6 + 1;
                i3 = i6;
            } else {
                length = i6 - 1;
            }
        }
        if (i3 == -1) {
            return -1;
        }
        long j7 = jArr[iArr[i3]];
        if (j7 == j6) {
            while (i3 > 0) {
                int i7 = i3 - 1;
                if (jArr[iArr[i7]] != j7) {
                    break;
                }
                i3 = i7;
            }
        }
        return iArr[i3];
    }

    public final int b(long j6) {
        boolean z6 = this.f7501j;
        long[] jArr = this.f7498f;
        if (z6) {
            String str = Vt.f12096a;
            int iBinarySearch = Arrays.binarySearch(jArr, j6);
            if (iBinarySearch < 0) {
                return ~iBinarySearch;
            }
            while (true) {
                int i = iBinarySearch + 1;
                if (i >= jArr.length || jArr[i] != j6) {
                    break;
                }
                iBinarySearch = i;
            }
            return iBinarySearch;
        }
        int[] iArr = this.f7500h;
        int length = iArr.length - 1;
        int i3 = 0;
        int i6 = -1;
        while (i3 <= length) {
            int i7 = ((length - i3) / 2) + i3;
            if (jArr[iArr[i7]] >= j6) {
                length = i7 - 1;
                i6 = i7;
            } else {
                i3 = i7 + 1;
            }
        }
        if (i6 == -1) {
            return -1;
        }
        long j7 = jArr[iArr[i6]];
        if (j7 == j6) {
            while (i6 < iArr.length - 1) {
                int i8 = i6 + 1;
                if (jArr[iArr[i8]] != j7) {
                    break;
                }
                i6 = i8;
            }
        }
        return iArr[i6];
    }
}
