package com.mbridge.msdk.thrid.okio;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class t {

    /* renamed from: d, reason: collision with root package name */
    public static final t f18201d = new a();

    /* renamed from: a, reason: collision with root package name */
    private boolean f18202a;

    /* renamed from: b, reason: collision with root package name */
    private long f18203b;

    /* renamed from: c, reason: collision with root package name */
    private long f18204c;

    public static class a extends t {
        @Override // com.mbridge.msdk.thrid.okio.t
        public t a(long j10) {
            return this;
        }

        @Override // com.mbridge.msdk.thrid.okio.t
        public void e() throws IOException {
        }

        @Override // com.mbridge.msdk.thrid.okio.t
        public t a(long j10, TimeUnit timeUnit) {
            return this;
        }
    }

    public t a(long j10, TimeUnit timeUnit) {
        if (j10 >= 0) {
            if (timeUnit == null) {
                throw new IllegalArgumentException("unit == null");
            }
            this.f18204c = timeUnit.toNanos(j10);
            return this;
        }
        throw new IllegalArgumentException("timeout < 0: " + j10);
    }

    public t b() {
        this.f18204c = 0L;
        return this;
    }

    public long c() {
        if (this.f18202a) {
            return this.f18203b;
        }
        throw new IllegalStateException("No deadline");
    }

    public boolean d() {
        return this.f18202a;
    }

    public void e() throws IOException {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
        if (this.f18202a && this.f18203b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public long f() {
        return this.f18204c;
    }

    public t a(long j10) {
        this.f18202a = true;
        this.f18203b = j10;
        return this;
    }

    public t a() {
        this.f18202a = false;
        return this;
    }
}
