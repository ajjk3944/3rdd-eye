package cv;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class h0 {

    /* renamed from: d, reason: collision with root package name */
    public static final g0 f6707d = new g0();

    /* renamed from: a, reason: collision with root package name */
    public boolean f6708a;

    /* renamed from: b, reason: collision with root package name */
    public long f6709b;

    /* renamed from: c, reason: collision with root package name */
    public long f6710c;

    public h0 a() {
        this.f6708a = false;
        return this;
    }

    public h0 b() {
        this.f6710c = 0L;
        return this;
    }

    public long c() {
        if (this.f6708a) {
            return this.f6709b;
        }
        throw new IllegalStateException("No deadline");
    }

    public h0 d(long j) {
        this.f6708a = true;
        this.f6709b = j;
        return this;
    }

    public boolean e() {
        return this.f6708a;
    }

    public void f() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f6708a && this.f6709b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public h0 g(long j) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        br.l.e(timeUnit, "unit");
        if (j < 0) {
            throw new IllegalArgumentException(c7.a.m(j, "timeout < 0: ").toString());
        }
        this.f6710c = timeUnit.toNanos(j);
        return this;
    }
}
