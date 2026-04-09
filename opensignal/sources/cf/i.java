package cf;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class i extends w2.g implements ScheduledFuture {
    public final ScheduledFuture D;

    public i(h hVar) {
        this.D = hVar.a(new a2.g(this));
    }

    @Override // w2.g
    public final void c() {
        ScheduledFuture scheduledFuture = this.D;
        Object obj = this.f24181a;
        scheduledFuture.cancel((obj instanceof w2.a) && ((w2.a) obj).f24165a);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.D.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.D.getDelay(timeUnit);
    }
}
