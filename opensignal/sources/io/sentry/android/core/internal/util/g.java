package io.sentry.android.core.internal.util;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public long f11652a;

    /* renamed from: b, reason: collision with root package name */
    public int f11653b;

    /* renamed from: c, reason: collision with root package name */
    public Object f11654c;

    /* renamed from: d, reason: collision with root package name */
    public Object f11655d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f11656e;

    public g(int i10, long j) {
        this.f11655d = new AtomicInteger(0);
        this.f11656e = new AtomicLong(0L);
        this.f11654c = d.f11646a;
        this.f11652a = j;
        this.f11653b = i10 <= 0 ? 1 : i10;
    }

    public boolean a() {
        AtomicInteger atomicInteger = (AtomicInteger) this.f11655d;
        ((d) this.f11654c).getClass();
        long jUptimeMillis = SystemClock.uptimeMillis();
        AtomicLong atomicLong = (AtomicLong) this.f11656e;
        if (atomicLong.get() == 0 || atomicLong.get() + this.f11652a <= jUptimeMillis) {
            atomicInteger.set(0);
            atomicLong.set(jUptimeMillis);
            return false;
        }
        if (atomicInteger.incrementAndGet() < this.f11653b) {
            return false;
        }
        atomicInteger.set(0);
        return true;
    }

    public g() {
        t2.i iVar = t2.i.Ltr;
        this.f11652a = 0L;
        this.f11653b = 0;
        this.f11656e = new i1.b();
    }
}
