package qb;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public long f20824a;

    /* renamed from: b, reason: collision with root package name */
    public long f20825b;

    /* renamed from: c, reason: collision with root package name */
    public long f20826c;

    /* renamed from: d, reason: collision with root package name */
    public final ThreadLocal f20827d = new ThreadLocal();

    public u(long j) {
        d(j);
    }

    public final synchronized long a(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (this.f20825b == -9223372036854775807L) {
                long jLongValue = this.f20824a;
                if (jLongValue == 9223372036854775806L) {
                    Long l10 = (Long) this.f20827d.get();
                    l10.getClass();
                    jLongValue = l10.longValue();
                }
                this.f20825b = jLongValue - j;
                notifyAll();
            }
            this.f20826c = j;
            return j + this.f20825b;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized long b(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j7 = this.f20826c;
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
        j = this.f20824a;
        if (j == Long.MAX_VALUE || j == 9223372036854775806L) {
            j = -9223372036854775807L;
        }
        return j;
    }

    public final synchronized void d(long j) {
        this.f20824a = j;
        this.f20825b = j == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f20826c = -9223372036854775807L;
    }
}
