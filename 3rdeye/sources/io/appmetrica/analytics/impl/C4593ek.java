package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.ek, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4593ek {

    /* renamed from: a, reason: collision with root package name */
    public volatile long f40820a;

    /* renamed from: b, reason: collision with root package name */
    public C4769lf f40821b;

    /* renamed from: c, reason: collision with root package name */
    public TimeProvider f40822c;

    public static C4593ek c() {
        return AbstractC4568dk.f40755a;
    }

    public final synchronized long a() {
        return (System.currentTimeMillis() / 1000) + this.f40820a;
    }

    public final synchronized void b() {
        this.f40821b.d(false);
        this.f40821b.b();
    }

    public final synchronized long d() {
        return this.f40820a;
    }

    public final synchronized void e() {
        a(Ga.f39501F.x(), new SystemTimeProvider());
    }

    public final synchronized boolean f() {
        return this.f40821b.b(true);
    }

    public final synchronized void a(long j4, Long l5) {
        try {
            this.f40820a = (j4 - this.f40822c.currentTimeMillis()) / 1000;
            boolean z10 = true;
            if (this.f40821b.b(true)) {
                if (l5 != null) {
                    long jAbs = Math.abs(j4 - this.f40822c.currentTimeMillis());
                    C4769lf c4769lf = this.f40821b;
                    if (jAbs <= TimeUnit.SECONDS.toMillis(l5.longValue())) {
                        z10 = false;
                    }
                    c4769lf.d(z10);
                } else {
                    this.f40821b.d(false);
                }
            }
            this.f40821b.d(this.f40820a);
            this.f40821b.b();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void a(C4769lf c4769lf, TimeProvider timeProvider) {
        this.f40821b = c4769lf;
        this.f40820a = c4769lf.a(0);
        this.f40822c = timeProvider;
    }
}
