package bb;

import com.google.android.exoplayer2.source.dash.DashMediaSource;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DashMediaSource f2519a;

    public f(DashMediaSource dashMediaSource) {
        this.f2519a = dashMediaSource;
    }

    public final void a() {
        long j;
        DashMediaSource dashMediaSource = this.f2519a;
        synchronized (qb.b.f20765h) {
            try {
                j = qb.b.f20766i ? qb.b.j : -9223372036854775807L;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        dashMediaSource.onUtcTimestampResolved(j);
    }
}
