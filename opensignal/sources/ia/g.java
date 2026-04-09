package ia;

import ca.t;
import ca.v;

/* loaded from: classes.dex */
public final class g implements e {

    /* renamed from: a, reason: collision with root package name */
    public final long f11310a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11311b;

    /* renamed from: c, reason: collision with root package name */
    public final long f11312c;

    /* renamed from: d, reason: collision with root package name */
    public final long f11313d;

    /* renamed from: e, reason: collision with root package name */
    public final long f11314e;

    /* renamed from: f, reason: collision with root package name */
    public final long[] f11315f;

    public g(long j, int i10, long j7, long j10, long[] jArr) {
        this.f11310a = j;
        this.f11311b = i10;
        this.f11312c = j7;
        this.f11315f = jArr;
        this.f11313d = j10;
        this.f11314e = j10 != -1 ? j + j10 : -1L;
    }

    @Override // ia.e
    public final long a() {
        return this.f11314e;
    }

    @Override // ca.u
    public final boolean b() {
        return this.f11315f != null;
    }

    @Override // ca.u
    public final t d(long j) {
        double d6;
        double d10;
        boolean zB = b();
        int i10 = this.f11311b;
        long j7 = this.f11310a;
        if (!zB) {
            v vVar = new v(0L, j7 + i10);
            return new t(vVar, vVar);
        }
        long j10 = qb.v.j(j, 0L, this.f11312c);
        double d11 = (j10 * 100.0d) / this.f11312c;
        double d12 = 0.0d;
        if (d11 <= 0.0d) {
            d6 = 256.0d;
        } else if (d11 >= 100.0d) {
            d6 = 256.0d;
            d12 = 256.0d;
        } else {
            int i11 = (int) d11;
            long[] jArr = this.f11315f;
            qb.b.k(jArr);
            double d13 = jArr[i11];
            if (i11 == 99) {
                d6 = 256.0d;
                d10 = 256.0d;
            } else {
                d6 = 256.0d;
                d10 = jArr[i11 + 1];
            }
            d12 = ((d10 - d13) * (d11 - i11)) + d13;
        }
        long j11 = this.f11313d;
        v vVar2 = new v(j10, j7 + qb.v.j(Math.round((d12 / d6) * j11), i10, j11 - 1));
        return new t(vVar2, vVar2);
    }

    @Override // ca.u
    public final long e() {
        return this.f11312c;
    }

    @Override // ia.e
    public final long getTimeUs(long j) {
        long j7 = j - this.f11310a;
        if (!b() || j7 <= this.f11311b) {
            return 0L;
        }
        long[] jArr = this.f11315f;
        qb.b.k(jArr);
        double d6 = (j7 * 256.0d) / this.f11313d;
        int iE = qb.v.e(jArr, (long) d6, true);
        long j10 = this.f11312c;
        long j11 = (iE * j10) / 100;
        long j12 = jArr[iE];
        int i10 = iE + 1;
        long j13 = (j10 * i10) / 100;
        return Math.round((j12 == (iE == 99 ? 256L : jArr[i10]) ? 0.0d : (d6 - j12) / (r0 - j12)) * (j13 - j11)) + j11;
    }
}
