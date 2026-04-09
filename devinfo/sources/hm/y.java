package hm;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class y {

    /* renamed from: d, reason: collision with root package name */
    public static final x f25217d = new x();

    /* renamed from: a, reason: collision with root package name */
    public boolean f25218a;

    /* renamed from: b, reason: collision with root package name */
    public long f25219b;

    /* renamed from: c, reason: collision with root package name */
    public long f25220c;

    public y a() {
        this.f25218a = false;
        return this;
    }

    public y b() {
        this.f25220c = 0L;
        return this;
    }

    public long c() {
        if (this.f25218a) {
            return this.f25219b;
        }
        throw new IllegalStateException("No deadline");
    }

    public y d(long j) {
        this.f25218a = true;
        this.f25219b = j;
        return this;
    }

    public boolean e() {
        return this.f25218a;
    }

    public void f() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f25218a && this.f25219b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public y g(long j) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        nk.k.e(timeUnit, "unit");
        if (j < 0) {
            throw new IllegalArgumentException(a0.g.j(j, "timeout < 0: ").toString());
        }
        this.f25220c = timeUnit.toNanos(j);
        return this;
    }
}
