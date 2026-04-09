package t9;

import kotlin.time.DurationUnit;
import t9.j;

/* loaded from: classes4.dex */
public final class h implements k {

    /* renamed from: a, reason: collision with root package name */
    public static final h f24473a = new h();

    /* renamed from: b, reason: collision with root package name */
    public static final long f24474b = System.nanoTime();

    @Override // t9.k
    public /* bridge */ /* synthetic */ a a() {
        return j.a.b(d());
    }

    public final long b(long j10, long j11) {
        return g.d(j10, j11, DurationUnit.f22188a);
    }

    public final long c(long j10) {
        return g.b(e(), j10, DurationUnit.f22188a);
    }

    public long d() {
        return j.a.d(e());
    }

    public final long e() {
        return System.nanoTime() - f24474b;
    }

    public String toString() {
        return "TimeSource(System.nanoTime())";
    }
}
