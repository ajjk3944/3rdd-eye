package cb;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.dash.manifest.Representation;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;

/* loaded from: classes.dex */
public final class o extends m {
    public final t j;
    public final t k;

    /* renamed from: l, reason: collision with root package name */
    public final long f3582l;

    public o(i iVar, long j, long j7, long j10, long j11, long j12, List list, long j13, t tVar, t tVar2, long j14, long j15) {
        super(iVar, j, j7, j10, j12, list, j13, j14, j15);
        this.j = tVar;
        this.k = tVar2;
        this.f3582l = j11;
    }

    @Override // cb.r
    public final i a(Representation representation) {
        t tVar = this.j;
        if (tVar == null) {
            return this.f3587a;
        }
        Format format = representation.format;
        return new i(tVar.a(format.D, 0L, 0L, format.f4020a), 0L, -1L);
    }

    @Override // cb.m
    public final long d(long j) {
        if (this.f3578f != null) {
            return r0.size();
        }
        long j7 = this.f3582l;
        if (j7 != -1) {
            return (j7 - this.f3576d) + 1;
        }
        if (j == -9223372036854775807L) {
            return -1L;
        }
        BigInteger bigIntegerMultiply = BigInteger.valueOf(j).multiply(BigInteger.valueOf(this.f3588b));
        BigInteger bigIntegerMultiply2 = BigInteger.valueOf(this.f3577e).multiply(BigInteger.valueOf(1000000L));
        RoundingMode roundingMode = RoundingMode.CEILING;
        int i10 = pe.a.f20463a;
        return new BigDecimal(bigIntegerMultiply).divide(new BigDecimal(bigIntegerMultiply2), 0, roundingMode).toBigIntegerExact().longValue();
    }

    @Override // cb.m
    public final i h(k kVar, long j) {
        long j7 = this.f3576d;
        List list = this.f3578f;
        long j10 = list != null ? ((p) list.get((int) (j - j7))).f3583a : (j - j7) * this.f3577e;
        Format format = kVar.format;
        return new i(this.k.a(format.D, j, j10, format.f4020a), 0L, -1L);
    }
}
