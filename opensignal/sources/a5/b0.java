package a5;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public long f93a;

    /* renamed from: b, reason: collision with root package name */
    public long f94b;

    /* renamed from: c, reason: collision with root package name */
    public long f95c;

    /* renamed from: d, reason: collision with root package name */
    public final ThreadLocal f96d = new ThreadLocal();

    public b0(long j) {
        d(j);
    }

    public final synchronized long a(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (this.f94b == -9223372036854775807L) {
                long jLongValue = this.f93a;
                if (jLongValue == 9223372036854775806L) {
                    Long l10 = (Long) this.f96d.get();
                    l10.getClass();
                    jLongValue = l10.longValue();
                }
                this.f94b = jLongValue - j;
                notifyAll();
            }
            this.f95c = j;
            return j + this.f94b;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized long b(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j7 = this.f95c;
            if (j7 != -9223372036854775807L) {
                long j10 = (j7 * 90000) / 1000000;
                long j11 = (4294967296L + j10) / 8589934592L;
                long j12 = ((j11 - 1) * 8589934592L) + j;
                long j13 = (j11 * 8589934592L) + j;
                j = Math.abs(j12 - j10) < Math.abs(j13 - j10) ? j12 : j13;
            }
            return a((j * 1000000) / 90000);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized long c() {
        long j;
        j = this.f93a;
        if (j == Long.MAX_VALUE || j == 9223372036854775806L) {
            j = -9223372036854775807L;
        }
        return j;
    }

    public final synchronized void d(long j) {
        this.f93a = j;
        this.f94b = j == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f95c = -9223372036854775807L;
    }
}
