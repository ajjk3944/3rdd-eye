package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class T1 implements L0 {

    /* renamed from: a, reason: collision with root package name */
    public final C1669p0 f11320a;

    /* renamed from: b, reason: collision with root package name */
    public final SparseArray f11321b;

    /* renamed from: c, reason: collision with root package name */
    public final long f11322c;

    /* renamed from: d, reason: collision with root package name */
    public final int f11323d;

    public T1(SparseArray sparseArray, long j6, int i, long j7, long j8) {
        int i3;
        this.f11321b = sparseArray;
        this.f11322c = j6;
        this.f11323d = i;
        List list = (List) sparseArray.get(i);
        C1669p0 c1669p0 = null;
        if (list != null && !list.isEmpty()) {
            int size = list.size();
            int[] iArrCopyOf = new int[size];
            long[] jArrCopyOf = new long[size];
            long[] jArrCopyOf2 = new long[size];
            long[] jArrCopyOf3 = new long[size];
            int i6 = 0;
            for (int i7 = 0; i7 < size; i7++) {
                S1 s12 = (S1) list.get(i7);
                jArrCopyOf3[i7] = s12.f11105a;
                jArrCopyOf[i7] = s12.f11106b;
            }
            while (true) {
                i3 = size - 1;
                if (i6 >= i3) {
                    break;
                }
                int i8 = i6 + 1;
                iArrCopyOf[i6] = (int) (jArrCopyOf[i8] - jArrCopyOf[i6]);
                jArrCopyOf2[i6] = jArrCopyOf3[i8] - jArrCopyOf3[i6];
                i6 = i8;
            }
            int i9 = i3;
            while (i9 > 0 && jArrCopyOf3[i9] >= j6) {
                i9--;
            }
            iArrCopyOf[i9] = (int) ((j7 + j8) - jArrCopyOf[i9]);
            jArrCopyOf2[i9] = j6 - jArrCopyOf3[i9];
            if (i9 < i3) {
                AbstractC2022vd.v("MatroskaExtractor", "Discarding trailing cue points with timestamps greater than total duration.");
                int i10 = i9 + 1;
                iArrCopyOf = Arrays.copyOf(iArrCopyOf, i10);
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i10);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i10);
                jArrCopyOf3 = Arrays.copyOf(jArrCopyOf3, i10);
            }
            c1669p0 = new C1669p0(iArrCopyOf, jArrCopyOf, jArrCopyOf2, jArrCopyOf3);
        }
        this.f11320a = c1669p0;
    }

    @Override // com.google.android.gms.internal.ads.L0
    public final long a() {
        return this.f11322c;
    }

    @Override // com.google.android.gms.internal.ads.L0
    public final boolean c() {
        List list = (List) this.f11321b.get(this.f11323d);
        return (list == null || list.isEmpty()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.L0
    public final K0 i(long j6) {
        C1669p0 c1669p0 = this.f11320a;
        if (c1669p0 != null) {
            return c1669p0.i(j6);
        }
        M0 m02 = M0.f9790c;
        return new K0(m02, m02);
    }
}
