package ee;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class i extends h3.g implements ScheduledFuture {

    /* renamed from: h, reason: collision with root package name */
    public final ScheduledFuture f23421h;

    public i(h hVar) {
        this.f23421h = hVar.a(new o7.c(16, this));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.f23421h.compareTo(delayed);
    }

    @Override // h3.g
    public final void d() {
        ScheduledFuture scheduledFuture = this.f23421h;
        Object obj = this.f24830a;
        scheduledFuture.cancel((obj instanceof h3.a) && ((h3.a) obj).f24813a);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f23421h.getDelay(timeUnit);
    }
}
