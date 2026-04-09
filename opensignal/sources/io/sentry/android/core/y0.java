package io.sentry.android.core;

/* loaded from: classes.dex */
public final class y0 implements Comparable {
    public final long B;

    /* renamed from: a, reason: collision with root package name */
    public final long f11794a;

    /* renamed from: d, reason: collision with root package name */
    public final long f11795d;

    /* renamed from: g, reason: collision with root package name */
    public final long f11796g;

    /* renamed from: r, reason: collision with root package name */
    public final long f11797r;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f11798x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f11799y;

    public y0(long j) {
        this(j, j, 0L, 0L, false, false, 0L);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.f11795d, ((y0) obj).f11795d);
    }

    public y0(long j, long j7, long j10, long j11, boolean z10, boolean z11, long j12) {
        this.f11794a = j;
        this.f11795d = j7;
        this.f11796g = j10;
        this.f11797r = j11;
        this.f11798x = z10;
        this.f11799y = z11;
        this.B = j12;
    }
}
