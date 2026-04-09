package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.p0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1669p0 implements L0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f16090a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f16091b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f16092c;

    /* renamed from: d, reason: collision with root package name */
    public final long[] f16093d;

    /* renamed from: e, reason: collision with root package name */
    public final long[] f16094e;

    /* renamed from: f, reason: collision with root package name */
    public final long f16095f;

    public C1669p0(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f16091b = iArr;
        this.f16092c = jArr;
        this.f16093d = jArr2;
        this.f16094e = jArr3;
        int length = iArr.length;
        this.f16090a = length;
        if (length <= 0) {
            this.f16095f = 0L;
        } else {
            int i = length - 1;
            this.f16095f = jArr2[i] + jArr3[i];
        }
    }

    @Override // com.google.android.gms.internal.ads.L0
    public final long a() {
        return this.f16095f;
    }

    @Override // com.google.android.gms.internal.ads.L0
    public final boolean c() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.L0
    public final K0 i(long j6) {
        long[] jArr = this.f16094e;
        int iQ = Vt.q(jArr, j6, true);
        long j7 = jArr[iQ];
        long[] jArr2 = this.f16092c;
        M0 m02 = new M0(j7, jArr2[iQ]);
        if (j7 >= j6 || iQ == this.f16090a - 1) {
            return new K0(m02, m02);
        }
        int i = iQ + 1;
        return new K0(m02, new M0(jArr[i], jArr2[i]));
    }

    public final String toString() {
        String string = Arrays.toString(this.f16091b);
        String string2 = Arrays.toString(this.f16092c);
        String string3 = Arrays.toString(this.f16094e);
        String string4 = Arrays.toString(this.f16093d);
        int i = this.f16090a;
        int length = String.valueOf(i).length();
        int length2 = String.valueOf(string).length();
        int length3 = String.valueOf(string2).length();
        StringBuilder sb = new StringBuilder(length + 26 + length2 + 10 + length3 + 9 + String.valueOf(string3).length() + 14 + String.valueOf(string4).length() + 1);
        sb.append("ChunkIndex(length=");
        sb.append(i);
        sb.append(", sizes=");
        sb.append(string);
        A.f.w(sb, ", offsets=", string2, ", timeUs=", string3);
        return AbstractC1135f5.n(sb, ", durationsUs=", string4, ")");
    }
}
