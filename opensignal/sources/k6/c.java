package k6;

import a5.d0;
import android.util.Pair;
import u5.w;
import u5.y;

/* loaded from: classes.dex */
public final class c implements f {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f14138a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f14139b;

    /* renamed from: c, reason: collision with root package name */
    public final long f14140c;

    public c(long j, long[] jArr, long[] jArr2) {
        this.f14138a = jArr;
        this.f14139b = jArr2;
        this.f14140c = j == -9223372036854775807L ? d0.G(jArr2[jArr2.length - 1]) : j;
    }

    public static Pair c(long j, long[] jArr, long[] jArr2) {
        int iE = d0.e(jArr, j, true);
        long j7 = jArr[iE];
        long j10 = jArr2[iE];
        int i10 = iE + 1;
        if (i10 == jArr.length) {
            return Pair.create(Long.valueOf(j7), Long.valueOf(j10));
        }
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((jArr[i10] == j7 ? 0.0d : (j - j7) / (r6 - j7)) * (jArr2[i10] - j10))) + j10));
    }

    @Override // k6.f
    public final long a() {
        return -1L;
    }

    @Override // u5.x
    public final boolean b() {
        return true;
    }

    @Override // u5.x
    public final w d(long j) {
        Pair pairC = c(d0.P(d0.i(j, 0L, this.f14140c)), this.f14139b, this.f14138a);
        y yVar = new y(d0.G(((Long) pairC.first).longValue()), ((Long) pairC.second).longValue());
        return new w(yVar, yVar);
    }

    @Override // u5.x
    public final long e() {
        return this.f14140c;
    }

    @Override // k6.f
    public final long getTimeUs(long j) {
        return d0.G(((Long) c(j, this.f14138a, this.f14139b).second).longValue());
    }
}
