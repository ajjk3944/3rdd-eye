package h5;

import a5.d0;
import java.util.List;

/* loaded from: classes.dex */
public abstract class m extends r {

    /* renamed from: d, reason: collision with root package name */
    public final long f9952d;

    /* renamed from: e, reason: collision with root package name */
    public final long f9953e;

    /* renamed from: f, reason: collision with root package name */
    public final List f9954f;

    /* renamed from: g, reason: collision with root package name */
    public final long f9955g;

    /* renamed from: h, reason: collision with root package name */
    public final long f9956h;

    /* renamed from: i, reason: collision with root package name */
    public final long f9957i;

    public m(i iVar, long j, long j7, long j10, long j11, List list, long j12, long j13, long j14) {
        super(iVar, j, j7);
        this.f9952d = j10;
        this.f9953e = j11;
        this.f9954f = list;
        this.f9957i = j12;
        this.f9955g = j13;
        this.f9956h = j14;
    }

    public final long b(long j, long j7) {
        long jD = d(j);
        return jD != -1 ? jD : (int) (f((j7 - this.f9956h) + this.f9957i, j) - c(j, j7));
    }

    public final long c(long j, long j7) {
        long jD = d(j);
        long j10 = this.f9952d;
        if (jD == -1) {
            long j11 = this.f9955g;
            if (j11 != -9223372036854775807L) {
                return Math.max(j10, f((j7 - this.f9956h) - j11, j));
            }
        }
        return j10;
    }

    public abstract long d(long j);

    public final long e(long j, long j7) {
        long j10 = this.f9964b;
        long j11 = this.f9952d;
        List list = this.f9954f;
        if (list != null) {
            return (((p) list.get((int) (j - j11))).f9960b * 1000000) / j10;
        }
        long jD = d(j7);
        return (jD == -1 || j != (j11 + jD) - 1) ? (this.f9953e * 1000000) / j10 : j7 - g(j);
    }

    public final long f(long j, long j7) {
        long jD = d(j7);
        long j10 = this.f9952d;
        if (jD != 0) {
            if (this.f9954f != null) {
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
            long j14 = (j / ((this.f9953e * 1000000) / this.f9964b)) + j10;
            if (j14 >= j10) {
                return jD == -1 ? j14 : Math.min(j14, (j10 + jD) - 1);
            }
        }
        return j10;
    }

    public final long g(long j) {
        long j7 = this.f9952d;
        List list = this.f9954f;
        return d0.M(list != null ? ((p) list.get((int) (j - j7))).f9959a - this.f9965c : (j - j7) * this.f9953e, 1000000L, this.f9964b);
    }

    public abstract i h(j jVar, long j);

    public boolean i() {
        return this.f9954f != null;
    }
}
