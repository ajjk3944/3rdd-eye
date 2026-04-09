package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.tw1;
import com.yandex.mobile.ads.impl.v11;

/* loaded from: classes3.dex */
final class ok2 implements ww1 {

    /* renamed from: a, reason: collision with root package name */
    private final long f31413a;

    /* renamed from: b, reason: collision with root package name */
    private final int f31414b;

    /* renamed from: c, reason: collision with root package name */
    private final long f31415c;

    /* renamed from: d, reason: collision with root package name */
    private final long f31416d;

    /* renamed from: e, reason: collision with root package name */
    private final long f31417e;

    /* renamed from: f, reason: collision with root package name */
    private final long[] f31418f;

    private ok2(long j4, int i, long j10, long j11, long[] jArr) {
        this.f31413a = j4;
        this.f31414b = i;
        this.f31415c = j10;
        this.f31418f = jArr;
        this.f31416d = j11;
        this.f31417e = j11 != -1 ? j4 + j11 : -1L;
    }

    public static ok2 a(long j4, long j10, v11.a aVar, uf1 uf1Var) {
        int iX;
        int i = aVar.f34283g;
        int i10 = aVar.f34280d;
        int iH = uf1Var.h();
        if ((iH & 1) != 1 || (iX = uf1Var.x()) == 0) {
            return null;
        }
        long jA = s82.a(iX, i * 1000000, i10);
        if ((iH & 6) != 6) {
            return new ok2(j10, aVar.f34279c, jA, -1L, null);
        }
        long jV = uf1Var.v();
        long[] jArr = new long[100];
        for (int i11 = 0; i11 < 100; i11++) {
            jArr[i11] = uf1Var.t();
        }
        if (j4 != -1) {
            long j11 = j10 + jV;
            if (j4 != j11) {
                StringBuilder sbJ = androidx.work.s.j("XING data size mismatch: ", ", ", j4);
                sbJ.append(j11);
                rs0.d("XingSeeker", sbJ.toString());
            }
        }
        return new ok2(j10, aVar.f34279c, jA, jV, jArr);
    }

    @Override // com.yandex.mobile.ads.impl.tw1
    public final tw1.a b(long j4) {
        if (!b()) {
            vw1 vw1Var = new vw1(0L, this.f31413a + this.f31414b);
            return new tw1.a(vw1Var, vw1Var);
        }
        long j10 = this.f31415c;
        int i = s82.f32899a;
        long jMax = Math.max(0L, Math.min(j4, j10));
        double d10 = (jMax * 100.0d) / this.f31415c;
        double d11 = 0.0d;
        if (d10 > 0.0d) {
            if (d10 >= 100.0d) {
                d11 = 256.0d;
            } else {
                int i10 = (int) d10;
                long[] jArr = this.f31418f;
                if (jArr == null) {
                    throw new IllegalStateException();
                }
                double d12 = jArr[i10];
                d11 = d12 + (((i10 == 99 ? 256.0d : jArr[i10 + 1]) - d12) * (d10 - i10));
            }
        }
        vw1 vw1Var2 = new vw1(jMax, this.f31413a + Math.max(this.f31414b, Math.min(Math.round((d11 / 256.0d) * this.f31416d), this.f31416d - 1)));
        return new tw1.a(vw1Var2, vw1Var2);
    }

    @Override // com.yandex.mobile.ads.impl.tw1
    public final long c() {
        return this.f31415c;
    }

    @Override // com.yandex.mobile.ads.impl.tw1
    public final boolean b() {
        return this.f31418f != null;
    }

    @Override // com.yandex.mobile.ads.impl.ww1
    public final long a() {
        return this.f31417e;
    }

    @Override // com.yandex.mobile.ads.impl.ww1
    public final long a(long j4) {
        long j10 = j4 - this.f31413a;
        if (!b() || j10 <= this.f31414b) {
            return 0L;
        }
        long[] jArr = this.f31418f;
        if (jArr != null) {
            double d10 = (j10 * 256.0d) / this.f31416d;
            int iB = s82.b(jArr, (long) d10, true);
            long j11 = this.f31415c;
            long j12 = (iB * j11) / 100;
            long j13 = jArr[iB];
            int i = iB + 1;
            long j14 = (j11 * i) / 100;
            return Math.round((j13 == (iB == 99 ? 256L : jArr[i]) ? 0.0d : (d10 - j13) / (r0 - j13)) * (j14 - j12)) + j12;
        }
        throw new IllegalStateException();
    }
}
