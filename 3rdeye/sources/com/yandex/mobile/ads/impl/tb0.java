package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.tw1;
import com.yandex.mobile.ads.impl.ub0;

/* loaded from: classes3.dex */
public final class tb0 implements tw1 {

    /* renamed from: a, reason: collision with root package name */
    private final ub0 f33516a;

    /* renamed from: b, reason: collision with root package name */
    private final long f33517b;

    public tb0(ub0 ub0Var, long j4) {
        this.f33516a = ub0Var;
        this.f33517b = j4;
    }

    @Override // com.yandex.mobile.ads.impl.tw1
    public final boolean b() {
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.tw1
    public final long c() {
        return this.f33516a.b();
    }

    @Override // com.yandex.mobile.ads.impl.tw1
    public final tw1.a b(long j4) {
        ub0 ub0Var = this.f33516a;
        ub0.a aVar = ub0Var.f34014k;
        if (aVar == null) {
            throw new IllegalStateException();
        }
        long[] jArr = aVar.f34016a;
        long[] jArr2 = aVar.f34017b;
        int iB = s82.b(jArr, ub0Var.a(j4), false);
        long j10 = iB == -1 ? 0L : jArr[iB];
        long j11 = iB != -1 ? jArr2[iB] : 0L;
        long j12 = this.f33516a.f34009e;
        long j13 = (j10 * 1000000) / j12;
        long j14 = this.f33517b;
        vw1 vw1Var = new vw1(j13, j11 + j14);
        if (j13 == j4 || iB == jArr.length - 1) {
            return new tw1.a(vw1Var, vw1Var);
        }
        int i = iB + 1;
        return new tw1.a(vw1Var, new vw1((jArr[i] * 1000000) / j12, j14 + jArr2[i]));
    }
}
