package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class t4 implements m2 {

    /* renamed from: a, reason: collision with root package name */
    public final s1 f16695a;

    /* renamed from: b, reason: collision with root package name */
    public final SparseArray f16696b;

    /* renamed from: c, reason: collision with root package name */
    public final long f16697c;

    /* renamed from: d, reason: collision with root package name */
    public final int f16698d;

    public t4(SparseArray sparseArray, long j, int i4, long j8, long j9) {
        int i10;
        this.f16696b = sparseArray;
        this.f16697c = j;
        this.f16698d = i4;
        List list = (List) sparseArray.get(i4);
        s1 s1Var = null;
        if (list != null && !list.isEmpty()) {
            int size = list.size();
            int[] iArrCopyOf = new int[size];
            long[] jArrCopyOf = new long[size];
            long[] jArrCopyOf2 = new long[size];
            long[] jArrCopyOf3 = new long[size];
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                s4 s4Var = (s4) list.get(i12);
                jArrCopyOf3[i12] = s4Var.f15858a;
                jArrCopyOf[i12] = s4Var.f15859b;
            }
            while (true) {
                i10 = size - 1;
                if (i11 >= i10) {
                    break;
                }
                int i13 = i11 + 1;
                iArrCopyOf[i11] = (int) (jArrCopyOf[i13] - jArrCopyOf[i11]);
                jArrCopyOf2[i11] = jArrCopyOf3[i13] - jArrCopyOf3[i11];
                i11 = i13;
            }
            int i14 = i10;
            while (i14 > 0 && jArrCopyOf3[i14] >= j) {
                i14--;
            }
            iArrCopyOf[i14] = (int) ((j8 + j9) - jArrCopyOf[i14]);
            jArrCopyOf2[i14] = j - jArrCopyOf3[i14];
            if (i14 < i10) {
                ls.t("MatroskaExtractor", "Discarding trailing cue points with timestamps greater than total duration.");
                int i15 = i14 + 1;
                iArrCopyOf = Arrays.copyOf(iArrCopyOf, i15);
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i15);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i15);
                jArrCopyOf3 = Arrays.copyOf(jArrCopyOf3, i15);
            }
            s1Var = new s1(iArrCopyOf, jArrCopyOf, jArrCopyOf2, jArrCopyOf3);
        }
        this.f16695a = s1Var;
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final boolean a() {
        List list = (List) this.f16696b.get(this.f16698d);
        return (list == null || list.isEmpty()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final long b() {
        return this.f16697c;
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final l2 g(long j) {
        s1 s1Var = this.f16695a;
        if (s1Var != null) {
            return s1Var.g(j);
        }
        n2 n2Var = n2.f14129c;
        return new l2(n2Var, n2Var);
    }
}
