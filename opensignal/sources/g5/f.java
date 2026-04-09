package g5;

import androidx.media3.exoplayer.dash.DashMediaSource;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DashMediaSource f9352a;

    public f(DashMediaSource dashMediaSource) {
        this.f9352a = dashMediaSource;
    }

    public final void a() {
        long j;
        DashMediaSource dashMediaSource = this.f9352a;
        synchronized (androidx.media3.exoplayer.util.c.f1938b) {
            try {
                j = androidx.media3.exoplayer.util.c.f1939c ? androidx.media3.exoplayer.util.c.f1940d : -9223372036854775807L;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        dashMediaSource.onUtcTimestampResolved(j);
    }
}
