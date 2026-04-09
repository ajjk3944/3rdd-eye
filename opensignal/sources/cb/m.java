package cb;

import java.util.List;
import qb.v;

/* loaded from: classes.dex */
public abstract class m extends r {

    /* renamed from: d, reason: collision with root package name */
    public final long f3576d;

    /* renamed from: e, reason: collision with root package name */
    public final long f3577e;

    /* renamed from: f, reason: collision with root package name */
    public final List f3578f;

    /* renamed from: g, reason: collision with root package name */
    public final long f3579g;

    /* renamed from: h, reason: collision with root package name */
    public final long f3580h;

    /* renamed from: i, reason: collision with root package name */
    public final long f3581i;

    public m(i iVar, long j, long j7, long j10, long j11, List list, long j12, long j13, long j14) {
        super(iVar, j, j7);
        this.f3576d = j10;
        this.f3577e = j11;
        this.f3578f = list;
        this.f3581i = j12;
        this.f3579g = j13;
        this.f3580h = j14;
    }

    public final long b(long j, long j7) {
        long jD = d(j);
        return jD != -1 ? jD : (int) (f((j7 - this.f3580h) + this.f3581i, j) - c(j, j7));
    }

    public final long c(long j, long j7) {
        long jD = d(j);
        long j10 = this.f3576d;
        if (jD == -1) {
            long j11 = this.f3579g;
            if (j11 != -9223372036854775807L) {
                return Math.max(j10, f((j7 - this.f3580h) - j11, j));
            }
        }
        return j10;
    }

    public abstract long d(long j);

    public final long e(long j, long j7) {
        long j10 = this.f3588b;
        long j11 = this.f3576d;
        List list = this.f3578f;
        if (list != null) {
            return (((p) list.get((int) (j - j11))).f3584b * 1000000) / j10;
        }
        long jD = d(j7);
        return (jD == -1 || j != (j11 + jD) - 1) ? (this.f3577e * 1000000) / j10 : j7 - g(j);
    }

    public final long f(long j, long j7) {
        long jD = d(j7);
        long j10 = this.f3576d;
        if (jD != 0) {
            if (this.f3578f != null) {
                long j11 = (jD + j10) - 1;
                long j12 = j10;
                while (j12 <= j11) {
                    long j13 = ((j11 - j12) / 2) + j12;
                    long jG = g(j13);
                    if (jG < j) {
                        j12 = j13 + 1;
                    } else {
                        if (jG <= j) {
                            return j13;
                        }
                        j11 = j13 - 1;
                    }
                }
                return j12 == j10 ? j12 : j11;
            }
            long j14 = (j / ((this.f3577e * 1000000) / this.f3588b)) + j10;
            if (j14 >= j10) {
                return jD == -1 ? j14 : Math.min(j14, (j10 + jD) - 1);
            }
        }
        return j10;
    }

    public final long g(long j) {
        long j7 = this.f3576d;
        List list = this.f3578f;
        return v.H(list != null ? ((p) list.get((int) (j - j7))).f3583a - this.f3589c : (j - j7) * this.f3577e, 1000000L, this.f3588b);
    }

    public abstract i h(k kVar, long j);

    public boolean i() {
        return this.f3578f != null;
    }
}
