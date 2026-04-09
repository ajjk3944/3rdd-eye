package io.sentry.android.core.performance;

import android.os.SystemClock;

/* loaded from: classes.dex */
public final class g implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public String f11732a;

    /* renamed from: d, reason: collision with root package name */
    public long f11733d;

    /* renamed from: g, reason: collision with root package name */
    public long f11734g;

    /* renamed from: r, reason: collision with root package name */
    public long f11735r;

    public final long a() {
        long j = this.f11735r;
        if (j != 0) {
            return j - this.f11734g;
        }
        return 0L;
    }

    public final boolean b() {
        return this.f11734g != 0;
    }

    public final void c(long j) {
        this.f11734g = j;
        this.f11733d = System.currentTimeMillis() - (SystemClock.uptimeMillis() - this.f11734g);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.f11733d, ((g) obj).f11733d);
    }
}
