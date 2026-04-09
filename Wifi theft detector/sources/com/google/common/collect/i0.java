package com.google.common.collect;

import java.util.Arrays;

/* loaded from: classes2.dex */
public class i0 extends h0 {

    /* renamed from: i, reason: collision with root package name */
    public transient long[] f12056i;

    /* renamed from: j, reason: collision with root package name */
    public transient int f12057j;

    /* renamed from: k, reason: collision with root package name */
    public transient int f12058k;

    public i0(int i10) {
        this(i10, 1.0f);
    }

    public final int B(int i10) {
        return (int) (this.f12056i[i10] >>> 32);
    }

    public final int C(int i10) {
        return (int) this.f12056i[i10];
    }

    public final void D(int i10, int i11) {
        long[] jArr = this.f12056i;
        jArr[i10] = (jArr[i10] & 4294967295L) | (i11 << 32);
    }

    public final void E(int i10, int i11) {
        if (i10 == -2) {
            this.f12057j = i11;
        } else {
            F(i10, i11);
        }
        if (i11 == -2) {
            this.f12058k = i10;
        } else {
            D(i11, i10);
        }
    }

    public final void F(int i10, int i11) {
        long[] jArr = this.f12056i;
        jArr[i10] = (jArr[i10] & (-4294967296L)) | (i11 & 4294967295L);
    }

    @Override // com.google.common.collect.h0
    public void a() {
        super.a();
        this.f12057j = -2;
        this.f12058k = -2;
    }

    @Override // com.google.common.collect.h0
    public int b() {
        int i10 = this.f12057j;
        if (i10 == -2) {
            return -1;
        }
        return i10;
    }

    @Override // com.google.common.collect.h0
    public void k(int i10, float f10) {
        super.k(i10, f10);
        this.f12057j = -2;
        this.f12058k = -2;
        long[] jArr = new long[i10];
        this.f12056i = jArr;
        Arrays.fill(jArr, -1L);
    }

    @Override // com.google.common.collect.h0
    public void l(int i10, Object obj, int i11, int i12) {
        super.l(i10, obj, i11, i12);
        E(this.f12058k, i10);
        E(i10, -2);
    }

    @Override // com.google.common.collect.h0
    public void m(int i10) {
        int iZ = z() - 1;
        E(B(i10), C(i10));
        if (i10 < iZ) {
            E(B(iZ), i10);
            E(i10, C(iZ));
        }
        super.m(i10);
    }

    @Override // com.google.common.collect.h0
    public int p(int i10) {
        int iC = C(i10);
        if (iC == -2) {
            return -1;
        }
        return iC;
    }

    @Override // com.google.common.collect.h0
    public int q(int i10, int i11) {
        return i10 == z() ? i11 : i10;
    }

    @Override // com.google.common.collect.h0
    public void v(int i10) {
        super.v(i10);
        long[] jArr = this.f12056i;
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, i10);
        this.f12056i = jArrCopyOf;
        Arrays.fill(jArrCopyOf, length, i10, -1L);
    }

    public i0(int i10, float f10) {
        super(i10, f10);
    }
}
