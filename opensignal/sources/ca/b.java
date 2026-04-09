package ca;

import a5.d0;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f3452a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3453b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3454c;

    /* renamed from: d, reason: collision with root package name */
    public long f3455d;

    /* renamed from: e, reason: collision with root package name */
    public long f3456e;

    /* renamed from: f, reason: collision with root package name */
    public long f3457f;

    /* renamed from: g, reason: collision with root package name */
    public long f3458g;

    /* renamed from: h, reason: collision with root package name */
    public long f3459h;

    public b(long j, long j7, long j10, long j11, long j12, long j13, int i10) {
        switch (i10) {
            case 1:
                this.f3452a = j;
                this.f3453b = j7;
                this.f3455d = 0L;
                this.f3456e = j10;
                this.f3457f = j11;
                this.f3458g = j12;
                this.f3454c = j13;
                this.f3459h = b(j7, 0L, j10, j11, j12, j13);
                break;
            default:
                this.f3452a = j;
                this.f3453b = j7;
                this.f3455d = 0L;
                this.f3456e = j10;
                this.f3457f = j11;
                this.f3458g = j12;
                this.f3454c = j13;
                this.f3459h = a(j7, 0L, j10, j11, j12, j13);
                break;
        }
    }

    public static long a(long j, long j7, long j10, long j11, long j12, long j13) {
        if (j11 + 1 >= j12 || j7 + 1 >= j10) {
            return j11;
        }
        long j14 = (long) ((j - j7) * ((j12 - j11) / (j10 - j7)));
        return qb.v.j(((j14 + j11) - j13) - (j14 / 20), j11, j12 - 1);
    }

    public static long b(long j, long j7, long j10, long j11, long j12, long j13) {
        if (j11 + 1 >= j12 || j7 + 1 >= j10) {
            return j11;
        }
        long j14 = (long) ((j - j7) * ((j12 - j11) / (j10 - j7)));
        return d0.i(((j14 + j11) - j13) - (j14 / 20), j11, j12 - 1);
    }
}
