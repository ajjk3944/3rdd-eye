package h5;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;

/* loaded from: classes.dex */
public final class o extends m {
    public final t j;
    public final t k;

    /* renamed from: l, reason: collision with root package name */
    public final long f9958l;

    public o(i iVar, long j, long j7, long j10, long j11, long j12, List list, long j13, t tVar, t tVar2, long j14, long j15) {
        super(iVar, j, j7, j10, j12, list, j13, j14, j15);
        this.j = tVar;
        this.k = tVar2;
        this.f9958l = j11;
    }

    @Override // h5.r
    public final i a(l lVar) {
        t tVar = this.j;
        if (tVar == null) {
            return this.f9963a;
        }
        androidx.media3.common.r rVar = lVar.f9947a;
        return new i(tVar.a(rVar.D, 0L, 0L, rVar.f1780a), 0L, -1L);
    }

    @Override // h5.m
    public final long d(long j) {
        if (this.f9954f != null) {
            return r0.size();
        }
        long j7 = this.f9958l;
        if (j7 != -1) {
            return (j7 - this.f9952d) + 1;
        }
        if (j == -9223372036854775807L) {
            return -1L;
        }
        BigInteger bigIntegerMultiply = BigInteger.valueOf(j).multiply(BigInteger.valueOf(this.f9964b));
        BigInteger bigIntegerMultiply2 = BigInteger.valueOf(this.f9953e).multiply(BigInteger.valueOf(1000000L));
        RoundingMode roundingMode = RoundingMode.CEILING;
        int i10 = pe.a.f20463a;
        return new BigDecimal(bigIntegerMultiply).divide(new BigDecimal(bigIntegerMultiply2), 0, roundingMode).toBigIntegerExact().longValue();
    }

    @Override // h5.m
    public final i h(j jVar, long j) {
        long j7 = this.f9952d;
        List list = this.f9954f;
        long j10 = list != null ? ((p) list.get((int) (j - j7))).f9959a : (j - j7) * this.f9953e;
        androidx.media3.common.r rVar = jVar.f9947a;
        return new i(this.k.a(rVar.D, j, j10, rVar.f1780a), 0L, -1L);
    }
}
