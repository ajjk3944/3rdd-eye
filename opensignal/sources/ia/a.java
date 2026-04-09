package ia;

import ca.t;
import ca.u;
import ca.v;

/* loaded from: classes.dex */
public final class a implements e, u {

    /* renamed from: a, reason: collision with root package name */
    public final long f11283a;

    /* renamed from: b, reason: collision with root package name */
    public final long f11284b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11285c;

    /* renamed from: d, reason: collision with root package name */
    public final long f11286d;

    /* renamed from: e, reason: collision with root package name */
    public final int f11287e;

    /* renamed from: f, reason: collision with root package name */
    public final long f11288f;

    public a(int i10, int i11, long j, long j7) {
        this.f11283a = j;
        this.f11284b = j7;
        this.f11285c = i11 == -1 ? 1 : i11;
        this.f11287e = i10;
        if (j == -1) {
            this.f11286d = -1L;
            this.f11288f = -9223372036854775807L;
        } else {
            long j10 = j - j7;
            this.f11286d = j10;
            this.f11288f = (Math.max(0L, j10) * 8000000) / i10;
        }
    }

    @Override // ia.e
    public final long a() {
        return -1L;
    }

    @Override // ca.u
    public final boolean b() {
        return this.f11286d != -1;
    }

    @Override // ca.u
    public final t d(long j) {
        long j7 = this.f11286d;
        long j10 = this.f11284b;
        if (j7 == -1) {
            v vVar = new v(0L, j10);
            return new t(vVar, vVar);
        }
        int i10 = this.f11287e;
        long j11 = this.f11285c;
        long j12 = qb.v.j((((i10 * j) / 8000000) / j11) * j11, 0L, j7 - j11) + j10;
        long jMax = (Math.max(0L, j12 - j10) * 8000000) / i10;
        v vVar2 = new v(jMax, j12);
        if (jMax < j) {
            long j13 = j12 + j11;
            if (j13 < this.f11283a) {
                return new t(vVar2, new v((Math.max(0L, j13 - j10) * 8000000) / i10, j13));
            }
        }
        return new t(vVar2, vVar2);
    }

    @Override // ca.u
    public final long e() {
        return this.f11288f;
    }

    @Override // ia.e
    public final long getTimeUs(long j) {
        return (Math.max(0L, j - this.f11284b) * 8000000) / this.f11287e;
    }
}
