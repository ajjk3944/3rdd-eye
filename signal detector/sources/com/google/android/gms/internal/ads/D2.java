package com.google.android.gms.internal.ads;

import java.math.BigInteger;

/* loaded from: classes.dex */
public final class D2 implements L0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ E2 f7717a;

    @Override // com.google.android.gms.internal.ads.L0
    public final long a() {
        E2 e22 = this.f7717a;
        L2 l2 = e22.f7874d;
        return (e22.f7876f * 1000000) / l2.i;
    }

    @Override // com.google.android.gms.internal.ads.L0
    public final boolean c() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.L0
    public final K0 i(long j6) {
        E2 e22 = this.f7717a;
        BigInteger bigIntegerValueOf = BigInteger.valueOf((e22.f7874d.i * j6) / 1000000);
        long j7 = e22.f7873c;
        long j8 = e22.f7872b;
        long jLongValue = bigIntegerValueOf.multiply(BigInteger.valueOf(j7 - j8)).divide(BigInteger.valueOf(e22.f7876f)).longValue() + j8;
        String str = Vt.f12096a;
        M0 m02 = new M0(j6, Math.max(j8, Math.min(jLongValue - 30000, j7 - 1)));
        return new K0(m02, m02);
    }
}
