package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.tw1;
import com.yandex.mobile.ads.impl.v11;

/* loaded from: classes3.dex */
final class ia2 implements ww1 {

    /* renamed from: a, reason: collision with root package name */
    private final long[] f28621a;

    /* renamed from: b, reason: collision with root package name */
    private final long[] f28622b;

    /* renamed from: c, reason: collision with root package name */
    private final long f28623c;

    /* renamed from: d, reason: collision with root package name */
    private final long f28624d;

    private ia2(long[] jArr, long[] jArr2, long j4, long j10) {
        this.f28621a = jArr;
        this.f28622b = jArr2;
        this.f28623c = j4;
        this.f28624d = j10;
    }

    public static ia2 a(long j4, long j10, v11.a aVar, uf1 uf1Var) {
        int iT;
        uf1Var.f(10);
        int iH = uf1Var.h();
        ia2 ia2Var = null;
        if (iH <= 0) {
            return null;
        }
        int i = aVar.f34280d;
        long jA = s82.a(iH, (i >= 32000 ? 1152 : 576) * 1000000, i);
        int iZ = uf1Var.z();
        int iZ2 = uf1Var.z();
        int iZ3 = uf1Var.z();
        int i10 = 2;
        uf1Var.f(2);
        long j11 = j10 + aVar.f34279c;
        long[] jArr = new long[iZ];
        long[] jArr2 = new long[iZ];
        int i11 = 0;
        long j12 = j10;
        while (i11 < iZ) {
            ia2 ia2Var2 = ia2Var;
            int i12 = iZ2;
            long[] jArr3 = jArr;
            jArr3[i11] = (i11 * jA) / iZ;
            jArr2[i11] = Math.max(j12, j11);
            if (iZ3 == 1) {
                iT = uf1Var.t();
            } else if (iZ3 == i10) {
                iT = uf1Var.z();
            } else if (iZ3 == 3) {
                iT = uf1Var.w();
            } else {
                if (iZ3 != 4) {
                    return ia2Var2;
                }
                iT = uf1Var.x();
            }
            j12 += iT * i12;
            i11++;
            ia2Var = ia2Var2;
            iZ2 = i12;
            jArr = jArr3;
            j11 = j11;
            i10 = 2;
        }
        long[] jArr4 = jArr;
        if (j4 != -1 && j4 != j12) {
            StringBuilder sbJ = androidx.work.s.j("VBRI data size mismatch: ", ", ", j4);
            sbJ.append(j12);
            rs0.d("VbriSeeker", sbJ.toString());
        }
        return new ia2(jArr4, jArr2, jA, j12);
    }

    @Override // com.yandex.mobile.ads.impl.tw1
    public final boolean b() {
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.tw1
    public final long c() {
        return this.f28623c;
    }

    @Override // com.yandex.mobile.ads.impl.tw1
    public final tw1.a b(long j4) {
        int iB = s82.b(this.f28621a, j4, true);
        long[] jArr = this.f28621a;
        long j10 = jArr[iB];
        long[] jArr2 = this.f28622b;
        vw1 vw1Var = new vw1(j10, jArr2[iB]);
        if (j10 >= j4 || iB == jArr.length - 1) {
            return new tw1.a(vw1Var, vw1Var);
        }
        int i = iB + 1;
        return new tw1.a(vw1Var, new vw1(jArr[i], jArr2[i]));
    }

    @Override // com.yandex.mobile.ads.impl.ww1
    public final long a() {
        return this.f28624d;
    }

    @Override // com.yandex.mobile.ads.impl.ww1
    public final long a(long j4) {
        return this.f28621a[s82.b(this.f28622b, j4, true)];
    }
}
