package com.yandex.mobile.ads.impl;

import android.util.Pair;
import com.yandex.mobile.ads.impl.tw1;

/* loaded from: classes3.dex */
final class n01 implements ww1 {

    /* renamed from: a, reason: collision with root package name */
    private final long[] f30724a;

    /* renamed from: b, reason: collision with root package name */
    private final long[] f30725b;

    /* renamed from: c, reason: collision with root package name */
    private final long f30726c;

    private n01(long j4, long[] jArr, long[] jArr2) {
        this.f30724a = jArr;
        this.f30725b = jArr2;
        this.f30726c = j4 == -9223372036854775807L ? s82.a(jArr2[jArr2.length - 1]) : j4;
    }

    @Override // com.yandex.mobile.ads.impl.ww1
    public final long a() {
        return -1L;
    }

    @Override // com.yandex.mobile.ads.impl.tw1
    public final boolean b() {
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.tw1
    public final long c() {
        return this.f30726c;
    }

    public static n01 a(long j4, m01 m01Var, long j10) {
        int length = m01Var.f30147f.length;
        int i = length + 1;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        jArr[0] = j4;
        long j11 = 0;
        jArr2[0] = 0;
        for (int i10 = 1; i10 <= length; i10++) {
            int i11 = i10 - 1;
            j4 += m01Var.f30145d + m01Var.f30147f[i11];
            j11 += m01Var.f30146e + m01Var.f30148g[i11];
            jArr[i10] = j4;
            jArr2[i10] = j11;
        }
        return new n01(j10, jArr, jArr2);
    }

    @Override // com.yandex.mobile.ads.impl.tw1
    public final tw1.a b(long j4) {
        long j10 = this.f30726c;
        int i = s82.f32899a;
        Pair<Long, Long> pairA = a(s82.b(Math.max(0L, Math.min(j4, j10))), this.f30725b, this.f30724a);
        vw1 vw1Var = new vw1(s82.a(((Long) pairA.first).longValue()), ((Long) pairA.second).longValue());
        return new tw1.a(vw1Var, vw1Var);
    }

    @Override // com.yandex.mobile.ads.impl.ww1
    public final long a(long j4) {
        return s82.a(((Long) a(j4, this.f30724a, this.f30725b).second).longValue());
    }

    private static Pair<Long, Long> a(long j4, long[] jArr, long[] jArr2) {
        int iB = s82.b(jArr, j4, true);
        long j10 = jArr[iB];
        long j11 = jArr2[iB];
        int i = iB + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j10), Long.valueOf(j11));
        }
        return Pair.create(Long.valueOf(j4), Long.valueOf(((long) ((jArr[i] == j10 ? 0.0d : (j4 - j10) / (r6 - j10)) * (jArr2[i] - j11))) + j11));
    }
}
