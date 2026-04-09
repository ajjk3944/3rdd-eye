package ia;

import android.util.Pair;
import ca.t;
import com.google.android.exoplayer2.h;
import qb.v;

/* loaded from: classes.dex */
public final class b implements e {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f11289a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f11290b;

    /* renamed from: c, reason: collision with root package name */
    public final long f11291c;

    public b(long j, long[] jArr, long[] jArr2) {
        this.f11289a = jArr;
        this.f11290b = jArr2;
        this.f11291c = j == -9223372036854775807L ? h.c(jArr2[jArr2.length - 1]) : j;
    }

    public static Pair c(long j, long[] jArr, long[] jArr2) {
        int iE = v.e(jArr, j, true);
        long j7 = jArr[iE];
        long j10 = jArr2[iE];
        int i10 = iE + 1;
        if (i10 == jArr.length) {
            return Pair.create(Long.valueOf(j7), Long.valueOf(j10));
        }
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((jArr[i10] == j7 ? 0.0d : (j - j7) / (r6 - j7)) * (jArr2[i10] - j10))) + j10));
    }

    @Override // ia.e
    public final long a() {
        return -1L;
    }

    @Override // ca.u
    public final boolean b() {
        return true;
    }

    @Override // ca.u
    public final t d(long j) {
        Pair pairC = c(h.d(v.j(j, 0L, this.f11291c)), this.f11290b, this.f11289a);
        ca.v vVar = new ca.v(h.c(((Long) pairC.first).longValue()), ((Long) pairC.second).longValue());
        return new t(vVar, vVar);
    }

    @Override // ca.u
    public final long e() {
        return this.f11291c;
    }

    @Override // ia.e
    public final long getTimeUs(long j) {
        return h.c(((Long) c(j, this.f11289a, this.f11290b).second).longValue());
    }
}
