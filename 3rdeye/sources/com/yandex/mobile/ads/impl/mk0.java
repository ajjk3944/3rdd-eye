package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.tw1;

/* loaded from: classes3.dex */
public final class mk0 implements tw1 {

    /* renamed from: a, reason: collision with root package name */
    private final long[] f30416a;

    /* renamed from: b, reason: collision with root package name */
    private final long[] f30417b;

    /* renamed from: c, reason: collision with root package name */
    private final long f30418c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f30419d;

    public mk0(long j4, long[] jArr, long[] jArr2) {
        zf.a(jArr.length == jArr2.length);
        int length = jArr2.length;
        boolean z10 = length > 0;
        this.f30419d = z10;
        if (!z10 || jArr2[0] <= 0) {
            this.f30416a = jArr;
            this.f30417b = jArr2;
        } else {
            int i = length + 1;
            long[] jArr3 = new long[i];
            this.f30416a = jArr3;
            long[] jArr4 = new long[i];
            this.f30417b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        }
        this.f30418c = j4;
    }

    @Override // com.yandex.mobile.ads.impl.tw1
    public final tw1.a b(long j4) {
        if (!this.f30419d) {
            vw1 vw1Var = vw1.f34726c;
            return new tw1.a(vw1Var, vw1Var);
        }
        int iB = s82.b(this.f30417b, j4, true);
        long[] jArr = this.f30417b;
        long j10 = jArr[iB];
        long[] jArr2 = this.f30416a;
        vw1 vw1Var2 = new vw1(j10, jArr2[iB]);
        if (j10 == j4 || iB == jArr.length - 1) {
            return new tw1.a(vw1Var2, vw1Var2);
        }
        int i = iB + 1;
        return new tw1.a(vw1Var2, new vw1(jArr[i], jArr2[i]));
    }

    @Override // com.yandex.mobile.ads.impl.tw1
    public final long c() {
        return this.f30418c;
    }

    @Override // com.yandex.mobile.ads.impl.tw1
    public final boolean b() {
        return this.f30419d;
    }
}
