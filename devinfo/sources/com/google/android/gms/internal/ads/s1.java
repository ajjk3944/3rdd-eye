package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class s1 implements m2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f15828a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f15829b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f15830c;

    /* renamed from: d, reason: collision with root package name */
    public final long[] f15831d;

    /* renamed from: e, reason: collision with root package name */
    public final long[] f15832e;

    /* renamed from: f, reason: collision with root package name */
    public final long f15833f;

    public s1(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f15829b = iArr;
        this.f15830c = jArr;
        this.f15831d = jArr2;
        this.f15832e = jArr3;
        int length = iArr.length;
        this.f15828a = length;
        if (length <= 0) {
            this.f15833f = 0L;
        } else {
            int i4 = length - 1;
            this.f15833f = jArr2[i4] + jArr3[i4];
        }
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final long b() {
        return this.f15833f;
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final l2 g(long j) {
        long[] jArr = this.f15832e;
        int iQ = bq0.q(jArr, j, true);
        long j8 = jArr[iQ];
        long[] jArr2 = this.f15830c;
        n2 n2Var = new n2(j8, jArr2[iQ]);
        if (j8 >= j || iQ == this.f15828a - 1) {
            return new l2(n2Var, n2Var);
        }
        int i4 = iQ + 1;
        return new l2(n2Var, new n2(jArr[i4], jArr2[i4]));
    }

    public final String toString() {
        String string = Arrays.toString(this.f15829b);
        String string2 = Arrays.toString(this.f15830c);
        String string3 = Arrays.toString(this.f15832e);
        String string4 = Arrays.toString(this.f15831d);
        int i4 = this.f15828a;
        int length = String.valueOf(i4).length();
        int length2 = String.valueOf(string).length();
        int length3 = String.valueOf(string2).length();
        StringBuilder sb2 = new StringBuilder(length + 26 + length2 + 10 + length3 + 9 + String.valueOf(string3).length() + 14 + String.valueOf(string4).length() + 1);
        sb2.append("ChunkIndex(length=");
        sb2.append(i4);
        sb2.append(", sizes=");
        sb2.append(string);
        je.u.B(sb2, ", offsets=", string2, ", timeUs=", string3);
        return r5.c.m(sb2, ", durationsUs=", string4, ")");
    }
}
